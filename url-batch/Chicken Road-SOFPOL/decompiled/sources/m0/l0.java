package m0;

import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l0 implements Iterator, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5002d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final f2 f5003e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5004f;

    /* renamed from: g, reason: collision with root package name */
    public int f5005g;

    /* renamed from: h, reason: collision with root package name */
    public int f5006h;

    public l0(f2 f2Var, int i, int i8) {
        this.f5003e = f2Var;
        this.f5004f = i8;
        this.f5005g = i;
        this.f5006h = f2Var.f4934k;
        if (f2Var.f4933j) {
            h2.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5002d) {
            case 0:
                return this.f5005g < this.f5004f;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5002d) {
            case 0:
                f2 f2Var = this.f5003e;
                int i = f2Var.f4934k;
                int i8 = this.f5006h;
                if (i != i8) {
                    h2.f();
                }
                int i9 = this.f5005g;
                this.f5005g = h2.a(f2Var.f4928d, i9) + i9;
                return new g2(f2Var, i9, i8);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5002d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l0(f2 f2Var, int i, m0 m0Var, b bVar) {
        this.f5003e = f2Var;
        this.f5004f = i;
        this.f5005g = f2Var.f4934k;
    }
}
