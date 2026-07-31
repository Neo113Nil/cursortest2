package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.e82;
import com.yandex.mobile.ads.impl.ua0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2339x9 implements e82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z40 f34502a = new z40();

    @Override // com.yandex.mobile.ads.impl.e82
    @NotNull
    public final String a(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull zw1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        return this.f34502a.a(context, new ua0(ua0.b.a(context, adConfiguration, sensitiveModeChecker), 0).toString());
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
        return e82.a.f25146b;
    }
}
