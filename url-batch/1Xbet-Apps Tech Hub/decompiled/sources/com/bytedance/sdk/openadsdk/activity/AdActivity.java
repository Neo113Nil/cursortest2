package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.core.OT;
import com.bytedance.sdk.openadsdk.core.model.cR;

/* loaded from: classes2.dex */
public class AdActivity extends Activity {
    private icD pvs;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs vG = OT.pvs().vG();
        com.bytedance.sdk.openadsdk.apiImpl.icD.icD Jd = OT.pvs().Jd();
        cR pvs = com.bytedance.sdk.openadsdk.component.reward.pvs.icD.pvs(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.video.vG.icD) null);
        if (pvs != null) {
            icD icd = new icD(this, pvs);
            this.pvs = icd;
            icd.pvs(this, bundle, vG, Jd);
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        icD icd = this.pvs;
        if (icd != null) {
            icd.pvs(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        icD icd = this.pvs;
        if (icd != null) {
            icd.pvs((Activity) this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        icD icd = this.pvs;
        if (icd != null) {
            icd.Jd(this);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        icD icd = this.pvs;
        if (icd != null) {
            icd.vG(this);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        icD icd = this.pvs;
        if (icd != null) {
            icd.icD(this);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        icD icd = this.pvs;
        if (icd != null) {
            icd.NB(this);
        }
        OT.pvs().pvs((com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs) null);
        OT.pvs().pvs((com.bytedance.sdk.openadsdk.apiImpl.icD.icD) null);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        icD icd = this.pvs;
        if (icd != null) {
            icd.pvs(this, bundle);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        icD icd = this.pvs;
        if (icd == null) {
            super.onBackPressed();
        } else {
            icd.Jd();
        }
    }
}
