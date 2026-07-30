package com.baidu.ar;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.Downloader;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class hb {

    /* renamed from: a, reason: collision with root package name */
    public File f2391a;

    /* renamed from: b, reason: collision with root package name */
    public File f2392b;

    /* renamed from: c, reason: collision with root package name */
    public ICallbackWith<String> f2393c;

    /* renamed from: d, reason: collision with root package name */
    public IHttpRequest f2394d;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ICallbackWith f2395a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f2396b;

        public a(ICallbackWith iCallbackWith, String[] strArr) {
            this.f2395a = iCallbackWith;
            this.f2396b = strArr;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            if (httpException.getCode() == 1) {
                hb.this.a("网络不给力");
            } else {
                hb.this.a(httpException.getMessage());
            }
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                ICallbackWith iCallbackWith = this.f2395a;
                if (iCallbackWith != null) {
                    iCallbackWith.run(hb.this.a(this.f2396b, iHttpResponse));
                }
            } catch (Exception e8) {
                hb.this.a(e8.getMessage());
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2398a;

        public b(String str) {
            this.f2398a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (hb.this.f2393c != null) {
                hb.this.f2393c.run(this.f2398a);
            }
        }
    }

    public class c implements ICallbackWith<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f2400a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ICallback f2401b;

        public c(File file, ICallback iCallback) {
            this.f2400a = file;
            this.f2401b = iCallback;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(Integer num) {
            if (!af.a(this.f2400a, hb.this.f2391a)) {
                hb.this.a("zip res fail");
                return;
            }
            j4.b(hb.this.f2391a);
            ICallback iCallback = this.f2401b;
            if (iCallback != null) {
                iCallback.run();
            }
        }
    }

    public class d implements ICallbackWith<Exception> {
        public d() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(Exception exc) {
            hb.this.a(exc.getMessage());
        }
    }

    public hb(Context context, File file) {
        this.f2391a = file;
        this.f2392b = new File(context.getFilesDir(), "tmp");
    }

    public final IHttpRequest a(String str, ICallback iCallback, IProgressCallback iProgressCallback) {
        if (TextUtils.isEmpty(str)) {
            a("资源不存在");
            return null;
        }
        j4.l(this.f2391a);
        j4.e(this.f2392b);
        File file = new File(this.f2392b, k8.b(str) + ".zip");
        if (!file.exists() || !af.a(file, this.f2391a)) {
            return new Downloader(str).downloadAsync(file.getAbsolutePath(), new c(file, iCallback), new d(), iProgressCallback);
        }
        j4.b(this.f2391a);
        if (iCallback != null) {
            iCallback.run();
        }
        return null;
    }

    public void b() {
        this.f2393c = null;
        a();
    }

    public void b(String str, ICallback iCallback, IProgressCallback iProgressCallback) {
        IHttpRequest iHttpRequest = this.f2394d;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
        }
        this.f2394d = a(str, iCallback, iProgressCallback);
    }

    public final Map<String, String> a(String[] strArr, IHttpResponse iHttpResponse) {
        JSONObject optJSONObject;
        if (!iHttpResponse.isSuccess()) {
            throw new Exception(iHttpResponse.getMessage());
        }
        String content = iHttpResponse.getContent();
        if (TextUtils.isEmpty(content)) {
            throw new Exception("response is empty");
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject(content);
        if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
            for (String str : strArr) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
                hashMap.put(str, optJSONObject2 == null ? "" : optJSONObject2.optString("url"));
            }
        }
        return hashMap;
    }

    public void a() {
        IHttpRequest iHttpRequest = this.f2394d;
        if (iHttpRequest != null) {
            iHttpRequest.cancel();
            this.f2394d = null;
        }
    }

    public void a(ICallbackWith<String> iCallbackWith) {
        this.f2393c = iCallbackWith;
    }

    public final void a(String str) {
        h.b("dumixres fail: " + str);
        gd.a(new b(str));
    }

    public void a(String[] strArr, ICallbackWith<Map<String, String>> iCallbackWith) {
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            a("current dumix sdk is not support http request");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (i8 > 0) {
                sb.append(SystemInfoUtil.COMMA);
            }
            sb.append(strArr[i8]);
        }
        newRequest.setMethod(HttpManager.HTTP_POST).setUrl(id.f2485a + "/ar-client/get_library").addFormField(HttpConstants.HTTP_ENGINE_VERSION, Integer.valueOf(o.a())).addFormField("os", HttpConstants.OS_TYPE_VALUE).addFormField("business", sb.toString()).addFormField(HttpConstants.OS_CPU_ABI, Build.CPU_ABI);
        newRequest.enqueue(new a(iCallbackWith, strArr));
        this.f2394d = newRequest;
    }
}
