package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bb2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class bc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f23705a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gk0 f23706b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final nk2 f23707c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ax1 f23708d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final w22 f23709e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Context f23710f;

    public /* synthetic */ bc2(Context context, mp1 mp1Var) {
        this(context, mp1Var, new uk2(), new gk0(new gb2(context, mp1Var)), new nk2(context, mp1Var), new ax1(), new w22());
    }

    @Nullable
    public final bb2 a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        String a4 = this.f23709e.a(parser);
        Integer a5 = this.f23708d.a(parser);
        this.f23705a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        bb2 bb2Var = null;
        parser.require(2, null, "Ad");
        while (true) {
            this.f23705a.getClass();
            if (!uk2.a(parser)) {
                return bb2Var;
            }
            this.f23705a.getClass();
            if (uk2.b(parser)) {
                String name = parser.getName();
                if (Intrinsics.areEqual("InLine", name)) {
                    bb2.a aVar = new bb2.a(this.f23710f, false);
                    aVar.f(a4);
                    aVar.a(a5);
                    bb2Var = this.f23706b.a(parser, aVar, base64EncodingParameters);
                } else if (Intrinsics.areEqual("Wrapper", name)) {
                    bb2.a aVar2 = new bb2.a(this.f23710f, true);
                    aVar2.f(a4);
                    aVar2.a(a5);
                    bb2Var = this.f23707c.a(parser, aVar2, base64EncodingParameters);
                } else {
                    this.f23705a.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    public bc2(@NotNull Context context, @NotNull mp1 reporter, @NotNull uk2 xmlHelper, @NotNull gk0 inlineParser, @NotNull nk2 wrapperParser, @NotNull ax1 sequenceParser, @NotNull w22 idXmlAttributeParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(inlineParser, "inlineParser");
        Intrinsics.checkNotNullParameter(wrapperParser, "wrapperParser");
        Intrinsics.checkNotNullParameter(sequenceParser, "sequenceParser");
        Intrinsics.checkNotNullParameter(idXmlAttributeParser, "idXmlAttributeParser");
        this.f23705a = xmlHelper;
        this.f23706b = inlineParser;
        this.f23707c = wrapperParser;
        this.f23708d = sequenceParser;
        this.f23709e = idXmlAttributeParser;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f23710f = applicationContext;
    }
}
