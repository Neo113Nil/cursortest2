package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jm2 implements ft {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final NativeAdImageLoadingListener f27732a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            jm2.this.f27732a.onFinishLoadingImages();
            return Unit.f41027a;
        }
    }

    public jm2(@NotNull NativeAdImageLoadingListener imageLoadingListener) {
        Intrinsics.checkNotNullParameter(imageLoadingListener, "imageLoadingListener");
        this.f27732a = imageLoadingListener;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm2) && Intrinsics.areEqual(this.f27732a, ((jm2) obj).f27732a);
    }

    public final int hashCode() {
        return this.f27732a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.ft
    public final void onFinishLoadingImages() {
        new CallbackStackTraceMarker(new a());
    }

    @NotNull
    public final String toString() {
        return "YandexNativeAdImageLoadingListenerAdapter(imageLoadingListener=" + this.f27732a + ")";
    }
}
