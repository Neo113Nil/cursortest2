package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class af implements j51 {
    public final pd PxuCJdSBwIXG;
    public final boolean lS5Rgt96tfkO;

    public af(pd pdVar, boolean z) {
        this.PxuCJdSBwIXG = pdVar;
        this.lS5Rgt96tfkO = z;
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(final l51 l51Var, final List list, long j) {
        int wdg6QnbFHrFF;
        int OPXfSBeufaJ8;
        em1 e9gEMXR7LXtO;
        boolean isEmpty = list.isEmpty();
        q50 q50Var = q50.rtx2ld2ELZv4;
        if (isEmpty) {
            return l51Var.jJwa0q7P5wHq(rr.wdg6QnbFHrFF(j), rr.OPXfSBeufaJ8(j), q50Var, new wnqUPcAvl7HT(5));
        }
        long j2 = this.lS5Rgt96tfkO ? j : j & (-8589934589L);
        if (list.size() == 1) {
            final e51 e51Var = (e51) list.get(0);
            Object wdg6QnbFHrFF2 = e51Var.wdg6QnbFHrFF();
            we weVar = wdg6QnbFHrFF2 instanceof we ? (we) wdg6QnbFHrFF2 : null;
            if (weVar != null ? weVar.S2OOm9zPNm0h : false) {
                wdg6QnbFHrFF = rr.wdg6QnbFHrFF(j);
                OPXfSBeufaJ8 = rr.OPXfSBeufaJ8(j);
                qr qrVar = rr.Companion;
                int wdg6QnbFHrFF3 = rr.wdg6QnbFHrFF(j);
                int OPXfSBeufaJ82 = rr.OPXfSBeufaJ8(j);
                qrVar.getClass();
                e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(qr.TSizfFm2Yiuu(wdg6QnbFHrFF3, OPXfSBeufaJ82));
            } else {
                e9gEMXR7LXtO = e51Var.e9gEMXR7LXtO(j2);
                wdg6QnbFHrFF = Math.max(rr.wdg6QnbFHrFF(j), e9gEMXR7LXtO.rtx2ld2ELZv4);
                OPXfSBeufaJ8 = Math.max(rr.OPXfSBeufaJ8(j), e9gEMXR7LXtO.OPXfSBeufaJ8);
            }
            final int i = OPXfSBeufaJ8;
            final int i2 = wdg6QnbFHrFF;
            final em1 em1Var = e9gEMXR7LXtO;
            return l51Var.jJwa0q7P5wHq(i2, i, q50Var, new le0() { // from class: ye
                @Override // defpackage.le0
                public final Object OPXfSBeufaJ8(Object obj) {
                    xe.lS5Rgt96tfkO((dm1) obj, em1.this, e51Var, l51Var.getLayoutDirection(), i2, i, this.PxuCJdSBwIXG);
                    return no2.PxuCJdSBwIXG;
                }
            });
        }
        final em1[] em1VarArr = new em1[list.size()];
        final xt1 xt1Var = new xt1();
        xt1Var.rtx2ld2ELZv4 = rr.wdg6QnbFHrFF(j);
        final xt1 xt1Var2 = new xt1();
        xt1Var2.rtx2ld2ELZv4 = rr.OPXfSBeufaJ8(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            e51 e51Var2 = (e51) list.get(i3);
            Object wdg6QnbFHrFF4 = e51Var2.wdg6QnbFHrFF();
            we weVar2 = wdg6QnbFHrFF4 instanceof we ? (we) wdg6QnbFHrFF4 : null;
            if (weVar2 != null ? weVar2.S2OOm9zPNm0h : false) {
                z = true;
            } else {
                em1 e9gEMXR7LXtO2 = e51Var2.e9gEMXR7LXtO(j2);
                em1VarArr[i3] = e9gEMXR7LXtO2;
                xt1Var.rtx2ld2ELZv4 = Math.max(xt1Var.rtx2ld2ELZv4, e9gEMXR7LXtO2.rtx2ld2ELZv4);
                xt1Var2.rtx2ld2ELZv4 = Math.max(xt1Var2.rtx2ld2ELZv4, e9gEMXR7LXtO2.OPXfSBeufaJ8);
            }
        }
        if (z) {
            int i4 = xt1Var.rtx2ld2ELZv4;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = xt1Var2.rtx2ld2ELZv4;
            long PxuCJdSBwIXG = sr.PxuCJdSBwIXG(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                e51 e51Var3 = (e51) list.get(i7);
                Object wdg6QnbFHrFF5 = e51Var3.wdg6QnbFHrFF();
                we weVar3 = wdg6QnbFHrFF5 instanceof we ? (we) wdg6QnbFHrFF5 : null;
                if (weVar3 != null ? weVar3.S2OOm9zPNm0h : false) {
                    em1VarArr[i7] = e51Var3.e9gEMXR7LXtO(PxuCJdSBwIXG);
                }
            }
        }
        return l51Var.jJwa0q7P5wHq(xt1Var.rtx2ld2ELZv4, xt1Var2.rtx2ld2ELZv4, q50Var, new le0() { // from class: ze
            @Override // defpackage.le0
            public final Object OPXfSBeufaJ8(Object obj) {
                dm1 dm1Var = (dm1) obj;
                em1[] em1VarArr2 = em1VarArr;
                int length = em1VarArr2.length;
                int i8 = 0;
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i8;
                    em1 em1Var2 = em1VarArr2[i9];
                    em1Var2.getClass();
                    xe.lS5Rgt96tfkO(dm1Var, em1Var2, (e51) list.get(i10), l51Var.getLayoutDirection(), xt1Var.rtx2ld2ELZv4, xt1Var2.rtx2ld2ELZv4, this.PxuCJdSBwIXG);
                    i9++;
                    i8 = i10 + 1;
                }
                return no2.PxuCJdSBwIXG;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        return this.PxuCJdSBwIXG.equals(afVar.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == afVar.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.PxuCJdSBwIXG + ", propagateMinConstraints=" + this.lS5Rgt96tfkO + ')';
    }
}
