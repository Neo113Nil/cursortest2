package retrofit2;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.TrailersSource;

/* loaded from: classes3.dex */
public final class Response<T> {
    public final Object body;
    public final ResponseBody errorBody;
    public final okhttp3.Response rawResponse;

    public Response(okhttp3.Response response, Object obj, ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1) {
        this.rawResponse = response;
        this.body = obj;
        this.errorBody = responseBody$Companion$asResponseBody$1;
    }

    public static Response error(ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1, okhttp3.Response response) {
        if (!response.isSuccessful) {
            return new Response(response, null, responseBody$Companion$asResponseBody$1);
        }
        a$$ExternalSyntheticBUOutline0.m$3("rawResponse should not be successful response");
        return null;
    }

    public static Response success(Object obj) {
        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
        ArrayList arrayList = new ArrayList(20);
        Protocol protocol = Protocol.HTTP_1_1;
        Request.Builder builder = new Request.Builder();
        builder.url("http://localhost/");
        return success(obj, new okhttp3.Response(new Request(builder), protocol, "OK", 200, null, new Headers((String[]) arrayList.toArray(new String[0])), responseBody$Companion$asResponseBody$1, null, null, null, null, 0L, 0L, null, TrailersSource.EMPTY));
    }

    public final String toString() {
        return this.rawResponse.toString();
    }

    public static Response error(ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1) {
        throw new IllegalArgumentException("code < 400: 0");
    }

    public static Response success(Object obj, okhttp3.Response response) {
        if (response.isSuccessful) {
            return new Response(response, obj, null);
        }
        a$$ExternalSyntheticBUOutline0.m$3("rawResponse must be successful response");
        return null;
    }
}
