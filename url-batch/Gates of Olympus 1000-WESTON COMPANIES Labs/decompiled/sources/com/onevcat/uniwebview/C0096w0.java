package com.onevcat.uniwebview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0096w0 extends Lambda implements Function1 {
    public static final C0096w0 a = new C0096w0();

    public C0096w0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        N it = (N) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0093w c0093w = it.p;
        C0093w c0093w2 = c0093w.d.i;
        if (c0093w2 != null) {
            if (c0093w2.canGoForward()) {
                c0093w2.goForward();
            }
        } else if (c0093w.canGoForward()) {
            c0093w.goForward();
        }
        return Unit.INSTANCE;
    }
}
