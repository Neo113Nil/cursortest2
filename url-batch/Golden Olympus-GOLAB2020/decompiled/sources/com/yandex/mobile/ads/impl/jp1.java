package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f27797a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private C1814b f27798b;

    public /* synthetic */ jp1(Map map, int i4) {
        this((Map<String, ? extends Object>) ((i4 & 1) != 0 ? MapsKt.emptyMap() : map), (C1814b) null);
    }

    @Nullable
    public final C1814b a() {
        return this.f27798b;
    }

    @NotNull
    public final Map<String, Object> b() {
        return this.f27797a;
    }

    public final void a(@Nullable C1814b c1814b) {
        this.f27798b = c1814b;
    }

    public final void b(@Nullable Object obj, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            this.f27797a.put(key, obj);
        } else {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f27797a.put(key, StringUtils.UNDEFINED);
        }
    }

    public jp1(@NotNull Map<String, ? extends Object> reportData, @Nullable C1814b c1814b) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        reportData = kotlin.jvm.internal.M.m(reportData) ? reportData : null;
        this.f27797a = reportData == null ? new LinkedHashMap<>() : reportData;
        this.f27798b = c1814b;
    }

    public final void a(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f27797a.putAll(data);
    }

    public final void a(@Nullable List list) {
        Intrinsics.checkNotNullParameter("active_experiments", b9.h.f15463W);
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f27797a.put("active_experiments", list);
    }

    public final void a(@Nullable Object obj, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            this.f27797a.put(key, obj);
        }
    }
}
