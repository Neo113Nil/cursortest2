package com.google.android.material.datepicker;

import android.os.Bundle;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final long f1025f = i0.a(x.b(1900, 0).f1125k);

    /* renamed from: g, reason: collision with root package name */
    public static final long f1026g = i0.a(x.b(2100, 11).f1125k);

    /* renamed from: a, reason: collision with root package name */
    public long f1027a;

    /* renamed from: b, reason: collision with root package name */
    public long f1028b;

    /* renamed from: c, reason: collision with root package name */
    public Long f1029c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public g f1030e;

    public final b a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f1030e);
        x c5 = x.c(this.f1027a);
        x c6 = x.c(this.f1028b);
        g gVar = (g) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = this.f1029c;
        return new b(c5, c6, gVar, l4 == null ? null : x.c(l4.longValue()), this.d);
    }
}
