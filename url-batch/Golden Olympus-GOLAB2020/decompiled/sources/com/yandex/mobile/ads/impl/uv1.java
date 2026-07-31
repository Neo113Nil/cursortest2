package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class uv1 extends kotlin.properties.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ sv1 f33425a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv1(rv1 rv1Var, sv1 sv1Var) {
        super(rv1Var);
        this.f33425a = sv1Var;
    }

    @Override // kotlin.properties.b
    protected final void afterChange(@NotNull m2.h property, pw0 pw0Var, pw0 pw0Var2) {
        CustomizableMediaView d4;
        mw0 c4;
        Intrinsics.checkNotNullParameter(property, "property");
        pw0 pw0Var3 = pw0Var2;
        pw0 pw0Var4 = pw0Var;
        if (Intrinsics.areEqual(pw0Var3, pw0Var4) || (d4 = sv1.d(this.f33425a)) == null || (c4 = sv1.c(this.f33425a)) == null) {
            return;
        }
        pw0Var4.a(d4);
        d4.post(new tv1(pw0Var3, d4, c4));
    }
}
