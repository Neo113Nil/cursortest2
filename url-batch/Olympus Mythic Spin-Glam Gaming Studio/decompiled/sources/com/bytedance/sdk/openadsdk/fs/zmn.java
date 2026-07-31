package com.bytedance.sdk.openadsdk.fs;

import com.bytedance.sdk.component.utils.nps;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes13.dex */
public abstract class zmn {
    protected boolean zmn = false;
    private final ExecutorService fs = Executors.newSingleThreadExecutor();

    protected abstract void zmn(List<File> list);

    protected abstract boolean zmn(long j, int i);

    protected abstract boolean zmn(File file, long j, int i);

    public void zmn(File file) throws IOException {
        this.fs.submit(new CallableC0196zmn(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(File file) throws IOException {
        if (this.zmn) {
            List<File> zmn = nps.zmn(file);
            zmn.toString();
            zmn(zmn);
        } else {
            try {
                nps.fs(file);
            } catch (Throwable unused) {
            }
            zmn(nps.zmn(file.getParentFile()));
        }
    }

    long fs(List<File> list) {
        Iterator<File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().length();
        }
        return j;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.fs.zmn$zmn, reason: collision with other inner class name */
    private class CallableC0196zmn implements Callable<Void> {
        private final File fs;

        private CallableC0196zmn(File file) {
            this.fs = file;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            zmn.this.fs(this.fs);
            return null;
        }
    }
}
