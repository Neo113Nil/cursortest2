package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.ar.baidumap.CaseStateListener;

/* loaded from: classes.dex */
public class ARResourceDownloader {

    /* renamed from: a, reason: collision with root package name */
    public com.baidu.ar.baidumap.a f1452a;
    public OnARResourceDownloadListener onARResourceDownloadListener;

    public class a implements CaseStateListener {

        /* renamed from: a, reason: collision with root package name */
        public ARResourceDownloader f1453a;

        public a(ARResourceDownloader aRResourceDownloader, ARResourceDownloader aRResourceDownloader2) {
            this.f1453a = aRResourceDownloader2;
        }

        @Override // com.baidu.ar.baidumap.CaseStateListener
        public void onCaseCreated(boolean z7, String str, String str2) {
        }

        @Override // com.baidu.ar.baidumap.CaseStateListener
        public void onCaseDestroy() {
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onDownloadFinish(boolean z7, String str, String str2, int i8, String str3) {
            h.b("onDownloadFinish:" + z7);
            ARResourceDownloader aRResourceDownloader = this.f1453a;
            if (aRResourceDownloader != null) {
                aRResourceDownloader.a(z7);
            }
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onDownloadProgress(int i8, String str) {
            h.b("onDownloadProgress:" + i8);
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onRefused() {
        }
    }

    public ARResourceDownloader(Context context) {
        if (this.f1452a == null) {
            this.f1452a = new com.baidu.ar.baidumap.a(context);
        }
        this.f1452a.a(new a(this, this));
    }

    public void downloadARResource(String str) {
        if (this.f1452a == null || TextUtils.isEmpty(str)) {
            return;
        }
        h.a("ARResourceDownloader::downloadARResource");
    }

    public void release() {
        if (this.f1452a != null) {
            h.a("ARResourceDownloader::release");
        }
    }

    public void setOnARResourceDownloadListener(OnARResourceDownloadListener onARResourceDownloadListener) {
        this.onARResourceDownloadListener = onARResourceDownloadListener;
    }

    public final void a(boolean z7) {
        OnARResourceDownloadListener onARResourceDownloadListener = this.onARResourceDownloadListener;
        if (onARResourceDownloadListener != null) {
            onARResourceDownloadListener.onDownloadResult(z7);
        }
    }
}
