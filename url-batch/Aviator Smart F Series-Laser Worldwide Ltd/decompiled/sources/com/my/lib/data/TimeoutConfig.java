package com.my.lib.data;

import androidx.collection.a;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TimeoutConfig {
    private long connectTimeout;
    private long readTimeout;
    private long writeTimeout;

    public TimeoutConfig() {
        this(0L, 0L, 0L, 7, null);
    }

    public static /* synthetic */ TimeoutConfig copy$default(TimeoutConfig timeoutConfig, long j8, long j9, long j10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = timeoutConfig.connectTimeout;
        }
        long j11 = j8;
        if ((i8 & 2) != 0) {
            j9 = timeoutConfig.readTimeout;
        }
        long j12 = j9;
        if ((i8 & 4) != 0) {
            j10 = timeoutConfig.writeTimeout;
        }
        return timeoutConfig.copy(j11, j12, j10);
    }

    public final long component1() {
        return this.connectTimeout;
    }

    public final long component2() {
        return this.readTimeout;
    }

    public final long component3() {
        return this.writeTimeout;
    }

    public final TimeoutConfig copy(long j8, long j9, long j10) {
        return new TimeoutConfig(j8, j9, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeoutConfig)) {
            return false;
        }
        TimeoutConfig timeoutConfig = (TimeoutConfig) obj;
        return this.connectTimeout == timeoutConfig.connectTimeout && this.readTimeout == timeoutConfig.readTimeout && this.writeTimeout == timeoutConfig.writeTimeout;
    }

    public final long getConnectTimeout() {
        return this.connectTimeout;
    }

    public final long getReadTimeout() {
        return this.readTimeout;
    }

    public final long getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        return a.a(this.writeTimeout) + ((a.a(this.readTimeout) + (a.a(this.connectTimeout) * 31)) * 31);
    }

    public final void setConnectTimeout(long j8) {
        this.connectTimeout = j8;
    }

    public final void setReadTimeout(long j8) {
        this.readTimeout = j8;
    }

    public final void setWriteTimeout(long j8) {
        this.writeTimeout = j8;
    }

    public String toString() {
        return "TimeoutConfig(connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ")";
    }

    public TimeoutConfig(long j8, long j9, long j10) {
        this.connectTimeout = j8;
        this.readTimeout = j9;
        this.writeTimeout = j10;
    }

    public /* synthetic */ TimeoutConfig(long j8, long j9, long j10, int i8, o oVar) {
        this((i8 & 1) != 0 ? 60L : j8, (i8 & 2) != 0 ? 60L : j9, (i8 & 4) != 0 ? 60L : j10);
    }
}
