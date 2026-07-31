package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes.dex */
public final class bj {
    public static final bj a = new bj();

    public final aj a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        String a2 = bm.a.a(element, "idRegistry");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim(textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        return new aj(a2, str);
    }

    public final List b(Element parentElement) {
        aj ajVar;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List c = bm.a.c(parentElement, "UniversalAdId");
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                ajVar = a.a((Element) it.next());
            } catch (Exception e) {
                xb.b("Failed to parse UniversalAdId element: " + e.getMessage(), e);
                ajVar = null;
            }
            if (ajVar != null) {
                arrayList.add(ajVar);
            }
        }
        return arrayList;
    }
}
