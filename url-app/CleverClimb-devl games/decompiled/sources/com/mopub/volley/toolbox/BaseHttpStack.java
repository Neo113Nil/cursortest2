package com.mopub.volley.toolbox;

import com.mopub.volley.AuthFailureError;
import com.mopub.volley.Header;
import com.mopub.volley.Request;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.a.aa;
import org.apache.a.d;
import org.apache.a.h.b;
import org.apache.a.h.h;
import org.apache.a.h.n;
import org.apache.a.r;

/* loaded from: classes2.dex */
public abstract class BaseHttpStack implements HttpStack {
    public abstract HttpResponse executeRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError;

    @Override // com.mopub.volley.toolbox.HttpStack
    @Deprecated
    public final r performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        HttpResponse executeRequest = executeRequest(request, map);
        h hVar = new h(new n(new aa("HTTP", 1, 1), executeRequest.getStatusCode(), ""));
        ArrayList arrayList = new ArrayList();
        for (Header header : executeRequest.getHeaders()) {
            arrayList.add(new b(header.getName(), header.getValue()));
        }
        hVar.setHeaders((d[]) arrayList.toArray(new d[arrayList.size()]));
        InputStream content = executeRequest.getContent();
        if (content != null) {
            org.apache.a.e.b bVar = new org.apache.a.e.b();
            bVar.a(content);
            bVar.a(executeRequest.getContentLength());
            hVar.a(bVar);
        }
        return hVar;
    }
}
