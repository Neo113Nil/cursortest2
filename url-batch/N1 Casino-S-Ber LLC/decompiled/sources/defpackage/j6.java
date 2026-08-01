package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class j6 implements Iterator, kp {
    public int f;
    public int g;
    public boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j6(n6 n6Var, int i) {
        this(n6Var.h);
        this.i = i;
        switch (i) {
            case 1:
                this.j = n6Var;
                this(n6Var.h);
                break;
            default:
                this.j = n6Var;
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
                f = ((n6) obj).f(i);
                break;
            case 1:
                f = ((n6) obj).i(i);
                break;
            default:
                f = ((p6) obj).g[i];
                break;
        }
        this.g++;
        this.h = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            t8.t("Call next() before removing an element.");
            return;
        }
        int i = this.g - 1;
        this.g = i;
        int i2 = this.i;
        Object obj = this.j;
        switch (i2) {
            case 0:
                ((n6) obj).g(i);
                break;
            case 1:
                ((n6) obj).g(i);
                break;
            default:
                ((p6) obj).a(i);
                break;
        }
        this.f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j6(p6 p6Var) {
        this(p6Var.h);
        this.i = 2;
        this.j = p6Var;
    }

    public j6(int i) {
        this.f = i;
    }
}
