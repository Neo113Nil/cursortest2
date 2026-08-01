package p3;

import a.g0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements Iterator, j3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f3092f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f3093g;
    public int h;
    public m3.c i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o3.d f3094j;

    public b(o3.d dVar) {
        this.f3094j = dVar;
        int length = ((CharSequence) dVar.f3029b).length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.f3093g = length;
            this.h = length;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
    }

    public final void a() {
        o3.d dVar = this.f3094j;
        CharSequence charSequence = (CharSequence) dVar.f3029b;
        int i = this.h;
        if (i < 0) {
            this.f3092f = 0;
            this.i = null;
            return;
        }
        if (i > charSequence.length()) {
            this.i = new m3.c(this.f3093g, d.t0(charSequence), 1);
            this.h = -1;
        } else {
            g0 g0Var = (g0) dVar.f3030c;
            Integer valueOf = Integer.valueOf(this.h);
            char[] cArr = (char[]) g0Var.f25g;
            CharSequence charSequence2 = charSequence;
            int intValue = valueOf.intValue();
            i3.d.e(charSequence2, "$this$DelimitedRangesSequence");
            int x02 = d.x0(charSequence2, cArr, intValue, false);
            w2.a aVar = x02 < 0 ? null : new w2.a(Integer.valueOf(x02), 1);
            if (aVar == null) {
                this.i = new m3.c(this.f3093g, d.t0(charSequence), 1);
                this.h = -1;
            } else {
                int intValue2 = ((Number) aVar.f3814f).intValue();
                int intValue3 = ((Number) aVar.f3815g).intValue();
                this.i = b4.d.Y(this.f3093g, intValue2);
                int i4 = intValue2 + intValue3;
                this.f3093g = i4;
                this.h = i4 + (intValue3 == 0 ? 1 : 0);
            }
        }
        this.f3092f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3092f == -1) {
            a();
        }
        return this.f3092f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3092f == -1) {
            a();
        }
        if (this.f3092f == 0) {
            throw new NoSuchElementException();
        }
        m3.c cVar = this.i;
        i3.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.i = null;
        this.f3092f = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
