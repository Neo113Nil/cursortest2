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
public class EglCoreDownloader {

    /* renamed from: b, reason: collision with root package name */
    public static volatile EglCoreDownloader f1795b;

    /* renamed from: a, reason: collision with root package name */
    public v5 f1796a;

    public class a implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadListener f1797a;

        public a(EglCoreDownloader eglCoreDownloader, DownloadListener downloadListener) {
            this.f1797a = downloadListener;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            DownloadListener downloadListener = this.f1797a;
            if (downloadListener != null) {
                downloadListener.onDownloadComplete(true);
            }
        }
    }

    public class b implements IProgressCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DownloadListener f1798a;

        public b(EglCoreDownloader eglCoreDownloader, DownloadListener downloadListener) {
            this.f1798a = downloadListener;
        }

        @Override // com.baidu.ar.ihttp.IProgressCallback
        public void onProgress(int i8, int i9) {
            DownloadListener downloadListener = this.f1798a;
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
        public final /* synthetic */ DownloadListener f1799a;

        public c(EglCoreDownloader eglCoreDownloader, DownloadListener downloadListener) {
            this.f1799a = downloadListener;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(IDuMixResLoadTask iDuMixResLoadTask) {
            DownloadListener downloadListener = this.f1799a;
            if (downloadListener != null) {
                downloadListener.onDownloadError(MarkerErrorCode.ERROR_DOWNLOAD_SO, iDuMixResLoadTask.getError());
            }
        }
    }

    public EglCoreDownloader(Context context) {
        v5 v5Var = (v5) ab.a("com.baidu.ar.remoteres.EglCoreManager");
        this.f1796a = v5Var;
        if (v5Var != null) {
            v5Var.setup(context);
        }
    }

    public static EglCoreDownloader getInstance(Context context) {
        if (f1795b == null) {
            synchronized (EglCoreDownloader.class) {
                try {
                    if (f1795b == null) {
                        f1795b = new EglCoreDownloader(context);
                    }
                } finally {
                }
            }
        }
        return f1795b;
    }

    public final boolean a(Context context) {
        if (!ab.a("com.baidu.ar.remoteres.RemoteResLoader", context.getClassLoader())) {
            return true;
        }
        File file = new File(DuMixController.getSoDownLoadDir(context), "libdumixar.so");
        return file.exists() && file.length() > 0;
    }

    public void download(DownloadListener downloadListener) {
        v5 v5Var = this.f1796a;
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

    public void release() {
        v5 v5Var = this.f1796a;
        if (v5Var != null) {
            v5Var.release();
            this.f1796a = null;
        }
        f1795b = null;
    }

    public void setDownloadSoBusinessTag(BusinessSoType businessSoType) {
        v5 v5Var = this.f1796a;
        if (v5Var != null) {
            v5Var.setBusinessTag(businessSoType.getBusiness());
        }
    }

    public boolean soIsReady() {
        v5 v5Var;
        boolean isEngineCreated = ARPEngine.isEngineCreated();
        boolean c8 = b9.b().c();
        h.a("EglCoreDownloader", "isEngineCreated:" + isEngineCreated + " isDumixSDKCreated:" + c8);
        if (isEngineCreated || c8 || (v5Var = this.f1796a) == null) {
            return false;
        }
        return v5Var.isSoDownloadSuccess();
    }
}
