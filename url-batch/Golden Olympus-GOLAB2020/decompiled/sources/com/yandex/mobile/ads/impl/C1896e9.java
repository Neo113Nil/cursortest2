package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.yandex.mobile.ads.impl.e9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1896e9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f25149a;

    public C1896e9(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f25149a = xmlHelper;
    }

    @Nullable
    public final C1872d9 a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f25149a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "AdTagURI");
        parser.getAttributeValue(null, "templateType");
        this.f25149a.getClass();
        String uri = uk2.c(parser);
        if (uri.length() <= 0) {
            return null;
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new C1872d9(uri);
    }
}
