package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x00 implements w80 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public x00(y00 y00Var, zt1 zt1Var, w80 w80Var) {
        this.rtx2ld2ELZv4 = 0;
        this.OPXfSBeufaJ8 = zt1Var;
        this.wdg6QnbFHrFF = w80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0275  */
    @Override // defpackage.w80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cpQdD2nAriOS(Object obj, bt btVar) {
        w00 w00Var;
        int i;
        j90 j90Var;
        Object obj2;
        int i2;
        x00 x00Var = this;
        Object obj3 = obj;
        int i3 = x00Var.rtx2ld2ELZv4;
        su suVar = su.rtx2ld2ELZv4;
        bt btVar2 = null;
        Object obj4 = x00Var.OPXfSBeufaJ8;
        Object obj5 = x00Var.wdg6QnbFHrFF;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i3) {
            case 0:
                zt1 zt1Var = (zt1) obj4;
                if (btVar instanceof w00) {
                    w00Var = (w00) btVar;
                    int i4 = w00Var.cpQdD2nAriOS;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        w00Var.cpQdD2nAriOS = i4 - Integer.MIN_VALUE;
                        Object obj6 = w00Var.dgRBjINgWbAK;
                        i = w00Var.cpQdD2nAriOS;
                        if (i != 0) {
                            ng0.tmVwIGCQF4zR(obj6);
                            Object obj7 = zt1Var.rtx2ld2ELZv4;
                            if (obj7 == fx1.a92UlCVFR9N8 || !cs0.wdg6QnbFHrFF(obj7, obj3)) {
                                zt1Var.rtx2ld2ELZv4 = obj3;
                                w00Var.cpQdD2nAriOS = 1;
                                if (((w80) obj5).cpQdD2nAriOS(obj3, w00Var) == suVar) {
                                    return suVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ng0.tmVwIGCQF4zR(obj6);
                        }
                        return no2Var;
                    }
                }
                w00Var = new w00(x00Var, btVar);
                Object obj62 = w00Var.dgRBjINgWbAK;
                i = w00Var.cpQdD2nAriOS;
                if (i != 0) {
                }
                return no2Var;
            case 1:
                if (btVar instanceof j90) {
                    j90Var = (j90) btVar;
                    int i5 = j90Var.cpQdD2nAriOS;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        j90Var.cpQdD2nAriOS = i5 - Integer.MIN_VALUE;
                        obj2 = j90Var.x50lh2ztY7Y5;
                        i2 = j90Var.cpQdD2nAriOS;
                        if (i2 != 0) {
                            ng0.tmVwIGCQF4zR(obj2);
                            j90Var.dgRBjINgWbAK = x00Var;
                            j90Var.QrzZRwfaDlRX = obj3;
                            j90Var.cpQdD2nAriOS = 1;
                            obj2 = ((pe0) obj5).rtx2ld2ELZv4(obj3, j90Var);
                            if (obj2 == suVar) {
                                return suVar;
                            }
                        } else {
                            if (i2 != 1) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj8 = j90Var.QrzZRwfaDlRX;
                            x00 x00Var2 = j90Var.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj2);
                            obj3 = obj8;
                            x00Var = x00Var2;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return no2Var;
                        }
                        ((zt1) x00Var.OPXfSBeufaJ8).rtx2ld2ELZv4 = obj3;
                        throw new TSizfFm2Yiuu(x00Var);
                    }
                }
                j90Var = new j90(x00Var, btVar);
                obj2 = j90Var.x50lh2ztY7Y5;
                i2 = j90Var.cpQdD2nAriOS;
                if (i2 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case 2:
                kr0 kr0Var = (kr0) obj3;
                ArrayList arrayList = (ArrayList) obj4;
                if (kr0Var instanceof ia0) {
                    arrayList.add(kr0Var);
                } else if (kr0Var instanceof ja0) {
                    arrayList.remove(((ja0) kr0Var).PxuCJdSBwIXG);
                }
                ((d91) obj5).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return no2Var;
            case 3:
                kr0 kr0Var2 = (kr0) obj3;
                ArrayList arrayList2 = (ArrayList) obj4;
                if (kr0Var2 instanceof ia0) {
                    arrayList2.add(kr0Var2);
                } else if (kr0Var2 instanceof ja0) {
                    arrayList2.remove(((ja0) kr0Var2).PxuCJdSBwIXG);
                }
                boolean z = !arrayList2.isEmpty();
                bo0 bo0Var = (bo0) obj5;
                if (z != bo0Var.jyegZNwi31qc) {
                    bo0Var.jyegZNwi31qc = z;
                    bo0Var.MDTGUQSX7PXD();
                }
                return no2Var;
            case 4:
                ((d91) obj4).setValue(Boolean.TRUE);
                ((fj1) obj5).OPXfSBeufaJ8(((zb) obj3).TSizfFm2Yiuu);
                return no2Var;
            case 5:
                kr0 kr0Var3 = (kr0) obj3;
                p5 p5Var = (p5) obj4;
                if (!(kr0Var3 instanceof yp1)) {
                    ru ruVar = (ru) obj5;
                    uj ujVar = p5Var.e6tOsSdd2EFb;
                    float f = 0.0f;
                    if (ujVar == null) {
                        boolean z2 = p5Var.S2OOm9zPNm0h;
                        xx xxVar = p5Var.IAToe7bXGz4N;
                        ujVar = new uj();
                        ujVar.PxuCJdSBwIXG = z2;
                        ujVar.lS5Rgt96tfkO = xxVar;
                        ujVar.TSizfFm2Yiuu = new g7(Float.valueOf(0.0f), b51.QrzZRwfaDlRX, Float.valueOf(0.01f), 8);
                        ujVar.Y1f8riQaR6yg = new ArrayList();
                        fx1.IXK6ba3ucyzm(p5Var);
                        p5Var.e6tOsSdd2EFb = ujVar;
                    }
                    ArrayList arrayList3 = (ArrayList) ujVar.Y1f8riQaR6yg;
                    if (kr0Var3 instanceof jk0) {
                        arrayList3.add(kr0Var3);
                    } else if (kr0Var3 instanceof kk0) {
                        arrayList3.remove(((kk0) kr0Var3).PxuCJdSBwIXG);
                    } else if (kr0Var3 instanceof ia0) {
                        arrayList3.add(kr0Var3);
                    } else if (kr0Var3 instanceof ja0) {
                        arrayList3.remove(((ja0) kr0Var3).PxuCJdSBwIXG);
                    } else if (kr0Var3 instanceof v20) {
                        arrayList3.add(kr0Var3);
                    } else if (kr0Var3 instanceof w20) {
                        arrayList3.remove(((w20) kr0Var3).PxuCJdSBwIXG);
                    } else if (kr0Var3 instanceof u20) {
                        arrayList3.remove(((u20) kr0Var3).PxuCJdSBwIXG);
                    }
                    kr0 kr0Var4 = (kr0) zk.BUo4iHFctTZi(arrayList3);
                    if (!cs0.wdg6QnbFHrFF((kr0) ujVar.e9gEMXR7LXtO, kr0Var4)) {
                        int i6 = 0;
                        if (kr0Var4 != null) {
                            ((xx) ujVar.lS5Rgt96tfkO).PxuCJdSBwIXG();
                            boolean z3 = kr0Var4 instanceof jk0;
                            if (z3) {
                                f = 0.08f;
                            } else if (kr0Var4 instanceof ia0) {
                                f = 0.1f;
                            } else if (kr0Var4 instanceof v20) {
                                f = 0.16f;
                            }
                            km2 km2Var = tw1.PxuCJdSBwIXG;
                            if (!z3) {
                                if (kr0Var4 instanceof ia0) {
                                    km2Var = new km2(45, 0, a40.lS5Rgt96tfkO);
                                } else if (kr0Var4 instanceof v20) {
                                    km2Var = new km2(45, 0, a40.lS5Rgt96tfkO);
                                }
                            }
                            fx1.KUoIVIumpKat(ruVar, null, new rb1(ujVar, f, km2Var, (bt) null), 3);
                        } else {
                            kr0 kr0Var5 = (kr0) ujVar.e9gEMXR7LXtO;
                            km2 km2Var2 = tw1.PxuCJdSBwIXG;
                            if (!(kr0Var5 instanceof jk0) && !(kr0Var5 instanceof ia0) && (kr0Var5 instanceof v20)) {
                                km2Var2 = new km2(150, 0, a40.lS5Rgt96tfkO);
                            }
                            fx1.KUoIVIumpKat(ruVar, null, new n92(ujVar, km2Var2, btVar2, i6), 3);
                        }
                        ujVar.e9gEMXR7LXtO = kr0Var4;
                    }
                } else if (p5Var.kpCQ9veP6n3I) {
                    p5Var.W7ceZOzvrRuI((yp1) kr0Var3);
                } else {
                    p5Var.rZjpSjn4zoMv.PxuCJdSBwIXG(kr0Var3);
                }
                return no2Var;
            default:
                long j = ((bf1) obj3).PxuCJdSBwIXG;
                g7 g7Var = (g7) obj4;
                if ((((bf1) g7Var.Y1f8riQaR6yg()).PxuCJdSBwIXG & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (((bf1) g7Var.Y1f8riQaR6yg()).PxuCJdSBwIXG & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object e9gEMXR7LXtO = g7Var.e9gEMXR7LXtO(btVar, new bf1(j));
                    return e9gEMXR7LXtO == suVar ? e9gEMXR7LXtO : no2Var;
                }
                fx1.KUoIVIumpKat((ru) obj5, null, new v22(g7Var, j, (bt) null), 3);
                return no2Var;
        }
    }

    public /* synthetic */ x00(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    public x00(pe0 pe0Var, zt1 zt1Var) {
        this.rtx2ld2ELZv4 = 1;
        this.wdg6QnbFHrFF = pe0Var;
        this.OPXfSBeufaJ8 = zt1Var;
    }
}
