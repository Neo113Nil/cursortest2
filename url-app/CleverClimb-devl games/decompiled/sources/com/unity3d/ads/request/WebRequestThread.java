package com.unity3d.ads.request;

import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import com.unity3d.ads.log.DeviceLog;
import com.unity3d.ads.request.WebRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class WebRequestThread extends Thread {
    protected static final int MSG_REQUEST = 1;
    private static WebRequestHandler _handler;
    private static boolean _ready;
    private static final Object _readyLock = new Object();

    private static void init() {
        WebRequestThread webRequestThread = new WebRequestThread();
        webRequestThread.setName("UnityAdsWebRequestThread");
        webRequestThread.start();
        while (!_ready) {
            try {
                synchronized (_readyLock) {
                    _readyLock.wait();
                }
            } catch (InterruptedException unused) {
                DeviceLog.debug("Couldn't synchronize thread");
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        if (_handler == null) {
            _handler = new WebRequestHandler();
        }
        _ready = true;
        synchronized (_readyLock) {
            _readyLock.notify();
        }
        Looper.loop();
    }

    public static void cancel() {
        if (_handler != null) {
            _handler.removeMessages(1);
            _handler.setCancelStatus(true);
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        synchronized (WebRequestThread.class) {
            request(str, requestType, map, null, num, num2, iWebRequestListener);
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, String str2, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        synchronized (WebRequestThread.class) {
            request(1, str, requestType, map, str2, num, num2, iWebRequestListener, new WebRequestResultReceiver(_handler, iWebRequestListener));
        }
    }

    public static synchronized void request(int i, String str, WebRequest.RequestType requestType, Map<String, List<String>> map, String str2, Integer num, Integer num2, IWebRequestListener iWebRequestListener, WebRequestResultReceiver webRequestResultReceiver) {
        synchronized (WebRequestThread.class) {
            if (!_ready) {
                init();
            }
            if (str != null && str.length() >= 3) {
                Bundle bundle = new Bundle();
                bundle.putString("url", str);
                bundle.putString("type", requestType.name());
                bundle.putString("body", str2);
                bundle.putParcelable("receiver", webRequestResultReceiver);
                bundle.putInt("connectTimeout", num.intValue());
                bundle.putInt("readTimeout", num2.intValue());
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        bundle.putStringArray(str3, (String[]) map.get(str3).toArray(new String[map.get(str3).size()]));
                    }
                }
                Message message = new Message();
                message.what = i;
                message.setData(bundle);
                _handler.setCancelStatus(false);
                _handler.sendMessage(message);
                return;
            }
            iWebRequestListener.onFailed(str, "Request is NULL or too short");
        }
    }

    public static synchronized boolean resolve(final String str, final IResolveHostListener iResolveHostListener) {
        synchronized (WebRequestThread.class) {
            if (str != null) {
                if (str.length() >= 3) {
                    new Thread(new Runnable() { // from class: com.unity3d.ads.request.WebRequestThread.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Thread thread;
                            final ConditionVariable conditionVariable = new ConditionVariable();
                            Thread thread2 = null;
                            try {
                                thread = new Thread(new Runnable() { // from class: com.unity3d.ads.request.WebRequestThread.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        try {
                                            iResolveHostListener.onResolve(str, InetAddress.getByName(str).getHostAddress());
                                        } catch (UnknownHostException e) {
                                            DeviceLog.exception("Unknown host", e);
                                            iResolveHostListener.onFailed(str, ResolveHostError.UNKNOWN_HOST, e.getMessage());
                                        }
                                        conditionVariable.open();
                                    }
                                });
                            } catch (Exception e) {
                                e = e;
                            }
                            try {
                                thread.start();
                                thread2 = thread;
                            } catch (Exception e2) {
                                e = e2;
                                thread2 = thread;
                                DeviceLog.exception("Exception while resolving host", e);
                                iResolveHostListener.onFailed(str, ResolveHostError.UNEXPECTED_EXCEPTION, e.getMessage());
                                if (conditionVariable.block(20000L)) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            if (conditionVariable.block(20000L) || thread2 == null) {
                                return;
                            }
                            thread2.interrupt();
                            iResolveHostListener.onFailed(str, ResolveHostError.TIMEOUT, "Timeout");
                        }
                    }).start();
                    return true;
                }
            }
            iResolveHostListener.onFailed(str, ResolveHostError.INVALID_HOST, "Host is NULL");
            return false;
        }
    }
}
