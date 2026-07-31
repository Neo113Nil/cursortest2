package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class M5 implements InterfaceC2806md {

    /* renamed from: a, reason: collision with root package name */
    public final String f37968a;

    public M5(@NotNull String str) {
        this.f37968a = str;
    }

    @NotNull
    public final M5 a(@NotNull String str) {
        return new M5(str);
    }

    @NotNull
    public final String b() {
        return this.f37968a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M5) && Intrinsics.areEqual(this.f37968a, ((M5) obj).f37968a);
    }

    public final int hashCode() {
        return this.f37968a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f37968a + ')';
    }

    public static M5 a(M5 m5, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = m5.f37968a;
        }
        m5.getClass();
        return new M5(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2806md
    @NotNull
    public final String a() {
        return this.f37968a;
    }
}
