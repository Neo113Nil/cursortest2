package io.appmetrica.analytics.impl;

import android.content.Context;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f7502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Li f7503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u5, Li li) {
        super(0);
        this.f7502a = u5;
        this.f7503b = li;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        U u5 = this.f7502a;
        N n6 = u5.f7568h;
        Context context = u5.f7561a;
        Li li = this.f7503b;
        n6.getClass();
        return N.a(new M(n6, context, li));
    }
}
