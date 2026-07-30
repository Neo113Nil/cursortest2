package b3;

import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.GoalsSettingDaoProxy;

/* loaded from: classes2.dex */
public class c {
    private c() {
    }

    public static Float getCompletion(Step step) {
        if (step == null) {
            return Float.valueOf(0.0f);
        }
        Float completion = step.getCompletion();
        if (completion != null) {
            return completion;
        }
        return Float.valueOf(step.getSteps().intValue() / GoalsSettingDaoProxy.getInstance().getTodayGoalSteps());
    }
}
