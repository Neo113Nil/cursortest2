package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jh0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ys1 f27652a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final q01 f27653b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f27654c;

    public jh0(@NotNull Context context, @NotNull zs1 sslSocketFactoryCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f27652a = sslSocketFactoryCreator;
        this.f27653b = kh0.a(context);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f27654c = applicationContext;
    }

    @NotNull
    public final lh0 a() {
        SSLSocketFactory a4 = this.f27652a.a(this.f27654c);
        Context context = this.f27654c;
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = ew1.f25476l;
        du1 a5 = ew1.a.a().a(context);
        if (a5 != null) {
            a5.F();
        }
        return new lh0(this.f27653b.a(a4), C2182qc.a());
    }
}
