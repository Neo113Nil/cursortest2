package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f26891a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vp f26892b;

    public hr(@NotNull ew1 sdkSettings, @NotNull vp cmpSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(cmpSettings, "cmpSettings");
        this.f26891a = sdkSettings;
        this.f26892b = cmpSettings;
    }

    @NotNull
    public final pw a() {
        String c4;
        String a4;
        boolean c5 = this.f26891a.c();
        Boolean e4 = this.f26891a.e();
        Boolean i4 = this.f26891a.i();
        String b4 = this.f26892b.b();
        return new pw(c5, e4, i4, ((b4 == null || StringsKt.z(b4)) && ((c4 = this.f26892b.c()) == null || StringsKt.z(c4)) && ((a4 = this.f26892b.a()) == null || StringsKt.z(a4))) ? false : true);
    }
}
