package com.crrepa.band.my.training.map;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.databinding.ActivityMapTrainingBinding;
import com.crrepa.band.my.databinding.IncludeMapTrainingDetailData1Binding;
import com.crrepa.band.my.databinding.IncludeMapTrainingDetailData2Binding;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.TrainingSettingActivity;
import com.crrepa.band.my.training.goalsetting.GpsTrainingGoalActivity;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.crrepa.band.my.training.model.TrainingRecordSyncEvent;
import com.google.android.gms.maps.MapView;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.y0;
import com.moyoung.dafit.module.common.widgets.d;

/* loaded from: classes3.dex */
public abstract class BaseMapTrainingActivity extends BaseVBActivity<ActivityMapTrainingBinding> implements c0 {
    public static final String DEFAULT_PACE = "--’--”";
    public static final int LOCATION_INTERVAL = 2000;
    public static final float MAP_ZOOM_VALUE = 16.0f;
    public static final String TRAINING_TYPE = "training_type";
    private boolean achieved;
    private b0 goalAchievedDialog;
    private TrainingGoalType goalType;
    private float goalValue;
    protected MapView googleMapView;
    private ImageView ivTrainingHr;
    private ImageView ivTrainingHrTips;
    private MaterialDialog loadingDialog;
    private int nowTemperature;
    private boolean pause;
    public f0 systemTTS;
    private TextView tvTrainingCalories;
    private TextView tvTrainingDetail1;
    private TextView tvTrainingDetail2;
    private TextView tvTrainingDetail3;
    private TextView tvTrainingDetailName1;
    private TextView tvTrainingDetailName2;
    private TextView tvTrainingDetailName3;
    private TextView tvTrainingDistance;
    private TextView tvTrainingHr;
    private TextView tvTrainingPace;
    private TextView tvTrainingTime;
    private int weatherCode;
    protected com.crrepa.band.my.training.presenter.f presenter = new com.crrepa.band.my.training.presenter.f();
    private final com.moyoung.dafit.module.common.widgets.d countDownTimer = new com.moyoung.dafit.module.common.widgets.d();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType;

