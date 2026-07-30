package o5;

import A.j;
import B5.f;
import B6.o;
import D6.w;
import E6.e;
import H6.q;
import H6.r;
import H6.s;
import j5.g;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.logging.Level;
import k5.h;
import kotlin.jvm.internal.Intrinsics;
import m5.c;
import m5.k;
import m5.n;
import n5.C0761c;
import p5.d;
import v5.C0975a;
import v5.C0977c;
import z5.InterfaceC1060a;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804b implements f {

    /* renamed from: d, reason: collision with root package name */
    public final g f7126d;

    /* renamed from: e, reason: collision with root package name */
    public final j5.b f7127e;

    /* renamed from: i, reason: collision with root package name */
    public final o f7128i;

    public C0804b(g gVar, j5.b bVar) {
        this.f7126d = gVar;
        this.f7127e = bVar;
        this.f7128i = new o(new C0803a(bVar));
    }

    @Override // B5.f
    public final C0977c p(Collection collection) {
        o oVar = this.f7128i;
        C0803a c0803a = (C0803a) oVar.f231d;
        if (oVar.f229b == 1) {
            C0761c c0761c = (C0761c) ((ConcurrentLinkedDeque) oVar.f230c).poll();
            if (c0761c == null) {
                c0761c = new C0761c();
            }
            c0761c.d(collection);
            C0977c c0977c = (C0977c) c0803a.apply(c0761c, Integer.valueOf(collection.size()));
            c0977c.f(new j(oVar, 24, c0761c));
            return c0977c;
        }
        C4.a aVar = new C4.a(27);
        int i2 = h.f6082a;
        IdentityHashMap identityHashMap = new IdentityHashMap(8);
        for (Object obj : collection) {
            InterfaceC1060a interfaceC1060a = (InterfaceC1060a) obj;
            ((List) ((Map) identityHashMap.computeIfAbsent(interfaceC1060a.i(), new C4.a(16))).computeIfAbsent(interfaceC1060a.k(), new C4.a(17))).add(aVar.apply(obj));
        }
        m5.j[] jVarArr = new m5.j[identityHashMap.size()];
        int i5 = 0;
        for (Map.Entry entry : identityHashMap.entrySet()) {
            m5.j[] jVarArr2 = new m5.j[((Map) entry.getValue()).size()];
            int i7 = 0;
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                jVarArr2[i7] = new m5.j(k.d((C0975a) entry2.getKey()), h.f(((C0975a) entry2.getKey()).f8222c), (List) entry2.getValue());
                i7++;
            }
            jVarArr[i5] = new m5.j(n.d((M5.a) entry.getKey()), h.f(((M5.a) entry.getKey()).f1770a), jVarArr2);
            i5++;
        }
        return (C0977c) c0803a.apply(new c(jVarArr), Integer.valueOf(collection.size()));
    }

    @Override // B5.f
    public final C0977c shutdown() {
        Socket socket;
        j5.b bVar = this.f7127e;
        if (!bVar.f5995b.compareAndSet(false, true)) {
            bVar.f5994a.a(Level.INFO, "Calling shutdown() multiple times.", null);
            return C0977c.f8229e;
        }
        d dVar = bVar.f5997d;
        D6.n nVar = ((w) dVar.f7205b).f598a;
        synchronized (nVar) {
            try {
                Iterator it = ((ArrayDeque) nVar.f543l).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    ((H6.n) it.next()).f1067i.c();
                }
                Iterator it2 = ((ArrayDeque) nVar.f544m).iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                while (it2.hasNext()) {
                    ((H6.n) it2.next()).f1067i.c();
                }
                Iterator it3 = ((ArrayDeque) nVar.f545n).iterator();
                Intrinsics.checkNotNullExpressionValue(it3, "iterator(...)");
                while (it3.hasNext()) {
                    ((q) it3.next()).c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar.f7204a) {
            ((w) dVar.f7205b).f598a.b().shutdownNow();
        }
        s sVar = (s) ((w) dVar.f7205b).f597B.f152e;
        Iterator it4 = sVar.f1106e.iterator();
        Intrinsics.checkNotNullExpressionValue(it4, "iterator(...)");
        while (it4.hasNext()) {
            r connection = (r) it4.next();
            Intrinsics.b(connection);
            synchronized (connection) {
                if (connection.f1100q.isEmpty()) {
                    it4.remove();
                    connection.f1094k = true;
                    socket = connection.f1090f;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                e.c(socket);
                Intrinsics.checkNotNullParameter(connection, "connection");
            }
        }
        if (sVar.f1106e.isEmpty()) {
            sVar.f1104c.a();
        }
        Iterator it5 = sVar.f1103b.values().iterator();
        if (!it5.hasNext()) {
            return C0977c.f8229e;
        }
        it5.next().getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", "OtlpHttpLogRecordExporter{", "}");
        stringJoiner.add(this.f7126d.a(false));
        int i2 = this.f7128i.f229b;
        stringJoiner.add("memoryMode=".concat(i2 != 1 ? i2 != 2 ? "null" : "IMMUTABLE_DATA" : "REUSABLE_DATA"));
        return stringJoiner.toString();
    }
}
