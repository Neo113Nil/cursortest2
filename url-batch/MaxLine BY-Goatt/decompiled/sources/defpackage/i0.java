package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class i0 implements Iterator, k71 {
    public final /* synthetic */ int m;
    public int n;
    public final Object o;

    public i0(oe0 oe0Var) {
        this.m = 2;
        this.o = oe0Var.a.iterator();
        this.n = oe0Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.m;
        Object obj = this.o;
        switch (i) {
            case 0:
                return this.n < ((h0) obj).a();
            case 1:
                return this.n < ((Object[]) obj).length;
            case 2:
                Iterator it = (Iterator) obj;
                while (this.n > 0 && it.hasNext()) {
                    it.next();
                    this.n--;
                }
                return it.hasNext();
            default:
                return this.n < ((yn2) obj).f();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.m;
        Object obj = this.o;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    b71.f();
                    return null;
                }
                int i2 = this.n;
                this.n = i2 + 1;
                return ((h0) obj).get(i2);
            case 1:
                try {
                    int i3 = this.n;
                    this.n = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.n--;
                    ch2.k(e.getMessage());
                    return null;
                }
            case 2:
                Iterator it = (Iterator) obj;
                while (this.n > 0 && it.hasNext()) {
                    it.next();
                    this.n--;
                }
                return it.next();
            default:
                int i4 = this.n;
                this.n = i4 + 1;
                return ((yn2) obj).g(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i0(Object[] objArr) {
        this.m = 1;
        objArr.getClass();
        this.o = objArr;
    }

    public /* synthetic */ i0(int i, Object obj) {
        this.m = i;
        this.o = obj;
    }
}
