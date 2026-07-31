package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.sh0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class th0 implements tk2<sh0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f32438a;

    public /* synthetic */ th0() {
        this(new uk2());
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    public final sh0 a(XmlPullParser parser, InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f32438a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Icon");
        sh0.a aVar = new sh0.a();
        nu.a(this.f32438a, parser, "parser", "program", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "program");
        nu.a(this.f32438a, parser, "parser", "height", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "height");
        nu.a(this.f32438a, parser, "parser", "width", "attributeName");
        String attributeValue3 = parser.getAttributeValue(null, "width");
        nu.a(this.f32438a, parser, "parser", "xPosition", "attributeName");
        String attributeValue4 = parser.getAttributeValue(null, "xPosition");
        nu.a(this.f32438a, parser, "parser", "yPosition", "attributeName");
        String attributeValue5 = parser.getAttributeValue(null, "yPosition");
        nu.a(this.f32438a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue6 = parser.getAttributeValue(null, "apiFramework");
        nu.a(this.f32438a, parser, "parser", "offset", "attributeName");
        String attributeValue7 = parser.getAttributeValue(null, "offset");
        nu.a(this.f32438a, parser, "parser", IronSourceConstants.EVENTS_DURATION, "attributeName");
        String attributeValue8 = parser.getAttributeValue(null, IronSourceConstants.EVENTS_DURATION);
        while (true) {
            this.f32438a.getClass();
            if (!uk2.a(parser)) {
                return aVar.f(attributeValue).c(attributeValue2).j(attributeValue3).d(attributeValue4).i(attributeValue5).a(attributeValue6).e(attributeValue7).b(attributeValue8).a();
            }
            this.f32438a.getClass();
            if (uk2.b(parser)) {
                String name = parser.getName();
                sh0.c.f31747c.getClass();
                sh0.c[] values = sh0.c.values();
                int length = values.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        this.f32438a.getClass();
                        uk2.d(parser);
                        break;
                    }
                    if (Intrinsics.areEqual(values[i4].a(), name)) {
                        this.f32438a.getClass();
                        aVar.g(name).h(uk2.c(parser));
                        break;
                    }
                    i4++;
                }
            }
        }
    }

    public th0(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f32438a = xmlHelper;
    }
}
