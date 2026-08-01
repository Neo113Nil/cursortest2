package com.bytedance.sdk.component.pvs;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DataConverterActual.java */
/* loaded from: classes.dex */
class so {
    private kj pvs;

    static so pvs(kj kjVar) {
        return new so(kjVar);
    }

    private so(kj kjVar) {
        this.pvs = kjVar;
    }

    <T> T pvs(String str, Type type) throws JSONException {
        pvs(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) new JSONObject(str);
        }
        return (T) this.pvs.pvs(str, type);
    }

    <T> String pvs(T t) {
        String obj;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            obj = t.toString();
        } else {
            obj = this.pvs.pvs(t);
        }
        pvs(obj);
        return obj;
    }

    private static void pvs(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        Mxy.pvs(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(String.valueOf(str))));
    }
}
