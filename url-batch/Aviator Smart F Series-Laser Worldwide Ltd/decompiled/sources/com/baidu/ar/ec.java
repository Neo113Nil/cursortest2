package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.bean.ARCaseBundleInfo;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.ICancellable;
import com.baidu.ar.callback.IError;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.steploading.IStepLoading;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class ec implements s3, IStepLoading {

    /* renamed from: a, reason: collision with root package name */
    public Context f2155a;

    /* renamed from: b, reason: collision with root package name */
    public ARCaseBundleInfo f2156b;

    /* renamed from: c, reason: collision with root package name */
    public m1 f2157c;

    /* renamed from: d, reason: collision with root package name */
    public ICallbackWith<IStepLoading> f2158d;

    /* renamed from: e, reason: collision with root package name */
    public String f2159e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2160f;

    public class a implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f2161a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2162b;

        public a(ec ecVar, boolean z7, String str) {
            this.f2161a = z7;
            this.f2162b = str;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            if (this.f2161a) {
                ec.d(this.f2162b, 100);
            }
            ec.c(this.f2162b, 0);
        }
    }

    public class b implements IError {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f2163a;

        public b(ec ecVar, String str) {
            this.f2163a = str;
        }

        @Override // com.baidu.ar.callback.IError
        public void onError(int i8, String str, Exception exc) {
            ec.c(this.f2163a, -1);
        }
    }

    public class c implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f2164a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2165b;

        public c(ec ecVar, boolean z7, String str) {
            this.f2164a = z7;
            this.f2165b = str;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i8, int i9) {
            if (!this.f2164a || i9 <= 0) {
                return;
            }
            ec.d(this.f2165b, (int) (((i8 * 90) * 1.0f) / i9));
        }
    }

    public ec(Context context) {
        this.f2155a = context.getApplicationContext();
    }

    public static void c(String str, int i8) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("request_id", str);
        hashMap.put("ret", Integer.valueOf(i8));
        ARPMessage.getInstance().sendMessage(5003, hashMap);
    }

    public static void d(String str, int i8) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("request_id", str);
        hashMap.put("progress", Integer.valueOf(i8));
        ARPMessage.getInstance().sendMessage(5002, hashMap);
    }

    public final ICancellable a(String str, ICallback iCallback, IError iError, IProgressCallback iProgressCallback) {
        return fa.a(new fc(this.f2155a, this.f2156b, this.f2157c), str).a(new dc(this.f2156b, str, this.f2157c, iProgressCallback)).a(new p1(iCallback, iError));
    }

    public void b() {
        this.f2160f = false;
        this.f2159e = null;
        this.f2158d = null;
        this.f2155a = null;
        this.f2156b = null;
        this.f2157c = null;
    }

    @Override // com.baidu.ar.steploading.IStepLoading
    public void cancel() {
        if (!this.f2160f || TextUtils.isEmpty(this.f2159e)) {
            return;
        }
        this.f2160f = false;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 3021);
        hashMap.put("if_download", 0);
        hashMap.put("download_batchid", this.f2159e);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    @Override // com.baidu.ar.steploading.IStepLoading
    public void retry() {
        if (!this.f2160f || TextUtils.isEmpty(this.f2159e)) {
            return;
        }
        this.f2160f = false;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 3021);
        hashMap.put("if_download", 1);
        hashMap.put("download_batchid", this.f2159e);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    @Override // com.baidu.ar.steploading.IStepLoading
    public void setLoadErrorListener(ICallbackWith<IStepLoading> iCallbackWith) {
        this.f2158d = iCallbackWith;
    }

    @Override // com.baidu.ar.s3
    public List<Integer> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(5001);
        arrayList.add(1901);
        return arrayList;
    }

    @Override // com.baidu.ar.s3
    public void a(int i8, int i9, HashMap<String, Object> hashMap) {
        if (i8 == 5001) {
            if (hashMap != null) {
                this.f2160f = false;
                a(hashMap);
                return;
            }
            return;
        }
        if (i8 == 1901 && a9.a(hashMap.get("id"), -1) == 3010) {
            this.f2160f = true;
            ICallbackWith<IStepLoading> iCallbackWith = this.f2158d;
            if (iCallbackWith != null) {
                iCallbackWith.run(this);
            } else {
                cancel();
            }
        }
    }

    public void a(r3 r3Var) {
        r3Var.a(this);
    }

    public void a(String str) {
        ARCaseBundleInfo aRCaseBundleInfo = new ARCaseBundleInfo();
        this.f2156b = aRCaseBundleInfo;
        aRCaseBundleInfo.caseDir = str;
        aRCaseBundleInfo.arKey = ARConfig.getARKey();
        this.f2157c = new m1(this.f2156b.caseDir);
    }

    public final void a(HashMap<String, Object> hashMap) {
        String str = (String) hashMap.get("res_path");
        String str2 = (String) hashMap.get("request_id");
        boolean z7 = ((Integer) hashMap.get("need_progress")).intValue() != 0;
        this.f2159e = str;
        a(str, new a(this, z7, str2), new b(this, str2), new c(this, z7, str2));
    }
}
