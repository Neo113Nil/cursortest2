package J;

import a.AbstractC0345a;
import java.util.List;
import z2.AbstractC1420d;

/* loaded from: classes.dex */
public final class a extends AbstractC1420d {

    /* renamed from: e, reason: collision with root package name */
    public final K.c f3377e;

    /* renamed from: i, reason: collision with root package name */
    public final int f3378i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3379j;

    public a(K.c cVar, int i2, int i4) {
        this.f3377e = cVar;
        this.f3378i = i2;
        AbstractC0345a.l(i2, i4, cVar.size());
        this.f3379j = i4 - i2;
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f3379j;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0345a.j(i2, this.f3379j);
        return this.f3377e.get(this.f3378i + i2);
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final List subList(int i2, int i4) {
        AbstractC0345a.l(i2, i4, this.f3379j);
        int i5 = this.f3378i;
        return new a(this.f3377e, i2 + i5, i5 + i4);
    }
}
