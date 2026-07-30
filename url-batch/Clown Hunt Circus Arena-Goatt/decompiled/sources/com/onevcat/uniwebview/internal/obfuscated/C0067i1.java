package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067i1 extends Lambda implements Function1 {
    public static final C0067i1 a = new C0067i1();

    public C0067i1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.onevcat.uniwebview.d it = (com.onevcat.uniwebview.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        com.onevcat.uniwebview.a aVar = it.v;
        com.onevcat.uniwebview.a f = aVar.f();
        if (f != null) {
            if (f.canGoForward()) {
                f.goForward();
            }
        } else if (aVar.canGoForward()) {
            aVar.goForward();
        }
        return Unit.INSTANCE;
    }
}
