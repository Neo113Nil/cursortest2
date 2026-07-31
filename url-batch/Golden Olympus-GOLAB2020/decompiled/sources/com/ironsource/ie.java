package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.ge;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ie {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16709a = "adunit_data";

    private JSONObject a(Context context, @NotNull ge.a aVar) {
        String name = aVar.name();
        JSONObject b4 = he.b().b(context);
        JSONObject optJSONObject = b4.optJSONObject(f16709a);
        JSONObject a4 = a(b4);
        if (optJSONObject != null && optJSONObject.optJSONObject(name) != null) {
            JSONObject jSONObject = optJSONObject.getJSONObject(name);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a4.putOpt(next, jSONObject.opt(next));
            }
        }
        return a4;
    }

    private JSONObject a(Context context, List<String> list) {
        return a(a(he.b().b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    public JSONObject a(Context context, String[] strArr) {
        return a(a(he.b().b(context)), strArr);
    }

    public JSONObject a(List<String> list) {
        return a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    public JSONObject a(List<String> list, ge.a aVar) {
        return a(a(ContextProvider.getInstance().getApplicationContext(), aVar), (String[]) list.toArray(new String[list.size()]));
    }

    private JSONObject a(JSONObject jSONObject) {
        jSONObject.remove(f16709a);
        return jSONObject;
    }

    private JSONObject a(JSONObject jSONObject, String[] strArr) {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    public JSONObject a(String[] strArr) {
        return a(a(he.b().b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }
}
