package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a0 {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x a(Context context) {
        JSONObject jSONObject;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ar_ability_classification", 0);
        String string = sharedPreferences.getString("s", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            if (jSONObject != null) {
                return null;
            }
            x xVar = new x();
            xVar.f3653a = sharedPreferences.getString("v", "");
            xVar.f3654b = jSONObject;
            return xVar;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
    }

    public static void a(Context context, x xVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("ar_ability_classification", 0).edit();
        edit.putString("v", xVar.f3653a);
        edit.putString("s", xVar.f3654b.toString());
        edit.putInt("sv", o.a());
        edit.apply();
    }
}
