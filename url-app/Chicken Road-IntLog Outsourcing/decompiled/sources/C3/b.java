package C3;

import A3.k;
import A3.l;
import A3.o;
import B3.d;
import P3.e;
import T4.u;
import X4.r;
import X4.s;
import X4.t;
import a4.AbstractC0197c;
import a4.C0195a;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Level;
import kotlin.jvm.internal.i;
import x3.c;
import x3.g;
import y3.h;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final g f387a;

    /* renamed from: b, reason: collision with root package name */
    public final c f388b;

    /* renamed from: c, reason: collision with root package name */
    public final d f389c;

    public b(g gVar, c cVar) {
        this.f387a = gVar;
        this.f388b = cVar;
        this.f389c = new d(new a(cVar));
    }

    @Override // P3.e
    public final J3.c export(Collection collection) {
        int i2 = 0;
        boolean z = true;
        d dVar = this.f389c;
        a aVar = (a) dVar.f278d;
        if (dVar.f276b == 1) {
            B3.e eVar = (B3.e) ((ConcurrentLinkedDeque) dVar.f277c).poll();
            if (eVar == null) {
                eVar = new B3.e();
            }
            eVar.d(collection);
            J3.c cVar = (J3.c) aVar.apply(eVar, Integer.valueOf(collection.size()));
            cVar.f(new B3.c(dVar, 0, eVar));
            return cVar;
        }
        A3.b bVar = new A3.b(7);
        int i3 = h.f12409a;
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        for (Object obj : collection) {
            N3.a aVar2 = (N3.a) obj;
            ((List) ((Map) identityHashMap.computeIfAbsent(aVar2.j(), new A3.b(28))).computeIfAbsent(aVar2.l(), new A3.b(29))).add(bVar.apply(obj));
        }
        k[] kVarArr = new k[identityHashMap.size()];
        int i6 = 0;
        for (Map.Entry entry : identityHashMap.entrySet()) {
            k[] kVarArr2 = new k[((Map) entry.getValue()).size()];
            int i7 = i2;
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                kVarArr2[i7] = new k(l.d((J3.a) entry2.getKey()), h.f(((J3.a) entry2.getKey()).f1354c), (List) entry2.getValue());
                i7++;
                z = true;
            }
            kVarArr[i6] = new k(o.d((AbstractC0197c) entry.getKey()), h.f(((C0195a) ((AbstractC0197c) entry.getKey())).f3884b), kVarArr2);
            i6++;
            z = z;
            i2 = 0;
        }
        return (J3.c) aVar.apply(new A3.d(kVarArr), Integer.valueOf(collection.size()));
    }

    @Override // P3.e
    public final J3.c flush() {
        return J3.c.f1361e;
    }

    @Override // P3.e
    public final J3.c shutdown() {
        Socket socket;
        c cVar = this.f388b;
        if (!cVar.f12312b.compareAndSet(false, true)) {
            cVar.f12311a.a(Level.INFO, "Calling shutdown() multiple times.", null);
            return J3.c.f1361e;
        }
        B2.a aVar = (B2.a) cVar.f12314d;
        T4.l lVar = ((u) aVar.f240b).f2960a;
        synchronized (lVar) {
            try {
                Iterator it = ((ArrayDeque) lVar.f2904d).iterator();
                i.d(it, "iterator(...)");
                while (it.hasNext()) {
                    ((X4.o) it.next()).f3586c.c();
                }
                Iterator it2 = ((ArrayDeque) lVar.f2905e).iterator();
                i.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    ((X4.o) it2.next()).f3586c.c();
                }
                Iterator it3 = ((ArrayDeque) lVar.f2906f).iterator();
                i.d(it3, "iterator(...)");
                while (it3.hasNext()) {
                    ((r) it3.next()).c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar.f239a) {
            ((ThreadPoolExecutor) ((u) aVar.f240b).f2960a.a()).shutdownNow();
        }
        t tVar = (t) ((u) aVar.f240b).f2959B.f215b;
        Iterator it4 = tVar.f3630g.iterator();
        i.d(it4, "iterator(...)");
        while (it4.hasNext()) {
            s sVar = (s) it4.next();
            i.b(sVar);
            synchronized (sVar) {
                if (sVar.f3622s.isEmpty()) {
                    it4.remove();
                    sVar.f3616m = true;
                    socket = sVar.f3609f;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                U4.e.c(socket);
            }
        }
        if (tVar.f3630g.isEmpty()) {
            tVar.f3628e.a();
        }
        Iterator it5 = tVar.f3627d.values().iterator();
        if (!it5.hasNext()) {
            return J3.c.f1361e;
        }
        it5.next().getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpLogRecordExporter{", "}");
        stringJoiner.add(this.f387a.a(false));
        int i2 = this.f389c.f276b;
        stringJoiner.add("memoryMode=".concat(i2 != 1 ? i2 != 2 ? "null" : "IMMUTABLE_DATA" : "REUSABLE_DATA"));
        return stringJoiner.toString();
    }
}
