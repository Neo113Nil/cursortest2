package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rx;
import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class sg2 extends kotlin.jvm.internal.s implements Function1<wx.g, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wg2 f31741b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    sg2(wg2 wg2Var) {
        super(1);
        this.f31741b = wg2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        wx.g uiUnit = (wx.g) obj;
        Intrinsics.checkNotNullParameter(uiUnit, "uiUnit");
        function1 = this.f31741b.f34044a;
        function1.invoke(new rx.f(uiUnit));
        return Unit.f41027a;
    }
}
