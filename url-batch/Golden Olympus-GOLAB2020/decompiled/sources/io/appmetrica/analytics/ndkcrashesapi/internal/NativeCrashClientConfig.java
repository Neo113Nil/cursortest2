package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class NativeCrashClientConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f40539a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40540b;

    public NativeCrashClientConfig(@NotNull String str, @NotNull String str2) {
        this.f40539a = str;
        this.f40540b = str2;
    }

    @NotNull
    public final String getNativeCrashFolder() {
        return this.f40539a;
    }

    @NotNull
    public final String getNativeCrashMetadata() {
        return this.f40540b;
    }
}
