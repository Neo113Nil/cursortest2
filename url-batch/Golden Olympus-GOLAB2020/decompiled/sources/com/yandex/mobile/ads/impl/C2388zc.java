package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2388zc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f35542a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1805ae f35543b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final lp1 f35544c;

    public /* synthetic */ C2388zc(Context context) {
        this(context, C1804ad.a(), new lp1());
    }

    public final void a(@NotNull ip1.b reportType, @NotNull Map<String, ? extends Object> reportData, @Nullable String str, @Nullable C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        int i4 = ew1.f25476l;
        ew1 a4 = ew1.a.a();
        du1 a5 = a4.a(this.f35542a);
        if (a4.f()) {
            if (a5 == null || a5.i()) {
                this.f35544c.getClass();
                C2366yd a6 = lp1.a(reportType, reportData, str, c1795a4);
                if (a6 != null) {
                    this.f35543b.a(a6);
                }
            }
        }
    }

    public C2388zc(@NotNull Context context, @NotNull InterfaceC1805ae reporter, @NotNull lp1 mapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f35542a = context;
        this.f35543b = reporter;
        this.f35544c = mapper;
    }
}
