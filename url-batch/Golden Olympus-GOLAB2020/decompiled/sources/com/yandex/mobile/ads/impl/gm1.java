package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gm1 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f26227c;

    /* renamed from: d, reason: collision with root package name */
    public static final gm1 f26228d;

    /* renamed from: e, reason: collision with root package name */
    public static final gm1 f26229e;

    /* renamed from: f, reason: collision with root package name */
    public static final gm1 f26230f;

    /* renamed from: g, reason: collision with root package name */
    public static final gm1 f26231g;

    /* renamed from: h, reason: collision with root package name */
    public static final gm1 f26232h;

    /* renamed from: i, reason: collision with root package name */
    public static final gm1 f26233i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ gm1[] f26234j;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26235b;

    public static final class a {
        private a() {
        }

        @NotNull
        public static gm1 a(@NotNull String protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            gm1 gm1Var = gm1.f26228d;
            if (Intrinsics.areEqual(protocol, gm1Var.f26235b)) {
                return gm1Var;
            }
            gm1 gm1Var2 = gm1.f26229e;
            if (Intrinsics.areEqual(protocol, gm1Var2.f26235b)) {
                return gm1Var2;
            }
            gm1 gm1Var3 = gm1.f26232h;
            if (Intrinsics.areEqual(protocol, gm1Var3.f26235b)) {
                return gm1Var3;
            }
            gm1 gm1Var4 = gm1.f26231g;
            if (Intrinsics.areEqual(protocol, gm1Var4.f26235b)) {
                return gm1Var4;
            }
            gm1 gm1Var5 = gm1.f26230f;
            if (Intrinsics.areEqual(protocol, gm1Var5.f26235b)) {
                return gm1Var5;
            }
            gm1 gm1Var6 = gm1.f26233i;
            if (Intrinsics.areEqual(protocol, gm1Var6.f26235b)) {
                return gm1Var6;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        public /* synthetic */ a(int i4) {
            this();
        }
    }

    static {
        gm1 gm1Var = new gm1(0, "HTTP_1_0", "http/1.0");
        f26228d = gm1Var;
        gm1 gm1Var2 = new gm1(1, "HTTP_1_1", "http/1.1");
        f26229e = gm1Var2;
        gm1 gm1Var3 = new gm1(2, "SPDY_3", "spdy/3.1");
        f26230f = gm1Var3;
        gm1 gm1Var4 = new gm1(3, "HTTP_2", "h2");
        f26231g = gm1Var4;
        gm1 gm1Var5 = new gm1(4, "H2_PRIOR_KNOWLEDGE", "h2_prior_knowledge");
        f26232h = gm1Var5;
        gm1 gm1Var6 = new gm1(5, "QUIC", "quic");
        f26233i = gm1Var6;
        gm1[] gm1VarArr = {gm1Var, gm1Var2, gm1Var3, gm1Var4, gm1Var5, gm1Var6};
        f26234j = gm1VarArr;
        AbstractC1372b.a(gm1VarArr);
        f26227c = new a(0);
    }

    private gm1(int i4, String str, String str2) {
        this.f26235b = str2;
    }

    public static gm1 valueOf(String str) {
        return (gm1) Enum.valueOf(gm1.class, str);
    }

    public static gm1[] values() {
        return (gm1[]) f26234j.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return this.f26235b;
    }
}
