package io.appmetrica.analytics.networktasks.internal;

import E.AbstractC0005f;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DefaultResponseParser {

    public static class Response {
        public final String mStatus;

        public Response(String str) {
            this.mStatus = str;
        }

        public String toString() {
            return AbstractC0005f.q(new StringBuilder("Response{mStatus='"), this.mStatus, "'}");
        }
    }

    public Response parse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length > 0) {
                return new Response(new JSONObject(new String(bArr, CharEncoding.UTF_8)).optString("status"));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
