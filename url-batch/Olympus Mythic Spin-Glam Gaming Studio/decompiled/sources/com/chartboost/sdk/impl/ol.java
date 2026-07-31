package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class ol {
    public static final ol a = new ol();

    public final nl a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        bm bmVar = bm.a;
        return new nl(bmVar.a(element, "id"), bmVar.e(element, "Viewable"), bmVar.e(element, "NotViewable"), bmVar.e(element, "ViewUndetermined"));
    }

    public final List b(Element parentElement) {
        nl nlVar;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List c = bm.a.c(parentElement, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            try {
                nlVar = a.a((Element) it.next());
            } catch (Exception e) {
                xb.b("Failed to parse ViewableImpression element: " + e.getMessage(), e);
                nlVar = null;
            }
            if (nlVar != null) {
                arrayList.add(nlVar);
            }
        }
        return arrayList;
    }
}
