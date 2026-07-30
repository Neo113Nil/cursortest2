package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fi0 implements Iterator, fu0 {
    public final int OPXfSBeufaJ8;
    public final int dgRBjINgWbAK;
    public final a72 rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public fi0(a72 a72Var, int i, int i2) {
        this.rtx2ld2ELZv4 = a72Var;
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = i;
        this.dgRBjINgWbAK = a72Var.QrzZRwfaDlRX;
        if (a72Var.r3s1LDPKFs1S) {
            c72.a92UlCVFR9N8();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.wdg6QnbFHrFF < this.OPXfSBeufaJ8;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a72 a72Var = this.rtx2ld2ELZv4;
        int i = a72Var.QrzZRwfaDlRX;
        int i2 = this.dgRBjINgWbAK;
        if (i != i2) {
            c72.a92UlCVFR9N8();
        }
        int i3 = this.wdg6QnbFHrFF;
        this.wdg6QnbFHrFF = a72Var.rtx2ld2ELZv4[(i3 * 5) + 3] + i3;
        return new b72(a72Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
