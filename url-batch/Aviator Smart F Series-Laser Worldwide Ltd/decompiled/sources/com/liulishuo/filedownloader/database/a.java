package com.liulishuo.filedownloader.database;

import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.List;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.liulishuo.filedownloader.database.a$a, reason: collision with other inner class name */
    public interface InterfaceC0290a extends Iterable {
        void changeFileDownloadModelId(int i8, FileDownloadModel fileDownloadModel);

        void onFinishMaintain();

        void onRefreshedValidData(FileDownloadModel fileDownloadModel);

        void onRemovedInvalidData(FileDownloadModel fileDownloadModel);
    }

    void clear();

    FileDownloadModel find(int i8);

    List<com.liulishuo.filedownloader.model.a> findConnectionModel(int i8);

    void insert(FileDownloadModel fileDownloadModel);

    void insertConnectionModel(com.liulishuo.filedownloader.model.a aVar);

    InterfaceC0290a maintainer();

    void onTaskStart(int i8);

    boolean remove(int i8);

    void removeConnections(int i8);

    void update(FileDownloadModel fileDownloadModel);

    void updateCompleted(int i8, long j8);

    void updateConnected(int i8, long j8, String str, String str2);

    void updateConnectionCount(int i8, int i9);

    void updateConnectionModel(int i8, int i9, long j8);

    void updateError(int i8, Throwable th, long j8);

    void updateOldEtagOverdue(int i8, String str, long j8, long j9, int i9);

    void updatePause(int i8, long j8);

    void updatePending(int i8);

    void updateProgress(int i8, long j8);

    void updateRetry(int i8, Throwable th);
}
