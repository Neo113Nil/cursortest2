package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ad2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wc2 extends kotlin.properties.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ yc2 f34007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc2(yc2 yc2Var) {
        super(null);
        this.f34007a = yc2Var;
    }

    @Override // kotlin.properties.b
    protected final void afterChange(@NotNull m2.h property, ad2.b bVar, ad2.b bVar2) {
        ad2 ad2Var;
        Intrinsics.checkNotNullParameter(property, "property");
        ad2Var = this.f34007a.f35072f;
        ad2Var.a(bVar2);
    }
}
