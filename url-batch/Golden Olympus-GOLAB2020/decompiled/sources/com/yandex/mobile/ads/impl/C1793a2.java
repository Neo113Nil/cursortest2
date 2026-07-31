package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1793a2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final uk2 f23124a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o70 f23125b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2292v8 f23126c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2075ll f23127d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xo1 f23128e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final q42 f23129f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final c62 f23130g;

    public /* synthetic */ C1793a2(uk2 uk2Var, o70 o70Var) {
        this(uk2Var, o70Var, new C2292v8(uk2Var), new C2075ll(), new xo1(), new q42(), new c62());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:72:0x00d3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e A[EDGE_INSN: B:60:0x013e->B:61:0x013e BREAK  A[LOOP:1: B:33:0x00e8->B:49:0x00e8], SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.mobile.ads.impl.C2308w1 a(@org.jetbrains.annotations.NotNull org.xmlpull.v1.XmlPullParser r11, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.C1882dj r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C1793a2.a(org.xmlpull.v1.XmlPullParser, com.yandex.mobile.ads.impl.dj):com.yandex.mobile.ads.impl.w1");
    }

    public C1793a2(@NotNull uk2 xmlHelper, @NotNull o70 extensionsParser, @NotNull C2292v8 adSourceParser, @NotNull C2075ll breakTypeParser, @NotNull xo1 repeatAfterParser, @NotNull q42 timeOffsetParser, @NotNull c62 trackingEventsParser) {
        Intrinsics.checkNotNullParameter(xmlHelper, "xmlHelper");
        Intrinsics.checkNotNullParameter(extensionsParser, "extensionsParser");
        Intrinsics.checkNotNullParameter(adSourceParser, "adSourceParser");
        Intrinsics.checkNotNullParameter(breakTypeParser, "breakTypeParser");
        Intrinsics.checkNotNullParameter(repeatAfterParser, "repeatAfterParser");
        Intrinsics.checkNotNullParameter(timeOffsetParser, "timeOffsetParser");
        Intrinsics.checkNotNullParameter(trackingEventsParser, "trackingEventsParser");
        this.f23124a = xmlHelper;
        this.f23125b = extensionsParser;
        this.f23126c = adSourceParser;
        this.f23127d = breakTypeParser;
        this.f23128e = repeatAfterParser;
        this.f23129f = timeOffsetParser;
        this.f23130g = trackingEventsParser;
    }
}
