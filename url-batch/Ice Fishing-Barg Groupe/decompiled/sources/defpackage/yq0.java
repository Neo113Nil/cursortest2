package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class yq0 implements Iterable, fu0 {
    public static final xq0 Companion = new xq0();
    public final int OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public yq0(int i, int i2, int i3) {
        if (i3 == 0) {
            u9.XL4ISE6Oc65B("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            u9.XL4ISE6Oc65B("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = kj0.aF05bpZJlKEP(i, i2, i3);
        this.wdg6QnbFHrFF = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof yq0)) {
            return false;
        }
        if (isEmpty() && ((yq0) obj).isEmpty()) {
            return true;
        }
        yq0 yq0Var = (yq0) obj;
        return this.rtx2ld2ELZv4 == yq0Var.rtx2ld2ELZv4 && this.OPXfSBeufaJ8 == yq0Var.OPXfSBeufaJ8 && this.wdg6QnbFHrFF == yq0Var.wdg6QnbFHrFF;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.rtx2ld2ELZv4 * 31) + this.OPXfSBeufaJ8) * 31) + this.wdg6QnbFHrFF;
    }

    public boolean isEmpty() {
        int i = this.OPXfSBeufaJ8;
        int i2 = this.wdg6QnbFHrFF;
        int i3 = this.rtx2ld2ELZv4;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zq0(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.OPXfSBeufaJ8;
        int i2 = this.wdg6QnbFHrFF;
        int i3 = this.rtx2ld2ELZv4;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
