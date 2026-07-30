package com.crrepa.band.my.device.muslim;

import android.content.DialogInterface;
import android.view.View;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityMuslimQiblaDirectionBinding;
import com.crrepa.band.my.device.muslim.view.AccuracyCalibrationDialog;
import com.crrepa.band.my.training.GpsStateChangeReceiver;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.Locale;

/* loaded from: classes2.dex */
public class MuslimDirectionActivity extends BaseVBActivity<ActivityMuslimQiblaDirectionBinding> implements com.crrepa.band.my.device.muslim.view.b {
    private static final String ANGLE_FORMAT = "%d°";
    AccuracyCalibrationDialog accuracyDialog;
    private MaterialDialog locationOpenDialog;
    private GpsStateChangeReceiver receiver;
    private final com.crrepa.band.my.device.muslim.presenter.a presenter = new com.crrepa.band.my.device.muslim.presenter.a();
    private boolean backToFinish = true;

    private void dismissLocationOpenDialog() {
        MaterialDialog materialDialog = this.locationOpenDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        this.locationOpenDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$1(View view) {
        showAccuracyDialog(true, this.presenter.getAccuracy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationOpenDialog$2(MaterialDialog materialDialog, DialogAction dialogAction) {
        com.crrepa.band.my.training.utils.i.startLocationSetting(this, 17);
        this.backToFinish = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationOpenDialog$3(MaterialDialog materialDialog, DialogAction dialogAction) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showLocationOpenDialog$4(DialogInterface dialogInterface) {
        if (!this.backToFinish || this.presenter.isLocationOpen()) {
            return;
        }
        onBackPressed();
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityMuslimQiblaDirectionBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityMuslimQiblaDirectionBinding) vb).topBar.tvTitle, ((ActivityMuslimQiblaDirectionBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityMuslimQiblaDirectionBinding) this.binding).topBar.toolbar);
        ((ActivityMuslimQiblaDirectionBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_qibla_direction_title);
        ((ActivityMuslimQiblaDirectionBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_qibla_direction_title);
        ((ActivityMuslimQiblaDirectionBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityMuslimQiblaDirectionBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MuslimDirectionActivity.this.lambda$setSupportActionBar$0(view);
            }
        });
        ((ActivityMuslimQiblaDirectionBinding) this.binding).topBar.ivHistory.setImageResource(R$drawable.ic_qibla_direction_i);
        ((ActivityMuslimQiblaDirectionBinding) this.binding).topBar.ivHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MuslimDirectionActivity.this.lambda$setSupportActionBar$1(view);
            }
        });
    }

    private void showErrorLocationPager(boolean z7) {
        if (z7) {
            ((ActivityMuslimQiblaDirectionBinding) this.binding).tvGpsOffHint.locationOffHint.setVisibility(0);
            ((ActivityMuslimQiblaDirectionBinding) this.binding).llAngle.setVisibility(8);
            ((ActivityMuslimQiblaDirectionBinding) this.binding).compass.setVisibility(8);
        } else {
            ((ActivityMuslimQiblaDirectionBinding) this.binding).tvGpsOffHint.locationOffHint.setVisibility(8);
            ((ActivityMuslimQiblaDirectionBinding) this.binding).llAngle.setVisibility(0);
            ((ActivityMuslimQiblaDirectionBinding) this.binding).compass.setVisibility(0);
        }
    }

    private void showLocation() {
        if (!this.presenter.isLocationOpen()) {
            renderLocationFailure(false);
        } else if (com.crrepa.band.my.training.utils.i.isPermission(this)) {
            ((ActivityMuslimQiblaDirectionBinding) this.binding).tvGpsOffHint.locationOffHint.setVisibility(8);
            this.presenter.getDirection(this, false);
        } else {
            com.crrepa.band.my.device.muslim.utils.b.setLocationError();
            renderLocationFailure(true);
        }
    }

    private void showLocationOpenDialog() {
        if (this.locationOpenDialog == null) {
            MaterialDialog build = new MaterialDialog.e(this).title(R.string.muslim_location_fail_dialog_title).positiveText(R.string.muslim_settings).negativeText(R.string.muslim_cancel).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.muslim.j
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    MuslimDirectionActivity.this.lambda$showLocationOpenDialog$2(materialDialog, dialogAction);
                }
            }).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.device.muslim.k
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                    MuslimDirectionActivity.this.lambda$showLocationOpenDialog$3(materialDialog, dialogAction);
                }
            }).canceledOnTouchOutside(false).build();
            this.locationOpenDialog = build;
            build.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.crrepa.band.my.device.muslim.l
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    MuslimDirectionActivity.this.lambda$showLocationOpenDialog$4(dialogInterface);
                }
            });
        }
        this.backToFinish = true;
        this.locationOpenDialog.show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        this.presenter.setView(this, this);
        this.receiver = com.crrepa.band.my.device.muslim.utils.b.getInstance().registerGpsStateChangeReceiver(this);
        setSupportActionBar();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        com.crrepa.band.my.device.muslim.utils.b.getInstance().unregisterGpsStateChangeReceiver(this, this.receiver);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        showLocation();
    }

    @Override // com.crrepa.band.my.device.muslim.view.b
    public void renderDeviceAngle(int i8, int i9) {
        ((ActivityMuslimQiblaDirectionBinding) this.binding).tvDeviceAngle.setText(String.format(Locale.getDefault(), ANGLE_FORMAT, Integer.valueOf(i9)));
        ((ActivityMuslimQiblaDirectionBinding) this.binding).compass.setAngle(i8);
    }

    @Override // com.crrepa.band.my.device.muslim.view.b
    public void renderLocationFailure(boolean z7) {
        if (!z7) {
            showLocationOpenDialog();
        } else {
            dismissLocationOpenDialog();
            showErrorLocationPager(true);
        }
    }

    @Override // com.crrepa.band.my.device.muslim.view.b
    public void renderLocationSuccess() {
        dismissLocationOpenDialog();
        showErrorLocationPager(false);
        this.presenter.getDirection(this, true);
    }

    @Override // com.crrepa.band.my.device.muslim.view.b
    public void renderMuslimAngle(int i8) {
        ((ActivityMuslimQiblaDirectionBinding) this.binding).tvMuslimAngle.setText(String.format(Locale.getDefault(), ANGLE_FORMAT, Integer.valueOf(i8)));
        ((ActivityMuslimQiblaDirectionBinding) this.binding).compass.setDestinationAngle(i8);
        showErrorLocationPager(false);
    }

    @Override // com.crrepa.band.my.device.muslim.view.b
    public void showAccuracyDialog(boolean z7, int i8) {
        if (z7) {
            if (this.accuracyDialog == null) {
                this.accuracyDialog = new AccuracyCalibrationDialog(this);
            }
            this.accuracyDialog.setSensorState(i8);
            this.accuracyDialog.show();
            return;
        }
        AccuracyCalibrationDialog accuracyCalibrationDialog = this.accuracyDialog;
        if (accuracyCalibrationDialog == null || !accuracyCalibrationDialog.isShowing()) {
            return;
        }
        this.accuracyDialog.setSensorState(i8);
    }
}
