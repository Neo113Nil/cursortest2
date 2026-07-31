package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ti2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final String f12229a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12230b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12231c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12232d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f12233e;

    public ti2(String str, String str2, String str3, String str4, Long l7) {
        this.f12229a = str;
        this.f12230b = str2;
        this.f12231c = str3;
        this.f12232d = str4;
        this.f12233e = l7;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        vs2.c(bundle2, "gmp_app_id", this.f12229a);
        vs2.c(bundle2, "fbs_aiid", this.f12230b);
        vs2.c(bundle2, "fbs_aeid", this.f12231c);
        vs2.c(bundle2, "apm_id_origin", this.f12232d);
        Long l7 = this.f12233e;
        if (l7 != null) {
            bundle2.putLong("sai_timeout", l7.longValue());
        }
    }
}
