package com.mopub.network;

import android.content.Context;
import com.mopub.common.Preconditions;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Request;
import com.mopub.volley.Response;
import com.mopub.volley.toolbox.HttpHeaderParser;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class MoPubRequest<T> extends Request<T> {
    private static final String JSON_CONTENT_TYPE = "application/json; charset=UTF-8";
    private final Context mContext;
    private final String mOriginalUrl;

    public MoPubRequest(Context context, String str, Response.ErrorListener errorListener) {
        super(MoPubRequestUtils.chooseMethod(str), MoPubRequestUtils.truncateQueryParamsIfPost(str), errorListener);
        this.mOriginalUrl = str;
        this.mContext = context.getApplicationContext();
    }

    @Override // com.mopub.volley.Request
    protected Map<String, String> getParams() {
        if (MoPubRequestUtils.isMoPubRequest(getUrl())) {
            return MoPubRequestUtils.convertQueryToMap(this.mContext, this.mOriginalUrl);
        }
        return null;
    }

    @Override // com.mopub.volley.Request
    public String getBodyContentType() {
        return MoPubRequestUtils.isMoPubRequest(getUrl()) ? JSON_CONTENT_TYPE : super.getBodyContentType();
    }

    @Override // com.mopub.volley.Request
    public byte[] getBody() {
        String generateBodyFromParams = MoPubRequestUtils.generateBodyFromParams(getParams(), getUrl());
        if (generateBodyFromParams == null) {
            return null;
        }
        return generateBodyFromParams.getBytes();
    }

    protected String parseStringBody(NetworkResponse networkResponse) {
        Preconditions.checkNotNull(networkResponse);
        try {
            return new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers));
        } catch (UnsupportedEncodingException unused) {
            return new String(networkResponse.data);
        }
    }
}
