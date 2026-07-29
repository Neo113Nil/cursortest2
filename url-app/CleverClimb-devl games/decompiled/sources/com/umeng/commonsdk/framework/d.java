package com.umeng.commonsdk.framework;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: UMWorkDispatchImpl.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static HandlerThread f8979a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Handler f8980b = null;

    /* renamed from: c, reason: collision with root package name */
    private static c f8981c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Object f8982d = new Object();
    private static final int e = 768;
    private static final int f = 769;
    private static final int g = 770;

    public static void a(Context context, int i, UMLogDataProtocol uMLogDataProtocol, Object obj) {
        if (context == null || uMLogDataProtocol == null) {
            com.umeng.commonsdk.statistics.common.d.b("--->>> Context or UMLogDataProtocol parameter cannot be null!");
            return;
        }
        UMModuleRegister.registerAppContext(context.getApplicationContext());
        if (UMModuleRegister.registerCallback(i, uMLogDataProtocol)) {
            if (f8979a == null || f8980b == null) {
                e();
            }
            try {
                if (f8980b != null) {
                    if (f8981c == null) {
                        synchronized (f8982d) {
                            b.f(context);
                            f8981c = new c(context, f8980b);
                        }
                    }
                    Message obtainMessage = f8980b.obtainMessage();
                    obtainMessage.what = e;
                    obtainMessage.arg1 = i;
                    obtainMessage.obj = obj;
                    f8980b.sendMessage(obtainMessage);
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(UMModuleRegister.getAppContext(), th);
            }
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        com.umeng.commonsdk.statistics.common.d.b("--->>> autoProcess Enter...");
        Context appContext = UMModuleRegister.getAppContext();
        if (appContext != null) {
            long maxDataSpace = UMEnvelopeBuild.maxDataSpace(appContext);
            UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName("analytics");
            JSONObject jSONObject = null;
            int i = 0;
            try {
                if (UMEnvelopeBuild.isReadyBuild(appContext, UMLogDataProtocol.UMBusinessType.U_DPLUS) && callbackFromModuleName != null && (jSONObject = callbackFromModuleName.setupReportData(maxDataSpace)) != null) {
                    i = jSONObject.toString().getBytes().length;
                }
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("header", new JSONObject());
                        jSONObject2.put("content", new JSONObject());
                    } catch (Throwable th) {
                        com.umeng.commonsdk.proguard.b.a(appContext, th);
                    }
                    if (jSONObject != null && i > 0) {
                        jSONObject2 = a(a(jSONObject2, jSONObject.optJSONObject("header"), "header"), jSONObject.optJSONObject("content"), "content");
                    }
                    if (jSONObject2 == null || UMEnvelopeBuild.buildEnvelopeWithExtHeader(appContext, jSONObject2.optJSONObject("header"), jSONObject2.optJSONObject("content")) == null || jSONObject == null) {
                        return;
                    }
                    callbackFromModuleName.removeCacheData(jSONObject);
                }
            } catch (Throwable th2) {
                com.umeng.commonsdk.proguard.b.a(appContext, th2);
            }
        }
    }

    private static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        String str2;
        Context appContext = UMModuleRegister.getAppContext();
        if (jSONObject != null && jSONObject2 != null) {
            try {
                if (jSONObject.opt(str) != null && (jSONObject.opt(str) instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) jSONObject.opt(str);
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null && (next instanceof String) && (str2 = next) != null && jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception e2) {
                                com.umeng.commonsdk.proguard.b.a(appContext, e2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(appContext, th);
            }
        }
        return jSONObject;
    }

    private static synchronized void e() {
        synchronized (d.class) {
            com.umeng.commonsdk.statistics.common.d.b("--->>> Dispatch: init Enter...");
            try {
                if (f8979a == null) {
                    f8979a = new HandlerThread("work_thread");
                    f8979a.start();
                    if (f8980b == null) {
                        f8980b = new Handler(f8979a.getLooper()) { // from class: com.umeng.commonsdk.framework.d.1
                            @Override // android.os.Handler
                            public void handleMessage(Message message) {
                                switch (message.what) {
                                    case d.e /* 768 */:
                                        d.b(message);
                                        break;
                                    case d.f /* 769 */:
                                        d.d();
                                        break;
                                    case d.g /* 770 */:
                                        d.g();
                                        break;
                                }
                            }
                        };
                    }
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(UMModuleRegister.getAppContext(), th);
            }
            com.umeng.commonsdk.statistics.common.d.b("--->>> Dispatch: init Exit...");
        }
    }

    public static synchronized boolean a(int i) {
        synchronized (d.class) {
            if (f8980b == null) {
                return false;
            }
            return f8980b.hasMessages(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        int i = message.arg1;
        Object obj = message.obj;
        UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName(UMModuleRegister.eventType2ModuleName(i));
        if (callbackFromModuleName != null) {
            com.umeng.commonsdk.statistics.common.d.b("--->>> dispatch:handleEvent: call back workEvent with msg type [ 0x" + Integer.toHexString(i) + "]");
            callbackFromModuleName.workEvent(obj, i);
        }
    }

    private static void f() {
        if (f8979a != null) {
            f8979a = null;
        }
        if (f8980b != null) {
            f8980b = null;
        }
        if (f8981c != null) {
            f8981c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g() {
        if (f8981c == null || f8979a == null) {
            return;
        }
        c.a();
        com.umeng.commonsdk.statistics.common.d.b("--->>> handleQuit: Quit dispatch thread.");
        f8979a.quit();
        f();
    }

    public static void a() {
        if (f8980b != null) {
            Message obtainMessage = f8980b.obtainMessage();
            obtainMessage.what = g;
            f8980b.sendMessage(obtainMessage);
        }
    }
}
