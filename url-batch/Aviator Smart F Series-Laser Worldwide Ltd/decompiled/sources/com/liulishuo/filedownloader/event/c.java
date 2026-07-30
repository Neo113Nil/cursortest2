package com.liulishuo.filedownloader.event;

/* loaded from: classes4.dex */
interface c {
    boolean addListener(String str, d dVar);

    void asyncPublishInNewThread(b bVar);

    boolean publish(b bVar);

    boolean removeListener(String str, d dVar);
}
