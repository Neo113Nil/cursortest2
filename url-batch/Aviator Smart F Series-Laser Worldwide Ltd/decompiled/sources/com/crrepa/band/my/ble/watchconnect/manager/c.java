package com.crrepa.band.my.ble.watchconnect.manager;

import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.bean.CRPConnectKitMessage;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonObject;
import com.openharmony.watch.aidl.Message;
import com.openharmony.watch.aidl.Peer;
import com.openharmony.watch.aidl.m;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class c {
    private static final int BUFFER_LEN = 102400;
    private static final long SEND_MESSAGE_TIMEOUT_SECONDS = 10;
    private final AtomicInteger callbackId = new AtomicInteger(0);
    private final List<d> sendFileInfos = new ArrayList();
    private final ConcurrentHashMap<Integer, b> emitterMap = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, m> sendCallbackMap = new ConcurrentHashMap<>();

    class a implements CRPFileTransListener {
        final /* synthetic */ CRPConnectKitMessage val$crpMessage;
        final /* synthetic */ SingleEmitter val$emitter;
        final /* synthetic */ File val$file;
        final /* synthetic */ Peer val$peer;
        final /* synthetic */ int val$sendCallbackId;
        final /* synthetic */ d val$sendFileInfo;

        a(int i8, File file, Peer peer, SingleEmitter singleEmitter, d dVar, CRPConnectKitMessage cRPConnectKitMessage) {
            this.val$sendCallbackId = i8;
            this.val$file = file;
            this.val$peer = peer;
            this.val$emitter = singleEmitter;
            this.val$sendFileInfo = dVar;
            this.val$crpMessage = cRPConnectKitMessage;
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            com.orhanobut.logger.f.d("P2PClientBinder::send, sendConnectKitFile::onError, errorCode:" + i8);
            this.val$emitter.onSuccess(new e(this.val$sendCallbackId, new IOException("sendConnectKitFile::onError: File transfer failed")));
            c.this.sendFileInfos.remove(this.val$sendFileInfo);
            com.orhanobut.logger.f.d("P2PClientBinder::send, sendConnectKitFile:: file delete：" + this.val$file.delete());
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            com.orhanobut.logger.f.d("sendConnectKitFile::onTransCompleted");
            try {
                c.this.getSendCallback(this.val$sendCallbackId).onSendProgress(100L);
            } catch (RemoteException e8) {
                com.orhanobut.logger.f.d(" sendConnectKitFile::onTransCompleted,callback error,file name:" + this.val$file.getName());
                this.val$emitter.onSuccess(new e(this.val$sendCallbackId, e8));
            }
            c.this.sendFileInfos.remove(this.val$sendFileInfo);
            com.orhanobut.logger.f.d("P2PClientBinder::send, sendConnectKitFile:: file delete：" + this.val$file.delete());
            c.this.addEmitterToMap(this.val$emitter, this.val$crpMessage);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            com.orhanobut.logger.f.d("sendConnectKitFile::onTransProgressChanged, progress:" + i8);
            try {
                c.this.getSendCallback(this.val$sendCallbackId).onSendProgress(i8);
                if (c.this.isFileTransferCancelled(this.val$peer)) {
                    com.orhanobut.logger.f.d("sendConnectKitFile::onTransProgressChanged, cancel send, file name:" + this.val$file.getName());
                    i4.getInstance().cancelSendConnectKitFile();
                }
            } catch (RemoteException unused) {
                com.orhanobut.logger.f.d("sendConnectKitFile::onTransProgressChanged,callback error, cancel send,file name:" + this.val$file.getName());
                i4.getInstance().cancelSendConnectKitFile();
            }
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            com.orhanobut.logger.f.d("sendConnectKitFile::onTransProgressStarting");
        }
    }

    private static class b {
        final SingleEmitter<e> emitter;
        final Disposable timeoutDisposable;

        b(SingleEmitter<e> singleEmitter, Disposable disposable) {
            this.emitter = singleEmitter;
            this.timeoutDisposable = disposable;
        }
    }

    /* renamed from: com.crrepa.band.my.ble.watchconnect.manager.c$c, reason: collision with other inner class name */
    private static class C0160c {
        private static final c INSTANCE = new c();

        private C0160c() {
        }
    }

    private static class d {
        public final String deviceName;
        public final String dstPkgName;
        public final AtomicBoolean isCancel = new AtomicBoolean(false);
        public final String srcPkgName;

        public d(String str, String str2, String str3) {
            this.deviceName = str;
            this.srcPkgName = str2;
            this.dstPkgName = str3;
        }
    }

    public static class e {
        private final int callbackId;
        private final Throwable error;
        private final int state;

        public e(int i8, int i9) {
            this.callbackId = i8;
            this.state = i9;
            this.error = null;
        }

        public int getCallbackId() {
            return this.callbackId;
        }

        public Throwable getError() {
            return this.error;
        }

        public int getState() {
            return this.state;
        }

        public boolean isSuccess() {
            return this.error == null;
        }

        public e(int i8, Throwable th) {
            this.callbackId = i8;
            this.state = 206;
            this.error = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEmitterToMap(SingleEmitter<e> singleEmitter, CRPConnectKitMessage cRPConnectKitMessage) {
        com.orhanobut.logger.f.d("P2PClientBinder::send,add timeOutTimer,id:" + cRPConnectKitMessage.getMessageId());
        this.emitterMap.put(Integer.valueOf(cRPConnectKitMessage.getMessageId()), new b(singleEmitter, getTimeoutTimer(cRPConnectKitMessage.getMessageId())));
    }

    private CRPConnectKitMessage createMessage(int i8, Peer peer) {
        CRPConnectKitMessage cRPConnectKitMessage = new CRPConnectKitMessage();
        cRPConnectKitMessage.setMessageId(i8);
        cRPConnectKitMessage.setSrcPackageName(peer.getSrcPkgName());
        cRPConnectKitMessage.setDestPackageName(peer.getDstPkgName());
        return cRPConnectKitMessage;
    }

    public static c getInstance() {
        return C0160c.INSTANCE;
    }

    @NonNull
    private Disposable getTimeoutTimer(final int i8) {
        return Single.timer(SEND_MESSAGE_TIMEOUT_SECONDS, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.ble.watchconnect.manager.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.this.lambda$getTimeoutTimer$1(i8, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFileTransferCancelled(Peer peer) {
        for (d dVar : this.sendFileInfos) {
            if (dVar.deviceName.equals(peer.getDevice().getName()) && dVar.srcPkgName.equals(peer.getSrcPkgName()) && dVar.dstPkgName.equals(peer.getDstPkgName()) && dVar.isCancel.get()) {
                this.sendFileInfos.remove(dVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTimeoutTimer$1(int i8, Long l8) {
        b bVar = this.emitterMap.get(Integer.valueOf(i8));
        if (bVar != null) {
            bVar.emitter.onSuccess(new e(i8, new TimeoutException("P2PClientBinder::send message callback timeout，Id：" + i8)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessage$0(Message message, int i8, Peer peer, SingleEmitter singleEmitter) {
        int intValue = message.getType().intValue();
        if (intValue == 0) {
            sendTextMessage(i8, singleEmitter, peer, message);
            return;
        }
        if (intValue == 1) {
            sendFileMessage(i8, singleEmitter, peer, message);
            return;
        }
        singleEmitter.onSuccess(new e(i8, new UnsupportedOperationException("Message type not supported: " + message.getType())));
    }

    private File prepareFileForSending(Message message) {
        File externalFilesDir = com.moyoung.dafit.module.common.utils.d.get().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir != null && (externalFilesDir.exists() || externalFilesDir.mkdirs())) {
            return new File(externalFilesDir, message.getFileName());
        }
        com.orhanobut.logger.f.d("P2PClientBinder::send, downloadDir preparation failed");
        return null;
    }

    private void sendFile(File file, int i8, SingleEmitter<e> singleEmitter, CRPConnectKitMessage cRPConnectKitMessage, Peer peer, d dVar) {
        i4.getInstance().sendConnectKitFile(cRPConnectKitMessage, new a(i8, file, peer, singleEmitter, dVar, cRPConnectKitMessage));
    }

    private void sendFileMessage(int i8, SingleEmitter<e> singleEmitter, Peer peer, Message message) {
        ParcelFileDescriptor fileDescriptor = message.getFileDescriptor();
        if (fileDescriptor == null) {
            com.orhanobut.logger.f.d("P2PClientBinder::send, pfd is null");
            singleEmitter.onSuccess(new e(i8, new IllegalArgumentException("pfd is null")));
            return;
        }
        File prepareFileForSending = prepareFileForSending(message);
        if (prepareFileForSending == null) {
            com.orhanobut.logger.f.d("P2PClientBinder::send, file preparation failed");
            singleEmitter.onSuccess(new e(i8, new IOException("File preparation failed")));
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(prepareFileForSending);
                try {
                    byte[] bArr = new byte[BUFFER_LEN];
                    do {
                        int read = fileInputStream.read(bArr, 0, BUFFER_LEN);
                        if (read <= 0) {
                            com.orhanobut.logger.f.d("P2PClientBinder::send, file read success,file name:" + prepareFileForSending.getName());
                            d dVar = new d(peer.getDevice().getName(), peer.getSrcPkgName(), peer.getDstPkgName());
                            this.sendFileInfos.add(dVar);
                            CRPConnectKitMessage createMessage = createMessage(i8, peer);
                            createMessage.setFile(prepareFileForSending);
                            createMessage.setDstFilePath(message.getDstFilePath());
                            com.orhanobut.logger.f.d("P2PClientBinder::send, file message:" + createMessage);
                            sendFile(prepareFileForSending, i8, singleEmitter, createMessage, peer, dVar);
                            fileOutputStream.close();
                            fileInputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } while (!isFileTransferCancelled(peer));
                    com.orhanobut.logger.f.d("P2PClientBinder::send, file read cancel,file name:" + prepareFileForSending.getName());
                    singleEmitter.onSuccess(new e(i8, new CancellationException("File transfer was cancelled")));
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException e8) {
            com.orhanobut.logger.f.d("P2PClientBinder::send, error message:" + e8);
            singleEmitter.onSuccess(new e(i8, e8));
        }
    }

    private void sendTextMessage(int i8, SingleEmitter<e> singleEmitter, Peer peer, Message message) {
        CRPConnectKitMessage createMessage = createMessage(i8, peer);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "message");
        jsonObject.addProperty(FirebaseAnalytics.Param.CONTENT, new String(message.getData(), StandardCharsets.UTF_8));
        createMessage.setMsg(jsonObject.toString());
        addEmitterToMap(singleEmitter, createMessage);
        com.orhanobut.logger.f.d("P2PClientBinder::send, text message:" + createMessage);
        i4.getInstance().sendConnectKitMessage(createMessage);
    }

    public void addCallback(int i8, m mVar) {
        this.sendCallbackMap.put(Integer.valueOf(i8), mVar);
    }

    public void cancelSendConnectKitFile(SingleEmitter<Integer> singleEmitter, Peer peer, Message message) {
        String name = peer.getDevice().getName();
        String srcPkgName = peer.getSrcPkgName();
        String dstPkgName = peer.getDstPkgName();
        int i8 = 206;
        for (d dVar : this.sendFileInfos) {
            if (dVar.deviceName.equals(name) && dVar.srcPkgName.equals(srcPkgName) && dVar.dstPkgName.equals(dstPkgName)) {
                dVar.isCancel.set(true);
                i8 = 207;
            }
        }
        singleEmitter.onSuccess(Integer.valueOf(i8));
    }

    public int generateId() {
        return this.callbackId.getAndIncrement();
    }

    public m getSendCallback(int i8) {
        return this.sendCallbackMap.get(Integer.valueOf(i8));
    }

    public void onCallBack(CRPConnectKitMessage cRPConnectKitMessage, int i8) {
        b remove = this.emitterMap.remove(Integer.valueOf(cRPConnectKitMessage.getMessageId()));
        if (remove != null) {
            if (!remove.emitter.isDisposed()) {
                remove.emitter.onSuccess(new e(cRPConnectKitMessage.getMessageId(), i8));
            }
            if (remove.timeoutDisposable.isDisposed()) {
                return;
            }
            remove.timeoutDisposable.dispose();
        }
    }

    public void removeCallback(int i8) {
        this.sendCallbackMap.remove(Integer.valueOf(i8));
    }

    public Single<e> sendMessage(final int i8, final Peer peer, final Message message) {
        return Single.create(new SingleOnSubscribe() { // from class: com.crrepa.band.my.ble.watchconnect.manager.a
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                c.this.lambda$sendMessage$0(message, i8, peer, singleEmitter);
            }
        }).subscribeOn(Schedulers.io());
    }
}
