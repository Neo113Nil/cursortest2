package g2;

import B1.C0097d;
import G.C0231x;
import b2.C0517a;
import j2.InterfaceC0718h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final H1.f f6770d = new H1.f(12, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f6771a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6772b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6773c;

    public x(s sVar, l2.j jVar) {
        this.f6773c = sVar;
        this.f6771a = jVar;
        this.f6772b = sVar.p(jVar.f7986a);
    }

    public static C0639b b(ArrayList arrayList, InterfaceC0718h interfaceC0718h, e eVar) {
        C0639b c0639b = C0639b.f6677e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (interfaceC0718h.f(vVar)) {
                e eVar2 = vVar.f6761b;
                if (vVar.c()) {
                    if (eVar.w(eVar2)) {
                        c0639b = c0639b.e(e.E(eVar, eVar2), vVar.b());
                    } else if (eVar2.w(eVar)) {
                        c0639b = c0639b.e(e.f6694j, vVar.b().p(e.E(eVar2, eVar)));
                    }
                } else if (eVar.w(eVar2)) {
                    c0639b = c0639b.h(e.E(eVar, eVar2), vVar.a());
                } else if (eVar2.w(eVar)) {
                    e E3 = e.E(eVar2, eVar);
                    if (E3.isEmpty()) {
                        c0639b = c0639b.h(e.f6694j, vVar.a());
                    } else {
                        o2.s C3 = vVar.a().C(E3);
                        if (C3 != null) {
                            c0639b = c0639b.e(e.f6694j, C3);
                        }
                    }
                }
            }
        }
        return c0639b;
    }

    public o2.s a(e eVar, o2.s sVar, List list, boolean z4) {
        if (list.isEmpty() && !z4) {
            o2.s C3 = ((C0639b) this.f6771a).C(eVar);
            if (C3 != null) {
                return C3;
            }
            C0639b w4 = ((C0639b) this.f6771a).w(eVar);
            if (w4.f6678d.isEmpty()) {
                return sVar;
            }
            if (sVar == null && w4.C(e.f6694j) == null) {
                return null;
            }
            if (sVar == null) {
                sVar = o2.k.f8939k;
            }
            return w4.j(sVar);
        }
        C0639b w5 = ((C0639b) this.f6771a).w(eVar);
        if (!z4 && w5.f6678d.isEmpty()) {
            return sVar;
        }
        if (!z4 && sVar == null && w5.C(e.f6694j) == null) {
            return null;
        }
        C0639b b4 = b((ArrayList) this.f6772b, new y.t(z4, list, eVar), eVar);
        if (sVar == null) {
            sVar = o2.k.f8939k;
        }
        return b4.j(sVar);
    }

    public List c(C0517a c0517a) {
        l2.j jVar = (l2.j) this.f6771a;
        s sVar = (s) this.f6773c;
        if (c0517a != null) {
            ((C0097d) sVar.f6758h).M("Listen at " + jVar.f7986a.f7984a + " failed: " + c0517a.toString());
            return sVar.o(jVar.f7986a, null, c0517a);
        }
        l2.i iVar = jVar.f7986a;
        t tVar = (t) this.f6772b;
        if (tVar != null) {
            sVar.getClass();
            return (List) ((C0231x) sVar.f6757g).a(new n(sVar, tVar, 2));
        }
        e eVar = iVar.f7984a;
        sVar.getClass();
        return (List) ((C0231x) sVar.f6757g).a(new n(sVar, eVar, 1));
    }
}
