package D5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import v5.C0975a;

/* loaded from: classes.dex */
public class p implements J4.k, J4.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f376a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final m f377b;

    public p(u uVar, String str, String str2, String str3, D6.m mVar) {
        m mVar2 = new m(str, n.f372m, 1, uVar);
        mVar2.f366f = str2;
        mVar2.f367g = str3;
        mVar2.f365e = mVar;
        this.f377b = mVar2;
    }

    @Override // J4.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q build() {
        return (q) this.f377b.a(new A4.c(4));
    }

    @Override // J4.n
    /* renamed from: c, reason: collision with other method in class */
    public J4.n mo3c() {
        this.f377b.f366f = "The number of items queued";
        return this;
    }

    @Override // J4.n
    /* renamed from: e, reason: collision with other method in class */
    public J4.n mo4e() {
        this.f377b.f367g = "1";
        return this;
    }

    @Override // J4.n
    public J4.t f(B5.a aVar) {
        m mVar = this.f377b;
        mVar.f364d = n.f371l;
        H5.b b7 = mVar.b();
        u uVar = mVar.f362b;
        C0975a c0975a = uVar.f393d;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : uVar.f394e.entrySet()) {
            J5.a aVar2 = (J5.a) entry.getKey();
            for (L5.a aVar3 : aVar2.f1390b.a(b7, c0975a)) {
                L5.d dVar = L5.d.f1692a;
                d dVar2 = aVar3.f1686b;
                if (dVar != dVar2.f358a) {
                    int i2 = K5.a.f1463a;
                    H5.c.a(dVar2, G5.b.f844d, b7);
                    throw null;
                }
            }
        }
        K5.e eVar = new K5.e(b7, arrayList);
        K5.c cVar = new K5.c(Collections.singletonList(eVar), new A.j(aVar, 1, eVar));
        u uVar2 = mVar.f362b;
        synchronized (uVar2.f390a) {
            uVar2.f391b.add(cVar);
        }
        return new y(mVar.f362b, cVar);
    }

    @Override // J4.k
    public J4.k g() {
        List list = Collections.EMPTY_LIST;
        try {
            Objects.requireNonNull(list, "bucketBoundaries must not be null");
            F5.d.a(list);
            this.f377b.f365e.f539a = Collections.unmodifiableList(new ArrayList(list));
            return this;
        } catch (IllegalArgumentException | NullPointerException e7) {
            q.f378d.warning("Error setting explicit bucket boundaries advice: " + e7.getMessage());
            return this;
        }
    }

    public final String toString() {
        switch (this.f376a) {
            case 0:
                return this.f377b.c(getClass().getSimpleName());
            default:
                return this.f377b.c(getClass().getSimpleName());
        }
    }

    @Override // J4.k
    public J4.k c() {
        this.f377b.f366f = "The duration of exporting a batch of telemetry records";
        return this;
    }

    @Override // J4.k
    public J4.k e() {
        this.f377b.f367g = "s";
        return this;
    }

    public p(u uVar, String str) {
        this.f377b = new m(str, n.f370i, 2, uVar);
    }
}
