package com.baidu.ar;

import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ba extends e8 {
    @Override // com.baidu.ar.e8
    public Map<String, Object> a(List<t3> list) {
        return null;
    }

    @Override // com.baidu.ar.e8
    public void b(JSONObject jSONObject) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return;
        }
        newRequest.setUrl(id.g()).setMethod(HttpManager.HTTP_POST).setBody("info=" + URLEncoder.encode(jSONObject.toString(), cn.hutool.core.util.l.UTF_8)).addHeader("Content-Type: application/x-www-form-urlencoded");
        newRequest.execute();
    }

    @Override // com.baidu.ar.e8
    public JSONObject a(JSONObject jSONObject, t3 t3Var) {
        return jSONObject;
    }

    @Override // com.baidu.ar.e8
    public void a(JSONObject jSONObject) {
    }
}
