package com.bytedance.sdk.openadsdk.uqh;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.uqh.fs;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zn {
    private final Context fs;
    private SharedPreferences zmn;
    private final String zn;

    public zn(Context context, String str) {
        this.fs = context;
        this.zn = str;
    }

    public SharedPreferences zmn() {
        Context context;
        SharedPreferences sharedPreferences = this.zmn;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        if (TextUtils.isEmpty(this.zn) || (context = this.fs) == null) {
            return null;
        }
        try {
            this.zmn = context.getSharedPreferences(this.zn, 0);
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
        return this.zmn;
    }

    public void zmn(JSONObject jSONObject) {
        try {
            SharedPreferences zmn = zmn();
            if (zmn != null) {
                SharedPreferences.Editor edit = zmn.edit();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        if (!TextUtils.isEmpty(next)) {
                            Object obj = jSONObject.get(next);
                            if (obj instanceof Integer) {
                                edit.putInt(next, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                edit.putLong(next, ((Long) obj).longValue());
                            } else if (obj instanceof String) {
                                edit.putString(next, (String) obj);
                            } else if (obj instanceof Boolean) {
                                edit.putBoolean(next, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Float) {
                                edit.putFloat(next, ((Float) obj).floatValue());
                            } else if (obj instanceof Double) {
                                Double d = (Double) obj;
                                d.doubleValue();
                                edit.putFloat(next, d.floatValue());
                            } else {
                                edit.putString(next, String.valueOf(obj));
                            }
                        }
                    } catch (Throwable th) {
                        Log.e("SPUnit", th.getMessage());
                    }
                }
                edit.apply();
            }
        } catch (Throwable th2) {
            Log.e("SPUnit", th2.getMessage());
        }
    }

    public void zmn(String str, long j) {
        try {
            SharedPreferences zmn = zmn();
            if (zmn != null) {
                SharedPreferences.Editor edit = zmn.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int zmn(String str, int i) {
        try {
            SharedPreferences zmn = zmn();
            if (zmn != null && zmn.contains(str)) {
                return zmn.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            Log.i("SPUnit", this.zn + th.getMessage());
            return i;
        }
    }

    public long fs(String str, long j) {
        try {
            SharedPreferences zmn = zmn();
            if (zmn != null && zmn.contains(str)) {
                return zmn.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            Log.i("SPUnit", this.zn + th.getMessage());
            return j;
        }
    }

    public String zmn(String str, String str2) {
        try {
            SharedPreferences zmn = zmn();
            if (zmn != null && zmn.contains(str)) {
                return zmn.getString(str, str2);
            }
            return str2;
        } catch (Throwable th) {
            Log.i("SPUnit", this.zn + th.getMessage());
            return str2;
        }
    }

    public boolean zmn(String str, boolean z) {
        try {
            SharedPreferences zmn = zmn();
            if (zmn != null && zmn.contains(str)) {
                return zmn.getBoolean(str, z);
            }
            return z;
        } catch (Throwable th) {
            Log.i("SPUnit", this.zn + th.getMessage());
            return z;
        }
    }

    public <T> T zmn(String str, T t, fs.zmn<T> zmnVar) {
        String string;
        if (str != null && !str.isEmpty()) {
            try {
                SharedPreferences zmn = zmn();
                if (zmn != null && zmn.contains(str) && (string = zmn.getString(str, null)) != null && zmnVar != null) {
                    T fs = zmnVar.fs(string);
                    if (fs != null) {
                        return fs;
                    }
                }
            } catch (Throwable th) {
                Log.i("SPUnit", this.zn + th.getMessage());
            }
        }
        return t;
    }

    public void fs() {
        SharedPreferences zmn = zmn();
        if (zmn != null) {
            SharedPreferences.Editor edit = zmn.edit();
            edit.clear();
            edit.commit();
        }
    }
}
