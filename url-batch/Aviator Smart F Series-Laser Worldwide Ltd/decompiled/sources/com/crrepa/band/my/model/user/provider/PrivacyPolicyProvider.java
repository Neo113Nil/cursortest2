package com.crrepa.band.my.model.user.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class PrivacyPolicyProvider {
    private PrivacyPolicyProvider() {
    }

    public static void agreePrivacyPolicy() {
        g.getInstance().putBoolean(BaseParamNames.PRIVACY_POLICY, true);
    }

    public static boolean isAgreePrivacyPolicy() {
        return g.getInstance().getBoolean(BaseParamNames.PRIVACY_POLICY, false);
    }
}
