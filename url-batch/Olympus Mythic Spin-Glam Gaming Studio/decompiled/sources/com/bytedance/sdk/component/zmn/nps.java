package com.bytedance.sdk.component.zmn;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class nps {
    private iv zmn;

    static nps zmn(iv ivVar) {
        return new nps(ivVar);
    }

    private nps(iv ivVar) {
        this.zmn = ivVar;
    }

    <T> T zmn(String str, Type type) throws JSONException {
        zmn(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) PangleNetworkBridge.jsonObjectInit(str);
        }
        return (T) this.zmn.zmn(str, type);
    }

    <T> String zmn(T t) {
        String obj;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            obj = t.toString();
        } else {
            obj = this.zmn.zmn(t);
        }
        zmn(obj);
        return obj;
    }

    private static void zmn(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        zg.zmn(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
