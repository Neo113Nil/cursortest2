package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class uo implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ View f12881f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ yo f12882g;

    uo(yo yoVar, View view) {
        this.f12882g = yoVar;
        this.f12881f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12882g.c(this.f12881f);
    }
}
