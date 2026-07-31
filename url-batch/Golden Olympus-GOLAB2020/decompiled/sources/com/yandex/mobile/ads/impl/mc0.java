package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mc0 implements re1 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f28989c = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(mc0.class, "contentCloseListener", "getContentCloseListener()Lcom/monetization/ads/fullscreen/content/ContentCloseListener;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private p82 f28990a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ao1 f28991b = bo1.a();

    @Override // com.yandex.mobile.ads.impl.re1
    public final void a(boolean z4) {
        p82 p82Var = this.f28990a;
        if (p82Var != null) {
            p82Var.a(z4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.re1
    public final void c() {
        mr mrVar = (mr) this.f28991b.getValue(this, f28989c[0]);
        if (mrVar != null) {
            mrVar.f();
        }
    }

    public final void a(@Nullable mr mrVar) {
        this.f28991b.setValue(this, f28989c[0], mrVar);
    }

    public final void a(@NotNull pc0 useCustomCloseListener) {
        Intrinsics.checkNotNullParameter(useCustomCloseListener, "useCustomCloseListener");
        this.f28990a = useCustomCloseListener;
    }
}
