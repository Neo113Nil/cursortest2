package H4;

import C4.h;
import D4.j;
import F4.k;
import F4.n;
import G4.d;
import O4.c;
import U4.e;
import X5.s;
import b6.q;
import b6.r;
import f5.C0387a;
import java.net.Socket;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.logging.Level;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: f, reason: collision with root package name */
    public final h f1019f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.b f1020g;

    /* renamed from: h, reason: collision with root package name */
    public final D1.b f1021h;

    public b(h hVar, C4.b bVar) {
        this.f1019f = hVar;
        this.f1020g = bVar;
        this.f1021h = new D1.b(new a(bVar));
    }

    @Override // U4.e
    public final c r(Collection collection) {
        D1.b bVar = this.f1021h;
        a aVar = (a) bVar.f370d;
        int i7 = 0;
        if (bVar.f368b == 1) {
            d dVar = (d) ((ConcurrentLinkedDeque) bVar.f369c).poll();
            if (dVar == null) {
                dVar = new d();
            }
            dVar.d(collection);
            c cVar = (c) aVar.apply(dVar, Integer.valueOf(collection.size()));
            cVar.f(new G4.c(bVar, 0, dVar));
            return cVar;
        }
        A4.b bVar2 = new A4.b(13);
        int i8 = j.f544a;
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        for (Object obj : collection) {
            S4.a aVar2 = (S4.a) obj;
            ((List) ((Map) identityHashMap.computeIfAbsent(aVar2.i(), new A4.b(2))).computeIfAbsent(aVar2.k(), new A4.b(3))).add(bVar2.apply(obj));
        }
        F4.j[] jVarArr = new F4.j[identityHashMap.size()];
        int i9 = 0;
        for (Map.Entry entry : identityHashMap.entrySet()) {
            F4.j[] jVarArr2 = new F4.j[((Map) entry.getValue()).size()];
            int i10 = i7;
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                jVarArr2[i10] = new F4.j(k.d((O4.a) entry2.getKey()), j.f(((O4.a) entry2.getKey()).f1780c), (List) entry2.getValue());
                i10++;
            }
            jVarArr[i9] = new F4.j(n.d((C0387a) entry.getKey()), j.f(((C0387a) entry.getKey()).f4249a), jVarArr2);
            i9++;
            i7 = 0;
        }
        return (c) aVar.apply(new F4.c(jVarArr), Integer.valueOf(collection.size()));
    }

    @Override // U4.e
    public final c shutdown() {
        Socket socket;
        C4.b bVar = this.f1020g;
        if (!bVar.f206b.compareAndSet(false, true)) {
            bVar.f205a.a(Level.INFO, "Calling shutdown() multiple times.", null);
            return c.f1787e;
        }
        I4.e eVar = bVar.f208d;
        X5.k kVar = ((s) eVar.f1210b).f3011a;
        synchronized (kVar) {
            try {
                Iterator it = kVar.f2963d.iterator();
                i.d(it, "iterator(...)");
                while (it.hasNext()) {
                    ((b6.n) it.next()).f3677h.c();
                }
                Iterator it2 = kVar.f2964e.iterator();
                i.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    ((b6.n) it2.next()).f3677h.c();
                }
                Iterator it3 = kVar.f2965f.iterator();
                i.d(it3, "iterator(...)");
                while (it3.hasNext()) {
                    ((q) it3.next()).c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eVar.f1209a) {
            ((s) eVar.f1210b).f3011a.a().shutdownNow();
        }
        b6.s sVar = (b6.s) ((s) eVar.f1210b).f3010B.f2734g;
        Iterator it4 = sVar.f3719f.iterator();
        i.d(it4, "iterator(...)");
        while (it4.hasNext()) {
            r rVar = (r) it4.next();
            i.b(rVar);
            synchronized (rVar) {
                if (rVar.f3712r.isEmpty()) {
                    it4.remove();
                    rVar.f3706l = true;
                    socket = rVar.f3700f;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Y5.e.c(socket);
            }
        }
        if (sVar.f3719f.isEmpty()) {
            sVar.f3717d.a();
        }
        Iterator it5 = sVar.f3716c.values().iterator();
        if (!it5.hasNext()) {
            return c.f1787e;
        }
        it5.next().getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpLogRecordExporter{", "}");
        stringJoiner.add(this.f1019f.a(false));
        int i7 = this.f1021h.f368b;
        stringJoiner.add("memoryMode=".concat(i7 != 1 ? i7 != 2 ? "null" : "IMMUTABLE_DATA" : "REUSABLE_DATA"));
        return stringJoiner.toString();
    }
}
