package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f15829a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f15830b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f15831c;

    public d8(@NotNull String cachedAppKey, @NotNull String cachedUserId, @NotNull String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.f15829a = cachedAppKey;
        this.f15830b = cachedUserId;
        this.f15831c = cachedSettings;
    }

    public static /* synthetic */ d8 a(d8 d8Var, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = d8Var.f15829a;
        }
        if ((i4 & 2) != 0) {
            str2 = d8Var.f15830b;
        }
        if ((i4 & 4) != 0) {
            str3 = d8Var.f15831c;
        }
        return d8Var.a(str, str2, str3);
    }

    @NotNull
    public final String b() {
        return this.f15830b;
    }

    @NotNull
    public final String c() {
        return this.f15831c;
    }

    @NotNull
    public final String d() {
        return this.f15829a;
    }

    @NotNull
    public final String e() {
        return this.f15831c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return Intrinsics.areEqual(this.f15829a, d8Var.f15829a) && Intrinsics.areEqual(this.f15830b, d8Var.f15830b) && Intrinsics.areEqual(this.f15831c, d8Var.f15831c);
    }

    @NotNull
    public final String f() {
        return this.f15830b;
    }

    public int hashCode() {
        return (((this.f15829a.hashCode() * 31) + this.f15830b.hashCode()) * 31) + this.f15831c.hashCode();
    }

    @NotNull
    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f15829a + ", cachedUserId=" + this.f15830b + ", cachedSettings=" + this.f15831c + ')';
    }

    @NotNull
    public final d8 a(@NotNull String cachedAppKey, @NotNull String cachedUserId, @NotNull String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new d8(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15831c = str;
    }

    public final void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15830b = str;
    }

    @NotNull
    public final String a() {
        return this.f15829a;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f15829a = str;
    }
}
