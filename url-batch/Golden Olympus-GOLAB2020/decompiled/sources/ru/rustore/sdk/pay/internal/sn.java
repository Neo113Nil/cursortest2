package ru.rustore.sdk.pay.internal;

import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.rn;

/* loaded from: classes3.dex */
public final class sn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final rn.a f45023a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final rn.b f45024b;

    public sn(@NotNull rn.a onPaymentInfoLoaded, @NotNull rn.b onErrorReceived) {
        Intrinsics.checkNotNullParameter(onPaymentInfoLoaded, "onPaymentInfoLoaded");
        Intrinsics.checkNotNullParameter(onErrorReceived, "onErrorReceived");
        this.f45023a = onPaymentInfoLoaded;
        this.f45024b = onErrorReceived;
    }

    @JavascriptInterface
    public final void handleError(@NotNull String errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        this.f45024b.invoke(errorResponse);
    }

    @JavascriptInterface
    public final void setPayInfo(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f45023a.invoke(response);
    }
}
