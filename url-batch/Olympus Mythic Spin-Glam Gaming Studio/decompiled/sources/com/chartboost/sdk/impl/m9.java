package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes10.dex */
public final class m9 {
    public static final m9 a = new m9();

    public final l9 a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim(textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return new l9(str);
        }
        return null;
    }
}
