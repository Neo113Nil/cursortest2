package com.baidu.ar;

import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.mapapi.http.wrapper.HttpManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r8 {
    public static void a() {
        HttpFactory.release();
    }

    public static void a(String str, JSONObject jSONObject, c6 c6Var) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest != null) {
            newRequest.setMethod(HttpManager.HTTP_POST).setUrl(str).setBody(jSONObject);
            newRequest.enqueue(c6Var);
        }
    }

    public static void a(String str, byte[] bArr, c6 c6Var) {
        try {
            HttpFactory.newRequest().setUrl(str).addHeader("Content-Type:application/protobuf").setMethod(HttpManager.HTTP_POST).setBody(bArr).enqueue(c6Var);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
