package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class xs1 implements le0 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ xs1(jq2 jq2Var, em1 em1Var, int i) {
        this.rtx2ld2ELZv4 = 2;
        this.wdg6QnbFHrFF = jq2Var;
        this.dgRBjINgWbAK = em1Var;
        this.OPXfSBeufaJ8 = i;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        tp tpVar;
        no2 no2Var;
        tp tpVar2;
        no2 no2Var2;
        int i;
        int i2 = this.rtx2ld2ELZv4;
        no2 no2Var3 = no2.PxuCJdSBwIXG;
        int i3 = 0;
        int i4 = this.OPXfSBeufaJ8;
        Object obj2 = this.dgRBjINgWbAK;
        Object obj3 = this.wdg6QnbFHrFF;
        switch (i2) {
            case 0:
                zs1 zs1Var = (zs1) obj3;
                l81 l81Var = (l81) obj2;
                tp tpVar3 = (tp) obj;
                if (zs1Var.e9gEMXR7LXtO == i4 && cs0.wdg6QnbFHrFF(l81Var, zs1Var.a92UlCVFR9N8) && (tpVar3 instanceof zp)) {
                    long[] jArr = l81Var.PxuCJdSBwIXG;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = l81Var.lS5Rgt96tfkO[i9];
                                        boolean z = l81Var.TSizfFm2Yiuu[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            zp zpVar = (zp) tpVar3;
                                            tpVar2 = tpVar3;
                                            v81 v81Var = zpVar.r3s1LDPKFs1S;
                                            th0.rZjpSjn4zoMv(v81Var, obj4, zs1Var);
                                            no2Var2 = no2Var3;
                                            if (obj4 instanceof ty) {
                                                ty tyVar = (ty) obj4;
                                                if (!v81Var.TSizfFm2Yiuu(tyVar)) {
                                                    th0.BjEWd04qc7Mw(zpVar.BRwzKIf41E4i, tyVar);
                                                }
                                                v81 v81Var2 = zs1Var.RAsUl2FVSrh6;
                                                if (v81Var2 != null) {
                                                    v81Var2.dgRBjINgWbAK(obj4);
                                                }
                                            }
                                        } else {
                                            tpVar2 = tpVar3;
                                            no2Var2 = no2Var3;
                                            i = i6;
                                        }
                                        if (z) {
                                            l81Var.a92UlCVFR9N8(i9);
                                        }
                                    } else {
                                        tpVar2 = tpVar3;
                                        no2Var2 = no2Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    tpVar3 = tpVar2;
                                    no2Var3 = no2Var2;
                                }
                                tpVar = tpVar3;
                                no2Var = no2Var3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                tpVar = tpVar3;
                                no2Var = no2Var3;
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                                tpVar3 = tpVar;
                                no2Var3 = no2Var;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            case 1:
                l02 l02Var = (l02) obj3;
                em1 em1Var = (em1) obj2;
                dm1 dm1Var = (dm1) obj;
                int rtx2ld2ELZv4 = l02Var.VhhvGxCb8gfr.PxuCJdSBwIXG.rtx2ld2ELZv4();
                if (rtx2ld2ELZv4 < 0) {
                    rtx2ld2ELZv4 = 0;
                }
                if (rtx2ld2ELZv4 <= i4) {
                    i4 = rtx2ld2ELZv4;
                }
                int i10 = -i4;
                boolean z2 = l02Var.S2OOm9zPNm0h;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                dm1Var.rtx2ld2ELZv4 = true;
                dm1.dgRBjINgWbAK(dm1Var, em1Var, i11, i10);
                dm1Var.rtx2ld2ELZv4 = false;
                break;
            default:
                jq2 jq2Var = (jq2) obj3;
                em1 em1Var2 = (em1) obj2;
                dm1 dm1Var2 = (dm1) obj;
                int i12 = jq2Var.lS5Rgt96tfkO;
                ug2 ug2Var = jq2Var.PxuCJdSBwIXG;
                yk2 yk2Var = jq2Var.TSizfFm2Yiuu;
                ki2 ki2Var = (ki2) jq2Var.Y1f8riQaR6yg.PxuCJdSBwIXG();
                ug2Var.PxuCJdSBwIXG(th1.rtx2ld2ELZv4, vi0.RAsUl2FVSrh6(dm1Var2, i12, yk2Var, ki2Var != null ? ki2Var.PxuCJdSBwIXG : null, false, em1Var2.rtx2ld2ELZv4), i4, em1Var2.OPXfSBeufaJ8);
                dm1.wdg6QnbFHrFF(dm1Var2, em1Var2, 0, Math.round(-ug2Var.PxuCJdSBwIXG.rtx2ld2ELZv4()));
                break;
        }
        return no2Var3;
    }

    public /* synthetic */ xs1(int i, int i2, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i2;
        this.wdg6QnbFHrFF = obj;
        this.OPXfSBeufaJ8 = i;
        this.dgRBjINgWbAK = obj2;
    }
}
