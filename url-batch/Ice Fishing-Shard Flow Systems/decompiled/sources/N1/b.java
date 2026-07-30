package N1;

/* loaded from: classes.dex */
public final class b extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1798e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1799i;

    public /* synthetic */ b(int i2, Object obj) {
        this.f1798e = i2;
        this.f1799i = obj;
    }

    @Override // N1.q
    public final void b() {
        switch (this.f1798e) {
            case 0:
                d dVar = ((c) this.f1799i).f1800a;
                dVar.f1803b.a("unlinkToDeath", new Object[0]);
                ((m) dVar.f1814n).f1822e.unlinkToDeath(dVar.f1811k, 0);
                dVar.f1814n = null;
                dVar.f1808g = false;
                return;
            default:
                synchronized (((d) this.f1799i).f1807f) {
                    try {
                        if (((d) this.f1799i).f1812l.get() > 0 && ((d) this.f1799i).f1812l.decrementAndGet() > 0) {
                            ((d) this.f1799i).f1803b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.f1799i;
                        if (dVar2.f1814n != null) {
                            dVar2.f1803b.a("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.f1799i;
                            dVar3.f1802a.unbindService(dVar3.f1813m);
                            d dVar4 = (d) this.f1799i;
                            dVar4.f1808g = false;
                            dVar4.f1814n = null;
                            dVar4.f1813m = null;
                        }
                        ((d) this.f1799i).c();
                        return;
                    } finally {
                    }
                }
        }
    }
}
