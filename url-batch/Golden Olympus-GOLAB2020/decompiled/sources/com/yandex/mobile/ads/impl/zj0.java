package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.yj0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zj0 {
    @NotNull
    public static yj0 a(@NotNull Context context, @NotNull yj0.a impressionListener, @NotNull bk0 impressionReporter, @NotNull C2379z3 adIdStorageManager, @NotNull xj0 eventsObservable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(impressionListener, "impressionListener");
        Intrinsics.checkNotNullParameter(impressionReporter, "impressionReporter");
        Intrinsics.checkNotNullParameter(adIdStorageManager, "adIdStorageManager");
        Intrinsics.checkNotNullParameter(eventsObservable, "eventsObservable");
        yj0 yj0Var = new yj0(context, impressionListener, impressionReporter, adIdStorageManager, new ak0(impressionReporter));
        eventsObservable.b(yj0Var);
        eventsObservable.a(yj0Var);
        eventsObservable.c(yj0Var);
        eventsObservable.a((e11) yj0Var);
        return yj0Var;
    }
}
