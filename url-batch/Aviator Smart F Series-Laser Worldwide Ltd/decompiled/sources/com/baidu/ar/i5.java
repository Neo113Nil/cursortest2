package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.http.HttpRequestFactory;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i5 implements IHttpRequest {

    /* renamed from: a, reason: collision with root package name */
    public HttpRequestFactory f2443a;

    /* renamed from: b, reason: collision with root package name */
    public hd f2444b = new hd();

    /* renamed from: c, reason: collision with root package name */
    public r5 f2445c = null;

    /* renamed from: d, reason: collision with root package name */
    public j5 f2446d;

    /* renamed from: e, reason: collision with root package name */
    public b6 f2447e;

    /* renamed from: f, reason: collision with root package name */
    public IProgressCallback f2448f;

    public i5(HttpRequestFactory httpRequestFactory) {
        this.f2443a = httpRequestFactory;
        j5 j5Var = new j5();
        this.f2446d = j5Var;
        j5Var.f2528b = HttpManager.HTTP_GET;
        j5Var.f2531e = new HashMap();
        this.f2446d.f2530d = new k5();
        this.f2447e = null;
    }

    public final IHttpRequest a(byte[] bArr, String str) {
        if (b(str)) {
            ((pa) this.f2445c).a(bArr);
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addFile(String str, String str2) {
        if (a((String) null)) {
            ((c9) this.f2445c).a(str, str2);
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addFormData(Map<String, Object> map) {
        if (map != null && b()) {
            l4 l4Var = (l4) this.f2445c;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    l4Var.a(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addFormField(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null && b()) {
            ((l4) this.f2445c).a(str, obj.toString());
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addHeader(String str) {
        String[] c8 = m5.c(str);
        if (c8 == null) {
            this.f2446d.a(String.format("Header 格式必须是： \\\"Name: Value\\\". Found: \\\"%s\\\"", str));
            return this;
        }
        a(c8[0], c8[1]);
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addHeaders(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                addHeader(str);
            }
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addPart(String str, Object obj) {
        if (obj != null && a((String) null)) {
            ((c9) this.f2445c).b(str, obj.toString());
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addPartMap(Map<String, Object> map) {
        if (map != null && a((String) null)) {
            c9 c9Var = (c9) this.f2445c;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    c9Var.b(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addQueryField(String str, Object obj) {
        if (obj != null) {
            this.f2444b.a(str, obj.toString());
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addQueryMap(Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    this.f2444b.a(entry.getKey(), entry.getValue().toString());
                }
            }
        }
        return this;
    }

    public final boolean b() {
        r5 r5Var = this.f2445c;
        if (r5Var != null && !(r5Var instanceof l4)) {
            this.f2446d.a(a(r5Var));
            return false;
        }
        if (r5Var != null) {
            return true;
        }
        l4 l4Var = new l4();
        this.f2445c = l4Var;
        l4Var.setCharset(this.f2446d.f2529c);
        return true;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public void cancel() {
        this.f2448f = null;
        b6 b6Var = this.f2447e;
        if (b6Var != null) {
            b6Var.cancel();
        }
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public void enqueue(c6 c6Var) {
        b6 b6Var = this.f2447e;
        if (b6Var != null) {
            b6Var.cancel();
        }
        h5 executor = this.f2443a.getExecutor();
        try {
            j5 a8 = a();
            if (a8 != null) {
                this.f2447e = executor.a(a8, c6Var, this.f2448f);
            }
        } catch (HttpException e8) {
            this.f2447e = executor.a(e8, c6Var);
        }
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpResponse execute() {
        b6 b6Var = this.f2447e;
        if (b6Var != null) {
            b6Var.cancel();
        }
        b6 a8 = this.f2443a.getExecutor().a(a(), this.f2448f);
        this.f2447e = a8;
        return a8.a();
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setAsMultipart() {
        r5 r5Var = this.f2445c;
        return (r5Var == null || !(r5Var instanceof c9)) ? setAsMultipart(g5.f2326b) : this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setBody(String str) {
        if (!TextUtils.isEmpty(str)) {
            a(str.getBytes(this.f2446d.f2529c), com.yanzhenjie.kalle.i.VALUE_APPLICATION_URLENCODED);
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setCharset(Charset charset) {
        this.f2446d.f2529c = charset;
        this.f2444b.a(charset);
        r5 r5Var = this.f2445c;
        if (r5Var != null) {
            r5Var.setCharset(charset);
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setConnectionTimeout(int i8) {
        this.f2446d.f2530d.f2643a = i8;
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setMethod(String str) {
        if (str != null) {
            this.f2446d.f2528b = str.toUpperCase();
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public void setProgressCallback(IProgressCallback iProgressCallback) {
        this.f2448f = iProgressCallback;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setReadTimeout(int i8) {
        this.f2446d.f2530d.f2644b = i8;
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setUrl(String str) {
        this.f2444b.a(str);
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setUseCache(boolean z7) {
        this.f2446d.f2530d.f2645c = z7;
        return this;
    }

    public final j5 a() {
        if (this.f2446d.b()) {
            throw new HttpException(3, this.f2446d.a());
        }
        Charset charset = this.f2446d.f2529c;
        if (charset != null) {
            a("charset", charset.name());
        }
        try {
            this.f2446d.f2527a = this.f2444b.a();
            if (this.f2445c != null) {
                if (!this.f2446d.f2531e.containsKey("Content-Type")) {
                    String b8 = this.f2445c.b();
                    if (!TextUtils.isEmpty(b8)) {
                        this.f2446d.f2531e.put("Content-Type", b8);
                    }
                }
                this.f2446d.f2532f = this.f2445c;
            }
            return this.f2446d;
        } catch (MalformedURLException e8) {
            throw new HttpException(3, e8);
        }
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest addFile(String str, byte[] bArr) {
        if (a((String) null)) {
            ((c9) this.f2445c).a(str, bArr);
        }
        return this;
    }

    public final boolean b(String str) {
        r5 r5Var = this.f2445c;
        if (r5Var != null && !(r5Var instanceof pa)) {
            this.f2446d.a(a(r5Var));
            return false;
        }
        if (r5Var == null) {
            pa paVar = new pa();
            this.f2445c = paVar;
            paVar.setCharset(this.f2446d.f2529c);
        }
        if (TextUtils.isEmpty(str) || this.f2446d.f2531e.containsKey("Content-Type")) {
            return true;
        }
        a("Content-Type", str);
        return true;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setAsMultipart(String str) {
        if (a(str)) {
            ((c9) this.f2445c).a(str);
        }
        return this;
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setBody(JSONObject jSONObject) {
        if (jSONObject != null) {
            a(jSONObject.toString().getBytes(this.f2446d.f2529c), com.yanzhenjie.kalle.i.VALUE_APPLICATION_JSON);
        }
        return this;
    }

    public final String a(r5 r5Var) {
        return r5Var instanceof pa ? "该请求已通过setBody设置请求体数据，不能再使用其他方式添加数据" : r5Var instanceof l4 ? "该请求是FormData方式传输数据，请使用addFormData或addFormField添加请求体数据" : r5Var instanceof c9 ? "该请求是Multipart方式传输数据，请使用addPart、addPartMap或addFile添加请求体数据" : "";
    }

    @Override // com.baidu.ar.ihttp.IHttpRequest
    public IHttpRequest setBody(byte[] bArr) {
        return a(bArr, (String) null);
    }

    public final void a(String str, String str2) {
        this.f2446d.f2531e.put(str, str2);
    }

    public final boolean a(String str) {
        j5 j5Var;
        String str2;
        r5 r5Var = this.f2445c;
        if (r5Var != null && !(r5Var instanceof c9)) {
            j5Var = this.f2446d;
            str2 = a(r5Var);
        } else {
            if (r5Var == null) {
                c9 c9Var = new c9();
                this.f2445c = c9Var;
                c9Var.setCharset(this.f2446d.f2529c);
                c9 c9Var2 = (c9) this.f2445c;
                if (TextUtils.isEmpty(str)) {
                    return true;
                }
                c9Var2.a(str);
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            c9 c9Var3 = (c9) this.f2445c;
            if (c9Var3.e() || str.equals(c9Var3.d())) {
                return true;
            }
            j5Var = this.f2446d;
            str2 = "已经添加请求体内容，不能再更改boundary";
        }
        j5Var.a(str2);
        return false;
    }
}
