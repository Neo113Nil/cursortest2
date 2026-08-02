package n;

import I.C0079n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272e implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final int f3239e;

    /* renamed from: f, reason: collision with root package name */
    public int f3240f;

    /* renamed from: g, reason: collision with root package name */
    public int f3241g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3242h = false;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0079n f3243i;

    public C0272e(C0079n c0079n, int i2) {
        this.f3243i = c0079n;
        this.f3239e = i2;
        this.f3240f = ((C0268a) c0079n.f692h).f3257g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3241g < this.f3240f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object a2 = this.f3243i.a(this.f3241g, this.f3239e);
        this.f3241g++;
        this.f3242h = true;
        return a2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3242h) {
            throw new IllegalStateException();
        }
        int i2 = this.f3241g - 1;
        this.f3241g = i2;
        this.f3240f--;
        this.f3242h = false;
        this.f3243i.b(i2);
    }
}
