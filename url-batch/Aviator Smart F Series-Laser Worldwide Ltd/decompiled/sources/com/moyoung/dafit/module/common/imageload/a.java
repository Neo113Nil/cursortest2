package com.moyoung.dafit.module.common.imageload;

import com.liulishuo.filedownloader.k;
import com.liulishuo.filedownloader.s;
import com.moyoung.dafit.module.common.utils.a0;
import com.orhanobut.logger.f;
import java.io.File;

/* loaded from: classes4.dex */
public class a {
    public static final int AUTO_RETRY_TIMES = 5;
    private final k downloadListener = new C0300a();

    /* renamed from: com.moyoung.dafit.module.common.imageload.a$a, reason: collision with other inner class name */
    class C0300a extends k {
        C0300a() {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void completed(com.liulishuo.filedownloader.a aVar) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void error(com.liulishuo.filedownloader.a aVar, Throwable th) {
            th.printStackTrace();
        }

        @Override // com.liulishuo.filedownloader.k
        protected void paused(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void pending(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void progress(com.liulishuo.filedownloader.a aVar, int i8, int i9) {
        }

        @Override // com.liulishuo.filedownloader.k
        protected void warn(com.liulishuo.filedownloader.a aVar) {
        }
    }

    public boolean donwloadFile(String str, String str2) {
        return donwloadFile(str, str2, this.downloadListener);
    }

    public boolean donwloadFile(String str, String str2, k kVar) {
        if (!a0.isNetworkConnected(com.moyoung.dafit.module.common.utils.d.get())) {
            return false;
        }
        File file = new File(str2);
        if (file.exists()) {
            return false;
        }
        f.d("url: " + str);
        s fileDownloader = b.getInstance().getFileDownloader();
        fileDownloader.create(str).setPath(file.getPath()).setListener(kVar).setAutoRetryTimes(5).asInQueueTask().enqueue();
        return fileDownloader.start(kVar, true);
    }
}
