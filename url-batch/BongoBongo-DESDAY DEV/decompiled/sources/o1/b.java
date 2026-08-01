package o1;

import h.AbstractC0112a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3419a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3420b;

    /* renamed from: c, reason: collision with root package name */
    public int f3421c;
    public l1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3423f;

    public b(c cVar) {
        this.f3423f = cVar;
        int e2 = AbstractC0112a.e(cVar.f3425b, 0, cVar.f3424a.length());
        this.f3420b = e2;
        this.f3421c = e2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [g1.p, h1.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f3421c;
        if (i < 0) {
            this.f3419a = 0;
            this.d = null;
            return;
        }
        c cVar = this.f3423f;
        int i2 = cVar.f3426c;
        CharSequence charSequence = cVar.f3424a;
        if (i2 > 0) {
            int i3 = this.f3422e + 1;
            this.f3422e = i3;
        }
        if (i <= charSequence.length()) {
            V0.b bVar = (V0.b) cVar.d.c(charSequence, Integer.valueOf(this.f3421c));
            if (bVar == null) {
                this.d = new l1.c(this.f3420b, d.B(charSequence), 1);
                this.f3421c = -1;
            } else {
                int intValue = ((Number) bVar.f939a).intValue();
                int intValue2 = ((Number) bVar.f940b).intValue();
                this.d = AbstractC0112a.u(this.f3420b, intValue);
                int i4 = intValue + intValue2;
                this.f3420b = i4;
                this.f3421c = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.f3419a = 1;
        }
        this.d = new l1.c(this.f3420b, d.B(charSequence), 1);
        this.f3421c = -1;
        this.f3419a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3419a == -1) {
            a();
        }
        return this.f3419a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3419a == -1) {
            a();
        }
        if (this.f3419a == 0) {
            throw new NoSuchElementException();
        }
        l1.c cVar = this.d;
        h1.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f3419a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
