package l5;

import android.os.Handler;
import b3.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final j f6032a;

    /* renamed from: b, reason: collision with root package name */
    public final o5.f f6033b;

    /* renamed from: c, reason: collision with root package name */
    public j5.n f6034c;

    /* renamed from: d, reason: collision with root package name */
    public l1.x f6035d;

    /* renamed from: e, reason: collision with root package name */
    public m4.f f6036e;

    /* renamed from: f, reason: collision with root package name */
    public b1.b f6037f;

    /* renamed from: g, reason: collision with root package name */
    public final q5.g f6038g;

    /* renamed from: h, reason: collision with root package name */
    public final d f6039h;

    /* renamed from: i, reason: collision with root package name */
    public final b1.b f6040i;

    /* renamed from: j, reason: collision with root package name */
    public final b1.b f6041j;

    /* renamed from: k, reason: collision with root package name */
    public l.v f6042k;

    /* renamed from: l, reason: collision with root package name */
    public l.v f6043l;

    public i(d dVar, j jVar) {
        o5.f fVar = new o5.f();
        fVar.f6848f = 0L;
        this.f6033b = fVar;
        this.f6032a = jVar;
        this.f6039h = dVar;
        this.f6040i = dVar.a("RepoOperation");
        this.f6041j = dVar.a("DataOperation");
        this.f6038g = new q5.g(dVar);
        e(new androidx.room.o(5, this));
    }

    public static void a(ArrayList arrayList, b1.b bVar) {
        ((o5.i) bVar.f1232i).getClass();
        for (Object obj : ((o5.i) bVar.f1232i).f6852a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            a(arrayList, new b1.b((t5.c) entry.getKey(), bVar, (o5.i) entry.getValue(), 15));
        }
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        q5.g gVar = this.f6038g;
        b1.b bVar = (b1.b) gVar.f7528h;
        if (bVar.v()) {
            bVar.d("Raising " + list.size() + " event(s)", null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(list);
        ((Handler) ((b6.c) gVar.f7527g).f1394g).post(new z(9, (Object) gVar, (Object) arrayList, false));
    }

    public final void c(b1.b bVar) {
        ((o5.i) bVar.f1232i).getClass();
        for (Object obj : ((o5.i) bVar.f1232i).f6852a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            c(new b1.b((t5.c) entry.getKey(), bVar, (o5.i) entry.getValue(), 15));
        }
    }

    public final f d(f fVar) {
        b1.b bVar = this.f6037f;
        while (!fVar.isEmpty()) {
            ((o5.i) bVar.f1232i).getClass();
            f fVar2 = new f(fVar.z());
            bVar.getClass();
            t5.c z8 = fVar2.z();
            while (true) {
                o5.i iVar = (o5.i) bVar.f1232i;
                if (z8 != null) {
                    b1.b bVar2 = new b1.b(z8, bVar, iVar.f6852a.containsKey(z8) ? (o5.i) iVar.f6852a.get(z8) : new o5.i(), 15);
                    fVar2 = fVar2.C();
                    z8 = fVar2.z();
                    bVar = bVar2;
                }
            }
            fVar = fVar.C();
        }
        f o2 = bVar.o();
        ArrayList arrayList = new ArrayList();
        a(arrayList, bVar);
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            return o2;
        }
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
        c(this.f6037f);
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((Handler) this.f6039h.f6013b.f1394g).post((Runnable) arrayList2.get(i7));
        }
        b1.b bVar3 = this.f6037f;
        c(bVar3);
        f(bVar3);
        return o2;
    }

    public final void e(Runnable runnable) {
        ((o5.b) this.f6039h.f6016e.f1230g).execute(runnable);
    }

    public final void f(b1.b bVar) {
        o5.i iVar = (o5.i) bVar.f1232i;
        iVar.getClass();
        if (iVar.f6852a.isEmpty()) {
            return;
        }
        for (Object obj : ((o5.i) bVar.f1232i).f6852a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            f(new b1.b((t5.c) entry.getKey(), bVar, (o5.i) entry.getValue(), 15));
        }
    }

    public final void g(t5.c cVar, Object obj) {
        if (cVar.equals(c.f6009b)) {
            this.f6033b.f6848f = ((Long) obj).longValue();
        }
        f fVar = new f(c.f6008a, cVar);
        try {
            t5.s d8 = a8.m.d(obj, t5.k.f8908j);
            l1.x xVar = this.f6035d;
            xVar.f5847g = ((t5.s) xVar.f5847g).u(fVar, d8);
            b(this.f6042k.l(fVar, d8));
        } catch (g5.b e9) {
            this.f6040i.i("Failed to parse info update", e9);
        }
    }

    public final String toString() {
        return this.f6032a.toString();
    }
}
