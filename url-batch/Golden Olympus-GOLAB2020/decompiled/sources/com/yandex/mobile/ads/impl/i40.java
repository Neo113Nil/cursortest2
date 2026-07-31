package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class i40 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f27081a;

    public /* synthetic */ i40() {
        this(new uk2());
    }

    public final int a(@NotNull XmlPullParser parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.f27081a.getClass();
        Intrinsics.checkNotNullParameter(parser, "parser");
        parser.require(2, null, "Duration");
        this.f27081a.getClass();
        Long a4 = rd2.a(uk2.c(parser));
        if (a4 != null) {
            return (int) a4.longValue();
        }
        return 0;
    }

    public i40(@NotNull uk2 xmlHelper) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        this.f27081a = xmlHelper;
    }
}
