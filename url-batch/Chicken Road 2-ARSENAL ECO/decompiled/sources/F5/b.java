package F5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k5.C0477g;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public int f786f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f787g;

    /* renamed from: h, reason: collision with root package name */
    public int f788h;

    /* renamed from: i, reason: collision with root package name */
    public C5.c f789i;

    /* renamed from: j, reason: collision with root package name */
    public int f790j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c f791k;

    public b(c cVar) {
        this.f791k = cVar;
        int length = cVar.f792a.length();
        if (length < 0) {
            throw new IllegalArgumentException(C1.c.g("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f787g = length;
        this.f788h = length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i7 = this.f788h;
        if (i7 < 0) {
            this.f786f = 0;
            this.f789i = null;
            return;
        }
        c cVar = this.f791k;
        int i8 = cVar.f793b;
        if (i8 > 0) {
            int i9 = this.f790j + 1;
            this.f790j = i9;
        }
        if (i7 <= cVar.f792a.length()) {
            C0477g c0477g = (C0477g) cVar.f794c.invoke(cVar.f792a, Integer.valueOf(this.f788h));
            if (c0477g == null) {
                this.f789i = new C5.c(this.f787g, j.O(cVar.f792a), 1);
                this.f788h = -1;
            } else {
                int intValue = ((Number) c0477g.f5198f).intValue();
                int intValue2 = ((Number) c0477g.f5199g).intValue();
                this.f789i = i6.g.B(this.f787g, intValue);
                int i10 = intValue + intValue2;
                this.f787g = i10;
                this.f788h = i10 + (intValue2 == 0 ? 1 : 0);
            }
            this.f786f = 1;
        }
        this.f789i = new C5.c(this.f787g, j.O(cVar.f792a), 1);
        this.f788h = -1;
        this.f786f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f786f == -1) {
            a();
        }
        return this.f786f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f786f == -1) {
            a();
        }
        if (this.f786f == 0) {
            throw new NoSuchElementException();
        }
        C5.c cVar = this.f789i;
        kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f789i = null;
        this.f786f = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
