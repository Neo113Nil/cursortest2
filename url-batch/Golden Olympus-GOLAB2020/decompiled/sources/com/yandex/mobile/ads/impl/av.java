package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class av {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ av(Context context, C2286v2 c2286v2, dr0 dr0Var) {
        this(context, c2286v2, dr0Var, r4, new n62(r4), c2286v2.p().c());
        C1920f9 c1920f9 = new C1920f9(context, c2286v2);
    }

    public av(@NotNull Context context, @NotNull C2286v2 adConfiguration, @Nullable dr0 dr0Var, @NotNull C1920f9 adTracker, @NotNull n62 trackingUrlHandler, @NotNull mp1 analyticsReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(trackingUrlHandler, "trackingUrlHandler");
        Intrinsics.checkNotNullParameter(analyticsReporter, "analyticsReporter");
    }
}
