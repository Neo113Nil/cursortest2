package com.google.android.datatransport.runtime.firebase.transport;

/* loaded from: classes.dex */
public final class TimeWindow {
    private static final TimeWindow DEFAULT_INSTANCE = new Builder().build();
    private final long end_ms_;
    private final long start_ms_;

    public static final class Builder {
        private long start_ms_ = 0;
        private long end_ms_ = 0;

        Builder() {
        }

        public TimeWindow build() {
            return new TimeWindow(this.start_ms_, this.end_ms_);
        }

        public Builder setEndMs(long j4) {
            this.end_ms_ = j4;
            return this;
        }

        public Builder setStartMs(long j4) {
            this.start_ms_ = j4;
            return this;
        }
    }

    TimeWindow(long j4, long j5) {
        this.start_ms_ = j4;
        this.end_ms_ = j5;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public long getEndMs() {
        return this.end_ms_;
    }

    public long getStartMs() {
        return this.start_ms_;
    }
}
