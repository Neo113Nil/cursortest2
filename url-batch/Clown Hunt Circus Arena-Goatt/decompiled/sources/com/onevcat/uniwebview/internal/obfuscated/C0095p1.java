package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095p1 extends Lambda implements Function0 {
    public final /* synthetic */ AbstractC0074k0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0095p1(AbstractC0074k0 abstractC0074k0) {
        super(0);
        this.a = abstractC0074k0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Unity method channel does not exist when invoking. Check implementation. Method: " + this.a;
    }
}
