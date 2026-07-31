package com.yandex.mobile.ads.impl;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class lk2 {
    private static boolean a(XmlPullParser xmlPullParser, String str, boolean z4) {
        Boolean V02;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String lowerCase = attributeValue.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null && (V02 = StringsKt.V0(lowerCase)) != null) {
                return V02.booleanValue();
            }
        }
        return z4;
    }

    @NotNull
    public static kk2 a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        return new kk2(a(parser, "allowMultipleAds", false), a(parser, "followAdditionalWrappers", true));
    }
}
