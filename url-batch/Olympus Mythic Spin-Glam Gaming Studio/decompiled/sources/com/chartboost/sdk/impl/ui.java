package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class ui {
    public static final ui a = new ui();

    public final List a(Element trackingEventsParentElement, zj context, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(trackingEventsParentElement, "trackingEventsParentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        for (Element element : bm.a.c(trackingEventsParentElement, "Tracking")) {
            bm bmVar = bm.a;
            String a2 = bmVar.a(element, "event");
            String a3 = bmVar.a(element, "offset");
            String textContent = element.getTextContent();
            if (textContent == null || (str = StringsKt.trim(textContent).toString()) == null || str.length() <= 0) {
                str = null;
            }
            String str2 = str;
            if (str2 != null) {
                qi qiVar = new qi(a2, str2, context.c(), a3, null, null, 48, null);
                arrayList.add(qiVar);
                if (z) {
                    context.b().add(qiVar);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List a(ui uiVar, Element element, zj zjVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return uiVar.a(element, zjVar, z);
    }
}
