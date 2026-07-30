package com.crrepa.band.my.training.goalsetting;

import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsTrainingGoalModel;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.model.TrainingGoalType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GpsTrainingDistanceGoalFragment extends BaseGpsTrainingGoalFragment {
    private static final float[] DISTANCE_GOAL_ARRAY_KM = {3.0f, 5.0f, 10.0f, 15.0f, 21.0975f, 42.195f};
    private static final float[] DISTANCE_GOAL_ARRAY_MILE = {2.0f, 3.0f, 6.0f, 10.0f, 13.1094f, 26.2188f};

    public GpsTrainingDistanceGoalFragment(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        super(gpsTrainingType);
    }

    private String getDistance(float f8) {
        return f8 + getUnit();
    }

    @NonNull
    private List<com.crrepa.band.my.training.goalsetting.widget.a> getInchDataList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.248f, getString(R.string.gps_exercise_goal_stadium)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(1.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(9.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(13.1094f, getString(R.string.gps_training_goal_set_half_marathon)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(15.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(26.2188f, getString(R.string.gps_training_goal_set_marathon)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        return arrayList;
    }

    @NonNull
    private List<com.crrepa.band.my.training.goalsetting.widget.a> getMetricDataList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.4f, getString(R.string.gps_exercise_goal_stadium)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(1.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(9.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(15.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(21.0975f, getString(R.string.gps_training_goal_set_half_marathon)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(42.195f, getString(R.string.gps_training_goal_set_marathon)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        return arrayList;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    public List<com.crrepa.band.my.training.goalsetting.widget.a> getCustomGoalDataList() {
        return BandUnitSystemProvider.isImperialSystem() ? getInchDataList() : getMetricDataList();
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected List<GpsTrainingGoalModel> getData() {
        float[] fArr = this.imperialSystem ? DISTANCE_GOAL_ARRAY_MILE : DISTANCE_GOAL_ARRAY_KM;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GpsTrainingGoalModel(getDistance(fArr[0]), null, fArr[0]));
        arrayList.add(new GpsTrainingGoalModel(getDistance(fArr[1]), null, fArr[1]));
        arrayList.add(new GpsTrainingGoalModel(getDistance(fArr[2]), null, fArr[2]));
        arrayList.add(new GpsTrainingGoalModel(getDistance(fArr[3]), null, fArr[3]));
        arrayList.add(new GpsTrainingGoalModel(getString(R.string.gps_training_goal_set_half_marathon), getDistance(fArr[4]), fArr[4]));
        arrayList.add(new GpsTrainingGoalModel(getString(R.string.gps_training_goal_set_marathon), getDistance(fArr[5]), fArr[5]));
        return arrayList;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected int getDefaultSelectedPosition() {
        return 1;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    public TrainingGoalType getGoalType() {
        return TrainingGoalType.DISTANCE;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected String getGoalValue(float f8) {
        return String.valueOf(f8);
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected String getUnit() {
        return getString(this.imperialSystem ? R.string.distance_unit_miles : R.string.distance_unit_km);
    }
}
