package j0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1886a;

    /* renamed from: b, reason: collision with root package name */
    public b f1887b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1888c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f1888c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f1887b == bVar) {
                return;
            }
            this.f1887b = bVar;
            if (this.f1886a) {
                bVar.onCancel();
            }
        }
    }
}
