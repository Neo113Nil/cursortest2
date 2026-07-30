package com.google.android.gms.internal.ads;

import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC3501l0 extends AbstractC3447k0 implements Choreographer.FrameCallback {
    @Override // com.google.android.gms.internal.ads.AbstractC3447k0
    public final void a() {
        long j9;
        this.f32231u.registerDisplayListener(this, AbstractC3548lu.p());
        this.f32230n.postFrameCallback(this);
        if (this.f32231u.getDisplay(0) != null) {
            j9 = (long) (1.0E9d / r0.getRefreshRate());
        } else {
            AbstractC3217fl.I("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j9 = com.anythink.basead.exoplayer.b.f6539b;
        }
        this.f32233w = j9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3447k0
    public final void b() {
        this.f32231u.unregisterDisplayListener(this);
        this.f32230n.removeFrameCallback(this);
        this.f32232v = com.anythink.basead.exoplayer.b.f6539b;
        this.f32233w = com.anythink.basead.exoplayer.b.f6539b;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j9) {
        this.f32232v = j9;
        this.f32230n.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        long j9;
        if (i == 0) {
            this.f32230n.postFrameCallback(this);
            if (this.f32231u.getDisplay(0) != null) {
                j9 = (long) (1.0E9d / r5.getRefreshRate());
            } else {
                AbstractC3217fl.I("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j9 = com.anythink.basead.exoplayer.b.f6539b;
            }
            this.f32233w = j9;
        }
    }
}
