package com.crrepa.band.my.home.guidance;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.s0;

/* loaded from: classes2.dex */
public class b {
    private static final String GUIDANCE_STATE = "guidance_state";
    public static final int GUIDANCE_STATE_BLUETOOTH_PERMISSION = 12;
    public static final int GUIDANCE_STATE_COMPLETED = 0;
    public static final int GUIDANCE_STATE_DEFAULT = -1;
    public static final int GUIDANCE_STATE_LOCATION_PERMISSION = 11;
    public static final int GUIDANCE_STATE_NOTIFICATION_PERMISSION = 10;
    public static final int GUIDANCE_STATE_USER_AGE = 2;
    public static final int GUIDANCE_STATE_USER_GENDER = 1;
    public static final int GUIDANCE_STATE_USER_HEIGHT = 3;
    public static final int GUIDANCE_STATE_USER_STEP_LENGTH = 5;
    public static final int GUIDANCE_STATE_USER_WEIGHT = 4;

    public static void agreePrivacyPolicy() {
        g.getInstance().putBoolean(BaseParamNames.FIRST_OPEN_APP, false);
        s0.logEvent("首次点击同意隐私协议按钮");
    }

    public static int getGuidanceState() {
        return g.getInstance().getInt(GUIDANCE_STATE, -1);
    }

    public static boolean isAgreePrivacyPolicy() {
        return !g.getInstance().getBoolean(BaseParamNames.FIRST_OPEN_APP, true);
    }

    public static boolean isGuidanceCompleted() {
        return getGuidanceState() == 0;
    }

    public static void setGuidanceState(int i8) {
        if (i8 == 0 || i8 > getGuidanceState()) {
            g.getInstance().putInt(GUIDANCE_STATE, i8);
        }
    }
}
