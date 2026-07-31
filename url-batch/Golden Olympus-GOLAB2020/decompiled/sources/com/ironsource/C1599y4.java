package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1599y4 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f20370a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20371b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20372c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private String f20373d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends Object> f20374e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private com.ironsource.mediationsdk.h f20375f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f20376g;

    public C1599y4(@NotNull String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f20370a = name;
        this.f20371b = z4;
        this.f20373d = "";
        this.f20374e = MapsKt.emptyMap();
        this.f20376g = new HashMap();
    }

    public static /* synthetic */ C1599y4 a(C1599y4 c1599y4, String str, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c1599y4.f20370a;
        }
        if ((i4 & 2) != 0) {
            z4 = c1599y4.f20371b;
        }
        return c1599y4.a(str, z4);
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f20374e = map;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f20376g;
    }

    @Nullable
    public final com.ironsource.mediationsdk.h d() {
        return this.f20375f;
    }

    public final boolean e() {
        return this.f20371b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1599y4)) {
            return false;
        }
        C1599y4 c1599y4 = (C1599y4) obj;
        return Intrinsics.areEqual(this.f20370a, c1599y4.f20370a) && this.f20371b == c1599y4.f20371b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.f20374e;
    }

    @NotNull
    public final String g() {
        return this.f20370a;
    }

    @NotNull
    public final String h() {
        return this.f20373d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f20370a.hashCode() * 31;
        boolean z4 = this.f20371b;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final boolean i() {
        return this.f20372c;
    }

    @NotNull
    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f20370a + ", bidder=" + this.f20371b + ')';
    }

    @NotNull
    public final C1599y4 a(@NotNull String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C1599y4(name, z4);
    }

    public final boolean b() {
        return this.f20371b;
    }

    @NotNull
    public final String a() {
        return this.f20370a;
    }

    public final void a(@Nullable com.ironsource.mediationsdk.h hVar) {
        this.f20375f = hVar;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f20373d = str;
    }

    public final void a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f20376g = map;
    }

    public final void a(boolean z4) {
        this.f20372c = z4;
    }
}
