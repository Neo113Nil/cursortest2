package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bb2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class nk2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f29665a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gb2 f29666b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lk2 f29667c;

    public /* synthetic */ nk2(Context context, mp1 mp1Var) {
        this(context, mp1Var, new uk2(), new gb2(context, mp1Var), new lk2());
    }

    @NotNull
    public final bb2 a(@NotNull XmlPullParser parser, @NotNull bb2.a videoAdBuilder, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(videoAdBuilder, "videoAdBuilder");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f29665a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Wrapper");
        this.f29667c.getClass();
        videoAdBuilder.a(lk2.a(parser));
        while (true) {
            this.f29665a.getClass();
            if (!uk2.a(parser)) {
                return videoAdBuilder.a();
            }
            this.f29665a.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual("VASTAdTagURI", parser.getName())) {
                    this.f29665a.getClass();
                    videoAdBuilder.h(uk2.c(parser));
                } else {
                    this.f29666b.a(parser, videoAdBuilder, base64EncodingParameters);
                }
            }
        }
    }

    public nk2(@NotNull Context context, @NotNull mp1 reporter, @NotNull uk2 xmlHelper, @NotNull gb2 videoAdElementParser, @NotNull lk2 wrapperConfigurationParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(videoAdElementParser, "videoAdElementParser");
        Intrinsics.checkNotNullParameter(wrapperConfigurationParser, "wrapperConfigurationParser");
        this.f29665a = xmlHelper;
        this.f29666b = videoAdElementParser;
        this.f29667c = wrapperConfigurationParser;
    }
}
