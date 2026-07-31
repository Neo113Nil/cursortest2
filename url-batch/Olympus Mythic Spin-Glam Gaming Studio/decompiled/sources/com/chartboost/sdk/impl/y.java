package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class y {
    public static final void a(ub ubVar, Function1 isSuccess, Function2 isError) {
        Intrinsics.checkNotNullParameter(ubVar, "<this>");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        Intrinsics.checkNotNullParameter(isError, "isError");
        if (ubVar.b() == null) {
            isSuccess.invoke(ubVar);
        } else {
            isError.invoke(ubVar, ubVar.b());
        }
    }
}
