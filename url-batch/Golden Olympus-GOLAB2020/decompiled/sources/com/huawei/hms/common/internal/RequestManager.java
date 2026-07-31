package com.huawei.hms.common.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class RequestManager implements Handler.Callback {
    public static final int NOTIFY_CONNECT_FAILED = 10012;
    public static final int NOTIFY_CONNECT_SUCCESS = 10011;
    public static final int NOTIFY_CONNECT_SUSPENDED = 10013;

    /* renamed from: b, reason: collision with root package name */
    private static volatile RequestManager f14085b;

    /* renamed from: c, reason: collision with root package name */
    private static Handler f14086c;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f14084a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static Queue<HuaweiApi.RequestHandler> f14087d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private static Map<String, HuaweiApi.RequestHandler> f14088e = new LinkedHashMap();

    private RequestManager(Looper looper) {
        f14086c = new Handler(looper, this);
    }

    public static void addRequestToQueue(HuaweiApi.RequestHandler requestHandler) {
        f14087d.add(requestHandler);
    }

    public static void addToConnectedReqMap(final String str, final HuaweiApi.RequestHandler requestHandler) {
        if (f14086c == null) {
            return;
        }
        HMSLog.i("RequestManager", "addToConnectedReqMap");
        f14086c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f14088e.put(str, requestHandler);
            }
        });
    }

    private void b() {
        while (!f14087d.isEmpty()) {
            HuaweiApi.RequestHandler poll = f14087d.poll();
            if (poll != null) {
                Object client = poll.getClient();
                if (client instanceof BaseHmsClient) {
                    BaseHmsClient baseHmsClient = (BaseHmsClient) client;
                    baseHmsClient.setService(IAIDLInvoke.Stub.asInterface(baseHmsClient.getAdapter().getServiceBinder()));
                    poll.onConnected();
                }
            }
        }
    }

    private void c() {
        HMSLog.i("RequestManager", "NOTIFY_CONNECT_SUSPENDED.");
        while (!f14087d.isEmpty()) {
            f14087d.poll().onConnectionSuspended(1);
        }
        d();
    }

    private void d() {
        HMSLog.i("RequestManager", "notifyRunningRequestConnectSuspend, connectedReqMap.size(): " + f14088e.size());
        Iterator<Map.Entry<String, HuaweiApi.RequestHandler>> it = f14088e.entrySet().iterator();
        while (it.hasNext()) {
            try {
                it.next().getValue().onConnectionSuspended(1);
            } catch (RuntimeException e4) {
                HMSLog.e("RequestManager", "NOTIFY_CONNECT_SUSPENDED Exception: " + e4.getMessage());
            }
            it.remove();
        }
    }

    public static Handler getHandler() {
        return f14086c;
    }

    public static RequestManager getInstance() {
        synchronized (f14084a) {
            try {
                if (f14085b == null) {
                    HandlerThread handlerThread = new HandlerThread("RequestManager");
                    handlerThread.start();
                    f14085b = new RequestManager(handlerThread.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14085b;
    }

    public static void removeReqByTransId(final String str) {
        if (f14086c == null) {
            return;
        }
        HMSLog.i("RequestManager", "removeReqByTransId");
        f14086c.post(new Runnable() { // from class: com.huawei.hms.common.internal.RequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                RequestManager.f14088e.remove(str);
            }
        });
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message == null) {
            return false;
        }
        HMSLog.i("RequestManager", "RequestManager handleMessage.");
        switch (message.what) {
            case NOTIFY_CONNECT_SUCCESS /* 10011 */:
                b();
                break;
            case NOTIFY_CONNECT_FAILED /* 10012 */:
                a(message);
                break;
            case NOTIFY_CONNECT_SUSPENDED /* 10013 */:
                c();
                break;
            default:
                HMSLog.i("RequestManager", "handleMessage unknown msg:" + message.what);
                break;
        }
        return false;
    }

    private void a(Message message) {
        HMSLog.i("RequestManager", "NOTIFY_CONNECT_FAILED.");
        try {
            BaseHmsClient.ConnectionResultWrapper connectionResultWrapper = (BaseHmsClient.ConnectionResultWrapper) message.obj;
            HuaweiApi.RequestHandler request = connectionResultWrapper.getRequest();
            f14087d.remove(request);
            request.onConnectionFailed(connectionResultWrapper.getConnectionResult());
        } catch (RuntimeException e4) {
            HMSLog.e("RequestManager", "<handleConnectFailed> handle Failed" + e4.getMessage());
        }
    }
}
