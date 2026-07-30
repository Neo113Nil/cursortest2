package w2;

import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class b {
    private static final String PHYSIOLOGICAL_GUIDE_COMPLETE = "physiological_guide_complete";

    private b() {
    }

    public static void guideComplete() {
        g.getInstance().putBoolean(PHYSIOLOGICAL_GUIDE_COMPLETE, true);
    }

    public static boolean isGuideComplete() {
        return g.getInstance().getBoolean(PHYSIOLOGICAL_GUIDE_COMPLETE, false);
    }
}
