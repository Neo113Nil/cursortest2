package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class Z extends Lambda implements Function0 {
    public final /* synthetic */ C0078l0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0078l0 c0078l0) {
        super(0);
        this.a = c0078l0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Channel method invoked with result: " + this.a;
    }
}
