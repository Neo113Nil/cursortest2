package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hjg extends hjm {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public hjg(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.hjm
    public final int a() {
        return hoq.m(d(this.a), d(this.b));
    }

    @Override // defpackage.hjm
    public final int b() {
        return Math.max(e(this.a), e(this.b));
    }

    @Override // defpackage.hjm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c */
    public final hjr iterator() {
        return new hjf(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set set = this.a;
        int size = set.size();
        hjr it = ((hjn) this.b).iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
