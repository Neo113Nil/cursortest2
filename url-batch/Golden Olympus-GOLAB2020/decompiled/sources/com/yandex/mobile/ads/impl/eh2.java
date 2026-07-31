package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.ip1;
import com.yandex.mobile.ads.impl.vy1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eh2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2085m7 f25302a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f25303b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final gf1 f25304c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ eh2(Context context, C2286v2 c2286v2) {
        this(context, c2286v2, r3, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()), new gf1());
        C2085m7 c2085m7 = new C2085m7();
        c2286v2.p().f();
    }

    public final void a(@NotNull ch2 viewSizeInfo, @NotNull C2286v2 adConfiguration) {
        vy1.a a4;
        Intrinsics.checkNotNullParameter(viewSizeInfo, "viewSizeInfo");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        C1918f7 a5 = adConfiguration.a();
        jp1 a6 = a5 != null ? this.f25302a.a(a5) : new jp1((Map) null, 3);
        C1918f7 a7 = adConfiguration.a();
        if (a7 != null) {
            kp1.a(a6, this.f25302a.a(a7));
        }
        a6.b(adConfiguration.c(), "ad_unit_id");
        a6.b(adConfiguration.c(), "block_id");
        gf1 gf1Var = this.f25304c;
        int n4 = adConfiguration.n();
        gf1Var.getClass();
        a6.b(n4 != 1 ? n4 != 2 ? StringUtils.UNDEFINED : b9.h.f15433C : b9.h.f15435D, b9.h.f15492n);
        vy1 q4 = adConfiguration.q();
        a6.a((q4 == null || (a4 = q4.a()) == null) ? null : a4.a(), "size_type");
        vy1 q5 = adConfiguration.q();
        a6.a(q5 != null ? Integer.valueOf(q5.getWidth()) : null, "size_info_width");
        vy1 q6 = adConfiguration.q();
        a6.a(q6 != null ? Integer.valueOf(q6.getHeight()) : null, "size_info_height");
        a6.b(Integer.valueOf(viewSizeInfo.d().b()), "view_width");
        a6.b(Integer.valueOf(viewSizeInfo.d().a()), "view_height");
        a6.a(viewSizeInfo.b().b(), "layout_width");
        a6.a(viewSizeInfo.b().a(), "layout_height");
        a6.b(Integer.valueOf(viewSizeInfo.c().b().b()), "measured_width");
        String name = viewSizeInfo.c().b().a().name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        a6.b(lowerCase, "measured_width_mode");
        a6.b(Integer.valueOf(viewSizeInfo.c().a().b()), "measured_height");
        String lowerCase2 = viewSizeInfo.c().a().a().name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        a6.b(lowerCase2, "measured_height_mode");
        ip1.b bVar = ip1.b.f27329Q;
        Map<String, Object> b4 = a6.b();
        this.f25303b.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a6, bVar, "reportType", b4, "reportData")));
    }

    public eh2(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2085m7 adRequestReportDataProvider, @NotNull mp1 metricaReporter, @NotNull gf1 orientationNameProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adRequestReportDataProvider, "adRequestReportDataProvider");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(orientationNameProvider, "orientationNameProvider");
        this.f25302a = adRequestReportDataProvider;
        this.f25303b = metricaReporter;
        this.f25304c = orientationNameProvider;
    }
}
