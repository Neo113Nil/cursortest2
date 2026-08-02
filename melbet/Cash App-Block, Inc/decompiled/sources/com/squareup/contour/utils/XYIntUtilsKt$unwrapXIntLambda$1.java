package com.squareup.contour.utils;

import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class XYIntUtilsKt$unwrapXIntLambda$1 extends Lambda implements Function1 {
    public final /* synthetic */ Function1 $lambda;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XYIntUtilsKt$unwrapXIntLambda$1(int i, Function1 function1) {
        super(1);
        this.$r8$classId = i;
        this.$lambda = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$lambda;
        switch (i) {
            case 0:
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                layoutSpec.getClass();
                return Integer.valueOf(((XInt) function1.invoke(layoutSpec)).value);
            case 1:
                ContourLayout.LayoutSpec layoutSpec2 = (ContourLayout.LayoutSpec) obj;
                layoutSpec2.getClass();
                return Integer.valueOf(((YInt) function1.invoke(layoutSpec2)).m3824unboximpl());
            default:
                return Integer.valueOf(((YInt) function1.invoke(YInt.m3823boximpl(((Number) obj).intValue()))).m3824unboximpl());
        }
    }
}
