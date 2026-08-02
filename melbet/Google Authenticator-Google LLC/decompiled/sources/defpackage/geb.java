package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class geb implements hut {
    final /* synthetic */ Object a;
    final /* synthetic */ gee b;
    final /* synthetic */ gzp c;
    final /* synthetic */ iwq d;

    public geb(iwq iwqVar, Object obj, gee geeVar, gzp gzpVar) {
        this.a = obj;
        this.b = geeVar;
        this.c = gzpVar;
        this.d = iwqVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.hut
    public final void b(Object obj) {
        hfm i;
        gee geeVar;
        Object obj2 = this.a;
        iwq iwqVar = this.d;
        synchronized (iwqVar.a) {
            hfe hfeVar = new hfe(4);
            if (obj2 instanceof gea) {
                hfh hfhVar = (hfh) iwqVar.b.get(obj2);
                if (hfhVar != null) {
                    hfeVar.b(hfhVar);
                }
            } else if (obj2 instanceof gdp) {
                hjr it = ((gdp) obj2).a().iterator();
                while (it.hasNext()) {
                    hfh hfhVar2 = (hfh) iwqVar.b.get(it.next());
                    if (hfhVar2 != null) {
                        hfeVar.b(hfhVar2);
                    }
                }
            } else {
                hfh hfhVar3 = (hfh) iwqVar.b.get(obj2);
                if (hfhVar3 != null) {
                    hfeVar.b(hfhVar3);
                }
            }
            i = hfeVar.a().i();
            Object obj3 = iwqVar.c;
            boolean f = ((gzp) obj3).f();
            geeVar = this.b;
            if (f) {
                int ordinal = geeVar.b.ordinal();
                if (ordinal == 0) {
                    ((gdx) ((gzp) obj3).b()).a();
                } else {
                    if (ordinal != 1) {
                        throw new IllegalStateException("Unrecognized CallReason");
                    }
                    ((gdx) ((gzp) obj3).b()).b();
                }
            }
        }
        hjr it2 = ((hfx) i).iterator();
        while (it2.hasNext()) {
            gzp gzpVar = this.c;
            gef gefVar = (gef) it2.next();
            if (gzpVar.e() != gefVar) {
                gefVar.a(geeVar);
            }
        }
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
    }
}
