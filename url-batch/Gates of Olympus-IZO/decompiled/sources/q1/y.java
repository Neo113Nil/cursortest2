package q1;

import a2.InterfaceC0184a;
import j.AbstractC0495m;
import j.C0481G;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class y implements Iterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public int f6975d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f6977f;

    public y(z zVar) {
        this.f6977f = zVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6975d + 1 < this.f6977f.f6979m.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6976e = true;
        C0481G c0481g = this.f6977f.f6979m;
        int i3 = this.f6975d + 1;
        this.f6975d = i3;
        return (w) c0481g.f(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6976e) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        C0481G c0481g = this.f6977f.f6979m;
        ((w) c0481g.f(this.f6975d)).f6963e = null;
        int i3 = this.f6975d;
        Object[] objArr = c0481g.f5143f;
        Object obj = objArr[i3];
        Object obj2 = AbstractC0495m.f5175c;
        if (obj != obj2) {
            objArr[i3] = obj2;
            c0481g.f5141d = true;
        }
        this.f6975d = i3 - 1;
        this.f6976e = false;
    }
}
