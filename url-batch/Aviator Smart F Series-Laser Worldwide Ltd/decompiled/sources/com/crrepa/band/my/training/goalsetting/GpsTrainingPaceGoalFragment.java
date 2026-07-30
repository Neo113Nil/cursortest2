package com.crrepa.band.my.training.goalsetting;

import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsTrainingGoalModel;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.crrepa.band.my.training.utils.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GpsTrainingPaceGoalFragment extends BaseGpsTrainingGoalFragment {
    private static final int[] PACE_GOAL_ARRAY_KM = {10, 8, 6, 5, 4, 3};
    private static final int[] PACE_GOAL_ARRAY_MILE = {16, 13, 10, 8, 6, 5};

    public GpsTrainingPaceGoalFragment(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        super(gpsTrainingType);
    }

    private List<com.crrepa.band.my.training.goalsetting.widget.a> getInchDataList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.04f, requireContext().getResources().getString(R.string.gps_exercise_goal_marathon_record)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(9.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(9.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(9.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(9.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(9.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(9.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(10.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(11.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(11.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(11.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(11.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(11.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(11.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(12.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(12.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(12.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(12.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(12.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(12.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(13.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        return arrayList;
    }

    private List<com.crrepa.band.my.training.goalsetting.widget.a> getMetricDataList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(0.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.32f, requireContext().getResources().getString(R.string.gps_exercise_goal_marathon_record)));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(2.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(3.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(4.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(5.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(6.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.0f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.1f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.2f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.3f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.4f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(7.5f, ""));
        arrayList.add(new com.crrepa.band.my.training.goalsetting.widget.a(8.0f, ""));
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
        int[] iArr = this.imperialSystem ? PACE_GOAL_ARRAY_MILE : PACE_GOAL_ARRAY_KM;
        ArrayList arrayList = new ArrayList();
        for (float f8 : iArr) {
            arrayList.add(new GpsTrainingGoalModel(getGoalValue(f8), null, f8));
        }
        return arrayList;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected int getDefaultSelectedPosition() {
        return 2;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    public TrainingGoalType getGoalType() {
        return TrainingGoalType.PACE;
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected String getGoalValue(float f8) {
        return k.getPaceStr(f8);
    }

    @Override // com.crrepa.band.my.training.goalsetting.BaseGpsTrainingGoalFragment
    protected String getUnit() {
        return getString(R.string.goal_minute_unit) + "/" + getString(this.imperialSystem ? R.string.distance_unit_miles : R.string.distance_unit_km);
    }
}
