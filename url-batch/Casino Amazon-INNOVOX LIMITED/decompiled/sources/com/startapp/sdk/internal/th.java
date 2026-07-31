package com.startapp.sdk.internal;

import com.startapp.json.JsonParser;
import com.startapp.json.TypeParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class th<T> implements TypeParser<List<T>> {
    private static final String LOG_TAG = "th";
    private final Class<T> itemClass;

    public th(Class cls) {
        this.itemClass = cls;
    }

    @Override // com.startapp.json.TypeParser
    public List<T> parse(Class<List<T>> cls, Object obj) {
        int length;
        a7 shVar;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            length = jSONArray.length();
            shVar = new rh(jSONArray);
        } else {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            length = jSONObject.length();
            shVar = new sh(jSONObject);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(JsonParser.fromJsonObject((JSONObject) shVar.a(Integer.valueOf(i)), this.itemClass));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
