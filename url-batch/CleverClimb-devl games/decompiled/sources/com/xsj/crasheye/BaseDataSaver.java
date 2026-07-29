package com.xsj.crasheye;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class BaseDataSaver extends BaseExecutor implements InterfaceExecutor {
    public synchronized void save(String str) {
    }

    public ExecutorService getExecutor() {
        if (executor == null) {
            executor = Executors.newFixedThreadPool(1);
        }
        return executor;
    }
}
