package com.baidu.platform.base;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.http.AsyncHttpClient;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.district.DistrictResult;
import com.baidu.mapsdkplatform.comapi.util.AlgorithmUtil;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private AsyncHttpClient f8688a = new AsyncHttpClient();

    /* renamed from: b, reason: collision with root package name */
    private Handler f8689b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    protected final Lock f8690c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private boolean f8691d = true;

    /* renamed from: e, reason: collision with root package name */
    private DistrictResult f8692e = null;

    /* renamed from: f, reason: collision with root package name */
    private SearchType f8693f;

    class a extends HttpClient.ProtoResultCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f8694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f8695b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f8696c;

        a(f fVar, g gVar, Object obj) {
            this.f8694a = fVar;
            this.f8695b = gVar;
            this.f8696c = obj;
        }

        @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
        public void onFailed(HttpClient.HttpStateError httpStateError) {
            b.this.a(httpStateError, this.f8695b.a(), this.f8694a, this.f8696c);
        }

        @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
        public void onSuccess(String str) {
            String str2;
            if (!b.this.b(str)) {
                String c8 = this.f8694a instanceof com.baidu.platform.a.e.e ? b.this.c(str) : "";
                if (!TextUtils.isEmpty(c8)) {
                    str2 = c8;
                    b.this.a(str2, this.f8695b.a(), this.f8694a, this.f8696c, b.this.f8688a, this);
                }
            }
            str2 = str;
            b.this.a(str2, this.f8695b.a(), this.f8694a, this.f8696c, b.this.f8688a, this);
        }
    }

    /* renamed from: com.baidu.platform.base.b$b, reason: collision with other inner class name */
    class RunnableC0095b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f8698a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SearchResult f8699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f8700c;

        RunnableC0095b(f fVar, SearchResult searchResult, Object obj) {
            this.f8698a = fVar;
            this.f8699b = searchResult;
            this.f8700c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8698a != null) {
                b.this.f8690c.lock();
                try {
                    this.f8698a.a(this.f8699b, this.f8700c);
                } finally {
                    b.this.f8690c.unlock();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        byte[] bArr = {a4.a.f23c1, a4.a.X0, a4.a.f35f1, a4.a.f47i1, a4.a.f15a1};
        try {
            bArr = AlgorithmUtil.getUrlNeedInfo(AppMD5.getUrlNeedInfo(), AppMD5.getUrlNeedInfo(), Base64.decode(str.getBytes(), 0));
        } catch (Exception unused) {
            Log.e("BaseSearch", "transform result failed");
        }
        return new String(bArr).trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        int permissionCheck;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("status") && !jSONObject.has("status_sp")) {
                return true;
            }
            int i8 = jSONObject.has("status") ? jSONObject.getInt("status") : jSONObject.getInt("status_sp");
            if ((i8 != 105 && i8 != 106) || (permissionCheck = PermissionCheck.permissionCheck()) == 0) {
                return true;
            }
            Log.e("BaseSearch", "permissionCheck result is: " + permissionCheck);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    protected boolean a(g gVar, Object obj, f fVar) {
        if (fVar == null) {
            Log.e(b.class.getSimpleName(), "The SearchParser is null, must be applied.");
            return false;
        }
        SearchType a8 = fVar.a();
        this.f8693f = a8;
        String b8 = gVar.b(a8);
        if (b8 == null) {
            Log.e("BaseSearch", "The sendurl is: " + b8);
            a(fVar.a("{SDK_InnerError:{PermissionCheckError:Error}}"), obj, fVar);
            return false;
        }
        if (this.f8693f == SearchType.INTEGRAL_ROUTE && !PermissionUtils.getInstance().isIntegralRoutePlanAuthorized()) {
            Log.e("BaseSearch", "isIntegralRoutePlanAuthorized is false");
            a(fVar.a("{SDK_InnerError:{NO_ADVANCED_PERMISSION:IntegralRoutePlanAuthorized}}"), obj, fVar);
            return false;
        }
        this.f8688a.get(b8, new a(fVar, gVar, obj));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, f fVar, Object obj, AsyncHttpClient asyncHttpClient, HttpClient.ProtoResultCallback protoResultCallback) {
        SearchResult a8 = fVar.a(str);
        if (a8 != null) {
            a8.setCustomExtra(str2);
        }
        a8.status = a(str);
        if (a(fVar, a8)) {
            a(asyncHttpClient, protoResultCallback, a8);
            return;
        }
        if (fVar instanceof com.baidu.platform.a.d.b) {
            DistrictResult districtResult = this.f8692e;
            if (districtResult != null) {
                DistrictResult districtResult2 = (DistrictResult) a8;
                districtResult2.setCityCode(districtResult.getCityCode());
                districtResult2.setCenterPt(this.f8692e.getCenterPt());
            }
            a(a8, obj, fVar);
            this.f8691d = true;
            this.f8692e = null;
            ((com.baidu.platform.a.d.b) fVar).a(false);
            return;
        }
        a(a8, obj, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HttpClient.HttpStateError httpStateError, String str, f fVar, Object obj) {
        SearchResult a8 = fVar.a("{SDK_InnerError:{httpStateError:" + httpStateError + "}}");
        if (a8 != null) {
            a8.setCustomExtra(str);
        }
        a(a8, obj, fVar);
    }

    private void a(SearchResult searchResult, Object obj, f fVar) {
        this.f8689b.post(new RunnableC0095b(fVar, searchResult, obj));
    }

    private boolean a(f fVar, SearchResult searchResult) {
        if (!(fVar instanceof com.baidu.platform.a.d.b)) {
            return false;
        }
        DistrictResult districtResult = (DistrictResult) searchResult;
        if (SearchResult.ERRORNO.RESULT_NOT_FOUND != districtResult.error || districtResult.getCityName() == null || !this.f8691d) {
            return false;
        }
        this.f8691d = false;
        this.f8692e = districtResult;
        ((com.baidu.platform.a.d.b) fVar).a(true);
        return true;
    }

    private void a(AsyncHttpClient asyncHttpClient, HttpClient.ProtoResultCallback protoResultCallback, SearchResult searchResult) {
        asyncHttpClient.get(new com.baidu.platform.a.d.c(((DistrictResult) searchResult).getCityName()).b(this.f8693f), protoResultCallback);
    }

    private int a(String str) {
        JSONObject optJSONObject;
        if (str != null && !str.equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("status")) {
                    return jSONObject.getInt("status");
                }
                if (jSONObject.has("status_sp")) {
                    return jSONObject.getInt("status_sp");
                }
                if (!jSONObject.has("result") || (optJSONObject = jSONObject.optJSONObject("result")) == null) {
                    return 10204;
                }
                return optJSONObject.optInt("error");
            } catch (JSONException unused) {
                Log.e("BaseSearch", "Create JSONObject failed when get response result status");
            }
        }
        return 10204;
    }
}
