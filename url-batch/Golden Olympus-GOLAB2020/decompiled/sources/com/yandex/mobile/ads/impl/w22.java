package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class w22 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f33903a;

    public w22() {
        Intrinsics.checkNotNullParameter("id", "attribute");
        Intrinsics.checkNotNullParameter("Ad", "parentTag");
        this.f33903a = new uk2();
    }

    @Nullable
    public final String a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f33903a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Ad");
        String attributeValue = parser.getAttributeValue(null, "id");
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return attributeValue;
    }
}
