package com.baidu.ar.baidumap;

import android.content.Context;
import com.baidu.ar.DuMixController;
import com.baidu.ar.ab;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.b9;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.h;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.marker.MarkerErrorCode;
import com.baidu.ar.remoteres.IDuMixResLoadTask;
import com.baidu.ar.v5;
import java.io.File;

/* loaded from: classes.dex */
public class AREngineManager {

    /* renamed from: e, reason: collision with root package name */
    public static volatile AREngineManager f1785e;

    /* renamed from: a, reason: collision with root package name */
    public OnEngineSoLoadedListener f1786a;

    /* renamed from: b, reason: collision with root package name */
    public v5 f1787b;

    /* renamed from: c, reason: collision with root package name */
    public Context f1788c;

    /* renamed from: d, reason: collision with root package name */
    public String f1789d;

    public interface OnEngineSoLoadedListener {
        void onLoadedError(Throwable th);

        void onLoadedSuccess();
    }

    public class a implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadListener f1790a;

        public a(AREngineManager aREngineManager, DownloadListener downloadListener) {
            this.f1790a = downloadListener;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            DownloadListener downloadListener = this.f1790a;
            if (downloadListener != null) {
                downloadListener.onDownloadComplete(true);
            }
        }
    }

    public class b implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadListener f1791a;

        public b(AREngineManager aREngineManager, DownloadListener downloadListener) {
            this.f1791a = downloadListener;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i8, int i9) {
            DownloadListener downloadListener = this.f1791a;
            if (downloadListener != null) {
                if (i8 == 0) {
                    downloadListener.onDownloadStart(true);
                } else {
                    downloadListener.onDownloadProcess((int) ((i8 / i9) * 100.0f));
                }
            }
        }
    }

    public class c implements ICallbackWith<IDuMixResLoadTask> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadListener f1792a;

        public c(AREngineManager aREngineManager, DownloadListener downloadListener) {
            this.f1792a = downloadListener;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(IDuMixResLoadTask iDuMixResLoadTask) {
            DownloadListener downloadListener = this.f1792a;
            if (downloadListener != null) {
                downloadListener.onDownloadError(MarkerErrorCode.ERROR_DOWNLOAD_SO, iDuMixResLoadTask.getError());
            }
        }
    }

    public static AREngineManager getInstance() {
        if (f1785e == null) {
            synchronized (AREngineManager.class) {
                try {
                    if (f1785e == null) {
                        synchronized (AREngineManager.class) {
                            f1785e = new AREngineManager();
                        }
                    }
                } finally {
                }
            }
        }
        return f1785e;
    }

    public final boolean a(Context context) {
        if (!ab.a("com.baidu.ar.remoteres.RemoteResLoader", context.getClassLoader())) {
            return true;
        }
        File file = new File(this.f1789d, "libdumixar-engine.so");
        return file.exists() && file.length() > 0;
    }

    public void download(DownloadListener downloadListener) {
        v5 v5Var = this.f1787b;
        if (v5Var != null) {
            v5Var.prepareEglCore(new a(this, downloadListener), new b(this, downloadListener), new c(this, downloadListener));
        } else if (downloadListener != null) {
            downloadListener.onDownloadComplete(true);
        }
    }

    public boolean engineFileExists(Context context) {
        if (context == null) {
            return false;
        }
        return a(context);
    }

    public void loadEngineSo() {
        if (this.f1788c == null) {
            OnEngineSoLoadedListener onEngineSoLoadedListener = this.f1786a;
            if (onEngineSoLoadedListener != null) {
                onEngineSoLoadedListener.onLoadedError(new Throwable("context is null !!!"));
                return;
            }
            return;
        }
        com.baidu.ar.libloader.a.a(new com.baidu.ar.libloader.c(this.f1789d));
        try {
            com.baidu.ar.libloader.a.a("dumixar-engine");
            OnEngineSoLoadedListener onEngineSoLoadedListener2 = this.f1786a;
            if (onEngineSoLoadedListener2 != null) {
                onEngineSoLoadedListener2.onLoadedSuccess();
            }
        } catch (Throwable th) {
            th.printStackTrace();
            OnEngineSoLoadedListener onEngineSoLoadedListener3 = this.f1786a;
            if (onEngineSoLoadedListener3 != null) {
                onEngineSoLoadedListener3.onLoadedError(th);
            }
        }
    }

    public void release() {
        v5 v5Var = this.f1787b;
        if (v5Var != null) {
            v5Var.release();
            this.f1787b = null;
        }
        f1785e = null;
    }

    public void setOnEngineSoLoadedListener(OnEngineSoLoadedListener onEngineSoLoadedListener) {
        this.f1786a = onEngineSoLoadedListener;
    }

    public void setup(Context context, BusinessSoType businessSoType) {
        this.f1788c = context.getApplicationContext();
        this.f1787b = (v5) ab.a("com.baidu.ar.remoteres.EglCoreManager");
        this.f1789d = DuMixController.getSoDownLoadDir(this.f1788c);
        v5 v5Var = this.f1787b;
        if (v5Var != null) {
            v5Var.setBusinessTag(businessSoType.getBusiness());
            this.f1787b.setSoName("libdumixar-engine.so");
            this.f1787b.setup(context);
        }
    }

    public boolean soIsReady() {
        v5 v5Var;
        boolean isEngineCreated = ARPEngine.isEngineCreated();
        boolean c8 = b9.b().c();
        h.a("PanoDownloader", "isEngineCreated:" + isEngineCreated + " isDumixSDKCreated:" + c8);
        if (isEngineCreated || c8 || (v5Var = this.f1787b) == null) {
            return false;
        }
        return v5Var.isSoDownloadSuccess();
    }
}
