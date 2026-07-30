package z2;

import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.user.provider.UserRecommendSleepTimeProvider;

/* loaded from: classes2.dex */
public class d {
    private d() {
    }

    public static Float getCompletion(Sleep sleep) {
        if (sleep == null) {
            return Float.valueOf(0.0f);
        }
        Float completion = sleep.getCompletion();
        if (completion != null) {
            return completion;
        }
        return Float.valueOf((sleep.getDeep().intValue() + sleep.getShallow().intValue()) / UserRecommendSleepTimeProvider.getRecommendSleepTime());
    }
}
