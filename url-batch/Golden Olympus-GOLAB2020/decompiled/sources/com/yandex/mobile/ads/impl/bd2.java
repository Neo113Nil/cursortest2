package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jf2 f23712a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f23713b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f23714c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23715d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23716e;

    public interface a {
        void a();
    }

    private final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (bd2.this.f23715d || !bd2.this.f23712a.a()) {
                bd2.this.f23714c.postDelayed(this, 200L);
                return;
            }
            bd2.this.f23713b.a();
            bd2.this.f23715d = true;
            bd2.this.b();
        }
    }

    public bd2(@NotNull jf2 renderValidator, @NotNull a renderingStartListener) {
        Intrinsics.checkNotNullParameter(renderValidator, "renderValidator");
        Intrinsics.checkNotNullParameter(renderingStartListener, "renderingStartListener");
        this.f23712a = renderValidator;
        this.f23713b = renderingStartListener;
        this.f23714c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.f23716e || this.f23715d) {
            return;
        }
        this.f23716e = true;
        this.f23714c.post(new b());
    }

    public final void b() {
        this.f23714c.removeCallbacksAndMessages(null);
        this.f23716e = false;
    }
}
