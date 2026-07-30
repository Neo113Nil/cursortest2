package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class Q0 extends Lambda implements Function1 {
    public static final Q0 a = new Q0();

    public Q0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.a aVar = it.v;
        com.onevcat.uniwebview.a f = aVar.f();
        return Boolean.valueOf((f != null ? f.canGoForward() : false) || aVar.canGoForward());
    }
}
