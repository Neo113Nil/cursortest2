package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class wj implements cj {
    public final zb a;

    public wj(zb macroContext) {
        Intrinsics.checkNotNullParameter(macroContext, "macroContext");
        this.a = macroContext;
    }

    @Override // com.chartboost.sdk.impl.cj
    public String a(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return cc.a(uri, this.a);
    }
}
