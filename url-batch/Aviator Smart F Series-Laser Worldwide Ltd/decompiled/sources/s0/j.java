package s0;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import com.crrepa.band.my.ble.watchconnect.manager.c;
import com.crrepa.band.my.device.appmarket.AppMarketProvider;
import com.crrepa.ble.conn.bean.CRPAppInfo;
import com.openharmony.watch.aidl.Message;
import com.openharmony.watch.aidl.Peer;
import com.openharmony.watch.aidl.j;
import com.openharmony.watch.aidl.k;
import com.openharmony.watch.aidl.l;
import com.openharmony.watch.aidl.m;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Consumer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class j extends j.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancelFileTransfer$4(Peer peer, Message message, SingleEmitter singleEmitter) {
        com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().cancelSendConnectKitFile(singleEmitter, peer, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancelFileTransfer$5(com.openharmony.watch.aidl.a aVar, Integer num) {
        try {
            aVar.onCancelFileTransferResult(num.intValue());
            com.orhanobut.logger.f.d("cancelFileTransfer success:" + num);
        } catch (RemoteException e8) {
            com.orhanobut.logger.f.d("cancelFileTransferCallback fail: " + e8.getMessage());
        }
        com.crrepa.band.my.ble.watchconnect.manager.e.queryAvailableKbytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$cancelFileTransfer$6(com.openharmony.watch.aidl.a aVar, Throwable th) {
        try {
            aVar.onCancelFileTransferResult(206);
            com.orhanobut.logger.f.d("cancelFileTransfer fail: " + th.getMessage());
        } catch (RemoteException e8) {
            com.orhanobut.logger.f.d("cancelFileTransferCallback fail: " + e8.getMessage());
        }
        com.crrepa.band.my.ble.watchconnect.manager.e.queryAvailableKbytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ping$0(k kVar, Integer num) {
        try {
            kVar.onPingResult(num.intValue());
            com.orhanobut.logger.f.d("ping app success:" + num);
        } catch (RemoteException e8) {
            com.orhanobut.logger.f.d("pingCallback fail: " + e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$ping$1(k kVar, Throwable th) {
        try {
            kVar.onPingResult(206);
            com.orhanobut.logger.f.d("ping app fail:" + th.getMessage());
        } catch (RemoteException e8) {
            com.orhanobut.logger.f.d("pingCallback fail: " + e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$send$2(c.e eVar) {
        try {
            com.orhanobut.logger.f.d("P2PClientBinder::onSendResult:id:" + eVar.getCallbackId() + ", result：" + eVar.getState() + ", error：" + eVar.getError());
            com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().getSendCallback(eVar.getCallbackId()).onSendResult(eVar.getState());
        } catch (RemoteException e8) {
            com.orhanobut.logger.f.d("P2PClientBinder::onSendResult:id:" + eVar.getCallbackId() + ", callback error: " + e8.getMessage());
        }
        com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().removeCallback(eVar.getCallbackId());
        com.crrepa.band.my.ble.watchconnect.manager.e.queryAvailableKbytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$send$3(Throwable th) {
        com.orhanobut.logger.f.d("onSendResult: error " + th.getMessage());
    }

    @Override // com.openharmony.watch.aidl.j.a, com.openharmony.watch.aidl.j
    @SuppressLint({"CheckResult"})
    public void cancelFileTransfer(final Peer peer, final Message message, final com.openharmony.watch.aidl.a aVar) {
        com.orhanobut.logger.f.d("P2PClientBinder::cancelFileTransfer");
        if (com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().notCurrentDevice(peer.getDevice())) {
            aVar.onCancelFileTransferResult(206);
        } else {
            Single.create(new SingleOnSubscribe() { // from class: s0.e
                @Override // io.reactivex.SingleOnSubscribe
                public final void subscribe(SingleEmitter singleEmitter) {
                    j.lambda$cancelFileTransfer$4(Peer.this, message, singleEmitter);
                }
            }).subscribe(new Consumer() { // from class: s0.f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    j.lambda$cancelFileTransfer$5(com.openharmony.watch.aidl.a.this, (Integer) obj);
                }
            }, new Consumer() { // from class: s0.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    j.lambda$cancelFileTransfer$6(com.openharmony.watch.aidl.a.this, (Throwable) obj);
                }
            });
        }
    }

    @Override // com.openharmony.watch.aidl.j.a, com.openharmony.watch.aidl.j
    public int getAppVersion(Peer peer) {
        com.orhanobut.logger.f.d("P2PClientBinder::getAppVersion");
        int i8 = -1;
        if (com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().notCurrentDevice(peer.getDevice())) {
            return -1;
        }
        for (CRPAppInfo cRPAppInfo : AppMarketProvider.getInstalledAppList()) {
            if (cRPAppInfo.getPackageName().equals(peer.getDstPkgName())) {
                i8 = cRPAppInfo.getVersionCode();
            }
        }
        com.orhanobut.logger.f.d("P2PClientBinder::getAppVersion result：" + i8);
        return i8;
    }

    @Override // com.openharmony.watch.aidl.j.a, com.openharmony.watch.aidl.j
    public boolean isAppInstalled(Peer peer) {
        com.orhanobut.logger.f.d("P2PClientBinder::isAppInstalled");
        boolean z7 = false;
        if (com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().notCurrentDevice(peer.getDevice())) {
            return false;
        }
        Iterator<CRPAppInfo> it = AppMarketProvider.getInstalledAppList().iterator();
        while (it.hasNext()) {
            if (it.next().getPackageName().equals(peer.getDstPkgName())) {
                z7 = true;
            }
        }
        com.orhanobut.logger.f.d("P2PClientBinder::isAppInstalled result：" + z7);
        return z7;
    }

    @Override // com.openharmony.watch.aidl.j.a, com.openharmony.watch.aidl.j
    @SuppressLint({"CheckResult"})
    public void ping(Peer peer, final k kVar) {
        com.orhanobut.logger.f.d("P2PClientBinder::ping");
        if (com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().notCurrentDevice(peer.getDevice())) {
            kVar.onPingResult(206);
        } else {
            com.crrepa.band.my.ble.watchconnect.manager.e.queryAvailableKbytes();
            com.crrepa.band.my.ble.watchconnect.manager.j.getInstance().ping(peer).subscribe(new Consumer() { // from class: s0.h
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    j.lambda$ping$0(k.this, (Integer) obj);
                }
            }, new Consumer() { // from class: s0.i
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    j.lambda$ping$1(k.this, (Throwable) obj);
                }
            });
        }
    }

    @Override // com.openharmony.watch.aidl.j.a, com.openharmony.watch.aidl.j
    public void registerReceiver(Peer peer, l lVar) {
        com.orhanobut.logger.f.d("P2PClientBinder::registerReceiver, peer:" + peer);
        if (com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().notCurrentDevice(peer.getDevice())) {
            return;
        }
        com.crrepa.band.my.ble.watchconnect.manager.e.queryAvailableKbytes();
        com.crrepa.band.my.ble.watchconnect.manager.g.getInstance().registerReceiver(peer, lVar);
    }

    @Override // com.openharmony.watch.aidl.j.a, com.openharmony.watch.aidl.j
    @SuppressLint({"CheckResult"})
    public void send(Peer peer, Message message, m mVar) {
        int generateId = com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().generateId();
        com.orhanobut.logger.f.d("P2PClientBinder::send, sendCallbackId:" + generateId + ", peer:" + peer + ", message:" + message);
        com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().addCallback(generateId, mVar);
        if (!com.crrepa.band.my.ble.watchconnect.manager.e.getInstance().notCurrentDevice(peer.getDevice())) {
            com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().sendMessage(generateId, peer, message).subscribe(new Consumer() { // from class: s0.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    j.lambda$send$2((c.e) obj);
                }
            }, new Consumer() { // from class: s0.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    j.lambda$send$3((Throwable) obj);
                }
            });
            return;
        }
        com.orhanobut.logger.f.d("P2PClientBinder::send, sendCallbackId:" + generateId + "device Disconnect");
        com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().getSendCallback(generateId).onSendResult(206);
        com.crrepa.band.my.ble.watchconnect.manager.c.getInstance().removeCallback(generateId);
    }

    @Override // com.openharmony.watch.aidl.j.a, com.openharmony.watch.aidl.j
    public void unregisterReceiver(l lVar) {
        com.orhanobut.logger.f.d("P2PClientBinder::unregisterReceiver");
        com.crrepa.band.my.ble.watchconnect.manager.g.getInstance().unregisterReceiver(lVar);
    }
}
