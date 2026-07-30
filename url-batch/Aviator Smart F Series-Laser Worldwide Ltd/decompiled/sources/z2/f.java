package z2;

import android.text.TextUtils;
import com.crrepa.band.my.model.SleepTimeDistributionModel;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.proxy.SleepDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class f {
    private static final int EXCELLENT_AWAKE_COUNT = 1;
    private static final int EXCELLENT_AWAKE_TIME = 5;
    private static final int EXCELLENT_QUALITY_FRACTION = 0;
    private static final int EXCELLENT_REGULAR_SLEEP = 7;
    private static final int EXCELLENT_RESTFUL_PERCENT = 20;
    private static final int EXCELLENT_SLEEP_TIME = 7;
    private static final int EXCELLENT_START_SLEEP_HOUR = 23;
    private static final int GOOD_AWAKE_COUNT = 2;
    private static final int GOOD_AWAKE_TIME = 10;
    private static final int GOOD_QUALITY_FRACTION = 1;
    private static final int GOOD_REGULAR_SLEEP = 5;
    private static final int GOOD_RESTFUL_PERCENT = 15;
    private static final int GOOD_SLEEP_TIME = 6;
    private static final int GOOD_START_SLEEP_HOUR = 24;
    private static final int MAX_SLEEP_QUALITY_VALUE = 100;
    private static final int MEDIUM_AWAKE_COUNT = 3;
    private static final int MEDIUM_AWAKE_TIME = 15;
    private static final int MEDIUM_QUALITY_FRACTION = 2;
    private static final int MEDIUM_REGULAR_SLEEP = 3;
    private static final int MEDIUM_RESTFUL_PERCENT = 10;
    private static final int MEDIUM_SLEEP_TIME = 5;
    private static final int MEDIUM_START_SLEEP_HOUR = 25;
    public static final int MIN_SLEEP_TIME_MINUTES = 300;
    private static final int POOR_AWAKE_COUNT = 5;
    private static final int POOR_QUALITY_FRACTION = 3;
    private static final int QUALITY_FACTOR = 3;
    public static final int SLEEP_TIME_SCORE_UNIT = 5;

    private static int getAwakeCount(Sleep sleep) {
        SleepTimeDistributionModel sleepTimeDistributionModel;
        String detail = sleep.getDetail();
        if (TextUtils.isEmpty(detail) || (sleepTimeDistributionModel = (SleepTimeDistributionModel) s.json2Bean(detail, SleepTimeDistributionModel.class)) == null) {
            return 5;
        }
        Iterator<SleepTimeDistributionModel.DetailBean> it = sleepTimeDistributionModel.getDetail().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (it.next().getType() == 0) {
                i8++;
            }
        }
        return i8;
    }

    private static int getAwakeCountQuality(int i8) {
        if (i8 <= 1) {
            return 0;
        }
        if (i8 <= 2) {
            return 1;
        }
        return i8 <= 3 ? 2 : 3;
    }

    private static int getAwakeTimeQuality(int i8) {
        if (i8 <= 5) {
            return 0;
        }
        if (i8 <= 10) {
            return 1;
        }
        return i8 <= 15 ? 2 : 3;
    }

    private static int getRegularSleepQuality(int i8) {
        if (i8 >= 7) {
            return 0;
        }
        if (i8 >= 5) {
            return 1;
        }
        return i8 >= 3 ? 2 : 3;
    }

    private static int getRestfulPercentQuality(int i8) {
        if (i8 >= 20) {
            return 0;
        }
        if (i8 >= 15) {
            return 1;
        }
        return i8 >= 10 ? 2 : 3;
    }

    public static int getSleepQuality(int i8, Sleep sleep) {
        if (sleep == null) {
            return 0;
        }
        int sleepTime = SleepDaoProxy.getSleepTime(sleep);
        return sleepTime < 300 ? sleepTime / 5 : 100 - ((((((getSleepTimeQuality(sleepTime / 60) + getRegularSleepQuality(i8)) + getRestfulPercentQuality((int) ((sleep.getDeep().intValue() / sleepTime) * 100.0f))) + getAwakeCountQuality(getAwakeCount(sleep))) + getAwakeTimeQuality(g.getAwakeTime(sleep))) + getStartSleepTimeQuality(g.getFallAsleepTime(sleep))) * 3);
    }

    private static int getSleepTimeQuality(int i8) {
        if (i8 >= 7) {
            return 0;
        }
        if (i8 >= 6) {
            return 1;
        }
        return i8 >= 5 ? 2 : 3;
    }

    private static int getStartSleepTimeQuality(int i8) {
        if (i8 < 12) {
            i8 += 24;
        }
        if (i8 <= 23) {
            return 0;
        }
        if (i8 <= 24) {
            return 1;
        }
        return i8 <= 25 ? 2 : 3;
    }
}
