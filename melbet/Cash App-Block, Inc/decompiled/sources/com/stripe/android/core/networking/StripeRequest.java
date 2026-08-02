package com.stripe.android.core.networking;

import java.io.OutputStream;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class StripeRequest {

    public enum Method {
        GET("GET"),
        POST("POST"),
        DELETE("DELETE");

        public final String code;

        Method(String str) {
            this.code = str;
        }
    }

    public enum MimeType {
        Form("application/x-www-form-urlencoded"),
        /* JADX INFO: Fake field, exist only in values array */
        MultipartForm("multipart/form-data"),
        /* JADX INFO: Fake field, exist only in values array */
        Json("application/json");

        public final String code;

        MimeType(String str) {
            this.code = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.code;
        }
    }

    public abstract Map getHeaders();

    public abstract Method getMethod();

    public Map getPostHeaders() {
        return null;
    }

    public abstract Iterable getRetryResponseCodes();

    public boolean getShouldCache() {
        return false;
    }

    public abstract String getUrl();

    public void writePostBody(OutputStream outputStream) {
    }
}
