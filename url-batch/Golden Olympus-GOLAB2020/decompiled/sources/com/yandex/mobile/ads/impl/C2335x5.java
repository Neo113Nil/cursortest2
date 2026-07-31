package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2335x5 extends Throwable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2335x5(@NotNull String description) {
        super(description);
        Intrinsics.checkNotNullParameter(description, "description");
        this.f34435b = description;
    }

    @NotNull
    public final String a() {
        return this.f34435b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2335x5) && Intrinsics.areEqual(this.f34435b, ((C2335x5) obj).f34435b);
    }

    public final int hashCode() {
        return this.f34435b.hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        return "AdPresentationError(description=" + this.f34435b + ")";
    }
}
