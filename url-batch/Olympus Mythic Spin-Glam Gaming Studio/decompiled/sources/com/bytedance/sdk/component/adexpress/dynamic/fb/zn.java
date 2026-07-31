package com.bytedance.sdk.component.adexpress.dynamic.fb;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class zn {
    private JSONObject fs;
    private HashMap<String, Object> zmn = new HashMap<>();

    public zn(JSONObject jSONObject) {
        this.fs = jSONObject;
    }

    public Object zmn(String str) {
        if (this.zmn.containsKey(str)) {
            return this.zmn.get(str);
        }
        return null;
    }

    public boolean fs(String str) {
        return this.zmn.containsKey(str);
    }

    public void zmn() {
        Iterator<String> keys = this.fs.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = this.fs.opt(next);
            int i = 0;
            if (TextUtils.equals("image", next)) {
                if (opt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (i < jSONArray.length()) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                Iterator<String> keys2 = optJSONObject.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    Object opt2 = optJSONObject.opt(next2);
                                    this.zmn.put(next + "." + i + "." + next2, opt2);
                                }
                            }
                            i++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (opt instanceof String) {
                    try {
                        JSONObject jsonObjectInit = PangleNetworkBridge.jsonObjectInit((String) opt);
                        Iterator<String> keys3 = jsonObjectInit.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            Object opt3 = jsonObjectInit.opt(next3);
                            if ((opt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i2 = 0; i2 < ((JSONArray) opt3).length(); i2++) {
                                    this.zmn.put(next + "." + next3 + "." + i2, ((JSONArray) opt3).opt(i2));
                                }
                            } else if ((opt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> keys4 = ((JSONObject) opt3).keys();
                                while (keys4.hasNext()) {
                                    String next4 = keys4.next();
                                    Object opt4 = ((JSONObject) opt3).opt(next4);
                                    this.zmn.put(next + "." + next3 + "." + next4, opt4);
                                }
                            } else if ((opt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                zmn(next, next3, opt3);
                            } else {
                                this.zmn.put(next + "." + next3, opt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(opt instanceof JSONObject)) {
                this.zmn.put(next, opt);
                if (opt instanceof String) {
                    this.zmn.put(next, opt);
                }
            } else if (opt != null) {
                JSONObject jSONObject = (JSONObject) opt;
                Iterator<String> keys5 = jSONObject.keys();
                while (keys5.hasNext()) {
                    String next5 = keys5.next();
                    Object opt5 = jSONObject.opt(next5);
                    this.zmn.put(next + "." + next5, opt5);
                }
            }
        }
    }

    private void zmn(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if ((opt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (i < jSONArray.length()) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        Iterator<String> keys2 = optJSONObject.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            Object opt2 = optJSONObject.opt(next2);
                            this.zmn.put(str + "." + str2 + "." + next + "." + i + "." + next2, opt2);
                        }
                        i++;
                    }
                }
            } else {
                this.zmn.put(str + "." + str2 + "." + next, opt);
            }
        }
    }
}
