package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class h9 {
    public boolean a;
    public g9 b;
    public boolean c;

    public final void a(g9 g9Var) {
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
            if (this.b == g9Var) {
                return;
            }
            this.b = g9Var;
            if (this.a) {
                g9Var.onCancel();
            }
        }
    }
}
