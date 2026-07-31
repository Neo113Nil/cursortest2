package com.iab.omid.library.startio.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j {
    private static Map a(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    private static void a(Map map) {
        try {
            com.iab.omid.library.startio.attestation.e.a(g.b().a().getApplicationContext(), (String) map.get("mechanism"), new com.iab.omid.library.startio.attestation.a(map));
        } catch (Exception e) {
            com.iab.omid.library.startio.utils.d.a("Error processing attestation request in OmidNativeUrlHandler", e);
        }
    }

    public static void b(Uri uri) {
        StringBuilder append;
        try {
            String queryParameter = uri.getQueryParameter("method");
            if (TextUtils.isEmpty(queryParameter)) {
                append = new StringBuilder("OmidNativeUrlHandler failed to handle url [").append(uri.toString()).append("] as 'method' not available");
            } else {
                if (queryParameter.hashCode() == -1407254715 && queryParameter.equals("attest")) {
                    a(a(uri));
                    return;
                }
                append = new StringBuilder("Unknown method in OmidNativeUrlHandler.handle :").append(queryParameter);
            }
            com.iab.omid.library.startio.utils.d.b(append.toString());
        } catch (Exception e) {
            com.iab.omid.library.startio.utils.d.a("OmidNativeUrlHandler failed to handle url [" + uri.toString() + "]", e);
        }
    }
}
