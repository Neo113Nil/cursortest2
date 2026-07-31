package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k80 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qs0 f28111a;

    public k80(@NotNull qs0 mainThreadHandler) {
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        this.f28111a = mainThreadHandler;
    }

    public final void a(@NotNull final Function0<Unit> onFastApp, @NotNull final Function0<Unit> onSlowApp) {
        Intrinsics.checkNotNullParameter(onFastApp, "onFastApp");
        Intrinsics.checkNotNullParameter(onSlowApp, "onSlowApp");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f28111a.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.J8
            @Override // java.lang.Runnable
            public final void run() {
                k80.a(elapsedRealtime, onFastApp, onSlowApp);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(long j4, Function0 onFastApp, Function0 onSlowApp) {
        Intrinsics.checkNotNullParameter(onFastApp, "$onFastApp");
        Intrinsics.checkNotNullParameter(onSlowApp, "$onSlowApp");
        if (SystemClock.elapsedRealtime() - j4 <= 5000) {
            onFastApp.invoke();
        } else {
            onSlowApp.invoke();
        }
    }
}
