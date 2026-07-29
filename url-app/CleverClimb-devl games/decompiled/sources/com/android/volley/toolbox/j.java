package com.android.volley.toolbox;

import com.android.volley.n;
import com.facebook.ads.AudienceNetworkActivity;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonObjectRequest.java */
/* loaded from: classes.dex */
public class j extends k<JSONObject> {
    public j(int i, String str, JSONObject jSONObject, n.b<JSONObject> bVar, n.a aVar) {
        super(i, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    @Override // com.android.volley.toolbox.k, com.android.volley.l
    protected com.android.volley.n<JSONObject> a(com.android.volley.i iVar) {
        try {
            return com.android.volley.n.a(new JSONObject(new String(iVar.f2285b, e.a(iVar.f2286c, AudienceNetworkActivity.WEBVIEW_ENCODING))), e.a(iVar));
        } catch (UnsupportedEncodingException e) {
            return com.android.volley.n.a(new com.android.volley.k(e));
        } catch (JSONException e2) {
            return com.android.volley.n.a(new com.android.volley.k(e2));
        }
    }
}
