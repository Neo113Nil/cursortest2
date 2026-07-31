package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g51 implements InterfaceC2006j0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f26005a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private dt f26006b;

    public /* synthetic */ g51() {
        this(new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(g51 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dt dtVar = this$0.f26006b;
        if (dtVar != null) {
            dtVar.onAdClicked();
        }
        dt dtVar2 = this$0.f26006b;
        if (dtVar2 != null) {
            dtVar2.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(g51 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dt dtVar = this$0.f26006b;
        if (dtVar != null) {
            dtVar.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f26005a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.U2
            @Override // java.lang.Runnable
            public final void run() {
                g51.a(g51.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2006j0
    public final void onLeftApplication() {
        this.f26005a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.W2
            @Override // java.lang.Runnable
            public final void run() {
                g51.b(g51.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2006j0
    public final void onReturnedToApplication() {
        this.f26005a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.V2
            @Override // java.lang.Runnable
            public final void run() {
                g51.c(g51.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g51 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dt dtVar = this$0.f26006b;
        if (dtVar != null) {
            dtVar.closeNativeAd();
        }
    }

    public g51(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f26005a = handler;
    }

    public final void a(@Nullable final C1795a4 c1795a4) {
        this.f26005a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.T2
            @Override // java.lang.Runnable
            public final void run() {
                g51.a(g51.this, c1795a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(g51 this$0, C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dt dtVar = this$0.f26006b;
        if (dtVar != null) {
            dtVar.a(c1795a4);
        }
    }

    public final void a(@Nullable dt dtVar) {
        this.f26006b = dtVar;
    }
}
