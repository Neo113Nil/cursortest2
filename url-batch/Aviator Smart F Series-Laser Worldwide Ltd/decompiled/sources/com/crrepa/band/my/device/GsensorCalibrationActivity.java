package com.crrepa.band.my.device;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityGsensorCalibrationBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes2.dex */
public class GsensorCalibrationActivity extends BaseVBActivity<ActivityGsensorCalibrationBinding> {
    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) GsensorCalibrationActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        r0.showLong(this, i4.getInstance().sendGSensorCalibration() ? getString(R.string.calibration_complete) : getString(R.string.band_setting_send_fail));
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityGsensorCalibrationBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityGsensorCalibrationBinding) vb).includeTitle.tvTitle, ((ActivityGsensorCalibrationBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityGsensorCalibrationBinding) this.binding).includeTitle.toolbar);
    }

    private void setTitle() {
        ((ActivityGsensorCalibrationBinding) this.binding).includeTitle.tvTitle.setText(R.string.quick_view_calibration);
        ((ActivityGsensorCalibrationBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.quick_view_calibration);
        ((ActivityGsensorCalibrationBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        setActionBar();
        setTitle();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityGsensorCalibrationBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GsensorCalibrationActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityGsensorCalibrationBinding) this.binding).btnCalibration.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GsensorCalibrationActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }
}
