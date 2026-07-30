package com.crrepa.band.my.training.goalsetting;

import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsTrainingGoalModel;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.moyoung.dafit.module.common.utils.n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GpsTrainingCaloriesGoalFragment extends BaseGpsTrainingGoalFragment {
    private static final int[] CALORIES_GOAL_ARRAY = {150, 300, 350, 400, 500, TypedValues.TransitionType.TYPE_DURATION};
    private static final int[] CALORIES_GOAL_NAME_ARRAY = {R.string.toast, R.string.fries, R.string.chessecake, R.string.pizza, R.string.drumstick, R.string.hamburger};

    public GpsTrainingCaloriesGoalFragment(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        super(gpsTrainingType);
    }

    private String getCalories(int i8) {
        return i8 + l.SPACE + getUnit();
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    public List<com.crrepa.band.my.training.goalsetting.widget.a> getCustomGoalDataList() {
        ArrayList arrayList = new ArrayList();
        Resources resources = requireContext().getResources();
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(50.0f, resources.getString(R.string.gps_exercise_goal_cookies)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(100.0f, resources.getString(R.string.gps_exercise_goal_banana)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(150.0f, resources.getString(R.string.toast)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(200.0f, resources.getString(R.string.gps_exercise_goal_coke)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(250.0f, resources.getString(R.string.gps_exercise_goal_doughnut)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(300.0f, resources.getString(R.string.fries)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(350.0f, resources.getString(R.string.chessecake)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(400.0f, resources.getString(R.string.pizza)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(450.0f, resources.getString(R.string.gps_exercise_goal_lamian)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(500.0f, resources.getString(R.string.drumstick)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(550.0f, resources.getString(R.string.gps_exercise_goal_minced_sausage)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(600.0f, resources.getString(R.string.gps_exercise_goal_chocolate)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(650.0f, resources.getString(R.string.gps_exercise_goal_ham_sandwich)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(700.0f, resources.getString(R.string.hamburger)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        return arrayList;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected List<GpsTrainingGoalModel> getData() {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            int[] iArr = CALORIES_GOAL_ARRAY;
            if (i8 >= iArr.length) {
                return arrayList;
            }
            arrayList.add(new GpsTrainingGoalModel(getCalories(iArr[i8]), getString(CALORIES_GOAL_NAME_ARRAY[i8]), iArr[i8]));
            i8++;
        }
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected int getDefaultSelectedPosition() {
        return 1;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    public TrainingGoalType getGoalType() {
        return TrainingGoalType.CALORIES;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected String getGoalValue(float f8) {
        return n.format(f8, n.TWO_INTEGERS_PATTERN);
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected String getUnit() {
        return getString(R.string.calorie_unit);
    }
}
