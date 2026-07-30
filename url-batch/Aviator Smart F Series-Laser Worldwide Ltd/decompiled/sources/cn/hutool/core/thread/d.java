package cn.hutool.core.thread;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class d extends c {
    d(ExecutorService executorService) {
        super(executorService);
    }

    protected void finalize() {
        super.shutdown();
    }
}
