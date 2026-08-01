package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hj implements Iterator, pw {
    public int f = -1;
    public int g;
    public int h;
    public jv i;
    public final /* synthetic */ ij j;

    public hj(ij ijVar) {
        this.j = ijVar;
        int length = ((String) ijVar.b).length();
        if (length < 0) {
            s9.d(length, " is less than minimum 0.", "Cannot coerce value to an empty range: maximum ");
            throw null;
        }
        length = length >= 0 ? 0 : length;
        this.g = length;
        this.h = length;
    }

    public final void a() {
        ij ijVar = this.j;
        String str = (String) ijVar.b;
        int i = this.h;
        if (i < 0) {
            this.f = 0;
            this.i = null;
            return;
        }
        if (i > str.length()) {
            this.i = new jv(this.g, str.length() - 1, 1);
            this.h = -1;
        } else {
            k50 k50Var = (k50) ((vf0) ijVar.c).g(str, Integer.valueOf(this.h));
            if (k50Var == null) {
                this.i = new jv(this.g, str.length() - 1, 1);
                this.h = -1;
            } else {
                int intValue = ((Number) k50Var.f).intValue();
                int intValue2 = ((Number) k50Var.g).intValue();
                this.i = d50.b0(this.g, intValue);
                int i2 = intValue + intValue2;
                this.g = i2;
                this.h = i2 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f == -1) {
            a();
        }
        return this.f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f == -1) {
            a();
        }
        if (this.f == 0) {
            throw new NoSuchElementException();
        }
        jv jvVar = this.i;
        jvVar.getClass();
        this.i = null;
        this.f = -1;
        return jvVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
