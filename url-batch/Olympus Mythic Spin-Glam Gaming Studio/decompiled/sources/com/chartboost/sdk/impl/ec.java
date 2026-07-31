package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class ec extends rj {
    public ec(Integer num) {
        super("Maximum wrapper depth exceeded.", num);
    }

    public /* synthetic */ ec(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 302 : num);
    }
}
