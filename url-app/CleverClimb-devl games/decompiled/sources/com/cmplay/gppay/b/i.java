package com.cmplay.gppay.b;

import android.content.SharedPreferences;
import android.util.Log;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f4138a;

    /* renamed from: b, reason: collision with root package name */
    private final g f4139b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences.Editor f4140c = null;

    public i(SharedPreferences sharedPreferences, g gVar) {
        this.f4138a = sharedPreferences;
        this.f4139b = gVar;
    }

    public void a() {
        if (this.f4140c != null) {
            this.f4140c.commit();
            this.f4140c = null;
        }
    }

    public void a(String str, String str2) {
        if (this.f4140c == null) {
            this.f4140c = this.f4138a.edit();
        }
        this.f4140c.putString(str, this.f4139b.a(str2, str));
    }

    public String b(String str, String str2) {
        String string = this.f4138a.getString(str, null);
        if (string == null) {
            return str2;
        }
        try {
            return this.f4139b.b(string, str);
        } catch (l unused) {
            Log.w("PreferenceObfuscator", "Validation error while reading preference: " + str);
            return str2;
        }
    }
}
