package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class pa2 implements tk2<la2> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f30381a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xp0 f30382b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final oa2 f30383c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final c62 f30384d;

    public /* synthetic */ pa2() {
        this(new uk2(), new xp0(), new oa2(), new c62());
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    public final la2 a(XmlPullParser parser, InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f30381a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Verification");
        nu.a(this.f30381a, parser, "parser", "vendor", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "vendor");
        HashMap hashMap = new HashMap();
        wp0 wp0Var = null;
        String str = null;
        while (true) {
            this.f30381a.getClass();
            if (!uk2.a(parser)) {
                break;
            }
            this.f30381a.getClass();
            if (uk2.b(parser)) {
                String name = parser.getName();
                if (Intrinsics.areEqual("JavaScriptResource", name)) {
                    wp0Var = this.f30382b.a(parser);
                } else if (Intrinsics.areEqual("VerificationParameters", name)) {
                    str = this.f30383c.a(parser);
                } else if (Intrinsics.areEqual("TrackingEvents", name)) {
                    hashMap = this.f30384d.a(parser, base64EncodingParameters);
                } else {
                    this.f30381a.getClass();
                    uk2.d(parser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new la2(attributeValue, wp0Var, str, hashMap);
    }

    public pa2(@NotNull uk2 xmlHelper, @NotNull xp0 javaScriptResourceParser, @NotNull oa2 verificationParametersParser, @NotNull c62 trackingEventsParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(javaScriptResourceParser, "javaScriptResourceParser");
        Intrinsics.checkNotNullParameter(verificationParametersParser, "verificationParametersParser");
        Intrinsics.checkNotNullParameter(trackingEventsParser, "trackingEventsParser");
        this.f30381a = xmlHelper;
        this.f30382b = javaScriptResourceParser;
        this.f30383c = verificationParametersParser;
        this.f30384d = trackingEventsParser;
    }
}
