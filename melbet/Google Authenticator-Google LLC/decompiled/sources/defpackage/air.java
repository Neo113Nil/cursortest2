package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class air {
    public final Context a;
    public boolean b;
    public PreferenceScreen c;
    public aiq d;
    public aio e;
    public aip f;
    private long g = 0;
    private SharedPreferences h = null;
    private SharedPreferences.Editor i;
    private final String j;

    public air(Context context) {
        this.a = context;
        this.j = e(context);
    }

    public static String e(Context context) {
        return String.valueOf(context.getPackageName()).concat("_preferences");
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.g;
            this.g = 1 + j;
        }
        return j;
    }

    public final SharedPreferences.Editor b() {
        if (!this.b) {
            return c().edit();
        }
        SharedPreferences.Editor editor = this.i;
        if (editor != null) {
            return editor;
        }
        SharedPreferences.Editor edit = c().edit();
        this.i = edit;
        return edit;
    }

    public final SharedPreferences c() {
        SharedPreferences sharedPreferences = this.h;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.a.getSharedPreferences(this.j, 0);
        this.h = sharedPreferences2;
        return sharedPreferences2;
    }

    public final Preference d(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.c;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l(charSequence);
    }

    public final void f(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.i) != null) {
            editor.apply();
        }
        this.b = z;
    }
}
