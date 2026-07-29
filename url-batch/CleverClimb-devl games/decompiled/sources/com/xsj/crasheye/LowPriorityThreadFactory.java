package com.xsj.crasheye;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
class LowPriorityThreadFactory implements ThreadFactory {
    LowPriorityThreadFactory() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }
}
