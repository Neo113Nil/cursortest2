package com.liulishuo.filedownloader;

import java.util.List;

/* loaded from: classes4.dex */
public interface y {
    boolean contain(int i8);

    void freezeAllSerialQueues();

    int serialQueueSize();

    boolean startQueueParallel(k kVar);

    boolean startQueueSerial(k kVar);

    void unFreezeSerialQueues(List<Integer> list);
}
