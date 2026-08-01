package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class c9 {
    public boolean a;
    public b9 b;
    public boolean c;

    public final void a(b9 b9Var) {
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
            if (this.b == b9Var) {
                return;
            }
            this.b = b9Var;
            if (this.a) {
                b9Var.onCancel();
            }
        }
    }
}
