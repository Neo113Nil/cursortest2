package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class b62 implements tk2<a62> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f23615a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r42 f23616b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ b62() {
        this(r0, new r42(new HashSet(CollectionsKt.listOf(Arrays.copyOf(r2, r2.length)))));
        uk2 uk2Var = new uk2();
        p42[] values = p42.values();
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    @Nullable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a62 a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f23615a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Tracking");
        String attributeValue = parser.getAttributeValue(null, "event");
        String attributeValue2 = parser.getAttributeValue(null, "offset");
        this.f23615a.getClass();
        String c4 = uk2.c(parser);
        if (attributeValue == null || attributeValue.length() == 0 || c4.length() <= 0) {
            return null;
        }
        ca2 a4 = attributeValue2 != null ? this.f23616b.a(attributeValue2) : null;
        Intrinsics.checkNotNull(attributeValue);
        return new a62(attributeValue, c4, a4);
    }

    public b62(@NotNull uk2 xmlHelper, @NotNull r42 timeOffsetParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        this.f23615a = xmlHelper;
        this.f23616b = timeOffsetParser;
    }
}
