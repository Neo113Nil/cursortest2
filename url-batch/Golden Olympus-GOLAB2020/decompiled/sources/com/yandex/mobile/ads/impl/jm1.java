package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jm1 implements cd0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final bd0 f27729a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f27730b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private is f27731c;

    public /* synthetic */ jm1(bd0 bd0Var) {
        this(bd0Var, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(jm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        is isVar = this$0.f27731c;
        if (isVar != null) {
            isVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(jm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        is isVar = this$0.f27731c;
        if (isVar != null) {
            isVar.onAdDismissed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(jm1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        is isVar = this$0.f27731c;
        if (isVar != null) {
            isVar.onAdShown();
        }
        bd0 bd0Var = this$0.f27729a;
        if (bd0Var != null) {
            bd0Var.onAdShown();
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdClicked() {
        this.f27730b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.F8
            @Override // java.lang.Runnable
            public final void run() {
                jm1.a(jm1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdDismissed() {
        this.f27730b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.D8
            @Override // java.lang.Runnable
            public final void run() {
                jm1.b(jm1.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void onAdShown() {
        this.f27730b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.C8
            @Override // java.lang.Runnable
            public final void run() {
                jm1.c(jm1.this);
            }
        });
    }

    public jm1(@Nullable bd0 bd0Var, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f27729a = bd0Var;
        this.f27730b = handler;
    }

    public final void a(@NotNull final C2335x5 adPresentationError) {
        Intrinsics.checkNotNullParameter(adPresentationError, "adPresentationError");
        this.f27730b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.E8
            @Override // java.lang.Runnable
            public final void run() {
                jm1.a(C2335x5.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2335x5 adPresentationError, jm1 this$0) {
        Intrinsics.checkNotNullParameter(adPresentationError, "$adPresentationError");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        zx1 zx1Var = new zx1(adPresentationError.a());
        is isVar = this$0.f27731c;
        if (isVar != null) {
            isVar.a(zx1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd0
    public final void a(@Nullable final C1795a4 c1795a4) {
        this.f27730b.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.B8
            @Override // java.lang.Runnable
            public final void run() {
                jm1.a(jm1.this, c1795a4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(jm1 this$0, C1795a4 c1795a4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        is isVar = this$0.f27731c;
        if (isVar != null) {
            isVar.a(c1795a4);
        }
    }

    public final void a(@Nullable gl2 gl2Var) {
        this.f27731c = gl2Var;
    }
}
