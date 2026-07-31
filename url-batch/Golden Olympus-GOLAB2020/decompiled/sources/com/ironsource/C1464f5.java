package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1464f5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16214a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16215b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16216c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private String f16217d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends Object> f16218e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private com.ironsource.mediationsdk.h f16219f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f16220g;

    public C1464f5(@NotNull String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f16214a = name;
        this.f16215b = z4;
        this.f16217d = "";
        this.f16218e = MapsKt.emptyMap();
        this.f16220g = new HashMap();
    }

    public static /* synthetic */ C1464f5 a(C1464f5 c1464f5, String str, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c1464f5.f16214a;
        }
        if ((i4 & 2) != 0) {
            z4 = c1464f5.f16215b;
        }
        return c1464f5.a(str, z4);
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f16218e = map;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f16220g;
    }

    @Nullable
    public final com.ironsource.mediationsdk.h d() {
        return this.f16219f;
    }

    public final boolean e() {
        return this.f16215b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1464f5)) {
            return false;
        }
        C1464f5 c1464f5 = (C1464f5) obj;
        return Intrinsics.areEqual(this.f16214a, c1464f5.f16214a) && this.f16215b == c1464f5.f16215b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.f16218e;
    }

    @NotNull
    public final String g() {
        return this.f16214a;
    }

    @NotNull
    public final String h() {
        return this.f16217d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f16214a.hashCode() * 31;
        boolean z4 = this.f16215b;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final boolean i() {
        return this.f16216c;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f16214a + ", bidder=" + this.f16215b + ')';
    }

    @NotNull
    public final C1464f5 a(@NotNull String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C1464f5(name, z4);
    }

    public final boolean b() {
        return this.f16215b;
    }

    @NotNull
    public final String a() {
        return this.f16214a;
    }

    public final void a(@Nullable com.ironsource.mediationsdk.h hVar) {
        this.f16219f = hVar;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f16217d = str;
    }

    public final void a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f16220g = map;
    }

    public final void a(boolean z4) {
        this.f16216c = z4;
    }
}
