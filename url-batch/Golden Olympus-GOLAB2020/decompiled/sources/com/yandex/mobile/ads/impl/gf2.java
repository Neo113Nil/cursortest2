package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gf2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ve2 f26124a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f26125b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private tl1 f26126c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26127d;

    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long c4 = gf2.this.f26124a.c();
            tl1 tl1Var = gf2.this.f26126c;
            if (tl1Var != null) {
                tl1Var.a(c4);
            }
            if (gf2.this.f26127d) {
                gf2.this.f26125b.postDelayed(this, 200L);
            }
        }
    }

    public gf2(@NotNull ve2 videoPlayerController, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f26124a = videoPlayerController;
        this.f26125b = handler;
    }

    public final void a(@Nullable tl1 tl1Var) {
        this.f26126c = tl1Var;
    }

    public final void b() {
        if (this.f26127d) {
            this.f26125b.removeCallbacksAndMessages(null);
            this.f26127d = false;
        }
    }

    public final void a() {
        if (this.f26127d) {
            return;
        }
        this.f26127d = true;
        this.f26125b.post(new a());
    }
}
