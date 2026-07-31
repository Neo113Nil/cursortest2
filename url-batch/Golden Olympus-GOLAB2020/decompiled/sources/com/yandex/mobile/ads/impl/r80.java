package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r80 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ps0 f31072a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f31073b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f31074c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f31075d;

    public static final class a implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q80 f31077c;

        a(q80 q80Var) {
            this.f31077c = q80Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedHashMap linkedHashMap = r80.this.f31074c;
            q80 q80Var = this.f31077c;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                View view = (View) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (lh2.a(view) >= 1) {
                    q80Var.a(intValue);
                }
            }
            r80.this.f31073b.postDelayed(this, 200L);
        }
    }

    public /* synthetic */ r80() {
        this(new ps0(), new Handler(Looper.getMainLooper()));
    }

    public final void a(@NotNull View feedAdView, int i4) {
        Intrinsics.checkNotNullParameter(feedAdView, "feedAdView");
        this.f31074c.put(feedAdView, Integer.valueOf(i4));
    }

    public r80(@NotNull ps0 mainThreadExecutor, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f31072a = mainThreadExecutor;
        this.f31073b = handler;
        this.f31074c = new LinkedHashMap();
    }

    public final void a(@NotNull View feedAdView) {
        Intrinsics.checkNotNullParameter(feedAdView, "feedAdView");
        this.f31074c.remove(feedAdView);
    }

    public final void a(@NotNull q80 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f31075d) {
            return;
        }
        this.f31075d = true;
        this.f31072a.a(new a(listener));
    }

    public final void a() {
        this.f31074c.clear();
        this.f31073b.removeCallbacksAndMessages(null);
        this.f31075d = false;
    }
}
