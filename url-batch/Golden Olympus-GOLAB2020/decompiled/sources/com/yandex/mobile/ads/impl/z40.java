package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z40 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final s22 f35456a = new s22();

    @NotNull
    public final String a(@NotNull Context context, @NotNull String rawQuery) {
        String a4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rawQuery, "rawQuery");
        int i4 = ew1.f25476l;
        du1 a5 = ew1.a.a().a(context);
        return (a5 == null || !a5.e0() || (a4 = this.f35456a.a(context, rawQuery)) == null) ? rawQuery : a4;
    }
}
