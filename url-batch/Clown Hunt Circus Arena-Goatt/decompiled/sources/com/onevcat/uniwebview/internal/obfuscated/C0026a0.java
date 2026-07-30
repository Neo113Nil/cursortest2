package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026a0 extends Lambda implements Function0 {
    public final /* synthetic */ Exception a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0026a0(Exception exc) {
        super(0);
        this.a = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to process channel message: " + this.a.getMessage();
    }
}
