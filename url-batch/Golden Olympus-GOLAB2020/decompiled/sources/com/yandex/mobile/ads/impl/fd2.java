package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fd2 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f25756c = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(fd2.class, "status", "getStatus()Lcom/monetization/ads/instream/status/VideoAdStatus;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<ed2> f25757a = kotlin.collections.T.f(ed2.f25238b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f25758b;

    public static final class a extends kotlin.properties.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ fd2 f25759a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(fd2 fd2Var) {
            super(r0);
            ed2 ed2Var = ed2.f25238b;
            this.f25759a = fd2Var;
        }

        @Override // kotlin.properties.b
        protected final void afterChange(@NotNull m2.h property, ed2 ed2Var, ed2 ed2Var2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f25759a.f25757a.add(ed2Var2);
        }
    }

    public fd2() {
        kotlin.properties.a aVar = kotlin.properties.a.f41165a;
        this.f25758b = new a(this);
    }

    public final void b() {
        this.f25757a.clear();
        ed2 ed2Var = ed2.f25238b;
        Intrinsics.checkNotNullParameter(ed2Var, "<set-?>");
        this.f25758b.setValue(this, f25756c[0], ed2Var);
    }

    @NotNull
    public final ed2 a() {
        return (ed2) this.f25758b.getValue(this, f25756c[0]);
    }

    public final boolean a(@NotNull ed2 videoAdStatus) {
        Intrinsics.checkNotNullParameter(videoAdStatus, "videoAdStatus");
        return this.f25757a.contains(videoAdStatus);
    }

    public final void b(@NotNull ed2 ed2Var) {
        Intrinsics.checkNotNullParameter(ed2Var, "<set-?>");
        this.f25758b.setValue(this, f25756c[0], ed2Var);
    }
}
