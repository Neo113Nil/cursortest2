package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kj2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qf1 f28215a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sy1 f28216b;

    public kj2(@NotNull qf1 parentHtmlWebView) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        this.f28215a = parentHtmlWebView;
        this.f28216b = new sy1();
    }

    public final void a(@NotNull final Map<String, String> trackingParameters) {
        Intrinsics.checkNotNullParameter(trackingParameters, "trackingParameters");
        this.f28216b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.W8
            @Override // java.lang.Runnable
            public final void run() {
                kj2.a(kj2.this, trackingParameters);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(kj2 this$0, Map trackingParameters) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trackingParameters, "$trackingParameters");
        this$0.f28215a.setVisibility(0);
        ap0.d(new Object[0]);
        jg0 j4 = this$0.f28215a.j();
        if (j4 != null) {
            j4.a(this$0.f28215a, trackingParameters);
        }
    }
}
