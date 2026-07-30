package com.crrepa.band.my.training.goalsetting;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityGpsTrainingGoalBinding;
import com.crrepa.band.my.home.training.HomeTrainingFragment;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.training.RequestLocationActivity;
import com.crrepa.band.my.training.map.BaseMapTrainingActivity;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.c0;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.o0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public class GpsTrainingGoalActivity extends BaseVBActivity<ActivityGpsTrainingGoalBinding> {
    public static final String TRAINING_GOAL_TYPE = "training_goal_type";
    public static final String TRAINING_GOAL_VALUE = "training_goal_value";
    private ContentPagerAdapter pagerAdapter;

    public static Intent getCallingIntent(Context context, GpsTrainingModel.GpsTrainingType gpsTrainingType, int i8, int i9) {
        Intent intent = new Intent(context, (Class<?>) GpsTrainingGoalActivity.class);
        intent.putExtra(BaseMapTrainingActivity.TRAINING_TYPE, gpsTrainingType);
        intent.putExtra("nowTemperature", i8);
        intent.putExtra("weatherCode", i9);
        return intent;
    }

    @NonNull
    public static String getLastGoalKey(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        return "LAST_GOAL_" + gpsTrainingType.getValue();
    }

    private void initViewPager() {
        this.pagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        GpsTrainingModel.GpsTrainingType gpsTrainingType = (GpsTrainingModel.GpsTrainingType) getIntent().getSerializableExtra(BaseMapTrainingActivity.TRAINING_TYPE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GpsTrainingDistanceGoalFragment(gpsTrainingType));
        arrayList.add(new GpsTrainingTimeGoalFragment(gpsTrainingType));
        if (isOutdoorMode(gpsTrainingType)) {
            arrayList.add(new GpsTrainingPaceGoalFragment(gpsTrainingType));
        }
        arrayList.add(new GpsTrainingCaloriesGoalFragment(gpsTrainingType));
        this.pagerAdapter.setContentFragments(arrayList);
        ((ActivityGpsTrainingGoalBinding) this.binding).vpGoal.setAdapter(this.pagerAdapter);
        ((ActivityGpsTrainingGoalBinding) this.binding).vpGoal.setOffscreenPageLimit(arrayList.size());
        ((ActivityGpsTrainingGoalBinding) this.binding).tabGoal.setTabMode(1);
        VB vb = this.binding;
        ((ActivityGpsTrainingGoalBinding) vb).tabGoal.setupWithViewPager(((ActivityGpsTrainingGoalBinding) vb).vpGoal);
        int size = arrayList.size();
        int[] iArr = new int[size];
        TrainingGoalType[] trainingGoalTypeArr = new TrainingGoalType[size];
        iArr[0] = R.string.gps_training_goal_set_distance_title;
        trainingGoalTypeArr[0] = TrainingGoalType.DISTANCE;
        iArr[1] = R.string.gps_training_goal_set_time_title;
        trainingGoalTypeArr[1] = TrainingGoalType.TIME;
        char c8 = 2;
        if (isOutdoorMode(gpsTrainingType)) {
            iArr[2] = R.string.gps_training_goal_set_pace_title;
            trainingGoalTypeArr[2] = TrainingGoalType.PACE;
            c8 = 3;
        }
        iArr[c8] = R.string.gps_training_goal_set_cal_title;
        trainingGoalTypeArr[c8] = TrainingGoalType.CALORIES;
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            TabLayout.Tab tabAt = ((ActivityGpsTrainingGoalBinding) this.binding).tabGoal.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setText(iArr[i8 % size]);
            }
            Objects.requireNonNull(tabAt);
            o0.hideTabToast(tabAt);
        }
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(getLastGoalKey(gpsTrainingType), null);
        if (string != null) {
            int parseInt = Integer.parseInt(string.split("_")[0]);
            for (int i9 = 0; i9 < size; i9++) {
                if (parseInt == trainingGoalTypeArr[i9].getValue()) {
                    ((ActivityGpsTrainingGoalBinding) this.binding).vpGoal.setCurrentItem(i9);
                    return;
                }
            }
        }
    }

    private boolean isOutdoorMode(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        return (gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING || gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_WALKING) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        onEnterClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNeedLocationPermission$2(MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        c0.jumpAppDetailsSetting(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showNeedLocationPermission$3(MaterialDialog materialDialog, DialogAction dialogAction) {
    }

    private void onEnterClick() {
        if (!c0.checkSelfPermission(this, HomeTrainingFragment.LOCATION_PERMISSIONS)) {
            showNeedLocationPermission();
            return;
        }
        Fragment item = this.pagerAdapter.getItem(((ActivityGpsTrainingGoalBinding) this.binding).tabGoal.getSelectedTabPosition());
        if (item instanceof BaseGpsTrainingGoalFragment) {
            BaseGpsTrainingGoalFragment baseGpsTrainingGoalFragment = (BaseGpsTrainingGoalFragment) item;
            float selectedGoal = baseGpsTrainingGoalFragment.getSelectedGoal();
            if (selectedGoal == 0.0f) {
                return;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (29 <= i8 && !c0.checkSelfPermission(this, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                startActivity(RequestLocationActivity.getCallingIntent(this));
                return;
            }
            int intExtra = getIntent().getIntExtra("nowTemperature", 10000);
            int intExtra2 = getIntent().getIntExtra("weatherCode", -1);
            GpsTrainingModel.GpsTrainingType gpsTrainingType = (GpsTrainingModel.GpsTrainingType) getIntent().getSerializableExtra(BaseMapTrainingActivity.TRAINING_TYPE);
            Intent callingIntent = BaseMapTrainingActivity.getCallingIntent(this, gpsTrainingType, baseGpsTrainingGoalFragment.getGoalType(), selectedGoal, intExtra, intExtra2);
            if (29 <= i8 && !c0.checkSelfPermission(this, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                startActivity(RequestLocationActivity.getCallingIntent(this));
                return;
            }
            if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
                startActivity(callingIntent);
            } else {
                if (!h5.a.isSupportStepCountSensor(this)) {
                    r0.showShort(this, R.string.gps_training_no_steps_counter_tips);
                } else if (i8 >= 29) {
                    String[] strArr = HomeTrainingFragment.ACTIVITY_PERMISSIONS;
                    if (!c0.checkSelfPermission(this, strArr)) {
                        ActivityCompat.requestPermissions(this, strArr, 1);
                        return;
                    }
                }
                startActivity(callingIntent);
            }
            if (baseGpsTrainingGoalFragment.isCustomGoal()) {
                saveLastGoalMsg(gpsTrainingType, baseGpsTrainingGoalFragment.getGoalType(), selectedGoal);
            } else {
                saveLastGoalMsg(gpsTrainingType, baseGpsTrainingGoalFragment.getGoalType(), -1.0f);
            }
            finish();
        }
    }

    private void saveLastGoalMsg(GpsTrainingModel.GpsTrainingType gpsTrainingType, TrainingGoalType trainingGoalType, float f8) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(getLastGoalKey(gpsTrainingType), trainingGoalType.getValue() + "_" + f8);
    }

    private void showNeedLocationPermission() {
        new MaterialDialog.e(this).content(R.string.permission_location_denied).positiveText(R.string.allow).negativeText(R.string.deny).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.training.goalsetting.d
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                GpsTrainingGoalActivity.this.lambda$showNeedLocationPermission$2(materialDialog, dialogAction);
            }
        }).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.training.goalsetting.e
            @Override // com.afollestad.materialdialogs.MaterialDialog.l
            public final void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
                GpsTrainingGoalActivity.lambda$showNeedLocationPermission$3(materialDialog, dialogAction);
            }
        }).cancelable(true).show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_gps_training));
        ((ActivityGpsTrainingGoalBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.goalsetting.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GpsTrainingGoalActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityGpsTrainingGoalBinding) this.binding).btnGoalEnter.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.goalsetting.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GpsTrainingGoalActivity.this.lambda$initBinding$1(view);
            }
        });
        initViewPager();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "GPS目标设置页(新版)");
    }
}
