package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2157pa {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f30374a;

    public C2157pa() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2157pa) && Intrinsics.areEqual(this.f30374a, ((C2157pa) obj).f30374a);
    }

    public final int hashCode() {
        String str = this.f30374a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AdditionalInfo(skuId=" + this.f30374a + ")";
    }

    public /* synthetic */ C2157pa(int i4) {
        this((String) null);
    }

    public C2157pa(@Nullable String str) {
        this.f30374a = str;
    }
}
