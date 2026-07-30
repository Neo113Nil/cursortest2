package z4;

import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements b, a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10095a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f10096b;

    /* renamed from: c, reason: collision with root package name */
    public final i f10097c;

    /* renamed from: d, reason: collision with root package name */
    public int f10098d;

    /* renamed from: e, reason: collision with root package name */
    public int f10099e;

    /* renamed from: f, reason: collision with root package name */
    public int f10100f;

    /* renamed from: g, reason: collision with root package name */
    public Exception f10101g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10102h;

    public e(int i7, i iVar) {
        this.f10096b = i7;
        this.f10097c = iVar;
    }

    @Override // z4.a
    public final void a(Exception exc) {
        synchronized (this.f10095a) {
            this.f10099e++;
            this.f10101g = exc;
            c();
        }
    }

    @Override // z4.b
    public final void b(Object obj) {
        synchronized (this.f10095a) {
            this.f10098d++;
            c();
        }
    }

    public final void c() {
        if (this.f10098d + this.f10099e + this.f10100f == this.f10096b) {
            if (this.f10101g != null) {
                this.f10097c.c(new ExecutionException(this.f10099e + " out of " + this.f10096b + " underlying tasks failed", this.f10101g));
                return;
            }
            if (!this.f10102h) {
                this.f10097c.d(null);
                return;
            }
            i iVar = this.f10097c;
            synchronized (iVar.f10108a) {
                try {
                    if (iVar.f10110c) {
                        return;
                    }
                    iVar.f10110c = true;
                    iVar.f10111d = true;
                    iVar.f10109b.j(iVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