        static {
            int[] iArr = new int[TrainingGoalType.values().length];
            $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType = iArr;
            try {
                iArr[TrainingGoalType.TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType[TrainingGoalType.PACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType[TrainingGoalType.CALORIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static Intent getCallingIntent(Context context, GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        Intent intent = new Intent(context, (Class<?>) GoogleMapTrainingActivity.class);
        intent.putExtra(TRAINING_TYPE, gpsTrainingType);
        return intent;
    }

    @NonNull
    private static Intent getIntentByType(Context context, GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        return (gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_WALKING || gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING) ? new Intent(context, (Class<?>) NoMapTrainingActivity.class) : new Intent(context, (Class<?>) GoogleMapTrainingActivity.class);
    }

    private GpsTrainingModel.GpsTrainingType getTrainingType() {
        return (GpsTrainingModel.GpsTrainingType) getIntent().getSerializableExtra(TRAINING_TYPE);
    }

    private void initDetailDataView() {
        VB vb = this.binding;
        IncludeMapTrainingDetailData1Binding includeMapTrainingDetailData1Binding = ((ActivityMapTrainingBinding) vb).includeData1;
        IncludeMapTrainingDetailData2Binding includeMapTrainingDetailData2Binding = ((ActivityMapTrainingBinding) vb).includeData2;
        if (isOutdoorMode()) {
            this.ivTrainingHr = includeMapTrainingDetailData1Binding.ivTrainingHr;
            this.ivTrainingHrTips = includeMapTrainingDetailData1Binding.ivTrainingHrTips;
            this.tvTrainingHr = includeMapTrainingDetailData1Binding.tvTrainingHr;
            this.tvTrainingDetail1 = includeMapTrainingDetailData1Binding.tvTrainingDetail1;
            this.tvTrainingDetail2 = includeMapTrainingDetailData1Binding.tvTrainingDetail2;
            this.tvTrainingDetail3 = includeMapTrainingDetailData1Binding.tvTrainingDetail3;
            this.tvTrainingDetailName1 = includeMapTrainingDetailData1Binding.tvTrainingDetailName1;
            this.tvTrainingDetailName2 = includeMapTrainingDetailData1Binding.tvTrainingDetailName2;
            this.tvTrainingDetailName3 = includeMapTrainingDetailData1Binding.tvTrainingDetailName3;
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((ActivityMapTrainingBinding) this.binding).llTrainingDetail.getLayoutParams());
        layoutParams.setMargins(0, com.moyoung.dafit.module.common.utils.o.dp2px(this, 124.0f), 0, 0);
        ((ActivityMapTrainingBinding) this.binding).llTrainingDetail.setLayoutParams(layoutParams);
        ((ActivityMapTrainingBinding) this.binding).tvTrainingCurrentValue.setTextSize(2, 60.0f);
        ((ActivityMapTrainingBinding) this.binding).tvTrainingGoalValue.setTextSize(2, 30.0f);
        ((ActivityMapTrainingBinding) this.binding).rlMapContainer.setVisibility(8);
        includeMapTrainingDetailData1Binding.llTrainingDetailData.setVisibility(8);
        includeMapTrainingDetailData2Binding.llTrainingDetailData.setVisibility(0);
        this.ivTrainingHr = includeMapTrainingDetailData2Binding.ivTrainingHr;
        this.ivTrainingHrTips = includeMapTrainingDetailData2Binding.ivTrainingHrTips;
        this.tvTrainingHr = includeMapTrainingDetailData2Binding.tvTrainingHr;
        this.tvTrainingDetail1 = includeMapTrainingDetailData2Binding.tvTrainingDetail1;
        this.tvTrainingDetail3 = includeMapTrainingDetailData2Binding.tvTrainingDetail3;
        this.tvTrainingDetailName1 = includeMapTrainingDetailData2Binding.tvTrainingDetailName1;
        this.tvTrainingDetailName3 = includeMapTrainingDetailData2Binding.tvTrainingDetailName3;
    }

    private void initListener() {
        ((ActivityMapTrainingBinding) this.binding).ivLocation.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMapTrainingActivity.this.lambda$initListener$0(view);
            }
        });
        ((ActivityMapTrainingBinding) this.binding).btnTrainingPause.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMapTrainingActivity.this.lambda$initListener$1(view);
            }
        });
        ((ActivityMapTrainingBinding) this.binding).btnTrainingEnd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMapTrainingActivity.this.lambda$initListener$2(view);
            }
        });
        ((ActivityMapTrainingBinding) this.binding).btnScreenLock.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMapTrainingActivity.this.lambda$initListener$4(view);
            }
        });
        ((ActivityMapTrainingBinding) this.binding).ivSetting.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMapTrainingActivity.this.lambda$initListener$5(view);
            }
        });
        this.ivTrainingHrTips.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMapTrainingActivity.this.lambda$initListener$6(view);
            }
        });
        ((ActivityMapTrainingBinding) this.binding).viewSignalWeak.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.map.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMapTrainingActivity.this.lambda$initListener$7(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        renderMapCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$1(View view) {
        if (TextUtils.equals(((ActivityMapTrainingBinding) this.binding).btnTrainingPause.getText().toString(), getString(R.string.training_pause))) {
            setTrainingPause(true);
        } else {
            setTrainingResume(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(View view) {
        this.presenter.stopTraining();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$3() {
        ((ActivityMapTrainingBinding) this.binding).llTrainingState.setVisibility(0);
        ((ActivityMapTrainingBinding) this.binding).rlScreenUnlock.setVisibility(4);
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$4(View view) {
        ((ActivityMapTrainingBinding) this.binding).llTrainingState.setVisibility(8);
        ((ActivityMapTrainingBinding) this.binding).rlScreenUnlock.setVisibility(0);
        ((ActivityMapTrainingBinding) this.binding).progressViewUnlock.setOnCompleteListener(new d.b() { // from class: com.crrepa.band.my.training.map.a
            @Override // com.moyoung.dafit.module.common.widgets.d.b
            public final void onComplete() {
                BaseMapTrainingActivity.this.lambda$initListener$3();
            }
        });
        getWindow().addFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$5(View view) {
        startActivity(new Intent(this, (Class<?>) TrainingSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$6(View view) {
        showTrainingHrTipsDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$7(View view) {
        showSignalWeakDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTrainingTimeLessDialog$9() {
        renderStop(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showEnableGpsDialog$8() {
        com.crrepa.band.my.training.utils.i.startLocationSetting(this, 17);
    }

    private void renderPaceGoalAchieved(int i8, int i9) {
        if (i9 <= i8) {
            if (this.achieved) {
                return;
            }
            renderGoalAchieved();
        } else if (this.achieved) {
            y0.getInstance().vibrate(this, new long[]{200, 1000, 500, 1000, 200}, false);
            ((ActivityMapTrainingBinding) this.binding).tvTrainingCurrentValue.setTextColor(ContextCompat.getColor(this, R.color.black));
            ((ActivityMapTrainingBinding) this.binding).tvTrainingGoalAchieved.setVisibility(4);
            this.achieved = false;
        }
    }

    private void setTrainingDetail() {
        this.tvTrainingDistance = ((ActivityMapTrainingBinding) this.binding).tvTrainingCurrentValue;
        this.tvTrainingTime = this.tvTrainingDetail1;
        this.tvTrainingPace = this.tvTrainingDetail2;
        this.tvTrainingCalories = this.tvTrainingDetail3;
        this.tvTrainingDetailName1.setText(R.string.total_run_time);
        TextView textView = this.tvTrainingDetailName2;
        if (textView != null) {
            textView.setText(R.string.pace);
        }
        this.tvTrainingDetailName3.setText(R.string.calorie_unit);
        int i8 = BandUnitSystemProvider.isImperialSystem() ? R.string.distance_unit_miles : R.string.distance_unit_km;
        if (this.goalType == null) {
            ((ActivityMapTrainingBinding) this.binding).lineTrainingDefault.setVisibility(0);
        } else {
            ((ActivityMapTrainingBinding) this.binding).progressbarTrainingGoal.setVisibility(0);
            int i9 = a.$SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType[this.goalType.ordinal()];
            if (i9 == 1) {
                this.tvTrainingDistance = this.tvTrainingDetail1;
                this.tvTrainingTime = ((ActivityMapTrainingBinding) this.binding).tvTrainingCurrentValue;
                this.tvTrainingDetailName1.setText(i8);
            } else if (i9 == 2) {
                this.tvTrainingDistance = this.tvTrainingDetail2;
                this.tvTrainingPace = ((ActivityMapTrainingBinding) this.binding).tvTrainingCurrentValue;
                TextView textView2 = this.tvTrainingDetailName2;
                if (textView2 != null) {
                    textView2.setText(i8);
                }
                ((ActivityMapTrainingBinding) this.binding).progressbarTrainingGoal.setSecondaryProgress(50);
            } else if (i9 == 3) {
                this.tvTrainingDistance = this.tvTrainingDetail3;
                this.tvTrainingCalories = ((ActivityMapTrainingBinding) this.binding).tvTrainingCurrentValue;
                this.tvTrainingDetailName3.setText(i8);
            }
        }
        TextView textView3 = this.tvTrainingDistance;
        if (textView3 != null) {
            textView3.setText(R.string.data_blank);
        }
        TextView textView4 = this.tvTrainingPace;
        if (textView4 != null) {
            textView4.setText(R.string.data_blank);
        }
        this.tvTrainingTime.setText(R.string.data_blank);
        this.tvTrainingCalories.setText(R.string.data_blank);
    }

    private void setTrainingPause(boolean z7) {
        ((ActivityMapTrainingBinding) this.binding).btnScreenLock.setVisibility(8);
        ((ActivityMapTrainingBinding) this.binding).btnTrainingEnd.setVisibility(0);
        ((ActivityMapTrainingBinding) this.binding).shadowTrainingEnd.setVisibility(0);
        ((ActivityMapTrainingBinding) this.binding).btnTrainingPause.setText(R.string.training_continue);
        if (isOutdoorMode()) {
            removeLocation();
            this.presenter.addPausePoint();
        }
        this.presenter.pauseTraining(z7);
    }

    private void setTrainingResume(boolean z7) {
        ((ActivityMapTrainingBinding) this.binding).btnScreenLock.setVisibility(0);
        ((ActivityMapTrainingBinding) this.binding).btnTrainingEnd.setVisibility(8);
        ((ActivityMapTrainingBinding) this.binding).shadowTrainingEnd.setVisibility(8);
        ((ActivityMapTrainingBinding) this.binding).btnTrainingPause.setText(R.string.training_pause);
        this.presenter.resumeTraining(z7);
        if (isOutdoorMode()) {
            requestLocation();
        }
    }

    private void showDistanceTips(double d8) {
        if (this.presenter.isShowDistanceTips(d8)) {
            if (com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(TrainingSettingActivity.KEY_VIBRATION_TIPS, false)) {
                y0.getInstance().vibrate(this, new long[]{200, 1000, 200}, false);
            }
            if (com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(TrainingSettingActivity.KEY_VOICE_TIPS, false)) {
                this.systemTTS.playText(com.crrepa.band.my.training.presenter.f.getTTSContent(this, Double.valueOf(d8)));
            }
        }
    }

    private void showEnableGpsDialog() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.setContentTxt(R.string.enable_gps_hint);
        customConfirmDialog.setOkTxt(R.string.enable);
        customConfirmDialog.setCancelTxt(R.string.cancel);
        customConfirmDialog.getCancelTv().setTextColor(getResources().getColor(R.color.color_gps_training));
        customConfirmDialog.getTitleTv().setTextSize(2, 17.0f);
        customConfirmDialog.getTitleTv().setTypeface(Typeface.defaultFromStyle(0));
        customConfirmDialog.show();
        customConfirmDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.crrepa.band.my.training.map.c
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                BaseMapTrainingActivity.this.lambda$showEnableGpsDialog$8();
            }
        });
    }

    private void showGoalAchievedDialog() {
        if (this.goalAchievedDialog != null || this.pause) {
            return;
        }
        b0 b0Var = new b0(this, this.goalType, this.goalValue);
        this.goalAchievedDialog = b0Var;
        b0Var.show();
    }

    private void showIsSteadyOnScreen() {
        if (com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(TrainingSettingActivity.KEY_STEADY_ON_SCREEN, true)) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
    }

    private void showSignalWeakDialog() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setTitleTxt(R.string.gps_exercise_signal_tip);
        customConfirmDialog.setOkTxt(R.string.i_kow);
        customConfirmDialog.setContentTxt(R.string.gps_exercise_signal_content);
        customConfirmDialog.getContentTv().setGravity(GravityCompat.START);
        customConfirmDialog.getContentTv().setLineSpacing(1.0f, 1.3f);
        customConfirmDialog.getOkTv().setTextColor(getResources().getColor(R.color.color_gps_training));
        customConfirmDialog.hideCancelTv();
        customConfirmDialog.show();
    }

    private void showTrainingHrTipsDialog() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setTitleTxt(R.string.gps_exercise_hr_tip);
        customConfirmDialog.setOkTxt(R.string.i_kow);
        customConfirmDialog.setContentTxt(R.string.gps_exercise_hr_message);
        customConfirmDialog.getOkTv().setTextColor(getResources().getColor(R.color.color_gps_training));
        customConfirmDialog.hideCancelTv();
        customConfirmDialog.show();
    }

    private void startCountDownTimer() {
        if (isOutdoorMode() && !com.crrepa.band.my.training.utils.i.isEnable(this)) {
            showEnableGpsDialog();
            return;
        }
        ((ActivityMapTrainingBinding) this.binding).rlCountDownTimer.setVisibility(0);
        this.presenter.setTrainingGoal(this, this.goalType, this.goalValue);
        if (isOutdoorMode()) {
            this.presenter.setTrainingWeather(this.nowTemperature, this.weatherCode);
        }
        this.presenter.startTraining(getTrainingType());
        setTrainingDetail();
        this.countDownTimer.setTextView(((ActivityMapTrainingBinding) this.binding).tvCountDown).setShowGo(true).setOnCompleteListener(new d.b() { // from class: com.crrepa.band.my.training.map.d
            @Override // com.moyoung.dafit.module.common.widgets.d.b
            public final void onComplete() {
                BaseMapTrainingActivity.this.startTraining();
            }
        });
        this.countDownTimer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTraining() {
        k0.setLightMode(this);
        ((ActivityMapTrainingBinding) this.binding).rlCountDownTimer.setVisibility(8);
        ((ActivityMapTrainingBinding) this.binding).llTrainingDetail.setVisibility(0);
        y0.getInstance().vibrate(this, new long[]{200, 500, 200}, false);
        if (isOutdoorMode()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((ActivityMapTrainingBinding) this.binding).gpsSignalView.getLayoutParams();
            layoutParams.topMargin = com.moyoung.dafit.module.common.utils.o.dp2px(this, 54.0f);
            ((ActivityMapTrainingBinding) this.binding).gpsSignalView.setLayoutParams(layoutParams);
        }
        this.presenter.startTimer();
        GPSTrainingService.start(this, this.presenter.isPhoneStepsCounter);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    public abstract int getMapType();

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        initDetailDataView();
        initListener();
        this.googleMapView = ((ActivityMapTrainingBinding) this.binding).googleMapView;
        this.systemTTS = new f0(this);
        this.presenter.setView(this);
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            this.presenter.isPhoneStepsCounter = false;
        }
        if (isOutdoorMode()) {
            this.presenter.registerTimerLocation(this);
            this.presenter.registerGpsStateChangeReceiver(this);
        }
        if (isOutdoorMode()) {
            this.nowTemperature = getIntent().getIntExtra("nowTemperature", 10000);
            this.weatherCode = getIntent().getIntExtra("weatherCode", -1);
        }
        this.goalType = (TrainingGoalType) getIntent().getSerializableExtra(GpsTrainingGoalActivity.TRAINING_GOAL_TYPE);
        this.goalValue = getIntent().getFloatExtra(GpsTrainingGoalActivity.TRAINING_GOAL_VALUE, 0.0f);
        showIsSteadyOnScreen();
        startCountDownTimer();
    }

    public boolean isOutdoorMode() {
        return this.presenter.isMapMode(getTrainingType());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.moyoung.dafit.module.common.widgets.d dVar = this.countDownTimer;
        if (dVar != null) {
            dVar.cancel();
        }
        if (isOutdoorMode()) {
            this.presenter.unregisterTimerLocation(this);
            this.presenter.unregisterGpsStateChangeReceiver(this);
        }
        this.presenter.destroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (i8 == 4) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.pause = true;
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.pause = false;
        if (this.achieved && this.goalType != TrainingGoalType.PACE) {
            showGoalAchievedDialog();
        }
        this.presenter.resume();
        showIsSteadyOnScreen();
        s0.logPage(getClass(), "GPS地图页");
    }

    @Override // com.crrepa.band.my.training.map.c0
    public abstract void removeLocation();

    @Override // com.crrepa.band.my.training.map.c0
    public void renderAveragePace(int i8) {
        if (this.goalType != TrainingGoalType.PACE) {
            return;
        }
        int i9 = (int) (this.goalValue * 60.0f);
        int goalPaceProgress = com.crrepa.band.my.training.presenter.f.getGoalPaceProgress(i8, i9);
        if (i8 > 0) {
            renderPaceGoalAchieved(i9, i8);
        }
        com.orhanobut.logger.f.d("renderGoalPace: " + goalPaceProgress);
        ((ActivityMapTrainingBinding) this.binding).progressbarTrainingGoal.setProgress(goalPaceProgress);
        this.tvTrainingPace.setText(com.crrepa.band.my.training.utils.e.formatPace(i8));
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderCalories(float f8) {
        this.tvTrainingCalories.setText(com.moyoung.dafit.module.common.utils.n.format(f8, "0"));
        if (this.goalType == TrainingGoalType.CALORIES) {
            int i8 = (int) ((f8 / this.goalValue) * 100.0f);
            ((ActivityMapTrainingBinding) this.binding).progressbarTrainingGoal.setProgress(i8);
            if (this.achieved || i8 < 100) {
                return;
            }
            renderGoalAchieved();
            showGoalAchievedDialog();
        }
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderDistance(double d8) {
        if (this.goalType == TrainingGoalType.DISTANCE) {
            int i8 = (int) ((d8 / this.goalValue) * 100.0d);
            ((ActivityMapTrainingBinding) this.binding).progressbarTrainingGoal.setProgress(i8);
            if (!this.achieved && i8 >= 100) {
                renderGoalAchieved();
                showGoalAchievedDialog();
            }
        }
        this.tvTrainingDistance.setText(com.moyoung.dafit.module.common.utils.n.format(d8, "0.00"));
        showDistanceTips(d8);
    }

    public void renderGoalAchieved() {
        m1.a.showGoalArchivedNotification(this);
        y0.getInstance().vibrate(this, new long[]{200, 1000, 200}, false);
        if (com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(TrainingSettingActivity.KEY_VOICE_TIPS, false)) {
            this.systemTTS.playText(getString(R.string.gps_map_voic_broadcast_goal_achieved_text));
        }
        ((ActivityMapTrainingBinding) this.binding).tvTrainingCurrentValue.setTextColor(ContextCompat.getColor(this, R.color.color_gps_training));
        ((ActivityMapTrainingBinding) this.binding).tvTrainingGoalAchieved.setVisibility(0);
        this.achieved = true;
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderGpsTraining(long j8) {
        com.orhanobut.logger.f.d("renderGpsTraining: " + j8);
        MaterialDialog materialDialog = this.loadingDialog;
        if (materialDialog != null && materialDialog.isShowing()) {
            this.loadingDialog.dismiss();
        }
        if (j8 > 0) {
            startActivity(BaseTrainingPathActivity.getCallingIntent(this, j8, getMapType(), false));
            org.greenrobot.eventbus.c.getDefault().post(new TrainingRecordSyncEvent(TrainingRecordSyncEvent.SyncStatus.HIDE));
        }
        m1.a.hideGoalArchivedNotification(this);
        finish();
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderHeartRate(int i8) {
        this.tvTrainingHr.setText(String.valueOf(i8));
        this.ivTrainingHr.setVisibility(0);
        this.ivTrainingHrTips.setVisibility(8);
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderLoadingHeartRate() {
        this.loadingDialog = new MaterialDialog.e(this).progressIndeterminateStyle(false).progress(true, 100).content(R.string.loading).cancelable(false).show();
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderLocationAccuracy(float f8) {
        if (isOutdoorMode()) {
            ((ActivityMapTrainingBinding) this.binding).gpsSignalView.setLocationAccuracy(f8);
            ((ActivityMapTrainingBinding) this.binding).viewSignalWeak.setVisibility(f8 >= 20.0f ? 0 : 8);
        }
    }

    @Override // com.crrepa.band.my.training.map.c0
    public abstract /* synthetic */ void renderMapCamera();

    @Override // com.crrepa.band.my.training.map.c0
    public void renderPace(int i8) {
        TextView textView = this.tvTrainingPace;
        if (textView == null || this.goalType == TrainingGoalType.PACE) {
            return;
        }
        if (i8 > 0) {
            textView.setText(com.crrepa.band.my.training.utils.e.formatPace(i8));
        } else {
            textView.setText(DEFAULT_PACE);
        }
    }

    @Override // com.crrepa.band.my.training.map.c0
    public abstract /* synthetic */ void renderPathLine(double d8, double d9, double d10, double d11);

    @Override // com.crrepa.band.my.training.map.c0
    public void renderPause() {
        setTrainingPause(false);
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderResume() {
        setTrainingResume(false);
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderSteps(int i8) {
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderStop(boolean z7) {
        if (isOutdoorMode()) {
            removeLocation();
        }
        this.presenter.stopTraining(getMapType(), z7);
        GPSTrainingService.stop(this);
        f0 f0Var = this.systemTTS;
        if (f0Var != null) {
            f0Var.destroy();
        }
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderTime(int i8) {
        if (this.goalType == TrainingGoalType.TIME) {
            int i9 = (int) ((i8 / (this.goalValue * 60.0f)) * 100.0f);
            ((ActivityMapTrainingBinding) this.binding).progressbarTrainingGoal.setProgress(i9);
            if (!this.achieved && i9 >= 100) {
                renderGoalAchieved();
                showGoalAchievedDialog();
            }
        }
        this.tvTrainingTime.setText(com.crrepa.band.my.training.utils.e.getTrainingTimeStr(this, i8));
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderTrainStartedTips() {
        r0.showShort(this, R.string.gps_training_alert_unable_start_exercise_content);
        finish();
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderTrainingGoal(String str) {
        TrainingGoalType trainingGoalType = this.goalType;
        if (trainingGoalType == null || trainingGoalType != TrainingGoalType.TIME) {
            ((ActivityMapTrainingBinding) this.binding).tvTrainingGoalValue.setText(str);
            return;
        }
        ((ActivityMapTrainingBinding) this.binding).tvTimeGoalValue.setText(str);
        ((ActivityMapTrainingBinding) this.binding).tvTimeGoalValue.setVisibility(0);
        ((ActivityMapTrainingBinding) this.binding).tvTrainingGoalValue.setVisibility(8);
    }

    @Override // com.crrepa.band.my.training.map.c0
    public void renderTrainingTimeLessDialog() {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setNoTitleMode();
        customConfirmDialog.setContentTxt(R.string.training_end_less_than_dialog_title);
        customConfirmDialog.setOkTxt(R.string.training_continue);
        customConfirmDialog.setCancelTxt(R.string.confirm);
        customConfirmDialog.getOkTv().setTextColor(getResources().getColor(R.color.color_gps_training));
        customConfirmDialog.getTitleTv().setTextSize(2, 17.0f);
        customConfirmDialog.getTitleTv().setTypeface(Typeface.defaultFromStyle(0));
        customConfirmDialog.show();
        customConfirmDialog.setOnCancelClick(new BaseCustomConfirmDialog.a() { // from class: com.crrepa.band.my.training.map.e
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.a
            public final void onCancel() {
                BaseMapTrainingActivity.this.lambda$renderTrainingTimeLessDialog$9();
            }
        });
    }

    @Override // com.crrepa.band.my.training.map.c0
    public abstract void requestLocation();

    public static Intent getCallingIntent(Context context, GpsTrainingModel.GpsTrainingType gpsTrainingType, int i8, int i9) {
        Intent intentByType = getIntentByType(context, gpsTrainingType);
        intentByType.putExtra(TRAINING_TYPE, gpsTrainingType);
        intentByType.putExtra("nowTemperature", i8);
        intentByType.putExtra("weatherCode", i9);
        return intentByType;
    }

    public static Intent getCallingIntent(Context context, GpsTrainingModel.GpsTrainingType gpsTrainingType, TrainingGoalType trainingGoalType, float f8, int i8, int i9) {
        Intent intentByType = getIntentByType(context, gpsTrainingType);
        intentByType.putExtra(TRAINING_TYPE, gpsTrainingType);
        intentByType.putExtra(GpsTrainingGoalActivity.TRAINING_GOAL_TYPE, trainingGoalType);
        intentByType.putExtra(GpsTrainingGoalActivity.TRAINING_GOAL_VALUE, f8);
        intentByType.putExtra("nowTemperature", i8);
        intentByType.putExtra("weatherCode", i9);
        return intentByType;
    }
}
