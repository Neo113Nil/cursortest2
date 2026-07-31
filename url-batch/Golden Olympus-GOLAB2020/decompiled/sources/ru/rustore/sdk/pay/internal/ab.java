package ru.rustore.sdk.pay.internal;

import android.webkit.JavascriptInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.jvm.internal.p f43806a;

    /* JADX WARN: Multi-variable type inference failed */
    public ab(@NotNull Function1<? super String, Unit> onPostMessageReceive) {
        Intrinsics.checkNotNullParameter(onPostMessageReceive, "onPostMessageReceive");
        this.f43806a = (kotlin.jvm.internal.p) onPostMessageReceive;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.p] */
    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f43806a.invoke(message);
    }
}
