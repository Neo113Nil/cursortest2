package o2;

import d2.AbstractC0546c;
import d2.C0549f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterable {

    /* renamed from: j, reason: collision with root package name */
    public static final C0549f f8940j = new C0549f(Collections.emptyList(), null);

    /* renamed from: d, reason: collision with root package name */
    public final s f8941d;

    /* renamed from: e, reason: collision with root package name */
    public C0549f f8942e;

    /* renamed from: i, reason: collision with root package name */
    public final l f8943i;

    public m(s sVar, l lVar) {
        this.f8943i = lVar;
        this.f8941d = sVar;
        this.f8942e = null;
    }

    public final void e() {
        if (this.f8942e == null) {
            n nVar = n.f8944a;
            l lVar = this.f8943i;
            boolean equals = lVar.equals(nVar);
            C0549f c0549f = f8940j;
            if (equals) {
                this.f8942e = c0549f;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z4 = false;
            for (q qVar : this.f8941d) {
                z4 = z4 || lVar.b(qVar.f8951b);
                arrayList.add(new q(qVar.f8950a, qVar.f8951b));
            }
            if (z4) {
                this.f8942e = new C0549f(arrayList, lVar);
            } else {
                this.f8942e = c0549f;
            }
        }
    }

    public final m h(C0924c c0924c, s sVar) {
        s sVar2 = this.f8941d;
        s m4 = sVar2.m(c0924c, sVar);
        C0549f c0549f = this.f8942e;
        C0549f c0549f2 = f8940j;
        boolean f4 = H1.o.f(c0549f, c0549f2);
        l lVar = this.f8943i;
        if (f4 && !lVar.b(sVar)) {
            return new m(m4, lVar, c0549f2);
        }
        C0549f c0549f3 = this.f8942e;
        if (c0549f3 == null || H1.o.f(c0549f3, c0549f2)) {
            return new m(m4, lVar, null);
        }
        s b4 = sVar2.b(c0924c);
        C0549f c0549f4 = this.f8942e;
        q qVar = new q(c0924c, b4);
        AbstractC0546c abstractC0546c = c0549f4.f6075d;
        AbstractC0546c E3 = abstractC0546c.E(qVar);
        if (E3 != abstractC0546c) {
            c0549f4 = new C0549f(E3);
        }
        if (!sVar.isEmpty()) {
            c0549f4 = new C0549f(c0549f4.f6075d.D(null, new q(c0924c, sVar)));
        }
        return new m(m4, lVar, c0549f4);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e();
        return H1.o.f(this.f8942e, f8940j) ? this.f8941d.iterator() : this.f8942e.iterator();
    }

    public m(s sVar, l lVar, C0549f c0549f) {
        this.f8943i = lVar;
        this.f8941d = sVar;
        this.f8942e = c0549f;
    }
}
