package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a7 implements Iterator, vp {
    public int f;
    public int g;
    public boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a7(e7 e7Var, int i) {
        this(e7Var.h);
        this.i = i;
        switch (i) {
            case 1:
                this.j = e7Var;
                this(e7Var.h);
                break;
            default:
                this.j = e7Var;
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
                f = ((e7) obj).f(i);
                break;
            case 1:
                f = ((e7) obj).i(i);
                break;
            default:
                f = ((g7) obj).g[i];
                break;
        }
        this.g++;
        this.h = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            o8.t("Call next() before removing an element.");
            return;
        }
        int i = this.g - 1;
        this.g = i;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                ((e7) obj).g(i);
                break;
            case 1:
                ((e7) obj).g(i);
                break;
            default:
                ((g7) obj).a(i);
                break;
        }
        this.f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a7(g7 g7Var) {
        this(g7Var.h);
        this.i = 2;
        this.j = g7Var;
    }

    public a7(int i) {
        this.f = i;
    }
}
