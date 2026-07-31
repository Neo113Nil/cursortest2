package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class gj0 extends hj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5653a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f5654b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f5655c;

    /* renamed from: d, reason: collision with root package name */
    private final rb0<JSONObject, JSONObject> f5656d;

    public gj0(Context context, rb0<JSONObject, JSONObject> rb0Var) {
        this.f5654b = context.getApplicationContext();
        this.f5656d = rb0Var;
    }

    public static JSONObject c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", po0.c().f10301f);
            jSONObject.put("mf", b30.f3180a.e());
            jSONObject.put("cl", "428884702");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", o3.j.f19861a);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", o3.j.f19861a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.hj0
    public final cc3<Void> a() {
        synchronized (this.f5653a) {
            if (this.f5655c == null) {
                this.f5655c = this.f5654b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (y2.t.a().b() - this.f5655c.getLong("js_last_update", 0L) < b30.f3181b.e().longValue()) {
            return rb3.i(null);
        }
        return rb3.m(this.f5656d.a(c(this.f5654b)), new e43() { // from class: com.google.android.gms.internal.ads.ej0
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                gj0.this.b((JSONObject) obj);
                return null;
            }
        }, wo0.f13899f);
    }

    final /* synthetic */ Void b(JSONObject jSONObject) {
        m10.d(this.f5654b, 1, jSONObject);
        this.f5655c.edit().putLong("js_last_update", y2.t.a().b()).apply();
        return null;
    }
}
