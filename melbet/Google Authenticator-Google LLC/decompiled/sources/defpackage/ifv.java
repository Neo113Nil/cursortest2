package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifv {
    public static final ifv a = new ifv(new eig(16));
    private final koi b;
    private final AtomicBoolean c;

    public ifv(koe koeVar) {
        koeVar.getClass();
        this.b = new kop(new ggy(koeVar, 11));
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hac, java.lang.Object] */
    public final void a(String str) {
        iwq d = d();
        if (d == null || !d.d()) {
            return;
        }
        iee o = d.o();
        ikj ikjVar = (ikj) d.a;
        ((fea) o.g.bB()).b(ikjVar.b, ikjVar.a, str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [hac, java.lang.Object] */
    public final void b(long j) {
        iwq d = d();
        if (d == null || !d.d()) {
            return;
        }
        iee o = d.o();
        ikj ikjVar = (ikj) d.a;
        ((fdx) o.c.bB()).b(j, ikjVar.b, ikjVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, koi] */
    /* JADX WARN: Type inference failed for: r0v7, types: [hac, java.lang.Object] */
    public final void c(ify ifyVar, ifx ifxVar) {
        iwq d;
        ifyVar.getClass();
        ifxVar.getClass();
        if (this.c.compareAndSet(false, true) && (d = d()) != null && ((Boolean) d.b.a()).booleanValue()) {
            iee o = d.o();
            ikj ikjVar = (ikj) d.a;
            ((fea) o.f.bB()).b(ikjVar.b, ikjVar.a, ifyVar.e, ifxVar.f);
        }
    }

    public final iwq d() {
        return (iwq) this.b.a();
    }
}
