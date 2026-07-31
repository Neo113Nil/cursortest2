package t1;

import g2.InterfaceC0439a;
import j.AbstractC0539m;
import j.C0525G;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class w implements Iterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public int f8944d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f8946f;

    public w(x xVar) {
        this.f8946f = xVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8944d + 1 < this.f8946f.f8948m.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8945e = true;
        C0525G c0525g = this.f8946f.f8948m;
        int i3 = this.f8944d + 1;
        this.f8944d = i3;
        return (u) c0525g.f(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8945e) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        C0525G c0525g = this.f8946f.f8948m;
        ((u) c0525g.f(this.f8944d)).f8932e = null;
        int i3 = this.f8944d;
        Object[] objArr = c0525g.f6261f;
        Object obj = objArr[i3];
        Object obj2 = AbstractC0539m.f6293c;
        if (obj != obj2) {
            objArr[i3] = obj2;
            c0525g.f6259d = true;
        }
        this.f8944d = i3 - 1;
        this.f8945e = false;
    }
}
