package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.te, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2252te {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f32360c = "Incorrect AppMetrica Integration. The minimum supported version of AppMetrica SDK is 7.10.0 (inclusive) and the maximum supported version is 8.0.0 (exclusive). Please, check your AppMetrica integration.";

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f32361d = "Incorrect AppMetrica Version. The minimum supported version of AppMetrica SDK is 7.10.0 (inclusive) and the maximum supported version is 8.0.0 (exclusive). And the current version of AppMetrica SDK is ";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xa2 f32362a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2020je f32363b;

    public /* synthetic */ C2252te() {
        this(new xa2(), C2044ke.a());
    }

    public final void a() {
        String a4 = this.f32363b.a();
        if (a4 == null) {
            String str = f32360c;
            throw new jo0(str, str);
        }
        this.f32362a.getClass();
        wa2 a5 = xa2.a("7.10.0");
        if (a5 == null) {
            return;
        }
        this.f32362a.getClass();
        wa2 a6 = xa2.a("8.0.0");
        if (a6 == null) {
            return;
        }
        this.f32362a.getClass();
        wa2 a7 = xa2.a(a4);
        if (a7 == null || a7.compareTo(a5) < 0 || a7.compareTo(a6) >= 0) {
            String a8 = a(a4);
            throw new jo0(a8, a8);
        }
    }

    public C2252te(@NotNull xa2 versionNameParser, @NotNull InterfaceC2020je appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(versionNameParser, "versionNameParser");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f32362a = versionNameParser;
        this.f32363b = appMetricaAdapter;
    }

    private static String a(String str) {
        return f32361d + str;
    }
}
