package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class vg2 extends kotlin.jvm.internal.s implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wg2 f33623b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    vg2(wg2 wg2Var) {
        super(1);
        this.f33623b = wg2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        String id = (String) obj;
        Intrinsics.checkNotNullParameter(id, "id");
        function1 = this.f33623b.f34044a;
        function1.invoke(new rx.b(id));
        return Unit.f41027a;
    }
}
