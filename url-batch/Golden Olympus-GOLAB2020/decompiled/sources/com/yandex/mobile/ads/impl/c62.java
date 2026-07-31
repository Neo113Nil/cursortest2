package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class c62 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f24073a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b62 f24074b;

    public /* synthetic */ c62() {
        this(new uk2(), new b62());
    }

    @NotNull
    public final HashMap a(@NotNull XmlPullParser parser, @NotNull InterfaceC1906ej base64EncodingHeaderParameters) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(base64EncodingHeaderParameters, "base64EncodingHeaderParameters");
        this.f24073a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "TrackingEvents");
        HashMap hashMap = new HashMap();
        while (true) {
            this.f24073a.getClass();
            if (!uk2.a(parser)) {
                return hashMap;
            }
            this.f24073a.getClass();
            if (uk2.b(parser)) {
                if (Intrinsics.areEqual("Tracking", parser.getName())) {
                    a62 a4 = this.f24074b.a(parser, base64EncodingHeaderParameters);
                    if (a4 != null) {
                        String a5 = a4.a();
                        String c4 = a4.c();
                        if (!hashMap.containsKey(a5)) {
                            hashMap.put(a5, new ArrayList());
                        }
                        List list = (List) hashMap.get(a5);
                        if (list != null) {
                            list.add(c4);
                        }
                    }
                } else {
                    this.f24073a.getClass();
                    uk2.d(parser);
                }
            }
        }
    }

    public c62(@NotNull uk2 xmlHelper, @NotNull b62 trackingEventParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(trackingEventParser, "trackingEventParser");
        this.f24073a = xmlHelper;
        this.f24074b = trackingEventParser;
    }
}
