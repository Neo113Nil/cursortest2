package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ux {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final ux f33438a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final uw f33439b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33440c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<wx> f33441d;

    /* JADX WARN: Multi-variable type inference failed */
    public ux(@Nullable ux uxVar, @NotNull uw destination, boolean z4, @NotNull List<? extends wx> uiData) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        this.f33438a = uxVar;
        this.f33439b = destination;
        this.f33440c = z4;
        this.f33441d = uiData;
    }

    public static ux a(ux uxVar, ux uxVar2, uw destination, boolean z4, List uiData, int i4) {
        if ((i4 & 1) != 0) {
            uxVar2 = uxVar.f33438a;
        }
        if ((i4 & 2) != 0) {
            destination = uxVar.f33439b;
        }
        if ((i4 & 4) != 0) {
            z4 = uxVar.f33440c;
        }
        if ((i4 & 8) != 0) {
            uiData = uxVar.f33441d;
        }
        uxVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        return new ux(uxVar2, destination, z4, uiData);
    }

    @Nullable
    public final ux b() {
        return this.f33438a;
    }

    @NotNull
    public final List<wx> c() {
        return this.f33441d;
    }

    public final boolean d() {
        return this.f33440c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        return Intrinsics.areEqual(this.f33438a, uxVar.f33438a) && Intrinsics.areEqual(this.f33439b, uxVar.f33439b) && this.f33440c == uxVar.f33440c && Intrinsics.areEqual(this.f33441d, uxVar.f33441d);
    }

    public final int hashCode() {
        ux uxVar = this.f33438a;
        return this.f33441d.hashCode() + C1965h6.a(this.f33440c, (this.f33439b.hashCode() + ((uxVar == null ? 0 : uxVar.hashCode()) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.f33438a + ", destination=" + this.f33439b + ", isLoading=" + this.f33440c + ", uiData=" + this.f33441d + ")";
    }

    @NotNull
    public final uw a() {
        return this.f33439b;
    }
}
