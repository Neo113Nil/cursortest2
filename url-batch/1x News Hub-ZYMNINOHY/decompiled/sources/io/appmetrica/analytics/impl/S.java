package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f6585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u3) {
        super(0);
        this.f6585a = u3;
    }

    @Override // l2.a
    public final Object invoke() {
        U u3 = this.f6585a;
        N n3 = u3.f6736g;
        Context context = u3.f6731a;
        n3.getClass();
        return N.a(new L(n3, context));
    }
}
