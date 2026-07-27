package g2;

import B1.C0097d;
import android.os.Handler;
import b2.C0518b;
import f1.C0607a;
import j2.C0712b;
import j2.C0716f;
import j2.C0719i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o2.C0924c;
import w2.C1294c;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final i f6703a;

    /* renamed from: b, reason: collision with root package name */
    public final C0716f f6704b;

    /* renamed from: c, reason: collision with root package name */
    public e2.n f6705c;

    /* renamed from: d, reason: collision with root package name */
    public C0607a f6706d;

    /* renamed from: e, reason: collision with root package name */
    public E1.i f6707e;

    /* renamed from: f, reason: collision with root package name */
    public C0097d f6708f;

    /* renamed from: g, reason: collision with root package name */
    public final l2.g f6709g;

    /* renamed from: h, reason: collision with root package name */
    public final d f6710h;

    /* renamed from: i, reason: collision with root package name */
    public final C0097d f6711i;

    /* renamed from: j, reason: collision with root package name */
    public final C0097d f6712j;

    /* renamed from: k, reason: collision with root package name */
    public s f6713k;

    /* renamed from: l, reason: collision with root package name */
    public s f6714l;

    public h(d dVar, i iVar) {
        new E1.i(14);
        C0716f c0716f = new C0716f();
        c0716f.f7161d = 0L;
        this.f6704b = c0716f;
        this.f6703a = iVar;
        this.f6710h = dVar;
        this.f6711i = dVar.b("RepoOperation");
        this.f6712j = dVar.b("DataOperation");
        this.f6709g = new l2.g(dVar);
        e(new G1.j(4, this));
    }

    public static void a(ArrayList arrayList, C0097d c0097d) {
        ((C0719i) c0097d.f989j).getClass();
        for (Object obj : ((C0719i) c0097d.f989j).f7165a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            a(arrayList, new C0097d((C0924c) entry.getKey(), c0097d, (C0719i) entry.getValue(), 12));
        }
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        l2.g gVar = this.f6709g;
        C0097d c0097d = (C0097d) gVar.f7977c;
        if (c0097d.y()) {
            c0097d.d("Raising " + list.size() + " event(s)", null, new Object[0]);
        }
        ((Handler) ((C1294c) gVar.f7976b).f11388d).post(new G1.n(gVar, 13, new ArrayList(list)));
    }

    public final void c(C0097d c0097d) {
        ((C0719i) c0097d.f989j).getClass();
        for (Object obj : ((C0719i) c0097d.f989j).f7165a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            c(new C0097d((C0924c) entry.getKey(), c0097d, (C0719i) entry.getValue(), 12));
        }
    }

    public final e d(e eVar) {
        C0097d c0097d = this.f6708f;
        while (!eVar.isEmpty()) {
            ((C0719i) c0097d.f989j).getClass();
            e eVar2 = new e(eVar.C());
            c0097d.getClass();
            C0924c C3 = eVar2.C();
            while (C3 != null) {
                C0719i c0719i = (C0719i) c0097d.f989j;
                C0097d c0097d2 = new C0097d(C3, c0097d, c0719i.f7165a.containsKey(C3) ? (C0719i) c0719i.f7165a.get(C3) : new C0719i(), 12);
                eVar2 = eVar2.F();
                C3 = eVar2.C();
                c0097d = c0097d2;
            }
            eVar = eVar.F();
        }
        e r2 = c0097d.r();
        ArrayList arrayList = new ArrayList();
        a(arrayList, c0097d);
        Collections.sort(arrayList);
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            c(this.f6708f);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                ((Handler) this.f6710h.f6684b.f11388d).post((Runnable) arrayList2.get(i2));
            }
            C0097d c0097d3 = this.f6708f;
            c(c0097d3);
            f(c0097d3);
        }
        return r2;
    }

    public final void e(Runnable runnable) {
        ((C0712b) this.f6710h.f6687e.f987e).execute(runnable);
    }

    public final void f(C0097d c0097d) {
        C0719i c0719i = (C0719i) c0097d.f989j;
        c0719i.getClass();
        if (c0719i.f7165a.isEmpty()) {
            return;
        }
        for (Object obj : ((C0719i) c0097d.f989j).f7165a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            f(new C0097d((C0924c) entry.getKey(), c0097d, (C0719i) entry.getValue(), 12));
        }
    }

    public final void g(C0924c c0924c, Object obj) {
        if (c0924c.equals(c.f6680b)) {
            this.f6704b.f7161d = ((Long) obj).longValue();
        }
        e eVar = new e(c.f6679a, c0924c);
        try {
            o2.s c4 = m3.o.c(obj, o2.k.f8939k);
            C0607a c0607a = this.f6706d;
            c0607a.f6561e = ((o2.s) c0607a.f6561e).d(eVar, c4);
            b(this.f6713k.l(eVar, c4));
        } catch (C0518b e4) {
            this.f6711i.i("Failed to parse info update", e4);
        }
    }

    public final String toString() {
        return this.f6703a.toString();
    }
}
