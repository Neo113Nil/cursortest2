package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class c7 implements Iterator, pw {
    public int f;
    public int g;
    public boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c7(g7 g7Var, int i) {
        this(g7Var.h);
        this.i = i;
        switch (i) {
            case 1:
                this.j = g7Var;
                this(g7Var.h);
                break;
            default:
                this.j = g7Var;
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
                f = ((g7) obj).f(i);
                break;
            case 1:
                f = ((g7) obj).i(i);
                break;
            default:
                f = ((i7) obj).g[i];
                break;
        }
        this.g++;
        this.h = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            s9.u("Call next() before removing an element.");
            return;
        }
        int i = this.g - 1;
        this.g = i;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                ((g7) obj).g(i);
                break;
            case 1:
                ((g7) obj).g(i);
                break;
            default:
                ((i7) obj).a(i);
                break;
        }
        this.f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c7(i7 i7Var) {
        this(i7Var.h);
        this.i = 2;
        this.j = i7Var;
    }

    public c7(int i) {
        this.f = i;
    }
}
