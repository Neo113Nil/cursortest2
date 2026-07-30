package H4;

import android.os.Process;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class a implements G4.a {
    @Override // G4.a
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // G4.a
    public long getProcessUptimeMillis() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }
}
