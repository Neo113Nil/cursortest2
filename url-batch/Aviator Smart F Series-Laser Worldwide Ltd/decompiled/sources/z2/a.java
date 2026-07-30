package z2;

import com.crrepa.band.my.health.widgets.segmentedview.SleepState;
import com.crrepa.band.my.model.SleepTimeDistributionModel;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.user.provider.UserRecommendSleepTimeProvider;
import com.crrepa.ble.conn.bean.CRPSleepInfo;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

/* loaded from: classes2.dex */
public class a {
    private static final int MAX_NON_START_SLEEP_TIME = 1200;
    private static final int MAX_REM_TIME = 30;
    private static final int MAX_SLEEP_TIME = 720;
    private static final int MIN_NON_START_SLEEP_TIME = 600;
    private static final int MIN_REM_TIME = 15;
    private static final int REM_PERIOD = 90;
    private static final int REM_START_TIME = 70;
    private static final int REM_TIME_RANGE = 5;
    private static final int SLEEP_RESET_TIME = 20;

    private static List<CRPSleepInfo.DetailBean> addRemSleep(List<CRPSleepInfo.DetailBean> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (list.get(i8).getType() == 3) {
                return list;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 70;
        for (int i11 = 0; i11 < list.size(); i11++) {
            CRPSleepInfo.DetailBean detailBean = list.get(i11);
            int totalTime = detailBean.getTotalTime();
            i9 += totalTime;
            if (i11 == 0) {
                addSleepDetailList(arrayList, detailBean);
            } else {
                int type = detailBean.getType();
                int type2 = list.get(i11 - 1).getType();
                if (type != 1 || type2 != 2) {
                    addSleepDetailList(arrayList, detailBean);
                } else if (i9 < i10) {
                    addSleepDetailList(arrayList, detailBean);
                } else {
                    if (totalTime <= 30) {
                        detailBean.setType(SleepState.REM.getValue());
                        arrayList.add(detailBean);
                    } else {
                        int startTime = detailBean.getStartTime();
                        int remTime = getRemTime();
                        int i12 = startTime + remTime;
                        CRPSleepInfo.DetailBean detailBean2 = new CRPSleepInfo.DetailBean();
                        detailBean2.setStartTime(startTime);
                        detailBean2.setEndTime(i12);
                        detailBean2.setType(SleepState.REM.getValue());
                        detailBean2.setTotalTime(remTime);
                        arrayList.add(detailBean2);
                        detailBean.setStartTime(i12);
                        detailBean.setTotalTime(detailBean.getTotalTime() - remTime);
                        arrayList.add(detailBean);
                    }
                    i10 += 90;
                }
            }
        }
        return arrayList;
    }

    private static void addSleepDetailList(List<CRPSleepInfo.DetailBean> list, CRPSleepInfo.DetailBean detailBean) {
        if (list.isEmpty()) {
            list.add(detailBean);
            return;
        }
        CRPSleepInfo.DetailBean detailBean2 = list.get(list.size() - 1);
        if (detailBean2.getType() != detailBean.getType()) {
            list.add(detailBean);
        } else {
            detailBean2.setEndTime(detailBean.getEndTime());
            detailBean2.setTotalTime(detailBean2.getTotalTime() + detailBean.getTotalTime());
        }
    }

    public static Sleep convert(CRPSleepInfo cRPSleepInfo) {
        int i8;
        int i9;
        int i10;
        Sleep sleep = new Sleep();
        List<CRPSleepInfo.DetailBean> details = cRPSleepInfo.getDetails();
        if (details == null || details.isEmpty()) {
            i8 = 0;
            i9 = 0;
            i10 = 0;
        } else {
            List<CRPSleepInfo.DetailBean> addRemSleep = addRemSleep(details);
            i9 = 0;
            i10 = 0;
            for (CRPSleepInfo.DetailBean detailBean : addRemSleep) {
                int type = detailBean.getType();
                int totalTime = detailBean.getTotalTime();
                if (type == SleepState.LIGHT.getValue()) {
                    i9 += totalTime;
                } else if (type == SleepState.REM.getValue()) {
                    i10 += totalTime;
                }
            }
            sleep.setDetail(s.bean2Json(getSleepTimeDistribution(addRemSleep)));
            int startTime = addRemSleep.get(0).getStartTime();
            int endTime = addRemSleep.get(addRemSleep.size() - 1).getEndTime();
            i8 = startTime < endTime ? endTime - startTime : endTime + (1440 - startTime);
        }
        int totalTime2 = cRPSleepInfo.getTotalTime();
        if (i8 < totalTime2) {
            com.orhanobut.logger.f.e("totalTime more than the maxSleepTime！", new Object[0]);
            return null;
        }
        sleep.setDate(getSleepSaveDate());
        sleep.setDeep(Integer.valueOf(cRPSleepInfo.getRestfulTime()));
        sleep.setShallow(Integer.valueOf(i9));
        sleep.setRem(Integer.valueOf(i10));
        sleep.setSober(Integer.valueOf(cRPSleepInfo.getSoberTime()));
        sleep.setCompletion(Float.valueOf(totalTime2 / (UserRecommendSleepTimeProvider.getRecommendSleepTime() * 60)));
        return sleep;
    }

    private static int getRemTime() {
        return (int) ((new Random().nextFloat() * 5.0f) + 15.0f);
    }

    public static Date getSleepSaveDate() {
        Date date = new Date();
        return isResetSleep(date) ? m.getSameDayStartTime(m.getDateOfOffsetDay(date, 1)) : date;
    }

    private static SleepTimeDistributionModel getSleepTimeDistribution(List<CRPSleepInfo.DetailBean> list) {
        SleepTimeDistributionModel sleepTimeDistributionModel = new SleepTimeDistributionModel();
        ArrayList arrayList = new ArrayList();
        for (CRPSleepInfo.DetailBean detailBean : list) {
            SleepTimeDistributionModel.DetailBean detailBean2 = new SleepTimeDistributionModel.DetailBean();
            detailBean2.setStart(getSleepTimeMinutes(detailBean.getStartTime()));
            detailBean2.setEnd(getSleepTimeMinutes(detailBean.getEndTime()));
            detailBean2.setTotal(detailBean.getTotalTime());
            detailBean2.setType(detailBean.getType());
            arrayList.add(detailBean2);
        }
        sleepTimeDistributionModel.setDetail(arrayList);
        return sleepTimeDistributionModel;
    }

    private static String getSleepTimeMinutes(int i8) {
        StringBuilder sb = new StringBuilder();
        int i9 = i8 / 60;
        int i10 = i8 % 60;
        if (i9 < 10) {
            sb.append(0);
        }
        sb.append(i9 + ":");
        if (i10 < 10) {
            sb.append(0);
        }
        sb.append(i10);
        return sb.toString();
    }

    private static boolean isResetSleep(Date date) {
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        return 20 <= calendar.get(11);
    }
}
