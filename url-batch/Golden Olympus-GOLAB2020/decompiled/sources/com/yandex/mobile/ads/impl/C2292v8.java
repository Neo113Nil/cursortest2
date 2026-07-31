package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.yandex.mobile.ads.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2292v8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f33544a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1896e9 f33545b;

    public /* synthetic */ C2292v8(uk2 uk2Var) {
        this(uk2Var, new C1896e9(uk2Var));
    }

    @Nullable
    public final C2269u8 a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f33544a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        C2269u8 c2269u8 = null;
        parser.require(2, null, "AdSource");
        nu.a(this.f33544a, parser, "parser", "allowMultipleAds", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "allowMultipleAds");
        if (attributeValue != null) {
            Boolean.parseBoolean(attributeValue);
        }
        nu.a(this.f33544a, parser, "parser", "followRedirects", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "followRedirects");
        if (attributeValue2 != null) {
            Boolean.parseBoolean(attributeValue2);
        }
        String attributeValue3 = parser.getAttributeValue(null, "id");
        while (true) {
            this.f33544a.getClass();
            if (!uk2.a(parser)) {
                return c2269u8;
            }
            this.f33544a.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual("AdTagURI", parser.getName())) {
                    C1872d9 adTagUri = this.f33545b.a(parser);
                    if (adTagUri != null) {
                        Intrinsics.checkNotNullParameter(adTagUri, "adTagUri");
                        c2269u8 = new C2269u8(adTagUri, attributeValue3);
                    }
                } else {
                    this.f33544a.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    public C2292v8(@NotNull uk2 xmlHelper, @NotNull C1896e9 adTagUriParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(adTagUriParser, "adTagUriParser");
        this.f33544a = xmlHelper;
        this.f33545b = adTagUriParser;
    }
}
