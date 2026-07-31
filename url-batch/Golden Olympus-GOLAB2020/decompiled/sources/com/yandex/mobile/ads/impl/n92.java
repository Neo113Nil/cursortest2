package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class n92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f29525a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bc2 f29526b;

    public /* synthetic */ n92(Context context, mp1 mp1Var) {
        this(context, mp1Var, new uk2(), new bc2(context, mp1Var));
    }

    @Nullable
    public final j92 a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        nu.a(this.f29525a, parser, "parser", "version", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f29525a.getClass();
            if (!uk2.a(parser)) {
                break;
            }
            this.f29525a.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual("Ad", parser.getName())) {
                    bb2 a4 = this.f29526b.a(parser, base64EncodingParameters);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                } else {
                    this.f29525a.getClass();
                    uk2.d(parser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new j92(attributeValue, arrayList);
    }

    public n92(@NotNull Context context, @NotNull mp1 reporter, @NotNull uk2 xmlHelper, @NotNull bc2 videoAdParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(videoAdParser, "videoAdParser");
        this.f29525a = xmlHelper;
        this.f29526b = videoAdParser;
    }
}
