package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hu;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class ou implements tk2<hu> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f30198a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ar0 f30199b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lu f30200c;

    public /* synthetic */ ou(Context context, mp1 mp1Var) {
        this(context, mp1Var, new uk2(), new ar0(), new lu(context, mp1Var));
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    public final hu a(XmlPullParser parser, InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f30198a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Creative");
        nu.a(this.f30198a, parser, "parser", "id", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "id");
        hu.a aVar = new hu.a();
        aVar.c(attributeValue);
        boolean z4 = false;
        while (true) {
            this.f30198a.getClass();
            if (!uk2.a(parser)) {
                break;
            }
            this.f30198a.getClass();
            if (uk2.b(parser)) {
                String name = parser.getName();
                if (Intrinsics.areEqual("Linear", name)) {
                    this.f30199b.a(parser, aVar, base64EncodingParameters);
                    z4 = true;
                } else if (Intrinsics.areEqual("CreativeExtensions", name)) {
                    aVar.a(this.f30200c.a(parser, base64EncodingParameters));
                } else {
                    this.f30198a.getClass();
                    uk2.d(parser);
                }
            }
        }
        if (z4) {
            return aVar.a();
        }
        return null;
    }

    public ou(@NotNull Context context, @NotNull mp1 reporter, @NotNull uk2 xmlHelper, @NotNull ar0 linearCreativeParser, @NotNull lu creativeExtensionsParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(linearCreativeParser, "linearCreativeParser");
        Intrinsics.checkNotNullParameter(creativeExtensionsParser, "creativeExtensionsParser");
        this.f30198a = xmlHelper;
        this.f30199b = linearCreativeParser;
        this.f30200c = creativeExtensionsParser;
    }
}
