package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class tf0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AdOverlayInfoParcel f12192f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ zzcaf f12193g;

    tf0(zzcaf zzcafVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f12193g = zzcafVar;
        this.f12192f = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        y2.t.k();
        activity = this.f12193g.f15364a;
        z2.p.a(activity, this.f12192f, true);
    }
}
