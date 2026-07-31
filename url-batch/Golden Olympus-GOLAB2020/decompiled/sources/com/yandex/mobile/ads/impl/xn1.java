package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xn1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tn1 f34638a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<uo0> f34639b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34640c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final r50 f34641d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final pp1 f34642e;

    /* renamed from: f, reason: collision with root package name */
    private final int f34643f;

    /* renamed from: g, reason: collision with root package name */
    private final int f34644g;

    /* renamed from: h, reason: collision with root package name */
    private final int f34645h;

    /* renamed from: i, reason: collision with root package name */
    private int f34646i;

    /* JADX WARN: Multi-variable type inference failed */
    public xn1(@NotNull tn1 call, @NotNull List<? extends uo0> interceptors, int i4, @Nullable r50 r50Var, @NotNull pp1 request, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f34638a = call;
        this.f34639b = interceptors;
        this.f34640c = i4;
        this.f34641d = r50Var;
        this.f34642e = request;
        this.f34643f = i5;
        this.f34644g = i6;
        this.f34645h = i7;
    }

    @NotNull
    public final tn1 a() {
        return this.f34638a;
    }

    @NotNull
    public final tn1 b() {
        return this.f34638a;
    }

    public final int c() {
        return this.f34643f;
    }

    @Nullable
    public final r50 d() {
        return this.f34641d;
    }

    public final int e() {
        return this.f34644g;
    }

    @NotNull
    public final pp1 f() {
        return this.f34642e;
    }

    public final int g() {
        return this.f34645h;
    }

    public final int h() {
        return this.f34644g;
    }

    @NotNull
    public final pp1 i() {
        return this.f34642e;
    }

    public static xn1 a(xn1 xn1Var, int i4, r50 r50Var, pp1 pp1Var, int i5) {
        if ((i5 & 1) != 0) {
            i4 = xn1Var.f34640c;
        }
        int i6 = i4;
        if ((i5 & 2) != 0) {
            r50Var = xn1Var.f34641d;
        }
        r50 r50Var2 = r50Var;
        if ((i5 & 4) != 0) {
            pp1Var = xn1Var.f34642e;
        }
        pp1 request = pp1Var;
        int i7 = xn1Var.f34643f;
        int i8 = xn1Var.f34644g;
        int i9 = xn1Var.f34645h;
        Intrinsics.checkNotNullParameter(request, "request");
        return new xn1(xn1Var.f34638a, xn1Var.f34639b, i6, r50Var2, request, i7, i8, i9);
    }

    @NotNull
    public final oq1 a(@NotNull pp1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f34640c < this.f34639b.size()) {
            this.f34646i++;
            r50 r50Var = this.f34641d;
            if (r50Var != null) {
                if (r50Var.h().a(request.g())) {
                    if (this.f34646i != 1) {
                        throw new IllegalStateException(("network interceptor " + this.f34639b.get(this.f34640c - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.f34639b.get(this.f34640c - 1) + " must retain the same host and port").toString());
                }
            }
            xn1 a4 = a(this, this.f34640c + 1, null, request, 58);
            uo0 uo0Var = this.f34639b.get(this.f34640c);
            oq1 a5 = uo0Var.a(a4);
            if (a5 != null) {
                if (this.f34641d != null && this.f34640c + 1 < this.f34639b.size() && a4.f34646i != 1) {
                    throw new IllegalStateException(("network interceptor " + uo0Var + " must call proceed() exactly once").toString());
                }
                if (a5.a() != null) {
                    return a5;
                }
                throw new IllegalStateException(("interceptor " + uo0Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + uo0Var + " returned null");
        }
        throw new IllegalStateException("Check failed.");
    }
}
