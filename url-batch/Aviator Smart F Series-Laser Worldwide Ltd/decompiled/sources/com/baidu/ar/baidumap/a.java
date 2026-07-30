package com.baidu.ar.baidumap;

import android.content.Context;
import com.baidu.ar.callback.ICancellable;
import com.baidu.ar.content.ContentCloud;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.content.IRequestCallback;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.x1;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public ContentCloud f1825a;

    /* renamed from: b, reason: collision with root package name */
    public CaseStateListener f1826b;

    /* renamed from: c, reason: collision with root package name */
    public e f1827c;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap<String, ICancellable> f1828d = new ConcurrentHashMap<>();

    /* renamed from: com.baidu.ar.baidumap.a$a, reason: collision with other inner class name */
    public class C0033a implements IRequestCallback<IARCaseInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1829a;

        public C0033a(String str) {
            this.f1829a = str;
        }

        @Override // com.baidu.ar.content.IRequestCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(IARCaseInfo iARCaseInfo) {
            a.this.f1828d.remove(iARCaseInfo.getARKey());
            if (a.this.f1827c != null) {
                a.this.f1827c.a(iARCaseInfo);
            }
            if (a.this.f1826b != null) {
                if (iARCaseInfo.isRefused() || !iARCaseInfo.isHardwareSatisfied()) {
                    a.this.f1826b.onRefused();
                } else {
                    a.this.f1826b.onDownloadFinish(true, iARCaseInfo.getARKey(), iARCaseInfo.getArCasePath(), 0, "ar case download success!!!");
                }
            }
        }

        @Override // com.baidu.ar.content.IRequestCallback
        public void onFail(int i8, String str) {
            if (a.this.f1826b != null) {
                a.this.f1826b.onDownloadFinish(false, this.f1829a, null, i8, str);
            }
            a.this.f1828d.remove(this.f1829a);
        }
    }

    public class b implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f1831a;

        public b(String str) {
            this.f1831a = str;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i8, int i9) {
            if (a.this.f1826b != null) {
                a.this.f1826b.onDownloadProgress(i9 != 0 ? (i8 * 100) / i9 : 100, this.f1831a);
            }
        }
    }

    public class c implements IRequestCallback<IARCaseInfo> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CaseDownloadListener f1833a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1834b;

        public c(CaseDownloadListener caseDownloadListener, String str) {
            this.f1833a = caseDownloadListener;
            this.f1834b = str;
        }

        @Override // com.baidu.ar.content.IRequestCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(IARCaseInfo iARCaseInfo) {
            if (this.f1833a != null) {
                if (iARCaseInfo.isRefused() || !iARCaseInfo.isHardwareSatisfied()) {
                    a.this.f1826b.onRefused();
                    return;
                }
                this.f1833a.onDownloadFinish(true, iARCaseInfo.getARKey(), iARCaseInfo.getArCasePath(), 0, "ar case download success!!!");
            }
            a.this.f1828d.remove(iARCaseInfo.getARKey());
        }

        @Override // com.baidu.ar.content.IRequestCallback
        public void onFail(int i8, String str) {
            CaseDownloadListener caseDownloadListener = this.f1833a;
            if (caseDownloadListener != null) {
                caseDownloadListener.onDownloadFinish(false, this.f1834b, null, i8, str);
            }
            a.this.f1828d.remove(this.f1834b);
        }
    }

    public class d implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CaseDownloadListener f1836a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1837b;

        public d(a aVar, CaseDownloadListener caseDownloadListener, String str) {
            this.f1836a = caseDownloadListener;
            this.f1837b = str;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i8, int i9) {
            CaseDownloadListener caseDownloadListener = this.f1836a;
            if (caseDownloadListener != null) {
                caseDownloadListener.onDownloadProgress(i9 != 0 ? (i8 * 100) / i9 : 100, this.f1837b);
            }
        }
    }

    public interface e {
        void a(IARCaseInfo iARCaseInfo);
    }

    public a(Context context) {
        this.f1825a = new ContentCloud(context);
    }

    public void a() {
        Iterator<Map.Entry<String, ICancellable>> it = this.f1828d.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().cancel();
        }
        this.f1828d.clear();
    }

    public void b() {
        this.f1826b = null;
        a();
        this.f1825a.release();
        this.f1825a = null;
    }

    public void a(CaseStateListener caseStateListener) {
        this.f1826b = caseStateListener;
    }

    public void b(String str) {
        this.f1828d.put(str, this.f1825a.downloadCase(str, new C0033a(str), new b(str)));
    }

    public void a(e eVar) {
        this.f1827c = eVar;
    }

    public void a(String str) {
        ICancellable iCancellable = this.f1828d.get(str);
        if (iCancellable != null) {
            iCancellable.cancel();
            this.f1828d.remove(str);
        }
    }

    public void a(String str, CaseDownloadListener caseDownloadListener) {
        this.f1828d.put(str, this.f1825a.downloadCase(str, new c(caseDownloadListener, str), new d(this, caseDownloadListener, str)));
    }

    public void a(String str, x1 x1Var) {
        this.f1825a.checkCaseUpdate(str, x1Var);
    }
}
