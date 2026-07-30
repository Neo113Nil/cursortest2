package t0;

import android.content.Context;
import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.ai.analysis.model.AIAnalysisRequest;
import com.crrepa.band.my.device.ai.analysis.model.AIHealthAnalyzeResp;
import com.crrepa.band.my.device.ai.analysis.model.AIHealthSuggestionResp;
import com.crrepa.band.my.device.ai.analysis.model.HealthDataAnalysisBean;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandStressProvider;
import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.model.db.BloodPressure;
import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.TimingTemp;
import com.crrepa.band.my.model.db.proxy.BloodOxygenDaoProxy;
import com.crrepa.band.my.model.db.proxy.BloodPressureDaoProxy;
import com.crrepa.band.my.model.db.proxy.HeartRateDaoProxy;
import com.crrepa.band.my.model.db.proxy.SleepDaoProxy;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;
import com.crrepa.band.my.model.db.proxy.TimingStressDaoProxy;
import com.crrepa.band.my.model.db.proxy.TimingTempDaoProxy;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.band.my.model.user.provider.UserHeightProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.ble.conn.bean.CRPHealthSuggestionInfo;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.x0;
import com.my.lib.AFlash;
import com.my.lib.data.ErrorCode;
import com.my.lib.data.SubscriptionInfo;
import f6.p;
import f6.q;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import y5.w;

/* loaded from: classes2.dex */
public class e {
    private String requestId = "";

