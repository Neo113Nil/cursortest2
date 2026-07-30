package com.liulishuo.filedownloader.download;

/* loaded from: classes4.dex */
public class a {
    static final int RANGE_INFINITE = -1;
    final long contentLength;
    final long currentOffset;
    final long endOffset;
    private final boolean isForceNoRange;
    private final boolean isTrialConnect;
    final long startOffset;

    public static class b {
        public static a buildBeginToEndConnectionProfile(long j8) {
            return new a(0L, 0L, -1L, j8);
        }

        public static a buildConnectionProfile(long j8, long j9, long j10, long j11) {
            return new a(j8, j9, j10, j11);
        }

        public static a buildToEndConnectionProfile(long j8, long j9, long j10) {
            return new a(j8, j9, -1L, j10);
        }

        public static a buildTrialConnectionProfile() {
            return new a();
        }

        public static a buildTrialConnectionProfileNoRange() {
            return new a(0L, 0L, 0L, 0L, true);
        }
    }

    public void processProfile(com.liulishuo.filedownloader.connection.b bVar) {
        if (this.isForceNoRange) {
            return;
        }
        if (this.isTrialConnect && com.liulishuo.filedownloader.util.e.getImpl().trialConnectionHeadMethod) {
            bVar.setRequestMethod("HEAD");
        }
        bVar.addHeader("Range", this.endOffset == -1 ? com.liulishuo.filedownloader.util.f.formatString("bytes=%d-", Long.valueOf(this.currentOffset)) : com.liulishuo.filedownloader.util.f.formatString("bytes=%d-%d", Long.valueOf(this.currentOffset), Long.valueOf(this.endOffset)));
    }

    public String toString() {
        return com.liulishuo.filedownloader.util.f.formatString("range[%d, %d) current offset[%d]", Long.valueOf(this.startOffset), Long.valueOf(this.endOffset), Long.valueOf(this.currentOffset));
    }

    private a() {
        this.startOffset = 0L;
        this.currentOffset = 0L;
        this.endOffset = 0L;
        this.contentLength = 0L;
        this.isForceNoRange = false;
        this.isTrialConnect = true;
    }

    private a(long j8, long j9, long j10, long j11) {
        this(j8, j9, j10, j11, false);
    }

    private a(long j8, long j9, long j10, long j11, boolean z7) {
        if (!(j8 == 0 && j10 == 0) && z7) {
            throw new IllegalArgumentException();
        }
        this.startOffset = j8;
        this.currentOffset = j9;
        this.endOffset = j10;
        this.contentLength = j11;
        this.isForceNoRange = z7;
        this.isTrialConnect = false;
    }
}
