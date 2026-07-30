package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(SharedPreferences sharedPreferences, boolean z7, f6.l lVar) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        lVar.invoke(edit);
        if (z7) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z7, f6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        lVar.invoke(edit);
        if (z7) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
