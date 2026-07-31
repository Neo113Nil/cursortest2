package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C19551z {
    public final AudioAttributes A00;

    public C19551z(C3784qQ c3784qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c3784qQ.A02).setFlags(c3784qQ.A03).setUsage(c3784qQ.A05);
        if (C5C.A02 >= 29) {
            C19531x.A00(usage, c3784qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C19541y.A00(usage, c3784qQ.A04);
        }
        this.A00 = usage.build();
    }
}
