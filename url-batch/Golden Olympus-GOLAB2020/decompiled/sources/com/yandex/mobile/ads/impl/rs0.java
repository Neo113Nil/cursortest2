package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rs0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f31346a;

    private final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final long f31347b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final hn f31348c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ rs0 f31349d;

        public a(rs0 rs0Var, long j4, @NotNull u21 periodicJob) {
            Intrinsics.checkNotNullParameter(periodicJob, "periodicJob");
            this.f31349d = rs0Var;
            this.f31347b = j4;
            this.f31348c = periodicJob;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f31348c.b()) {
                this.f31348c.run();
                this.f31349d.f31346a.postDelayed(this, this.f31347b);
            }
        }
    }

    public rs0(@NotNull Handler mainThreadHandler) {
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        this.f31346a = mainThreadHandler;
    }

    public final void a() {
        this.f31346a.removeCallbacksAndMessages(null);
    }

    public final void a(long j4, @NotNull u21 periodicJob) {
        Intrinsics.checkNotNullParameter(periodicJob, "periodicJob");
        if (periodicJob.b()) {
            this.f31346a.postDelayed(new a(this, j4, periodicJob), j4);
        }
    }
}
