package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class h80 implements tk2<c80> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f26665a;

    public h80(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f26665a = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    public final c80 a(XmlPullParser parser, InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f26665a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "FalseClick");
        nu.a(this.f26665a, parser, "parser", "interval", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "interval");
        Long n4 = attributeValue != null ? StringsKt.n(attributeValue) : null;
        this.f26665a.getClass();
        String c4 = uk2.c(parser);
        if (c4.length() <= 0 || n4 == null) {
            return null;
        }
        return new c80(c4, n4.longValue());
    }
}
