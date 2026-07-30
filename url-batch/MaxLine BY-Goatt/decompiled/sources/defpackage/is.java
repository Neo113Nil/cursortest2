package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class is {
    public boolean a;
    public hs b;
    public boolean c;

    public final void a(hs hsVar) {
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
            if (this.b == hsVar) {
                return;
            }
            this.b = hsVar;
            if (this.a) {
                hsVar.onCancel();
            }
        }
    }
}
