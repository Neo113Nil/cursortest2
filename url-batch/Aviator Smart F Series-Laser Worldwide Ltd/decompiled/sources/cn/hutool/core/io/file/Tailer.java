package cn.hutool.core.io.file;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.watch.WatchKind;
import cn.hutool.core.io.watch.WatchMonitor;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.util.Stack;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Tailer implements Serializable {
    public static final cn.hutool.core.io.p CONSOLE_HANDLER = new b();
    private static final long serialVersionUID = 1;
    private final Charset charset;
    private final ScheduledExecutorService executorService;
    private WatchMonitor fileDeleteWatchMonitor;
    private final String filePath;
    private final int initReadLine;
    private final cn.hutool.core.io.p lineHandler;
    private final long period;
    private final RandomAccessFile randomAccessFile;
    private boolean stopOnDelete;

    class a extends cn.hutool.core.io.watch.a {
        a() {
        }

        @Override // l.a, cn.hutool.core.io.watch.u
        public void onDelete(WatchEvent<?> watchEvent, Path path) {
            super.onDelete(watchEvent, path);
            Tailer.this.stop();
            throw new IORuntimeException("{} has been deleted", Tailer.this.filePath);
        }
    }

    public static class b implements cn.hutool.core.io.p {
        @Override // cn.hutool.core.io.p
        public void handle(String str) {
            cn.hutool.core.lang.w.log(str);
        }
    }

    public Tailer(File file, cn.hutool.core.io.p pVar) {
        this(file, pVar, 0);
    }

    private static void checkFile(File file) {
        if (!file.exists()) {
            throw new UtilException("File [{}] not exist !", file.getAbsolutePath());
        }
        if (!file.isFile()) {
            throw new UtilException("Path [{}] is not a file !", file.getAbsolutePath());
        }
    }

    private void readTail() {
        long length = this.randomAccessFile.length();
        if (this.initReadLine > 0) {
            Stack stack = new Stack();
            long filePointer = this.randomAccessFile.getFilePointer();
            long j8 = length - 1;
            if (j8 < 0) {
                j8 = 0;
            }
            this.randomAccessFile.seek(j8);
            int i8 = 0;
            while (true) {
                if (j8 <= filePointer || i8 > this.initReadLine) {
                    break;
                }
                int read = this.randomAccessFile.read();
                if (read == 10 || read == 13) {
                    String readLine = cn.hutool.core.io.l.readLine(this.randomAccessFile, this.charset);
                    if (readLine != null) {
                        stack.push(readLine);
                    }
                    i8++;
                    j8--;
                }
                j8--;
                this.randomAccessFile.seek(j8);
                if (j8 == 0) {
                    String readLine2 = cn.hutool.core.io.l.readLine(this.randomAccessFile, this.charset);
                    if (readLine2 != null) {
                        stack.push(readLine2);
                    }
                }
            }
            while (!stack.isEmpty()) {
                this.lineHandler.handle((String) stack.pop());
            }
        }
        try {
            this.randomAccessFile.seek(length);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public void setStopOnDelete(boolean z7) {
        this.stopOnDelete = z7;
    }

    public void start() {
        start(false);
    }

    public void stop() {
        try {
            this.executorService.shutdown();
        } finally {
            cn.hutool.core.io.n.close((Closeable) this.randomAccessFile);
            cn.hutool.core.io.n.close((Closeable) this.fileDeleteWatchMonitor);
        }
    }

    public Tailer(File file, cn.hutool.core.io.p pVar, int i8) {
        this(file, cn.hutool.core.util.l.CHARSET_UTF_8, pVar, i8, DateUnit.SECOND.getMillis());
    }

    public void start(boolean z7) {
        try {
            readTail();
            ScheduledFuture<?> scheduleAtFixedRate = this.executorService.scheduleAtFixedRate(new g(this.randomAccessFile, this.charset, this.lineHandler), 0L, this.period, TimeUnit.MILLISECONDS);
            if (this.stopOnDelete) {
                WatchMonitor create = WatchMonitor.create(this.filePath, (WatchEvent.Kind<?>[]) new WatchEvent.Kind[]{WatchKind.DELETE.getValue()});
                this.fileDeleteWatchMonitor = create;
                create.setWatcher(new a());
                this.fileDeleteWatchMonitor.start();
            }
            if (z7) {
                return;
            }
            try {
                scheduleAtFixedRate.get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e8) {
                throw new UtilException(e8);
            }
        } catch (IOException e9) {
            throw new IORuntimeException(e9);
        }
    }

    public Tailer(File file, Charset charset, cn.hutool.core.io.p pVar) {
        this(file, charset, pVar, 0, DateUnit.SECOND.getMillis());
    }

    public Tailer(File file, Charset charset, cn.hutool.core.io.p pVar, int i8, long j8) {
        checkFile(file);
        this.charset = charset;
        this.lineHandler = pVar;
        this.period = j8;
        this.initReadLine = i8;
        this.randomAccessFile = cn.hutool.core.io.l.createRandomAccessFile(file, FileMode.r);
        this.executorService = Executors.newSingleThreadScheduledExecutor();
        this.filePath = file.getAbsolutePath();
    }
}
