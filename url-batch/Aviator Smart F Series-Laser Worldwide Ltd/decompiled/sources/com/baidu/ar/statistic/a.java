package com.baidu.ar.statistic;

import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import cn.hutool.core.util.l;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.id;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.o;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends AsyncTask<String, Void, List<String>> {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0039a f3236a;

    /* renamed from: com.baidu.ar.statistic.a$a, reason: collision with other inner class name */
    public interface InterfaceC0039a {
        void onPerformanceRequestFinished(List<String> list);
    }

    public a(InterfaceC0039a interfaceC0039a) {
        this.f3236a = interfaceC0039a;
    }

    public final String a() {
        return String.format("%s=%s&%s=%s&%s=%s&%s=%s&%s=%s", HttpConstants.HTTP_OS_TYPE, HttpConstants.OS_TYPE_VALUE, HttpConstants.HTTP_ENGINE_VERSION, String.valueOf(o.a()), "manufacture", a(Build.MANUFACTURER), HttpConstants.HTTP_BOARD, a(Build.BOARD), HttpConstants.HTTP_HARDWARE, a(Build.HARDWARE));
    }

    public final List<String> b(String str) {
        int length;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            JSONObject jSONObject = optJSONObject != null ? optJSONObject.getJSONObject("statistic_swtich") : null;
            if (jSONObject != null && (length = jSONObject.length()) > 0) {
                ArrayList arrayList = new ArrayList(length);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if ("1".equals(jSONObject.opt(next))) {
                        arrayList.add(next);
                    }
                }
                return arrayList;
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        return null;
    }

    public final String a(String str) {
        try {
            return URLEncoder.encode(str, l.UTF_8);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<String> doInBackground(String... strArr) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return null;
        }
        String f8 = id.f();
        newRequest.setUrl(f8).setMethod(HttpManager.HTTP_POST).setBody(a()).addHeader("Content-Type: application/x-www-form-urlencoded");
        try {
            IHttpResponse execute = newRequest.execute();
            if (execute.isSuccess()) {
                return b(execute.getContent());
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return null;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(List<String> list) {
        super.onPostExecute(list);
        InterfaceC0039a interfaceC0039a = this.f3236a;
        if (interfaceC0039a != null) {
            interfaceC0039a.onPerformanceRequestFinished(list);
        }
        this.f3236a = null;
    }
}
