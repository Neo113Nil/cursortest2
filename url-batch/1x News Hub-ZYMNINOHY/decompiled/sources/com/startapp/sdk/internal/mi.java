package com.startapp.sdk.internal;

import com.startapp.json.JsonParser;
import com.startapp.json.TypeParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class mi<T> implements TypeParser<List<T>> {
    private static final String LOG_TAG = "mi";
    private final Class<T> itemClass;

    public mi(Class cls) {
        this.itemClass = cls;
    }

    @Override // com.startapp.json.TypeParser
    public List<T> parse(Class<List<T>> cls, Object obj) {
        int length;
        g7 liVar;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            length = jSONArray.length();
            liVar = new ki(jSONArray);
        } else {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            length = jSONObject.length();
            liVar = new li(jSONObject);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            try {
                arrayList.add(JsonParser.fromJsonObject((JSONObject) liVar.a(Integer.valueOf(i3)), this.itemClass));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
