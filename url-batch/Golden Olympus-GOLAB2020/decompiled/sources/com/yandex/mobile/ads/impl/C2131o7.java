package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.o7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2131o7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1966h7 f29927a = new C1966h7();

    static {
        TimeUnit.SECONDS.toMillis(10L);
    }

    @NotNull
    public final b00 a(@NotNull Context context, int i4) {
        Integer d4;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29927a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int i5 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        return new b00(1.0f, i4, (a4 == null || (d4 = a4.d()) == null) ? 0 : d4.intValue());
    }
}
