package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.content.ARResourceInfo;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class oa extends e0<String[], ARResourceInfo> {

    /* renamed from: i, reason: collision with root package name */
    public WeakReference<Context> f2911i;

    /* renamed from: j, reason: collision with root package name */
    public IHttpRequest f2912j;

    /* renamed from: k, reason: collision with root package name */
    public o2 f2913k;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f2914a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ IError f2915b;

        public a(oa oaVar, ICallbackWith iCallbackWith, IError iError) {
            this.f2914a = iCallbackWith;
            this.f2915b = iError;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            StatisticApi.onEvent(StatisticConstants.FIRST_LOAD_QUERY_FAILURE);
            IError iError = this.f2915b;
            if (iError != null) {
                iError.onError(httpException.getCode(), httpException.getMessage(), httpException);
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            String message;
            int i8;
            if (iHttpResponse.isSuccess()) {
                try {
                    ARResourceInfo a8 = n.a(iHttpResponse.getContent());
                    ICallbackWith iCallbackWith = this.f2914a;
                    if (iCallbackWith != null) {
                        iCallbackWith.run(a8);
                    }
                } catch (HttpException e8) {
                    e8.printStackTrace();
                    i8 = e8.getCode();
                    message = e8.getMessage();
                } catch (IOException e9) {
                    e9.printStackTrace();
                    message = e9.getMessage();
                    i8 = 101;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    message = e10.getMessage();
                    i8 = 103;
                }
            }
            i8 = 0;
            message = null;
            if (TextUtils.isEmpty(message)) {
                return;
            }
            StatisticApi.onEvent(StatisticConstants.FIRST_LOAD_QUERY_FAILURE);
            IError iError = this.f2915b;
            if (iError != null) {
                iError.onError(i8, message, null);
            }
        }
    }

    public oa(Context context, o2 o2Var) {
        this.f2911i = new WeakReference<>(context);
        this.f2913k = o2Var;
    }

    public final JSONObject a(Context context, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            o2 o2Var = this.f2913k;
            if (o2Var == null) {
                gb.a(jSONObject);
            } else {
                gb.a(jSONObject, o2Var.f2872a, o2Var.f2873b);
            }
            gb.b(context, jSONObject);
            gb.a(context, jSONObject, str, str2);
            gb.a(context, jSONObject);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.baidu.ar.e0
    public void b() {
        IHttpRequest iHttpRequest = this.f2912j;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
            this.f2912j = null;
        }
    }

    @Override // com.baidu.ar.e0
    public void a(String[] strArr, ICallbackWith<ARResourceInfo> iCallbackWith, IError iError) {
        Context context = this.f2911i.get();
        if (context == null) {
            return;
        }
        String str = strArr[0];
        String str2 = strArr[1];
        String h8 = id.h();
        JSONObject a8 = a(context, str, str2);
        IHttpRequest newRequest = HttpFactory.newRequest();
        this.f2912j = newRequest;
        if (newRequest == null) {
            return;
        }
        StatisticApi.onEvent(StatisticConstants.FIRST_LOAD_START_QUERY);
        this.f2912j.setUrl(h8).setMethod(HttpManager.HTTP_POST).setBody(a8).enqueue(new a(this, iCallbackWith, iError));
    }
}
