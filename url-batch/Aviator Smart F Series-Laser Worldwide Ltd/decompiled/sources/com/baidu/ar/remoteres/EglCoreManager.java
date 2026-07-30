package com.baidu.ar.remoteres;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.DuMixController;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.h;
import com.baidu.ar.h0;
import com.baidu.ar.hb;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.j4;
import com.baidu.ar.jb;
import com.baidu.ar.o;
import com.baidu.ar.o3;
import com.baidu.ar.v5;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class EglCoreManager extends h0 implements v5 {

    /* renamed from: a, reason: collision with root package name */
    public o3 f3139a;

    /* renamed from: b, reason: collision with root package name */
    public File f3140b;

    /* renamed from: c, reason: collision with root package name */
    public String f3141c;

    public class a implements ICallbackWith<String> {
        public a() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(String str) {
            EglCoreManager eglCoreManager = EglCoreManager.this;
            ICallbackWith<IDuMixResLoadTask> iCallbackWith = eglCoreManager.mErrorCallback;
            if (iCallbackWith != null) {
                iCallbackWith.run(eglCoreManager.makeErrorObj(str));
            }
        }
    }

    public class b implements ICallbackWith<Map<String, String>> {
        public b() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(Map<String, String> map) {
            if (map != null) {
                EglCoreManager.this.mBusinessResUrls.putAll(map);
            }
            EglCoreManager eglCoreManager = EglCoreManager.this;
            eglCoreManager.mIsChecked = true;
            eglCoreManager.executeReadyTask();
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IDuMixResProcessor f3144a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ICallback f3145b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IProgressCallback f3146c;

        public class a implements ICallback {
            public a() {
            }

            @Override // com.baidu.ar.callback.ICallback
            public void run() {
                c cVar = c.this;
                EglCoreManager.this.updateModResVersion(cVar.f3144a);
                c.this.f3144a.load(null, null, null);
                DuMixResManager.setAREngienDownload(true);
                ICallback iCallback = c.this.f3145b;
                if (iCallback != null) {
                    iCallback.run();
                }
            }
        }

        public c(IDuMixResProcessor iDuMixResProcessor, ICallback iCallback, IProgressCallback iProgressCallback) {
            this.f3144a = iDuMixResProcessor;
            this.f3145b = iCallback;
            this.f3146c = iProgressCallback;
        }

        public final void b() {
            this.f3146c.onProgress(0, 0);
            h.a("EglCoreManager", "start downloading so:" + this.f3144a.getBusinessTag());
            EglCoreManager.this.doDownloadRes(this.f3144a.getBusinessTag(), new a(), this.f3146c);
        }

        @Override // java.lang.Runnable
        public void run() {
            ICallback iCallback;
            if (TextUtils.isEmpty(EglCoreManager.this.f3141c)) {
                if (EglCoreManager.this.isSoDownloadSuccess() && !EglCoreManager.this.isModHasNewVersion(this.f3144a.getBusinessTag())) {
                    iCallback = this.f3145b;
                    if (iCallback == null) {
                        return;
                    }
                    iCallback.run();
                    return;
                }
                b();
            }
            if (EglCoreManager.this.isSoDownloadSuccess() && j4.a(EglCoreManager.this.f3140b, EglCoreManager.this.f3141c) && !EglCoreManager.this.isModHasNewVersion(this.f3144a.getBusinessTag())) {
                iCallback = this.f3145b;
                if (iCallback == null) {
                    return;
                }
                iCallback.run();
                return;
            }
            b();
        }
    }

    static {
        h.a(true);
    }

    public final o3 a() {
        if (this.f3139a == null) {
            this.f3139a = new o3();
        }
        return this.f3139a;
    }

    public final void checkNewVersion() {
        String[] strArr = {a().getBusinessTag()};
        this.mDownloader.a(new a());
        this.mDownloader.a(strArr, new b());
    }

    public final void checkResSdkVersion(Context context) {
        jb a8 = jb.a(context);
        if (a8.b() != o.a()) {
            j4.a(this.f3140b, true);
            a8 = jb.a();
        }
        this.mResVersion = a8;
    }

    @Override // com.baidu.ar.v5
    public boolean isSoDownloadSuccess() {
        o3 a8 = a();
        boolean z7 = false;
        if (a8 != null) {
            if (a8.isReady(this.f3140b, null) && j4.a(this.f3140b)) {
                z7 = true;
            }
            h.a("EglCoreManager", "check so download success: isSoDownloadSuccess:" + z7);
        }
        return z7;
    }

    @Override // com.baidu.ar.v5
    public void prepareEglCore(ICallback iCallback, IProgressCallback iProgressCallback, ICallbackWith<IDuMixResLoadTask> iCallbackWith) {
        this.mErrorCallback = iCallbackWith;
        a(iCallback, iProgressCallback);
    }

    @Override // com.baidu.ar.v5
    public void release() {
        onRelease();
    }

    @Override // com.baidu.ar.v5
    public void setBusinessTag(String str) {
        a().a(str);
    }

    @Override // com.baidu.ar.v5
    public void setSoName(String str) {
        this.f3141c = str;
    }

    @Override // com.baidu.ar.v5
    public void setup(Context context) {
        this.mContext = context.getApplicationContext();
        this.f3140b = new File(DuMixController.getSoDownLoadDir(context));
        if (!com.baidu.ar.libloader.a.b()) {
            com.baidu.ar.libloader.a.a(new com.baidu.ar.libloader.c(this.f3140b.getAbsolutePath()));
        }
        checkResSdkVersion(context);
        j4.e(this.f3140b);
        this.mDownloader = new hb(context.getApplicationContext(), this.f3140b);
        checkNewVersion();
    }

    public final void a(ICallback iCallback, IProgressCallback iProgressCallback) {
        o3 a8 = a();
        if (a8 != null) {
            onReady(new c(a8, iCallback, iProgressCallback));
        } else if (iCallback != null) {
            iCallback.run();
        }
    }
}
