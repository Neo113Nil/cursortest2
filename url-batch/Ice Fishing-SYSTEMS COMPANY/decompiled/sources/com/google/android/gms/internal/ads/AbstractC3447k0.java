package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3447k0 implements DisplayManager.DisplayListener {

    /* renamed from: n, reason: collision with root package name */
    public final Choreographer f32230n;

    /* renamed from: u, reason: collision with root package name */
    public final DisplayManager f32231u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f32232v = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f32233w = com.anythink.basead.exoplayer.b.f6539b;

    public /* synthetic */ AbstractC3447k0(Choreographer choreographer, DisplayManager displayManager) {
        this.f32230n = choreographer;
        this.f32231u = displayManager;
    }

    public abstract void a();

    public abstract void b();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
