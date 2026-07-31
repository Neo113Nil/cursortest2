package com.yandex.varioqub.analyticadapter.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ConfigData {

    /* renamed from: a, reason: collision with root package name */
    private final String f36134a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36135b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36136c;

    public ConfigData(@NotNull String str, @NotNull String str2, long j4) {
        this.f36134a = str;
        this.f36135b = str2;
        this.f36136c = j4;
    }

    public final long getConfigLoadTimestamp() {
        return this.f36136c;
    }

    @NotNull
    public final String getNewConfigVersion() {
        return this.f36135b;
    }

    @NotNull
    public final String getOldConfigVersion() {
        return this.f36134a;
    }
}
