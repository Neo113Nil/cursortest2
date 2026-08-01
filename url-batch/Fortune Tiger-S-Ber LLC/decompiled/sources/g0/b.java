package g0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1753a;

    /* renamed from: b, reason: collision with root package name */
    public a f1754b;
    public boolean c;

    public final void a(a aVar) {
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
            if (this.f1754b == aVar) {
                return;
            }
            this.f1754b = aVar;
            if (this.f1753a) {
                aVar.onCancel();
            }
        }
    }
}
