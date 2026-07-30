package com.google.android.gms.internal.ads;

import O7.InterfaceC0397w;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class Kx extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f26067n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Qx f26068u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kx(Qx qx, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f26068u = qx;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new Kx(this.f26068u, interfaceC5133d);
    }

    @Override // E7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Kx) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f26067n;
        com.bumptech.glide.f.r(obj);
        if (i == 0) {
            this.f26067n = 1;
            if (Qx.d(this.f26068u, this) == enumC5179a) {
                return enumC5179a;
            }
        }
        return q7.v.f40183a;
    }
}
