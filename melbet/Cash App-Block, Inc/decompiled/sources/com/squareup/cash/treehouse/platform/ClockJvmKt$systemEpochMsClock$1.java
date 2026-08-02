package com.squareup.cash.treehouse.platform;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class ClockJvmKt$systemEpochMsClock$1 extends FunctionReferenceImpl implements Function0 {
    public static final ClockJvmKt$systemEpochMsClock$1 INSTANCE = new ClockJvmKt$systemEpochMsClock$1(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
