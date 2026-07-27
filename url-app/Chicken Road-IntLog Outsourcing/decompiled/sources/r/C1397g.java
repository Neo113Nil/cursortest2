package r;

import X.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: r.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1397g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f11695a;

    /* renamed from: b, reason: collision with root package name */
    public int f11696b;

    /* renamed from: c, reason: collision with root package name */
    public int f11697c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11698d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f11699e;

    public C1397g(m mVar, int i2) {
        this.f11699e = mVar;
        this.f11695a = i2;
        this.f11696b = mVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11697c < this.f11696b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object c2 = this.f11699e.c(this.f11697c, this.f11695a);
        this.f11697c++;
        this.f11698d = true;
        return c2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f11698d) {
            throw new IllegalStateException();
        }
        int i2 = this.f11697c - 1;
        this.f11697c = i2;
        this.f11696b--;
        this.f11698d = false;
        this.f11699e.i(i2);
    }
}
