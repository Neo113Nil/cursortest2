package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.model.FileDownloadModel;

/* loaded from: classes4.dex */
public interface a0 {
    int findRunningTaskIdBySameTempPath(String str, int i8);

    boolean isDownloading(FileDownloadModel fileDownloadModel);
}
