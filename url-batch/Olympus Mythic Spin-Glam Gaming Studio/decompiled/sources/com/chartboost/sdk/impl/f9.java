package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes11.dex */
public final class f9 {
    public static final f9 a = new f9();

    public final e9 a(Element element) {
        String str;
        Intrinsics.checkNotNullParameter(element, "element");
        String textContent = element.getTextContent();
        if (textContent == null || (str = StringsKt.trim(textContent).toString()) == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return new e9(str);
        }
        return null;
    }
}
