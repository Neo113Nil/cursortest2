package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class ju<T> implements tk2<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tk2<T> f27821a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uk2 f27822b;

    public ju(@NotNull h80 xmlElementParser, @NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlElementParser, "xmlElementParser");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f27821a = xmlElementParser;
        this.f27822b = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    @Nullable
    public final T a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f27822b.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        T t4 = null;
        parser.require(2, null, "CreativeExtension");
        while (true) {
            this.f27822b.getClass();
            if (!uk2.a(parser)) {
                return t4;
            }
            this.f27822b.getClass();
            if (uk2.b(parser)) {
                t4 = this.f27821a.a(parser, base64EncodingParameters);
            }
        }
    }
}
