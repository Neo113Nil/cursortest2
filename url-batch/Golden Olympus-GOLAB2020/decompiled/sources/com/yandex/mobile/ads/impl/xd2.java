package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class xd2 implements tk2<wd2> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f34530a;

    public /* synthetic */ xd2() {
        this(new uk2());
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wd2 a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f34530a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        String str = null;
        parser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f34530a.getClass();
            if (!uk2.a(parser)) {
                return new wd2(str, arrayList);
            }
            this.f34530a.getClass();
            if (uk2.b(parser)) {
                String name = parser.getName();
                if (Intrinsics.areEqual("ClickThrough", name)) {
                    this.f34530a.getClass();
                    String c4 = uk2.c(parser);
                    if (c4.length() > 0) {
                        str = c4;
                    }
                } else if (Intrinsics.areEqual("ClickTracking", name)) {
                    this.f34530a.getClass();
                    String c5 = uk2.c(parser);
                    if (c5.length() > 0) {
                        arrayList.add(c5);
                    }
                } else {
                    this.f34530a.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    public xd2(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f34530a = xmlHelper;
    }
}
