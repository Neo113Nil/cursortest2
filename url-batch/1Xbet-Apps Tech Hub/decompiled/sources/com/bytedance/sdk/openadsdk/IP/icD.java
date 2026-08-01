package com.bytedance.sdk.openadsdk.IP;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: SPUnit.java */
/* loaded from: classes2.dex */
public class icD {
    private final String icD;
    private SharedPreferences pvs;

    public icD(Context context, String str) {
        this.icD = str;
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        this.pvs = context.getSharedPreferences(str, 0);
    }

    public void pvs(JSONObject jSONObject) {
        try {
            SharedPreferences sharedPreferences = this.pvs;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
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
                                edit.putFloat(next, Double.valueOf(((Double) obj).doubleValue()).floatValue());
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

    public void pvs(String str, long j) {
        try {
            SharedPreferences sharedPreferences = this.pvs;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j);
                edit.apply();
            }
        } catch (Throwable th) {
            Log.e("SPUnit", th.getMessage());
        }
    }

    public int pvs(String str, int i) {
        try {
            SharedPreferences sharedPreferences = this.pvs;
            if (sharedPreferences != null && sharedPreferences.contains(str)) {
                return this.pvs.getInt(str, i);
            }
            return i;
        } catch (Throwable th) {
            Log.i("SPUnit", this.icD + th.getMessage());
            return i;
        }
    }

    public long icD(String str, long j) {
        try {
            SharedPreferences sharedPreferences = this.pvs;
            if (sharedPreferences != null && sharedPreferences.contains(str)) {
                return this.pvs.getLong(str, j);
            }
            return j;
        } catch (Throwable th) {
            Log.i("SPUnit", this.icD + th.getMessage());
            return j;
        }
    }

    public void pvs() {
        SharedPreferences sharedPreferences = this.pvs;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.commit();
        }
    }
}
