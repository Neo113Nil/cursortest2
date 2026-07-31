package e;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f474a;

    /* renamed from: b, reason: collision with root package name */
    public int f475b;

    /* renamed from: c, reason: collision with root package name */
    public int f476c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f477d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B.e f478e;

    public C0026c(B.e eVar, int i2) {
        this.f478e = eVar;
        this.f474a = i2;
        this.f475b = ((C0024a) eVar.f10d).f470d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f476c < this.f475b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f478e.b(this.f476c, this.f474a);
        this.f476c++;
        this.f477d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f477d) {
            throw new IllegalStateException();
        }
        int i2 = this.f476c - 1;
        this.f476c = i2;
        this.f475b--;
        this.f477d = false;
        this.f478e.c(i2);
    }
}
