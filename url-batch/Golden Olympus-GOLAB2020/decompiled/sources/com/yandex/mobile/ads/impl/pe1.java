package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pe1 implements ne1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f30425a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C2330x0 f30426b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final OnBackInvokedCallback f30427c;

    public pe1(@NotNull Activity activity, @Nullable C2330x0 c2330x0) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f30425a = activity;
        this.f30426b = c2330x0;
        this.f30427c = new OnBackInvokedCallback() { // from class: com.yandex.mobile.ads.impl.Wb
            public final void onBackInvoked() {
                pe1.a(pe1.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pe1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C2330x0 c2330x0 = this$0.f30426b;
        if (c2330x0 == null || !c2330x0.c()) {
            return;
        }
        this$0.f30425a.finish();
    }

    @Override // com.yandex.mobile.ads.impl.ne1
    public final void destroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = this.f30425a.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f30427c);
    }

    @Override // com.yandex.mobile.ads.impl.ne1
    public final void a() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = this.f30425a.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.f30427c);
    }
}
