package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emt {
    private final hab c;
    private volatile Process d;
    public volatile boolean b = false;
    public final gzf a = new ccb(this, 20);

    public emt(hai haiVar) {
        this.c = new hab(haiVar);
    }

    public final void a(String str) {
        if (str.isEmpty()) {
            return;
        }
        Process process = this.d;
        if (process != null) {
            try {
                if (process.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            } catch (IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            hab habVar = this.c;
            if (!habVar.a || habVar.a(TimeUnit.MILLISECONDS) >= 60000) {
                habVar.d();
                habVar.e();
                this.d = (Process) this.a.a(str);
            }
        }
    }
}
