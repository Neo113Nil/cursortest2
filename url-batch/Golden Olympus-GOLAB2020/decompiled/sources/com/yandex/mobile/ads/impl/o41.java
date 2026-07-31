package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class o41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29896a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29897b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final m71 f29898c;

    public o41(@NotNull String assetName, @NotNull String clickActionType, @Nullable m71 m71Var) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(clickActionType, "clickActionType");
        this.f29896a = assetName;
        this.f29897b = clickActionType;
        this.f29898c = m71Var;
    }

    @NotNull
    public final Map<String, Object> a() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("asset_name", this.f29896a);
        createMapBuilder.put("action_type", this.f29897b);
        m71 m71Var = this.f29898c;
        if (m71Var != null) {
            createMapBuilder.putAll(m71Var.a().b());
        }
        return MapsKt.build(createMapBuilder);
    }
}
