package com.orhanobut.logger;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public class e implements d {
    static final String DEFAULT_TAG = "NO_TAG";

    @Override // com.orhanobut.logger.d
    public void log(int i8, @Nullable String str, @NonNull String str2) {
        j.checkNotNull(str2);
        if (str == null) {
            str = DEFAULT_TAG;
        }
        Log.println(i8, str, str2);
    }
}
