package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class di implements Iterator, k71 {
    public int m;
    public int n;
    public boolean o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public di(hi hiVar, int i) {
        this(hiVar.o);
        this.p = i;
        switch (i) {
            case 1:
                this.q = hiVar;
                this(hiVar.o);
                break;
            default:
                this.q = hiVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.n < this.m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e;
        if (!hasNext()) {
            b71.f();
            return null;
        }
        int i = this.n;
        int i2 = this.p;
        Object obj = this.q;
        switch (i2) {
            case 0:
                e = ((hi) obj).e(i);
                break;
            case 1:
                e = ((hi) obj).h(i);
                break;
            default:
                e = ((ii) obj).n[i];
                break;
        }
        this.n++;
        this.o = true;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.o) {
            lh.g("Call next() before removing an element.");
            return;
        }
        int i = this.n - 1;
        this.n = i;
        int i2 = this.p;
        Object obj = this.q;
        switch (i2) {
            case 0:
                ((hi) obj).f(i);
                break;
            case 1:
                ((hi) obj).f(i);
                break;
            default:
                ((ii) obj).a(i);
                break;
        }
        this.m--;
        this.o = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public di(ii iiVar) {
        this(iiVar.o);
        this.p = 2;
        this.q = iiVar;
    }

    public di(int i) {
        this.m = i;
    }
}
