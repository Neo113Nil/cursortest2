package com.mopub.volley.toolbox;

import com.mopub.volley.AuthFailureError;
import com.mopub.volley.Request;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.a.b.b.b;
import org.apache.a.b.b.e;
import org.apache.a.b.b.f;
import org.apache.a.b.b.h;
import org.apache.a.b.b.j;
import org.apache.a.b.b.k;
import org.apache.a.b.g;
import org.apache.a.h.l;
import org.apache.a.i.c;
import org.apache.a.i.d;
import org.apache.a.r;
import org.apache.a.w;

@Deprecated
/* loaded from: classes2.dex */
public class HttpClientStack implements HttpStack {
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    protected final g mClient;

    protected void onPrepareRequest(k kVar) throws IOException {
    }

    public HttpClientStack(g gVar) {
        this.mClient = gVar;
    }

    private static void addHeaders(k kVar, Map<String, String> map) {
        for (String str : map.keySet()) {
            kVar.setHeader(str, map.get(str));
        }
    }

    private static List<w> getPostParameterPairs(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            arrayList.add(new l(str, map.get(str)));
        }
        return arrayList;
    }

    @Override // com.mopub.volley.toolbox.HttpStack
    public r performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        k createHttpRequest = createHttpRequest(request, map);
        addHeaders(createHttpRequest, map);
        addHeaders(createHttpRequest, request.getHeaders());
        onPrepareRequest(createHttpRequest);
        d params = createHttpRequest.getParams();
        int timeoutMs = request.getTimeoutMs();
        c.c(params, 5000);
        c.a(params, timeoutMs);
        return this.mClient.execute(createHttpRequest);
    }

    static k createHttpRequest(Request<?> request, Map<String, String> map) throws AuthFailureError {
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    org.apache.a.b.b.g gVar = new org.apache.a.b.b.g(request.getUrl());
                    gVar.addHeader("Content-Type", request.getPostBodyContentType());
                    gVar.setEntity(new org.apache.a.e.d(postBody));
                    return gVar;
                }
                return new org.apache.a.b.b.d(request.getUrl());
            case 0:
                return new org.apache.a.b.b.d(request.getUrl());
            case 1:
                org.apache.a.b.b.g gVar2 = new org.apache.a.b.b.g(request.getUrl());
                gVar2.addHeader("Content-Type", request.getBodyContentType());
                setEntityIfNonEmptyBody(gVar2, request);
                return gVar2;
            case 2:
                h hVar = new h(request.getUrl());
                hVar.addHeader("Content-Type", request.getBodyContentType());
                setEntityIfNonEmptyBody(hVar, request);
                return hVar;
            case 3:
                return new b(request.getUrl());
            case 4:
                return new e(request.getUrl());
            case 5:
                return new f(request.getUrl());
            case 6:
                return new j(request.getUrl());
            case 7:
                HttpPatch httpPatch = new HttpPatch(request.getUrl());
                httpPatch.addHeader("Content-Type", request.getBodyContentType());
                setEntityIfNonEmptyBody(httpPatch, request);
                return httpPatch;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static void setEntityIfNonEmptyBody(org.apache.a.b.b.c cVar, Request<?> request) throws AuthFailureError {
        byte[] body = request.getBody();
        if (body != null) {
            cVar.setEntity(new org.apache.a.e.d(body));
        }
    }

    public static final class HttpPatch extends org.apache.a.b.b.c {
        public static final String METHOD_NAME = "PATCH";

        @Override // org.apache.a.b.b.i, org.apache.a.b.b.k
        public String getMethod() {
            return METHOD_NAME;
        }

        public HttpPatch() {
        }

        public HttpPatch(URI uri) {
            setURI(uri);
        }

        public HttpPatch(String str) {
            setURI(URI.create(str));
        }
    }
}
