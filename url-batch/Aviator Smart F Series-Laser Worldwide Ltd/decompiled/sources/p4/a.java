package p4;

import android.os.SystemClock;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import com.drake.net.NetConfig;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a {
    private long currentByteCount;
    private boolean finish;
    private long intervalByteCount;
    private long intervalTime;
    private long speedBytes;
    private final long startElapsedRealtime = SystemClock.elapsedRealtime();
    private long totalByteCount;

    public final String currentSize() {
        String formatFileSize = Formatter.formatFileSize(NetConfig.INSTANCE.getApp(), this.currentByteCount);
        s.checkNotNullExpressionValue(formatFileSize, "formatFileSize(NetConfig.app, currentByteCount)");
        return formatFileSize;
    }

    public final long getCurrentByteCount() {
        return this.currentByteCount;
    }

    public final boolean getFinish() {
        return this.finish;
    }

    public final long getIntervalByteCount() {
        return this.intervalByteCount;
    }

    public final long getIntervalTime() {
        return this.intervalTime;
    }

    public final long getSpeedBytes() {
        long j8 = this.intervalTime;
        if (j8 > 0) {
            long j9 = this.intervalByteCount;
            if (j9 > 0) {
                long j10 = (j9 * 1000) / j8;
                this.speedBytes = j10;
                return j10;
            }
        }
        return this.speedBytes;
    }

    public final long getStartElapsedRealtime() {
        return this.startElapsedRealtime;
    }

    public final long getTotalByteCount() {
        return this.totalByteCount;
    }

    public final int progress() {
        if (this.finish) {
            return 100;
        }
        long j8 = this.currentByteCount;
        long j9 = this.totalByteCount;
        if (j8 == j9) {
            return 100;
        }
        if (j9 <= 0) {
            return 0;
        }
        return (int) ((j8 * 100) / j9);
    }

    public final String remainSize() {
        long j8 = this.totalByteCount;
        String formatFileSize = Formatter.formatFileSize(NetConfig.INSTANCE.getApp(), j8 > 0 ? j8 - this.currentByteCount : 0L);
        s.checkNotNullExpressionValue(formatFileSize, "formatFileSize(NetConfig.app, remain)");
        return formatFileSize;
    }

    public final String remainTime() {
        long speedBytes = getSpeedBytes();
        long j8 = this.totalByteCount;
        long j9 = 0;
        if (j8 > 0 && speedBytes > 0) {
            j9 = (j8 - this.currentByteCount) / speedBytes;
        }
        String formatElapsedTime = DateUtils.formatElapsedTime(j9);
        s.checkNotNullExpressionValue(formatElapsedTime, "formatElapsedTime(remainSeconds)");
        return formatElapsedTime;
    }

    public final long remainTimeSeconds() {
        long speedBytes = getSpeedBytes();
        long j8 = this.totalByteCount;
        if (j8 <= 0 || speedBytes <= 0) {
            return 0L;
        }
        return (j8 - this.currentByteCount) / speedBytes;
    }

    public final void setCurrentByteCount$net_release(long j8) {
        this.currentByteCount = j8;
    }

    public final void setFinish$net_release(boolean z7) {
        this.finish = z7;
    }

    public final void setIntervalByteCount$net_release(long j8) {
        this.intervalByteCount = j8;
    }

    public final void setIntervalTime$net_release(long j8) {
        this.intervalTime = j8;
    }

    public final void setSpeedBytes(long j8) {
        this.speedBytes = j8;
    }

    public final void setTotalByteCount$net_release(long j8) {
        this.totalByteCount = j8;
    }

    public final String speedSize() {
        String formatFileSize = Formatter.formatFileSize(NetConfig.INSTANCE.getApp(), getSpeedBytes());
        s.checkNotNullExpressionValue(formatFileSize, "formatFileSize(NetConfig.app, speedBytes)");
        return formatFileSize;
    }

    public String toString() {
        return "Progress(currentByteCount=" + this.currentByteCount + ", totalByteCount=" + this.totalByteCount + ", finish=" + this.finish + ')';
    }

    public final String totalSize() {
        long j8 = this.totalByteCount;
        if (j8 <= 0) {
            j8 = 0;
        }
        String formatFileSize = Formatter.formatFileSize(NetConfig.INSTANCE.getApp(), j8);
        s.checkNotNullExpressionValue(formatFileSize, "formatFileSize(NetConfig.app, totalBytes)");
        return formatFileSize;
    }

    public final String useTime() {
        String formatElapsedTime = DateUtils.formatElapsedTime((SystemClock.elapsedRealtime() - this.startElapsedRealtime) / 1000);
        s.checkNotNullExpressionValue(formatElapsedTime, "formatElapsedTime((Syste…tElapsedRealtime) / 1000)");
        return formatElapsedTime;
    }

    public final long useTimeSeconds() {
        return (SystemClock.elapsedRealtime() - this.startElapsedRealtime) / 1000;
    }
}
