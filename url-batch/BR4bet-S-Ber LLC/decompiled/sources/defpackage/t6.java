package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class t6 implements Iterator, wr {
    public int f;
    public int g;
    public boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t6(x6 x6Var, int i) {
        this(x6Var.h);
        this.i = i;
        switch (i) {
            case 1:
                this.j = x6Var;
                this(x6Var.h);
                break;
            default:
                this.j = x6Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.g;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                f = ((x6) obj).f(i);
                break;
            case 1:
                f = ((x6) obj).i(i);
                break;
            default:
                f = ((z6) obj).g[i];
                break;
        }
        this.g++;
        this.h = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            g9.s("Call next() before removing an element.");
            return;
        }
        int i = this.g - 1;
        this.g = i;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                ((x6) obj).g(i);
                break;
            case 1:
                ((x6) obj).g(i);
                break;
            default:
                ((z6) obj).a(i);
                break;
        }
        this.f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t6(z6 z6Var) {
        this(z6Var.h);
        this.i = 2;
        this.j = z6Var;
    }

    public t6(int i) {
        this.f = i;
    }
}
