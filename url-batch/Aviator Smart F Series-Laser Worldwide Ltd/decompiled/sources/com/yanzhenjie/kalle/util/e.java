package com.yanzhenjie.kalle.util;

import com.yanzhenjie.kalle.n;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class e extends OutputStream {
    private long mContentLength;
    private int mOldProgress;
    private com.yanzhenjie.kalle.f mOrigin;
    private n mProgressBar;
    private long mWriteCount;
    private OutputStream mWriter;

    public e(OutputStream outputStream, com.yanzhenjie.kalle.f fVar, n nVar) {
        this.mWriter = outputStream;
        this.mOrigin = fVar;
        this.mProgressBar = nVar;
        this.mContentLength = fVar.contentLength();
    }

    private void calcProgress() {
        int i8;
        long j8 = this.mContentLength;
        if (j8 <= 0 || (i8 = (int) ((this.mWriteCount * 100) / j8)) <= this.mOldProgress || i8 % 2 != 0) {
            return;
        }
        this.mOldProgress = i8;
        this.mProgressBar.progress(this.mOrigin, i8);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mWriter.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.mWriter.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i8) {
        this.mWriter.write(i8);
        this.mWriteCount++;
        calcProgress();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.mWriter.write(bArr);
        this.mWriteCount += bArr.length;
        calcProgress();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i8, int i9) {
        this.mWriter.write(bArr, i8, i9);
        this.mWriteCount += i9;
        calcProgress();
    }
}
