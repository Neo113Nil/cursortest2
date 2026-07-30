package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.callback.ICancellable;
import com.baidu.ar.content.ContentCloud;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.content.IRequestCallback;
import com.baidu.ar.ihttp.IProgressCallback;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public ContentCloud f3441a;

    /* renamed from: b, reason: collision with root package name */
    public t1 f3442b;

    /* renamed from: c, reason: collision with root package name */
    public c f3443c;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap<String, ICancellable> f3444d = new ConcurrentHashMap<>();

    public class a implements IRequestCallback<IARCaseInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3445a;

        public a(String str) {
            this.f3445a = str;
        }

        @Override // com.baidu.ar.content.IRequestCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(IARCaseInfo iARCaseInfo) {
            v1.this.f3444d.remove(iARCaseInfo.getARKey());
            if (v1.this.f3443c != null) {
                v1.this.f3443c.a(iARCaseInfo);
            }
            if (v1.this.f3442b != null) {
                if (iARCaseInfo.isRefused() || !iARCaseInfo.isHardwareSatisfied()) {
                    v1.this.f3442b.onRefused();
                } else {
                    v1.this.f3442b.onDownloadFinish(true, iARCaseInfo.getARKey(), iARCaseInfo.getArCasePath(), 0, "ar case download success!!!");
                }
            }
        }

        @Override // com.baidu.ar.content.IRequestCallback
        public void onFail(int i8, String str) {
            if (v1.this.f3442b != null) {
                v1.this.f3442b.onDownloadFinish(false, this.f3445a, null, i8, str);
            }
            v1.this.f3444d.remove(this.f3445a);
        }
    }

    public class b implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3447a;

        public b(String str) {
            this.f3447a = str;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i8, int i9) {
            if (v1.this.f3442b != null) {
                v1.this.f3442b.onDownloadProgress(i9 != 0 ? (i8 * 100) / i9 : 100, this.f3447a);
            }
        }
    }

    public interface c {
        void a(IARCaseInfo iARCaseInfo);
    }

    public v1(Context context) {
        this.f3441a = new ContentCloud(context);
    }

    public void a() {
        Iterator<Map.Entry<String, ICancellable>> it = this.f3444d.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel();
        }
        this.f3444d.clear();
    }

    public void b() {
        this.f3442b = null;
        a();
        this.f3441a.release();
        this.f3441a = null;
    }

    public String c(String str) {
        ContentCloud contentCloud = this.f3441a;
        if (contentCloud != null) {
            return contentCloud.getCasePath(str);
        }
        return null;
    }

    public void a(t1 t1Var) {
        this.f3442b = t1Var;
    }

    public void b(String str) {
        if (this.f3441a == null) {
            return;
        }
        h.c("CaseDownloader", "start downloading case,arkey:" + str);
        this.f3444d.put(str, this.f3441a.downloadCase(str, new a(str), new b(str)));
    }

    public void a(String str) {
        ICancellable iCancellable = this.f3444d.get(str);
        if (iCancellable != null) {
            iCancellable.cancel();
            this.f3444d.remove(str);
        }
    }
}
