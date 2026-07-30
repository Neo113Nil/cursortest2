package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.bean.ARCaseBundleInfo;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fc extends e0<String, String> {

    /* renamed from: i, reason: collision with root package name */
    public WeakReference<Context> f2227i;

    /* renamed from: j, reason: collision with root package name */
    public IHttpRequest f2228j;

    /* renamed from: k, reason: collision with root package name */
    public ARCaseBundleInfo f2229k;

    /* renamed from: l, reason: collision with root package name */
    public m1 f2230l;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f2231a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IError f2232b;

        public a(ICallbackWith iCallbackWith, IError iError) {
            this.f2231a = iCallbackWith;
            this.f2232b = iError;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            StatisticApi.onEvent(StatisticConstants.LOAD_QUERY_FAILURE);
            IError iError = this.f2232b;
            if (iError != null) {
                iError.onError(1, httpException.getMessage(), httpException);
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            String message;
            int i8;
            if (iHttpResponse.isSuccess()) {
                try {
                    String a8 = fc.this.a(iHttpResponse.getContent());
                    ICallbackWith iCallbackWith = this.f2231a;
                    if (iCallbackWith != null) {
                        iCallbackWith.run(a8);
                    }
                } catch (JSONException e8) {
                    e = e8;
                    e.printStackTrace();
                    message = e.getMessage();
                    i8 = 3;
                } catch (Exception e9) {
                    e = e9;
                    e.printStackTrace();
                    message = e.getMessage();
                    i8 = 1;
                }
            }
            i8 = 0;
            e = null;
            message = null;
            if (TextUtils.isEmpty(message)) {
                return;
            }
            StatisticApi.onEvent(StatisticConstants.LOAD_QUERY_FAILURE);
            IError iError = this.f2232b;
            if (iError != null) {
                iError.onError(i8, message, e);
            }
        }
    }

    public fc(Context context, ARCaseBundleInfo aRCaseBundleInfo, m1 m1Var) {
        this.f2227i = new WeakReference<>(context);
        this.f2229k = aRCaseBundleInfo;
        this.f2230l = m1Var;
    }

    @Override // com.baidu.ar.e0
    public void b() {
        IHttpRequest iHttpRequest = this.f2228j;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
            this.f2228j = null;
        }
    }

    public final String a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.getInt("errorNum") != 0) {
            throw new Exception(jSONObject.optString("errorMsg", "query res failed"));
        }
        String string = jSONObject.getString("data");
        if (TextUtils.isEmpty(string)) {
            throw new Exception("query res failed");
        }
        return string;
    }

    public final JSONObject a(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            gb.a(jSONObject);
            gb.b(context, jSONObject);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.baidu.ar.e0
    public void a(String str, ICallbackWith<String> iCallbackWith, IError iError) {
        ARCaseBundleInfo aRCaseBundleInfo;
        Context context = this.f2227i.get();
        if (context == null || (aRCaseBundleInfo = this.f2229k) == null) {
            return;
        }
        String str2 = aRCaseBundleInfo.arKey;
        gc a8 = this.f2230l.a(str);
        if (a8 == null) {
            iError.onError(1, "资源不存在", null);
            return;
        }
        if (TextUtils.isEmpty(a8.f2337b)) {
            iError.onError(1, "资源id不存在", null);
            return;
        }
        if (ImagesContract.LOCAL.equals(a8.f2337b)) {
            iCallbackWith.run(ImagesContract.LOCAL);
            return;
        }
        if (TextUtils.isEmpty(a8.f2338c)) {
            iError.onError(1, "编码不正确", null);
            return;
        }
        StatisticApi.onEvent(StatisticConstants.LOAD_START_QUERY);
        String k8 = id.k();
        IHttpRequest newRequest = HttpFactory.newRequest();
        this.f2228j = newRequest;
        newRequest.setUrl(k8).setMethod(HttpManager.HTTP_POST).addQueryField("id", a8.f2337b).setBody(a(context, str2)).enqueue(new a(iCallbackWith, iError));
    }
}
