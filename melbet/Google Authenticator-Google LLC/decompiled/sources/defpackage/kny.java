package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kny extends knu {
    private final AtomicInteger l;
    private jzi m;

    public kny(jzc jzcVar) {
        super(jzcVar);
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new jzb(jze.a);
    }

    private final jzi g(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((kns) it.next()).d);
        }
        return new knx(arrayList, this.l);
    }

    private final void h(jxi jxiVar, jzi jziVar) {
        if (jxiVar == this.k && jziVar.equals(this.m)) {
            return;
        }
        this.h.f(jxiVar, jziVar);
        this.k = jxiVar;
        this.m = jziVar;
    }

    @Override // defpackage.knu
    protected final kns e(Object obj) {
        return new knw(this, obj, this.j);
    }

    @Override // defpackage.knu
    protected final void f() {
        ArrayList arrayList = new ArrayList();
        for (kns knsVar : this.g) {
            if (knsVar.c == jxi.b) {
                arrayList.add(knsVar);
            }
        }
        if (!arrayList.isEmpty()) {
            h(jxi.b, g(arrayList));
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            jxi jxiVar = ((kns) it.next()).c;
            jxi jxiVar2 = jxi.a;
            if (jxiVar == jxiVar2 || jxiVar == jxi.d) {
                h(jxiVar2, new jzb(jze.a));
                return;
            }
        }
        h(jxi.c, g(this.g));
    }
}
