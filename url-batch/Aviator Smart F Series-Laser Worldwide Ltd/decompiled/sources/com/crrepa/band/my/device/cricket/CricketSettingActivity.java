package com.crrepa.band.my.device.cricket;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityCricketSettingBinding;
import com.crrepa.band.my.device.cricket.CricketSettingDialog;
import com.crrepa.band.my.device.cricket.model.provider.CricketSettingProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.s0;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes2.dex */
public class CricketSettingActivity extends BaseVBActivity<ActivityCricketSettingBinding> {
    private final int reminderTime = CricketSettingProvider.getStartReminderTime();
    private final boolean scoreReminder = CricketSettingProvider.getScoreReminder();
    private CricketSettingDialog settingDialog;

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) CricketSettingActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        showSettingDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onStop$2(Context context) {
        com.crrepa.band.my.device.cricket.notify.d.getInstance().setGameReminder(context, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$3(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSettingDialog$4(int i8, String str) {
        CricketSettingProvider.saveStartReminderTime(i8);
        ((ActivityCricketSettingBinding) this.binding).tvStartTime.setText(str);
    }

    private void setTitle() {
        ((ActivityCricketSettingBinding) this.binding).includedTitle.ivBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityCricketSettingBinding) this.binding).includedTitle.tvTitle.setText(getString(R.string.gps_setting_training_title));
        ((ActivityCricketSettingBinding) this.binding).includedTitle.ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.cricket.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CricketSettingActivity.this.lambda$setTitle$3(view);
            }
        });
    }

    private void showSettingDialog() {
        CricketSettingDialog cricketSettingDialog = new CricketSettingDialog(this);
        this.settingDialog = cricketSettingDialog;
        cricketSettingDialog.setSelectedItemPosition(0);
        this.settingDialog.setShowBottom();
        this.settingDialog.setOnDoneClickListener(new CricketSettingDialog.a() { // from class: com.crrepa.band.my.device.cricket.i
            @Override // com.crrepa.band.my.device.cricket.CricketSettingDialog.a
            public final void onDone(int i8, String str) {
                CricketSettingActivity.this.lambda$showSettingDialog$4(i8, str);
            }
        });
        this.settingDialog.show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        setTitle();
        ((ActivityCricketSettingBinding) this.binding).sbtnScoreReminder.setCheckedNoEvent(this.scoreReminder);
        ((ActivityCricketSettingBinding) this.binding).tvStartTime.setText(CricketSettingProvider.getReminderTimeStr(this, this.reminderTime));
        ((ActivityCricketSettingBinding) this.binding).startReminder.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.cricket.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CricketSettingActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityCricketSettingBinding) this.binding).sbtnScoreReminder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.cricket.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                CricketSettingProvider.saveScoreReminder(z7);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "赛事-设置");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @SuppressLint({"CheckResult"})
    protected void onStop() {
        super.onStop();
        if (this.scoreReminder != CricketSettingProvider.getScoreReminder() || this.reminderTime != CricketSettingProvider.getStartReminderTime()) {
            Observable.just(this).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.cricket.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CricketSettingActivity.lambda$onStop$2((Context) obj);
                }
            }, new com.crrepa.band.my.ble.band.config.b());
        }
        CricketSettingDialog cricketSettingDialog = this.settingDialog;
        if (cricketSettingDialog == null || !cricketSettingDialog.isShowing()) {
            return;
        }
        this.settingDialog.dismiss();
    }
}
