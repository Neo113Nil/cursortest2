package r1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import l1.InterfaceC0284a;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0284a {

    /* renamed from: a, reason: collision with root package name */
    public int f3836a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3837b;

    /* renamed from: c, reason: collision with root package name */
    public int f3838c;
    public o1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3840f;

    public b(c cVar) {
        this.f3840f = cVar;
        int e2 = b1.g.e(cVar.f3842b, cVar.f3841a.length());
        this.f3837b = e2;
        this.f3838c = e2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [j1.p, k1.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f3838c;
        if (i < 0) {
            this.f3836a = 0;
            this.d = null;
            return;
        }
        c cVar = this.f3840f;
        int i2 = cVar.f3843c;
        CharSequence charSequence = cVar.f3841a;
        if (i2 > 0) {
            int i3 = this.f3839e + 1;
            this.f3839e = i3;
        }
        if (i <= charSequence.length()) {
            X0.c cVar2 = (X0.c) cVar.d.d(charSequence, Integer.valueOf(this.f3838c));
            if (cVar2 == null) {
                this.d = new o1.c(this.f3837b, d.F(charSequence), 1);
                this.f3838c = -1;
            } else {
                int intValue = ((Number) cVar2.f1270a).intValue();
                int intValue2 = ((Number) cVar2.f1271b).intValue();
                this.d = b1.g.C(this.f3837b, intValue);
                int i4 = intValue + intValue2;
                this.f3837b = i4;
                this.f3838c = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.f3836a = 1;
        }
        this.d = new o1.c(this.f3837b, d.F(charSequence), 1);
        this.f3838c = -1;
        this.f3836a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3836a == -1) {
            a();
        }
        return this.f3836a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3836a == -1) {
            a();
        }
        if (this.f3836a == 0) {
            throw new NoSuchElementException();
        }
        o1.c cVar = this.d;
        k1.e.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f3836a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
