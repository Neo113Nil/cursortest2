package r4;

import h4.j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.r;
import o.u0;
import o4.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public int f6611d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f6613f;

    public i(j jVar) {
        this.f6613f = jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6611d + 1 < ((u0) this.f6613f.f3191d).f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6612e = true;
        u0 u0Var = (u0) this.f6613f.f3191d;
        int i = this.f6611d + 1;
        this.f6611d = i;
        return (o) u0Var.g(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6612e) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        u0 u0Var = (u0) this.f6613f.f3191d;
        ((o) u0Var.g(this.f6611d)).f5672f = null;
        int i = this.f6611d;
        Object[] objArr = u0Var.f5549f;
        Object obj = objArr[i];
        Object obj2 = r.f5527c;
        if (obj != obj2) {
            objArr[i] = obj2;
            u0Var.f5547d = true;
        }
        this.f6611d = i - 1;
        this.f6612e = false;
    }
}
