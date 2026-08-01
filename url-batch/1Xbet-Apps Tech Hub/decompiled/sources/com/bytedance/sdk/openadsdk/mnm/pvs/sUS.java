package com.bytedance.sdk.openadsdk.mnm.pvs;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.Gp;

/* compiled from: PAGMrcVisibilityTracker.java */
/* loaded from: classes2.dex */
public class sUS {
    public static boolean pvs(View view, int i) {
        return pvs(view, false, i);
    }

    public static boolean pvs(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return Gp.pvs(view, z ? 30 : 50, i);
    }
}
