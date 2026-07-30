package com.crrepa.band.my.model.user.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class UserTokenProvider {
    private static final String DEFAULT_TOKEN = "111111";

    private UserTokenProvider() {
    }

    public static String getUserToken() {
        return g.getInstance().getString(BaseParamNames.TOKEN, DEFAULT_TOKEN);
    }
}
