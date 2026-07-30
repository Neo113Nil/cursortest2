package com.google.android.gms.internal.ads;

import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* renamed from: com.google.android.gms.internal.ads.yx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4252yx extends x7.h implements E7.p {
    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new C4252yx(2, interfaceC5133d);
    }

    @Override // E7.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C4252yx) create((C3874rx) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        com.bumptech.glide.f.r(obj);
        C3874rx D8 = C3874rx.D();
        kotlin.jvm.internal.h.d(D8, "getDefaultInstance(...)");
        return D8;
    }
}
