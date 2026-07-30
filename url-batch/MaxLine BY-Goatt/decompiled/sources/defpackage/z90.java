package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z90 implements Iterator, k71 {
    public int m = -1;
    public int n;
    public int o;
    public IntRange p;
    public int q;
    public final /* synthetic */ aa0 r;

    public z90(aa0 aa0Var) {
        this.r = aa0Var;
        int c = d.c(0, 0, aa0Var.a.length());
        this.n = c;
        this.o = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        aa0 aa0Var = this.r;
        CharSequence charSequence = aa0Var.a;
        int i = this.o;
        if (i < 0) {
            this.m = 0;
            this.p = null;
            return;
        }
        int i2 = aa0Var.b;
        if (i2 > 0) {
            int i3 = this.q + 1;
            this.q = i3;
        }
        if (i <= charSequence.length()) {
            Pair pair = (Pair) aa0Var.c.invoke(charSequence, Integer.valueOf(this.o));
            if (pair == null) {
                this.p = new IntRange(this.n, up2.t(charSequence), 1);
                this.o = -1;
            } else {
                int intValue = ((Number) pair.m).intValue();
                int intValue2 = ((Number) pair.n).intValue();
                this.p = d.f(this.n, intValue);
                int i4 = intValue + intValue2;
                this.n = i4;
                this.o = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.m = 1;
        }
        this.p = new IntRange(this.n, up2.t(charSequence), 1);
        this.o = -1;
        this.m = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.m == -1) {
            a();
        }
        return this.m == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.m == -1) {
            a();
        }
        if (this.m == 0) {
            b71.f();
            return null;
        }
        IntRange intRange = this.p;
        intRange.getClass();
        this.p = null;
        this.m = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
