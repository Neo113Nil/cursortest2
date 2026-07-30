package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b72 implements wp, Iterable, fu0 {
    public final int OPXfSBeufaJ8;
    public final a72 rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public b72(a72 a72Var, int i, int i2) {
        this.rtx2ld2ELZv4 = a72Var;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b72)) {
            return false;
        }
        b72 b72Var = (b72) obj;
        return b72Var.OPXfSBeufaJ8 == this.OPXfSBeufaJ8 && b72Var.wdg6QnbFHrFF == this.wdg6QnbFHrFF && b72Var.rtx2ld2ELZv4 == this.rtx2ld2ELZv4;
    }

    public final int hashCode() {
        return (this.rtx2ld2ELZv4.hashCode() * 31) + this.OPXfSBeufaJ8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        a72 a72Var = this.rtx2ld2ELZv4;
        if (a72Var.QrzZRwfaDlRX != this.wdg6QnbFHrFF) {
            c72.a92UlCVFR9N8();
        }
        int i = this.OPXfSBeufaJ8;
        a72Var.a92UlCVFR9N8(i);
        return new fi0(a72Var, i + 1, a72Var.rtx2ld2ELZv4[(i * 5) + 3] + i);
    }
}
