package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ex2 {
    public static volatile ex2 TSizfFm2Yiuu;
    public static final Object Y1f8riQaR6yg = new Object();
    public static final Duration e9gEMXR7LXtO;
    public final ow2 PxuCJdSBwIXG;
    public final AtomicLong lS5Rgt96tfkO = new AtomicLong(-1);

    static {
        Duration ofMinutes;
        ofMinutes = Duration.ofMinutes(30L);
        e9gEMXR7LXtO = ofMinutes;
    }

    public ex2(Context context) {
        this.PxuCJdSBwIXG = new ow2(context, new fe2("ads_identifier:api"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003d, code lost:
    
        if (r5 > r7) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void PxuCJdSBwIXG(int i, int i2, long j, long j2) {
        long millis;
        AtomicLong atomicLong = this.lS5Rgt96tfkO;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.lS5Rgt96tfkO.get() != -1) {
            long j3 = elapsedRealtime - this.lS5Rgt96tfkO.get();
            millis = e9gEMXR7LXtO.toMillis();
        }
        ow2 ow2Var = this.PxuCJdSBwIXG;
        if (ow2Var == null) {
            return;
        }
        uj lS5Rgt96tfkO = ow2Var.lS5Rgt96tfkO(new ee2(0, Arrays.asList(new c61(35401, i, 0, j, j2, null, null, 0, i2))));
        ij0 ij0Var = new ij0(elapsedRealtime, this);
        lS5Rgt96tfkO.getClass();
        ((bh2) lS5Rgt96tfkO.TSizfFm2Yiuu).Y1f8riQaR6yg(new lx2(wd2.PxuCJdSBwIXG, ij0Var));
        synchronized (lS5Rgt96tfkO.lS5Rgt96tfkO) {
            try {
                if (lS5Rgt96tfkO.PxuCJdSBwIXG) {
                    ((bh2) lS5Rgt96tfkO.TSizfFm2Yiuu).e9gEMXR7LXtO(lS5Rgt96tfkO);
                }
            } finally {
            }
        }
    }
}
