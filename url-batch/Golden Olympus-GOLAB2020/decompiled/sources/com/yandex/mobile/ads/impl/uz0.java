package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uz0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f33449a = CollectionsKt.emptyList();

    public static boolean a(@NotNull Context context, @NotNull String adapterName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        return !f33449a.contains(adapterName) || n80.a(context, m80.f28941d);
    }
}
