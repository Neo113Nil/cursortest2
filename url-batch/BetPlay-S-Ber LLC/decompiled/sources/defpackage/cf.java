package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cf implements Iterator, vp {
    public int f = -1;
    public int g;
    public int h;
    public lp i;
    public final /* synthetic */ df j;

    public cf(df dfVar) {
        this.j = dfVar;
        int length = ((String) dfVar.b).length();
        if (length < 0) {
            o8.d(length, " is less than minimum 0.", "Cannot coerce value to an empty range: maximum ");
            throw null;
        }
        length = length >= 0 ? 0 : length;
        this.g = length;
        this.h = length;
    }

    public final void a() {
        df dfVar = this.j;
        String str = (String) dfVar.b;
        int i = this.h;
        if (i < 0) {
            this.f = 0;
            this.i = null;
            return;
        }
        if (i > str.length()) {
            this.i = new lp(this.g, str.length() - 1, 1);
            this.h = -1;
        } else {
            int k0 = l40.k0(str, (char[]) ((u40) dfVar.c).g, this.h, false);
            cx cxVar = k0 >= 0 ? new cx(Integer.valueOf(k0), 1) : null;
            if (cxVar == null) {
                this.i = new lp(this.g, str.length() - 1, 1);
                this.h = -1;
            } else {
                int intValue = ((Number) cxVar.f).intValue();
                int intValue2 = ((Number) cxVar.g).intValue();
                this.i = op.W(this.g, intValue);
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
        lp lpVar = this.i;
        lpVar.getClass();
        this.i = null;
        this.f = -1;
        return lpVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
