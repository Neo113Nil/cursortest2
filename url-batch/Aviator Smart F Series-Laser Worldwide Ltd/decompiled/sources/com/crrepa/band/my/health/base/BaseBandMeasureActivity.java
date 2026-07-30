package com.crrepa.band.my.health.base;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.moyoung.dafit.module.common.utils.r0;

/* loaded from: classes2.dex */
public abstract class BaseBandMeasureActivity extends BaseBandStatisticsActivity {
    private boolean measuring = false;
    private MaterialDialog stopMeasureDialog;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseBandMeasureActivity.this.onMeasureClicled();
        }
    }

    class b implements MaterialDialog.l {
        b() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            BaseBandMeasureActivity.this.stopMeasure();
            BaseBandMeasureActivity.this.finish();
        }
    }

    class c implements MaterialDialog.l {
        c() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
        }
    }

    private void dismissStopMeasureDailog() {
        MaterialDialog materialDialog = this.stopMeasureDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        this.stopMeasureDialog.dismiss();
    }

    private void setMeasureButton() {
        this.binding.btnBandMeasure.setBackgroundResource(getMeasureButtonResource());
    }

    private void showStartMeasureButtonText() {
        this.binding.btnBandMeasure.setText(getStartMeasureText());
    }

    private void showStopMeasureButtonText() {
        this.binding.btnBandMeasure.setText(getStopMeasureText());
    }

    private void showStopMeasureDailog() {
        this.stopMeasureDialog = new MaterialDialog.e(this).title(R.string.stop_measure_hint_title).content(R.string.stop_measure_hint_content).negativeText(R.string.cancel).positiveText(R.string.confirm).onNegative(new c()).onPositive(new b()).show();
    }

    protected abstract int getMeasureButtonResource();

    protected abstract int getStartMeasureText();

    protected abstract int getStopMeasureText();

    public boolean isMeasuring() {
        return this.measuring;
    }

    public void measureComplete() {
        showStartMeasureButtonText();
        setMeasuring(false);
        dismissStopMeasureDailog();
    }

    public void onBack() {
        if (isMeasuring() && com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            showStopMeasureDailog();
        } else {
            finish();
        }
    }

    @Override // com.crrepa.band.my.health.base.BaseBandStatisticsActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setMeasureButton();
        showStartMeasureButtonText();
        this.binding.btnBandMeasure.setOnClickListener(new a());
    }

    public void onMeasureClicled() {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            r0.showLong(this, getString(R.string.band_setting_send_fail));
            return;
        }
        if (BandBatteryProvider.isMeasureLowBattery()) {
            r0.showLong(this, getString(R.string.measure_low_battery_hint));
            return;
        }
        if (isMeasuring()) {
            stopMeasure();
            showStartMeasureButtonText();
            setMeasuring(false);
        } else {
            startMeasure();
            showStopMeasureButtonText();
            setMeasuring(true);
        }
    }

    public void setMeasuring(boolean z7) {
        this.measuring = z7;
    }

    public void showMeasureButton(boolean z7) {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            this.binding.bandMeasureView.setVisibility(8);
        } else if (z7) {
            this.binding.bandMeasureView.setVisibility(0);
        } else {
            this.binding.bandMeasureView.setVisibility(8);
        }
    }

    protected abstract void startMeasure();

    protected abstract void stopMeasure();
}
