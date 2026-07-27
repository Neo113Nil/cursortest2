package s1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class x implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f10582d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10583e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y f10584i;

    public x(y yVar) {
        this.f10584i = yVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10582d + 1 < this.f10584i.f10586o.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10583e = true;
        i.H h4 = this.f10584i.f10586o;
        int i2 = this.f10582d + 1;
        this.f10582d = i2;
        return (v) h4.f(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10583e) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        i.H h4 = this.f10584i.f10586o;
        ((v) h4.f(this.f10582d)).f10571e = null;
        int i2 = this.f10582d;
        Object[] objArr = h4.f6898i;
        Object obj = objArr[i2];
        Object obj2 = i.n.f6931c;
        if (obj != obj2) {
            objArr[i2] = obj2;
            h4.f6896d = true;
        }
        this.f10582d = i2 - 1;
        this.f10583e = false;
    }
}
