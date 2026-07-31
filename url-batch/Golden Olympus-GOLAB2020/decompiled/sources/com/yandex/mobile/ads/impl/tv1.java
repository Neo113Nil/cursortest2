package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes3.dex */
final class tv1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ pw0 f32711b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CustomizableMediaView f32712c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ mw0 f32713d;

    tv1(pw0 pw0Var, CustomizableMediaView customizableMediaView, mw0 mw0Var) {
        this.f32711b = pw0Var;
        this.f32712c = customizableMediaView;
        this.f32713d = mw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32711b.b(this.f32712c, this.f32713d);
    }
}
