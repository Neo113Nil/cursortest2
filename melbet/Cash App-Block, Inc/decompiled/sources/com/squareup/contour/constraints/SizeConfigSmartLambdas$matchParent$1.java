package com.squareup.contour.constraints;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class SizeConfigSmartLambdas$matchParent$1 extends Lambda implements Function1 {
    public static final SizeConfigSmartLambdas$matchParent$1 INSTANCE = new SizeConfigSmartLambdas$matchParent$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(((Number) obj).intValue());
    }
}
