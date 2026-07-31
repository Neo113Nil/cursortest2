package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class sg1 extends kotlin.jvm.internal.s implements Function1<C2058l4, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set<EnumC2082m4> f31740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    sg1(Set<? extends EnumC2082m4> set) {
        super(1);
        this.f31740b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2058l4 it = (C2058l4) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(this.f31740b.contains(it.a()));
    }
}
