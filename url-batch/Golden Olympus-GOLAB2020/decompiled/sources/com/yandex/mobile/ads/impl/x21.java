package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x21 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f34365a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e01 f34366b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34367c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f34368d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34369e;

    public x21(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f34365a = adResponse;
        adConfiguration.p().f();
        this.f34366b = C1900ed.a(context, zm2.f35627a, adConfiguration.p().b());
        this.f34367c = true;
        this.f34368d = true;
        this.f34369e = true;
    }

    public final void a() {
        if (this.f34369e) {
            a("first_auto_swipe");
            this.f34369e = false;
        }
    }

    public final void b() {
        if (this.f34367c) {
            a("first_click_on_controls");
            this.f34367c = false;
        }
    }

    public final void c() {
        if (this.f34368d) {
            a("first_user_swipe");
            this.f34368d = false;
        }
    }

    private final void a(String str) {
        ip1.b reportType = ip1.b.f27328P;
        HashMap reportData = MapsKt.hashMapOf(TuplesKt.to("event_type", str));
        C1814b a4 = this.f34365a.a();
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.f34366b.a(new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), a4));
    }
}
