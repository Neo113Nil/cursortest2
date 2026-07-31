package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class ax1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f23510a;

    public /* synthetic */ ax1() {
        this(new uk2());
    }

    @Nullable
    public final Integer a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f23510a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Ad");
        Integer b4 = rd2.b(parser.getAttributeValue(null, "sequence"));
        if (b4 == null || b4.intValue() >= 0) {
            return b4;
        }
        return null;
    }

    public ax1(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f23510a = xmlHelper;
    }
}
