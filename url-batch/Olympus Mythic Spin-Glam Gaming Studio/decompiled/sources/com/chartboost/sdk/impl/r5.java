package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class r5 {
    public static final r5 a = new r5();

    public final q5 a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        bm bmVar = bm.a;
        String a2 = bmVar.a(element, "type");
        Element b = bmVar.b(element, "UniversalAdId");
        return new q5(a2, b != null ? bj.a.a(b) : null);
    }
}
