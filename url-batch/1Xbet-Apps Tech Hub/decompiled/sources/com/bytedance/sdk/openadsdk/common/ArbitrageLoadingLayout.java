package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.cR;

/* loaded from: classes2.dex */
public class ArbitrageLoadingLayout extends LandingPageLoadingLayout {
    public ArbitrageLoadingLayout(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.common.LandingPageLoadingLayout
    public void pvs() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.ArbitrageLoadingLayout.1
            @Override // java.lang.Runnable
            public void run() {
                if (ArbitrageLoadingLayout.this.pvs != null) {
                    ArbitrageLoadingLayout.this.setVisibility(0);
                    ArbitrageLoadingLayout.this.pvs.icD();
                }
            }
        });
    }

    public void pvs(cR cRVar, String str, int i, String str2, long j, boolean z, int i2, long j2) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.icD.vG.pvs(cRVar, str, i, str2, SystemClock.elapsedRealtime() - j, z, i2, j2);
            super.icD();
        }
    }
}
