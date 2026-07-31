package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class or {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f30179a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC2194r2 f30180b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private a91 f30181c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private t42 f30182d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final q20 f30183e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final sl1 f30184f;

    public or(@NotNull C2360y7 adResponse, @NotNull InterfaceC2194r2 adCompleteListener, @NotNull a91 nativeMediaContent, @NotNull t42 timeProviderContainer, @Nullable q20 q20Var, @NotNull cr0 progressListener) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f30179a = adResponse;
        this.f30180b = adCompleteListener;
        this.f30181c = nativeMediaContent;
        this.f30182d = timeProviderContainer;
        this.f30183e = q20Var;
        this.f30184f = progressListener;
    }

    @NotNull
    public final nc0 a() {
        ra1 a4 = this.f30181c.a();
        wb1 b4 = this.f30181c.b();
        q20 q20Var = this.f30183e;
        if (Intrinsics.areEqual(q20Var != null ? q20Var.e() : null, w00.f33852d.a())) {
            return new e81(this.f30180b, this.f30182d, this.f30184f);
        }
        if (a4 == null) {
            return b4 != null ? new vb1(b4, this.f30180b) : new e81(this.f30180b, this.f30182d, this.f30184f);
        }
        C2360y7<?> c2360y7 = this.f30179a;
        return new qa1(c2360y7, a4, this.f30180b, this.f30184f, c2360y7.K());
    }
}
