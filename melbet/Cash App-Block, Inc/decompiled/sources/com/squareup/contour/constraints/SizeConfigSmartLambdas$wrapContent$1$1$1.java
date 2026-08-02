package com.squareup.contour.constraints;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class SizeConfigSmartLambdas$wrapContent$1$1$1 extends Lambda implements Function1 {
    public static final SizeConfigSmartLambdas$wrapContent$1$1$1 INSTANCE = new SizeConfigSmartLambdas$wrapContent$1$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        return Boolean.valueOf(view.getVisibility() != 8);
    }
}
