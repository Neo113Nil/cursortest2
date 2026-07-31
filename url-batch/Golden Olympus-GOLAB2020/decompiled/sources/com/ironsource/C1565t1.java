package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1565t1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC1532p1 f19681a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final LevelPlayAdInfo f19682b;

    public C1565t1(@NotNull AbstractC1532p1 adUnit, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f19681a = adUnit;
        this.f19682b = levelPlayAdInfo;
    }

    @NotNull
    public final AbstractC1532p1 a() {
        return this.f19681a;
    }

    @Nullable
    public final LevelPlayAdInfo b() {
        return this.f19682b;
    }

    @Nullable
    public final LevelPlayAdInfo c() {
        return this.f19682b;
    }

    @NotNull
    public final AbstractC1532p1 d() {
        return this.f19681a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1565t1)) {
            return false;
        }
        C1565t1 c1565t1 = (C1565t1) obj;
        return Intrinsics.areEqual(this.f19681a, c1565t1.f19681a) && Intrinsics.areEqual(this.f19682b, c1565t1.f19682b);
    }

    public int hashCode() {
        int hashCode = this.f19681a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f19682b;
        return hashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f19681a + ", adInfo=" + this.f19682b + ')';
    }

    public /* synthetic */ C1565t1(AbstractC1532p1 abstractC1532p1, LevelPlayAdInfo levelPlayAdInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC1532p1, (i4 & 2) != 0 ? null : levelPlayAdInfo);
    }

    @NotNull
    public final C1565t1 a(@NotNull AbstractC1532p1 adUnit, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C1565t1(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C1565t1 a(C1565t1 c1565t1, AbstractC1532p1 abstractC1532p1, LevelPlayAdInfo levelPlayAdInfo, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            abstractC1532p1 = c1565t1.f19681a;
        }
        if ((i4 & 2) != 0) {
            levelPlayAdInfo = c1565t1.f19682b;
        }
        return c1565t1.a(abstractC1532p1, levelPlayAdInfo);
    }
}
