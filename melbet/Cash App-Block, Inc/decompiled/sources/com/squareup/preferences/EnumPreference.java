package com.squareup.preferences;

import android.content.SharedPreferences;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class EnumPreference {
    public final Class cls;
    public final Enum defaultValue;
    public final String key;
    public final SharedPreferences preferences;

    public EnumPreference(SharedPreferences sharedPreferences, Class cls, String str, Enum r4) {
        this.preferences = sharedPreferences;
        this.cls = cls;
        this.key = str;
        this.defaultValue = r4;
    }

    public final Flow asFlow() {
        return FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new PreferenceFlow(this.key, this.preferences, new RoomDatabase$closeBarrier$1(0, this, EnumPreference.class, "get", "get()Ljava/lang/Enum;", 0, 12)), 24));
    }

    public final Enum get() {
        Class cls = this.cls;
        String string2 = this.preferences.getString(this.key, null);
        if (string2 != null) {
            try {
                Enum valueOf = Enum.valueOf(cls, string2);
                valueOf.getClass();
                return valueOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        return this.defaultValue;
    }

    public final void set(Enum r2) {
        this.preferences.edit().putString(this.key, r2.name()).apply();
    }
}
