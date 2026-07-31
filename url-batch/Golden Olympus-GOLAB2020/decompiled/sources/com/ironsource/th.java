package com.ironsource;

import kotlin.Metadata;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class th {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        if (optString.length() == 0) {
            return null;
        }
        return optString;
    }
}
