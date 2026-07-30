package com.baidu.ar;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class w2 {

    /* renamed from: d, reason: collision with root package name */
    public static int f3599d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static int f3600e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static int f3601f = 3;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f3602a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map<String, String> f3603b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f3604c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(int i8, String str) {
        String str2;
        Map<String, String> map;
        if (i8 == f3599d) {
            map = this.f3602a;
        } else if (i8 == f3600e) {
            map = this.f3603b;
        } else {
            if (i8 == f3601f) {
                SharedPreferences sharedPreferences = this.f3604c;
                if (sharedPreferences != null) {
                    str2 = sharedPreferences.getString(str, "");
                    return str2 == null ? "" : str2;
                }
                Log.e("TAG", "prefs data store is null");
            }
            str2 = null;
            if (str2 == null) {
            }
        }
        str2 = map.get(str);
        if (str2 == null) {
        }
    }

    public void a() {
        this.f3602a.clear();
    }

    public void a(int i8, String str, String str2) {
        Map<String, String> map;
        if (i8 == f3599d) {
            map = this.f3602a;
        } else {
            if (i8 != f3600e) {
                if (i8 == f3601f) {
                    SharedPreferences sharedPreferences = this.f3604c;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putString(str, str2).commit();
                        return;
                    } else {
                        Log.e("TAG", "prefs data store is null");
                        return;
                    }
                }
                return;
            }
            map = this.f3603b;
        }
        map.put(str, str2);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.f3604c = sharedPreferences;
    }
}
