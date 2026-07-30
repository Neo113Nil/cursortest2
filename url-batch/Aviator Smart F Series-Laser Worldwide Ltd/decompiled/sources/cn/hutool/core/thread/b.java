package cn.hutool.core.thread;

import cn.hutool.core.date.TimeInterval;
import java.io.Closeable;

/* loaded from: classes.dex */
public class b implements Closeable {
    private long interval;
    private final g sf;
    private final TimeInterval timeInterval = new TimeInterval();

    public b(int i8) {
        this.sf = new g(i8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.sf.close();
    }

    public long getInterval() {
        return this.interval;
    }

    public b reset() {
        this.sf.clearWorker();
        this.timeInterval.restart();
        return this;
    }

    public b test(Runnable runnable) {
        this.sf.clearWorker();
        this.timeInterval.start();
        this.sf.addRepeatWorker(runnable).setBeginAtSameTime(true).start();
        this.interval = this.timeInterval.interval();
        return this;
    }
}
