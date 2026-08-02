package w3;

import E.AbstractC0005f;
import c3.C0292d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.InterfaceC1349a;
import t3.C1443c;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505b implements Iterator, InterfaceC1349a {

    /* renamed from: a, reason: collision with root package name */
    public int f15937a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f15938b;

    /* renamed from: c, reason: collision with root package name */
    public int f15939c;

    /* renamed from: d, reason: collision with root package name */
    public C1443c f15940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1506c f15941e;

    public C1505b(C1506c c1506c) {
        this.f15941e = c1506c;
        int length = c1506c.f15942a.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC0005f.k(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f15938b = length;
        this.f15939c = length;
    }

    public final void a() {
        C1506c c1506c = this.f15941e;
        CharSequence charSequence = c1506c.f15942a;
        int i4 = this.f15939c;
        if (i4 < 0) {
            this.f15937a = 0;
            this.f15940d = null;
            return;
        }
        if (i4 > charSequence.length()) {
            this.f15940d = new C1443c(this.f15938b, AbstractC1510g.e0(charSequence), 1);
            this.f15939c = -1;
        } else {
            C0292d c0292d = (C0292d) c1506c.f15943b.invoke(charSequence, Integer.valueOf(this.f15939c));
            if (c0292d == null) {
                this.f15940d = new C1443c(this.f15938b, AbstractC1510g.e0(charSequence), 1);
                this.f15939c = -1;
            } else {
                int intValue = ((Number) c0292d.f5724a).intValue();
                int intValue2 = ((Number) c0292d.f5725b).intValue();
                this.f15940d = O3.d.H(this.f15938b, intValue);
                int i5 = intValue + intValue2;
                this.f15938b = i5;
                this.f15939c = i5 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f15937a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15937a == -1) {
            a();
        }
        return this.f15937a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15937a == -1) {
            a();
        }
        if (this.f15937a == 0) {
            throw new NoSuchElementException();
        }
        C1443c c1443c = this.f15940d;
        kotlin.jvm.internal.i.c(c1443c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f15940d = null;
        this.f15937a = -1;
        return c1443c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
