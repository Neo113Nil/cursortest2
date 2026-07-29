package com.applovin.impl.mediation.b;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.j;
import com.tapjoy.TapjoyConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private static String f2716a;

    /* renamed from: c, reason: collision with root package name */
    private final Activity f2717c;

    /* renamed from: d, reason: collision with root package name */
    private final a f2718d;

    public interface a {
        void a(JSONArray jSONArray);
    }

    static {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(a("APPLOVIN_NETWORK", "com.applovin.mediation.adapters.AppLovinMediationAdapter"));
            a("FACEBOOK_NETWORK", "com.applovin.mediation.adapters.FacebookMediationAdapter").put("run_on_ui_thread", false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signal_providers", jSONArray);
            f2716a = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public b(Activity activity, j jVar, a aVar) {
        super("TaskCollectSignals", jVar);
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f2717c = activity;
        this.f2718d = aVar;
    }

    private String a(String str, com.applovin.impl.sdk.b.b<Integer> bVar) {
        int intValue;
        return (!TextUtils.isEmpty(str) && (intValue = ((Integer) this.f3073b.a(bVar)).intValue()) > 0) ? str.substring(0, Math.min(str.length(), intValue)) : "";
    }

    private static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("class", str2);
        jSONObject.put("adapter_timeout_ms", 30000);
        jSONObject.put("max_signal_length", 32768);
        jSONObject.put("scode", "");
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final g gVar, final f.a aVar) {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.mediation.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f3073b.a(b.this.f2717c).collectSignal(gVar, b.this.f2717c, aVar);
            }
        };
        if (gVar.w()) {
            a("Running signal collection for " + gVar + " on the main thread");
            this.f2717c.runOnUiThread(runnable);
            return;
        }
        a("Running signal collection for " + gVar + " on the background thread");
        runnable.run();
    }

    private void a(Collection<com.applovin.impl.mediation.a.f> collection) {
        String str;
        String a2;
        JSONArray jSONArray = new JSONArray();
        for (com.applovin.impl.mediation.a.f fVar : collection) {
            try {
                JSONObject jSONObject = new JSONObject();
                g a3 = fVar.a();
                jSONObject.put("name", a3.u());
                jSONObject.put("class", a3.t());
                jSONObject.put(TapjoyConstants.TJC_ADAPTER_VERSION, a(fVar.c(), com.applovin.impl.sdk.b.a.l));
                jSONObject.put("sdk_version", a(fVar.b(), com.applovin.impl.sdk.b.a.m));
                JSONObject jSONObject2 = new JSONObject();
                if (i.b(fVar.e())) {
                    str = "error_message";
                    a2 = fVar.e();
                } else {
                    str = "signal";
                    a2 = a(fVar.d(), com.applovin.impl.sdk.b.a.n);
                }
                jSONObject2.put(str, a2);
                jSONObject.put("data", jSONObject2);
                jSONArray.put(jSONObject);
                a("Collected signal from " + a3);
            } catch (JSONException e) {
                a("Failed to create signal data", e);
            }
        }
        a(jSONArray);
    }

    private void a(JSONArray jSONArray) {
        a aVar = this.f2718d;
        if (aVar != null) {
            aVar.a(jSONArray);
        }
    }

    private void b(String str, Throwable th) {
        a("No signals collected: " + str, th);
        a(new JSONArray());
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.B;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2 = (String) this.f3073b.b(com.applovin.impl.sdk.b.d.p, f2716a);
        if (!i.b(str2)) {
            b("No signal providers provided", null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONArray a2 = com.applovin.impl.sdk.e.f.a(jSONObject, "signal_providers", (JSONArray) null, this.f3073b);
            if (a2.length() <= 0) {
                b("No signal providers found", null);
                return;
            }
            a("Collecting signals from " + a2.length() + " signal providers(s)...");
            final List a3 = com.applovin.impl.sdk.e.c.a(a2.length());
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            final CountDownLatch countDownLatch = new CountDownLatch(a2.length());
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.a.j)).intValue());
            for (int i = 0; i < a2.length(); i++) {
                final g gVar = new g(a2.getJSONObject(i), jSONObject, this.f3073b);
                newFixedThreadPool.execute(new Runnable() { // from class: com.applovin.impl.mediation.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a(gVar, new f.a() { // from class: com.applovin.impl.mediation.b.b.1.1
                            @Override // com.applovin.impl.mediation.a.f.a
                            public void a(com.applovin.impl.mediation.a.f fVar) {
                                if (atomicBoolean.get() && fVar != null) {
                                    a3.add(fVar);
                                }
                                countDownLatch.countDown();
                            }
                        });
                    }
                });
            }
            countDownLatch.await(((Long) this.f3073b.a(com.applovin.impl.sdk.b.a.k)).longValue(), TimeUnit.MILLISECONDS);
            atomicBoolean.set(false);
            a(a3);
        } catch (InterruptedException e) {
            e = e;
            str = "Failed to wait for signals";
            b(str, e);
        } catch (JSONException e2) {
            e = e2;
            str = "Failed to parse signals JSON";
            b(str, e);
        } catch (Throwable th) {
            e = th;
            str = "Failed to collect signals";
            b(str, e);
        }
    }
}
