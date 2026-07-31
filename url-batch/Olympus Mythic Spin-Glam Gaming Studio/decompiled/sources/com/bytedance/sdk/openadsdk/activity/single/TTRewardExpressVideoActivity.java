package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Map;

/* loaded from: classes5.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean kjb() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void mw() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean rp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zak();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout ev() {
        return this.fs.uqh.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> ww() {
        return this.fs.bvs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zmn(long j, long j2) {
        int nkw = this.fs.fs.nkw();
        boolean z = this.fs.uqh.bvs() && nkw >= 0;
        int i = (int) (j / 1000);
        zn(j, j2);
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.fs.uqh;
        if (bvsVar != null && bvsVar.zmn() != null) {
            this.fs.uqh.zmn().setTime(String.valueOf(this.btk), i, 0, false);
            this.fs.uqh.zmn().zmn(j, j2);
        }
        int i2 = this.btk;
        if (i2 > 0) {
            if (!z) {
                this.fs.ev.zmn(String.valueOf(i2), null);
                return;
            }
            if (i < nkw) {
                this.fs.ev.zmn(String.valueOf(i2), null);
                return;
            }
            if (this.fs.fs.cd() == 5 || this.fs.fs.cd() == 33) {
                this.fs.ev.zmn(String.valueOf(this.btk), null);
                return;
            }
            this.fs.zmn(true);
            this.fs.ev.zmn(String.valueOf(this.btk), TTAdDislikeToast.getSkipText());
            this.fs.ev.btk(true);
        }
    }
}
