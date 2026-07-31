package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ad0 implements e11, f11 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f23236a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f23237b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1871d8 f23238c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final rt1 f23239d;

    public ad0(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull C2360y7<String> adResponse, @NotNull C1871d8 adResultReceiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        this.f23236a = context;
        this.f23237b = adResponse;
        this.f23238c = adResultReceiver;
        this.f23239d = new rt1(adConfiguration);
    }

    @Override // com.yandex.mobile.ads.impl.f11
    public final void a() {
        this.f23239d.b(this.f23236a, this.f23237b);
        this.f23238c.a(13, null);
    }

    @Override // com.yandex.mobile.ads.impl.e11
    public final void b() {
        this.f23238c.a(15, null);
    }

    @Override // com.yandex.mobile.ads.impl.e11
    public final void e() {
        this.f23238c.a(14, null);
    }
}
