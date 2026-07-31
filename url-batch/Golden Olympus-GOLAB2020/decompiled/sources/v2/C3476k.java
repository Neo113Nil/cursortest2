package v2;

import o2.N;

/* renamed from: v2.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3476k extends AbstractRunnableC3473h {

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f46474d;

    public C3476k(Runnable runnable, long j4, InterfaceC3474i interfaceC3474i) {
        super(j4, interfaceC3474i);
        this.f46474d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f46474d.run();
        } finally {
            this.f46472c.a();
        }
    }

    public String toString() {
        return "Task[" + N.a(this.f46474d) + '@' + N.b(this.f46474d) + ", " + this.f46471b + ", " + this.f46472c + ']';
    }
}
