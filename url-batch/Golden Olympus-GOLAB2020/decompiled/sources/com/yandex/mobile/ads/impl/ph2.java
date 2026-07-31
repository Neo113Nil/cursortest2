package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class ph2 implements tk2<oh2> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f30452a;

    public /* synthetic */ ph2() {
        this(new uk2());
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final oh2 a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f30452a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f30452a.getClass();
            if (!uk2.a(parser)) {
                return new oh2(arrayList);
            }
            this.f30452a.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual("Viewable", parser.getName())) {
                    this.f30452a.getClass();
                    arrayList.add(uk2.c(parser));
                } else {
                    this.f30452a.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    public ph2(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f30452a = xmlHelper;
    }
}
