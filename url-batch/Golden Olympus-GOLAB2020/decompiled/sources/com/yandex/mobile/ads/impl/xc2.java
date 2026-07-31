package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ad2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class xc2 extends kotlin.properties.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ yc2 f34515a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc2(yc2 yc2Var) {
        super(null);
        this.f34515a = yc2Var;
    }

    @Override // kotlin.properties.b
    protected final void afterChange(@NotNull m2.h property, ad2.a aVar, ad2.a aVar2) {
        ad2 ad2Var;
        Intrinsics.checkNotNullParameter(property, "property");
        ad2Var = this.f34515a.f35072f;
        ad2Var.a(aVar2);
    }
}
