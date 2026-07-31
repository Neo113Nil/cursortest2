package h2;

import c2.h;
import java.util.Collections;
import java.util.List;
import o2.m0;

/* loaded from: classes.dex */
final class d implements h {

    /* renamed from: f, reason: collision with root package name */
    private final List<List<c2.b>> f16818f;

    /* renamed from: g, reason: collision with root package name */
    private final List<Long> f16819g;

    public d(List<List<c2.b>> list, List<Long> list2) {
        this.f16818f = list;
        this.f16819g = list2;
    }

    @Override // c2.h
    public int b(long j7) {
        int d7 = m0.d(this.f16819g, Long.valueOf(j7), false, false);
        if (d7 < this.f16819g.size()) {
            return d7;
        }
        return -1;
    }

    @Override // c2.h
    public long d(int i7) {
        o2.a.a(i7 >= 0);
        o2.a.a(i7 < this.f16819g.size());
        return this.f16819g.get(i7).longValue();
    }

    @Override // c2.h
    public List<c2.b> e(long j7) {
        int f7 = m0.f(this.f16819g, Long.valueOf(j7), true, false);
        return f7 == -1 ? Collections.emptyList() : this.f16818f.get(f7);
    }

    @Override // c2.h
    public int f() {
        return this.f16819g.size();
    }
}
