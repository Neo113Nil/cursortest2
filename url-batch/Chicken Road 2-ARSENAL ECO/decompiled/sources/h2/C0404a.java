package h2;

import android.os.Process;
import android.os.SystemClock;
import g2.InterfaceC0391a;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404a implements InterfaceC0391a {
    @Override // g2.InterfaceC0391a
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // g2.InterfaceC0391a
    public long getProcessUptimeMillis() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }
}
