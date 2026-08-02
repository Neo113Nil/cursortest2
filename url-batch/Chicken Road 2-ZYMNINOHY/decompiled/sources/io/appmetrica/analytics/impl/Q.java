package io.appmetrica.analytics.impl;

import android.content.Context;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f10832a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u4) {
        super(0);
        this.f10832a = u4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        U u4 = this.f10832a;
        N n = u4.f11022f;
        Context context = u4.f11017a;
        n.getClass();
        return N.a(new L(n, context));
    }
}
