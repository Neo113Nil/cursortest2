package com.yandex.mobile.ads.impl;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2353y0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f34740a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f34741b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final av1 f34742c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final f61 f34743d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34744e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C1871d8 f34745f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final Intent f34746g;

    /* renamed from: com.yandex.mobile.ads.impl.y0$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2360y7<?> f34747a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C2286v2 f34748b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C1871d8 f34749c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private av1 f34750d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        private f61 f34751e;

        /* renamed from: f, reason: collision with root package name */
        private int f34752f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private Intent f34753g;

        public a(@NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @NotNull C1871d8 adResultReceiver) {
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
            Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
            this.f34747a = adResponse;
            this.f34748b = adConfiguration;
            this.f34749c = adResultReceiver;
        }

        @Nullable
        public final Intent a() {
            return this.f34753g;
        }

        @NotNull
        public final C2286v2 b() {
            return this.f34748b;
        }

        @NotNull
        public final C2360y7<?> c() {
            return this.f34747a;
        }

        @NotNull
        public final C1871d8 d() {
            return this.f34749c;
        }

        @Nullable
        public final f61 e() {
            return this.f34751e;
        }

        public final int f() {
            return this.f34752f;
        }

        @Nullable
        public final av1 g() {
            return this.f34750d;
        }

        @NotNull
        public final a a(@NotNull Intent activityResultIntent) {
            Intrinsics.checkNotNullParameter(activityResultIntent, "activityResultIntent");
            this.f34753g = activityResultIntent;
            return this;
        }

        @NotNull
        public final a a(@NotNull f61 nativeAd) {
            Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
            this.f34751e = nativeAd;
            return this;
        }

        @NotNull
        public final a a(int i4) {
            this.f34752f = i4;
            return this;
        }

        @NotNull
        public final a a(@NotNull av1 contentController) {
            Intrinsics.checkNotNullParameter(contentController, "contentController");
            this.f34750d = contentController;
            return this;
        }
    }

    public C2353y0(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f34740a = builder.c();
        this.f34741b = builder.b();
        this.f34742c = builder.g();
        this.f34743d = builder.e();
        this.f34744e = builder.f();
        this.f34745f = builder.d();
        this.f34746g = builder.a();
    }

    @Nullable
    public final Intent a() {
        return this.f34746g;
    }

    @NotNull
    public final C2286v2 b() {
        return this.f34741b;
    }

    @NotNull
    public final C2360y7<?> c() {
        return this.f34740a;
    }

    @NotNull
    public final C1871d8 d() {
        return this.f34745f;
    }

    @Nullable
    public final f61 e() {
        return this.f34743d;
    }

    public final int f() {
        return this.f34744e;
    }

    @Nullable
    public final av1 g() {
        return this.f34742c;
    }
}
