package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lc2<?> f33576a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sc2 f33577b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f33578c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33579d;

    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long adPosition = vc2.this.f33576a.getAdPosition();
            vc2.this.f33577b.a(vc2.this.f33576a.b(), adPosition);
            if (vc2.this.f33579d) {
                vc2.this.f33578c.postDelayed(this, 200L);
            }
        }
    }

    public /* synthetic */ vc2(lc2 lc2Var, sc2 sc2Var) {
        this(lc2Var, sc2Var, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        if (this.f33579d) {
            return;
        }
        this.f33579d = true;
        this.f33577b.a();
        this.f33578c.post(new a());
    }

    public final void b() {
        if (this.f33579d) {
            this.f33577b.b();
            this.f33578c.removeCallbacksAndMessages(null);
            this.f33579d = false;
        }
    }

    public vc2(@NotNull lc2<?> videoAdPlayer, @NotNull sc2 videoAdProgressEventsObservable, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdProgressEventsObservable, "videoAdProgressEventsObservable");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f33576a = videoAdPlayer;
        this.f33577b = videoAdProgressEventsObservable;
        this.f33578c = handler;
    }
}
