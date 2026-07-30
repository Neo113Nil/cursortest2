package t3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x implements Iterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public int f8870f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y f8872h;

    public x(y yVar) {
        this.f8872h = yVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8870f + 1 < this.f8872h.f8874o.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8871g = true;
        i.h0 h0Var = this.f8872h.f8874o;
        int i7 = this.f8870f + 1;
        this.f8870f = i7;
        return (v) h0Var.f(i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8871g) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        i.h0 h0Var = this.f8872h.f8874o;
        ((v) h0Var.f(this.f8870f)).f8858g = null;
        int i7 = this.f8870f;
        Object[] objArr = h0Var.f4748h;
        Object obj = objArr[i7];
        Object obj2 = i.m.f4761c;
        if (obj != obj2) {
            objArr[i7] = obj2;
            h0Var.f4746f = true;
        }
        this.f8870f = i7 - 1;
        this.f8871g = false;
    }
}
