package com.arthenica.ffmpegkit;

import android.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {
    public static final String KEY_CHAPTERS = "chapters";
    public static final String KEY_STREAMS = "streams";

    public static n from(String str) {
        try {
            return fromWithError(str);
        } catch (JSONException e8) {
            Log.e("ffmpeg-kit", String.format("MediaInformation parsing failed.%s", com.arthenica.smartexception.java.a.getStackTraceString(e8)));
            return null;
        }
    }

    public static n fromWithError(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_STREAMS);
        JSONArray optJSONArray2 = jSONObject.optJSONArray(KEY_CHAPTERS);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; optJSONArray != null && i8 < optJSONArray.length(); i8++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                arrayList.add(new x(optJSONObject));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; optJSONArray2 != null && i9 < optJSONArray2.length(); i9++) {
            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i9);
            if (optJSONObject2 != null) {
                arrayList2.add(new f(optJSONObject2));
            }
        }
        return new n(jSONObject, arrayList, arrayList2);
    }
}
