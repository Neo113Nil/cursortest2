package com.crrepa.band.my.model.user.provider;

import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class DailyQuotesProvider {
    private static final String DAILY_QUOTES_STATE = "daily_quotes_state";

    private DailyQuotesProvider() {
    }

    public static boolean getDailyQuotesState() {
        return g.getInstance().getBoolean(DAILY_QUOTES_STATE, true);
    }

    public static void saveDailyQuotesState(boolean z7) {
        g.getInstance().putBoolean(DAILY_QUOTES_STATE, z7);
    }
}
