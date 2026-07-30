package com.crrepa.band.my.ble.watchconnect.manager;

import androidx.annotation.NonNull;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.bean.CRPConnectKitMessage;
import com.openharmony.watch.aidl.Peer;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class j {
    protected static final long PING_TIMEOUT_SECONDS = 10;
    private final AtomicInteger callbackId = new AtomicInteger(0);
    private final Map<Integer, a> callbackMap = new ConcurrentHashMap();

    private static class a {
        final SingleEmitter<Integer> emitter;
        final Disposable timeoutDisposable;

        a(SingleEmitter<Integer> singleEmitter, Disposable disposable) {
            this.emitter = singleEmitter;
            this.timeoutDisposable = disposable;
        }
    }

    private static class b {
        private static final j INSTANCE = new j();

        private b() {
        }
    }

    private int generateId() {
        return this.callbackId.getAndIncrement();
    }

    public static j getInstance() {
        return b.INSTANCE;
    }

    @NonNull
    private Disposable getTimeoutTimer(final int i8) {
        return Single.timer(PING_TIMEOUT_SECONDS, TimeUnit.SECONDS).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.ble.watchconnect.manager.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                j.this.lambda$getTimeoutTimer$1(i8, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTimeoutTimer$1(int i8, Long l8) {
        a aVar = this.callbackMap.get(Integer.valueOf(i8));
        if (aVar != null) {
            aVar.emitter.onError(new TimeoutException("PingManager::ping app callback timeout，Id：" + i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ping$0(Peer peer, SingleEmitter singleEmitter) {
        CRPConnectKitMessage cRPConnectKitMessage = new CRPConnectKitMessage();
        cRPConnectKitMessage.setMessageId(generateId());
        cRPConnectKitMessage.setDestPackageName(peer.getDstPkgName());
        cRPConnectKitMessage.setSrcPackageName(peer.getSrcPkgName());
        this.callbackMap.put(Integer.valueOf(cRPConnectKitMessage.getMessageId()), new a(singleEmitter, getTimeoutTimer(cRPConnectKitMessage.getMessageId())));
        com.orhanobut.logger.f.d(" PingManager::ping app callback, Id:" + cRPConnectKitMessage.getMessageId());
        i4.getInstance().pingApp(cRPConnectKitMessage);
    }

    public void onCallBack(CRPConnectKitMessage cRPConnectKitMessage, int i8) {
        a remove = this.callbackMap.remove(Integer.valueOf(cRPConnectKitMessage.getMessageId()));
        if (remove != null) {
            if (!remove.emitter.isDisposed()) {
                remove.emitter.onSuccess(Integer.valueOf(i8));
            }
            if (remove.timeoutDisposable.isDisposed()) {
                return;
            }
            remove.timeoutDisposable.dispose();
        }
    }

    public Single<Integer> ping(final Peer peer) {
        return Single.create(new SingleOnSubscribe() { // from class: com.crrepa.band.my.ble.watchconnect.manager.h
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                j.this.lambda$ping$0(peer, singleEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public void replyDevicePingApp(CRPConnectKitMessage cRPConnectKitMessage) {
        cRPConnectKitMessage.setResponse(Integer.valueOf(com.moyoung.dafit.module.common.utils.f.isAppInstalled(com.moyoung.dafit.module.common.utils.d.get(), cRPConnectKitMessage.getMsg()) ? 205 : 204));
        com.orhanobut.logger.f.d(" PingManager::devicePingApp, replyMessage:" + cRPConnectKitMessage);
        i4.getInstance().pingApp(cRPConnectKitMessage);
    }
}
