package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hy0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26984a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zw0<?, ?> f26985b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f26986c;

    public hy0(@NotNull Context context, @NotNull zw0 mediatedAdController, @NotNull LinkedHashMap mediatedReportData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(mediatedReportData, "mediatedReportData");
        this.f26984a = context;
        this.f26985b = mediatedAdController;
        this.f26986c = mediatedReportData;
    }

    public final void a() {
        this.f26985b.e(this.f26984a, this.f26986c);
    }
}
