package com.baidu.ar;

import com.baidu.ar.bean.ARCaseBundleInfo;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.callback.IError;
import com.baidu.ar.content.ARResourceInfo;
import com.baidu.ar.content.ARResourceManager;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.ihttp.Downloader;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.io.IOException;

/* loaded from: classes.dex */
public class z1 extends e0<ARResourceInfo, IARCaseInfo> {

    /* renamed from: i, reason: collision with root package name */
    public ARResourceManager f3789i;

    /* renamed from: j, reason: collision with root package name */
    public x1 f3790j;

    public z1(ARResourceManager aRResourceManager, x1 x1Var) {
        this.f3789i = aRResourceManager;
        this.f3790j = x1Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baidu.ar.e0
    public void a(ARResourceInfo aRResourceInfo, ICallbackWith<IARCaseInfo> iCallbackWith, IError iError) {
        if (this.f3790j == null) {
            return;
        }
        String[] strArr = aRResourceInfo.multiResourceUrl;
        if (strArr == null || strArr.length == 0) {
            iError.onError(104, "resource url is not exists", null);
            return;
        }
        try {
            int fileSize = new Downloader(strArr[0]).getFileSize();
            if (a(aRResourceInfo, fileSize, iCallbackWith)) {
                this.f3790j.a(aRResourceInfo.arKey, false, 0.0f);
            } else {
                this.f3790j.a(aRResourceInfo.arKey, true, fileSize);
            }
        } catch (HttpException e8) {
            iError.onError(104, e8.getMessage(), e8);
        }
    }

    @Override // com.baidu.ar.e0
    public void b() {
    }

    public boolean a(ARResourceInfo aRResourceInfo, int i8, ICallbackWith<IARCaseInfo> iCallbackWith) {
        return a(aRResourceInfo, i8, true, iCallbackWith);
    }

    public boolean a(ARResourceInfo aRResourceInfo, int i8, boolean z7, ICallbackWith<IARCaseInfo> iCallbackWith) {
        if (!this.f3789i.hasValidResource(aRResourceInfo, i8)) {
            return false;
        }
        if (z7) {
            try {
                this.f3789i.unzipResource(aRResourceInfo);
            } catch (IOException unused) {
                StatisticApi.onEvent(StatisticConstants.FIRST_LOAD_FILE_MANAGE_FAILURE);
                return false;
            }
        }
        ARCaseBundleInfo aRCaseBundleInfo = new ARCaseBundleInfo();
        aRCaseBundleInfo.arKey = aRResourceInfo.arKey;
        aRCaseBundleInfo.arType = ARType.valueOf(aRResourceInfo.arType);
        aRCaseBundleInfo.caseDir = this.f3789i.getCaseResourceDirPath(aRResourceInfo);
        aRResourceInfo.caseBundleInfo = aRCaseBundleInfo;
        StatisticApi.onEvent(StatisticConstants.FIRST_LOAD_FILE_MANAGE_SUCCESS);
        iCallbackWith.run(aRResourceInfo);
        return true;
    }
}
