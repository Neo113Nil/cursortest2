package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.c92;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b71 implements InterfaceC1849ca {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f23619a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o71 f23620b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final l71 f23621c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ew1 f23622d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b71(Context context, o71 o71Var, l71 l71Var) {
        this(context, o71Var, l71Var, ew1.a.a());
        int i4 = ew1.f25476l;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1849ca
    public final boolean a() {
        this.f23621c.getClass();
        du1 a4 = this.f23622d.a(this.f23619a);
        return a4 == null || !a4.w0() || this.f23620b.a(false, false).b() == c92.a.f24127c;
    }

    public b71(@NotNull Context context, @NotNull o71 nativeAssetsValidator, @NotNull l71 nativeAdsConfiguration, @NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAssetsValidator, "nativeAssetsValidator");
        Intrinsics.checkNotNullParameter(nativeAdsConfiguration, "nativeAdsConfiguration");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f23619a = context;
        this.f23620b = nativeAssetsValidator;
        this.f23621c = nativeAdsConfiguration;
        this.f23622d = sdkSettings;
    }
}
