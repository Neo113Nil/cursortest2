package cn.hutool.core.io.copy;

import cn.hutool.core.io.s;

/* loaded from: classes.dex */
public abstract class b {
    protected final int bufferSize;
    protected final long count;
    protected boolean flushEveryBuffer;
    protected s progress;

    public b(int i8, long j8, s sVar) {
        this.bufferSize = i8 <= 0 ? 8192 : i8;
        this.count = j8 <= 0 ? Long.MAX_VALUE : j8;
    }

    protected int bufferSize(long j8) {
        return (int) Math.min(this.bufferSize, j8);
    }

    public abstract long copy(Object obj, Object obj2);

    public b setFlushEveryBuffer(boolean z7) {
        this.flushEveryBuffer = z7;
        return this;
    }
}
