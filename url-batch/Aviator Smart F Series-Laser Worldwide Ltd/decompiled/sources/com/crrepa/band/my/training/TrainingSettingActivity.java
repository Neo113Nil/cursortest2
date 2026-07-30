package com.crrepa.band.my.training;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.CompoundButton;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityTrainingSettingBinding;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.TrainingSettingTipsFrequencyDialog;
import com.crrepa.band.my.training.map.f0;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.instructions.utils.InstructionsType;

/* loaded from: classes3.dex */
public class TrainingSettingActivity extends BaseVBActivity<ActivityTrainingSettingBinding> {
    public static final String KEY_DISTANCE_TIPS = "key_distance_tips";
    public static final String KEY_STEADY_ON_SCREEN = "key_steady_on_screen";
    public static final String KEY_VIBRATION_TIPS = "key_vibration_tips";
    public static final String KEY_VOICE_TIPS = "key_voice_tips";
    private float selectedDistance = 1.0f;
    private f0 systemTTS;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        showTipsDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initBinding$2(CompoundButton compoundButton, boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(KEY_STEADY_ON_SCREEN, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initBinding$3(CompoundButton compoundButton, boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(KEY_VIBRATION_TIPS, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initBinding$4(CompoundButton compoundButton, boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(KEY_VOICE_TIPS, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showTipsDialog$6(float f8) {
        this.selectedDistance = f8;
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putFloat(KEY_DISTANCE_TIPS, f8);
        setDistance(f8);
    }

    @SuppressLint({"SetTextI18n"})
    private void setDistance(float f8) {
        int i8 = BandUnitSystemProvider.isImperialSystem() ? R.string.distance_unit_miles : R.string.distance_unit_km;
        ((ActivityTrainingSettingBinding) this.binding).tvDistance.setText(f8 + cn.hutool.core.text.l.SPACE + getString(i8));
    }

    private void showTipsDialog() {
        TrainingSettingTipsFrequencyDialog trainingSettingTipsFrequencyDialog = new TrainingSettingTipsFrequencyDialog(this);
        trainingSettingTipsFrequencyDialog.setSelectedDistance(this.selectedDistance);
        trainingSettingTipsFrequencyDialog.setShowBottom();
        trainingSettingTipsFrequencyDialog.show();
        trainingSettingTipsFrequencyDialog.setOnDoneClickListener(new TrainingSettingTipsFrequencyDialog.a() { // from class: com.crrepa.band.my.training.r
            @Override // com.crrepa.band.my.training.TrainingSettingTipsFrequencyDialog.a
            public final void onDone(float f8) {
                TrainingSettingActivity.this.lambda$showTipsDialog$6(f8);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        boolean z7 = com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(KEY_STEADY_ON_SCREEN, true);
        boolean z8 = com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(KEY_VIBRATION_TIPS, false);
        boolean z9 = com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(KEY_VOICE_TIPS, false);
        float f8 = com.moyoung.dafit.module.common.network.provider.g.getInstance().getFloat(KEY_DISTANCE_TIPS, 1.0f);
        this.selectedDistance = f8;
        setDistance(f8);
        ((ActivityTrainingSettingBinding) this.binding).sbOnScreen.setChecked(z7);
        ((ActivityTrainingSettingBinding) this.binding).sbVibrationTips.setChecked(z8);
        ((ActivityTrainingSettingBinding) this.binding).sbVoiceTips.setChecked(z9);
        ((ActivityTrainingSettingBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingSettingActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityTrainingSettingBinding) this.binding).rlTipsFrequency.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingSettingActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityTrainingSettingBinding) this.binding).sbOnScreen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.training.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                TrainingSettingActivity.lambda$initBinding$2(compoundButton, z10);
            }
        });
        ((ActivityTrainingSettingBinding) this.binding).sbVibrationTips.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.training.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                TrainingSettingActivity.lambda$initBinding$3(compoundButton, z10);
            }
        });
        ((ActivityTrainingSettingBinding) this.binding).sbVoiceTips.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.training.w
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                TrainingSettingActivity.lambda$initBinding$4(compoundButton, z10);
            }
        });
        com.moyoung.instructions.c.hook(InstructionsType.TRAINING, ((ActivityTrainingSettingBinding) this.binding).rlTrainingAttention);
        ((ActivityTrainingSettingBinding) this.binding).sbTrainingSyncCard.setChecked(com.crrepa.band.my.training.utils.o.isEnabled());
        ((ActivityTrainingSettingBinding) this.binding).sbTrainingSyncCard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.training.x
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                com.crrepa.band.my.training.utils.o.setEnabled(z10);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        f0 f0Var = this.systemTTS;
        if (f0Var != null) {
            f0Var.destroy();
        }
    }
}
