package com.yandex.mobile.ads.impl;

import com.ironsource.C1563t;
import com.yandex.mobile.ads.impl.mv0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class ov0 implements tk2<mv0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f30210a;

    public /* synthetic */ ov0() {
        this(new uk2());
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    public final mv0 a(XmlPullParser parser, InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f30210a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "MediaFile");
        nu.a(this.f30210a, parser, "parser", C1563t.f19660g, "attributeName");
        String attributeValue = parser.getAttributeValue(null, C1563t.f19660g);
        nu.a(this.f30210a, parser, "parser", "type", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "type");
        nu.a(this.f30210a, parser, "parser", "height", "attributeName");
        String attributeValue3 = parser.getAttributeValue(null, "height");
        nu.a(this.f30210a, parser, "parser", "width", "attributeName");
        String attributeValue4 = parser.getAttributeValue(null, "width");
        nu.a(this.f30210a, parser, "parser", "bitrate", "attributeName");
        String attributeValue5 = parser.getAttributeValue(null, "bitrate");
        nu.a(this.f30210a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue6 = parser.getAttributeValue(null, "apiFramework");
        nu.a(this.f30210a, parser, "parser", "id", "attributeName");
        String attributeValue7 = parser.getAttributeValue(null, "id");
        nu.a(this.f30210a, parser, "parser", "codec", "attributeName");
        String attributeValue8 = parser.getAttributeValue(null, "codec");
        nu.a(this.f30210a, parser, "parser", "vmaf", "attributeName");
        String attributeValue9 = parser.getAttributeValue(null, "vmaf");
        this.f30210a.getClass();
        return new mv0.a(uk2.c(parser)).f(attributeValue7).d(attributeValue).e(attributeValue3).i(attributeValue4).b(attributeValue5).a(attributeValue6).g(attributeValue2).c(attributeValue8).h(attributeValue9).a();
    }

    public ov0(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f30210a = xmlHelper;
    }
}
