package b3;

import android.content.Context;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;
import com.crrepa.ble.conn.bean.CRPStepInfo;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.u0;
import java.util.Date;

/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static Step convert(CRPStepInfo cRPStepInfo) {
        int steps = cRPStepInfo.getSteps();
        float distance = cRPStepInfo.getDistance();
        float calories = cRPStepInfo.getCalories();
        Step step = new Step();
        step.setDate(new Date());
        step.setSteps(Integer.valueOf(steps));
        step.setCalory(Float.valueOf(calories));
        step.setDistance(Float.valueOf(distance));
        step.setTime(Integer.valueOf(cRPStepInfo.getTime()));
        step.setCompletion(Float.valueOf(steps / GoalsSettingDaoProxy.getInstance().getTodayGoalSteps()));
        return step;
    }

    public static String convertDistance(Context context, Float f8) {
        double d8;
        String string;
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        int intValue = f8 == null ? 0 : f8.intValue();
        if (unitSystem != 1) {
            d8 = intValue;
            if (d8 > 1000.0d) {
                d8 = u0.m2Kms(intValue);
                string = context.getString(R.string.distance_unit_km);
            } else {
                string = context.getString(R.string.distance_unit_m);
            }
        } else if (intValue > 1609.0d) {
            d8 = u0.m2Miles(intValue);
            string = context.getString(R.string.distance_unit_miles);
        } else {
            d8 = (int) u0.m2Yds(intValue);
            string = context.getString(R.string.distance_unit_yd);
        }
        return n.format(d8, n.TWO_DECIMAL_PATTERN) + l.SPACE + string;
    }
}
