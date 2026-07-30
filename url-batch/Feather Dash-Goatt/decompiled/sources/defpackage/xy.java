package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xy implements Iterator, yb0 {
    public final Iterator d;
    public int e = -1;
    public Object g;
    public final /* synthetic */ yy h;

    public xy(yy yyVar) {
        this.h = yyVar;
        this.d = new bj1((yy) yyVar.b);
    }

    public final void a() {
        Object next;
        do {
            Iterator it = this.d;
            if (!it.hasNext()) {
                this.e = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((k61) this.h.c).invoke(next)).booleanValue());
        this.g = next;
        this.e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e == -1) {
            a();
        }
        return this.e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e == -1) {
            a();
        }
        if (this.e == 0) {
            dd0.c();
            return null;
        }
        Object obj = this.g;
        this.g = null;
        this.e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
