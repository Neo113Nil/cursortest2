package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1975hg f23635a;

    public b91(@NotNull C1975hg assetValueProvider) {
        Intrinsics.checkNotNullParameter(assetValueProvider, "assetValueProvider");
        this.f23635a = assetValueProvider;
    }

    @NotNull
    public final a91 a() {
        wb1 wb1Var;
        mw0 a4 = this.f23635a.a();
        ra1 ra1Var = null;
        if (a4 != null) {
            ra1 ra1Var2 = a4.c() != null ? new ra1() : null;
            wb1Var = a4.b() != null ? new wb1() : null;
            ra1Var = ra1Var2;
        } else {
            wb1Var = null;
        }
        return new a91(ra1Var, wb1Var);
    }
}
