package com.baidu.ar;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.platform.comapi.map.MapController;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f1767c = "b0";

    /* renamed from: a, reason: collision with root package name */
    public IHttpRequest f1768a;

    /* renamed from: b, reason: collision with root package name */
    public ICallbackWith<String> f1769b;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f1770a;

        public a(ICallbackWith iCallbackWith) {
            this.f1770a = iCallbackWith;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            h.a(b0.f1767c, "" + httpException.getMessage());
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            if (!iHttpResponse.isSuccess() || this.f1770a == null) {
                return;
            }
            try {
                String content = iHttpResponse.getContent();
                h.a(b0.f1767c, "response: " + content);
                x b8 = b0.this.b(content);
                if (b8 != null) {
                    this.f1770a.run(b8);
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        }
    }

    public final x b(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f1769b != null) {
                a("response is empty");
            }
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("err_num", -1);
            if (optInt == 0 && jSONObject.has("data")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null && optJSONObject.has("classification")) {
                    x xVar = new x();
                    xVar.f3654b = optJSONObject.getJSONObject("classification");
                    xVar.f3653a = optJSONObject.optString("classification_id", MapController.DEFAULT_LAYER_TAG);
                    if (!a(xVar.f3654b) && this.f1769b != null) {
                        String str2 = f1767c;
                        h.b(str2, str);
                        a("config format is error. see Logcat filter: " + str2);
                    }
                    return xVar;
                }
            } else if (this.f1769b != null) {
                a("err_num: " + optInt + cn.hutool.core.text.l.SPACE + (jSONObject.has("err_msg") ? jSONObject.getString("err_msg") : ""));
            }
        } catch (JSONException e8) {
            if (this.f1769b != null) {
                a(e8.getMessage());
            }
            e8.printStackTrace();
        }
        return null;
    }

    public void b() {
        this.f1769b = null;
        IHttpRequest iHttpRequest = this.f1768a;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
            this.f1768a = null;
        }
    }

    public final JSONObject a(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            gb.a(jSONObject);
            gb.b(context, jSONObject);
            gb.a(context, jSONObject);
            jSONObject.put("device_platform", "");
            jSONObject.put(HttpConstants.OS_VERSION, Build.VERSION.SDK_INT);
            jSONObject.put(HttpConstants.DEVICE_TYPE, Build.BRAND);
            jSONObject.put("device_id", gb.a(context));
            jSONObject.put(HttpConstants.APP_VERSION, o.a());
            jSONObject.put("manufacture", Build.MANUFACTURER);
            jSONObject.put(HttpConstants.HTTP_HARDWARE, Build.HARDWARE);
            jSONObject.put(HttpConstants.HTTP_BOARD, Build.BOARD);
            jSONObject.put("classification_id", str);
            h.a(f1767c, "params: " + jSONObject.toString());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void a(Context context, String str, ICallbackWith<x> iCallbackWith) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return;
        }
        newRequest.setMethod(HttpManager.HTTP_POST).setUrl(id.a()).setBody(a(context, str));
        newRequest.enqueue(new a(iCallbackWith));
        this.f1768a = newRequest;
    }

    public void a(ICallbackWith<String> iCallbackWith) {
        this.f1769b = iCallbackWith;
    }

    public final void a(String str) {
        this.f1769b.run("fetch ability scheme config fail. " + str);
    }

    public final boolean a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || !jSONObject.has("common") || (optJSONObject = jSONObject.optJSONObject("common")) == null || !optJSONObject.has("cpu_score")) {
            return false;
        }
        Object opt = optJSONObject.opt("cpu_score");
        return opt instanceof String ? Integer.parseInt((String) opt) > 0 : (opt instanceof Number) && Integer.parseInt(opt.toString()) > 0;
    }
}
