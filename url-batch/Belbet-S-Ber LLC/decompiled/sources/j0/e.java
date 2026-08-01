package j0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2130a;

    /* renamed from: b, reason: collision with root package name */
    public d f2131b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2132c;

    public final void a(d dVar) {
        synchronized (this) {
            while (this.f2132c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f2131b == dVar) {
                return;
            }
            this.f2131b = dVar;
            if (this.f2130a) {
                dVar.onCancel();
            }
        }
    }
}
