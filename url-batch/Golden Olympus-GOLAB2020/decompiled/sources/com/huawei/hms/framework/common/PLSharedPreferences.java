package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PLSharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f14146a;

    public PLSharedPreferences(Context context, String str) {
        this.f14146a = a(context, str);
    }

    private SharedPreferences a(Context context, String str) {
        if (context == null) {
            Logger.e("PLSharedPreferences", "context is null, must call init method to set context");
            return null;
        }
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("grs_move2DE_records", 0);
        if (!sharedPreferences.getBoolean(str, false)) {
            if (createDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(str, true);
                edit.apply();
            }
            return context.getSharedPreferences(str, 0);
        }
        context = createDeviceProtectedStorageContext;
        return context.getSharedPreferences(str, 0);
    }

    public void clear() {
        SharedPreferences sharedPreferences = this.f14146a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().apply();
    }

    public SharedPreferences.Editor edit() {
        SharedPreferences sharedPreferences = this.f14146a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.edit();
    }

    public Map<String, ?> getAll() {
        SharedPreferences sharedPreferences = this.f14146a;
        if (sharedPreferences == null) {
            return null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        StringBuilder sb = new StringBuilder();
        sb.append("sp size ");
        sb.append(all == null ? 0 : all.size());
        Logger.i("PLSharedPreferences", sb.toString());
        return all;
    }

    public Map<String, String> getHashMap(String str) {
        HashMap hashMap = new HashMap();
        SharedPreferences sharedPreferences = this.f14146a;
        if (sharedPreferences != null) {
            try {
                JSONArray jSONArray = new JSONArray(sharedPreferences.getString(str, ""));
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    JSONArray names = jSONObject.names();
                    if (names != null) {
                        for (int i5 = 0; i5 < names.length(); i5++) {
                            String string = names.getString(i5);
                            hashMap.put(string, jSONObject.getString(string));
                        }
                    }
                }
            } catch (JSONException e4) {
                Logger.w("PLSharedPreferences", "getHashMap parse Json to map error: %s", StringUtils.anonymizeMessage(e4.getMessage()));
            }
        }
        return hashMap;
    }

    public long getLong(String str, long j4) {
        SharedPreferences sharedPreferences = this.f14146a;
        return sharedPreferences == null ? j4 : sharedPreferences.getLong(str, j4);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public void putHashMap(String str, Map<String, String> map) {
        if (this.f14146a == null || map == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e4) {
                Logger.w("PLSharedPreferences", "putHashMap one object error: %s", StringUtils.anonymizeMessage(e4.getMessage()));
            }
        }
        jSONArray.put(jSONObject);
        this.f14146a.edit().putString(str, jSONArray.toString()).apply();
    }

    public void putLong(String str, long j4) {
        SharedPreferences sharedPreferences = this.f14146a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong(str, j4).apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f14146a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public void remove(String str) {
        SharedPreferences sharedPreferences = this.f14146a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public void removeKeyValue(String str) {
        SharedPreferences sharedPreferences = this.f14146a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(str).apply();
    }

    public String getString(String str, String str2) {
        SharedPreferences sharedPreferences = this.f14146a;
        return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
    }
}
