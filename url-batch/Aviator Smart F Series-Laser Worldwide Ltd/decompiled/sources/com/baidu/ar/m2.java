package com.baidu.ar;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m2 {
    public static nd a(String str) {
        File file = new File(str, "targets.json");
        if (!file.exists()) {
            return null;
        }
        try {
            return a(new JSONObject(j4.k(file)).optJSONObject("slam_model"));
        } catch (JSONException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static nd a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        nd ndVar = new nd();
        try {
            if (jSONObject.has("id")) {
                ndVar.a(jSONObject.getString("id"));
            }
            if (jSONObject.has("place_type")) {
                ndVar.c(jSONObject.getInt("place_type"));
            }
            if (jSONObject.has("position")) {
                ndVar.b(jSONObject.getString("position"));
            }
            if (jSONObject.has("distance")) {
                ndVar.a(jSONObject.getInt("distance"));
            }
            if (jSONObject.has("pitch_angle")) {
                ndVar.b(jSONObject.getInt("pitch_angle"));
            }
            if (jSONObject.has("rotation")) {
                ndVar.c(jSONObject.getString("rotation"));
            }
            if (jSONObject.has("immediately_place_model")) {
                boolean z7 = true;
                if (jSONObject.getInt("immediately_place_model") != 1) {
                    z7 = false;
                }
                ndVar.a(z7);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return ndVar;
    }
}
