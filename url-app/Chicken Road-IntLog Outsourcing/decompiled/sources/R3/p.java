package R3;

import E.C0028c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class p implements X2.k, X2.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2642a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final m f2643b;

    public p(u uVar, String str, String str2, String str3, T4.k kVar) {
        m mVar = new m(str, n.f2638e, 1, uVar);
        mVar.f2629d = str2;
        mVar.f2630e = str3;
        mVar.f2633h = kVar;
        this.f2643b = mVar;
    }

    @Override // X2.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q build() {
        return (q) this.f2643b.b(new C0028c(16));
    }

    @Override // X2.k
    public X2.k b() {
        this.f2643b.f2629d = "The duration of exporting a batch of telemetry records";
        return this;
    }

    @Override // X2.k
    public X2.k e() {
        this.f2643b.f2630e = "s";
        return this;
    }

    @Override // X2.n
    public X2.t f(P3.a aVar) {
        m mVar = this.f2643b;
        mVar.f2632g = n.f2637d;
        V3.b c2 = mVar.c();
        u uVar = (u) mVar.f2631f;
        uVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = uVar.f2660e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            J3.a aVar2 = uVar.f2659d;
            if (!hasNext) {
                Y3.e eVar = new Y3.e(c2, arrayList);
                Y3.c cVar = new Y3.c(Collections.singletonList(eVar), new B3.c(aVar, 7, eVar));
                u uVar2 = (u) mVar.f2631f;
                synchronized (uVar2.f2656a) {
                    uVar2.f2657b.add(cVar);
                }
                return new w((u) mVar.f2631f, cVar);
            }
            Map.Entry entry = (Map.Entry) it.next();
            X3.a aVar3 = (X3.a) entry.getKey();
            for (Z3.a aVar4 : aVar3.f3522b.a(c2, aVar2)) {
                Z3.d dVar = Z3.d.f3782a;
                d dVar2 = aVar4.f3776b;
                if (dVar != dVar2.f2623a) {
                    int i2 = Y3.a.f3696a;
                    V3.c.a(dVar2, U3.b.f3171a, c2);
                    throw null;
                }
            }
        }
    }

    @Override // X2.k
    public X2.k g(List list) {
        try {
            Objects.requireNonNull(list, "bucketBoundaries must not be null");
            T3.d.a(list);
            T4.k kVar = (T4.k) this.f2643b.f2633h;
            kVar.getClass();
            kVar.f2900a = Collections.unmodifiableList(new ArrayList(list));
            return this;
        } catch (IllegalArgumentException | NullPointerException e3) {
            q.f2644d.warning("Error setting explicit bucket boundaries advice: " + e3.getMessage());
            return this;
        }
    }

    public final String toString() {
        switch (this.f2642a) {
            case 0:
                return this.f2643b.d(getClass().getSimpleName());
            default:
                return this.f2643b.d(getClass().getSimpleName());
        }
    }

    @Override // X2.n
    /* renamed from: b, reason: collision with other method in class */
    public X2.n mo3b() {
        this.f2643b.f2629d = "The number of items queued";
        return this;
    }

    @Override // X2.n
    /* renamed from: e, reason: collision with other method in class */
    public X2.n mo4e() {
        this.f2643b.f2630e = "1";
        return this;
    }

    public p(u uVar, String str) {
        this.f2643b = new m(str, n.f2636c, 2, uVar);
    }
}
