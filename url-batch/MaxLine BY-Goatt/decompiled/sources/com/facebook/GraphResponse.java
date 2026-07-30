package com.facebook;

import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import defpackage.ey;
import defpackage.rv;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GraphResponse {
    private static final String BODY_KEY = "body";
    private static final String CODE_KEY = "code";
    public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
    private static final String RESPONSE_LOG_TAG = "Response";
    public static final String SUCCESS_KEY = "success";
    private final HttpURLConnection connection;
    private final FacebookRequestError error;
    private final JSONObject graphObject;
    private final JSONArray graphObjectArray;
    private final JSONArray jsonArray;
    private final JSONObject jsonObject;
    private final String rawResponse;
    private final GraphRequest request;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = GraphResponse.class.getCanonicalName();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public enum PagingDirection {
        NEXT,
        PREVIOUS
    }

    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        graphRequest.getClass();
        this.request = graphRequest;
        this.connection = httpURLConnection;
        this.rawResponse = str;
        this.graphObject = jSONObject;
        this.graphObjectArray = jSONArray;
        this.error = facebookRequestError;
        this.jsonObject = jSONObject;
        this.jsonArray = jSONArray;
    }

    public static final List<GraphResponse> constructErrorResponses(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        return Companion.constructErrorResponses(list, httpURLConnection, facebookException);
    }

    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    public final FacebookRequestError getError() {
        return this.error;
    }

    public final JSONArray getJSONArray() {
        return this.graphObjectArray;
    }

    public final JSONObject getJSONObject() {
        return this.graphObject;
    }

    public final JSONArray getJsonArray() {
        return this.jsonArray;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getRawResponse() {
        return this.rawResponse;
    }

    public final GraphRequest getRequest() {
        return this.request;
    }

    public final GraphRequest getRequestForPagedResults(PagingDirection pagingDirection) {
        JSONObject optJSONObject;
        pagingDirection.getClass();
        JSONObject jSONObject = this.graphObject;
        String optString = (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("paging")) == null) ? null : pagingDirection == PagingDirection.NEXT ? optJSONObject.optString("next") : optJSONObject.optString("previous");
        if (Utility.isNullOrEmpty(optString)) {
            return null;
        }
        if (optString != null && optString.equals(this.request.getUrlForSingleRequest())) {
            return null;
        }
        try {
            return new GraphRequest(this.request.getAccessToken(), new URL(optString));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.connection;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.graphObject + ", error: " + this.error + "}";
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final GraphResponse createResponseFromObject(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                FacebookRequestError checkResponseAndCreateError = FacebookRequestError.Companion.checkResponseAndCreateError(jSONObject, obj2, httpURLConnection);
                if (checkResponseAndCreateError != null) {
                    Log.e(GraphResponse.TAG, checkResponseAndCreateError.toString());
                    if (checkResponseAndCreateError.getErrorCode() == 190 && Utility.isCurrentAccessToken(graphRequest.getAccessToken())) {
                        if (checkResponseAndCreateError.getSubErrorCode() != 493) {
                            AccessToken.Companion.setCurrentAccessToken(null);
                        } else {
                            AccessToken.Companion companion = AccessToken.Companion;
                            AccessToken currentAccessToken = companion.getCurrentAccessToken();
                            if (currentAccessToken != null && !currentAccessToken.isExpired()) {
                                companion.expireCurrentAccessToken();
                            }
                        }
                    }
                    return new GraphResponse(graphRequest, httpURLConnection, checkResponseAndCreateError);
                }
                Object stringPropertyAsJSON = Utility.getStringPropertyAsJSON(jSONObject, "body", GraphResponse.NON_JSON_RESPONSE_PROPERTY);
                if (stringPropertyAsJSON instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) stringPropertyAsJSON;
                    return new GraphResponse(graphRequest, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (stringPropertyAsJSON instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) stringPropertyAsJSON;
                    return new GraphResponse(graphRequest, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                obj = JSONObject.NULL;
                obj.getClass();
            }
            if (obj == JSONObject.NULL) {
                return new GraphResponse(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: ".concat(obj.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final List<GraphResponse> createResponsesFromObject(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) {
            Object obj2;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = list.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", obj);
                    jSONObject.put(GraphResponse.CODE_KEY, httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj2 = jSONArray;
                } catch (IOException e) {
                    arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e)));
                } catch (JSONException e2) {
                    arrayList.add(new GraphResponse(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
                }
                if (obj2 instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj2;
                    if (jSONArray2.length() == size) {
                        int length = jSONArray2.length();
                        for (int i = 0; i < length; i++) {
                            GraphRequest graphRequest2 = list.get(i);
                            try {
                                Object obj3 = ((JSONArray) obj2).get(i);
                                obj3.getClass();
                                arrayList.add(createResponseFromObject(graphRequest2, httpURLConnection, obj3, obj));
                            } catch (FacebookException e3) {
                                arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                            } catch (JSONException e4) {
                                arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e4)));
                            }
                        }
                        return arrayList;
                    }
                }
                ey.i("Unexpected number of results");
                return null;
            }
            obj2 = obj;
            if (obj2 instanceof JSONArray) {
            }
            ey.i("Unexpected number of results");
            return null;
        }

        public final List<GraphResponse> constructErrorResponses(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            list.getClass();
            ArrayList arrayList = new ArrayList(rv.l(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new GraphResponse((GraphRequest) it.next(), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
            }
            return arrayList;
        }

        public final List<GraphResponse> createResponsesFromStream$facebook_core_release(InputStream inputStream, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            graphRequestBatch.getClass();
            String readStreamToString = Utility.readStreamToString(inputStream);
            Logger.Companion.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, GraphResponse.RESPONSE_LOG_TAG, "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(readStreamToString.length()), readStreamToString);
            return createResponsesFromString$facebook_core_release(readStreamToString, httpURLConnection, graphRequestBatch);
        }

        public final List<GraphResponse> createResponsesFromString$facebook_core_release(String str, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            str.getClass();
            graphRequestBatch.getClass();
            Object nextValue = new JSONTokener(str).nextValue();
            nextValue.getClass();
            List<GraphResponse> createResponsesFromObject = createResponsesFromObject(httpURLConnection, graphRequestBatch, nextValue);
            Logger.Companion.log(LoggingBehavior.REQUESTS, GraphResponse.RESPONSE_LOG_TAG, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", graphRequestBatch.getId(), Integer.valueOf(str.length()), createResponsesFromObject);
            return createResponsesFromObject;
        }

        public final List<GraphResponse> fromHttpConnection$facebook_core_release(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            List<GraphResponse> constructErrorResponses;
            httpURLConnection.getClass();
            graphRequestBatch.getClass();
            try {
                try {
                    if (!FacebookSdk.isFullyInitialized()) {
                        Log.e(GraphResponse.TAG, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    InputStream errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    List<GraphResponse> createResponsesFromStream$facebook_core_release = createResponsesFromStream$facebook_core_release(errorStream, httpURLConnection, graphRequestBatch);
                    Utility.closeQuietly(errorStream);
                    return createResponsesFromStream$facebook_core_release;
                } catch (FacebookException e) {
                    Logger.Companion.log(LoggingBehavior.REQUESTS, GraphResponse.RESPONSE_LOG_TAG, "Response <Error>: %s", e);
                    constructErrorResponses = constructErrorResponses(graphRequestBatch, httpURLConnection, e);
                    Utility.closeQuietly(null);
                    return constructErrorResponses;
                } catch (Exception e2) {
                    Logger.Companion.log(LoggingBehavior.REQUESTS, GraphResponse.RESPONSE_LOG_TAG, "Response <Error>: %s", e2);
                    constructErrorResponses = constructErrorResponses(graphRequestBatch, httpURLConnection, new FacebookException(e2));
                    Utility.closeQuietly(null);
                    return constructErrorResponses;
                }
            } catch (Throwable th) {
                Utility.closeQuietly(null);
                throw th;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
        graphRequest.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
        graphRequest.getClass();
        str.getClass();
        jSONArray.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
        graphRequest.getClass();
        facebookRequestError.getClass();
    }
}
