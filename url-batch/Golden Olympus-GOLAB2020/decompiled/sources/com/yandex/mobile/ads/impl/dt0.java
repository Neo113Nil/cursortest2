package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dt0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final et0 f24748a;

    public dt0(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull qs instreamAd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        this.f24748a = new et0(context, sdkEnvironmentModule, instreamAd);
    }

    @NotNull
    public final ct0<T> a(@NotNull xs0<T> manualAdBreakFactory, @Nullable String str) {
        Intrinsics.checkNotNullParameter(manualAdBreakFactory, "manualAdBreakFactory");
        ArrayList a4 = this.f24748a.a(str);
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = a4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a4.get(i4);
            i4++;
            arrayDeque.add(manualAdBreakFactory.a((ys0) obj));
        }
        return new ct0<>(arrayDeque);
    }
}
