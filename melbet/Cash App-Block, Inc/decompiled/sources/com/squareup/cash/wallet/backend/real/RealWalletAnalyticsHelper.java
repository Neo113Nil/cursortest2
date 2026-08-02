package com.squareup.cash.wallet.backend.real;

import android.content.SharedPreferences;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.wallet.backend.api.WalletAnalyticsHelper$Flow;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class RealWalletAnalyticsHelper {
    public final Analytics analytics;
    public final SharedPreferences preferences;
    public final HashSet trackedImpressionEvents = new HashSet();

    public RealWalletAnalyticsHelper(RealUuidGenerator realUuidGenerator, SharedPreferences sharedPreferences, Analytics analytics) {
        this.preferences = sharedPreferences;
        this.analytics = analytics;
    }

    public final String getFlowToken() {
        WalletAnalyticsHelper$Flow[] walletAnalyticsHelper$FlowArr = WalletAnalyticsHelper$Flow.$VALUES;
        SharedPreferences sharedPreferences = this.preferences;
        String string2 = sharedPreferences.getString("WALLET_CARD_FLOW_TOKEN", null);
        if (string2 != null) {
            return string2;
        }
        String m = re$$ExternalSyntheticOutline0.m();
        sharedPreferences.edit().putString("WALLET_CARD_FLOW_TOKEN", m).apply();
        return m;
    }

    public final void resetAnalyticsState() {
        WalletAnalyticsHelper$Flow[] walletAnalyticsHelper$FlowArr = WalletAnalyticsHelper$Flow.$VALUES;
        this.preferences.edit().putString("WALLET_CARD_FLOW_TOKEN", re$$ExternalSyntheticOutline0.m()).apply();
        this.trackedImpressionEvents.clear();
    }
}
