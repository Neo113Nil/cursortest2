package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class N3 implements InterfaceC2801m8 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f37991a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC2775l8 f37992b;

    public N3(@Nullable Map<String, String> map, @NotNull EnumC2775l8 enumC2775l8) {
        this.f37991a = map;
        this.f37992b = enumC2775l8;
    }

    @NotNull
    public final N3 a(@Nullable Map<String, String> map, @NotNull EnumC2775l8 enumC2775l8) {
        return new N3(map, enumC2775l8);
    }

    @Nullable
    public final Map<String, String> b() {
        return this.f37991a;
    }

    @NotNull
    public final EnumC2775l8 c() {
        return this.f37992b;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.f37991a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N3)) {
            return false;
        }
        N3 n32 = (N3) obj;
        return Intrinsics.areEqual(this.f37991a, n32.f37991a) && this.f37992b == n32.f37992b;
    }

    public final int hashCode() {
        Map map = this.f37991a;
        return this.f37992b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Candidate(clids=" + this.f37991a + ", source=" + this.f37992b + ')';
    }

    public static N3 a(N3 n32, Map map, EnumC2775l8 enumC2775l8, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            map = n32.f37991a;
        }
        if ((i4 & 2) != 0) {
            enumC2775l8 = n32.f37992b;
        }
        n32.getClass();
        return new N3(map, enumC2775l8);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2801m8
    @NotNull
    public final EnumC2775l8 a() {
        return this.f37992b;
    }
}
