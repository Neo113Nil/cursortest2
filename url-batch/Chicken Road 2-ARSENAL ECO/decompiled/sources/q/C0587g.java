package q;

import Q.n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587g implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final int f5726f;

    /* renamed from: g, reason: collision with root package name */
    public int f5727g;

    /* renamed from: h, reason: collision with root package name */
    public int f5728h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5729i = false;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f5730j;

    public C0587g(n nVar, int i7) {
        this.f5730j = nVar;
        this.f5726f = i7;
        this.f5727g = nVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5728h < this.f5727g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object c7 = this.f5730j.c(this.f5728h, this.f5726f);
        this.f5728h++;
        this.f5729i = true;
        return c7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5729i) {
            throw new IllegalStateException();
        }
        int i7 = this.f5728h - 1;
        this.f5728h = i7;
        this.f5727g--;
        this.f5729i = false;
        this.f5730j.i(i7);
    }
}
