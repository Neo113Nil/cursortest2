package com.ironsource;

import com.ironsource.C1539q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1480i0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C1539q1.a f16649a;

    public C1480i0(@NotNull C1539q1.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f16649a = performance;
    }

    public static /* synthetic */ C1480i0 a(C1480i0 c1480i0, C1539q1.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = c1480i0.f16649a;
        }
        return c1480i0.a(aVar);
    }

    @NotNull
    public final C1539q1.a b() {
        return this.f16649a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1480i0) && this.f16649a == ((C1480i0) obj).f16649a;
    }

    public int hashCode() {
        return this.f16649a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdInstancePerformance(performance=" + this.f16649a + ')';
    }

    @NotNull
    public final C1480i0 a(@NotNull C1539q1.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new C1480i0(performance);
    }

    public final void b(@NotNull C1539q1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f16649a = aVar;
    }

    @NotNull
    public final C1539q1.a a() {
        return this.f16649a;
    }
}
