package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jb2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class kb2 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f28162d = "yandex_tracking_events";

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final List<String> f28163e = CollectionsKt.listOf((Object[]) new String[]{"ad_system", "social_ad_info", "AdTune", "yandex_ad_info", "bannerId", "VitrinaTVIsInteractive"});

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f28164a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final fy1 f28165b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sk2<a62> f28166c;

    public kb2() {
        uk2 uk2Var = new uk2();
        this.f28164a = uk2Var;
        this.f28165b = new fy1(uk2Var);
        this.f28166c = a();
    }

    @NotNull
    public final jb2 a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingParameters, "base64EncodingParameters");
        this.f28164a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jb2.a aVar = new jb2.a();
        while (true) {
            this.f28164a.getClass();
            if (!uk2.a(parser)) {
                aVar.a(arrayList2);
                aVar.b(arrayList);
                return aVar.a();
            }
            this.f28164a.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual("Extension", parser.getName())) {
                    String attributeValue = parser.getAttributeValue(null, "type");
                    if (f28163e.contains(attributeValue)) {
                        k70 a4 = this.f28165b.a(parser, base64EncodingParameters);
                        if (a4 != null) {
                            arrayList2.add(a4);
                        }
                    } else if (Intrinsics.areEqual(f28162d, attributeValue)) {
                        arrayList.addAll(this.f28166c.a(parser, base64EncodingParameters));
                    } else {
                        this.f28164a.getClass();
                        uk2.d(parser);
                    }
                } else {
                    this.f28164a.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    private static sk2 a() {
        return new sk2(new b62(), "Extension", "Tracking", new uk2());
    }
}
