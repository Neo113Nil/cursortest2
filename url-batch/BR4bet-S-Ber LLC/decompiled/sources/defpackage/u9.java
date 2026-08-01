package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class u9 {
    public boolean a;
    public t9 b;
    public boolean c;

    public final void a(t9 t9Var) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.b == t9Var) {
                return;
            }
            this.b = t9Var;
            if (this.a) {
                t9Var.onCancel();
            }
        }
    }
}
