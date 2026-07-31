package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes12.dex */
public class TTAppOpenAdTransActivity extends TTAppOpenAdActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.zg || !jy.zn((Activity) this)) {
            return;
        }
        getWindow().getDecorView().setPadding(0, (int) jy.zmn(), 0, 0);
    }
}
