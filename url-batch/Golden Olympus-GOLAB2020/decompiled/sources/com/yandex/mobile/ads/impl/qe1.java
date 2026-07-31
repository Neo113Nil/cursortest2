package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qe1 {
    @NotNull
    public static ne1 a(@NotNull Activity activity, @Nullable C2330x0 c2330x0) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Build.VERSION.SDK_INT >= 33 ? new pe1(activity, c2330x0) : new oe1());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null) {
            ap0.f(d4);
            m243constructorimpl = new oe1();
        }
        return (ne1) m243constructorimpl;
    }
}
