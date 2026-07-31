package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k10 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: g, reason: collision with root package name */
    private Context f7327g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f7321a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConditionVariable f7322b = new ConditionVariable();

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f7323c = false;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f7324d = false;

    /* renamed from: e, reason: collision with root package name */
    private SharedPreferences f7325e = null;

    /* renamed from: f, reason: collision with root package name */
    private Bundle f7326f = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f7328h = new JSONObject();

    private final void f() {
        if (this.f7325e == null) {
            return;
        }
        try {
            this.f7328h = new JSONObject((String) o10.a(new c53() { // from class: com.google.android.gms.internal.ads.h10
                @Override // com.google.android.gms.internal.ads.c53
                public final Object zza() {
                    return k10.this.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    public final <T> T b(final e10<T> e10Var) {
        if (!this.f7322b.block(5000L)) {
            synchronized (this.f7321a) {
                if (!this.f7324d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f7323c || this.f7325e == null) {
            synchronized (this.f7321a) {
                if (this.f7323c && this.f7325e != null) {
                }
                return e10Var.l();
            }
        }
        if (e10Var.e() != 2) {
            return (e10Var.e() == 1 && this.f7328h.has(e10Var.m())) ? e10Var.a(this.f7328h) : (T) o10.a(new c53() { // from class: com.google.android.gms.internal.ads.i10
                @Override // com.google.android.gms.internal.ads.c53
                public final Object zza() {
                    return k10.this.c(e10Var);
                }
            });
        }
        Bundle bundle = this.f7326f;
        return bundle == null ? e10Var.l() : e10Var.b(bundle);
    }

    final /* synthetic */ Object c(e10 e10Var) {
        return e10Var.c(this.f7325e);
    }

    final /* synthetic */ String d() {
        return this.f7325e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.f7323c) {
            return;
        }
        synchronized (this.f7321a) {
            if (this.f7323c) {
                return;
            }
            if (!this.f7324d) {
                this.f7324d = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.f7327g = applicationContext;
            try {
                this.f7326f = w3.c.a(applicationContext).c(this.f7327g.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context c7 = o3.j.c(context);
                if (c7 != null || (c7 = context.getApplicationContext()) != null) {
                    context = c7;
                }
                if (context == null) {
                    return;
                }
                sw.b();
                SharedPreferences a7 = g10.a(context);
                this.f7325e = a7;
                if (a7 != null) {
                    a7.registerOnSharedPreferenceChangeListener(this);
                }
                s30.c(new j10(this));
                f();
                this.f7323c = true;
            } finally {
                this.f7324d = false;
                this.f7322b.open();
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
