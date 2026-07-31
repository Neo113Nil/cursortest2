package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes.dex */
final class qn implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Surface f10758f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ sn f10759g;

    qn(sn snVar, Surface surface) {
        this.f10759g = snVar;
        this.f10758f = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tn tnVar;
        tnVar = this.f10759g.f11879b;
        tnVar.w(this.f10758f);
    }
}
