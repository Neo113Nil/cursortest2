package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import okio.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class af0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final okio.h f23259d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final okio.h f23260e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final okio.h f23261f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final okio.h f23262g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final okio.h f23263h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final okio.h f23264i;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final okio.h f23265a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final okio.h f23266b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23267c;

    static {
        h.a aVar = okio.h.f43270e;
        f23259d = aVar.d(StringUtils.PROCESS_POSTFIX_DELIMITER);
        f23260e = aVar.d(":status");
        f23261f = aVar.d(":method");
        f23262g = aVar.d(":path");
        f23263h = aVar.d(":scheme");
        f23264i = aVar.d(":authority");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public af0(@NotNull String name, @NotNull String value) {
        this(r0.d(name), r0.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        h.a aVar = okio.h.f43270e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af0)) {
            return false;
        }
        af0 af0Var = (af0) obj;
        return Intrinsics.areEqual(this.f23265a, af0Var.f23265a) && Intrinsics.areEqual(this.f23266b, af0Var.f23266b);
    }

    public final int hashCode() {
        return this.f23266b.hashCode() + (this.f23265a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return this.f23265a.y() + ": " + this.f23266b.y();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public af0(@NotNull okio.h name, @NotNull String value) {
        this(name, okio.h.f43270e.d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public af0(@NotNull okio.h name, @NotNull okio.h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23265a = name;
        this.f23266b = value;
        this.f23267c = value.v() + name.v() + 32;
    }
}
