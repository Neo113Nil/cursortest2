package x3;

import com.crrepa.band.my.model.GpsLocation;
import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public interface a {
    void renderAverageHeartRate(int i8);

    void renderBallStatisticsView();

    void renderCalories(float f8);

    void renderDistance(int i8);

    void renderElevationChart(Date date, Date date2, List<Float> list, String str, String str2, String str3, String str4, String str5);

    void renderGomoreDetailData(List<com.crrepa.band.my.training.gomoresport.path.a> list);

    void renderGomoreEnergySource(int i8, int i9);

    void renderGomoreRecoveryTime(int i8);

    void renderGomoreRunningPose(CRPTrainingAdvancedInfo.RunningInfo runningInfo);

    void renderGomoreSwimmingPose(CRPTrainingAdvancedInfo.SwimmingInfo swimmingInfo);

    void renderGomoreTrainingEffect(float f8, String str, float f9, String str2);

    void renderGomoreVo2max(String str);

    void renderHeartRateChart(List<Float> list, Date date, int i8);

    void renderMetricSystem(boolean z7);

    void renderOneDistancePaceChart(List<Float> list, String str, String str2);

    void renderPace(int i8);

    void renderRealTimePaceChart(Date date, Date date2, List<Float> list, String str, String str2);

    void renderRefreshData();

    void renderRunStatisticsView();

    void renderSpeed(float f8);

    void renderSteps(int i8);

    void renderStepsInfoChart(Date date, Date date2, float f8, float f9, List<Float> list, float f10, float f11, List<Float> list2);

    void renderTrainingDate(Date date);

    void renderTrainingHeartRateAnalysis(int i8, int... iArr);

    void renderTrainingName(String str);

    void renderTrainingPath(List<GpsLocation> list);

    void renderTrainingTotalTime(int i8);
}
