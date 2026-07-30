package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x6 implements fu {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public x6(x6 x6Var) {
        this.rtx2ld2ELZv4 = 2;
        this.OPXfSBeufaJ8 = x6Var;
        this.wdg6QnbFHrFF = new jv(2);
    }

    @Override // defpackage.hu
    public final Object IAToe7bXGz4N(pe0 pe0Var, Object obj) {
        switch (this.rtx2ld2ELZv4) {
        }
        return pe0Var.rtx2ld2ELZv4(obj, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r8 == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(bt btVar, le0 le0Var) {
        al1 al1Var;
        su suVar;
        int i;
        boolean z;
        Object VhhvGxCb8gfr;
        Object PxuCJdSBwIXG;
        int i2 = 2;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                v6 v6Var = (v6) this.wdg6QnbFHrFF;
                bi biVar = new bi(1, ng0.IAToe7bXGz4N(btVar));
                biVar.ZbWwgt3aGe7A();
                w6 w6Var = new w6(biVar, this, le0Var);
                if (cs0.wdg6QnbFHrFF(v6Var.wdg6QnbFHrFF, (Choreographer) this.OPXfSBeufaJ8)) {
                    synchronized (v6Var.x50lh2ztY7Y5) {
                        v6Var.r3s1LDPKFs1S.add(w6Var);
                        if (!v6Var.BRwzKIf41E4i) {
                            v6Var.BRwzKIf41E4i = true;
                            v6Var.wdg6QnbFHrFF.postFrameCallback(v6Var.XL4ISE6Oc65B);
                        }
                    }
                    biVar.IAToe7bXGz4N(new z4(3, v6Var, w6Var));
                } else {
                    ((Choreographer) this.OPXfSBeufaJ8).postFrameCallback(w6Var);
                    biVar.IAToe7bXGz4N(new z4(4, this, w6Var));
                }
                return biVar.VhhvGxCb8gfr();
            case 1:
                bi biVar2 = new bi(1, ng0.IAToe7bXGz4N(btVar));
                biVar2.ZbWwgt3aGe7A();
                xb xbVar = (xb) this.wdg6QnbFHrFF;
                sf sfVar = new sf();
                sfVar.PxuCJdSBwIXG = biVar2;
                sfVar.lS5Rgt96tfkO = le0Var;
                biVar2.IAToe7bXGz4N(new d0(i2, xbVar.Y1f8riQaR6yg(sfVar, (at1) this.OPXfSBeufaJ8)));
                return biVar2.VhhvGxCb8gfr();
            default:
                if (btVar instanceof al1) {
                    al1Var = (al1) btVar;
                    int i3 = al1Var.r3s1LDPKFs1S;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        al1Var.r3s1LDPKFs1S = i3 - Integer.MIN_VALUE;
                        Object obj = al1Var.x50lh2ztY7Y5;
                        suVar = su.rtx2ld2ELZv4;
                        i = al1Var.r3s1LDPKFs1S;
                        if (i != 0) {
                            ng0.tmVwIGCQF4zR(obj);
                            jv jvVar = (jv) this.wdg6QnbFHrFF;
                            al1Var.dgRBjINgWbAK = le0Var;
                            al1Var.r3s1LDPKFs1S = 1;
                            synchronized (jvVar.lS5Rgt96tfkO) {
                                z = jvVar.PxuCJdSBwIXG;
                            }
                            if (!z) {
                                bi biVar3 = new bi(1, ng0.IAToe7bXGz4N(al1Var));
                                biVar3.ZbWwgt3aGe7A();
                                synchronized (jvVar.lS5Rgt96tfkO) {
                                    ((ArrayList) jvVar.TSizfFm2Yiuu).add(biVar3);
                                }
                                biVar3.IAToe7bXGz4N(new xt(i2, jvVar, biVar3));
                                VhhvGxCb8gfr = biVar3.VhhvGxCb8gfr();
                                if (VhhvGxCb8gfr != suVar) {
                                    VhhvGxCb8gfr = no2.PxuCJdSBwIXG;
                                    break;
                                }
                            } else {
                                VhhvGxCb8gfr = no2.PxuCJdSBwIXG;
                                break;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    ng0.tmVwIGCQF4zR(obj);
                                    return obj;
                                }
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            le0Var = al1Var.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj);
                        }
                        x6 x6Var = (x6) this.OPXfSBeufaJ8;
                        al1Var.dgRBjINgWbAK = null;
                        al1Var.r3s1LDPKFs1S = 2;
                        PxuCJdSBwIXG = x6Var.PxuCJdSBwIXG(al1Var, le0Var);
                        if (PxuCJdSBwIXG != suVar) {
                            return PxuCJdSBwIXG;
                        }
                        return suVar;
                    }
                }
                al1Var = new al1(this, btVar);
                Object obj2 = al1Var.x50lh2ztY7Y5;
                suVar = su.rtx2ld2ELZv4;
                i = al1Var.r3s1LDPKFs1S;
                if (i != 0) {
                }
                x6 x6Var2 = (x6) this.OPXfSBeufaJ8;
                al1Var.dgRBjINgWbAK = null;
                al1Var.r3s1LDPKFs1S = 2;
                PxuCJdSBwIXG = x6Var2.PxuCJdSBwIXG(al1Var, le0Var);
                if (PxuCJdSBwIXG != suVar) {
                }
                return suVar;
        }
    }

    @Override // defpackage.hu
    public final hu RfyTYNmI9Srp(hu huVar) {
        switch (this.rtx2ld2ELZv4) {
        }
        return f2.xfACYKDMU6Dj(this, huVar);
    }

    @Override // defpackage.hu
    public final fu S2OOm9zPNm0h(gu guVar) {
        switch (this.rtx2ld2ELZv4) {
        }
        return f2.EcgxDIVH5in8(this, guVar);
    }

    @Override // defpackage.fu
    public gu getKey() {
        return jx1.XL4ISE6Oc65B;
    }

    @Override // defpackage.hu
    public final hu kpCQ9veP6n3I(gu guVar) {
        switch (this.rtx2ld2ELZv4) {
        }
        return f2.IAToe7bXGz4N(this, guVar);
    }

    public x6(Choreographer choreographer, v6 v6Var) {
        this.rtx2ld2ELZv4 = 0;
        this.OPXfSBeufaJ8 = choreographer;
        this.wdg6QnbFHrFF = v6Var;
    }

    public x6(at1 at1Var) {
        this.rtx2ld2ELZv4 = 1;
        this.OPXfSBeufaJ8 = at1Var;
        this.wdg6QnbFHrFF = new xb();
    }
}
