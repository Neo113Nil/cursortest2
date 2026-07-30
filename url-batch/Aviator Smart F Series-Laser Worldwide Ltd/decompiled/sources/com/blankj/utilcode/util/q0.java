package com.blankj.utilcode.util;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class q0 {
    private static final Map<String, q0> SP_UTILS_MAP = new HashMap();
    private SharedPreferences sp;

    private q0(String str) {
        this.sp = z0.getApp().getSharedPreferences(str, 0);
    }

    public static q0 getInstance() {
        return getInstance("", 0);
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!Character.isWhitespace(str.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public boolean contains(@NonNull String str) {
        return this.sp.contains(str);
    }

    public Map<String, ?> getAll() {
        return this.sp.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return getBoolean(str, false);
    }

    public float getFloat(@NonNull String str) {
        return getFloat(str, -1.0f);
    }

    public int getInt(@NonNull String str) {
        return getInt(str, -1);
    }

    public long getLong(@NonNull String str) {
        return getLong(str, -1L);
    }

    public String getString(@NonNull String str) {
        return getString(str, "");
    }

    public Set<String> getStringSet(@NonNull String str) {
        return getStringSet(str, Collections.emptySet());
    }

    public void put(@NonNull String str, String str2) {
        put(str, str2, false);
    }

    public void remove(@NonNull String str) {
        remove(str, false);
    }

    public static q0 getInstance(int i8) {
        return getInstance("", i8);
    }

    public void clear(boolean z7) {
        if (z7) {
            this.sp.edit().clear().commit();
        } else {
            this.sp.edit().clear().apply();
        }
    }

    public boolean getBoolean(@NonNull String str, boolean z7) {
        return this.sp.getBoolean(str, z7);
    }

    public float getFloat(@NonNull String str, float f8) {
        return this.sp.getFloat(str, f8);
    }

    public int getInt(@NonNull String str, int i8) {
        return this.sp.getInt(str, i8);
    }

    public long getLong(@NonNull String str, long j8) {
        return this.sp.getLong(str, j8);
    }

    public String getString(@NonNull String str, String str2) {
        return this.sp.getString(str, str2);
    }

    public Set<String> getStringSet(@NonNull String str, Set<String> set) {
        return this.sp.getStringSet(str, set);
    }

    public void put(@NonNull String str, String str2, boolean z7) {
        if (z7) {
            this.sp.edit().putString(str, str2).commit();
        } else {
            this.sp.edit().putString(str, str2).apply();
        }
    }

    public void remove(@NonNull String str, boolean z7) {
        if (z7) {
            this.sp.edit().remove(str).commit();
        } else {
            this.sp.edit().remove(str).apply();
        }
    }

    private q0(String str, int i8) {
        this.sp = z0.getApp().getSharedPreferences(str, i8);
    }

    public static q0 getInstance(String str) {
        return getInstance(str, 0);
    }

    public static q0 getInstance(String str, int i8) {
        if (isSpace(str)) {
            str = "spUtils";
        }
        Map<String, q0> map = SP_UTILS_MAP;
        q0 q0Var = map.get(str);
        if (q0Var == null) {
            synchronized (q0.class) {
                try {
                    q0Var = map.get(str);
                    if (q0Var == null) {
                        q0Var = new q0(str, i8);
                        map.put(str, q0Var);
                    }
                } finally {
                }
            }
        }
        return q0Var;
    }

    public void put(@NonNull String str, int i8) {
        put(str, i8, false);
    }

    public void put(@NonNull String str, int i8, boolean z7) {
        if (z7) {
            this.sp.edit().putInt(str, i8).commit();
        } else {
            this.sp.edit().putInt(str, i8).apply();
        }
    }

    public void put(@NonNull String str, long j8) {
        put(str, j8, false);
    }

    public void put(@NonNull String str, long j8, boolean z7) {
        if (z7) {
            this.sp.edit().putLong(str, j8).commit();
        } else {
            this.sp.edit().putLong(str, j8).apply();
        }
    }

    public void put(@NonNull String str, float f8) {
        put(str, f8, false);
    }

    public void put(@NonNull String str, float f8, boolean z7) {
        if (z7) {
            this.sp.edit().putFloat(str, f8).commit();
        } else {
            this.sp.edit().putFloat(str, f8).apply();
        }
    }

    public void put(@NonNull String str, boolean z7) {
        put(str, z7, false);
    }

    public void put(@NonNull String str, boolean z7, boolean z8) {
        if (z8) {
            this.sp.edit().putBoolean(str, z7).commit();
        } else {
            this.sp.edit().putBoolean(str, z7).apply();
        }
    }

    public void put(@NonNull String str, Set<String> set) {
        put(str, set, false);
    }

    public void put(@NonNull String str, Set<String> set, boolean z7) {
        if (z7) {
            this.sp.edit().putStringSet(str, set).commit();
        } else {
            this.sp.edit().putStringSet(str, set).apply();
        }
    }
}
