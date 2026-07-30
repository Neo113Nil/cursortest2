package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f91 extends g91 implements Iterator, dn, yb0 {
    public int d;
    public Object e;
    public dn g;

    @Override // defpackage.g91
    public final void a(Object obj, h31 h31Var) {
        this.e = obj;
        this.d = 3;
        this.g = h31Var;
        tn tnVar = tn.d;
    }

    public final RuntimeException b() {
        int i = this.d;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.d);
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return g.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.d;
            if (i != 0) {
                break;
            }
            this.d = 5;
            dn dnVar = this.g;
            dnVar.getClass();
            this.g = null;
            Unit unit = Unit.a;
            i31 i31Var = k31.d;
            dnVar.l(unit);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw b();
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        ca0.v(obj);
        this.d = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            dd0.c();
            return null;
        }
        if (i == 2) {
            this.d = 1;
            throw null;
        }
        if (i != 3) {
            throw b();
        }
        this.d = 0;
        Object obj = this.e;
        this.e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
