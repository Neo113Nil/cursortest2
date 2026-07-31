package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import b2.AbstractC1372b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
final class fg1 implements eg1 {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25782b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f25783c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private b f25784d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private gg1 f25785e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private b52 f25786f;

    /* renamed from: g, reason: collision with root package name */
    private long f25787g;

    /* renamed from: h, reason: collision with root package name */
    private long f25788h;

    /* renamed from: i, reason: collision with root package name */
    private long f25789i;

    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            fg1.b(fg1.this);
            fg1.this.a();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f25791b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f25792c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f25793d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f25794e;

        static {
            b bVar = new b(0, "INVALIDATED");
            f25791b = bVar;
            b bVar2 = new b(1, "ACTIVE");
            f25792c = bVar2;
            b bVar3 = new b(2, "PAUSED");
            f25793d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f25794e = bVarArr;
            AbstractC1372b.a(bVarArr);
        }

        private b(int i4, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25794e.clone();
        }
    }

    public fg1(boolean z4, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f25782b = z4;
        this.f25783c = handler;
        this.f25784d = b.f25791b;
    }

    public static final void b(fg1 fg1Var) {
        fg1Var.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = elapsedRealtime - fg1Var.f25789i;
        fg1Var.f25789i = elapsedRealtime;
        long j5 = fg1Var.f25787g - j4;
        fg1Var.f25787g = j5;
        long max = (long) Math.max(0.0d, j5);
        b52 b52Var = fg1Var.f25786f;
        if (b52Var != null) {
            b52Var.a(max, fg1Var.f25788h - max);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(fg1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void invalidate() {
        b bVar = b.f25791b;
        if (bVar == this.f25784d) {
            return;
        }
        this.f25784d = bVar;
        this.f25785e = null;
        this.f25783c.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void pause() {
        if (b.f25792c == this.f25784d) {
            this.f25784d = b.f25793d;
            this.f25783c.removeCallbacksAndMessages(null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime - this.f25789i;
            this.f25789i = elapsedRealtime;
            long j5 = this.f25787g - j4;
            this.f25787g = j5;
            long max = (long) Math.max(0.0d, j5);
            b52 b52Var = this.f25786f;
            if (b52Var != null) {
                b52Var.a(max, this.f25788h - max);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void resume() {
        if (b.f25793d == this.f25784d) {
            a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void stop() {
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this.f25784d = b.f25792c;
        this.f25789i = SystemClock.elapsedRealtime();
        long min = (long) Math.min(200.0d, this.f25787g);
        if (min > 0) {
            this.f25783c.postDelayed(new a(), min);
            return;
        }
        gg1 gg1Var = this.f25785e;
        if (gg1Var != null) {
            gg1Var.a();
        }
        invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(@Nullable b52 b52Var) {
        this.f25786f = b52Var;
    }

    @Override // com.yandex.mobile.ads.impl.eg1
    public final void a(long j4, @Nullable gg1 gg1Var) {
        invalidate();
        this.f25785e = gg1Var;
        this.f25787g = j4;
        this.f25788h = j4;
        if (this.f25782b) {
            this.f25783c.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.K2
                @Override // java.lang.Runnable
                public final void run() {
                    fg1.c(fg1.this);
                }
            });
        } else {
            a();
        }
    }
}
