package io.opentelemetry.contrib.disk.buffering.internal.storage.files.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public class FileStream extends InputStream {
    private final FileChannel channel;
    private final RandomAccessFile file;

    public static FileStream create(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        FileChannel channel = randomAccessFile.getChannel();
        channel.force(false);
        return new FileStream(randomAccessFile, channel);
    }

    private FileStream(RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        this.file = randomAccessFile;
        this.channel = fileChannel;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.file.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return this.file.read(bArr);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.file.read(bArr, i, i2);
    }

    public long size() throws IOException {
        return this.channel.size();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
        this.file.close();
    }

    public void truncateTop(long j) throws IOException {
        this.file.seek(Math.min(size(), j));
        truncateTop();
    }

    public void truncateTop() throws IOException {
        long filePointer = this.file.getFilePointer();
        if (filePointer == 0) {
            return;
        }
        long size = size() - filePointer;
        if (size > 0) {
            byte[] bArr = new byte[(int) size];
            this.file.read(bArr);
            this.file.seek(0L);
            this.channel.truncate(size);
            this.file.write(bArr);
            this.file.seek(0L);
            return;
        }
        this.channel.truncate(0L);
    }

    public long getPosition() throws IOException {
        return this.file.getFilePointer();
    }
}
