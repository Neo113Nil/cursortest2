package io.appmetrica.analytics.impl;

import android.content.Context;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f10908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u4) {
        super(0);
        this.f10908a = u4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        U u4 = this.f10908a;
        N n = u4.f11023g;
        Context context = u4.f11017a;
        n.getClass();
        return N.a(new L(n, context));
    }
}
