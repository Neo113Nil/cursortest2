package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final String f13391a = "permissions";

    /* renamed from: b, reason: collision with root package name */
    public final String f13392b = "name";

    /* renamed from: c, reason: collision with root package name */
    public final String f13393c = "list";

    /* renamed from: d, reason: collision with root package name */
    public final String f13394d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a parse(JSONObject jSONObject) {
        JSONArray optJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f13391a);
        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(this.f13393c)) != null) {
            int length = optJSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i4);
                if (optJSONObject2 != null && optJSONObject2.optBoolean(this.f13394d)) {
                    String optString = optJSONObject2.optString(this.f13392b);
                    if (!TextUtils.isEmpty(optString)) {
                        hashSet.add(optString);
                    }
                }
            }
        }
        return new a(hashSet);
    }

    public final a b(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
