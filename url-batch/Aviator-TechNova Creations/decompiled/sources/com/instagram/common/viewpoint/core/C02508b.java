package com.instagram.common.viewpoint.core;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* renamed from: com.facebook.ads.redexgen.X.8b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02508b {
    public static void A00(AudioTrack audioTrack, C02387m c02387m) {
        LogSessionId A00 = c02387m.A00();
        LogSessionId logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!A00.equals(logSessionId)) {
            audioTrack.setLogSessionId(A00);
        }
    }
}
