package com.squareup.preferences;

import android.content.SharedPreferences;
import com.squareup.preferences.SharedPreferencesKeyValue;

/* loaded from: classes.dex */
public final /* synthetic */ class SharedPreferencesKeyValueKt$$ExternalSyntheticLambda0 implements SharedPreferencesKeyValue.Reader {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SharedPreferences f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ SharedPreferencesKeyValueKt$$ExternalSyntheticLambda0(SharedPreferences sharedPreferences, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedPreferences;
        this.f$1 = str;
    }

    @Override // com.squareup.preferences.SharedPreferencesKeyValue.Reader
    public final Object read(SharedPreferencesKeyValue sharedPreferencesKeyValue) {
        int i = this.$r8$classId;
        String str = this.f$1;
        SharedPreferences sharedPreferences = this.f$0;
        switch (i) {
            case 0:
                sharedPreferencesKeyValue.getClass();
                return Integer.valueOf(sharedPreferences.getInt(str, 0));
            default:
                sharedPreferencesKeyValue.getClass();
                return Long.valueOf(sharedPreferences.getLong(str, 0L));
        }
    }
}
