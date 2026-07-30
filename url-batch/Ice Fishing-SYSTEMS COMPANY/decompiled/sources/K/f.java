package K;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1474a;

    /* renamed from: b, reason: collision with root package name */
    public e f1475b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1476c;

    public final void a(e eVar) {
        synchronized (this) {
            while (this.f1476c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f1475b == eVar) {
                return;
            }
            this.f1475b = eVar;
            if (this.f1474a) {
                eVar.a();
            }
        }
    }
}
