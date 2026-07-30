package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.Oj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0657Oj {
    public static boolean A00(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
