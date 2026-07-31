package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yf1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kg0 f35095a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f35096b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sy1 f35097c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final RunnableC1822b7 f35098d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35099e;

    public yf1(@NotNull kg0 htmlWebViewRenderer, @NotNull Handler handler, @NotNull sy1 singleTimeRunner, @NotNull RunnableC1822b7 adRenderWaitBreaker) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(singleTimeRunner, "singleTimeRunner");
        Intrinsics.checkNotNullParameter(adRenderWaitBreaker, "adRenderWaitBreaker");
        this.f35095a = htmlWebViewRenderer;
        this.f35096b = handler;
        this.f35097c = singleTimeRunner;
        this.f35098d = adRenderWaitBreaker;
    }

    public final void a() {
        this.f35096b.removeCallbacksAndMessages(null);
        this.f35098d.a(null);
    }

    public final void b() {
        if (this.f35099e) {
            return;
        }
        this.f35097c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ul
            @Override // java.lang.Runnable
            public final void run() {
                yf1.a(yf1.this);
            }
        });
    }

    public final void a(int i4, @Nullable String str) {
        this.f35099e = true;
        this.f35096b.removeCallbacks(this.f35098d);
        this.f35096b.post(new mj2(i4, str, this.f35095a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(yf1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ap0.d(new Object[0]);
        this$0.f35096b.postDelayed(this$0.f35098d, 10000L);
    }

    public final void a(@Nullable jg0 jg0Var) {
        this.f35098d.a(jg0Var);
    }
}
