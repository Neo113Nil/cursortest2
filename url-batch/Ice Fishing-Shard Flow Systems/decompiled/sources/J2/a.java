package J2;

import android.os.Process;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class a implements I2.a {
    @Override // I2.a
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // I2.a
    public long getProcessUptimeMillis() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }
}
