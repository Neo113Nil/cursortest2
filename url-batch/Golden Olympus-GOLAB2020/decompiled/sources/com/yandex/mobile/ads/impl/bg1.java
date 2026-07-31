package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.e82;
import com.yandex.mobile.ads.impl.ua0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bg1 implements e82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final cg1 f23742a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z40 f23743b;

    public bg1(@NotNull cg1 passbackUrlParametersProvider) {
        Intrinsics.checkNotNullParameter(passbackUrlParametersProvider, "passbackUrlParametersProvider");
        this.f23742a = passbackUrlParametersProvider;
        this.f23743b = new z40();
    }

    @Override // com.yandex.mobile.ads.impl.e82
    @NotNull
    public final String a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull zw1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        return this.f23743b.a(context, new ua0(ua0.b.a(context, adConfiguration, sensitiveModeChecker).b(this.f23742a.a()), 0).toString());
    }

    @Override // com.yandex.mobile.ads.impl.e82
    @Nullable
    public final String a(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        String a4 = adConfiguration.j().a();
        if (a4 == null || a4.length() <= 0) {
            return null;
        }
        return Uri.parse(a4).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // com.yandex.mobile.ads.impl.e82
    @NotNull
    public final e82.a a() {
        return e82.a.f25147c;
    }
}
