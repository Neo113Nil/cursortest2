package com.applovin.impl.mediation.b;

import android.app.Activity;
import com.applovin.impl.sdk.c.i;
import com.applovin.impl.sdk.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2713a;

    public a(Activity activity, j jVar) {
        super("TaskAutoInitAdapters", jVar);
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f2713a = activity;
    }

    @Override // com.applovin.impl.sdk.d.a
    public i a() {
        return i.A;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        String str2 = (String) this.f3073b.a(com.applovin.impl.sdk.b.d.q);
        if (!com.applovin.impl.sdk.e.i.b(str2)) {
            a("No auto-init adapters provided", (Throwable) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONArray a2 = com.applovin.impl.sdk.e.f.a(jSONObject, "auto_init_adapters", (JSONArray) null, this.f3073b);
            if (a2.length() <= 0) {
                d("No auto-init adapters found");
                return;
            }
            a("Auto-initing " + a2.length() + " adapter(s)...");
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.a.p)).intValue());
            for (int i = 0; i < a2.length(); i++) {
                final com.applovin.impl.mediation.a.e eVar = new com.applovin.impl.mediation.a.e(a2.getJSONObject(i), jSONObject, this.f3073b);
                newFixedThreadPool.execute(new Runnable() { // from class: com.applovin.impl.mediation.b.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a("Auto-initing adapter: " + eVar);
                        a.this.f3073b.a(a.this.f2713a).initializeAdapter(eVar, a.this.f2713a);
                    }
                });
            }
        } catch (JSONException e) {
            e = e;
            str = "Failed to parse auto-init adapters JSON";
            a(str, e);
        } catch (Throwable th) {
            e = th;
            str = "Failed to auto-init adapters";
            a(str, e);
        }
    }
}
