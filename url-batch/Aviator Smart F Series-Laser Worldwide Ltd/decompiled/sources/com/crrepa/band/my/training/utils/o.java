package com.crrepa.band.my.training.utils;

/* loaded from: classes3.dex */
public class o {
    private static final boolean DEFAULT_ENABLED = true;
    private static final String KEY_SYNC_CARD_ENABLED = "key_training_sync_card_enabled";

    private o() {
    }

    public static void clear() {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().remove(KEY_SYNC_CARD_ENABLED);
    }

    public static boolean isEnabled() {
        return com.moyoung.dafit.module.common.network.provider.g.getInstance().getBoolean(KEY_SYNC_CARD_ENABLED, true);
    }

    public static void setEnabled(boolean z7) {
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putBoolean(KEY_SYNC_CARD_ENABLED, z7);
    }
}
