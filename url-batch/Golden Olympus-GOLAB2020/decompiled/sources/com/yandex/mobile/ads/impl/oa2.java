package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class oa2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f29958a;

    public /* synthetic */ oa2() {
        this(new uk2());
    }

    @Nullable
    public final String a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f29958a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "VerificationParameters");
        this.f29958a.getClass();
        String c4 = uk2.c(parser);
        if (c4.length() == 0) {
            return null;
        }
        return c4;
    }

    public oa2(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f29958a = xmlHelper;
    }
}
