package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class p82 implements wp, Iterable, fu0 {
    public final int OPXfSBeufaJ8;
    public final a72 rtx2ld2ELZv4;
    public final gu1 wdg6QnbFHrFF;

    public p82(a72 a72Var, int i, vf0 vf0Var, gu1 gu1Var) {
        this.rtx2ld2ELZv4 = a72Var;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = gu1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p82)) {
            return false;
        }
        p82 p82Var = (p82) obj;
        return p82Var.OPXfSBeufaJ8 == this.OPXfSBeufaJ8 && p82Var.rtx2ld2ELZv4 == this.rtx2ld2ELZv4 && p82Var.wdg6QnbFHrFF.equals(this.wdg6QnbFHrFF);
    }

    public final int hashCode() {
        return this.wdg6QnbFHrFF.hashCode() + ((this.rtx2ld2ELZv4.hashCode() + (this.OPXfSBeufaJ8 * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ey(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, null, this.wdg6QnbFHrFF);
    }
}