    private static AIAnalysisRequest createAnalysisRequest() {
        List<AIAnalysisRequest.HealthData> a8;
        TimingTemp timingTemp;
        BloodPressure lastTimeBloodPressure;
        TimingStress timingStress;
        AIAnalysisRequest aIAnalysisRequest = new AIAnalysisRequest();
        AIAnalysisRequest.HealthData healthData = new AIAnalysisRequest.HealthData();
        healthData.date = m.format(System.currentTimeMillis(), cn.hutool.core.date.d.NORM_DATE_PATTERN);
        healthData.gender = UserGenderProvider.getUsetGender() == 1 ? "1" : "2";
        healthData.age = String.valueOf(UserAgeProvider.getUserAge());
        healthData.weight = String.valueOf(Math.round(UserWeightProvider.getUserWeightKg()));
        healthData.height = String.valueOf(UserHeightProvider.getUserHeightCm());
        Date date = new Date();
        Date dateOfOffsetDay = m.getDateOfOffsetDay(date, -1);
        Step step = StepsDaoProxy.getInstance().getStep(dateOfOffsetDay);
        if (step != null) {
            healthData.step = String.valueOf(step.getSteps());
        }
        if (SleepDaoProxy.getInstance().getSleep(date) != null) {
            healthData.sleep = String.valueOf(Math.round((SleepDaoProxy.getSleepTime(r2) / 60.0f) * 10.0f) / 10.0d);
        }
        HeartRate heartRate = new HeartRateDaoProxy().getHeartRate(dateOfOffsetDay);
        if (heartRate != null) {
            healthData.hr = String.valueOf(heartRate.getMaxHeartRate()) + "/" + String.valueOf(heartRate.getMinHeartRate()) + "/" + String.valueOf(heartRate.getAverage());
        }
        TimingBloodOxygen timingBloodOxygen = new TimingBloodOxygenDaoProxy().get(dateOfOffsetDay);
        if (timingBloodOxygen != null) {
            healthData.sao2 = String.valueOf(timingBloodOxygen.getMax()) + "/" + String.valueOf(timingBloodOxygen.getMin()) + "/" + String.valueOf(timingBloodOxygen.getAverage());
        } else {
            List<BloodOxygen> thisDayData = new BloodOxygenDaoProxy().getThisDayData(dateOfOffsetDay);
            if (x0.isNotEmpty(thisDayData)) {
                Iterator<BloodOxygen> it = thisDayData.iterator();
                int i8 = 0;
                int i9 = 0;
                int i10 = Integer.MIN_VALUE;
                int i11 = Integer.MAX_VALUE;
                while (it.hasNext()) {
                    int intValue = it.next().getBloodOxygen().intValue();
                    i10 = Math.max(i10, intValue);
                    i11 = Math.min(i11, intValue);
                    i9 += intValue;
                    i8++;
                }
                if (i8 > 0) {
                    healthData.sao2 = i10 + "/" + i11 + "/" + (i9 / i8);
                }
            }
        }
        if (BandStressProvider.hasStress() && (timingStress = new TimingStressDaoProxy().get(dateOfOffsetDay)) != null) {
            healthData.stress = String.valueOf(timingStress.getMax()) + "/" + String.valueOf(timingStress.getMin()) + "/" + String.valueOf(timingStress.getAverage());
        }
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand != null && connectBand.hasBloodPressure() && (lastTimeBloodPressure = new BloodPressureDaoProxy().getLastTimeBloodPressure()) != null) {
            healthData.pressureHigh = String.valueOf(lastTimeBloodPressure.getSbp());
            healthData.pressureLow = String.valueOf(lastTimeBloodPressure.getDbp());
            healthData.pressureAvg = String.valueOf(lastTimeBloodPressure.getHr());
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasTemp() && (timingTemp = new TimingTempDaoProxy().get(dateOfOffsetDay)) != null) {
            healthData.temperature = String.valueOf(timingTemp.getMax()) + "/" + String.valueOf(timingTemp.getMin()) + "/" + String.valueOf(timingTemp.getAverage());
        }
        a8 = b.a(new Object[]{healthData});
        aIAnalysisRequest.data = a8;
        return aIAnalysisRequest;
    }

    private CRPHealthSuggestionInfo createAnalyzeInfo(String str, boolean z7) {
        HealthDataAnalysisBean healthDataAnalysisReport;
        Log.d("AFlash", "createAnalyzeInfo, content: " + str);
        CRPHealthSuggestionInfo cRPHealthSuggestionInfo = new CRPHealthSuggestionInfo(1);
        HashMap hashMap = new HashMap();
        cRPHealthSuggestionInfo.setSuggestionMap(hashMap);
        if (z7) {
            AIHealthSuggestionResp aIHealthSuggestionResp = (AIHealthSuggestionResp) new Gson().fromJson(str, AIHealthSuggestionResp.class);
            if (aIHealthSuggestionResp == null) {
                cRPHealthSuggestionInfo.setCode(4);
                return cRPHealthSuggestionInfo;
            }
            healthDataAnalysisReport = aIHealthSuggestionResp.getHealthAnalysisSuggestions();
        } else {
            AIHealthAnalyzeResp aIHealthAnalyzeResp = (AIHealthAnalyzeResp) new Gson().fromJson(str, AIHealthAnalyzeResp.class);
            if (aIHealthAnalyzeResp == null) {
                cRPHealthSuggestionInfo.setCode(4);
                return cRPHealthSuggestionInfo;
            }
            healthDataAnalysisReport = aIHealthAnalyzeResp.getHealthDataAnalysisReport();
        }
        if (healthDataAnalysisReport == null) {
            cRPHealthSuggestionInfo.setCode(2);
            return cRPHealthSuggestionInfo;
        }
        hashMap.put(3, healthDataAnalysisReport.getSleep());
        hashMap.put(4, healthDataAnalysisReport.getHeartRate());
        if (x0.isNotEmpty(healthDataAnalysisReport.getBloodOxygen())) {
            hashMap.put(5, healthDataAnalysisReport.getBloodOxygen());
        }
        hashMap.put(6, healthDataAnalysisReport.getSteps());
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand != null && connectBand.hasBloodPressure()) {
            hashMap.put(7, healthDataAnalysisReport.getBloodPressure());
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasTemp()) {
            hashMap.put(8, healthDataAnalysisReport.getBodyTemperature());
        }
        if (BandStressProvider.hasStress()) {
            hashMap.put(9, healthDataAnalysisReport.getStress());
        }
        hashMap.put(10, String.valueOf(Math.round(UserWeightProvider.getUserWeightKg())));
        hashMap.put(11, healthDataAnalysisReport.getConclusion());
        return cRPHealthSuggestionInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ w lambda$analyzeHealthData$0(boolean z7, String str, String str2, SubscriptionInfo subscriptionInfo) {
        CRPHealthSuggestionInfo cRPHealthSuggestionInfo;
        Log.d("AFlash", "analyzeData onSuccess: " + str + ", content: " + str2);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f("requestId:" + str + ", content: " + str2));
        if (!Objects.equals(this.requestId, str)) {
            Log.d("AFlash", "!Objects.equals(this.requestId, requestId)");
            return null;
        }
        try {
            cRPHealthSuggestionInfo = createAnalyzeInfo(str2, z7);
            Log.d("sendHealthData", cRPHealthSuggestionInfo.toString());
        } catch (Exception e8) {
            CRPHealthSuggestionInfo cRPHealthSuggestionInfo2 = new CRPHealthSuggestionInfo(4);
            Log.d("sendHealthData", e8.toString());
            cRPHealthSuggestionInfo = cRPHealthSuggestionInfo2;
        }
        sendHealthData(cRPHealthSuggestionInfo, z7);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w lambda$analyzeHealthData$1(boolean z7, String str, ErrorCode errorCode) {
        Log.d("AFlash", "analyzeData onFailure: " + errorCode.getCode() + ", Message: " + errorCode.getMessage());
        com.crrepa.band.my.device.ai.helper.c.checkUnauthorized(errorCode.getCode());
        sendHealthData(new CRPHealthSuggestionInfo(4), z7);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.f(errorCode.getCode() + ", Message: " + errorCode.getMessage()));
        return null;
    }

    private static void sendHealthData(CRPHealthSuggestionInfo cRPHealthSuggestionInfo, boolean z7) {
        if (z7) {
            i4.getInstance().sendHealthSuggestion(cRPHealthSuggestionInfo);
        } else {
            i4.getInstance().sendAIHealthAnalysis(cRPHealthSuggestionInfo);
        }
    }

    public void analyzeHealthData(final boolean z7) {
        JSONObject jSONObject;
        if (a0.isDisconnected()) {
            sendHealthData(new CRPHealthSuggestionInfo(3), z7);
            return;
        }
        AIAnalysisRequest createAnalysisRequest = createAnalysisRequest();
        createAnalysisRequest.analysisType = z7 ? 16 : 15;
        try {
            jSONObject = new JSONObject(new Gson().toJson(createAnalysisRequest));
        } catch (Exception unused) {
            jSONObject = null;
        }
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            CRPHealthSuggestionInfo cRPHealthSuggestionInfo = new CRPHealthSuggestionInfo(2);
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e(cRPHealthSuggestionInfo.toString()));
            sendHealthData(cRPHealthSuggestionInfo, z7);
            return;
        }
        String wid = com.crrepa.band.my.device.ai.helper.c.getWID();
        Log.d("AFlash", "mac:" + wid + ",   analyzeData jsonObject: " + jSONObject2);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.device.ai.debugmodel.e("mac:" + wid + ",   " + jSONObject2));
        this.requestId = com.crrepa.band.my.device.ai.helper.d.getUUID();
        AFlash companion = AFlash.Companion.getInstance();
        Context context = com.moyoung.dafit.module.common.utils.d.get();
        String str = this.requestId;
        companion.analyzeData(context, str, wid, str, jSONObject2, new q() { // from class: t0.c
            @Override // f6.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                w lambda$analyzeHealthData$0;
                lambda$analyzeHealthData$0 = e.this.lambda$analyzeHealthData$0(z7, (String) obj, (String) obj2, (SubscriptionInfo) obj3);
                return lambda$analyzeHealthData$0;
            }
        }, new p() { // from class: t0.d
            @Override // f6.p
            public final Object invoke(Object obj, Object obj2) {
                w lambda$analyzeHealthData$1;
                lambda$analyzeHealthData$1 = e.lambda$analyzeHealthData$1(z7, (String) obj, (ErrorCode) obj2);
                return lambda$analyzeHealthData$1;
            }
        });
    }

    public void resetRequestId() {
        this.requestId = "";
    }
}
