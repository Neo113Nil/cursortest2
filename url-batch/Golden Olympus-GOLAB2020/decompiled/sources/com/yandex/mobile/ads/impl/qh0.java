package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qh0 {
    @NotNull
    public static AbstractC2303vj a(@NotNull Context context, @Nullable SSLSocketFactory sSLSocketFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(context);
        return (a4 == null || !a4.A0()) ? new ph0(sSLSocketFactory) : new rh0(sSLSocketFactory);
    }
}
