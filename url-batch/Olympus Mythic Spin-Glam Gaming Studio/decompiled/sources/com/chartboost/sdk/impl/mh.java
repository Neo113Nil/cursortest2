package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class mh {
    public static final mh a = new mh();

    public final lh a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        String a2 = bm.a.a(element, "creativeType");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim(textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return new lh(a2, str);
        }
        return null;
    }
}
