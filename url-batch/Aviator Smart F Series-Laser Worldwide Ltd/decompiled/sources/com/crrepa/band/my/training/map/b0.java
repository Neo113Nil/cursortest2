package com.crrepa.band.my.training.map;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.moyoung.dafit.module.common.widgets.CircleProgressView;

/* loaded from: classes3.dex */
public class b0 extends Dialog {
    private static final int DEFAULT_ANIMATION_DURATION = 5000;
    private static final int MAX_PERCENT = 100;
    private CircleProgressView cpvCountDown;
    private final float goalValue;
    private ImageView ivGoal;
    private final ValueAnimator mAnimator;
    private TextView tvGoal;
    private final TrainingGoalType type;

    public b0(@NonNull Context context, TrainingGoalType trainingGoalType, float f8) {
        super(context, R.style.GpsTrainingGoalAchievedDialog);
        this.mAnimator = ValueAnimator.ofInt(0, 100);
        this.type = trainingGoalType;
        this.goalValue = f8;
    }

    private void initView() {
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        this.cpvCountDown = (CircleProgressView) findViewById(R.id.cpv_count_down);
        this.tvGoal = (TextView) findViewById(R.id.tv_goal);
        this.ivGoal = (ImageView) findViewById(R.id.iv_goal);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b0.this.lambda$initView$0(view);
            }
        });
        renderTrainingGoal();
        startCountDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCountDown$1(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.cpvCountDown.setProgress(100 - intValue);
        if (intValue >= 100) {
            this.mAnimator.cancel();
            dismiss();
        }
    }

    private void renderTrainingGoal() {
        String string = getContext().getString(R.string.calorie_unit);
        String str = ((int) this.goalValue) + cn.hutool.core.text.l.SPACE;
        TrainingGoalType trainingGoalType = TrainingGoalType.CALORIES;
        TrainingGoalType trainingGoalType2 = this.type;
        if (trainingGoalType == trainingGoalType2) {
            string = getContext().getString(R.string.calorie_unit);
            this.ivGoal.setImageResource(R$drawable.img_calories_achieve);
        } else if (TrainingGoalType.TIME == trainingGoalType2) {
            string = getContext().getString(R.string.goal_minute_unit);
            this.ivGoal.setImageResource(R$drawable.img_time_achieve);
        } else if (TrainingGoalType.DISTANCE == trainingGoalType2) {
            string = BandUnitSystemProvider.isImperialSystem() ? getContext().getString(R.string.distance_unit_miles) : getContext().getString(R.string.distance_unit_km);
            str = com.moyoung.dafit.module.common.utils.n.format(this.goalValue, "0.00");
            this.ivGoal.setImageResource(R$drawable.img_distance_achieve);
        }
        this.tvGoal.setText(getContext().getString(R.string.training_goal_achieved_dialog_content_top, str + cn.hutool.core.text.l.SPACE + string));
    }

    private void startCountDown() {
        this.mAnimator.setDuration(5000L);
        this.mAnimator.setInterpolator(new LinearInterpolator());
        this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.crrepa.band.my.training.map.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b0.this.lambda$startCountDown$1(valueAnimator);
            }
        });
        this.mAnimator.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mAnimator.cancel();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_training_goals_reached);
        initView();
    }
}
