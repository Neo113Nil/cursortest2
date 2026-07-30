package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.event.DownloadServiceConnectChangedEvent;

/* loaded from: classes4.dex */
public abstract class e extends com.liulishuo.filedownloader.event.d {
    private DownloadServiceConnectChangedEvent.ConnectStatus mConnectStatus;

    @Override // com.liulishuo.filedownloader.event.d
    public boolean callback(com.liulishuo.filedownloader.event.b bVar) {
        if (!(bVar instanceof DownloadServiceConnectChangedEvent)) {
            return false;
        }
        DownloadServiceConnectChangedEvent.ConnectStatus status = ((DownloadServiceConnectChangedEvent) bVar).getStatus();
        this.mConnectStatus = status;
        if (status == DownloadServiceConnectChangedEvent.ConnectStatus.connected) {
            connected();
            return false;
        }
        disconnected();
        return false;
    }

    public abstract void connected();

    public abstract void disconnected();

    public DownloadServiceConnectChangedEvent.ConnectStatus getConnectStatus() {
        return this.mConnectStatus;
    }
}
