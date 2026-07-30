package e;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f106b;

    /* renamed from: c, reason: collision with root package name */
    public int f107c;

    /* renamed from: d, reason: collision with root package name */
    public int f108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f109e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0.e f110f;

    public c(c0.e eVar, int i2) {
        this.f110f = eVar;
        this.f106b = i2;
        this.f107c = ((a) eVar.f73d).f102d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f108d < this.f107c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f110f.b(this.f108d, this.f106b);
        this.f108d++;
        this.f109e = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f109e) {
            throw new IllegalStateException();
        }
        int i2 = this.f108d - 1;
        this.f108d = i2;
        this.f107c--;
        this.f109e = false;
        this.f110f.c(i2);
    }
}
