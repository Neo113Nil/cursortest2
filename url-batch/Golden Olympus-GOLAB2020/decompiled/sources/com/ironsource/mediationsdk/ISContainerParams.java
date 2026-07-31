package com.ironsource.mediationsdk;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ISContainerParams {

    /* renamed from: a, reason: collision with root package name */
    private final int f17245a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17246b;

    public ISContainerParams(int i4, int i5) {
        this.f17245a = i4;
        this.f17246b = i5;
    }

    public static /* synthetic */ ISContainerParams copy$default(ISContainerParams iSContainerParams, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = iSContainerParams.f17245a;
        }
        if ((i6 & 2) != 0) {
            i5 = iSContainerParams.f17246b;
        }
        return iSContainerParams.copy(i4, i5);
    }

    public final int component1() {
        return this.f17245a;
    }

    public final int component2() {
        return this.f17246b;
    }

    @NotNull
    public final ISContainerParams copy(int i4, int i5) {
        return new ISContainerParams(i4, i5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ISContainerParams)) {
            return false;
        }
        ISContainerParams iSContainerParams = (ISContainerParams) obj;
        return this.f17245a == iSContainerParams.f17245a && this.f17246b == iSContainerParams.f17246b;
    }

    public final int getHeight() {
        return this.f17246b;
    }

    public final int getWidth() {
        return this.f17245a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f17245a) * 31) + Integer.hashCode(this.f17246b);
    }

    @NotNull
    public String toString() {
        return "ISContainerParams(width=" + this.f17245a + ", height=" + this.f17246b + ')';
    }
}
