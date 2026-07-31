package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pl2 implements ps {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InitializationListener f30485a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            pl2.this.f30485a.onInitializationCompleted();
            return Unit.f41027a;
        }
    }

    public pl2(@NotNull InitializationListener initializationListener) {
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        this.f30485a = initializationListener;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof pl2) && Intrinsics.areEqual(((pl2) obj).f30485a, this.f30485a);
    }

    public final int hashCode() {
        return this.f30485a.hashCode();
    }

    @Override // com.yandex.mobile.ads.impl.ps
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new a());
    }
}
