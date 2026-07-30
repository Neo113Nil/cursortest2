package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blankj.utilcode.util.h0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class MessengerUtils {
    private static final String KEY_STRING = "MESSENGER_UTILS";
    private static final int WHAT_SEND = 2;
    private static final int WHAT_SUBSCRIBE = 0;
    private static final int WHAT_UNSUBSCRIBE = 1;
    private static a sLocalClient;
    private static ConcurrentHashMap<String, b> subscribers = new ConcurrentHashMap<>();
    private static Map<String, a> sClientMap = new HashMap();

    public static class ServerService extends Service {
        private final ConcurrentHashMap<Integer, Messenger> mClientMap = new ConcurrentHashMap<>();

        @SuppressLint({"HandlerLeak"})
        private final Handler mReceiveClientMsgHandler;
        private final Messenger messenger;

        class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i8 = message.what;
                if (i8 == 0) {
                    ServerService.this.mClientMap.put(Integer.valueOf(message.arg1), message.replyTo);
                    return;
                }
                if (i8 == 1) {
                    ServerService.this.mClientMap.remove(Integer.valueOf(message.arg1));
                } else if (i8 != 2) {
                    super.handleMessage(message);
                } else {
                    ServerService.this.sendMsg2Client(message);
                    ServerService.this.consumeServerProcessCallback(message);
                }
            }
        }

        public ServerService() {
            a aVar = new a();
            this.mReceiveClientMsgHandler = aVar;
            this.messenger = new Messenger(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void consumeServerProcessCallback(Message message) {
            String string;
            Bundle data = message.getData();
            if (data == null || (string = data.getString(MessengerUtils.KEY_STRING)) == null) {
                return;
            }
            cn.hutool.core.convert.impl.s.a(MessengerUtils.subscribers.get(string));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendMsg2Client(Message message) {
            Message obtain = Message.obtain(message);
            for (Messenger messenger : this.mClientMap.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain(obtain));
                    } catch (RemoteException e8) {
                        e8.printStackTrace();
                    }
                }
            }
            obtain.recycle();
        }

        @Override // android.app.Service
        @Nullable
        public IBinder onBind(Intent intent) {
            return this.messenger.getBinder();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i8, int i9) {
            Bundle extras;
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(1, c1.getNotification(h0.a.DEFAULT_CHANNEL_CONFIG, null));
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                Message obtain = Message.obtain(this.mReceiveClientMsgHandler, 2);
                obtain.replyTo = this.messenger;
                obtain.setData(extras);
                sendMsg2Client(obtain);
                consumeServerProcessCallback(obtain);
            }
            return 2;
        }
    }

    static class a {
        String mPkgName;
        Messenger mServer;
        LinkedList<Bundle> mCached = new LinkedList<>();

        @SuppressLint({"HandlerLeak"})
        Handler mReceiveServeMsgHandler = new HandlerC0147a();
        Messenger mClient = new Messenger(this.mReceiveServeMsgHandler);
        ServiceConnection mConn = new b();

        /* renamed from: com.blankj.utilcode.util.MessengerUtils$a$a, reason: collision with other inner class name */
        class HandlerC0147a extends Handler {
            HandlerC0147a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Bundle data = message.getData();
                data.setClassLoader(MessengerUtils.class.getClassLoader());
                String string = data.getString(MessengerUtils.KEY_STRING);
                if (string != null) {
                    cn.hutool.core.convert.impl.s.a(MessengerUtils.subscribers.get(string));
                }
            }
        }

        class b implements ServiceConnection {
            b() {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Log.d("MessengerUtils", "client service connected " + componentName);
                a.this.mServer = new Messenger(iBinder);
                Message obtain = Message.obtain(a.this.mReceiveServeMsgHandler, 0, c1.getCurrentProcessName().hashCode(), 0);
                obtain.getData().setClassLoader(MessengerUtils.class.getClassLoader());
                a aVar = a.this;
                obtain.replyTo = aVar.mClient;
                try {
                    aVar.mServer.send(obtain);
                } catch (RemoteException e8) {
                    e8.printStackTrace();
                }
                a.this.sendCachedMsg2Server();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                Log.w("MessengerUtils", "client service disconnected:" + componentName);
                a aVar = a.this;
                aVar.mServer = null;
                if (aVar.bind()) {
                    return;
                }
                Log.e("MessengerUtils", "client service rebind failed: " + componentName);
            }
        }

        a(String str) {
            this.mPkgName = str;
        }

        private boolean send2Server(Bundle bundle) {
            Message obtain = Message.obtain(this.mReceiveServeMsgHandler, 2);
            bundle.setClassLoader(MessengerUtils.class.getClassLoader());
            obtain.setData(bundle);
            obtain.replyTo = this.mClient;
            try {
                this.mServer.send(obtain);
                return true;
            } catch (RemoteException e8) {
                e8.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendCachedMsg2Server() {
            if (this.mCached.isEmpty()) {
                return;
            }
            for (int size = this.mCached.size() - 1; size >= 0; size--) {
                if (send2Server(this.mCached.get(size))) {
                    this.mCached.remove(size);
                }
            }
        }

        boolean bind() {
            if (TextUtils.isEmpty(this.mPkgName)) {
                return z0.getApp().bindService(new Intent(z0.getApp(), (Class<?>) ServerService.class), this.mConn, 1);
            }
            if (!c1.isAppInstalled(this.mPkgName)) {
                Log.e("MessengerUtils", "bind: the app is not installed -> " + this.mPkgName);
                return false;
            }
            if (!c1.isAppRunning(this.mPkgName)) {
                Log.e("MessengerUtils", "bind: the app is not running -> " + this.mPkgName);
                return false;
            }
            Intent intent = new Intent(this.mPkgName + ".messenger");
            intent.setPackage(this.mPkgName);
            return z0.getApp().bindService(intent, this.mConn, 1);
        }

        void sendMsg2Server(Bundle bundle) {
            if (this.mServer != null) {
                sendCachedMsg2Server();
                if (send2Server(bundle)) {
                    return;
                }
                this.mCached.addFirst(bundle);
                return;
            }
            this.mCached.addFirst(bundle);
            Log.i("MessengerUtils", "save the bundle " + bundle);
        }

        void unbind() {
            Message obtain = Message.obtain(this.mReceiveServeMsgHandler, 1, c1.getCurrentProcessName().hashCode(), 0);
            obtain.replyTo = this.mClient;
            try {
                this.mServer.send(obtain);
            } catch (RemoteException e8) {
                e8.printStackTrace();
            }
            try {
                z0.getApp().unbindService(this.mConn);
            } catch (Exception unused) {
            }
        }
    }

    public interface b {
    }

    public static void post(@NonNull String str, @NonNull Bundle bundle) {
        bundle.putString(KEY_STRING, str);
        a aVar = sLocalClient;
        if (aVar != null) {
            aVar.sendMsg2Server(bundle);
        } else {
            Intent intent = new Intent(z0.getApp(), (Class<?>) ServerService.class);
            intent.putExtras(bundle);
            startServiceCompat(intent);
        }
        Iterator<a> it = sClientMap.values().iterator();
        while (it.hasNext()) {
            it.next().sendMsg2Server(bundle);
        }
    }

    public static void register() {
        if (c1.isMainProcess()) {
            if (c1.isServiceRunning(ServerService.class.getName())) {
                Log.i("MessengerUtils", "Server service is running.");
                return;
            } else {
                startServiceCompat(new Intent(z0.getApp(), (Class<?>) ServerService.class));
                return;
            }
        }
        if (sLocalClient != null) {
            Log.i("MessengerUtils", "The client have been bind.");
            return;
        }
        a aVar = new a(null);
        if (aVar.bind()) {
            sLocalClient = aVar;
        } else {
            Log.e("MessengerUtils", "Bind service failed.");
        }
    }

    private static void startServiceCompat(Intent intent) {
        try {
            intent.setFlags(32);
            if (Build.VERSION.SDK_INT >= 26) {
                z0.getApp().startForegroundService(intent);
            } else {
                z0.getApp().startService(intent);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static void subscribe(@NonNull String str, @NonNull b bVar) {
        subscribers.put(str, bVar);
    }

    public static void unregister() {
        if (c1.isMainProcess()) {
            if (!c1.isServiceRunning(ServerService.class.getName())) {
                Log.i("MessengerUtils", "Server service isn't running.");
                return;
            } else {
                z0.getApp().stopService(new Intent(z0.getApp(), (Class<?>) ServerService.class));
            }
        }
        a aVar = sLocalClient;
        if (aVar != null) {
            aVar.unbind();
        }
    }

    public static void unsubscribe(@NonNull String str) {
        subscribers.remove(str);
    }

    public static void unregister(String str) {
        if (!sClientMap.containsKey(str)) {
            Log.i("MessengerUtils", "unregister: client didn't register: " + str);
            return;
        }
        a aVar = sClientMap.get(str);
        sClientMap.remove(str);
        if (aVar != null) {
            aVar.unbind();
        }
    }

    public static void register(String str) {
        if (sClientMap.containsKey(str)) {
            Log.i("MessengerUtils", "register: client registered: " + str);
            return;
        }
        a aVar = new a(str);
        if (aVar.bind()) {
            sClientMap.put(str, aVar);
            return;
        }
        Log.e("MessengerUtils", "register: client bind failed: " + str);
    }
}
