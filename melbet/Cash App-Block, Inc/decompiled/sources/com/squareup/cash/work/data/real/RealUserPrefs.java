package com.squareup.cash.work.data.real;

import android.content.SharedPreferences;
import androidx.room.Room;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda0;
import com.squareup.preferences.SharedPreferencesKeyValue;

/* loaded from: classes7.dex */
public final class RealUserPrefs {
    public final SharedPreferencesKeyValue lastClockedInInfoKeyValue;

    public RealUserPrefs(SharedPreferences sharedPreferences) {
        this.lastClockedInInfoKeyValue = Room.StringKeyValue(sharedPreferences, "last_clocked_in_info", null, false);
        Room.StringKeyValue(sharedPreferences, "auto_clock_out_dialog_dismissed", null, false);
        Room.StringKeyValue(sharedPreferences, "auto_clock_out_notification_dialog_dismissed", null, false);
        Room.SerDeKeyValue$default(sharedPreferences, "onboarding_tasks_dismissed_by_merchants", new CardAppletTile$$ExternalSyntheticLambda0(28), new CardAppletTile$$ExternalSyntheticLambda0(29), new AlertBannerKt$$ExternalSyntheticLambda0(26), 96);
    }
}
