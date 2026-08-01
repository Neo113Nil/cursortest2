package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class bh implements Iterator, wr {
    public int f = -1;
    public int g;
    public int h;
    public ir i;
    public final /* synthetic */ ch j;

    public bh(ch chVar) {
        this.j = chVar;
        int length = ((String) chVar.b).length();
        if (length < 0) {
            g9.c(length, " is less than minimum 0.", "Cannot coerce value to an empty range: maximum ");
            throw null;
        }
        length = length >= 0 ? 0 : length;
        this.g = length;
        this.h = length;
    }

    public final void a() {
        ch chVar = this.j;
        String str = (String) chVar.b;
        int i = this.h;
        if (i < 0) {
            this.f = 0;
            this.i = null;
            return;
        }
        if (i > str.length()) {
            this.i = new ir(this.g, str.length() - 1, 1);
            this.h = -1;
        } else {
            tz tzVar = (tz) ((o70) chVar.c).f(str, Integer.valueOf(this.h));
            if (tzVar == null) {
                this.i = new ir(this.g, str.length() - 1, 1);
                this.h = -1;
            } else {
                int intValue = ((Number) tzVar.f).intValue();
                int intValue2 = ((Number) tzVar.g).intValue();
                this.i = mz.Q(this.g, intValue);
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
        ir irVar = this.i;
        irVar.getClass();
        this.i = null;
        this.f = -1;
        return irVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
