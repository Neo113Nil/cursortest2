package com.ironsource;

import android.content.Context;
import j2.AbstractC3185a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bb f15592a = new bb();

    private bb() {
    }

    public final int a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }

    public final int b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    private final int a(Context context, int i4) {
        return AbstractC3185a.c(i4 / context.getResources().getDisplayMetrics().density);
    }
}
