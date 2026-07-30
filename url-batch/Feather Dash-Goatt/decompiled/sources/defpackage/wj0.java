package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class wj0 {
    public int d;
    public int e;
    public int g;
    public Object h;

    public wj0() {
        if (sc1.b == null) {
            sc1.b = new sc1(4);
        }
    }

    public int a(int i) {
        if (i < this.g) {
            return ((ByteBuffer) this.h).getShort(this.e + i);
        }
        return 0;
    }

    public void b() {
        if (((xj0) this.h).l != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.d;
            xj0 xj0Var = (xj0) this.h;
            if (i >= xj0Var.j || xj0Var.g[i] >= 0) {
                return;
            } else {
                this.d = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.d < ((xj0) this.h).j;
    }

    public void remove() {
        xj0 xj0Var = (xj0) this.h;
        b();
        if (this.e == -1) {
            dd0.j("Call next() before removing element from the iterator.");
            return;
        }
        xj0Var.b();
        xj0Var.j(this.e);
        this.e = -1;
        this.g = xj0Var.l;
    }
}
