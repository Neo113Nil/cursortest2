package com.chartboost.sdk.impl;

import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes11.dex */
public final class gc {
    public static final gc a = new gc();

    public final fc a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        bm bmVar = bm.a;
        String a2 = bmVar.a(element, "type");
        if (a2 == null) {
            a2 = "";
        }
        String a3 = bmVar.a(element, "width");
        Integer intOrNull = a3 != null ? StringsKt.toIntOrNull(a3) : null;
        String a4 = bmVar.a(element, "height");
        Integer intOrNull2 = a4 != null ? StringsKt.toIntOrNull(a4) : null;
        String a5 = bmVar.a(element, VastAttributes.BITRATE);
        Integer intOrNull3 = a5 != null ? StringsKt.toIntOrNull(a5) : null;
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim(textContent).toString()) == null) {
            str = "";
        }
        String a6 = bmVar.a(element, "weight");
        return new fc(a2, intOrNull, intOrNull2, intOrNull3, str, a6 != null ? StringsKt.toDoubleOrNull(a6) : null);
    }

    public final List b(Element parentElement) {
        fc fcVar;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List<Element> c = bm.a.c(parentElement, "MediaFile");
        ArrayList arrayList = new ArrayList();
        for (Element element : c) {
            try {
                fcVar = a.a(element);
            } catch (Exception e) {
                bm bmVar = bm.a;
                xb.b("MediaFile parse failed: mimeType=" + bmVar.a(element, "type") + ", width=" + bmVar.a(element, "width") + ", height=" + bmVar.a(element, "height") + ", errorType=" + e.getClass().getSimpleName() + ", message=" + e.getMessage(), e);
                fcVar = null;
            }
            if (fcVar != null) {
                arrayList.add(fcVar);
            }
        }
        return arrayList;
    }
}
