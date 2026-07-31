package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hn0 implements ao0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f26832a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private al0 f26833b;

    public /* synthetic */ hn0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hn0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        al0 al0Var = this$0.f26833b;
        if (al0Var != null) {
            al0Var.onInstreamAdPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(hn0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        al0 al0Var = this$0.f26833b;
        if (al0Var != null) {
            al0Var.onInstreamAdCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ao0
    public final void onInstreamAdPrepared() {
        this.f26832a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.N6
            @Override // java.lang.Runnable
            public final void run() {
                hn0.a(hn0.this);
            }
        });
    }

    public hn0(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f26832a = handler;
    }

    @Override // com.yandex.mobile.ads.impl.ao0
    public final void a() {
        this.f26832a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.M6
            @Override // java.lang.Runnable
            public final void run() {
                hn0.b(hn0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ao0
    public final void b() {
        final String str = "Video player returned error";
        Intrinsics.checkNotNullParameter("Video player returned error", "reason");
        this.f26832a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.O6
            @Override // java.lang.Runnable
            public final void run() {
                hn0.a(hn0.this, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(hn0 this$0, String reason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reason, "$reason");
        al0 al0Var = this$0.f26833b;
        if (al0Var != null) {
            al0Var.onError(reason);
        }
    }

    public final void a(@Nullable vl2 vl2Var) {
        this.f26833b = vl2Var;
    }
}
