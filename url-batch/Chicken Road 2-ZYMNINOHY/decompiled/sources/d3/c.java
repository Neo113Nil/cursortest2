package d3;

import E.AbstractC0005f;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final d f8321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8322b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8323c;

    public c(d dVar, int i4, int i5) {
        this.f8321a = dVar;
        this.f8322b = i4;
        U.i.a(i4, i5, dVar.b());
        this.f8323c = i5 - i4;
    }

    @Override // d3.d
    public final int b() {
        return this.f8323c;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        int i5 = this.f8323c;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0005f.i(i4, i5, "index: ", ", size: "));
        }
        return this.f8321a.get(this.f8322b + i4);
    }

    @Override // d3.d, java.util.List
    public final List subList(int i4, int i5) {
        U.i.a(i4, i5, this.f8323c);
        int i6 = this.f8322b;
        return new c(this.f8321a, i4 + i6, i6 + i5);
    }
}
