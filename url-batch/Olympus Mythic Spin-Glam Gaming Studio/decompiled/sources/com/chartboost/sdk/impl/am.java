package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class am extends rj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(String uri, Integer num) {
        super("VAST wrapper loop detected for URI: " + uri, num);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    public /* synthetic */ am(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 302 : num);
    }
}
