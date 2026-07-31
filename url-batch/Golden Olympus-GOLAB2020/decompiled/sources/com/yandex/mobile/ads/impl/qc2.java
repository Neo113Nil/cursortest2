package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fd2 f30728a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f30729b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f30730c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30731d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30732e;

    public interface a {
        void b();
    }

    private final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (qc2.this.f30731d || !qc2.this.f30728a.a(ed2.f25240d)) {
                qc2.this.f30730c.postDelayed(this, 200L);
                return;
            }
            qc2.this.f30729b.b();
            qc2.this.f30731d = true;
            qc2.this.b();
        }
    }

    public qc2(@NotNull fd2 statusController, @NotNull a preparedListener) {
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(preparedListener, "preparedListener");
        this.f30728a = statusController;
        this.f30729b = preparedListener;
        this.f30730c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.f30732e || this.f30731d) {
            return;
        }
        this.f30732e = true;
        this.f30730c.post(new b());
    }

    public final void b() {
        this.f30730c.removeCallbacksAndMessages(null);
        this.f30732e = false;
    }
}
