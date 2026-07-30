package com.liulishuo.filedownloader;

/* loaded from: classes4.dex */
public abstract class g extends k {
    public g() {
    }

    @Override // com.liulishuo.filedownloader.k
    protected void connected(a aVar, String str, boolean z7, int i8, int i9) {
    }

    @Override // com.liulishuo.filedownloader.k
    protected void paused(a aVar, int i8, int i9) {
    }

    protected abstract void paused(a aVar, long j8, long j9);

    @Override // com.liulishuo.filedownloader.k
    protected void pending(a aVar, int i8, int i9) {
    }

    protected abstract void pending(a aVar, long j8, long j9);

    @Override // com.liulishuo.filedownloader.k
    protected void progress(a aVar, int i8, int i9) {
    }

    protected abstract void progress(a aVar, long j8, long j9);

    @Override // com.liulishuo.filedownloader.k
    protected void retry(a aVar, Throwable th, int i8, int i9) {
    }

    public g(int i8) {
        super(i8);
    }

    protected void connected(a aVar, String str, boolean z7, long j8, long j9) {
    }

    protected void retry(a aVar, Throwable th, int i8, long j8) {
    }
}
