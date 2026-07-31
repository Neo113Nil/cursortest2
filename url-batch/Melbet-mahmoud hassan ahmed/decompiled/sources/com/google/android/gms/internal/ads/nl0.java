package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes.dex */
public final class nl0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9145a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f9146b;

    /* renamed from: c, reason: collision with root package name */
    private final a3.t1 f9147c;

    /* renamed from: d, reason: collision with root package name */
    private final pm0 f9148d;

    /* renamed from: e, reason: collision with root package name */
    private String f9149e = "-1";

    /* renamed from: f, reason: collision with root package name */
    private int f9150f = -1;

    nl0(Context context, a3.t1 t1Var, pm0 pm0Var) {
        this.f9146b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f9147c = t1Var;
        this.f9145a = context;
        this.f9148d = pm0Var;
    }

    private final void b(String str, int i7) {
        Context context;
        boolean z6 = false;
        if (!((Boolean) sw.c().b(m10.f8281q0)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i7 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z6 = true;
        }
        if (((Boolean) sw.c().b(m10.f8265o0)).booleanValue()) {
            this.f9147c.Y(z6);
            if (((Boolean) sw.c().b(m10.E4)).booleanValue() && z6 && (context = this.f9145a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) sw.c().b(m10.f8225j0)).booleanValue()) {
            this.f9148d.y();
        }
    }

    final void a() {
        this.f9146b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f9146b, "IABTCF_PurposeConsents");
        onSharedPreferenceChanged(this.f9146b, "gad_has_consent_for_cookies");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c7;
        String string = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i7 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                c7 = 1;
            }
            c7 = 65535;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                c7 = 0;
            }
            c7 = 65535;
        }
        if (c7 != 0) {
            if (c7 != 1) {
                return;
            }
            if (!((Boolean) sw.c().b(m10.f8281q0)).booleanValue() || i7 == -1 || this.f9150f == i7) {
                return;
            } else {
                this.f9150f = i7;
            }
        } else if (string.equals("-1") || this.f9149e.equals(string)) {
            return;
        } else {
            this.f9149e = string;
        }
        b(string, i7);
    }
}
