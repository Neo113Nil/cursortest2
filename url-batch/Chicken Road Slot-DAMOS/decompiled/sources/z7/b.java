package z7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10920e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f10921i;

    public /* synthetic */ b(int i3, Object obj) {
        this.f10920e = i3;
        this.f10921i = obj;
    }

    @Override // z7.p
    public final void b() {
        switch (this.f10920e) {
            case 0:
                d dVar = ((c) this.f10921i).f10922a;
                dVar.f10925b.a("unlinkToDeath", new Object[0]);
                ((l) dVar.f10935n).f10942d.unlinkToDeath(dVar.f10932k, 0);
                dVar.f10935n = null;
                dVar.g = false;
                return;
            default:
                synchronized (((d) this.f10921i).f10929f) {
                    try {
                        if (((d) this.f10921i).f10933l.get() > 0 && ((d) this.f10921i).f10933l.decrementAndGet() > 0) {
                            ((d) this.f10921i).f10925b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.f10921i;
                        if (dVar2.f10935n != null) {
                            dVar2.f10925b.a("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.f10921i;
                            dVar3.f10924a.unbindService(dVar3.f10934m);
                            d dVar4 = (d) this.f10921i;
                            dVar4.g = false;
                            dVar4.f10935n = null;
                            dVar4.f10934m = null;
                        }
                        ((d) this.f10921i).c();
                        return;
                    } finally {
                    }
                }
        }
    }
}
