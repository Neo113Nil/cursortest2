package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class fy1 implements tk2<k70> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f25947a;

    public fy1(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f25947a = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k70 a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f25947a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Extension");
        String type = parser.getAttributeValue(null, "type");
        this.f25947a.getClass();
        String value = uk2.c(parser);
        if (type == null || type.length() == 0 || value.length() <= 0) {
            return null;
        }
        Intrinsics.checkNotNull(type);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new k70(type, value);
    }
}
