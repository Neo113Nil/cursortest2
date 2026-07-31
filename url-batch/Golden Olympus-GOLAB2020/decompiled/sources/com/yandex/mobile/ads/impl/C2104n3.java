package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.in0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2104n3 {

    /* renamed from: d, reason: collision with root package name */
    private static final long f29382d = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1986i3 f29383a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final in0 f29384b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f29385c;

    public C2104n3(@NotNull C1986i3 adGroupController) {
        Intrinsics.checkNotNullParameter(adGroupController, "adGroupController");
        this.f29383a = adGroupController;
        int i4 = in0.f27295g;
        this.f29384b = in0.a.a();
        this.f29385c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        ln0 a4;
        C2195r3 f4 = this.f29383a.f();
        if (f4 != null && (a4 = f4.a()) != null) {
            a4.a();
        }
        this.f29385c.removeCallbacksAndMessages(null);
    }

    public final void c() {
        C2195r3 g4;
        if (this.f29384b.d() && (g4 = this.f29383a.g()) != null && Intrinsics.areEqual(this.f29383a.b(), g4)) {
            fd2 b4 = g4.b();
            ln0 a4 = g4.a();
            if (b4.a().ordinal() != 0) {
                return;
            }
            a4.d();
        }
    }

    public final void d() {
        C2195r3 f4 = this.f29383a.f();
        if (f4 != null) {
            fd2 b4 = f4.b();
            ln0 a4 = f4.a();
            int ordinal = b4.a().ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 6 || ordinal == 7) {
                a4.g();
            }
        }
        this.f29385c.removeCallbacksAndMessages(null);
    }

    public final void b() {
        final C2195r3 g4;
        if (!this.f29384b.d() || (g4 = this.f29383a.g()) == null) {
            return;
        }
        this.f29385c.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ha
            @Override // java.lang.Runnable
            public final void run() {
                C2104n3.a(C2104n3.this, g4);
            }
        }, f29382d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2104n3 this$0, C2195r3 adToPrepare) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adToPrepare, "$adToPrepare");
        if (Intrinsics.areEqual(this$0.f29383a.b(), adToPrepare)) {
            fd2 b4 = adToPrepare.b();
            ln0 a4 = adToPrepare.a();
            if (b4.a().ordinal() != 0) {
                return;
            }
            a4.d();
        }
    }
}
