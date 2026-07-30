package com.crrepa.band.my.training.goalsetting;

import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsTrainingGoalModel;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.moyoung.dafit.module.common.utils.n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GpsTrainingTimeGoalFragment extends BaseGpsTrainingGoalFragment {
    private static final int[] TIME_GOAL_ARRAY = {10, 20, 30, 60, 90, 120};

    public GpsTrainingTimeGoalFragment(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        super(gpsTrainingType);
    }

    private String getTime(int i8) {
        return i8 + l.SPACE + getString(R.string.goal_minute_unit);
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    public List<com.crrepa.band.my.training.goalsetting.widget.a> getCustomGoalDataList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(20.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(30.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(40.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(50.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(60.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(90.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(120.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(150.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(180.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(210.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(240.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(270.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(300.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        return arrayList;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected List<GpsTrainingGoalModel> getData() {
        ArrayList arrayList = new ArrayList();
        for (int i8 : TIME_GOAL_ARRAY) {
            arrayList.add(new GpsTrainingGoalModel(getTime(i8), null, i8));
        }
        return arrayList;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected int getDefaultSelectedPosition() {
        return 2;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    public TrainingGoalType getGoalType() {
        return TrainingGoalType.TIME;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected String getGoalValue(float f8) {
        return n.format((int) (f8 / 60.0f), n.TWO_INTEGERS_PATTERN) + ":" + n.format((int) (f8 % 60.0f), n.TWO_INTEGERS_PATTERN);
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected String getUnit() {
        return getString(R.string.gps_training_goal_set_time_subtitle);
    }
}
