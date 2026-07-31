package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class iv extends nps {
    private long fs;
    private long zmn;

    @Override // com.bytedance.sdk.openadsdk.core.widget.nps, com.bytedance.sdk.openadsdk.core.hhw.nps, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.nps, com.bytedance.sdk.openadsdk.core.hhw.nps, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.nps
    protected boolean zmn() {
        return false;
    }

    public iv(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public void zn() {
        setVisibility(8);
        if (this.zmn != 0) {
            this.fs = SystemClock.elapsedRealtime();
        }
    }

    public void fs(nqi nqiVar, int i) {
        if (isShown()) {
            return;
        }
        fs();
        setVisibility(0);
        this.zmn = SystemClock.elapsedRealtime();
        zmn(nqiVar, i);
    }

    public boolean fb() {
        return this.zmn > 0 && this.fs > 0;
    }

    public long getDisplayDuration() {
        if (this.zmn == 0) {
            return 0L;
        }
        if (this.fs == 0) {
            this.fs = SystemClock.elapsedRealtime();
        }
        return this.fs - this.zmn;
    }
}
