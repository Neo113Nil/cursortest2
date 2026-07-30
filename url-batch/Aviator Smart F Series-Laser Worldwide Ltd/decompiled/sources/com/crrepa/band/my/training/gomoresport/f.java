package com.crrepa.band.my.training.gomoresport;

/* loaded from: classes3.dex */
public class f {
    public static final String KEY_IS_SUPPORT_GOMORE_SPORT = "key_is_support_gomore_sport";

    public static void delete() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_IS_SUPPORT_GOMORE_SPORT);
    }

    public static boolean isSupportGomoreSport() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(KEY_IS_SUPPORT_GOMORE_SPORT, false);
    }

    public static void saveIsSupportGomoreSport(boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(KEY_IS_SUPPORT_GOMORE_SPORT, z7);
    }
}
