package okio;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class Pipe {
    public final Buffer buffer = new Buffer();
    public final Condition condition;
    public BufferedSink foldedSink;
    public final ReentrantLock lock;
    public final Pipe$sink$1 sink;
    public boolean sinkClosed;
    public boolean sourceClosed;

    public Pipe() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        this.condition = newCondition;
        this.sink = new Pipe$sink$1(this);
    }
}
