package n1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3246a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3247b;

    /* renamed from: c, reason: collision with root package name */
    public int f3248c;
    public k1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3250f;

    public b(c cVar) {
        this.f3250f = cVar;
        int e2 = i0.g.e(cVar.f3252b, 0, cVar.f3251a.length());
        this.f3247b = e2;
        this.f3248c = e2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [f1.p, g1.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f3248c;
        if (i < 0) {
            this.f3246a = 0;
            this.d = null;
            return;
        }
        c cVar = this.f3250f;
        int i2 = cVar.f3253c;
        CharSequence charSequence = cVar.f3251a;
        if (i2 > 0) {
            int i3 = this.f3249e + 1;
            this.f3249e = i3;
        }
        if (i <= charSequence.length()) {
            U0.c cVar2 = (U0.c) cVar.d.c(charSequence, Integer.valueOf(this.f3248c));
            if (cVar2 == null) {
                this.d = new k1.c(this.f3247b, d.B(charSequence), 1);
                this.f3248c = -1;
            } else {
                int intValue = ((Number) cVar2.f897a).intValue();
                int intValue2 = ((Number) cVar2.f898b).intValue();
                this.d = i0.g.t(this.f3247b, intValue);
                int i4 = intValue + intValue2;
                this.f3247b = i4;
                this.f3248c = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.f3246a = 1;
        }
        this.d = new k1.c(this.f3247b, d.B(charSequence), 1);
        this.f3248c = -1;
        this.f3246a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3246a == -1) {
            a();
        }
        return this.f3246a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3246a == -1) {
            a();
        }
        if (this.f3246a == 0) {
            throw new NoSuchElementException();
        }
        k1.c cVar = this.d;
        g1.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f3246a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
