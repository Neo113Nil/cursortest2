package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dx {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<h11> f24987a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<z01> f24988b;

    public dx(@NotNull List<h11> sdkLogs, @NotNull List<z01> networkLogs) {
        Intrinsics.checkNotNullParameter(sdkLogs, "sdkLogs");
        Intrinsics.checkNotNullParameter(networkLogs, "networkLogs");
        this.f24987a = sdkLogs;
        this.f24988b = networkLogs;
    }

    @NotNull
    public final List<z01> a() {
        return this.f24988b;
    }

    @NotNull
    public final List<h11> b() {
        return this.f24987a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx)) {
            return false;
        }
        dx dxVar = (dx) obj;
        return Intrinsics.areEqual(this.f24987a, dxVar.f24987a) && Intrinsics.areEqual(this.f24988b, dxVar.f24988b);
    }

    public final int hashCode() {
        return this.f24988b.hashCode() + (this.f24987a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelLogsData(sdkLogs=" + this.f24987a + ", networkLogs=" + this.f24988b + ")";
    }
}
