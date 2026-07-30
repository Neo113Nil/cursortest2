package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Ns implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final String f26614a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26615b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26616c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26617d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f26618e;

    public Ns(String str, String str2, String str3, String str4, Long l9) {
        this.f26614a = str;
        this.f26615b = str2;
        this.f26616c = str3;
        this.f26617d = str4;
        this.f26618e = l9;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        AbstractC2720Pd.J("gmp_app_id", bundle, this.f26614a);
        AbstractC2720Pd.J("fbs_aiid", bundle, this.f26615b);
        AbstractC2720Pd.J("fbs_aeid", bundle, this.f26616c);
        AbstractC2720Pd.J("apm_id_origin", bundle, this.f26617d);
        Long l9 = this.f26618e;
        if (l9 != null) {
            bundle.putLong("sai_timeout", l9.longValue());
        }
    }
}
