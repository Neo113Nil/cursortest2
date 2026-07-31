package v2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import o3.j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f22817a;

    public c(Context context) {
        try {
            Context c7 = j.c(context);
            this.f22817a = c7 == null ? null : c7.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f22817a = null;
        }
    }

    public final boolean a(String str, boolean z6) {
        try {
            SharedPreferences sharedPreferences = this.f22817a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }

    final float b(String str, float f7) {
        try {
            SharedPreferences sharedPreferences = this.f22817a;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    final String c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f22817a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }
}
