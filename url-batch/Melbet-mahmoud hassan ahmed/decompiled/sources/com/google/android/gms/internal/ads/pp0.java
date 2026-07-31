package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
final class pp0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ MediaPlayer f10327f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ xp0 f10328g;

    pp0(xp0 xp0Var, MediaPlayer mediaPlayer) {
        this.f10328g = xp0Var;
        this.f10327f = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yp0 yp0Var;
        yp0 yp0Var2;
        xp0.L(this.f10328g, this.f10327f);
        yp0Var = this.f10328g.f14295w;
        if (yp0Var != null) {
            yp0Var2 = this.f10328g.f14295w;
            yp0Var2.d();
        }
    }
}
