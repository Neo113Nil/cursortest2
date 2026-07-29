package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConnectCore;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public final class gf {
    private static final gf e;
    private static gf f;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f8180a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f8181b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f8182c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8183d = false;
    private Context g;

    static {
        gf gfVar = new gf();
        e = gfVar;
        f = gfVar;
    }

    public static gf a() {
        return f;
    }

    public final synchronized void a(Context context) {
        if (context != null) {
            try {
                if (this.g == null) {
                    this.g = context;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gf gfVar = f;
        if (gfVar.g != null) {
            SharedPreferences sharedPreferences = gfVar.g.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
            if (gfVar.f8180a == null && sharedPreferences.contains("gdpr")) {
                gfVar.f8180a = Boolean.valueOf(sharedPreferences.getBoolean("gdpr", false));
            }
            if (gfVar.f8181b == null) {
                gfVar.f8181b = sharedPreferences.getString("cgdpr", "");
            }
            if (gfVar.f8182c == null && sharedPreferences.contains(TapjoyConstants.PREF_BELOW_CONSENT_AGE)) {
                gfVar.f8182c = Boolean.valueOf(sharedPreferences.getBoolean(TapjoyConstants.PREF_BELOW_CONSENT_AGE, false));
            }
        }
        if (this.f8183d) {
            this.f8183d = false;
            gf gfVar2 = f;
            if (gfVar2.g != null) {
                if (gfVar2.f8180a != null) {
                    gfVar2.b();
                }
                if (gfVar2.f8181b != null) {
                    gfVar2.c();
                }
                if (gfVar2.f8182c != null) {
                    gfVar2.d();
                }
            }
        }
    }

    public final boolean b() {
        if (this.g == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.g.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putBoolean("gdpr", this.f8180a.booleanValue());
        edit.apply();
        return true;
    }

    public final boolean c() {
        if (this.g == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.g.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putString("cgdpr", this.f8181b);
        edit.apply();
        return true;
    }

    public final boolean d() {
        if (this.g == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.g.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putBoolean(TapjoyConstants.PREF_BELOW_CONSENT_AGE, this.f8182c.booleanValue());
        edit.apply();
        TapjoyConnectCore.setAdTrackingEnabled();
        return true;
    }
}
