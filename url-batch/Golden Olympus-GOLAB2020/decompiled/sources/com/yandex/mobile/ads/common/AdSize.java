package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdSize {

    /* renamed from: a, reason: collision with root package name */
    private final int f22424a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22425b;

    public AdSize(int i4, int i5) {
        this.f22424a = i4;
        this.f22425b = i5;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(AdSize.class, obj.getClass())) {
            AdSize adSize = (AdSize) obj;
            if (this.f22424a == adSize.f22424a && this.f22425b == adSize.f22425b) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.f22425b;
    }

    public final int getWidth() {
        return this.f22424a;
    }

    public int hashCode() {
        return (this.f22424a * 31) + this.f22425b;
    }

    @NotNull
    public String toString() {
        return "AdSize (width=" + this.f22424a + ", height=" + this.f22425b + ")";
    }
}
