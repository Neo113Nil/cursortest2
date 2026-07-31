package com.ironsource;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1491j4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f16819a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1491j4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C1491j4 a(C1491j4 c1491j4, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            map = c1491j4.f16819a;
        }
        return c1491j4.a(map);
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f16819a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1491j4) && Intrinsics.areEqual(this.f16819a, ((C1491j4) obj).f16819a);
    }

    public int hashCode() {
        return this.f16819a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f16819a + ')';
    }

    public C1491j4(@NotNull Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.f16819a = mediationTypes;
    }

    @NotNull
    public final C1491j4 a(@NotNull Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new C1491j4(mediationTypes);
    }

    public /* synthetic */ C1491j4(Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f16819a;
    }
}
