package w1;

import android.text.TextUtils;
import com.crrepa.band.my.model.band.provider.BandInfoManager;

/* loaded from: classes2.dex */
public class b {
    private static final String FILTER_FIRMWARE_VERSION = "MOY-TON5-1.8.4";
    private static final int MAX_TIMEOUT_COUNT = 8;
    private static final int TRANS_TIMEOUT = 500;
    private boolean filtered = TextUtils.equals(BandInfoManager.getFirmwareVersion(), FILTER_FIRMWARE_VERSION);
    private int timeoutCount = 0;
    private long previousTime = 0;

    public boolean isTimeout() {
        if (!this.filtered) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j8 = this.previousTime;
        if (j8 == 0) {
            this.previousTime = currentTimeMillis;
            return false;
        }
        if (500 < currentTimeMillis - j8) {
            this.timeoutCount++;
        }
        com.orhanobut.logger.f.d("timeoutCount: " + this.timeoutCount);
        this.previousTime = currentTimeMillis;
        return 8 < this.timeoutCount;
    }

    public void reset() {
        this.previousTime = 0L;
        this.timeoutCount = 0;
    }
}
