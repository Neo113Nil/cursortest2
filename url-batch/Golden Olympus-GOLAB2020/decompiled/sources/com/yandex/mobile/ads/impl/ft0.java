package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ft0 implements ws0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f25920a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private ws0 f25921b;

    public /* synthetic */ ft0() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ft0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ws0 ws0Var = this$0.f25921b;
        if (ws0Var != null) {
            ws0Var.onInstreamAdBreakCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ft0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ws0 ws0Var = this$0.f25921b;
        if (ws0Var != null) {
            ws0Var.onInstreamAdBreakPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ft0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ws0 ws0Var = this$0.f25921b;
        if (ws0Var != null) {
            ws0Var.onInstreamAdBreakStarted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws0
    public final void onInstreamAdBreakCompleted() {
        this.f25920a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.M2
            @Override // java.lang.Runnable
            public final void run() {
                ft0.a(ft0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ws0
    public final void onInstreamAdBreakError(@NotNull final String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f25920a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.N2
            @Override // java.lang.Runnable
            public final void run() {
                ft0.a(ft0.this, reason);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ws0
    public final void onInstreamAdBreakPrepared() {
        this.f25920a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.P2
            @Override // java.lang.Runnable
            public final void run() {
                ft0.b(ft0.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.ws0
    public final void onInstreamAdBreakStarted() {
        this.f25920a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.O2
            @Override // java.lang.Runnable
            public final void run() {
                ft0.c(ft0.this);
            }
        });
    }

    public ft0(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f25920a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ft0 this$0, String reason) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reason, "$reason");
        ws0 ws0Var = this$0.f25921b;
        if (ws0Var != null) {
            ws0Var.onInstreamAdBreakError(reason);
        }
    }

    public final void a(@Nullable sl2 sl2Var) {
        this.f25921b = sl2Var;
    }
}
