package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.VideoEventListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class in2 implements xt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final VideoEventListener f27300a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            in2.this.f27300a.onVideoComplete();
            return Unit.f41027a;
        }
    }

    public in2(@NotNull VideoEventListener videoEventListener) {
        Intrinsics.checkNotNullParameter(videoEventListener, "videoEventListener");
        this.f27300a = videoEventListener;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof in2) && Intrinsics.areEqual(((in2) obj).f27300a, this.f27300a);
    }

    public final int hashCode() {
        return this.f27300a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.xt
    public final void onVideoComplete() {
        new CallbackStackTraceMarker(new a());
    }
}
