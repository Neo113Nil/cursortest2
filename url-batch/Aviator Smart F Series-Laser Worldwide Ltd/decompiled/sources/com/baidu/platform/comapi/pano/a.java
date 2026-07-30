package com.baidu.platform.comapi.pano;

import android.net.Uri;
import android.text.TextUtils;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.http.AsyncHttpClient;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    AsyncHttpClient f9801a = new AsyncHttpClient();

    /* renamed from: com.baidu.platform.comapi.pano.a$a, reason: collision with other inner class name */
    class C0118a extends HttpClient.ProtoResultCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f9802a;

        C0118a(b bVar) {
            this.f9802a = bVar;
        }

        @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
        public void onFailed(HttpClient.HttpStateError httpStateError) {
            this.f9802a.a(httpStateError);
        }

        @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
        public void onSuccess(String str) {
            this.f9802a.onSuccess(a.this.a(str));
        }
    }

    public interface b<T> {
        void a(HttpClient.HttpStateError httpStateError);

        void onSuccess(T t7);
    }

    public void a(String str, b<com.baidu.platform.comapi.pano.b> bVar) {
        Uri.Builder builder = new Uri.Builder();
        if (HttpClient.isHttpsEnable) {
            builder.scheme("https");
        } else {
            builder.scheme("http");
        }
        builder.encodedAuthority("api.map.baidu.com");
        builder.path("/sdkproxy/lbs_androidsdk/pano/v1/");
        a(builder, "qt", "poi");
        a(builder, "uid", str);
        a(builder, "action", "0");
        String authToken = HttpClient.getAuthToken();
        if (authToken == null) {
            bVar.onSuccess(new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NO_TOKEN));
            return;
        }
        a(builder, BaseParamNames.TOKEN, authToken);
        this.f9801a.get(a(builder), new C0118a(bVar));
    }

    private void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private String a(Uri.Builder builder) {
        Uri.Builder buildUpon = Uri.parse(builder.build().toString() + HttpClient.getPhoneInfo()).buildUpon();
        buildUpon.appendQueryParameter(HttpConstants.SIGN, AppMD5.getSignMD5String(buildUpon.build().getEncodedQuery()));
        return buildUpon.build().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.baidu.platform.comapi.pano.b a(String str) {
        if (str != null && !str.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject == null) {
                    return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NOT_FOUND);
                }
                if (optJSONObject.optInt("error") == 0) {
                    JSONArray optJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.CONTENT);
                    if (optJSONArray == null) {
                        return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NOT_FOUND);
                    }
                    com.baidu.platform.comapi.pano.b bVar = null;
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i8).optJSONObject("poiinfo");
                        if (optJSONObject2 != null) {
                            bVar = new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NO_ERROR);
                            bVar.a(optJSONObject2.optString("PID"));
                            bVar.a(optJSONObject2.optInt("hasstreet"));
                        }
                    }
                    return bVar;
                }
                return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_UID_ERROR);
            } catch (JSONException e8) {
                e8.printStackTrace();
                return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NOT_FOUND);
            }
        }
        return new com.baidu.platform.comapi.pano.b(PanoStateError.PANO_NOT_FOUND);
    }
}
