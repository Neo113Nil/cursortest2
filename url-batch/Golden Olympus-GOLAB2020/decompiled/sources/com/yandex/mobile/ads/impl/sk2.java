package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class sk2<T> implements tk2<List<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tk2<T> f31824a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f31825b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f31826c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final uk2 f31827d;

    public /* synthetic */ sk2(tk2 tk2Var, String str, String str2) {
        this(tk2Var, str, str2, new uk2());
    }

    @Override // com.yandex.mobile.ads.impl.tk2
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        ArrayList arrayList = new ArrayList();
        uk2 uk2Var = this.f31827d;
        String str = this.f31825b;
        uk2Var.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, str);
        while (true) {
            this.f31827d.getClass();
            if (!uk2.a(parser)) {
                return arrayList;
            }
            this.f31827d.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual(this.f31826c, parser.getName())) {
                    T a4 = this.f31824a.a(parser, base64EncodingParameters);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                } else {
                    this.f31827d.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    public sk2(@NotNull tk2<T> xmlElementParser, @NotNull String elementsArrayTag, @NotNull String elementTag, @NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlElementParser, "xmlElementParser");
        Intrinsics.checkNotNullParameter(elementsArrayTag, "elementsArrayTag");
        Intrinsics.checkNotNullParameter(elementTag, "elementTag");
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f31824a = xmlElementParser;
        this.f31825b = elementsArrayTag;
        this.f31826c = elementTag;
        this.f31827d = xmlHelper;
    }
}
