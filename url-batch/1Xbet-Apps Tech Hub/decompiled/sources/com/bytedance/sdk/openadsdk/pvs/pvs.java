package com.bytedance.sdk.openadsdk.pvs;

import com.bytedance.sdk.component.utils.sUS;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: LruDiskFile.java */
/* loaded from: classes2.dex */
public abstract class pvs {
    private final ExecutorService pvs = Executors.newSingleThreadExecutor();

    protected abstract void pvs(List<File> list);

    protected abstract boolean pvs(long j, int i);

    protected abstract boolean pvs(File file, long j, int i);

    public void pvs(File file) throws IOException {
        this.pvs.submit(new CallableC0093pvs(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(File file) throws IOException {
        try {
            sUS.icD(file);
        } catch (Throwable unused) {
        }
        pvs(sUS.pvs(file.getParentFile()));
    }

    long icD(List<File> list) {
        Iterator<File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().length();
        }
        return j;
    }

    /* compiled from: LruDiskFile.java */
    /* renamed from: com.bytedance.sdk.openadsdk.pvs.pvs$pvs, reason: collision with other inner class name */
    private class CallableC0093pvs implements Callable<Void> {
        private final File icD;

        private CallableC0093pvs(File file) {
            this.icD = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            pvs.this.icD(this.icD);
            return null;
        }
    }
}
