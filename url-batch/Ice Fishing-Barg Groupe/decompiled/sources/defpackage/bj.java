package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bj implements w80 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;
    public final /* synthetic */ Object x50lh2ztY7Y5;

    public bj(zt1 zt1Var, w80 w80Var, String[] strArr, int[] iArr) {
        this.rtx2ld2ELZv4 = 3;
        this.OPXfSBeufaJ8 = zt1Var;
        this.x50lh2ztY7Y5 = w80Var;
        this.wdg6QnbFHrFF = strArr;
        this.dgRBjINgWbAK = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.cpQdD2nAriOS(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r1.cpQdD2nAriOS(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object PxuCJdSBwIXG(int[] iArr, bt btVar) {
        zl2 zl2Var;
        int i;
        String[] strArr = (String[]) this.wdg6QnbFHrFF;
        w80 w80Var = (w80) this.x50lh2ztY7Y5;
        zt1 zt1Var = (zt1) this.OPXfSBeufaJ8;
        if (btVar instanceof zl2) {
            zl2Var = (zl2) btVar;
            int i2 = zl2Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zl2Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = zl2Var.x50lh2ztY7Y5;
                i = zl2Var.r3s1LDPKFs1S;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    Object obj2 = zt1Var.rtx2ld2ELZv4;
                    su suVar = su.rtx2ld2ELZv4;
                    if (obj2 == null) {
                        Set HGgCfDnf0ga9 = na.HGgCfDnf0ga9(strArr);
                        zl2Var.dgRBjINgWbAK = iArr;
                        zl2Var.r3s1LDPKFs1S = 1;
                    } else {
                        int[] iArr2 = (int[]) this.dgRBjINgWbAK;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj3 = zt1Var.rtx2ld2ELZv4;
                            if (obj3 == null) {
                                u9.rtx2ld2ELZv4("Required value was null.");
                                return null;
                            }
                            int i6 = iArr2[i4];
                            if (((int[]) obj3)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set l = zk.l(arrayList);
                            zl2Var.dgRBjINgWbAK = iArr;
                            zl2Var.r3s1LDPKFs1S = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = zl2Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                }
                zt1Var.rtx2ld2ELZv4 = iArr;
                return no2.PxuCJdSBwIXG;
            }
        }
        zl2Var = new zl2(this, btVar);
        Object obj4 = zl2Var.x50lh2ztY7Y5;
        i = zl2Var.r3s1LDPKFs1S;
        if (i != 0) {
        }
        zt1Var.rtx2ld2ELZv4 = iArr;
        return no2.PxuCJdSBwIXG;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    @Override // defpackage.w80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cpQdD2nAriOS(Object obj, bt btVar) {
        aj ajVar;
        int i;
        int i2 = this.rtx2ld2ELZv4;
        Object obj2 = this.x50lh2ztY7Y5;
        boolean z = true;
        Object obj3 = this.wdg6QnbFHrFF;
        Object obj4 = this.dgRBjINgWbAK;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj5 = this.OPXfSBeufaJ8;
        switch (i2) {
            case 0:
                if (btVar instanceof aj) {
                    ajVar = (aj) btVar;
                    int i3 = ajVar.QrzZRwfaDlRX;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ajVar.QrzZRwfaDlRX = i3 - Integer.MIN_VALUE;
                        Object obj6 = ajVar.cpQdD2nAriOS;
                        i = ajVar.QrzZRwfaDlRX;
                        if (i != 0) {
                            ng0.tmVwIGCQF4zR(obj6);
                            xs0 xs0Var = (xs0) ((zt1) obj5).rtx2ld2ELZv4;
                            if (xs0Var != null) {
                                xs0Var.a92UlCVFR9N8(new qj("Child of the scoped flow was cancelled"));
                                ajVar.dgRBjINgWbAK = this;
                                ajVar.x50lh2ztY7Y5 = obj;
                                ajVar.QrzZRwfaDlRX = 1;
                                Object nLZGh9p8gVSu = xs0Var.nLZGh9p8gVSu(ajVar);
                                su suVar = su.rtx2ld2ELZv4;
                                if (nLZGh9p8gVSu == suVar) {
                                    return suVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = ajVar.x50lh2ztY7Y5;
                            this = ajVar.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj6);
                        }
                        ((zt1) this.OPXfSBeufaJ8).rtx2ld2ELZv4 = fx1.KUoIVIumpKat((ru) this.wdg6QnbFHrFF, null, new zi((cj) this.dgRBjINgWbAK, (w80) this.x50lh2ztY7Y5, obj, null), 1);
                        return no2Var;
                    }
                }
                ajVar = new aj(this, btVar);
                Object obj62 = ajVar.cpQdD2nAriOS;
                i = ajVar.QrzZRwfaDlRX;
                if (i != 0) {
                }
                ((zt1) this.OPXfSBeufaJ8).rtx2ld2ELZv4 = fx1.KUoIVIumpKat((ru) this.wdg6QnbFHrFF, null, new zi((cj) this.dgRBjINgWbAK, (w80) this.x50lh2ztY7Y5, obj, null), 1);
                return no2Var;
            case 1:
                eh2 eh2Var = (eh2) obj4;
                yz0 yz0Var = (yz0) obj5;
                if (((Boolean) obj).booleanValue() && yz0Var.lS5Rgt96tfkO()) {
                    ai2 ai2Var = (ai2) obj3;
                    oh2 r3s1LDPKFs1S = eh2Var.r3s1LDPKFs1S();
                    df1 df1Var = eh2Var.lS5Rgt96tfkO;
                    tf2 tf2Var = uf2.Companion;
                    op0 op0Var = yz0Var.Y1f8riQaR6yg;
                    mt mtVar = yz0Var.VhhvGxCb8gfr;
                    mt mtVar2 = yz0Var.S2OOm9zPNm0h;
                    tf2Var.getClass();
                    zt1 zt1Var = new zt1();
                    cd cdVar = new cd(op0Var, mtVar, zt1Var);
                    kn1 kn1Var = ai2Var.PxuCJdSBwIXG;
                    kn1Var.PxuCJdSBwIXG(r3s1LDPKFs1S, (ln0) obj2, cdVar, mtVar2);
                    ei2 ei2Var = new ei2(ai2Var, kn1Var);
                    ai2Var.lS5Rgt96tfkO.set(ei2Var);
                    zt1Var.rtx2ld2ELZv4 = ei2Var;
                    yz0Var.e9gEMXR7LXtO = ei2Var;
                    ov2.Pf0ThKz3j5YS(yz0Var, r3s1LDPKFs1S, df1Var);
                } else {
                    ov2.e6tOsSdd2EFb(yz0Var);
                }
                return no2Var;
            case 2:
                kr0 kr0Var = (kr0) obj;
                xt1 xt1Var = (xt1) obj4;
                xt1 xt1Var2 = (xt1) obj3;
                xt1 xt1Var3 = (xt1) obj5;
                if (kr0Var instanceof wp1) {
                    xt1Var3.rtx2ld2ELZv4++;
                } else if (kr0Var instanceof xp1) {
                    xt1Var3.rtx2ld2ELZv4--;
                } else if (kr0Var instanceof vp1) {
                    xt1Var3.rtx2ld2ELZv4--;
                } else if (kr0Var instanceof jk0) {
                    xt1Var2.rtx2ld2ELZv4++;
                } else if (kr0Var instanceof kk0) {
                    xt1Var2.rtx2ld2ELZv4--;
                } else if (kr0Var instanceof ia0) {
                    xt1Var.rtx2ld2ELZv4++;
                } else if (kr0Var instanceof ja0) {
                    xt1Var.rtx2ld2ELZv4--;
                }
                boolean z2 = false;
                boolean z3 = xt1Var3.rtx2ld2ELZv4 > 0;
                boolean z4 = xt1Var2.rtx2ld2ELZv4 > 0;
                boolean z5 = xt1Var.rtx2ld2ELZv4 > 0;
                fw fwVar = (fw) obj2;
                if (fwVar.S2OOm9zPNm0h != z3) {
                    fwVar.S2OOm9zPNm0h = z3;
                    z2 = true;
                }
                if (fwVar.ZbWwgt3aGe7A != z4) {
                    fwVar.ZbWwgt3aGe7A = z4;
                    z2 = true;
                }
                if (fwVar.pnx5pC0XzaCw != z5) {
                    fwVar.pnx5pC0XzaCw = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    fx1.IXK6ba3ucyzm(fwVar);
                }
                return no2Var;
            default:
                return PxuCJdSBwIXG((int[]) obj, btVar);
        }
    }

    public /* synthetic */ bj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
        this.dgRBjINgWbAK = obj3;
        this.x50lh2ztY7Y5 = obj4;
    }
}
