package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ef1 implements r00 {

    /* renamed from: a, reason: collision with root package name */
    private final int f25281a;

    public ef1(int i4) {
        this.f25281a = i4;
    }

    @Override // com.yandex.mobile.ads.impl.r00
    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f25281a == context.getResources().getConfiguration().orientation;
    }
}
