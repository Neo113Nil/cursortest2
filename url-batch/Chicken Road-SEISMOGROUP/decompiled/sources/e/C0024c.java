package e;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024c implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f530b;

    /* renamed from: c, reason: collision with root package name */
    public int f531c;

    /* renamed from: d, reason: collision with root package name */
    public int f532d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f533e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A.e f534f;

    public C0024c(A.e eVar, int i2) {
        this.f534f = eVar;
        this.f530b = i2;
        this.f531c = ((C0022a) eVar.f10e).f526d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f532d < this.f531c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object d2 = this.f534f.d(this.f532d, this.f530b);
        this.f532d++;
        this.f533e = true;
        return d2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f533e) {
            throw new IllegalStateException();
        }
        int i2 = this.f532d - 1;
        this.f532d = i2;
        this.f531c--;
        this.f533e = false;
        this.f534f.e(i2);
    }
}
