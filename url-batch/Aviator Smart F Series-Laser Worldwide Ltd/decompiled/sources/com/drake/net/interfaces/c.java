package com.drake.net.interfaces;

import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class c {
    private long elapsedTime;
    private long interval;
    private long intervalByteCount;

    public c() {
        this(0L, 1, null);
    }

    public final long getElapsedTime() {
        return this.elapsedTime;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final long getIntervalByteCount() {
        return this.intervalByteCount;
    }

    public abstract void onProgress(p4.a aVar);

    public final void setElapsedTime(long j8) {
        this.elapsedTime = j8;
    }

    public final void setInterval(long j8) {
        this.interval = j8;
    }

    public final void setIntervalByteCount(long j8) {
        this.intervalByteCount = j8;
    }

    public c(long j8) {
        this.interval = j8;
    }

    public /* synthetic */ c(long j8, int i8, o oVar) {
        this((i8 & 1) != 0 ? 500L : j8);
    }
}
