package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class df implements Iterator, kp {
    public int f = -1;
    public int g;
    public int h;
    public xo i;
    public final /* synthetic */ ef j;

    public df(ef efVar) {
        this.j = efVar;
        int length = ((String) efVar.b).length();
        if (length < 0) {
            t8.d(length, " is less than minimum 0.", "Cannot coerce value to an empty range: maximum ");
            throw null;
        }
        length = length >= 0 ? 0 : length;
        this.g = length;
        this.h = length;
    }

    public final void a() {
        ef efVar = this.j;
        String str = (String) efVar.b;
        int i = this.h;
        if (i < 0) {
            this.f = 0;
            this.i = null;
            return;
        }
        if (i > str.length()) {
            this.i = new xo(this.g, str.length() - 1, 1);
            this.h = -1;
        } else {
            int s0 = c40.s0(str, (char[]) ((l40) efVar.c).g, this.h, false);
            pw pwVar = s0 >= 0 ? new pw(Integer.valueOf(s0), 1) : null;
            if (pwVar == null) {
                this.i = new xo(this.g, str.length() - 1, 1);
                this.h = -1;
            } else {
                int intValue = ((Number) pwVar.f).intValue();
                int intValue2 = ((Number) pwVar.g).intValue();
                this.i = o8.y0(this.g, intValue);
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
        xo xoVar = this.i;
        xoVar.getClass();
        this.i = null;
        this.f = -1;
        return xoVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
