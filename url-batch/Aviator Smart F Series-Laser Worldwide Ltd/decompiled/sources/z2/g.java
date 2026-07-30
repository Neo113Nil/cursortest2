package z2;

import com.crrepa.band.my.model.SleepTimeDistributionModel;
import com.crrepa.band.my.model.db.Sleep;
import com.moyoung.dafit.module.common.utils.s;
import java.util.List;

/* loaded from: classes2.dex */
public class g {
    private g() {
    }

    public static int getAwakeTime(Sleep sleep) {
        Integer sober = sleep.getSober();
        if (sober != null) {
            return sober.intValue();
        }
        SleepTimeDistributionModel sleepTimeDistributionModel = (SleepTimeDistributionModel) s.json2Bean(sleep.getDetail(), SleepTimeDistributionModel.class);
        int i8 = 0;
        if (sleepTimeDistributionModel == null) {
            return 0;
        }
        for (SleepTimeDistributionModel.DetailBean detailBean : sleepTimeDistributionModel.getDetail()) {
            if (detailBean.getType() == 0) {
                i8 += detailBean.getTotal();
            }
        }
        return i8;
    }

    public static int getFallAsleepTime(Sleep sleep) {
        List<SleepTimeDistributionModel.DetailBean> detail;
        SleepTimeDistributionModel sleepTimeDistributionModel = (SleepTimeDistributionModel) s.json2Bean(sleep.getDetail(), SleepTimeDistributionModel.class);
        if (sleepTimeDistributionModel == null || (detail = sleepTimeDistributionModel.getDetail()) == null || detail.size() == 0) {
            return -1;
        }
        return Integer.parseInt(detail.get(0).getStart().split(":")[0]);
    }

    public static int getWakeUpTime(Sleep sleep) {
        List<SleepTimeDistributionModel.DetailBean> detail;
        SleepTimeDistributionModel sleepTimeDistributionModel = (SleepTimeDistributionModel) s.json2Bean(sleep.getDetail(), SleepTimeDistributionModel.class);
        if (sleepTimeDistributionModel == null || (detail = sleepTimeDistributionModel.getDetail()) == null || detail.size() == 0) {
            return -1;
        }
        return Integer.parseInt(detail.get(detail.size() - 1).getEnd().split(":")[0]);
    }
}
