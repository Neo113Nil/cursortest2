package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.component.reward.zn.fs;
import com.bytedance.sdk.openadsdk.component.reward.zn.nps;
import com.bytedance.sdk.openadsdk.core.hhw.zn;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes6.dex */
public class TTRewardWebActivity extends TTUnifyWebActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.u, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public boolean zmn() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    protected fs zmn(Activity activity, Context context, nqi nqiVar, String str, zn znVar, String str2) {
        return new nps(activity, context, nqiVar, str, znVar, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.fb != null) {
            com.bytedance.sdk.openadsdk.hhw.fs.zmn().zmn("videoForceBreak", this.btk);
        }
        fs fsVar = this.fb;
        if (fsVar instanceof nps) {
            fsVar.olo();
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTUnifyWebActivity
    public void fs() {
        super.finish();
    }
}
