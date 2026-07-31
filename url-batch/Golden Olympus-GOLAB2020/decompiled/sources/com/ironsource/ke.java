package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.ge;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ke {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16934a = "adunit_data";

    public void a(Context context) {
        he.b().c(context);
    }

    public void a(@NotNull String str, @NotNull ge.a aVar) {
        JSONObject optJSONObject;
        try {
            String name = aVar.name();
            he b4 = he.b();
            JSONObject optJSONObject2 = b4.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f16934a);
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(name)) == null || optJSONObject.remove(str) == null) {
                return;
            }
            b4.b(f16934a, optJSONObject2.put(name, optJSONObject));
        } catch (JSONException e4) {
            o9.d().a(e4);
        }
    }

    public void a(String str, Object obj) {
        he.b().b(str, obj);
    }

    public void a(@NotNull String str, @NotNull Object obj, @NotNull ge.a aVar) {
        JSONObject put;
        try {
            String name = aVar.name();
            he b4 = he.b();
            JSONObject optJSONObject = b4.b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f16934a);
            if (optJSONObject == null) {
                put = new JSONObject().put(name, new JSONObject().put(str, obj));
            } else {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(name);
                put = optJSONObject2 == null ? optJSONObject.put(name, new JSONObject().put(str, obj)) : optJSONObject.put(name, optJSONObject2.put(str, obj));
            }
            b4.b(f16934a, put);
        } catch (JSONException e4) {
            o9.d().a(e4);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        he.b().a(str, jSONObject);
    }

    public void a(Map<String, Object> map) {
        he.b().a(map);
    }
}
