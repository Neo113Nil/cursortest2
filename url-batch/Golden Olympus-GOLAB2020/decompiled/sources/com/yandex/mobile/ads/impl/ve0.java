package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ve0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33590a;

    public ve0(boolean z4) {
        this.f33590a = z4;
    }

    public final boolean a() {
        return this.f33590a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve0) && this.f33590a == ((ve0) obj).f33590a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33590a);
    }

    @NotNull
    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.f33590a + ")";
    }
}
