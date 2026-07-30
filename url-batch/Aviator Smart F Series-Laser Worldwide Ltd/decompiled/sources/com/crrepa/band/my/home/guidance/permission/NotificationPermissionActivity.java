package com.crrepa.band.my.home.guidance.permission;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGuidanceNotificationPermissionBinding;
import com.google.android.exoplayer2.ExoPlayer;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class NotificationPermissionActivity extends BaseVBActivity<ActivityGuidanceNotificationPermissionBinding> {
    private ExoPlayer currentPlayer;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        com.crrepa.band.my.home.guidance.c.appPermissionOnGuidancePage("通知", true);
        RequestNotificationPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        com.crrepa.band.my.home.guidance.c.appPermissionOnGuidancePage("通知", false);
        nextPermissionActivity();
    }

    public void RequestNotificationPermission() {
        if (Build.VERSION.SDK_INT >= 33) {
            i.needPermissionWithPermissionCheck(this);
        } else {
            nextPermissionActivity();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.crrepa.band.my.home.guidance.b.setGuidanceState(10);
        ((ActivityGuidanceNotificationPermissionBinding) this.binding).tvTitle.setText(getString(R.string.guidance_permission_notifications_title, getString(R.string.app_name)));
        ((ActivityGuidanceNotificationPermissionBinding) this.binding).tvContent.setText(getString(R.string.guidance_permission_notifications_content, getString(R.string.app_name)));
        ((ActivityGuidanceNotificationPermissionBinding) this.binding).btnEnable.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.permission.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationPermissionActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityGuidanceNotificationPermissionBinding) this.binding).tvNoThanks.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.home.guidance.permission.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationPermissionActivity.this.lambda$initBinding$1(view);
            }
        });
        this.currentPlayer = j.playVideo(((ActivityGuidanceNotificationPermissionBinding) this.binding).playerView, R.raw.guidance_notification_permission);
    }

    public void needPermission() {
        com.crrepa.band.my.home.guidance.c.systemPermissionOnGuidancePage("通知", true);
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
        com.crrepa.band.my.home.guidance.c.systemPermissionOnGuidancePage("通知", false);
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
        i.onRequestPermissionsResult(this, i8, iArr);
    }
}
