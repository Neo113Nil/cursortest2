package k0;

import android.text.TextUtils;
import android.util.Log;
import com.crrepa.band.my.model.band.provider.BandTimingHeartRateProvider;
import com.crrepa.band.my.model.db.ActiveHeartRate;
import com.crrepa.band.my.model.db.HeartRate;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.helper.HeartRateSaveHelper;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.ble.conn.bean.CRPHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPMovementHeartRateInfo;
import com.crrepa.ble.conn.bean.CRPTrainingInfo;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.h;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.x0;
import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    private c() {
    }

    private static void addMovementHeartRateList(MovementHeartRate movementHeartRate, List<Integer> list) {
        int[] heartRateStatisticsData = getHeartRateStatisticsData(list);
        movementHeartRate.setMinHeartRate(Integer.valueOf(heartRateStatisticsData[0]));
        movementHeartRate.setMaxHeartRate(Integer.valueOf(heartRateStatisticsData[1]));
        movementHeartRate.setAverage(Integer.valueOf(heartRateStatisticsData[2]));
        int[] heartRateActiveDegree = getHeartRateActiveDegree(list, 1);
        movementHeartRate.setLightCount(Integer.valueOf(heartRateActiveDegree[0]));
        movementHeartRate.setWightCount(Integer.valueOf(heartRateActiveDegree[1]));
        movementHeartRate.setAerobicCount(Integer.valueOf(heartRateActiveDegree[2]));
        movementHeartRate.setAnaerobicCount(Integer.valueOf(heartRateActiveDegree[3]));
        movementHeartRate.setMaxCount(Integer.valueOf(heartRateActiveDegree[4]));
        movementHeartRate.setHeartRates(s.bean2Json(list));
    }

    public static HeartRate convert24HoursHeartRate(CRPHeartRateInfo cRPHeartRateInfo) {
        if (cRPHeartRateInfo == null) {
            return null;
        }
        HeartRate heartRate = new HeartRate();
        long startTime = cRPHeartRateInfo.getStartTime();
        heartRate.setDate(new Date(startTime));
        List<Integer> heartRateList = cRPHeartRateInfo.getHeartRateList();
        int timeInterval = cRPHeartRateInfo.getTimeInterval();
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasTimingHeartRate() && timeInterval != 1) {
            heartRateList = filterTimingHeartRateList(heartRateList, cRPHeartRateInfo.getHistoryDay());
        } else if (cRPHeartRateInfo.getHistoryDay() == CRPHistoryDay.YESTERDAY && timeInterval == 1) {
            heartRateList = mergeYesterdayHeartRate(heartRateList, startTime);
        }
        if (heartRateList == null) {
            return null;
        }
        f.d("hrList: " + heartRateList.toString());
        int[] heartRateStatisticsData = getHeartRateStatisticsData(heartRateList);
        heartRate.setMinHeartRate(Integer.valueOf(heartRateStatisticsData[0]));
        heartRate.setMaxHeartRate(Integer.valueOf(heartRateStatisticsData[1]));
        heartRate.setAverage(Integer.valueOf(heartRateStatisticsData[2]));
        int[] heartRateActiveDegree = getHeartRateActiveDegree(heartRateList, timeInterval);
        heartRate.setLightCount(Integer.valueOf(heartRateActiveDegree[0]));
        heartRate.setWightCount(Integer.valueOf(heartRateActiveDegree[1]));
        heartRate.setAnaerobicCount(Integer.valueOf(heartRateActiveDegree[2]));
        heartRate.setAerobicCount(Integer.valueOf(heartRateActiveDegree[3]));
        heartRate.setMaxCount(Integer.valueOf(heartRateActiveDegree[4]));
        heartRate.setHeartRate(s.bean2Json(heartRateList));
        return heartRate;
    }

    private static List<Integer> filterTimingHeartRateList(List<Integer> list, CRPHistoryDay cRPHistoryDay) {
        int i8;
        int measureInterval = getMeasureInterval();
        if (measureInterval == 0) {
            return null;
        }
        int i9 = measureInterval * 5;
        int i10 = 1440 / i9;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        int minuteOfDay = CRPHistoryDay.TODAY == cRPHistoryDay ? m.getMinuteOfDay(new Date()) / i9 : i10;
        for (int i11 = 0; i11 < list.size() && minuteOfDay > (i8 = i11 / measureInterval); i11++) {
            int intValue = list.get(i11).intValue();
            if (intValue > 0) {
                iArr[i8] = iArr[i8] + intValue;
                iArr2[i8] = iArr2[i8] + 1;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            if (i13 == 0) {
                arrayList.add(0);
            } else {
                arrayList.add(Integer.valueOf(i13 / iArr2[i12]));
            }
        }
        return arrayList;
    }

    private static int[] getHeartRateActiveDegree(List<Integer> list, int i8) {
        int[] iArr = new int[5];
        float[] heartRateDegree = h.getHeartRateDegree(UserAgeProvider.getUserAge(), UserWeightProvider.getUserWeightKg(), UserGenderProvider.isFemale());
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (Integer num : list) {
            if (num.intValue() > 0) {
                int heartRateDegreeIndex = getHeartRateDegreeIndex(heartRateDegree, num.intValue());
                if (heartRateDegreeIndex == 0) {
                    i9++;
                } else if (heartRateDegreeIndex == 1) {
                    i10++;
                } else if (heartRateDegreeIndex == 2) {
                    i11++;
                } else if (heartRateDegreeIndex == 3) {
                    i12++;
                } else if (heartRateDegreeIndex == 4) {
                    i13++;
                }
            }
        }
        int measureInterval = 1 < i8 ? getMeasureInterval() * 5 : 1;
        iArr[0] = i9 * measureInterval;
        iArr[1] = i10 * measureInterval;
        iArr[2] = i11 * measureInterval;
        iArr[3] = i12 * measureInterval;
        iArr[4] = i13 * measureInterval;
        return iArr;
    }

    public static int getHeartRateDegreeIndex(float[] fArr, int i8) {
        for (int i9 = 0; i9 < fArr.length; i9++) {
            if (i8 <= fArr[i9]) {
                return i9;
            }
        }
        return fArr.length;
    }

    public static int[] getHeartRateStatisticsData(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return new int[]{0, 0, 0};
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (Integer num : list) {
            if (num.intValue() > 0) {
                if (i11 < num.intValue()) {
                    i11 = num.intValue();
                }
                if (i10 == 0) {
                    i10 = num.intValue();
                } else if (num.intValue() < i10) {
                    i10 = num.intValue();
                }
                i9 += num.intValue();
                i8++;
            }
        }
        return new int[]{i10, i11, i8 != 0 ? i9 / i8 : 0};
    }

    private static int getMeasureInterval() {
        return BandTimingHeartRateProvider.getTimingHeartRateInterval();
    }

    private static MovementHeartRate getMovementHeartRate(CRPTrainingInfo cRPTrainingInfo) {
        long startTime = cRPTrainingInfo.getStartTime();
        long endTime = cRPTrainingInfo.getEndTime();
        int type = cRPTrainingInfo.getType();
        int steps = cRPTrainingInfo.getSteps();
        int distance = cRPTrainingInfo.getDistance();
        int calories = cRPTrainingInfo.getCalories();
        int validTime = cRPTrainingInfo.getValidTime();
        MovementHeartRate movementHeartRate = new MovementHeartRate();
        movementHeartRate.setStartTime(Long.valueOf(startTime));
        movementHeartRate.setEndTime(Long.valueOf(endTime));
        movementHeartRate.setType(Integer.valueOf(type));
        movementHeartRate.setSteps(Integer.valueOf(steps));
        float f8 = distance;
        movementHeartRate.setDistance(Float.valueOf(f8));
        movementHeartRate.setCalories(Float.valueOf(calories));
        f.d("trainingSeconds: " + validTime);
        movementHeartRate.setTrainingSeconds(Integer.valueOf(validTime));
        float f9 = f8 / 1000.0f;
        float f10 = (float) validTime;
        movementHeartRate.setSpeed(Float.valueOf((f9 / f10) * 3600.0f));
        movementHeartRate.setPace(Float.valueOf((f10 / 60.0f) / f9));
        if (x0.isNotEmpty(cRPTrainingInfo.getAltitudeList())) {
            Log.d("getAltitudeList", "getAltitudeList: " + cRPTrainingInfo.getAltitudeList());
            movementHeartRate.setAltitudeListJson(new Gson().toJson(cRPTrainingInfo.getAltitudeList()));
        }
        if (cRPTrainingInfo.getAdvancedInfo() != null) {
            movementHeartRate.setTrainingAdvancedInfoJson(new Gson().toJson(cRPTrainingInfo.getAdvancedInfo()));
        }
        return movementHeartRate;
    }

    private static MovementHeartRate getMovenmentBaseInfo(CRPMovementHeartRateInfo cRPMovementHeartRateInfo) {
        MovementHeartRate movementHeartRate = new MovementHeartRateDaoProxy().getMovementHeartRate(cRPMovementHeartRateInfo.getStartTime());
        return movementHeartRate != null ? movementHeartRate : getMovementHeartRate(cRPMovementHeartRateInfo);
    }

    private static List<Integer> mergeYesterdayHeartRate(List<Integer> list, long j8) {
        HeartRate query24HoursHeartRate = HeartRateSaveHelper.query24HoursHeartRate(j8);
        if (query24HoursHeartRate == null) {
            return list;
        }
        String heartRate = query24HoursHeartRate.getHeartRate();
        if (TextUtils.isEmpty(heartRate)) {
            return list;
        }
        List<Integer> formatHeartRate = HeartRateSaveHelper.formatHeartRate(heartRate);
        if (formatHeartRate == null) {
            return list;
        }
        if (formatHeartRate.size() != list.size()) {
            return null;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            Integer num = list.get(i8);
            if (num.intValue() != 0) {
                formatHeartRate.set(i8, num);
            }
        }
        return formatHeartRate;
    }

    public static ActiveHeartRate toActiveHeartRate(CRPHeartRateInfo cRPHeartRateInfo) {
        List<Integer> heartRateList;
        if (cRPHeartRateInfo == null || (heartRateList = cRPHeartRateInfo.getHeartRateList()) == null || heartRateList.isEmpty()) {
            return null;
        }
        long startTime = cRPHeartRateInfo.getStartTime();
        int timeInterval = cRPHeartRateInfo.getTimeInterval();
        Date date = new Date(startTime);
        Date dateOfOffsetMinute = m.getDateOfOffsetMinute(date, (timeInterval * heartRateList.size()) - 1);
        ActiveHeartRate activeHeartRate = new ActiveHeartRate();
        activeHeartRate.setStartDate(date);
        activeHeartRate.setEndDate(dateOfOffsetMinute);
        String bean2Json = s.bean2Json(heartRateList);
        f.d("heartRates: " + bean2Json);
        activeHeartRate.setData(bean2Json);
        int[] heartRateStatisticsData = getHeartRateStatisticsData(heartRateList);
        activeHeartRate.setMinHeartRate(Integer.valueOf(heartRateStatisticsData[0]));
        activeHeartRate.setMaxHeartRate(Integer.valueOf(heartRateStatisticsData[1]));
        activeHeartRate.setAverage(Integer.valueOf(heartRateStatisticsData[2]));
        int[] heartRateActiveDegree = getHeartRateActiveDegree(heartRateList, 1);
        activeHeartRate.setLightCount(Integer.valueOf(heartRateActiveDegree[0]));
        activeHeartRate.setWightCount(Integer.valueOf(heartRateActiveDegree[1]));
        activeHeartRate.setAnaerobicCount(Integer.valueOf(heartRateActiveDegree[2]));
        activeHeartRate.setAerobicCount(Integer.valueOf(heartRateActiveDegree[3]));
        activeHeartRate.setMaxCount(Integer.valueOf(heartRateActiveDegree[4]));
        return activeHeartRate;
    }

    public static MovementHeartRate toMovementHeartRate(CRPMovementHeartRateInfo cRPMovementHeartRateInfo, ActiveHeartRate activeHeartRate) {
        if (cRPMovementHeartRateInfo == null || activeHeartRate == null || cRPMovementHeartRateInfo.getValidTime() == 0) {
            return null;
        }
        long startTime = cRPMovementHeartRateInfo.getStartTime();
        f.d("startTime: " + startTime);
        long endTime = cRPMovementHeartRateInfo.getEndTime();
        MovementHeartRate movenmentBaseInfo = getMovenmentBaseInfo(cRPMovementHeartRateInfo);
        List<Integer> movementHeartRateForDynamicHeartRate = HeartRateSaveHelper.getMovementHeartRateForDynamicHeartRate(activeHeartRate.getData(), startTime, endTime);
        if (movementHeartRateForDynamicHeartRate == null) {
            return null;
        }
        addMovementHeartRateList(movenmentBaseInfo, movementHeartRateForDynamicHeartRate);
        return movenmentBaseInfo;
    }

    public static MovementHeartRate toMovementHeartRate(CRPMovementHeartRateInfo cRPMovementHeartRateInfo) {
        if (cRPMovementHeartRateInfo == null) {
            return null;
        }
        long startTime = cRPMovementHeartRateInfo.getStartTime();
        long endTime = cRPMovementHeartRateInfo.getEndTime();
        MovementHeartRate movenmentBaseInfo = getMovenmentBaseInfo(cRPMovementHeartRateInfo);
        HeartRate query24HoursHeartRate = HeartRateSaveHelper.query24HoursHeartRate(startTime);
        if (query24HoursHeartRate == null) {
            return movenmentBaseInfo;
        }
        List<Integer> movementHeartRateFor24HourHeartRate = HeartRateSaveHelper.getMovementHeartRateFor24HourHeartRate(query24HoursHeartRate.getHeartRate(), startTime, endTime);
        if (movementHeartRateFor24HourHeartRate == null) {
            f.e("heartRates is null", new Object[0]);
            return null;
        }
        addMovementHeartRateList(movenmentBaseInfo, movementHeartRateFor24HourHeartRate);
        return movenmentBaseInfo;
    }

    public static MovementHeartRate toMovementHeartRate(CRPTrainingInfo cRPTrainingInfo) {
        if (cRPTrainingInfo == null || cRPTrainingInfo.getEndTime() < cRPTrainingInfo.getStartTime()) {
            return null;
        }
        MovementHeartRate movementHeartRate = new MovementHeartRateDaoProxy().getMovementHeartRate(cRPTrainingInfo.getStartTime());
        if (movementHeartRate != null) {
            return movementHeartRate;
        }
        List<Integer> hrList = cRPTrainingInfo.getHrList();
        if (hrList == null) {
            f.e("hrList is null", new Object[0]);
            return null;
        }
        int size = hrList.size();
        int size2 = hrList.size() - 1;
        while (true) {
            if (size2 < 0) {
                break;
            }
            if (hrList.get(size2).intValue() > 0) {
                size = size2 + 1;
                break;
            }
            size2--;
        }
        List<Integer> subList = hrList.subList(0, size);
        MovementHeartRate movementHeartRate2 = getMovementHeartRate(cRPTrainingInfo);
        addMovementHeartRateList(movementHeartRate2, subList);
        List<Integer> stepsList = cRPTrainingInfo.getStepsList();
        if (stepsList != null && !stepsList.isEmpty()) {
            movementHeartRate2.setStepsArray(s.bean2Json(stepsList));
        }
        List<Integer> distanceList = cRPTrainingInfo.getDistanceList();
        if (distanceList != null && !distanceList.isEmpty()) {
            movementHeartRate2.setDistanceArray(s.bean2Json(distanceList));
        }
        movementHeartRate2.setInterval(10);
        return movementHeartRate2;
    }

    private static MovementHeartRate getMovementHeartRate(CRPMovementHeartRateInfo cRPMovementHeartRateInfo) {
        long startTime = cRPMovementHeartRateInfo.getStartTime();
        long endTime = cRPMovementHeartRateInfo.getEndTime();
        int type = cRPMovementHeartRateInfo.getType();
        int steps = cRPMovementHeartRateInfo.getSteps();
        int distance = cRPMovementHeartRateInfo.getDistance();
        int calories = cRPMovementHeartRateInfo.getCalories();
        int validTime = cRPMovementHeartRateInfo.getValidTime();
        MovementHeartRate movementHeartRate = new MovementHeartRate();
        movementHeartRate.setStartTime(Long.valueOf(startTime));
        movementHeartRate.setEndTime(Long.valueOf(endTime));
        movementHeartRate.setType(Integer.valueOf(type));
        movementHeartRate.setSteps(Integer.valueOf(steps));
        float f8 = distance;
        movementHeartRate.setDistance(Float.valueOf(f8));
        movementHeartRate.setCalories(Float.valueOf(calories));
        f.d("trainingSeconds: " + validTime);
        movementHeartRate.setTrainingSeconds(Integer.valueOf(validTime));
        float f9 = f8 / 1000.0f;
        float f10 = (float) validTime;
        movementHeartRate.setSpeed(Float.valueOf((f9 / f10) * 3600.0f));
        movementHeartRate.setPace(Float.valueOf((f10 / 60.0f) / f9));
        return movementHeartRate;
    }
}
