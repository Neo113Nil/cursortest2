package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Ts implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27855a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27856b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27857c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27858d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27859e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27860f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27861g;

    /* renamed from: h, reason: collision with root package name */
    public final String f27862h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f27863j;

    /* renamed from: k, reason: collision with root package name */
    public final String f27864k;

    /* renamed from: l, reason: collision with root package name */
    public final String f27865l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f27866m;

    /* renamed from: n, reason: collision with root package name */
    public final long f27867n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f27868o;

    /* renamed from: p, reason: collision with root package name */
    public final String f27869p;

    /* renamed from: q, reason: collision with root package name */
    public final int f27870q;

    /* renamed from: r, reason: collision with root package name */
    public final String f27871r;

    public Ts(boolean z8, boolean z9, String str, boolean z10, boolean z11, boolean z12, String str2, ArrayList arrayList, String str3, String str4, boolean z13, long j9, boolean z14, String str5, int i, String str6, String str7, String str8) {
        String str9 = Build.FINGERPRINT;
        String str10 = Build.MODEL;
        this.f27855a = z8;
        this.f27856b = z9;
        this.f27857c = str;
        this.f27858d = z10;
        this.f27859e = z11;
        this.f27860f = z12;
        this.f27861g = str2;
        this.f27862h = str6;
        this.f27863j = arrayList;
        this.f27864k = str3;
        this.f27865l = str4;
        this.f27866m = z13;
        this.f27867n = j9;
        this.f27868o = z14;
        this.f27869p = str5;
        this.f27870q = i;
        this.f27871r = str8;
        this.i = str7;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f27855a);
        bundle.putBoolean("coh", this.f27856b);
        bundle.putString("gl", this.f27857c);
        bundle.putBoolean("simulator", this.f27858d);
        bundle.putBoolean("is_latchsky", this.f27859e);
        bundle.putInt("build_api_level", this.f27870q);
        C3151ea c3151ea = AbstractC3368ia.vc;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f27860f);
        }
        bundle.putString(com.anythink.expressad.f.a.b.f18558O, this.f27861g);
        C3151ea c3151ea2 = AbstractC3368ia.Te;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue() || ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Ue)).booleanValue()) {
            bundle.putString("dlc", this.f27862h);
        }
        ArrayList<String> arrayList = this.f27863j;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        String str2 = this.i;
        if (str2 != null) {
            bundle.putString("dgl", str2);
        }
        bundle.putString("mv", this.f27864k);
        bundle.putString("submodel", Build.MODEL);
        Bundle b9 = AbstractC2720Pd.b("device", bundle);
        bundle.putBundle("device", b9);
        b9.putString("build", Build.FINGERPRINT);
        b9.putLong("remaining_data_partition_space", this.f27867n);
        Bundle b10 = AbstractC2720Pd.b("browser", b9);
        b9.putBundle("browser", b10);
        b10.putBoolean("is_browser_custom_tabs_capable", this.f27866m);
        String str3 = this.f27865l;
        if (!TextUtils.isEmpty(str3)) {
            Bundle b11 = AbstractC2720Pd.b("play_store", b9);
            b9.putBundle("play_store", b11);
            b11.putString("package_version", str3);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Lc)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f27868o);
        }
        String str4 = this.f27869p;
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("v_unity", str4);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Fc)).booleanValue()) {
            AbstractC2720Pd.D(bundle, "gotmt_l", true, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Cc)).booleanValue());
            AbstractC2720Pd.D(bundle, "gotmt_i", true, ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Bc)).booleanValue());
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Jf)).booleanValue() || (str = this.f27871r) == null) {
            return;
        }
        bundle.putString("sdk_i_s", str);
    }
}
