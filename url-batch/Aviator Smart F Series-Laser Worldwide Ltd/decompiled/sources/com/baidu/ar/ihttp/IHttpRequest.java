package com.baidu.ar.ihttp;

import com.baidu.ar.c6;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface IHttpRequest {
    IHttpRequest addFile(String str, String str2);

    IHttpRequest addFile(String str, byte[] bArr);

    IHttpRequest addFormData(Map<String, Object> map);

    IHttpRequest addFormField(String str, Object obj);

    IHttpRequest addHeader(String str);

    IHttpRequest addHeaders(String[] strArr);

    IHttpRequest addPart(String str, Object obj);

    IHttpRequest addPartMap(Map<String, Object> map);

    IHttpRequest addQueryField(String str, Object obj);

    IHttpRequest addQueryMap(Map<String, Object> map);

    void cancel();

    void enqueue(c6 c6Var);

    IHttpResponse execute();

    IHttpRequest setAsMultipart();

    IHttpRequest setAsMultipart(String str);

    IHttpRequest setBody(String str);

    IHttpRequest setBody(JSONObject jSONObject);

    IHttpRequest setBody(byte[] bArr);

    IHttpRequest setCharset(Charset charset);

    IHttpRequest setConnectionTimeout(int i8);

    IHttpRequest setMethod(String str);

    void setProgressCallback(IProgressCallback iProgressCallback);

    IHttpRequest setReadTimeout(int i8);

    IHttpRequest setUrl(String str);

    IHttpRequest setUseCache(boolean z7);
}
