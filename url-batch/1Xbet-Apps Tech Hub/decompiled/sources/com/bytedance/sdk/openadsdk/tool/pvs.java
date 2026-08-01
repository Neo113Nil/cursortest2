package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MaterialMetaTools.java */
/* loaded from: classes2.dex */
public class pvs {
    public static String pvs(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject pvs = pvs(it.next());
            if (pvs != null) {
                jSONArray.put(pvs);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> pvs(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                FilterWord pvs = pvs(jSONArray.optJSONObject(i));
                if (pvs != null && pvs.isValid()) {
                    arrayList.add(pvs);
                }
            }
        } catch (JSONException e) {
            Ju.pvs("MaterialMetaTools", e.getMessage());
        }
        return arrayList;
    }

    private static FilterWord pvs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString(FacebookMediationAdapter.KEY_ID));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord pvs = pvs(optJSONArray.optJSONObject(i));
                    if (pvs != null && pvs.isValid()) {
                        filterWord.addOption(pvs);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject pvs(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookMediationAdapter.KEY_ID, filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(pvs(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
