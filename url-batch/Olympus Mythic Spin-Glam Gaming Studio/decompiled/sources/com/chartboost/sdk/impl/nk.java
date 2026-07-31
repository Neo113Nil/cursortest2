package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class nk {
    public static final nk a = new nk();

    public final mk a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        bm bmVar = bm.a;
        String d = bmVar.d(element, "ClickThrough");
        List e = bmVar.e(element, "ClickTracking");
        if (d == null && e.isEmpty()) {
            return null;
        }
        return new mk(d, e);
    }
}
