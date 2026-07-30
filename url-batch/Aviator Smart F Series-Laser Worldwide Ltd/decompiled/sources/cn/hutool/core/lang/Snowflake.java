package cn.hutool.core.lang;

import cn.hutool.core.date.q1;
import java.io.Serializable;
import java.util.Date;

/* loaded from: classes.dex */
public class Snowflake implements Serializable {
    private static final long DATA_CENTER_ID_BITS = 5;
    private static final long DATA_CENTER_ID_SHIFT = 17;
    public static long DEFAULT_TIME_OFFSET = 2000;
    public static long DEFAULT_TWEPOCH = 1288834974657L;
    private static final long MAX_DATA_CENTER_ID = 31;
    private static final long MAX_WORKER_ID = 31;
    private static final long SEQUENCE_BITS = 12;
    private static final long SEQUENCE_MASK = 4095;
    private static final long TIMESTAMP_LEFT_SHIFT = 22;
    private static final long WORKER_ID_BITS = 5;
    private static final long WORKER_ID_SHIFT = 12;
    private static final long serialVersionUID = 1;
    private final long dataCenterId;
    private long lastTimestamp;
    private final long randomSequenceLimit;
    private long sequence;
    private final long timeOffset;
    private final long twepoch;
    private final boolean useSystemClock;
    private final long workerId;

    public Snowflake() {
        this(cn.hutool.core.util.a0.getWorkerId(cn.hutool.core.util.a0.getDataCenterId(31L), 31L));
    }

    private long genTime() {
        return this.useSystemClock ? q1.now() : System.currentTimeMillis();
    }

    private long tilNextMillis(long j8) {
        long genTime = genTime();
        while (genTime == j8) {
            genTime = genTime();
        }
        if (genTime >= j8) {
            return genTime;
        }
        throw new IllegalStateException(cn.hutool.core.text.l.format("Clock moved backwards. Refusing to generate id for {}ms", Long.valueOf(j8 - genTime)));
    }

    public long getDataCenterId(long j8) {
        return (j8 >> DATA_CENTER_ID_SHIFT) & 31;
    }

    public long getGenerateDateTime(long j8) {
        return ((j8 >> TIMESTAMP_LEFT_SHIFT) & 2199023255551L) + this.twepoch;
    }

    public long getWorkerId(long j8) {
        return (j8 >> 12) & 31;
    }

    public synchronized long nextId() {
        long genTime;
        try {
            genTime = genTime();
            long j8 = this.lastTimestamp;
            if (genTime < j8) {
                if (j8 - genTime >= this.timeOffset) {
                    throw new IllegalStateException(cn.hutool.core.text.l.format("Clock moved backwards. Refusing to generate id for {}ms", Long.valueOf(this.lastTimestamp - genTime)));
                }
                genTime = j8;
            }
            if (genTime == j8) {
                long j9 = SEQUENCE_MASK & (this.sequence + 1);
                if (j9 == 0) {
                    genTime = tilNextMillis(j8);
                }
                this.sequence = j9;
            } else {
                long j10 = this.randomSequenceLimit;
                if (j10 > 1) {
                    this.sequence = cn.hutool.core.util.i0.randomLong(j10);
                } else {
                    this.sequence = 0L;
                }
            }
            this.lastTimestamp = genTime;
        } catch (Throwable th) {
            throw th;
        }
        return ((genTime - this.twepoch) << TIMESTAMP_LEFT_SHIFT) | (this.dataCenterId << DATA_CENTER_ID_SHIFT) | (this.workerId << 12) | this.sequence;
    }

    public String nextIdStr() {
        return Long.toString(nextId());
    }

    public Snowflake(long j8) {
        this(j8, cn.hutool.core.util.a0.getDataCenterId(31L));
    }

    public Snowflake(long j8, long j9) {
        this(j8, j9, false);
    }

    public Snowflake(long j8, long j9, boolean z7) {
        this(null, j8, j9, z7);
    }

    public Snowflake(Date date, long j8, long j9, boolean z7) {
        this(date, j8, j9, z7, DEFAULT_TIME_OFFSET);
    }

    public Snowflake(Date date, long j8, long j9, boolean z7, long j10) {
        this(date, j8, j9, z7, j10, 0L);
    }

    public Snowflake(Date date, long j8, long j9, boolean z7, long j10, long j11) {
        this.sequence = 0L;
        this.lastTimestamp = -1L;
        this.twepoch = date != null ? date.getTime() : DEFAULT_TWEPOCH;
        this.workerId = q.checkBetween(j8, 0L, 31L);
        this.dataCenterId = q.checkBetween(j9, 0L, 31L);
        this.useSystemClock = z7;
        this.timeOffset = j10;
        this.randomSequenceLimit = q.checkBetween(j11, 0L, SEQUENCE_MASK);
    }
}
