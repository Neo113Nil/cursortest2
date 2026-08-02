package com.squareup.cash.work.session;

import android.content.SharedPreferences;
import androidx.room.Room;
import com.squareup.preferences.SharedPreferencesKeyValue;

/* loaded from: classes7.dex */
public final class SquareAccountStore {
    public final SharedPreferences preferences;
    public final SharedPreferencesKeyValue selectedMerchantTokenKeyValue;
    public final SharedPreferencesKeyValue userTokenKeyValue;

    public SquareAccountStore(SharedPreferences sharedPreferences) {
        this.preferences = sharedPreferences;
        this.selectedMerchantTokenKeyValue = Room.StringKeyValue(sharedPreferences, "selected_merchant_token", null, false);
        this.userTokenKeyValue = Room.StringKeyValue(sharedPreferences, "user_token", null, false);
    }
}
