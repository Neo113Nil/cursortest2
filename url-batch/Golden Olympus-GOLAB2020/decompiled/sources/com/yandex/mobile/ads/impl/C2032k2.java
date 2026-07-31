package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2032k2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2308w1 f27985a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final zf2 f27986b;

    public C2032k2(@NotNull Context context, @NotNull C2308w1 adBreak) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        this.f27985a = adBreak;
        this.f27986b = new zf2(context);
    }

    public final void a() {
        this.f27986b.a(this.f27985a, "breakEnd");
    }

    public final void b() {
        this.f27986b.a(this.f27985a, "error");
    }

    public final void c() {
        this.f27986b.a(this.f27985a, "breakStart");
    }
}
