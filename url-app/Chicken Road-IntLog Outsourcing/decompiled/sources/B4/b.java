package B4;

import f4.C0430g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.InterfaceC1481a;
import y4.C1574c;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public int f288a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f289b;

    /* renamed from: c, reason: collision with root package name */
    public int f290c;

    /* renamed from: d, reason: collision with root package name */
    public C1574c f291d;

    /* renamed from: e, reason: collision with root package name */
    public int f292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f293f;

    public b(c cVar) {
        this.f293f = cVar;
        int i2 = cVar.f295b;
        int length = cVar.f294a.length();
        if (length < 0) {
            throw new IllegalArgumentException(B0.o.g(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        this.f289b = i2;
        this.f290c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i2 = this.f290c;
        if (i2 < 0) {
            this.f288a = 0;
            this.f291d = null;
            return;
        }
        c cVar = this.f293f;
        int i3 = cVar.f296c;
        if (i3 > 0) {
            int i6 = this.f292e + 1;
            this.f292e = i6;
        }
        if (i2 <= cVar.f294a.length()) {
            C0430g c0430g = (C0430g) cVar.f297d.invoke(cVar.f294a, Integer.valueOf(this.f290c));
            if (c0430g == null) {
                this.f291d = new C1574c(this.f289b, k.U(cVar.f294a), 1);
                this.f290c = -1;
            } else {
                int intValue = ((Number) c0430g.f5668a).intValue();
                int intValue2 = ((Number) c0430g.f5669b).intValue();
                this.f291d = K1.b.s0(this.f289b, intValue);
                int i7 = intValue + intValue2;
                this.f289b = i7;
                this.f290c = i7 + (intValue2 == 0 ? 1 : 0);
            }
            this.f288a = 1;
        }
        this.f291d = new C1574c(this.f289b, k.U(cVar.f294a), 1);
        this.f290c = -1;
        this.f288a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f288a == -1) {
            a();
        }
        return this.f288a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f288a == -1) {
            a();
        }
        if (this.f288a == 0) {
            throw new NoSuchElementException();
        }
        C1574c c1574c = this.f291d;
        kotlin.jvm.internal.i.c(c1574c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f291d = null;
        this.f288a = -1;
        return c1574c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
