package com.mopub.network;

import com.mopub.common.util.ResponseHeader;
import com.mopub.volley.AuthFailureError;
import com.mopub.volley.Request;
import com.mopub.volley.toolbox.HttpResponse;
import com.mopub.volley.toolbox.HurlStack;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class RequestQueueHttpStack extends HurlStack {
    private final String mUserAgent;

    public RequestQueueHttpStack(String str) {
        this(str, null);
    }

    public RequestQueueHttpStack(String str, HurlStack.UrlRewriter urlRewriter) {
        this(str, urlRewriter, null);
    }

    public RequestQueueHttpStack(String str, HurlStack.UrlRewriter urlRewriter, SSLSocketFactory sSLSocketFactory) {
        super(urlRewriter, sSLSocketFactory);
        this.mUserAgent = str;
    }

    @Override // com.mopub.volley.toolbox.HurlStack, com.mopub.volley.toolbox.BaseHttpStack
    public HttpResponse executeRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        if (map == null || map.isEmpty()) {
            map = new TreeMap<>();
        }
        map.put(ResponseHeader.USER_AGENT.getKey(), this.mUserAgent);
        return super.executeRequest(request, map);
    }
}
