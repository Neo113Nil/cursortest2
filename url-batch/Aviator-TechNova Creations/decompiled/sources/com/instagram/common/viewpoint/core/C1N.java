package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1N {
    public final AudioAttributes A00;

    public C1N(C1842oy c1842oy) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1842oy.A02).setFlags(c1842oy.A03).setUsage(c1842oy.A05);
        if (AbstractC01484a.A02 >= 29) {
            C1L.A00(usage, c1842oy.A01);
        }
        if (AbstractC01484a.A02 >= 32) {
            C1M.A00(usage, c1842oy.A04);
        }
        this.A00 = usage.build();
    }
}
