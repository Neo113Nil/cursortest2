package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561i5 {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f7502a;

    /* renamed from: b, reason: collision with root package name */
    public final C0511g7 f7503b;

    public C0561i5(Context context, X4 x4) {
        this(x4, C0511g7.a(context));
    }

    public final C0390bf a() {
        return new C0390bf(this.f7503b.b(this.f7502a));
    }

    public C0561i5(X4 x4, C0511g7 c0511g7) {
        this.f7502a = x4;
        this.f7503b = c0511g7;
    }
}
