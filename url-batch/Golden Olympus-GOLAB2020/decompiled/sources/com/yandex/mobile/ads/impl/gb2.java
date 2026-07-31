package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bb2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class gb2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f26095a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sk2<hu> f26096b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sk2<la2> f26097c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ph2 f26098d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final kb2 f26099e;

    public /* synthetic */ gb2(Context context, mp1 mp1Var) {
        this(context, mp1Var, new uk2(), new sk2(new ou(context, mp1Var), "Creatives", "Creative"), new sk2(new pa2(), "AdVerifications", "Verification"), new ph2(), new kb2());
    }

    public final void a(@NotNull XmlPullParser parser, @NotNull bb2.a videoAdBuilder, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(videoAdBuilder, "videoAdBuilder");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        String name = parser.getName();
        if (Intrinsics.areEqual("Impression", name)) {
            this.f26095a.getClass();
            videoAdBuilder.b(uk2.c(parser));
            return;
        }
        if (Intrinsics.areEqual("ViewableImpression", name)) {
            videoAdBuilder.a(this.f26098d.a(parser, base64EncodingParameters));
            return;
        }
        if (Intrinsics.areEqual("Error", name)) {
            this.f26095a.getClass();
            videoAdBuilder.a(uk2.c(parser));
            return;
        }
        if (Intrinsics.areEqual("Survey", name)) {
            this.f26095a.getClass();
            videoAdBuilder.g(uk2.c(parser));
            return;
        }
        if (Intrinsics.areEqual("Description", name)) {
            this.f26095a.getClass();
            videoAdBuilder.e(uk2.c(parser));
            return;
        }
        if (Intrinsics.areEqual("AdTitle", name)) {
            this.f26095a.getClass();
            videoAdBuilder.d(uk2.c(parser));
            return;
        }
        if (Intrinsics.areEqual("AdSystem", name)) {
            this.f26095a.getClass();
            videoAdBuilder.c(uk2.c(parser));
            return;
        }
        if (Intrinsics.areEqual("Creatives", name)) {
            videoAdBuilder.a(this.f26096b.a(parser, base64EncodingParameters));
            return;
        }
        if (Intrinsics.areEqual("AdVerifications", name)) {
            videoAdBuilder.a((List) this.f26097c.a(parser, base64EncodingParameters));
        } else if (Intrinsics.areEqual("Extensions", name)) {
            videoAdBuilder.a(this.f26099e.a(parser, base64EncodingParameters));
        } else {
            this.f26095a.getClass();
            uk2.d(parser);
        }
    }

    public gb2(@NotNull Context context, @NotNull mp1 reporter, @NotNull uk2 xmlHelper, @NotNull sk2<hu> creativeArrayParser, @NotNull sk2<la2> verificationArrayParser, @NotNull ph2 viewableImpressionParser, @NotNull kb2 videoAdExtensionsParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(creativeArrayParser, "creativeArrayParser");
        Intrinsics.checkNotNullParameter(verificationArrayParser, "verificationArrayParser");
        Intrinsics.checkNotNullParameter(viewableImpressionParser, "viewableImpressionParser");
        Intrinsics.checkNotNullParameter(videoAdExtensionsParser, "videoAdExtensionsParser");
        this.f26095a = xmlHelper;
        this.f26096b = creativeArrayParser;
        this.f26097c = verificationArrayParser;
        this.f26098d = viewableImpressionParser;
        this.f26099e = videoAdExtensionsParser;
    }
}
