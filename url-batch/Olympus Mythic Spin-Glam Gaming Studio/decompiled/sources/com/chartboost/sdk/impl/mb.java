package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class mb extends rj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(String message, Integer num) {
        super(message, num);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ mb(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 100 : num);
    }
}
