package com.linecorp.linesdk.internal.nwclient;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.internal.JWKSet;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class JWKSetParser extends JsonToObjectBaseResponseParser<JWKSet> {
    JWKSetParser() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.linecorp.linesdk.internal.nwclient.JsonToObjectBaseResponseParser
    @NonNull
    public JWKSet parseJsonToObject(@NonNull JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("keys");
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
            arrayList.add(new JWKSet.JWK.Builder().keyType(jSONObject2.getString("kty")).algorithm(jSONObject2.getString(JwsHeader.ALGORITHM)).use(jSONObject2.getString("use")).keyId(jSONObject2.getString(JwsHeader.KEY_ID)).curve(jSONObject2.getString("crv")).x(jSONObject2.getString("x")).y(jSONObject2.getString("y")).build());
        }
        return new JWKSet.Builder().keys(arrayList).build();
    }
}
