package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class xp0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f34659a;

    public /* synthetic */ xp0() {
        this(new uk2());
    }

    @Nullable
    public final wp0 a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f34659a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "JavaScriptResource");
        nu.a(this.f34659a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "apiFramework");
        nu.a(this.f34659a, parser, "parser", "browserOptional", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "browserOptional");
        Boolean valueOf = attributeValue2 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue2)) : null;
        this.f34659a.getClass();
        String c4 = uk2.c(parser);
        if (attributeValue == null || attributeValue.length() == 0 || valueOf == null || c4.length() <= 0) {
            return null;
        }
        return new wp0(attributeValue, c4, valueOf.booleanValue());
    }

    public xp0(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f34659a = xmlHelper;
    }
}
