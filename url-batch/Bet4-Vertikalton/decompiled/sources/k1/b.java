package k1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, e1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2757a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2758b;

    /* renamed from: c, reason: collision with root package name */
    public int f2759c;
    public h1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f2760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f2761f;

    public b(c cVar) {
        this.f2761f = cVar;
        int i = cVar.f2763b;
        int length = cVar.f2762a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.f2758b = i;
        this.f2759c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [c1.p, d1.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f2759c;
        if (i < 0) {
            this.f2757a = 0;
            this.d = null;
            return;
        }
        c cVar = this.f2761f;
        int i2 = cVar.f2764c;
        CharSequence charSequence = cVar.f2762a;
        if (i2 > 0) {
            int i3 = this.f2760e + 1;
            this.f2760e = i3;
        }
        if (i <= charSequence.length()) {
            R0.c cVar2 = (R0.c) cVar.d.c(charSequence, Integer.valueOf(this.f2759c));
            if (cVar2 == null) {
                this.d = new h1.c(this.f2758b, d.B(charSequence), 1);
                this.f2759c = -1;
            } else {
                int intValue = ((Number) cVar2.f773a).intValue();
                int intValue2 = ((Number) cVar2.f774b).intValue();
                this.d = h1.d.s(this.f2758b, intValue);
                int i4 = intValue + intValue2;
                this.f2758b = i4;
                this.f2759c = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.f2757a = 1;
        }
        this.d = new h1.c(this.f2758b, d.B(charSequence), 1);
        this.f2759c = -1;
        this.f2757a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2757a == -1) {
            a();
        }
        return this.f2757a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2757a == -1) {
            a();
        }
        if (this.f2757a == 0) {
            throw new NoSuchElementException();
        }
        h1.c cVar = this.d;
        d1.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f2757a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
