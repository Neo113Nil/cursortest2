package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class NativeCrashServiceConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f40541a;

    public NativeCrashServiceConfig(@NotNull String str) {
        this.f40541a = str;
    }

    @NotNull
    public final String getNativeCrashFolder() {
        return this.f40541a;
    }
}
