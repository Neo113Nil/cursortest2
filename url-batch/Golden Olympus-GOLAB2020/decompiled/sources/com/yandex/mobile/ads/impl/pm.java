package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pm {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final pp1 f30487a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final oq1 f30488b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final pp1 f30489a;

        public a(long j4, @NotNull pp1 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f30489a = request;
        }

        @NotNull
        public final pm a() {
            pm pmVar = new pm(this.f30489a, null);
            return (pmVar.b() == null || !this.f30489a.b().a()) ? pmVar : new pm(null, null);
        }
    }

    public pm(@Nullable pp1 pp1Var, @Nullable oq1 oq1Var) {
        this.f30487a = pp1Var;
        this.f30488b = oq1Var;
    }

    @Nullable
    public final oq1 a() {
        return this.f30488b;
    }

    @Nullable
    public final pp1 b() {
        return this.f30487a;
    }
}
