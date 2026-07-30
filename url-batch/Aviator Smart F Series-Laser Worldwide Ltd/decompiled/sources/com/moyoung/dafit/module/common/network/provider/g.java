package com.moyoung.dafit.module.common.network.provider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class g {
    private SharedPreferences.Editor sharedEditor;
    private SharedPreferences sharedPreferences;

    private static class b {
        private static final g INSTANCE = new g(com.moyoung.dafit.module.common.utils.d.get());

        private b() {
        }
    }

    public static g getInstance() {
        return b.INSTANCE;
    }

    public boolean contains(String str) {
        return this.sharedPreferences.contains(str);
    }

    public boolean getBoolean(String str, boolean z7) {
        return this.sharedPreferences.getBoolean(str, z7);
    }

    public float getFloat(String str, float f8) {
        return this.sharedPreferences.getFloat(str, f8);
    }

    public int getInt(String str, int i8) {
        return this.sharedPreferences.getInt(str, i8);
    }

    public long getLong(String str, long j8) {
        return this.sharedPreferences.getLong(str, j8);
    }

    public LinkedHashMap<String, Object> getMap(String str) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        String string = this.sharedPreferences.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return linkedHashMap;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i8);
                JSONArray names = jSONObject.names();
                if (names != null) {
                    for (int i9 = 0; i9 < names.length(); i9++) {
                        String string2 = names.getString(i9);
                        linkedHashMap.put(string2, jSONObject.get(string2));
                    }
                }
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return linkedHashMap;
    }

    public String getString(String str, String str2) {
        return this.sharedPreferences.getString(str, str2);
    }

    public void putBoolean(String str, boolean z7) {
        this.sharedEditor.putBoolean(str, z7);
        this.sharedEditor.apply();
    }

    public void putFloat(String str, float f8) {
        this.sharedEditor.putFloat(str, f8);
        this.sharedEditor.apply();
    }

    public void putInt(String str, int i8) {
        this.sharedEditor.putInt(str, i8);
        this.sharedEditor.apply();
    }

    public void putLong(String str, long j8) {
        this.sharedEditor.putLong(str, j8);
        this.sharedEditor.apply();
    }

    public void putMap(String str, LinkedHashMap<String, Object> linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : linkedHashMap.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        jSONArray.put(jSONObject);
        this.sharedEditor.putString(str, jSONArray.toString());
        this.sharedEditor.commit();
    }

    public void putString(String str, String str2) {
        this.sharedEditor.putString(str, str2);
        this.sharedEditor.apply();
    }

    public void remove(String str) {
        this.sharedEditor.remove(str);
        this.sharedEditor.apply();
    }

    private g(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("config", 0);
        this.sharedPreferences = sharedPreferences;
        this.sharedEditor = sharedPreferences.edit();
    }
}
