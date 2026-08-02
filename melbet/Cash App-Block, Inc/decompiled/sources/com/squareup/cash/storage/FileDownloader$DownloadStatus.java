package com.squareup.cash.storage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FileDownloader$DownloadStatus {
    public static final /* synthetic */ FileDownloader$DownloadStatus[] $VALUES;
    public static final FileDownloader$DownloadStatus RETRY;
    public static final FileDownloader$DownloadStatus SUCCESS;

    static {
        FileDownloader$DownloadStatus fileDownloader$DownloadStatus = new FileDownloader$DownloadStatus("SUCCESS", 0);
        SUCCESS = fileDownloader$DownloadStatus;
        FileDownloader$DownloadStatus fileDownloader$DownloadStatus2 = new FileDownloader$DownloadStatus("FAILURE", 1);
        FileDownloader$DownloadStatus fileDownloader$DownloadStatus3 = new FileDownloader$DownloadStatus("RETRY", 2);
        RETRY = fileDownloader$DownloadStatus3;
        $VALUES = new FileDownloader$DownloadStatus[]{fileDownloader$DownloadStatus, fileDownloader$DownloadStatus2, fileDownloader$DownloadStatus3};
    }

    public static FileDownloader$DownloadStatus valueOf(String str) {
        return (FileDownloader$DownloadStatus) Enum.valueOf(FileDownloader$DownloadStatus.class, str);
    }

    public static FileDownloader$DownloadStatus[] values() {
        return (FileDownloader$DownloadStatus[]) $VALUES.clone();
    }
}
