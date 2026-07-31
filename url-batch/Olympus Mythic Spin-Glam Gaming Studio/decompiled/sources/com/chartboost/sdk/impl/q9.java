package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class q9 {
    public static final q9 a = new q9();

    public final p9 a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        bm bmVar = bm.a;
        String d = bmVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H);
        List e = bmVar.e(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I);
        ArrayList arrayList = new ArrayList();
        Element b = bmVar.b(element, "IconClickFallbackImages");
        if (b != null) {
            Iterator it = bmVar.c(b, "IconClickFallbackImage").iterator();
            while (it.hasNext()) {
                o9 b2 = a.b((Element) it.next());
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        if (d == null && e.isEmpty() && arrayList.isEmpty()) {
            return null;
        }
        return new p9(d, e, arrayList);
    }

    public final o9 b(Element element) {
        bm bmVar = bm.a;
        String a2 = bmVar.a(element, "width");
        Integer intOrNull = a2 != null ? StringsKt.toIntOrNull(a2) : null;
        String a3 = bmVar.a(element, "height");
        Integer intOrNull2 = a3 != null ? StringsKt.toIntOrNull(a3) : null;
        String d = bmVar.d(element, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K);
        Element b = bmVar.b(element, "StaticResource");
        lh a4 = b != null ? mh.a.a(b) : null;
        if (a4 != null) {
            return new o9(intOrNull, intOrNull2, d, a4);
        }
        return null;
    }
}
