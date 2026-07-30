package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Zr implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final q2.g1 f29075a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29076b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29077c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29078d;

    /* renamed from: e, reason: collision with root package name */
    public final float f29079e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29080f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29081g;

    /* renamed from: h, reason: collision with root package name */
    public final String f29082h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f29083j;

    /* renamed from: k, reason: collision with root package name */
    public final G.e f29084k;

    /* renamed from: l, reason: collision with root package name */
    public final Yr f29085l;

    public Zr(q2.g1 g1Var, String str, boolean z8, String str2, float f6, int i, int i4, String str3, int i9, boolean z9, G.e eVar, Yr yr) {
        O2.w.i(g1Var, "the adSize must not be null");
        this.f29075a = g1Var;
        this.f29076b = str;
        this.f29077c = z8;
        this.f29078d = str2;
        this.f29079e = f6;
        this.f29080f = i;
        this.f29081g = i4;
        this.f29082h = str3;
        this.i = i9;
        this.f29083j = z9;
        this.f29084k = eVar;
        this.f29085l = yr;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        q2.g1 g1Var = this.f29075a;
        int i = g1Var.f40060x;
        AbstractC2720Pd.q(bundle, "smart_w", com.anythink.expressad.f.a.b.ax, i == -1);
        int i4 = g1Var.f40057u;
        AbstractC2720Pd.q(bundle, "smart_h", "auto", i4 == -2);
        AbstractC2720Pd.D(bundle, "ene", true, g1Var.f40049C);
        AbstractC2720Pd.q(bundle, "rafmt", "102", g1Var.f40052F);
        AbstractC2720Pd.q(bundle, "rafmt", "108", g1Var.f40055I);
        AbstractC2720Pd.q(bundle, "rafmt", "103", g1Var.f40053G);
        boolean z8 = g1Var.f40054H;
        AbstractC2720Pd.q(bundle, "rafmt", "105", z8);
        AbstractC2720Pd.D(bundle, "inline_adaptive_slot", true, this.f29083j);
        AbstractC2720Pd.D(bundle, "interscroller_slot", true, z8);
        AbstractC2720Pd.J("format", bundle, this.f29076b);
        AbstractC2720Pd.q(bundle, "fluid", "height", this.f29077c);
        AbstractC2720Pd.q(bundle, "sz", this.f29078d, !TextUtils.isEmpty(r5));
        bundle.putFloat("u_sd", this.f29079e);
        bundle.putInt("sw", this.f29080f);
        bundle.putInt(com.anythink.expressad.foundation.d.e.f18832u, this.f29081g);
        String str = this.f29082h;
        AbstractC2720Pd.q(bundle, com.anythink.expressad.f.a.b.bI, str, true ^ TextUtils.isEmpty(str));
        int i9 = this.i;
        if (i9 != -1) {
            bundle.putInt("u_mso", i9);
        }
        G.e eVar = this.f29084k;
        if (eVar != null) {
            bundle.putInt("sam_t", eVar.f1152b);
            bundle.putInt("sam_b", eVar.f1154d);
            bundle.putInt("sam_l", eVar.f1151a);
            bundle.putInt("sam_r", eVar.f1153c);
        }
        Yr yr = this.f29085l;
        if (yr != null) {
            bundle.putInt("rc_tl", yr.f28896a);
            bundle.putInt("rc_tr", yr.f28897b);
            bundle.putInt("rc_bl", yr.f28898c);
            bundle.putInt("rc_br", yr.f28899d);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        q2.g1[] g1VarArr = g1Var.f40062z;
        if (g1VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i4);
            bundle2.putInt("width", i);
            bundle2.putBoolean("is_fluid_height", g1Var.f40048B);
            arrayList.add(bundle2);
        } else {
            for (q2.g1 g1Var2 : g1VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", g1Var2.f40048B);
                bundle3.putInt("height", g1Var2.f40057u);
                bundle3.putInt("width", g1Var2.f40060x);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
