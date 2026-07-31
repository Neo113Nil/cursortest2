package com.bytedance.sdk.openadsdk.activity.single;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long fs;
    private long zmn;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.btk.zn()) {
            this.fs = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.fs > 0) {
            this.zmn += SystemClock.elapsedRealtime() - this.fs;
            this.fs = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        long j = this.zmn;
        if (j > 0) {
            com.bytedance.sdk.openadsdk.utils.btk.zmn(j);
        }
    }
}
