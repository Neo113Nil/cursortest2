package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dm2 implements Iterator {
    public final /* synthetic */ int m;
    public int n;
    public boolean o;
    public Iterator p;
    public final /* synthetic */ AbstractMap q;

    public /* synthetic */ dm2(cp3 cp3Var) {
        this.m = 1;
        Objects.requireNonNull(cp3Var);
        this.q = cp3Var;
        this.n = -1;
    }

    public Iterator a() {
        if (this.p == null) {
            this.p = ((bm2) this.q).n.entrySet().iterator();
        }
        return this.p;
    }

    public Iterator b() {
        if (this.p == null) {
            this.p = ((cp3) this.q).o.entrySet().iterator();
        }
        return this.p;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.m;
        AbstractMap abstractMap = this.q;
        switch (i) {
            case 0:
                bm2 bm2Var = (bm2) abstractMap;
                if (this.n + 1 >= bm2Var.m.size()) {
                    if (bm2Var.n.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                cp3 cp3Var = (cp3) abstractMap;
                if (this.n + 1 >= cp3Var.n) {
                    if (cp3Var.o.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.m;
        AbstractMap abstractMap = this.q;
        switch (i) {
            case 0:
                this.o = true;
                int i2 = this.n + 1;
                this.n = i2;
                bm2 bm2Var = (bm2) abstractMap;
                return i2 < bm2Var.m.size() ? (Map.Entry) bm2Var.m.get(this.n) : (Map.Entry) a().next();
            default:
                this.o = true;
                int i3 = this.n + 1;
                this.n = i3;
                cp3 cp3Var = (cp3) abstractMap;
                return i3 < cp3Var.n ? (dp3) cp3Var.m[i3] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.m;
        AbstractMap abstractMap = this.q;
        switch (i) {
            case 0:
                bm2 bm2Var = (bm2) abstractMap;
                if (!this.o) {
                    lh.g("remove() was called before next()");
                    break;
                } else {
                    this.o = false;
                    int i2 = bm2.r;
                    bm2Var.b();
                    if (this.n >= bm2Var.m.size()) {
                        a().remove();
                        break;
                    } else {
                        int i3 = this.n;
                        this.n = i3 - 1;
                        bm2Var.h(i3);
                        break;
                    }
                }
            default:
                if (!this.o) {
                    lh.g("remove() was called before next()");
                    break;
                } else {
                    this.o = false;
                    cp3 cp3Var = (cp3) abstractMap;
                    cp3Var.f();
                    int i4 = this.n;
                    if (i4 >= cp3Var.n) {
                        b().remove();
                        break;
                    } else {
                        this.n = i4 - 1;
                        cp3Var.d(i4);
                        break;
                    }
                }
        }
    }

    public dm2(bm2 bm2Var) {
        this.m = 0;
        this.q = bm2Var;
        this.n = -1;
    }
}
