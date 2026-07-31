package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wa2 implements Comparable<wa2> {

    /* renamed from: b, reason: collision with root package name */
    private final int f33982b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33983c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33984d;

    public wa2(int i4, int i5, int i6) {
        this.f33982b = i4;
        this.f33983c = i5;
        this.f33984d = i6;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull wa2 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i4 = this.f33982b;
        int i5 = other.f33982b;
        if (i4 != i5) {
            return Intrinsics.compare(i4, i5);
        }
        int i6 = this.f33983c;
        int i7 = other.f33983c;
        return i6 != i7 ? Intrinsics.compare(i6, i7) : Intrinsics.compare(this.f33984d, other.f33984d);
    }

    public final int a() {
        return this.f33982b;
    }
}
