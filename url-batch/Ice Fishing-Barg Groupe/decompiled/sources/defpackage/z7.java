package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z7 implements j51 {
    public final d8 PxuCJdSBwIXG;
    public boolean lS5Rgt96tfkO;

    public z7(d8 d8Var) {
        this.PxuCJdSBwIXG = d8Var;
    }

    @Override // defpackage.j51
    public final int OPXfSBeufaJ8(vr0 vr0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int i68hK7ahKtgp = ((e51) list.get(0)).i68hK7ahKtgp(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int i68hK7ahKtgp2 = ((e51) list.get(i2)).i68hK7ahKtgp(i);
                if (i68hK7ahKtgp2 > i68hK7ahKtgp) {
                    i68hK7ahKtgp = i68hK7ahKtgp2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i68hK7ahKtgp;
    }

    @Override // defpackage.j51
    public final int PxuCJdSBwIXG(vr0 vr0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int a92UlCVFR9N8 = ((e51) list.get(0)).a92UlCVFR9N8(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int a92UlCVFR9N82 = ((e51) list.get(i2)).a92UlCVFR9N8(i);
                if (a92UlCVFR9N82 > a92UlCVFR9N8) {
                    a92UlCVFR9N8 = a92UlCVFR9N82;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return a92UlCVFR9N8;
    }

    @Override // defpackage.j51
    public final int RAsUl2FVSrh6(vr0 vr0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int ngxnMNrpiKat = ((e51) list.get(0)).ngxnMNrpiKat(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int ngxnMNrpiKat2 = ((e51) list.get(i2)).ngxnMNrpiKat(i);
                if (ngxnMNrpiKat2 > ngxnMNrpiKat) {
                    ngxnMNrpiKat = ngxnMNrpiKat2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return ngxnMNrpiKat;
    }

    @Override // defpackage.j51
    public final int TSizfFm2Yiuu(vr0 vr0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int IXK6ba3ucyzm = ((e51) list.get(0)).IXK6ba3ucyzm(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int IXK6ba3ucyzm2 = ((e51) list.get(i2)).IXK6ba3ucyzm(i);
                if (IXK6ba3ucyzm2 > IXK6ba3ucyzm) {
                    IXK6ba3ucyzm = IXK6ba3ucyzm2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return IXK6ba3ucyzm;
    }

    @Override // defpackage.j51
    public final k51 a92UlCVFR9N8(l51 l51Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            em1 e9gEMXR7LXtO = ((e51) list.get(i3)).e9gEMXR7LXtO(j);
            i = Math.max(i, e9gEMXR7LXtO.rtx2ld2ELZv4);
            i2 = Math.max(i2, e9gEMXR7LXtO.OPXfSBeufaJ8);
            arrayList.add(e9gEMXR7LXtO);
        }
        boolean VhhvGxCb8gfr = l51Var.VhhvGxCb8gfr();
        d8 d8Var = this.PxuCJdSBwIXG;
        if (VhhvGxCb8gfr) {
            this.lS5Rgt96tfkO = true;
            d8Var.PxuCJdSBwIXG.setValue(new ir0((i2 & 4294967295L) | (i << 32)));
        } else if (!this.lS5Rgt96tfkO) {
            d8Var.PxuCJdSBwIXG.setValue(new ir0((i2 & 4294967295L) | (i << 32)));
        }
        return l51Var.jJwa0q7P5wHq(i, i2, q50.rtx2ld2ELZv4, new b3(2, arrayList));
    }
}
