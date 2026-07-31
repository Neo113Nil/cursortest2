package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes.dex */
final class va4 {
    public static void a(Surface surface, float f7) {
        try {
            surface.setFrameRate(f7, f7 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e7) {
            oc2.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
        }
    }
}
