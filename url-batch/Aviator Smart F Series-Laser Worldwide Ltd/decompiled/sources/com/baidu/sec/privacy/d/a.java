package com.baidu.sec.privacy.d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.sec.privacy.f.c;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static JSONObject f10628a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f10629b = true;

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f10630c = null;

    /* renamed from: d, reason: collision with root package name */
    public static SharedPreferences.Editor f10631d = null;

    /* renamed from: e, reason: collision with root package name */
    public static String f10632e = "sofire";

    /* renamed from: f, reason: collision with root package name */
    public static HashSet<Integer> f10633f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    public static HashSet<Integer> f10634g = new HashSet<>();

    /* renamed from: h, reason: collision with root package name */
    public static boolean f10635h = true;

    /* renamed from: i, reason: collision with root package name */
    public static SharedPreferences.OnSharedPreferenceChangeListener f10636i = new SharedPreferencesOnSharedPreferenceChangeListenerC0143a();

    /* renamed from: com.baidu.sec.privacy.d.a$a, reason: collision with other inner class name */
    public class SharedPreferencesOnSharedPreferenceChangeListenerC0143a implements SharedPreferences.OnSharedPreferenceChangeListener {

        /* renamed from: com.baidu.sec.privacy.d.a$a$a, reason: collision with other inner class name */
        public class RunnableC0144a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SharedPreferences f10637a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f10638b;

            public RunnableC0144a(SharedPreferencesOnSharedPreferenceChangeListenerC0143a sharedPreferencesOnSharedPreferenceChangeListenerC0143a, SharedPreferences sharedPreferences, String str) {
                this.f10637a = sharedPreferences;
                this.f10638b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.c(this.f10637a.getString(this.f10638b, ""));
            }
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (b.f10640b.equals(str)) {
                new Thread(new RunnableC0144a(this, sharedPreferences, str)).start();
            }
        }
    }

    public static boolean a() {
        return f10629b;
    }

    public static boolean b() {
        return f10635h;
    }

    public static void c(String str) {
        try {
            f10628a = null;
            f10633f.clear();
            f10634g.clear();
            f10635h = true;
            try {
                f10628a = new JSONObject(str);
            } catch (Throwable unused) {
                f10628a = new JSONObject();
            }
            c();
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static boolean a(int i8) {
        try {
            return f10634g.contains(Integer.valueOf(i8));
        } catch (Throwable th) {
            c.a(th);
            return false;
        }
    }

    public static void b(String str) {
        try {
            SharedPreferences sharedPreferences = com.baidu.sec.privacy.b.b.a().getSharedPreferences("prv_config", 0);
            f10630c = sharedPreferences;
            f10631d = sharedPreferences.edit();
            f10632e = str;
            c(b.a(str, f10636i));
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static String a(String str, String str2) {
        try {
            String string = f10630c.getString(str, str2);
            if (TextUtils.isEmpty(string)) {
                return str2;
            }
            try {
                return com.baidu.sec.privacy.f.a.a(string);
            } catch (Exception unused) {
                return str2;
            }
        } catch (Throwable th) {
            c.a(th);
            return str2;
        }
    }

    public static boolean b(int i8) {
        try {
            if (b.b(f10632e)) {
                return !f10633f.contains(Integer.valueOf(i8));
            }
            return false;
        } catch (Throwable th) {
            c.a(th);
            return false;
        }
    }

    public static void c() {
        if (f10628a.optInt("0", 1) == 1) {
            f10629b = true;
        } else {
            f10629b = false;
        }
        JSONArray optJSONArray = f10628a.optJSONArray("1");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    f10633f.add(Integer.valueOf(optJSONArray.getInt(i8)));
                } catch (JSONException unused) {
                }
            }
        }
        JSONArray optJSONArray2 = f10628a.optJSONArray(ExifInterface.GPS_MEASUREMENT_3D);
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i9 = 0; i9 < length2; i9++) {
                try {
                    f10634g.add(Integer.valueOf(optJSONArray2.getInt(i9)));
                } catch (JSONException unused2) {
                }
            }
        }
        if (f10628a.optInt("4", 1) == 1) {
            f10635h = true;
        } else {
            f10635h = false;
        }
    }

    public static boolean a(String str) {
        return f10630c.contains(str);
    }

    public static long a(String str, long j8) {
        return f10630c.getLong(str, j8);
    }

    public static int a(String str, int i8) {
        return f10630c.getInt(str, i8);
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            f10631d.putString(str, com.baidu.sec.privacy.f.a.a(str2.getBytes()));
            f10631d.putLong(str + "la_in", System.currentTimeMillis());
            f10631d.commit();
        } catch (Throwable th) {
            c.a(th);
        }
    }

    public static void b(String str, int i8) {
        try {
            f10631d.putInt(str, i8);
            f10631d.putLong(str + "la_in", System.currentTimeMillis());
            f10631d.commit();
        } catch (Throwable th) {
            c.a(th);
        }
    }
}
