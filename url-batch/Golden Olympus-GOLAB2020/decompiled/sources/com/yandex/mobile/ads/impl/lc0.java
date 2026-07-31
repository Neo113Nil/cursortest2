package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28504a;

    public lc0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28504a = context.getApplicationContext();
    }

    public final boolean a() {
        int i4 = ew1.f25476l;
        ew1 a4 = ew1.a.a();
        Context context = this.f28504a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        du1 a5 = a4.a(context);
        return a5 != null && a5.f0();
    }
}
