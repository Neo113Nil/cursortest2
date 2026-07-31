package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yw0<T extends com.monetization.ads.mediation.base.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f35347a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xy0 f35348b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bx0 f35349c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final u70 f35350d;

    public yw0(@NotNull T mediatedAdapter, @NotNull xy0 mediationNetwork, @NotNull bx0 mediatedAdData, @NotNull u70 extrasCreator) {
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(mediatedAdData, "mediatedAdData");
        Intrinsics.checkNotNullParameter(extrasCreator, "extrasCreator");
        this.f35347a = mediatedAdapter;
        this.f35348b = mediationNetwork;
        this.f35349c = mediatedAdData;
        this.f35350d = extrasCreator;
    }

    @NotNull
    public final Map<String, Object> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f35350d.a(context);
    }

    @NotNull
    public final T b() {
        return this.f35347a;
    }

    @NotNull
    public final xy0 c() {
        return this.f35348b;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.f35350d.a(this.f35348b);
    }

    @NotNull
    public final bx0 a() {
        return this.f35349c;
    }
}
