package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9P {
    public final int A00;
    public final C1677mL A01;
    public final CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public C9P() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C9P(CopyOnWriteArrayList<DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers, int i, C1677mL c1677mL) {
        this.A02 = listenerAndHandlers;
        this.A00 = i;
        this.A01 = c1677mL;
    }

    public final C9P A00(int i, C1677mL c1677mL) {
        return new C9P(this.A02, i, c1677mL);
    }
}
