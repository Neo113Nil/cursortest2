package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bb2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class gk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gb2 f26185a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uk2 f26186b;

    public /* synthetic */ gk0(gb2 gb2Var) {
        this(gb2Var, new uk2());
    }

    @Nullable
    public final bb2 a(@NotNull XmlPullParser parser, @NotNull bb2.a videoAdBuilder, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(videoAdBuilder, "videoAdBuilder");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f26186b.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "InLine");
        while (true) {
            this.f26186b.getClass();
            if (!uk2.a(parser)) {
                break;
            }
            this.f26186b.getClass();
            if (uk2.b(parser)) {
                this.f26185a.a(parser, videoAdBuilder, base64EncodingParameters);
            }
        }
        bb2 a4 = videoAdBuilder.a();
        if (a4.e().isEmpty()) {
            return null;
        }
        return a4;
    }

    public gk0(@NotNull gb2 videoAdElementParser, @NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(videoAdElementParser, "videoAdElementParser");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f26185a = videoAdElementParser;
        this.f26186b = xmlHelper;
    }
}
