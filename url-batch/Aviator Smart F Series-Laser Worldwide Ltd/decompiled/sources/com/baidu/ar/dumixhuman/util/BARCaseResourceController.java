package com.baidu.ar.dumixhuman.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.baidu.ar.dumixhuman.util.casedownload.OnCaseDownloadListener;
import com.baidu.ar.h;
import com.baidu.ar.j4;
import com.baidu.ar.t1;
import com.baidu.ar.v1;
import java.io.File;

/* loaded from: classes.dex */
public class BARCaseResourceController {

    /* renamed from: b, reason: collision with root package name */
    public static BARCaseResourceController f2103b;

    /* renamed from: a, reason: collision with root package name */
    public v1 f2104a;
    public OnCaseDownloadListener onCaseDownloadListener;

    public class a implements t1 {

        /* renamed from: a, reason: collision with root package name */
        public BARCaseResourceController f2105a;

        public a(BARCaseResourceController bARCaseResourceController, BARCaseResourceController bARCaseResourceController2) {
            this.f2105a = bARCaseResourceController2;
        }

        @Override // com.baidu.ar.t1
        public void onDownloadFinish(boolean z7, String str, String str2, int i8, String str3) {
            h.b("onDownloadFinish:" + z7);
            BARCaseResourceController bARCaseResourceController = this.f2105a;
            if (bARCaseResourceController != null) {
                bARCaseResourceController.a(z7);
            }
        }

        @Override // com.baidu.ar.t1
        public void onDownloadProgress(int i8, String str) {
            BARCaseResourceController bARCaseResourceController = this.f2105a;
            if (bARCaseResourceController != null) {
                bARCaseResourceController.a(i8);
            }
        }

        @Override // com.baidu.ar.t1
        public void onRefused() {
        }
    }

    public BARCaseResourceController(Context context) {
        if (this.f2104a == null) {
            this.f2104a = new v1(context);
        }
        this.f2104a.a(new a(this, this));
    }

    public static synchronized BARCaseResourceController getInstance(Context context) {
        BARCaseResourceController bARCaseResourceController;
        synchronized (BARCaseResourceController.class) {
            try {
                if (f2103b == null) {
                    f2103b = new BARCaseResourceController(context);
                }
                bARCaseResourceController = f2103b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bARCaseResourceController;
    }

    public final void a(int i8) {
        OnCaseDownloadListener onCaseDownloadListener = this.onCaseDownloadListener;
        if (onCaseDownloadListener != null) {
            onCaseDownloadListener.onDownloadProgress(i8);
        }
    }

    public void cancelAllDownLoadArCase() {
        v1 v1Var = this.f2104a;
        if (v1Var != null) {
            v1Var.a();
        }
    }

    public void cancelDownLoadArCase(String str) {
        if (this.f2104a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f2104a.a(str);
    }

    public void clearAllCache(Context context) {
        a(context.getCacheDir());
        if (Environment.getExternalStorageState().equals("mounted")) {
            a(context.getExternalFilesDir(""));
            a(context.getFilesDir());
        }
    }

    public void clearArKeyCache(String str) {
        if (this.f2104a == null || TextUtils.isEmpty(str)) {
            return;
        }
        a(new File(this.f2104a.c(str)));
    }

    public void downloadARCase(String str) {
        if (this.f2104a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f2104a.a(str);
        this.f2104a.b(str);
    }

    public String getCasePath(String str) {
        if (this.f2104a != null && !TextUtils.isEmpty(str)) {
            String c8 = this.f2104a.c(str);
            if (!TextUtils.isEmpty(c8) && j4.a(new File(c8))) {
                h.c("BARCaseResourceController", "getCasePath : " + c8);
                return c8;
            }
        }
        h.c("BARCaseResourceController", "getCasePath empty");
        return "";
    }

    public void release() {
        v1 v1Var = this.f2104a;
        if (v1Var != null) {
            v1Var.b();
        }
        f2103b = null;
    }

    public void setOnCaseDownloadListener(OnCaseDownloadListener onCaseDownloadListener) {
        this.onCaseDownloadListener = onCaseDownloadListener;
    }

    public final void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                a(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public final void a(boolean z7) {
        OnCaseDownloadListener onCaseDownloadListener = this.onCaseDownloadListener;
        if (onCaseDownloadListener != null) {
            onCaseDownloadListener.onDownloadResult(z7);
        }
    }
}
