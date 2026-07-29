package com.facebook;

import android.support.v4.os.EnvironmentCompat;
import android.support.v7.widget.helper.ItemTouchHelper;
import com.facebook.internal.ab;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: GraphResponse.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f6329a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f6330b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONArray f6331c;

    /* renamed from: d, reason: collision with root package name */
    private final FacebookRequestError f6332d;
    private final String e;
    private final GraphRequest f;

    q(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    q(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    q(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    q(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f = graphRequest;
        this.f6329a = httpURLConnection;
        this.e = str;
        this.f6330b = jSONObject;
        this.f6331c = jSONArray;
        this.f6332d = facebookRequestError;
    }

    public final FacebookRequestError a() {
        return this.f6332d;
    }

    public final JSONObject b() {
        return this.f6330b;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.f6329a != null ? this.f6329a.getResponseCode() : ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
            str = String.format(locale, "%d", objArr);
        } catch (IOException unused) {
            str = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.f6330b + ", error: " + this.f6332d + "}";
    }

    static List<q> a(HttpURLConnection httpURLConnection, p pVar) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            if (httpURLConnection.getResponseCode() >= 400) {
                inputStream = httpURLConnection.getErrorStream();
            } else {
                inputStream = httpURLConnection.getInputStream();
            }
            inputStream2 = inputStream;
            return a(inputStream2, httpURLConnection, pVar);
        } catch (j e) {
            com.facebook.internal.t.a(u.REQUESTS, "Response", "Response <Error>: %s", e);
            return a(pVar, httpURLConnection, e);
        } catch (Exception e2) {
            com.facebook.internal.t.a(u.REQUESTS, "Response", "Response <Error>: %s", e2);
            return a(pVar, httpURLConnection, new j(e2));
        } finally {
            ab.a((Closeable) inputStream2);
        }
    }

    static List<q> a(InputStream inputStream, HttpURLConnection httpURLConnection, p pVar) throws j, JSONException, IOException {
        String a2 = ab.a(inputStream);
        com.facebook.internal.t.a(u.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a2.length()), a2);
        return a(a2, httpURLConnection, pVar);
    }

    static List<q> a(String str, HttpURLConnection httpURLConnection, p pVar) throws j, JSONException, IOException {
        List<q> a2 = a(httpURLConnection, pVar, new JSONTokener(str).nextValue());
        com.facebook.internal.t.a(u.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", pVar.b(), Integer.valueOf(str.length()), a2);
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<q> a(HttpURLConnection httpURLConnection, List<GraphRequest> list, Object obj) throws j, JSONException {
        Object obj2;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            GraphRequest graphRequest = list.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", obj);
                jSONObject.put("code", httpURLConnection != null ? httpURLConnection.getResponseCode() : ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj2 = jSONArray;
            } catch (IOException e) {
                arrayList.add(new q(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e)));
            } catch (JSONException e2) {
                arrayList.add(new q(graphRequest, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
            }
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                if (jSONArray2.length() == size) {
                    for (int i = 0; i < jSONArray2.length(); i++) {
                        GraphRequest graphRequest2 = list.get(i);
                        try {
                            arrayList.add(a(graphRequest2, httpURLConnection, jSONArray2.get(i), obj));
                        } catch (j e3) {
                            arrayList.add(new q(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                        } catch (JSONException e4) {
                            arrayList.add(new q(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e4)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new j("Unexpected number of results");
        }
        obj2 = obj;
        if (obj2 instanceof JSONArray) {
        }
        throw new j("Unexpected number of results");
    }

    private static q a(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError checkResponseAndCreateError = FacebookRequestError.checkResponseAndCreateError(jSONObject, obj2, httpURLConnection);
            if (checkResponseAndCreateError != null) {
                if (checkResponseAndCreateError.getErrorCode() == 190 && ab.a(graphRequest.f())) {
                    AccessToken.setCurrentAccessToken(null);
                }
                return new q(graphRequest, httpURLConnection, checkResponseAndCreateError);
            }
            Object a2 = ab.a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (a2 instanceof JSONObject) {
                return new q(graphRequest, httpURLConnection, a2.toString(), (JSONObject) a2);
            }
            if (a2 instanceof JSONArray) {
                return new q(graphRequest, httpURLConnection, a2.toString(), (JSONArray) a2);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new q(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        throw new j("Got unexpected object type in response, class: " + obj.getClass().getSimpleName());
    }

    static List<q> a(List<GraphRequest> list, HttpURLConnection httpURLConnection, j jVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new q(list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, jVar)));
        }
        return arrayList;
    }
}
