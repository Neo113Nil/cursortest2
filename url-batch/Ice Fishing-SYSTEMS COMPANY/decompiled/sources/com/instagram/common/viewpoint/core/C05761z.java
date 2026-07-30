package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05761z {
    public final AudioAttributes A00;

    public C05761z(C2405qQ c2405qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2405qQ.A02).setFlags(c2405qQ.A03).setUsage(c2405qQ.A05);
        if (C5C.A02 >= 29) {
            C05741x.A00(usage, c2405qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C05751y.A00(usage, c2405qQ.A04);
        }
        this.A00 = usage.build();
    }
}
