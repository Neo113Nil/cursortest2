package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UMCrashManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f9047a;

    /* renamed from: b, reason: collision with root package name */
    private static Object f9048b = new Object();

    public static void a(final Context context, final Throwable th) {
        if (f9047a) {
            return;
        }
        com.umeng.commonsdk.statistics.common.d.a("walle-crash", "report is " + f9047a);
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.proguard.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    synchronized (b.f9048b) {
                        if (context != null && th != null && !b.f9047a) {
                            boolean unused = b.f9047a = true;
                            com.umeng.commonsdk.statistics.common.d.a("walle-crash", "report thread is " + b.f9047a);
                            String a2 = c.a(th);
                            if (!TextUtils.isEmpty(a2)) {
                                com.umeng.commonsdk.stateless.f.a(context, context.getFilesDir() + "/" + com.umeng.commonsdk.stateless.a.e + "/" + Base64.encodeToString(com.umeng.commonsdk.internal.a.f8983a.getBytes(), 0), 10);
                                UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                                JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(context);
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("content", a2);
                                    jSONObject.put("ts", System.currentTimeMillis());
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("crash", jSONObject);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("tp", jSONObject2);
                                    JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(context, buildSLBaseHeader, jSONObject3, com.umeng.commonsdk.internal.a.f8983a);
                                    if (buildSLEnvelope != null) {
                                        buildSLEnvelope.has(com.umeng.analytics.pro.b.ao);
                                    }
                                } catch (JSONException unused2) {
                                }
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        }).start();
    }
}
