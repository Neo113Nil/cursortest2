package M4;

import java.util.logging.Level;

/* loaded from: classes.dex */
public final class m implements f {

    /* renamed from: d, reason: collision with root package name */
    public final a f1761d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1762e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1763i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f1764l;

    public m(n nVar, a aVar, a aVar2) {
        this.f1764l = nVar;
        this.f1761d = aVar;
        this.f1762e = aVar2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f1763i || this.f1764l.current() != this.f1762e) {
            n.f1766e.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
        } else {
            this.f1763i = true;
            n.f1767i.set(this.f1761d);
        }
    }
}
