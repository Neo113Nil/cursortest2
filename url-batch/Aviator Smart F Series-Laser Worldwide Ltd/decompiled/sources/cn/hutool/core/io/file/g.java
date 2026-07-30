package cn.hutool.core.io.file;

import cn.hutool.core.io.IORuntimeException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.WatchEvent;

/* loaded from: classes.dex */
public class g extends cn.hutool.core.io.watch.a implements Runnable {
    private final Charset charset;
    private final cn.hutool.core.io.p lineHandler;
    private final RandomAccessFile randomAccessFile;

    public g(RandomAccessFile randomAccessFile, Charset charset, cn.hutool.core.io.p pVar) {
        this.randomAccessFile = randomAccessFile;
        this.charset = charset;
        this.lineHandler = pVar;
    }

    @Override // l.a, cn.hutool.core.io.watch.u
    public void onModify(WatchEvent<?> watchEvent, Path path) {
        RandomAccessFile randomAccessFile = this.randomAccessFile;
        Charset charset = this.charset;
        cn.hutool.core.io.p pVar = this.lineHandler;
        try {
            long length = randomAccessFile.length();
            long filePointer = randomAccessFile.getFilePointer();
            if (filePointer == length) {
                return;
            }
            if (length < filePointer) {
                randomAccessFile.seek(length);
            } else {
                cn.hutool.core.io.l.readLines(randomAccessFile, charset, pVar);
                randomAccessFile.seek(length);
            }
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        onModify(null, null);
    }
}
