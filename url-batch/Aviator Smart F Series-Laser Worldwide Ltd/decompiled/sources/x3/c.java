package x3;

import androidx.annotation.StringRes;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.gps.GpsTrainingInfoModel;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.training.presenter.TrainingPathPresenter;
import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public interface c {
    void renderBandGpsPath(boolean z7);

    void renderDistance(String str);

    void renderDistancePercent(float f8);

    void renderDistanceUnit(int i8);

    void renderElevationChart(Date date, Date date2, List<Float> list, String str, String str2, String str3, String str4, String str5);

    void renderGomoreAvgStepMsg(float f8, float f9);

    void renderGomoreEnergySource(int i8, int i9);

    void renderGomoreRecoveryTime(int i8);

    void renderGomoreRunningPose(CRPTrainingAdvancedInfo.RunningInfo runningInfo);

    void renderGomoreTitle(String str);

    void renderGomoreTrainingEffect(float f8, String str, float f9, String str2);

    void renderGomoreVo2max(String str);

    void renderGpsTrack(List<TrainingLocation> list);

    void renderHeartRateAnalysis(int i8, int... iArr);

    void renderHeartRateChart(GpsTraining gpsTraining, List<Float> list);

    void renderHeartRateTotalSeconds(int i8);

    void renderOneDistancePaceChart(List<Float> list, String str, String str2);

    void renderRatingDialog();

    void renderRealTimePaceChart(GpsTraining gpsTraining, List<Float> list, String str, String str2);

    void renderStepsInfoChart(GpsTraining gpsTraining, float f8, float f9, List<Float> list, List<Float> list2);

    void renderStravaOauthInvalid();

    void renderStravaToast(@StringRes int i8);

    void renderTitle(String str);

    void renderTrainingInfoList(List<GpsTrainingInfoModel> list);

    void renderTrainingPath(List<TrainingLocation> list);

    void renderTrainingSource(Date date, TrainingPathPresenter.TrainingSourceType trainingSourceType);

    void renderTrainingWeather(GpsTraining gpsTraining);
}
