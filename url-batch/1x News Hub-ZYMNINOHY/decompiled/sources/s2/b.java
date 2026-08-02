package s2;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import b2.C0190d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, m2.a {

    /* renamed from: a, reason: collision with root package name */
    public int f10317a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f10318b;

    /* renamed from: c, reason: collision with root package name */
    public int f10319c;

    /* renamed from: d, reason: collision with root package name */
    public p2.c f10320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f10321e;

    public b(c cVar) {
        this.f10321e = cVar;
        cVar.getClass();
        int length = cVar.f10322a.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0033i.i(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f10318b = length;
        this.f10319c = length;
    }

    public final void a() {
        int i3 = this.f10319c;
        if (i3 < 0) {
            this.f10317a = 0;
            this.f10320d = null;
            return;
        }
        c cVar = this.f10321e;
        cVar.getClass();
        String str = cVar.f10322a;
        if (i3 > str.length()) {
            this.f10320d = new p2.c(this.f10318b, n.S(str), 1);
            this.f10319c = -1;
        } else {
            C0190d c0190d = (C0190d) cVar.f10323b.invoke(str, Integer.valueOf(this.f10319c));
            if (c0190d == null) {
                this.f10320d = new p2.c(this.f10318b, n.S(str), 1);
                this.f10319c = -1;
            } else {
                int intValue = ((Number) c0190d.f2547a).intValue();
                int intValue2 = ((Number) c0190d.f2548b).intValue();
                this.f10320d = AbstractC0129a.G(this.f10318b, intValue);
                int i4 = intValue + intValue2;
                this.f10318b = i4;
                this.f10319c = i4 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f10317a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10317a == -1) {
            a();
        }
        return this.f10317a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10317a == -1) {
            a();
        }
        if (this.f10317a == 0) {
            throw new NoSuchElementException();
        }
        p2.c cVar = this.f10320d;
        kotlin.jvm.internal.j.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f10320d = null;
        this.f10317a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
