package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class o70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f29928a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fy1 f29929b;

    public /* synthetic */ o70(uk2 uk2Var) {
        this(uk2Var, new fy1(uk2Var));
    }

    @NotNull
    public final ArrayList a(@NotNull XmlPullParser parser, @NotNull C1882dj base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f29928a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f29928a.getClass();
            if (!uk2.a(parser)) {
                return arrayList;
            }
            this.f29928a.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual("Extension", parser.getName())) {
                    k70 a4 = this.f29929b.a(parser, base64EncodingParameters);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                } else {
                    this.f29928a.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    public o70(@NotNull uk2 xmlHelper, @NotNull fy1 simpleExtensionParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(simpleExtensionParser, "simpleExtensionParser");
        this.f29928a = xmlHelper;
        this.f29929b = simpleExtensionParser;
    }
}
