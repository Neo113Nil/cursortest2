package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ma {
    public boolean a;
    public la b;
    public boolean c;

    public final void a(la laVar) {
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
            if (this.b == laVar) {
                return;
            }
            this.b = laVar;
            if (this.a) {
                laVar.onCancel();
            }
        }
    }
}
