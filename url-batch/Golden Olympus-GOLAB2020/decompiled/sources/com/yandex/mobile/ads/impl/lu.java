package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ku;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class lu {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f28775e = "yandex_tracking_events";

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f28776f = "yandex_linear_creative_info";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f28777a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zq0 f28778b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ju<c80> f28779c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final sk2<a62> f28780d;

    public /* synthetic */ lu(Context context, mp1 mp1Var) {
        this(context, mp1Var, new uk2(), new zq0(mp1Var, new C2186qg(context, mp1Var, (er0) null, 12)));
    }

    private static sk2 b() {
        return new sk2(new b62(), "CreativeExtension", "Tracking", new uk2());
    }

    @NotNull
    public final ku a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f28777a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "CreativeExtensions");
        ku.a aVar = new ku.a();
        while (true) {
            this.f28777a.getClass();
            if (!uk2.a(parser)) {
                return aVar.a();
            }
            this.f28777a.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual("CreativeExtension", parser.getName())) {
                    String attributeValue = parser.getAttributeValue(null, "type");
                    if (Intrinsics.areEqual("false_click", attributeValue)) {
                        aVar.a(this.f28779c.a(parser, base64EncodingParameters));
                    } else if (Intrinsics.areEqual(f28775e, attributeValue)) {
                        aVar.a(this.f28780d.a(parser, base64EncodingParameters));
                    } else if (Intrinsics.areEqual(f28776f, attributeValue)) {
                        aVar.a(this.f28778b.a(parser, base64EncodingParameters));
                    } else {
                        this.f28777a.getClass();
                        uk2.d(parser);
                    }
                } else {
                    this.f28777a.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    public lu(@NotNull Context context, @NotNull mp1 reporter, @NotNull uk2 xmlHelper, @NotNull zq0 linearCreativeInfoParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(linearCreativeInfoParser, "linearCreativeInfoParser");
        this.f28777a = xmlHelper;
        this.f28778b = linearCreativeInfoParser;
        this.f28779c = a();
        this.f28780d = b();
    }

    private static ju a() {
        return new ju(new h80(new uk2()), new uk2());
    }
}
