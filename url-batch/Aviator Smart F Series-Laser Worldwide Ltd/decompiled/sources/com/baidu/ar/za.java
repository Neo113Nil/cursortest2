package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.content.ARResourceInfo;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class za extends e0<String, List<IARCaseInfo>> {

    /* renamed from: i, reason: collision with root package name */
    public WeakReference<Context> f3820i;

    /* renamed from: j, reason: collision with root package name */
    public IHttpRequest f3821j;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f3822a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IError f3823b;

        public a(ICallbackWith iCallbackWith, IError iError) {
            this.f3822a = iCallbackWith;
            this.f3823b = iError;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            IError iError = this.f3823b;
            if (iError != null) {
                iError.onError(httpException.getCode(), httpException.getMessage(), httpException);
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            String message;
            int i8;
            IError iError;
            if (iHttpResponse.isSuccess()) {
                try {
                    String content = iHttpResponse.getContent();
                    if (this.f3822a != null) {
                        this.f3822a.run(za.this.a(content));
                    }
                } catch (IOException e8) {
                    e8.printStackTrace();
                    message = e8.getMessage();
                    i8 = 101;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    message = e9.getMessage();
                    i8 = 103;
                }
            }
            i8 = 0;
            message = null;
            if (TextUtils.isEmpty(message) || (iError = this.f3823b) == null) {
                return;
            }
            iError.onError(i8, message, null);
        }
    }

    public za(Context context) {
        this.f3820i = new WeakReference<>(context);
    }

    public final ARResourceInfo a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("ar_key");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        ARResourceInfo aRResourceInfo = new ARResourceInfo();
        aRResourceInfo.arKey = optString;
        aRResourceInfo.arType = jSONObject.optInt("ar_type");
        aRResourceInfo.thumbnailUrl = jSONObject.optString("image_url");
        aRResourceInfo.versionCode = jSONObject.optString("version_code");
        return aRResourceInfo;
    }

    @Override // com.baidu.ar.e0
    public void b() {
        IHttpRequest iHttpRequest = this.f3821j;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
            this.f3821j = null;
        }
    }

    public final List<IARCaseInfo> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("errorNum", -1);
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optInt == 0 && optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    ARResourceInfo a8 = a(optJSONArray.optJSONObject(i8));
                    if (a8 != null) {
                        arrayList.add(a8);
                    }
                }
            }
        } catch (JSONException e8) {
            h.b(za.class.getName(), "parse err: " + e8.getMessage());
        }
        return arrayList;
    }

    public final JSONObject a(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            gb.a(jSONObject);
            gb.b(context, jSONObject);
            gb.a(context, jSONObject, str, "");
            gb.a(context, jSONObject);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.baidu.ar.e0
    public void a(String str, ICallbackWith<List<IARCaseInfo>> iCallbackWith, IError iError) {
        Context context = this.f3820i.get();
        if (context == null) {
            return;
        }
        String i8 = id.i();
        JSONObject a8 = a(context, str);
        IHttpRequest newRequest = HttpFactory.newRequest();
        this.f3821j = newRequest;
        if (newRequest == null) {
            return;
        }
        newRequest.setUrl(i8).setMethod(HttpManager.HTTP_POST).setBody(a8).enqueue(new a(iCallbackWith, iError));
    }
}
