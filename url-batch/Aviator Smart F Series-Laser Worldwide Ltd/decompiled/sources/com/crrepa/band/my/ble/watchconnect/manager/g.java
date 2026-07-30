package com.crrepa.band.my.ble.watchconnect.manager;

import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.bean.CRPConnectKitMessage;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.openharmony.watch.aidl.Message;
import com.openharmony.watch.aidl.Peer;
import com.openharmony.watch.aidl.l;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g {
    private final RemoteCallbackList<l> receivers = new RemoteCallbackList<>();
    private final ConcurrentHashMap<String, IBinder> packageBinderMap = new ConcurrentHashMap<>();
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    private static class a {
        private static final g INSTANCE = new g();

        private a() {
        }
    }

    public static g getInstance() {
        return a.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onReceiveMessageChanged$0(CRPConnectKitMessage cRPConnectKitMessage) {
        try {
            sendMessageToApp(cRPConnectKitMessage);
        } catch (Exception e8) {
            com.orhanobut.logger.f.d("onReceiveMessageChanged:Failed to send message from: " + cRPConnectKitMessage.getSrcPackageName() + ", error" + e8);
            replyDeviceMessage(cRPConnectKitMessage, 206);
        }
    }

    public void onReceiveMessageChanged(final CRPConnectKitMessage cRPConnectKitMessage) {
        this.executor.execute(new Runnable() { // from class: com.crrepa.band.my.ble.watchconnect.manager.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.lambda$onReceiveMessageChanged$0(cRPConnectKitMessage);
            }
        });
    }

    public void registerReceiver(Peer peer, l lVar) {
        this.receivers.register(lVar);
        this.packageBinderMap.put(peer.getSrcPkgName(), lVar.asBinder());
    }

    public void replyDeviceMessage(CRPConnectKitMessage cRPConnectKitMessage, int i8) {
        cRPConnectKitMessage.setResponse(Integer.valueOf(i8));
        com.orhanobut.logger.f.d(" PingManager::devicePingApp, replyMessage:" + cRPConnectKitMessage);
        i4.getInstance().sendConnectKitMessage(cRPConnectKitMessage);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        com.orhanobut.logger.f.d("sendMessageToApp:Send message from: " + r5);
        r11.onReceiveMessage(r9);
        replyDeviceMessage(r19, 207);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendMessageToApp(CRPConnectKitMessage cRPConnectKitMessage) {
        int beginBroadcast;
        com.orhanobut.logger.f.d("sendMessageToApp:crpMessage:" + cRPConnectKitMessage);
        String destPackageName = cRPConnectKitMessage.getDestPackageName();
        IBinder iBinder = this.packageBinderMap.get(destPackageName);
        if (iBinder == null) {
            com.orhanobut.logger.f.d("sendMessageToApp:No receiver found for package: " + destPackageName);
            replyDeviceMessage(cRPConnectKitMessage, 206);
            return;
        }
        try {
            String string = new JSONObject(cRPConnectKitMessage.getMsg()).getString(FirebaseAnalytics.Param.CONTENT);
            com.orhanobut.logger.f.d("sendMessageToApp:message content = " + string);
            Message message = new Message(0, string.getBytes(StandardCharsets.UTF_8), "", null, "", "");
            try {
                try {
                    beginBroadcast = this.receivers.beginBroadcast();
                } finally {
                    this.receivers.finishBroadcast();
                }
            } catch (Exception e8) {
                com.orhanobut.logger.f.d("sendMessageToApp:Failed to send message from: " + destPackageName + ", error" + e8);
                replyDeviceMessage(cRPConnectKitMessage, 206);
            }
            if (beginBroadcast == 0) {
                com.orhanobut.logger.f.d("sendMessageToApp:receiver count is 0");
                replyDeviceMessage(cRPConnectKitMessage, 206);
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= beginBroadcast) {
                    break;
                }
                l broadcastItem = this.receivers.getBroadcastItem(i8);
                if (broadcastItem.asBinder().equals(iBinder)) {
                    try {
                        break;
                    } catch (RemoteException e9) {
                        com.orhanobut.logger.f.d("sendMessageToApp:Failed to send message from: " + destPackageName + ", error" + e9);
                        com.orhanobut.logger.f.d("sendMessageToApp:unRegister receiver:" + destPackageName + ", error" + e9);
                        this.receivers.unregister(broadcastItem);
                        this.packageBinderMap.remove(destPackageName);
                        replyDeviceMessage(cRPConnectKitMessage, 206);
                        com.orhanobut.logger.f.d("sendMessageToApp:No receiver found for package: " + destPackageName);
                        replyDeviceMessage(cRPConnectKitMessage, 206);
                    }
                }
                i8++;
            }
        } catch (JSONException e10) {
            com.orhanobut.logger.f.d("sendMessageToApp:get message content error, JSONException:" + e10);
            replyDeviceMessage(cRPConnectKitMessage, 206);
        }
    }

    public void unregisterReceiver(l lVar) {
        this.receivers.unregister(lVar);
        this.packageBinderMap.values().remove(lVar.asBinder());
    }
}
