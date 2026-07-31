package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Map;

/* loaded from: classes13.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
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

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean rp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        zak();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout ev() {
        return this.fs.uqh.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public Map<String, Object> ww() {
        return this.fs.bvs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void hgd() {
        if (nqi.btk(this.fs.fs)) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.fs.uqh;
        if (bvsVar == null || bvsVar.zmn() == null) {
            return;
        }
        this.fs.uqh.zmn().setTime("0", 0, 0, false);
        if (this.fs.uqh.bvs()) {
            this.fs.ev.zmn("0", "X");
            this.fs.ev.btk(true);
            this.fs.ev.zn();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void zmn(long j, long j2) {
        int i = (int) (j / 1000);
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar = this.fs.uqh;
        if (bvsVar != null && bvsVar.zmn() != null) {
            this.fs.uqh.zmn().setTime(String.valueOf(this.btk), i, 0, false);
            this.fs.uqh.zmn().zmn(j, j2);
        }
        com.bytedance.sdk.openadsdk.component.reward.view.bvs bvsVar2 = this.fs.uqh;
        if ((bvsVar2 == null || !bvsVar2.bvs()) && !this.fs.fs.wir()) {
            return;
        }
        zmn(i);
        if (this.btk >= 0) {
            this.fs.ev.fb(true);
            this.fs.ev.zmn(String.valueOf(this.btk), null);
        }
    }
}
