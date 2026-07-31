package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class O3 implements InterfaceC2723j8 {

    /* renamed from: a, reason: collision with root package name */
    public final N3 f38046a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38047b;

    public O3(@NotNull N3 n32, @NotNull List<N3> list) {
        this.f38046a = n32;
        this.f38047b = list;
    }

    @NotNull
    public final O3 a(@NotNull N3 n32, @NotNull List<N3> list) {
        return new O3(n32, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2723j8
    public final Object b() {
        return this.f38046a;
    }

    @NotNull
    public final N3 c() {
        return this.f38046a;
    }

    @NotNull
    public final List<N3> d() {
        return this.f38047b;
    }

    @NotNull
    public final N3 e() {
        return this.f38046a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O3)) {
            return false;
        }
        O3 o32 = (O3) obj;
        return Intrinsics.areEqual(this.f38046a, o32.f38046a) && Intrinsics.areEqual(this.f38047b, o32.f38047b);
    }

    public final int hashCode() {
        return this.f38047b.hashCode() + (this.f38046a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ClidsInfo(chosen=" + this.f38046a + ", candidates=" + this.f38047b + ')';
    }

    public static O3 a(O3 o32, N3 n32, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            n32 = o32.f38046a;
        }
        if ((i4 & 2) != 0) {
            list = o32.f38047b;
        }
        o32.getClass();
        return new O3(n32, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2723j8
    @NotNull
    public final List<N3> a() {
        return this.f38047b;
    }
}
