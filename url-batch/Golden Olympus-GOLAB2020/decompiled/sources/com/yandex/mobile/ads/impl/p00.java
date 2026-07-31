package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p00 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30253a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30254b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f30255c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final List<ej0> f30256d;

    public p00(@NotNull String type, @NotNull String target, @NotNull String layout, @Nullable ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f30253a = type;
        this.f30254b = target;
        this.f30255c = layout;
        this.f30256d = arrayList;
    }

    @Nullable
    public final List<ej0> a() {
        return this.f30256d;
    }

    @NotNull
    public final String b() {
        return this.f30255c;
    }

    @NotNull
    public final String c() {
        return this.f30254b;
    }

    @NotNull
    public final String d() {
        return this.f30253a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p00)) {
            return false;
        }
        p00 p00Var = (p00) obj;
        return Intrinsics.areEqual(this.f30253a, p00Var.f30253a) && Intrinsics.areEqual(this.f30254b, p00Var.f30254b) && Intrinsics.areEqual(this.f30255c, p00Var.f30255c) && Intrinsics.areEqual(this.f30256d, p00Var.f30256d);
    }

    public final int hashCode() {
        int a4 = C1842c3.a(this.f30255c, C1842c3.a(this.f30254b, this.f30253a.hashCode() * 31, 31), 31);
        List<ej0> list = this.f30256d;
        return a4 + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        return "Design(type=" + this.f30253a + ", target=" + this.f30254b + ", layout=" + this.f30255c + ", images=" + this.f30256d + ")";
    }
}
