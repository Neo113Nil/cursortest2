package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fe2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f25765a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private xt f25766b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fe2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xt xtVar = this$0.f25766b;
        if (xtVar != null) {
            xtVar.onVideoComplete();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ke2
    public final void onVideoComplete() {
        this.f25765a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.J2
            @Override // java.lang.Runnable
            public final void run() {
                fe2.a(fe2.this);
            }
        });
    }

    public final void a(@Nullable in2 in2Var) {
        this.f25766b = in2Var;
    }
}
