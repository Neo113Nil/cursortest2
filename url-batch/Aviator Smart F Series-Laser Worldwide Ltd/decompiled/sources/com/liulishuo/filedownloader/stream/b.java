package com.liulishuo.filedownloader.stream;

import com.liulishuo.filedownloader.util.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/* loaded from: classes4.dex */
public class b implements com.liulishuo.filedownloader.stream.a {
    private final FileDescriptor fd;
    private final BufferedOutputStream out;
    private final RandomAccessFile randomAccess;

    public static class a implements c.e {
        @Override // com.liulishuo.filedownloader.util.c.e
        public com.liulishuo.filedownloader.stream.a create(File file) {
            return new b(file);
        }

        @Override // com.liulishuo.filedownloader.util.c.e
        public boolean supportSeek() {
            return true;
        }
    }

    b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.randomAccess = randomAccessFile;
        this.fd = randomAccessFile.getFD();
        this.out = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.liulishuo.filedownloader.stream.a
    public void close() {
        this.out.close();
        this.randomAccess.close();
    }

    @Override // com.liulishuo.filedownloader.stream.a
    public void flushAndSync() {
        this.out.flush();
        this.fd.sync();
    }

    @Override // com.liulishuo.filedownloader.stream.a
    public void seek(long j8) {
        this.randomAccess.seek(j8);
    }

    @Override // com.liulishuo.filedownloader.stream.a
    public void setLength(long j8) {
        this.randomAccess.setLength(j8);
    }

    @Override // com.liulishuo.filedownloader.stream.a
    public void write(byte[] bArr, int i8, int i9) {
        this.out.write(bArr, i8, i9);
    }
}
