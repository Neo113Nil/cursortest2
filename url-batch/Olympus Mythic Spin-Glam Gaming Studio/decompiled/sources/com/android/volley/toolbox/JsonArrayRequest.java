package com.android.volley.toolbox;

import androidx.annotation.Nullable;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Response;
import com.ironsource.B5;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes14.dex */
public class JsonArrayRequest extends JsonRequest<JSONArray> {
    public JsonArrayRequest(String str, Response.Listener<JSONArray> listener, @Nullable Response.ErrorListener errorListener) {
        super(0, str, null, listener, errorListener);
    }

    public JsonArrayRequest(int i, String str, @Nullable JSONArray jSONArray, Response.Listener<JSONArray> listener, @Nullable Response.ErrorListener errorListener) {
        super(i, str, jSONArray != null ? jSONArray.toString() : null, listener, errorListener);
    }

    @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
    protected Response<JSONArray> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(new JSONArray(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, B5.O))), HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        } catch (JSONException e2) {
            return Response.error(new ParseError(e2));
        }
    }
}
