package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class yd2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final pv f14623a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14624b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14625c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14626d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14627e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14628f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14629g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14630h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f14631i;

    public yd2(pv pvVar, String str, boolean z6, String str2, float f7, int i7, int i8, String str3, boolean z7) {
        r3.o.j(pvVar, "the adSize must not be null");
        this.f14623a = pvVar;
        this.f14624b = str;
        this.f14625c = z6;
        this.f14626d = str2;
        this.f14627e = f7;
        this.f14628f = i7;
        this.f14629g = i8;
        this.f14630h = str3;
        this.f14631i = z7;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        vs2.g(bundle2, "smart_w", "full", this.f14623a.f10380j == -1);
        vs2.g(bundle2, "smart_h", "auto", this.f14623a.f10377g == -2);
        Boolean bool = Boolean.TRUE;
        vs2.e(bundle2, "ene", bool, this.f14623a.f10385o);
        vs2.g(bundle2, "rafmt", "102", this.f14623a.f10388r);
        vs2.g(bundle2, "rafmt", "103", this.f14623a.f10389s);
        vs2.g(bundle2, "rafmt", "105", this.f14623a.f10390t);
        vs2.e(bundle2, "inline_adaptive_slot", bool, this.f14631i);
        vs2.e(bundle2, "interscroller_slot", bool, this.f14623a.f10390t);
        vs2.c(bundle2, "format", this.f14624b);
        vs2.g(bundle2, "fluid", "height", this.f14625c);
        vs2.g(bundle2, "sz", this.f14626d, !TextUtils.isEmpty(r0));
        bundle2.putFloat("u_sd", this.f14627e);
        bundle2.putInt("sw", this.f14628f);
        bundle2.putInt("sh", this.f14629g);
        String str = this.f14630h;
        vs2.g(bundle2, "sc", str, true ^ TextUtils.isEmpty(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        pv[] pvVarArr = this.f14623a.f10382l;
        if (pvVarArr == null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt("height", this.f14623a.f10377g);
            bundle3.putInt("width", this.f14623a.f10380j);
            bundle3.putBoolean("is_fluid_height", this.f14623a.f10384n);
            arrayList.add(bundle3);
        } else {
            for (pv pvVar : pvVarArr) {
                Bundle bundle4 = new Bundle();
                bundle4.putBoolean("is_fluid_height", pvVar.f10384n);
                bundle4.putInt("height", pvVar.f10377g);
                bundle4.putInt("width", pvVar.f10380j);
                arrayList.add(bundle4);
            }
        }
        bundle2.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
