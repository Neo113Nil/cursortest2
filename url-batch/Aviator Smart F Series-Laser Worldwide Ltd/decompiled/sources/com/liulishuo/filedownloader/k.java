package com.liulishuo.filedownloader;

/* loaded from: classes4.dex */
public abstract class k {
    public k() {
    }

    protected void blockComplete(a aVar) {
    }

    protected abstract void completed(a aVar);

    protected void connected(a aVar, String str, boolean z7, int i8, int i9) {
    }

    protected abstract void error(a aVar, Throwable th);

    protected boolean isInvalid() {
        return false;
    }

    protected abstract void paused(a aVar, int i8, int i9);

    protected abstract void pending(a aVar, int i8, int i9);

    protected abstract void progress(a aVar, int i8, int i9);

    protected void retry(a aVar, Throwable th, int i8, int i9) {
    }

    protected void started(a aVar) {
    }

    protected abstract void warn(a aVar);

    public k(int i8) {
        com.liulishuo.filedownloader.util.d.w(this, "not handle priority any more", new Object[0]);
    }
}
