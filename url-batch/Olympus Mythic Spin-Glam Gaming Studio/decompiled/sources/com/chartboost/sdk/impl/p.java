package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes5.dex */
public final class p {
    public static final p a = new p();

    public final Object a(Element element, zj context) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        bm bmVar = bm.a;
        String a2 = bmVar.a(element, "id");
        Element b = bmVar.b(element, "InLine");
        Element b2 = bmVar.b(element, "Wrapper");
        if (b != null) {
            Object a3 = xa.a.a(b, context);
            return Result.m8029isSuccessimpl(a3) ? Result.m8023constructorimpl(new c.a(a2, (wa) a3)) : Result.m8023constructorimpl(a3);
        }
        if (b2 != null) {
            Object a4 = zl.a.a(b2, context);
            return Result.m8029isSuccessimpl(a4) ? Result.m8023constructorimpl(new c.b(a2, (yl) a4)) : Result.m8023constructorimpl(a4);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m8023constructorimpl(ResultKt.createFailure(new mb("Ad element must contain InLine or Wrapper", 101)));
    }
}
