package com.mopub.volley.toolbox;

import com.mopub.volley.AuthFailureError;
import com.mopub.volley.Header;
import com.mopub.volley.Request;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.a.c.f;
import org.apache.a.d;
import org.apache.a.r;

/* loaded from: classes2.dex */
class AdaptedHttpStack extends BaseHttpStack {
    private final HttpStack mHttpStack;

    AdaptedHttpStack(HttpStack httpStack) {
        this.mHttpStack = httpStack;
    }

    @Override // com.mopub.volley.toolbox.BaseHttpStack
    public HttpResponse executeRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            r performRequest = this.mHttpStack.performRequest(request, map);
            int b2 = performRequest.a().b();
            d[] allHeaders = performRequest.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (d dVar : allHeaders) {
                arrayList.add(new Header(dVar.c(), dVar.d()));
            }
            if (performRequest.b() == null) {
                return new HttpResponse(b2, arrayList);
            }
            long c2 = performRequest.b().c();
            if (((int) c2) != c2) {
                throw new IOException("Response too large: " + c2);
            }
            return new HttpResponse(b2, arrayList, (int) performRequest.b().c(), performRequest.b().f());
        } catch (f e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
