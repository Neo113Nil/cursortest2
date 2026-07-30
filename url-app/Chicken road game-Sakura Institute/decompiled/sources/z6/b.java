package z6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public int f10117f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f10118g;

    /* renamed from: h, reason: collision with root package name */
    public int f10119h;

    /* renamed from: i, reason: collision with root package name */
    public w6.d f10120i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y6.e f10121j;

    public b(y6.e eVar) {
        this.f10121j = eVar;
        int e9 = v1.g.e(0, 0, ((CharSequence) eVar.f9908c).length());
        this.f10118g = e9;
        this.f10119h = e9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q6.e, r6.l] */
    public final void a() {
        y6.e eVar = this.f10121j;
        CharSequence charSequence = (CharSequence) eVar.f9908c;
        int i7 = this.f10119h;
        if (i7 < 0) {
            this.f10117f = 0;
            this.f10120i = null;
            return;
        }
        if (i7 > charSequence.length()) {
            this.f10120i = new w6.d(this.f10118g, h.B(charSequence), 1);
            this.f10119h = -1;
        } else {
            d6.j jVar = (d6.j) eVar.f9907b.d(charSequence, Integer.valueOf(this.f10119h));
            if (jVar == null) {
                this.f10120i = new w6.d(this.f10118g, h.B(charSequence), 1);
                this.f10119h = -1;
            } else {
                int intValue = ((Number) jVar.f2618f).intValue();
                int intValue2 = ((Number) jVar.f2619g).intValue();
                this.f10120i = v1.g.o(this.f10118g, intValue);
                int i8 = intValue + intValue2;
                this.f10118g = i8;
                this.f10119h = i8 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f10117f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10117f == -1) {
            a();
        }
        return this.f10117f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10117f == -1) {
            a();
        }
        if (this.f10117f == 0) {
            throw new NoSuchElementException();
        }
        w6.d dVar = this.f10120i;
        r6.k.d(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f10120i = null;
        this.f10117f = -1;
        return dVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
