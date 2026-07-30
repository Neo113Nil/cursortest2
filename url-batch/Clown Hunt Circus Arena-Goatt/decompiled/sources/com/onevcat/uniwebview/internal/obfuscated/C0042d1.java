package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042d1 extends Lambda implements Function1 {
    public static final C0042d1 a = new C0042d1();

    public C0042d1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.v.getUrl();
    }
}
