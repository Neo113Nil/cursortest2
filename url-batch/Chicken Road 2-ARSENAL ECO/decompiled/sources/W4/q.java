package W4;

import a5.C0232b;
import a5.C0233c;
import c5.C0290a;
import d5.AbstractC0331a;
import d5.C0333c;
import d5.C0335e;
import e5.C0346a;
import e5.C0349d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class q implements c4.k, c4.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2822f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final m f2823g;

    public q(v vVar, String str, String str2, String str3, V5.g gVar) {
        m mVar = new m(str, n.f2818j, 1, vVar);
        mVar.f2809d = str2;
        mVar.f2810e = str3;
        mVar.f2813h = gVar;
        this.f2823g = mVar;
    }

    @Override // c4.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r build() {
        return (r) this.f2823g.b(new B1.g(17));
    }

    @Override // c4.n
    /* renamed from: b, reason: collision with other method in class */
    public c4.n mo3b() {
        this.f2823g.f2809d = "The number of items queued";
        return this;
    }

    @Override // c4.n
    /* renamed from: e, reason: collision with other method in class */
    public c4.n mo4e() {
        this.f2823g.f2810e = "1";
        return this;
    }

    @Override // c4.n
    public c4.t f(U4.a aVar) {
        m mVar = this.f2823g;
        mVar.f2812g = n.f2817i;
        C0232b c7 = mVar.c();
        v vVar = (v) mVar.f2811f;
        O4.a aVar2 = vVar.f2839d;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : vVar.f2840e.entrySet()) {
            C0290a c0290a = (C0290a) entry.getKey();
            for (C0346a c0346a : c0290a.f3821b.a(c7, aVar2)) {
                C0349d c0349d = C0349d.f4014a;
                d dVar = c0346a.f4008b;
                if (c0349d != dVar.f2803a) {
                    int i7 = AbstractC0331a.f3959a;
                    C0233c.a(dVar, Z4.b.f3107f, c7);
                    throw null;
                }
            }
        }
        C0335e c0335e = new C0335e(c7, arrayList);
        C0333c c0333c = new C0333c(Collections.singletonList(c0335e), new G4.c(aVar, 4, c0335e));
        v vVar2 = (v) mVar.f2811f;
        synchronized (vVar2.f2836a) {
            vVar2.f2837b.add(c0333c);
        }
        return new x((v) mVar.f2811f, c0333c);
    }

    @Override // c4.k
    public c4.k g() {
        List list = Collections.EMPTY_LIST;
        try {
            Objects.requireNonNull(list, "bucketBoundaries must not be null");
            Y4.d.a(list);
            ((V5.g) this.f2823g.f2813h).f2734g = Collections.unmodifiableList(new ArrayList(list));
            return this;
        } catch (IllegalArgumentException | NullPointerException e4) {
            r.f2824i.warning("Error setting explicit bucket boundaries advice: " + e4.getMessage());
            return this;
        }
    }

    public final String toString() {
        switch (this.f2822f) {
            case 0:
                return this.f2823g.d(getClass().getSimpleName());
            default:
                return this.f2823g.d(getClass().getSimpleName());
        }
    }

    @Override // c4.k
    public c4.k b() {
        this.f2823g.f2809d = "The duration of exporting a batch of telemetry records";
        return this;
    }

    @Override // c4.k
    public c4.k e() {
        this.f2823g.f2810e = "s";
        return this;
    }

    public q(v vVar, String str) {
        this.f2823g = new m(str, n.f2816h, 2, vVar);
    }
}
