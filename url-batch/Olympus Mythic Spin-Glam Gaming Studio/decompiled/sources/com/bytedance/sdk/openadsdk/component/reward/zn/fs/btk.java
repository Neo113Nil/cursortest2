package com.bytedance.sdk.openadsdk.component.reward.zn.fs;

import android.R;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.olo;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public class btk {
    private Activity btk;
    private TTAdDislikeToast fs;
    private nqi hhw;
    private com.bytedance.sdk.openadsdk.component.reward.zn.fs nps;
    private String zg;
    private olo zmn;
    private final AtomicBoolean zn = new AtomicBoolean(false);
    private final ConcurrentHashMap<String, Boolean> fb = new ConcurrentHashMap<>();

    public btk(com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar, Activity activity, nqi nqiVar) {
        this.nps = fsVar;
        this.btk = activity;
        this.hhw = nqiVar;
    }

    public void zmn(String str) {
        this.zg = str;
        if (this.btk.isFinishing()) {
            return;
        }
        hhw();
        if (btk()) {
            fs();
        } else {
            zn();
        }
    }

    private void fs() {
        this.fs.show(TTAdDislikeToast.getDislikeTip());
        this.fb.put(this.zg, Boolean.TRUE);
    }

    private void zn() {
        if (this.zmn == null) {
            try {
                fb();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        olo oloVar = this.zmn;
        if (oloVar != null) {
            oloVar.zmn();
        }
    }

    private void fb() {
        if (this.zmn == null) {
            olo oloVar = new olo(this.btk, this.hhw);
            this.zmn = oloVar;
            oloVar.setCallback(new olo.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zn.fs.btk.1
                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void zmn(View view) {
                    btk.this.zn.set(true);
                    if (btk.this.nps != null && btk.this.nps.nps != null && btk.this.nps.nps.fs() != null) {
                        btk.this.nps.nps.fs().zmn(8, false, true);
                        btk.this.nps.nps.fs().setShouldNotifyAdVisibility(false);
                    }
                    btk.this.zmn.setDislikeSource(btk.this.zg);
                }

                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void fs(View view) {
                    btk.this.zn.set(false);
                    if (btk.this.nps == null || btk.this.nps.nps == null || btk.this.nps.nps.fs() == null) {
                        return;
                    }
                    btk.this.nps.nps.fs().zmn(0, true, false);
                    btk.this.nps.nps.fs().setShouldNotifyAdVisibility(true);
                }

                @Override // com.bytedance.sdk.openadsdk.common.olo.zmn
                public void zmn(FilterWord filterWord) {
                    if (btk.this.btk() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    btk.this.fb.put(btk.this.zg, Boolean.TRUE);
                    btk.this.nps();
                }
            });
            ((FrameLayout) this.btk.findViewById(R.id.content)).addView(this.zmn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean btk() {
        if (this.fb.containsKey(this.zg)) {
            return Boolean.TRUE.equals(this.fb.get(this.zg));
        }
        return false;
    }

    private void hhw() {
        if (this.fs == null) {
            this.fs = new TTAdDislikeToast(this.btk);
            ((FrameLayout) this.btk.findViewById(R.id.content)).addView(this.fs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nps() {
        TTAdDislikeToast tTAdDislikeToast = this.fs;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    public void zmn() {
        TTAdDislikeToast tTAdDislikeToast = this.fs;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }
}
