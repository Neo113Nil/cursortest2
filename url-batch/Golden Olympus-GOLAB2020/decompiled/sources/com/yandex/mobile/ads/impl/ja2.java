package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.Xml;
import java.io.StringReader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class ja2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f27614a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n92 f27615b;

    public /* synthetic */ ja2(Context context, mp1 mp1Var) {
        this(context, mp1Var, new uk2(), new n92(context, mp1Var));
    }

    @Nullable
    public final j92 a(@NotNull String data, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        XmlPullParser parser = Xml.newPullParser();
        parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        parser.setInput(new StringReader(data));
        Intrinsics.checkNotNull(parser);
        parser.nextTag();
        this.f27614a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "VAST");
        return this.f27615b.a(parser, base64EncodingParameters);
    }

    public ja2(@NotNull Context context, @NotNull mp1 reporter, @NotNull uk2 xmlHelper, @NotNull n92 vastAdsParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(vastAdsParser, "vastAdsParser");
        this.f27614a = xmlHelper;
        this.f27615b = vastAdsParser;
    }
}
