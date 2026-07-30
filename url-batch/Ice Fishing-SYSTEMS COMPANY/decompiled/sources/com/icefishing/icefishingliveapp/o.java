package com.icefishing.icefishingliveapp;

import android.os.Handler;
import android.view.View;

/* loaded from: classes2.dex */
public final class o implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntroActivity f37090a;

    public o(IntroActivity introActivity) {
        this.f37090a = introActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i4 = IntroActivity.f36935y;
        new Handler().postDelayed(new F3.C(19, this), com.anythink.expressad.video.module.a.a.m.ai);
    }
}
