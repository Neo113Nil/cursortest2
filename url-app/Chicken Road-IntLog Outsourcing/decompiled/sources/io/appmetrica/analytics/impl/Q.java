package io.appmetrica.analytics.impl;

import android.content.Context;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f7292a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(U u5) {
        super(0);
        this.f7292a = u5;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        U u5 = this.f7292a;
        N n6 = u5.f7566f;
        Context context = u5.f7561a;
        n6.getClass();
        return N.a(new L(n6, context));
    }
}
