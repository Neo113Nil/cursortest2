package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wu1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ys1 f34185a;

    public wu1(@NotNull ys1 sslSocketFactoryCreator) {
        Intrinsics.checkNotNullParameter(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f34185a = sslSocketFactoryCreator;
    }

    @NotNull
    public final xu1 a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String a4 = C2182qc.a().a();
        SSLSocketFactory a5 = this.f34185a.a(context);
        int i4 = ew1.f25476l;
        du1 a6 = ew1.a.a().a(context);
        return new xu1(a4, a5, a6 != null && a6.A0());
    }
}
