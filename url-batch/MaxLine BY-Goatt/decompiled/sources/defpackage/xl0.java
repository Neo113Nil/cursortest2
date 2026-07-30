package defpackage;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xl0 implements Iterator, k71 {
    public final Iterator n;
    public Object p;
    public final /* synthetic */ Sequence q;
    public final /* synthetic */ int m = 1;
    public int o = -1;

    public xl0(ps2 ps2Var) {
        this.q = ps2Var;
        this.n = ((Sequence) ps2Var.b).iterator();
    }

    public void a() {
        Object next;
        yl0 yl0Var = (yl0) this.q;
        do {
            Iterator it = this.n;
            if (!it.hasNext()) {
                this.o = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) yl0Var.b.invoke(next)).booleanValue());
        this.p = next;
        this.o = 1;
    }

    public void b() {
        Iterator it = this.n;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((ps2) this.q).c.invoke(next)).booleanValue()) {
                this.o = 1;
                this.p = next;
                return;
            }
        }
        this.o = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.m) {
            case 0:
                if (this.o == -1) {
                    a();
                }
                if (this.o == 1) {
                }
                break;
            default:
                if (this.o == -1) {
                    b();
                }
                if (this.o == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.m) {
            case 0:
                if (this.o == -1) {
                    a();
                }
                if (this.o == 0) {
                    b71.f();
                    break;
                } else {
                    Object obj = this.p;
                    this.p = null;
                    this.o = -1;
                    break;
                }
            default:
                if (this.o == -1) {
                    b();
                }
                if (this.o == 0) {
                    b71.f();
                    break;
                } else {
                    Object obj2 = this.p;
                    this.p = null;
                    this.o = -1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.m) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public xl0(yl0 yl0Var) {
        this.q = yl0Var;
        this.n = new zy2(yl0Var.a);
    }
}
