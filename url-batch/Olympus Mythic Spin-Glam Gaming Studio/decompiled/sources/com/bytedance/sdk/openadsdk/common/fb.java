package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes13.dex */
public class fb extends klz {
    @Override // com.bytedance.sdk.openadsdk.common.klz, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.common.klz, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public fb(@NonNull Context context) {
        super(context);
        this.fs = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.klz
    public void zmn() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.fb.1
            @Override // java.lang.Runnable
            public void run() {
                fb fbVar = fb.this;
                if (fbVar.zmn != null) {
                    fbVar.setVisibility(0);
                }
            }
        });
    }

    public void zmn(nqi nqiVar, String str, int i, String str2, long j, boolean z, int i2, long j2) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, str, i, str2, SystemClock.elapsedRealtime() - j, z, i2, j2);
            super.fs();
        }
    }
}
