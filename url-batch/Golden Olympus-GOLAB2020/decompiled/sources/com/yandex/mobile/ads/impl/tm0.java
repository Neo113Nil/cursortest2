package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tm0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32496a;

    /* renamed from: b, reason: collision with root package name */
    private final float f32497b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32498c;

    /* renamed from: d, reason: collision with root package name */
    private final float f32499d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32500a;

        /* renamed from: b, reason: collision with root package name */
        private float f32501b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f32502c;

        /* renamed from: d, reason: collision with root package name */
        private float f32503d;

        @NotNull
        public final a a(float f4) {
            this.f32501b = f4;
            return this;
        }

        public final float b() {
            return this.f32501b;
        }

        public final float c() {
            return this.f32503d;
        }

        public final boolean d() {
            return this.f32502c;
        }

        public final boolean e() {
            return this.f32500a;
        }

        @NotNull
        public final void a(boolean z4) {
            this.f32502c = z4;
        }

        @NotNull
        public final void b(float f4) {
            this.f32503d = f4;
        }

        @NotNull
        public final tm0 a() {
            return new tm0(this);
        }

        @NotNull
        public final a b(boolean z4) {
            this.f32500a = z4;
            return this;
        }
    }

    /* synthetic */ tm0(a aVar) {
        this(aVar.e(), aVar.b(), aVar.d(), aVar.c());
    }

    public final float a() {
        return this.f32497b;
    }

    public final float b() {
        return this.f32499d;
    }

    public final boolean c() {
        return this.f32498c;
    }

    public final boolean d() {
        return this.f32496a;
    }

    private tm0(boolean z4, float f4, boolean z5, float f5) {
        this.f32496a = z4;
        this.f32497b = f4;
        this.f32498c = z5;
        this.f32499d = f5;
    }
}
