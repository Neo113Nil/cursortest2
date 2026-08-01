package q1;

import a.AbstractC0058a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, k1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3998a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3999b;

    /* renamed from: c, reason: collision with root package name */
    public int f4000c;

    /* renamed from: d, reason: collision with root package name */
    public n1.c f4001d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f4002f;

    public b(c cVar) {
        this.f4002f = cVar;
        int m2 = AbstractC0058a.m(cVar.f4004b, 0, cVar.f4003a.length());
        this.f3999b = m2;
        this.f4000c = m2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [i1.p, j1.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f4000c;
        if (i < 0) {
            this.f3998a = 0;
            this.f4001d = null;
            return;
        }
        c cVar = this.f4002f;
        int i2 = cVar.f4005c;
        String str = cVar.f4003a;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
        }
        if (i <= str.length()) {
            W0.d dVar = (W0.d) cVar.f4006d.d(str, Integer.valueOf(this.f4000c));
            if (dVar == null) {
                this.f4001d = new n1.c(this.f3999b, e.v0(str), 1);
                this.f4000c = -1;
            } else {
                int intValue = ((Number) dVar.f1338a).intValue();
                int intValue2 = ((Number) dVar.f1339b).intValue();
                this.f4001d = AbstractC0058a.e0(this.f3999b, intValue);
                int i4 = intValue + intValue2;
                this.f3999b = i4;
                this.f4000c = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.f3998a = 1;
        }
        this.f4001d = new n1.c(this.f3999b, e.v0(str), 1);
        this.f4000c = -1;
        this.f3998a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3998a == -1) {
            a();
        }
        return this.f3998a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3998a == -1) {
            a();
        }
        if (this.f3998a == 0) {
            throw new NoSuchElementException();
        }
        n1.c cVar = this.f4001d;
        j1.h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f4001d = null;
        this.f3998a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
