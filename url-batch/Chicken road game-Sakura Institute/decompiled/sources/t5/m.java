package t5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m implements Iterable {

    /* renamed from: i, reason: collision with root package name */
    public static final i5.f f8909i = new i5.f(Collections.EMPTY_LIST, null);

    /* renamed from: f, reason: collision with root package name */
    public final s f8910f;

    /* renamed from: g, reason: collision with root package name */
    public i5.f f8911g;

    /* renamed from: h, reason: collision with root package name */
    public final l f8912h;

    public m(s sVar, l lVar) {
        this.f8912h = lVar;
        this.f8910f = sVar;
        this.f8911g = null;
    }

    public final void a() {
        if (this.f8911g == null) {
            n nVar = n.f8913a;
            l lVar = this.f8912h;
            boolean equals = lVar.equals(nVar);
            i5.f fVar = f8909i;
            if (equals) {
                this.f8911g = fVar;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z8 = false;
            for (q qVar : this.f8910f) {
                z8 = z8 || lVar.b(qVar.f8920b);
                arrayList.add(new q(qVar.f8919a, qVar.f8920b));
            }
            if (z8) {
                this.f8911g = new i5.f(arrayList, lVar);
            } else {
                this.f8911g = fVar;
            }
        }
    }

    public final m g(c cVar, s sVar) {
        s sVar2 = this.f8910f;
        s o2 = sVar2.o(cVar, sVar);
        i5.f fVar = this.f8911g;
        i5.f fVar2 = f8909i;
        boolean f9 = m4.o.f(fVar, fVar2);
        l lVar = this.f8912h;
        if (f9 && !lVar.b(sVar)) {
            return new m(o2, lVar, fVar2);
        }
        i5.f fVar3 = this.f8911g;
        if (fVar3 == null || m4.o.f(fVar3, fVar2)) {
            return new m(o2, lVar, null);
        }
        s d8 = sVar2.d(cVar);
        i5.f fVar4 = this.f8911g;
        q qVar = new q(cVar, d8);
        i5.c cVar2 = fVar4.f4941f;
        i5.c B = cVar2.B(qVar);
        if (B != cVar2) {
            fVar4 = new i5.f(B);
        }
        if (!sVar.isEmpty()) {
            fVar4 = new i5.f(fVar4.f4941f.A(null, new q(cVar, sVar)));
        }
        return new m(o2, lVar, fVar4);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        a();
        return m4.o.f(this.f8911g, f8909i) ? this.f8910f.iterator() : this.f8911g.iterator();
    }

    public m(s sVar, l lVar, i5.f fVar) {
        this.f8912h = lVar;
        this.f8910f = sVar;
        this.f8911g = fVar;
    }
}
