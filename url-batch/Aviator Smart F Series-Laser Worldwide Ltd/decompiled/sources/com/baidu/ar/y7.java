package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.filter.FilterNode;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3753a = FilterNode.highlightFilter.getNodeName();

    /* renamed from: b, reason: collision with root package name */
    public boolean f3754b;

    public String a() {
        String str = this.f3753a;
        return str == null ? "" : str;
    }

    public boolean b() {
        return this.f3754b;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (new File(str + "/property_list.json").exists()) {
            try {
                JSONArray jSONArray = new JSONObject(j4.a(str + "/property_list.json")).getJSONArray("FilterList");
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i8);
                    if (this.f3753a.equals(jSONObject.getString("FilterName"))) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("defaultUniformList");
                        int i9 = 0;
                        while (true) {
                            if (i9 < jSONArray2.length()) {
                                JSONObject jSONObject2 = jSONArray2.getJSONObject(i9);
                                if ("is_enable".equals(jSONObject2.getString("PropertyName"))) {
                                    boolean z7 = true;
                                    if (jSONObject2.getInt("PropertyValue") != 1) {
                                        z7 = false;
                                    }
                                    this.f3754b = z7;
                                } else {
                                    i9++;
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
    }
}
