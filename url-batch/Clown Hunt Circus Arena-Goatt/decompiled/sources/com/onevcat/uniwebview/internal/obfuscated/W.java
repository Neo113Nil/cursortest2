package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class W extends Lambda implements Function0 {
    public final /* synthetic */ com.onevcat.uniwebview.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(com.onevcat.uniwebview.a aVar) {
        super(0);
        this.a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Injecting channel message bridge script for: " + this.a.getName();
    }
}
