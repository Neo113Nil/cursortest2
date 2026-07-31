package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ym {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f35240a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2183qd<TextView> f35241b;

    public /* synthetic */ ym(Context context) {
        this(context, new Handler(Looper.getMainLooper()), an.a(context));
    }

    public final void a() {
        this.f35240a.removeCallbacksAndMessages(null);
        this.f35241b.cancel();
    }

    public final void a(@NotNull TextView callToActionView) {
        Intrinsics.checkNotNullParameter(callToActionView, "callToActionView");
        this.f35240a.postDelayed(new d22(callToActionView, this.f35241b), 2000L);
    }

    public ym(@NotNull Context context, @NotNull Handler handler, @NotNull InterfaceC2183qd<TextView> callToActionAnimator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(callToActionAnimator, "callToActionAnimator");
        this.f35240a = handler;
        this.f35241b = callToActionAnimator;
    }
}
