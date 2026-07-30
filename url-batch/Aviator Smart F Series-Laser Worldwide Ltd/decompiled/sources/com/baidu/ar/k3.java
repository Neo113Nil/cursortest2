package com.baidu.ar;

import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.content.ARResourceInfo;
import com.baidu.ar.content.ARResourceManager;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.ihttp.Downloader;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IProgressCallback;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;

/* loaded from: classes.dex */
public class k3 extends z1 {

    /* renamed from: k, reason: collision with root package name */
    public IProgressCallback f2642k;

    public k3(ARResourceManager aRResourceManager, IProgressCallback iProgressCallback) {
        super(aRResourceManager, null);
        this.f2642k = iProgressCallback;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baidu.ar.z1, com.baidu.ar.e0
    public void a(ARResourceInfo aRResourceInfo, ICallbackWith<IARCaseInfo> iCallbackWith, IError iError) {
        String[] strArr = aRResourceInfo.multiResourceUrl;
        if (strArr == null || strArr.length == 0) {
            iError.onError(102, "resource url is not exists", null);
            return;
        }
        Downloader downloader = new Downloader(strArr[0]);
        try {
            int fileSize = downloader.getFileSize();
            h.c("DownloadARResourceHandler", "check new version case begin");
            boolean a8 = a(aRResourceInfo, fileSize, false, iCallbackWith);
            h.c("DownloadARResourceHandler", "check new version case: hasValid:" + a8);
            if (a8) {
                return;
            }
            String caseMainZipFile = this.f3789i.getCaseMainZipFile(aRResourceInfo);
            h.c("DownloadARResourceHandler", "start downloading new version case: versionCode=" + aRResourceInfo.versionCode);
            try {
                downloader.download(caseMainZipFile, this.f2642k);
                StatisticApi.onEvent(StatisticConstants.LOAD_DOWNLOAD_SUCCESS);
                if (a(aRResourceInfo, fileSize, iCallbackWith)) {
                    return;
                }
                iError.onError(102, "unzip fail", null);
            } catch (Exception e8) {
                StatisticApi.onEvent(StatisticConstants.LOAD_DOWNLOAD_FAILURE);
                iError.onError(102, e8.getMessage(), e8);
            }
        } catch (HttpException e9) {
            iError.onError(102, e9.getMessage(), e9);
        }
    }

    @Override // com.baidu.ar.z1, com.baidu.ar.e0
    public void b() {
    }
}
