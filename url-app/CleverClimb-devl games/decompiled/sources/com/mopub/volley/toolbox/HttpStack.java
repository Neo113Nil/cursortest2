package com.mopub.volley.toolbox;

import com.mopub.volley.AuthFailureError;
import com.mopub.volley.Request;
import java.io.IOException;
import java.util.Map;
import org.apache.a.r;

@Deprecated
/* loaded from: classes2.dex */
public interface HttpStack {
    r performRequest(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError;
}
