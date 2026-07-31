package com.bytedance.sdk.openadsdk.bjh.fs;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.hgd;

/* loaded from: classes15.dex */
public class hhw {
    public static boolean zmn(View view, int i) {
        return zmn(view, false, i);
    }

    public static boolean zmn(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return hgd.zmn(view, z ? 30 : 50, i, false);
    }
}
