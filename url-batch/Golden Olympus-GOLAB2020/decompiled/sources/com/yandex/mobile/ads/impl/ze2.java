package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ze2 implements zt {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private zt f35580a;

    public final void a(@Nullable af2 af2Var) {
        this.f35580a = af2Var;
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoCompleted() {
        zt ztVar = this.f35580a;
        if (ztVar != null) {
            ztVar.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoError() {
        zt ztVar = this.f35580a;
        if (ztVar != null) {
            ztVar.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoPaused() {
        zt ztVar = this.f35580a;
        if (ztVar != null) {
            ztVar.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoPrepared() {
        zt ztVar = this.f35580a;
        if (ztVar != null) {
            ztVar.onVideoPrepared();
        }
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoResumed() {
        zt ztVar = this.f35580a;
        if (ztVar != null) {
            ztVar.onVideoResumed();
        }
    }
}
