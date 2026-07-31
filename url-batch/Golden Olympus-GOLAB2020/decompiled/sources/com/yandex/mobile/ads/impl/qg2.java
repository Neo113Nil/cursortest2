package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class qg2 extends kotlin.jvm.internal.s implements Function1<wx.c.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final qg2 f30774b = new qg2();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30775a;

        static {
            int[] iArr = new int[wx.c.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30775a = iArr;
        }
    }

    qg2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wx.c.a actionType = (wx.c.a) obj;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        int i4 = a.f30775a[actionType.ordinal()];
        return Unit.f41027a;
    }
}
