package com.tapjoy.internal;

import android.view.animation.Animation;
import android.view.animation.AnimationSet;

/* loaded from: classes2.dex */
public final class ae extends ad {

    /* renamed from: b, reason: collision with root package name */
    private final AnimationSet f7809b;

    public ae() {
        super(new AnimationSet(true));
        this.f7809b = (AnimationSet) this.f7803a;
    }

    public final ae a(Animation animation) {
        this.f7809b.addAnimation(animation);
        return this;
    }

    @Override // com.tapjoy.internal.ad
    public final /* bridge */ /* synthetic */ Animation a() {
        return this.f7809b;
    }
}
