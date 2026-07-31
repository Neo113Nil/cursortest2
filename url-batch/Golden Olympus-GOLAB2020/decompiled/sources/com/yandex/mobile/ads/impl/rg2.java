package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rx;
import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class rg2 extends kotlin.jvm.internal.s implements Function2<wx.h.a, Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ wg2 f31186b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31187a;

        static {
            int[] iArr = new int[wx.h.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f31187a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    rg2(wg2 wg2Var) {
        super(2);
        this.f31186b = wg2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function1 function1;
        wx.h.a switchType = (wx.h.a) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Intrinsics.checkNotNullParameter(switchType, "switchType");
        if (a.f31187a[switchType.ordinal()] == 1) {
            function1 = this.f31186b.f34044a;
            function1.invoke(new rx.e(booleanValue));
        }
        return Unit.f41027a;
    }
}
