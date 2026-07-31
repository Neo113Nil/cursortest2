package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ah2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f23279a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23280b;

    public ah2(int i4, int i5) {
        this.f23279a = i4;
        this.f23280b = i5;
    }

    public final int a() {
        return this.f23280b;
    }

    public final int b() {
        return this.f23279a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah2)) {
            return false;
        }
        ah2 ah2Var = (ah2) obj;
        return this.f23279a == ah2Var.f23279a && this.f23280b == ah2Var.f23280b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23280b) + (Integer.hashCode(this.f23279a) * 31);
    }

    @NotNull
    public final String toString() {
        return "ViewSize(width=" + this.f23279a + ", height=" + this.f23280b + ")";
    }
}
