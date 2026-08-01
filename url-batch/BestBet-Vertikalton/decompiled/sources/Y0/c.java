package Y0;

import G1.AbstractC0001b;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f1505a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1506b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1507c;

    public c(d dVar, int i, int i2) {
        k1.e.e(dVar, "list");
        this.f1505a = dVar;
        this.f1506b = i;
        H1.d.l(i, i2, dVar.a());
        this.f1507c = i2 - i;
    }

    @Override // Y0.d
    public final int a() {
        return this.f1507c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f1507c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC0001b.d(i, i2, "index: ", ", size: "));
        }
        return this.f1505a.get(this.f1506b + i);
    }
}
