package com.crrepa.band.my.home.guidance.permission;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGuidanceLocationPermissionBinding;
import com.google.android.exoplayer2.ExoPlayer;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class LocationPermissionActivity extends BaseVBActivity<ActivityGuidanceLocationPermissionBinding> {
    private ExoPlayer currentPlayer;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        com.crrepa.band.my.home.guidance.c.appPermissionOnGuidancePage("定位", true);
        RequestLocationPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        com.crrepa.band.my.home.guidance.c.appPermissionOnGuidancePage("定位", false);
        nextPermissionActivity();
    }

    public void RequestLocationPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            f.needPermissionWithPermissionCheck(this);
        } else {
            nextPermissionActivity();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.crrepa.band.my.home.guidance.b.setGuidanceState(11);
        ((ActivityGuidanceLocationPermissionBinding) this.binding).tvTitle.setText(getString(R.string.guidance_permission_location_title, getString(R.string.app_name)));
        ((ActivityGuidanceLocationPermissionBinding) this.binding).tvContent.setText(getString(R.string.guidance_permission_location_content, getString(R.string.app_name)));
        ((ActivityGuidanceLocationPermissionBinding) this.binding).btnEnable.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.permission.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocationPermissionActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityGuidanceLocationPermissionBinding) this.binding).tvNoThanks.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.permission.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocationPermissionActivity.this.lambda$initBinding$1(view);
            }
        });
        this.currentPlayer = j.playVideo(((ActivityGuidanceLocationPermissionBinding) this.binding).playerView, R.raw.guidance_location_permission);
    }

    public void needPermission() {
        com.crrepa.band.my.home.guidance.c.systemPermissionOnGuidancePage("定位", true);
        nextPermissionActivity();
    }

    public void nextPermissionActivity() {
        com.crrepa.band.my.home.guidance.a.getInstance().startNextPermissionActivity(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isTaskRoot()) {
            return;
        }
        super.onBackPressed();
    }

    public void onDenied() {
        com.crrepa.band.my.home.guidance.c.systemPermissionOnGuidancePage("定位", false);
        nextPermissionActivity();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ExoPlayer exoPlayer = this.currentPlayer;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
    }

    public void onNeverAskAgain() {
        nextPermissionActivity();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i8, strArr, iArr);
        f.onRequestPermissionsResult(this, i8, iArr);
    }
}
