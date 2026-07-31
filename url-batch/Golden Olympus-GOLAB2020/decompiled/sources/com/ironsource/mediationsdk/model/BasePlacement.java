package com.ironsource.mediationsdk.model;

import com.ironsource.mp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class BasePlacement {

    /* renamed from: a, reason: collision with root package name */
    private final int f17689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f17690b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17691c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final mp f17692d;

    public BasePlacement(int i4, @NotNull String placementName, boolean z4, @Nullable mp mpVar) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f17689a = i4;
        this.f17690b = placementName;
        this.f17691c = z4;
        this.f17692d = mpVar;
    }

    @Nullable
    public final mp getPlacementAvailabilitySettings() {
        return this.f17692d;
    }

    public final int getPlacementId() {
        return this.f17689a;
    }

    @NotNull
    public final String getPlacementName() {
        return this.f17690b;
    }

    public final boolean isDefault() {
        return this.f17691c;
    }

    public final boolean isPlacementId(int i4) {
        return this.f17689a == i4;
    }

    @NotNull
    public String toString() {
        return "placement name: " + this.f17690b;
    }

    public /* synthetic */ BasePlacement(int i4, String str, boolean z4, mp mpVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i4, str, (i5 & 4) != 0 ? false : z4, (i5 & 8) != 0 ? null : mpVar);
    }
}
