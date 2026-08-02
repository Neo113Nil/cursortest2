package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bfa extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}
