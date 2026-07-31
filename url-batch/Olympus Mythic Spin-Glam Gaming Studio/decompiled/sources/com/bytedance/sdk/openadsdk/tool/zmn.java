package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class zmn {
    public static String zmn(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject zmn = zmn(it.next());
            if (zmn != null) {
                jSONArray.put(zmn);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> zmn(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                FilterWord zmn = zmn(jSONArray.optJSONObject(i));
                if (zmn != null && zmn.isValid()) {
                    arrayList.add(zmn);
                }
            }
        } catch (JSONException e) {
            iqz.zn("MaterialMetaTools", e.getMessage());
        }
        return arrayList;
    }

    private static FilterWord zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord zmn = zmn(optJSONArray.optJSONObject(i));
                    if (zmn != null && zmn.isValid()) {
                        filterWord.addOption(zmn);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject zmn(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(zmn(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
