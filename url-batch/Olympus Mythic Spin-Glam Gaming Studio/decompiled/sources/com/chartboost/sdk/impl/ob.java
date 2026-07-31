package com.chartboost.sdk.impl;

import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public final class ob {
    public static final ob a = new ob();

    public final nb a(Element element) {
        String obj;
        Intrinsics.checkNotNullParameter(element, "element");
        bm bmVar = bm.a;
        String a2 = bmVar.a(element, VastAttributes.API_FRAMEWORK);
        String a3 = bmVar.a(element, "browserOptional");
        String str = null;
        Boolean valueOf = a3 != null ? Boolean.valueOf(Boolean.parseBoolean(a3)) : null;
        String textContent = element.getTextContent();
        if (textContent != null && (obj = StringsKt.trim(textContent).toString()) != null && obj.length() > 0) {
            str = obj;
        }
        return new nb(a2, valueOf, str);
    }
}
