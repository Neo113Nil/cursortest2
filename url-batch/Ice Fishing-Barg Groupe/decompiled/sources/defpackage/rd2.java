package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class rd2 {
    public static final z20 PxuCJdSBwIXG = new z20(3, null, 2);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OPXfSBeufaJ8(oc2 oc2Var, rn1 rn1Var, nc ncVar) {
        qd2 qd2Var;
        int i;
        oc2 oc2Var2;
        qd2 qd2Var2;
        rn1 rn1Var2;
        oc2 oc2Var3;
        rn1 rn1Var3;
        int size;
        int i2;
        Object PxuCJdSBwIXG2;
        if (ncVar instanceof qd2) {
            qd2Var = (qd2) ncVar;
            int i3 = qd2Var.r3s1LDPKFs1S;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qd2Var.r3s1LDPKFs1S = i3 - Integer.MIN_VALUE;
                Object obj = qd2Var.cpQdD2nAriOS;
                i = qd2Var.r3s1LDPKFs1S;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    oc2Var2 = oc2Var;
                    qd2Var2 = qd2Var;
                    rn1Var2 = rn1Var;
                    qd2Var2.dgRBjINgWbAK = oc2Var2;
                    qd2Var2.x50lh2ztY7Y5 = rn1Var2;
                    qd2Var2.r3s1LDPKFs1S = 1;
                    PxuCJdSBwIXG2 = oc2Var2.PxuCJdSBwIXG(rn1Var2, qd2Var2);
                    if (PxuCJdSBwIXG2 != suVar) {
                    }
                    return suVar;
                }
                if (i == 1) {
                    rn1Var3 = qd2Var.x50lh2ztY7Y5;
                    oc2Var3 = qd2Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                    List list = ((qn1) obj).PxuCJdSBwIXG;
                    size = list.size();
                    while (i2 < size) {
                    }
                    return list.get(0);
                }
                if (i != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rn1Var3 = qd2Var.x50lh2ztY7Y5;
                oc2Var3 = qd2Var.dgRBjINgWbAK;
                ng0.tmVwIGCQF4zR(obj);
                rn1 rn1Var4 = rn1Var3;
                qd2Var2 = qd2Var;
                rn1Var2 = rn1Var4;
                List list2 = ((qn1) obj).PxuCJdSBwIXG;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    if (((ao1) list2.get(i4)).lS5Rgt96tfkO()) {
                        break;
                    }
                }
                oc2Var2 = oc2Var3;
                qd2Var2.dgRBjINgWbAK = oc2Var2;
                qd2Var2.x50lh2ztY7Y5 = rn1Var2;
                qd2Var2.r3s1LDPKFs1S = 1;
                PxuCJdSBwIXG2 = oc2Var2.PxuCJdSBwIXG(rn1Var2, qd2Var2);
                if (PxuCJdSBwIXG2 != suVar) {
                    oc2Var3 = oc2Var2;
                    obj = PxuCJdSBwIXG2;
                    qd2 qd2Var3 = qd2Var2;
                    rn1Var3 = rn1Var2;
                    qd2Var = qd2Var3;
                    List list3 = ((qn1) obj).PxuCJdSBwIXG;
                    size = list3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!ni0.dgRBjINgWbAK((ao1) list3.get(i2))) {
                            int size3 = list3.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                ao1 ao1Var = (ao1) list3.get(i5);
                                if (ao1Var.lS5Rgt96tfkO() || ni0.aF05bpZJlKEP(ao1Var, oc2Var3.cpQdD2nAriOS.rZjpSjn4zoMv, oc2Var3.TSizfFm2Yiuu())) {
                                    break;
                                }
                            }
                            qd2Var.dgRBjINgWbAK = oc2Var3;
                            qd2Var.x50lh2ztY7Y5 = rn1Var3;
                            qd2Var.r3s1LDPKFs1S = 2;
                            obj = oc2Var3.PxuCJdSBwIXG(rn1.wdg6QnbFHrFF, qd2Var);
                        }
                    }
                    return list3.get(0);
                }
                return suVar;
            }
        }
        qd2Var = new qd2(ncVar);
        Object obj2 = qd2Var.cpQdD2nAriOS;
        i = qd2Var.r3s1LDPKFs1S;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object PxuCJdSBwIXG(defpackage.oc2 r5, boolean r6, defpackage.rn1 r7, defpackage.nc r8) {
        /*
            boolean r0 = r8 instanceof defpackage.id2
            if (r0 == 0) goto L13
            r0 = r8
            id2 r0 = (defpackage.id2) r0
            int r1 = r0.QrzZRwfaDlRX
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.QrzZRwfaDlRX = r1
            goto L18
        L13:
            id2 r0 = new id2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.r3s1LDPKFs1S
            int r1 = r0.QrzZRwfaDlRX
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.cpQdD2nAriOS
            rn1 r6 = r0.x50lh2ztY7Y5
            oc2 r7 = r0.dgRBjINgWbAK
            defpackage.ng0.tmVwIGCQF4zR(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.u9.rtx2ld2ELZv4(r5)
            r5 = 0
            return r5
        L36:
            defpackage.ng0.tmVwIGCQF4zR(r8)
        L39:
            r0.dgRBjINgWbAK = r5
            r0.x50lh2ztY7Y5 = r7
            r0.cpQdD2nAriOS = r6
            r0.QrzZRwfaDlRX = r2
            java.lang.Object r8 = r5.PxuCJdSBwIXG(r7, r0)
            su r1 = defpackage.su.rtx2ld2ELZv4
            if (r8 != r1) goto L4a
            return r1
        L4a:
            qn1 r8 = (defpackage.qn1) r8
            boolean r1 = e9gEMXR7LXtO(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.PxuCJdSBwIXG
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd2.PxuCJdSBwIXG(oc2, boolean, rn1, nc):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, le0] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [bt, hu] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object RAsUl2FVSrh6(oc2 oc2Var, ru ruVar, up1 up1Var, qe0 qe0Var, le0 le0Var, nc ncVar) {
        nd2 nd2Var;
        int i;
        ru ruVar2;
        up1 up1Var2;
        bt btVar;
        qe0 qe0Var2;
        le0 le0Var2;
        int i2;
        Object lS5Rgt96tfkO;
        le0 le0Var3;
        le0 le0Var4;
        up1 up1Var3;
        ao1 ao1Var;
        oc2 oc2Var2;
        xs0 xs0Var;
        ru ruVar3;
        le0 le0Var5;
        up1 up1Var4;
        qe0 qe0Var3;
        le0 le0Var6;
        ru ruVar4;
        le0 le0Var7;
        le0 le0Var8;
        ao1 ao1Var2;
        up1 up1Var5;
        j31 j31Var;
        no2 no2Var;
        z82 a92UlCVFR9N8;
        le0 le0Var9;
        qe0 qe0Var4;
        oc2 oc2Var3;
        le0 le0Var10;
        le0 le0Var11;
        ao1 ao1Var3;
        xs0 xs0Var2;
        k31 k31Var;
        bt btVar2;
        up1 up1Var6;
        ru ruVar5;
        ao1 ao1Var4;
        ao1 ao1Var5;
        up1 up1Var7;
        bt btVar3;
        xs0 xs0Var3;
        ao1 ao1Var6;
        oc2 oc2Var4;
        ao1 ao1Var7;
        up1 up1Var8;
        ru ruVar6;
        le0 le0Var12;
        le0 le0Var13;
        le0 le0Var14;
        xs0 xs0Var4;
        ao1 ao1Var8;
        ru ruVar7;
        le0 le0Var15;
        le0 le0Var16;
        bt btVar4;
        ao1 ao1Var9;
        bt btVar5;
        ?? r13;
        k31 k31Var2;
        xs0 xs0Var5;
        ru ruVar8;
        bt btVar6;
        oc2 oc2Var5 = oc2Var;
        if (ncVar instanceof nd2) {
            nd2Var = (nd2) ncVar;
            int i3 = nd2Var.S9EYkSpbGuxq;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nd2Var.S9EYkSpbGuxq = i3 - Integer.MIN_VALUE;
                Object obj = nd2Var.EcgxDIVH5in8;
                i = nd2Var.S9EYkSpbGuxq;
                rn1 rn1Var = rn1.OPXfSBeufaJ8;
                j31 j31Var2 = j31.PxuCJdSBwIXG;
                z20 z20Var = PxuCJdSBwIXG;
                no2 no2Var2 = no2.PxuCJdSBwIXG;
                su suVar = su.rtx2ld2ELZv4;
                switch (i) {
                    case 0:
                        ng0.tmVwIGCQF4zR(obj);
                        nd2Var.dgRBjINgWbAK = oc2Var5;
                        ruVar2 = ruVar;
                        nd2Var.x50lh2ztY7Y5 = ruVar2;
                        up1Var2 = up1Var;
                        nd2Var.cpQdD2nAriOS = up1Var2;
                        btVar = 0;
                        nd2Var.r3s1LDPKFs1S = null;
                        nd2Var.QrzZRwfaDlRX = null;
                        qe0Var2 = qe0Var;
                        nd2Var.gPXPFXrUH4XX = qe0Var2;
                        le0Var2 = le0Var;
                        nd2Var.BRwzKIf41E4i = le0Var2;
                        i2 = 1;
                        nd2Var.S9EYkSpbGuxq = 1;
                        lS5Rgt96tfkO = lS5Rgt96tfkO(oc2Var5, nd2Var, 3);
                        if (lS5Rgt96tfkO != suVar) {
                            le0Var3 = null;
                            le0Var4 = null;
                            ao1 ao1Var10 = (ao1) lS5Rgt96tfkO;
                            ao1Var10.PxuCJdSBwIXG();
                            z82 KUoIVIumpKat = fx1.KUoIVIumpKat(ruVar2, btVar, new ld2(up1Var2, btVar, i2), i2);
                            if (qe0Var2 == z20Var) {
                                up1 up1Var9 = up1Var2;
                                up1Var3 = up1Var9;
                                ao1Var = ao1Var10;
                                a92UlCVFR9N8(ruVar2, KUoIVIumpKat, new od2(qe0Var2, up1Var9, ao1Var10, btVar, 0));
                            } else {
                                up1Var3 = up1Var2;
                                ao1Var = ao1Var10;
                            }
                            if (le0Var3 != null) {
                                nd2Var.dgRBjINgWbAK = oc2Var5;
                                nd2Var.x50lh2ztY7Y5 = ruVar2;
                                nd2Var.cpQdD2nAriOS = up1Var3;
                                nd2Var.r3s1LDPKFs1S = le0Var4;
                                nd2Var.QrzZRwfaDlRX = le0Var3;
                                nd2Var.gPXPFXrUH4XX = qe0Var2;
                                nd2Var.BRwzKIf41E4i = le0Var2;
                                nd2Var.XL4ISE6Oc65B = KUoIVIumpKat;
                                nd2Var.S9EYkSpbGuxq = 2;
                                Object OPXfSBeufaJ8 = OPXfSBeufaJ8(oc2Var5, rn1Var, nd2Var);
                                if (OPXfSBeufaJ8 != suVar) {
                                    oc2Var2 = oc2Var5;
                                    xs0Var = KUoIVIumpKat;
                                    qe0Var3 = qe0Var2;
                                    le0Var6 = le0Var3;
                                    ruVar4 = ruVar2;
                                    obj = OPXfSBeufaJ8;
                                    le0Var7 = le0Var2;
                                    le0Var8 = le0Var4;
                                    ao1Var2 = (ao1) obj;
                                    ru ruVar9 = ruVar4;
                                    le0Var3 = le0Var6;
                                    up1Var5 = up1Var3;
                                    ruVar3 = ruVar9;
                                    if (ao1Var2 == null) {
                                        j31Var = j31Var2;
                                        no2Var = no2Var2;
                                        a92UlCVFR9N8 = a92UlCVFR9N8(ruVar3, xs0Var, new kd2(up1Var5, null, 3));
                                    } else {
                                        j31Var = j31Var2;
                                        no2Var = no2Var2;
                                        ao1Var2.PxuCJdSBwIXG();
                                        a92UlCVFR9N8 = a92UlCVFR9N8(ruVar3, xs0Var, new kd2(up1Var5, null, 4));
                                    }
                                    if (ao1Var2 != null) {
                                        if (le0Var8 != null) {
                                            nd2Var.dgRBjINgWbAK = oc2Var2;
                                            nd2Var.x50lh2ztY7Y5 = ruVar3;
                                            nd2Var.cpQdD2nAriOS = up1Var5;
                                            nd2Var.r3s1LDPKFs1S = le0Var8;
                                            nd2Var.QrzZRwfaDlRX = le0Var3;
                                            nd2Var.gPXPFXrUH4XX = qe0Var3;
                                            nd2Var.BRwzKIf41E4i = le0Var7;
                                            nd2Var.XL4ISE6Oc65B = ao1Var2;
                                            nd2Var.RfyTYNmI9Srp = a92UlCVFR9N8;
                                            nd2Var.S9EYkSpbGuxq = 5;
                                            z82 z82Var = a92UlCVFR9N8;
                                            Object x50lh2ztY7Y5 = oc2Var2.x50lh2ztY7Y5(oc2Var2.a92UlCVFR9N8().lS5Rgt96tfkO(), new q22(ao1Var2, null), nd2Var);
                                            if (x50lh2ztY7Y5 != suVar) {
                                                le0Var9 = le0Var8;
                                                qe0Var4 = qe0Var3;
                                                oc2Var3 = oc2Var2;
                                                le0Var10 = le0Var3;
                                                le0Var11 = le0Var7;
                                                ao1Var3 = ao1Var2;
                                                obj = x50lh2ztY7Y5;
                                                xs0Var2 = z82Var;
                                                ao1Var4 = (ao1) obj;
                                                if (ao1Var4 == null) {
                                                    bt btVar7 = null;
                                                    z82 KUoIVIumpKat2 = fx1.KUoIVIumpKat(ruVar3, null, new n92(xs0Var2, up1Var5, btVar7, 1), 1);
                                                    if (qe0Var4 != z20Var) {
                                                        up1 up1Var10 = up1Var5;
                                                        od2 od2Var = new od2(qe0Var4, up1Var10, ao1Var4, btVar7, 1);
                                                        up1Var7 = up1Var10;
                                                        ao1Var5 = ao1Var4;
                                                        btVar3 = null;
                                                        a92UlCVFR9N8(ruVar3, KUoIVIumpKat2, od2Var);
                                                    } else {
                                                        ao1Var5 = ao1Var4;
                                                        up1Var7 = up1Var5;
                                                        btVar3 = null;
                                                    }
                                                    if (le0Var10 == null) {
                                                        nd2Var.dgRBjINgWbAK = ruVar3;
                                                        nd2Var.x50lh2ztY7Y5 = up1Var7;
                                                        nd2Var.cpQdD2nAriOS = le0Var9;
                                                        nd2Var.r3s1LDPKFs1S = le0Var11;
                                                        nd2Var.QrzZRwfaDlRX = KUoIVIumpKat2;
                                                        nd2Var.gPXPFXrUH4XX = ao1Var3;
                                                        nd2Var.BRwzKIf41E4i = btVar3;
                                                        nd2Var.XL4ISE6Oc65B = btVar3;
                                                        nd2Var.RfyTYNmI9Srp = btVar3;
                                                        nd2Var.S9EYkSpbGuxq = 6;
                                                        obj = OPXfSBeufaJ8(oc2Var3, rn1Var, nd2Var);
                                                        if (obj != suVar) {
                                                            ao1 ao1Var11 = ao1Var3;
                                                            xs0Var4 = KUoIVIumpKat2;
                                                            ao1Var8 = ao1Var11;
                                                            ruVar7 = ruVar3;
                                                            le0Var15 = le0Var11;
                                                            le0Var16 = le0Var9;
                                                            btVar4 = btVar3;
                                                            ao1Var9 = (ao1) obj;
                                                            btVar5 = btVar4;
                                                            if (ao1Var9 != null) {
                                                                ao1Var9.PxuCJdSBwIXG();
                                                                a92UlCVFR9N8(ruVar7, xs0Var4, new kd2(up1Var7, btVar5, 5));
                                                                le0Var16.OPXfSBeufaJ8(new bf1(ao1Var9.TSizfFm2Yiuu));
                                                                return no2Var;
                                                            }
                                                            a92UlCVFR9N8(ruVar7, xs0Var4, new kd2(up1Var7, btVar5, 6));
                                                            if (le0Var15 != null) {
                                                                le0Var15.OPXfSBeufaJ8(new bf1(ao1Var8.TSizfFm2Yiuu));
                                                                return no2Var;
                                                            }
                                                        }
                                                    } else {
                                                        nd2Var.dgRBjINgWbAK = oc2Var3;
                                                        nd2Var.x50lh2ztY7Y5 = ruVar3;
                                                        nd2Var.cpQdD2nAriOS = up1Var7;
                                                        nd2Var.r3s1LDPKFs1S = le0Var9;
                                                        nd2Var.QrzZRwfaDlRX = le0Var10;
                                                        nd2Var.gPXPFXrUH4XX = le0Var11;
                                                        nd2Var.BRwzKIf41E4i = KUoIVIumpKat2;
                                                        nd2Var.XL4ISE6Oc65B = ao1Var3;
                                                        nd2Var.RfyTYNmI9Srp = ao1Var5;
                                                        nd2Var.S9EYkSpbGuxq = 7;
                                                        Object rtx2ld2ELZv4 = rtx2ld2ELZv4(oc2Var3, rn1Var, nd2Var);
                                                        if (rtx2ld2ELZv4 != suVar) {
                                                            up1 up1Var11 = up1Var7;
                                                            xs0Var3 = KUoIVIumpKat2;
                                                            ao1Var6 = ao1Var5;
                                                            obj = rtx2ld2ELZv4;
                                                            oc2Var4 = oc2Var3;
                                                            ao1Var7 = ao1Var3;
                                                            up1Var8 = up1Var11;
                                                            ruVar6 = ruVar3;
                                                            le0Var12 = le0Var11;
                                                            le0Var13 = le0Var10;
                                                            le0Var14 = le0Var9;
                                                            r13 = btVar3;
                                                            k31Var2 = (k31) obj;
                                                            if (cs0.wdg6QnbFHrFF(k31Var2, j31Var)) {
                                                                if (k31Var2 instanceof i31) {
                                                                    ao1Var9 = ((i31) k31Var2).PxuCJdSBwIXG;
                                                                    xs0 xs0Var6 = xs0Var3;
                                                                    up1Var7 = up1Var8;
                                                                    xs0Var4 = xs0Var6;
                                                                    ao1Var8 = ao1Var7;
                                                                    le0Var15 = le0Var12;
                                                                    le0Var16 = le0Var14;
                                                                } else {
                                                                    if (!(k31Var2 instanceof h31)) {
                                                                        u9.gPXPFXrUH4XX();
                                                                        return null;
                                                                    }
                                                                    xs0 xs0Var7 = xs0Var3;
                                                                    up1Var7 = up1Var8;
                                                                    xs0Var4 = xs0Var7;
                                                                    ao1Var8 = ao1Var7;
                                                                    le0Var15 = le0Var12;
                                                                    le0Var16 = le0Var14;
                                                                    ao1Var9 = r13;
                                                                }
                                                                ruVar7 = ruVar6;
                                                                btVar5 = r13;
                                                                if (ao1Var9 != null) {
                                                                }
                                                            } else {
                                                                le0Var13.OPXfSBeufaJ8(new bf1(ao1Var6.TSizfFm2Yiuu));
                                                                nd2Var.dgRBjINgWbAK = ruVar6;
                                                                nd2Var.x50lh2ztY7Y5 = up1Var8;
                                                                nd2Var.cpQdD2nAriOS = xs0Var3;
                                                                nd2Var.r3s1LDPKFs1S = r13;
                                                                nd2Var.QrzZRwfaDlRX = r13;
                                                                nd2Var.gPXPFXrUH4XX = r13;
                                                                nd2Var.BRwzKIf41E4i = r13;
                                                                nd2Var.XL4ISE6Oc65B = r13;
                                                                nd2Var.RfyTYNmI9Srp = r13;
                                                                nd2Var.S9EYkSpbGuxq = 8;
                                                                if (TSizfFm2Yiuu(oc2Var4, nd2Var) != suVar) {
                                                                    xs0Var5 = xs0Var3;
                                                                    ruVar8 = ruVar6;
                                                                    btVar6 = r13;
                                                                    a92UlCVFR9N8(ruVar8, xs0Var5, new kd2(up1Var8, btVar6, 7));
                                                                    return no2Var;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (le0Var11 != null) {
                                                    le0Var11.OPXfSBeufaJ8(new bf1(ao1Var3.TSizfFm2Yiuu));
                                                    return no2Var;
                                                }
                                            }
                                        } else if (le0Var7 != null) {
                                            le0Var7.OPXfSBeufaJ8(new bf1(ao1Var2.TSizfFm2Yiuu));
                                            return no2Var;
                                        }
                                    }
                                    return no2Var;
                                }
                            } else {
                                nd2Var.dgRBjINgWbAK = oc2Var5;
                                nd2Var.x50lh2ztY7Y5 = ruVar2;
                                nd2Var.cpQdD2nAriOS = up1Var3;
                                nd2Var.r3s1LDPKFs1S = le0Var4;
                                nd2Var.QrzZRwfaDlRX = le0Var3;
                                nd2Var.gPXPFXrUH4XX = qe0Var2;
                                nd2Var.BRwzKIf41E4i = le0Var2;
                                nd2Var.XL4ISE6Oc65B = ao1Var;
                                nd2Var.RfyTYNmI9Srp = KUoIVIumpKat;
                                nd2Var.S9EYkSpbGuxq = 3;
                                Object rtx2ld2ELZv42 = rtx2ld2ELZv4(oc2Var5, rn1Var, nd2Var);
                                if (rtx2ld2ELZv42 != suVar) {
                                    oc2Var2 = oc2Var5;
                                    xs0Var = KUoIVIumpKat;
                                    up1 up1Var12 = up1Var3;
                                    ruVar3 = ruVar2;
                                    obj = rtx2ld2ELZv42;
                                    le0Var5 = le0Var2;
                                    up1Var4 = up1Var12;
                                    k31Var = (k31) obj;
                                    if (cs0.wdg6QnbFHrFF(k31Var, j31Var2)) {
                                        if (k31Var instanceof i31) {
                                            ao1Var2 = ((i31) k31Var).PxuCJdSBwIXG;
                                        } else {
                                            if (!(k31Var instanceof h31)) {
                                                u9.gPXPFXrUH4XX();
                                                return null;
                                            }
                                            ao1Var2 = null;
                                        }
                                        le0Var7 = le0Var5;
                                        qe0Var3 = qe0Var2;
                                        up1Var5 = up1Var4;
                                        le0Var8 = le0Var4;
                                        if (ao1Var2 == null) {
                                        }
                                        if (ao1Var2 != null) {
                                        }
                                        return no2Var;
                                    }
                                    le0Var3.OPXfSBeufaJ8(new bf1(ao1Var.TSizfFm2Yiuu));
                                    nd2Var.dgRBjINgWbAK = ruVar3;
                                    nd2Var.x50lh2ztY7Y5 = up1Var4;
                                    nd2Var.cpQdD2nAriOS = xs0Var;
                                    btVar2 = null;
                                    nd2Var.r3s1LDPKFs1S = null;
                                    nd2Var.QrzZRwfaDlRX = null;
                                    nd2Var.gPXPFXrUH4XX = null;
                                    nd2Var.BRwzKIf41E4i = null;
                                    nd2Var.XL4ISE6Oc65B = null;
                                    nd2Var.RfyTYNmI9Srp = null;
                                    nd2Var.S9EYkSpbGuxq = 4;
                                    if (TSizfFm2Yiuu(oc2Var2, nd2Var) != suVar) {
                                        up1Var6 = up1Var4;
                                        ruVar5 = ruVar3;
                                        a92UlCVFR9N8(ruVar5, xs0Var, new kd2(up1Var6, btVar2, 2));
                                        return no2Var2;
                                    }
                                }
                            }
                        }
                        return suVar;
                    case 1:
                        le0 le0Var17 = (le0) nd2Var.BRwzKIf41E4i;
                        qe0 qe0Var5 = (qe0) nd2Var.gPXPFXrUH4XX;
                        le0 le0Var18 = (le0) nd2Var.QrzZRwfaDlRX;
                        le0 le0Var19 = nd2Var.r3s1LDPKFs1S;
                        up1 up1Var13 = (up1) nd2Var.cpQdD2nAriOS;
                        ru ruVar10 = (ru) nd2Var.x50lh2ztY7Y5;
                        oc2 oc2Var6 = (oc2) nd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        lS5Rgt96tfkO = obj;
                        le0Var4 = le0Var19;
                        ruVar2 = ruVar10;
                        i2 = 1;
                        qe0Var2 = qe0Var5;
                        up1Var2 = up1Var13;
                        le0Var2 = le0Var17;
                        oc2Var5 = oc2Var6;
                        le0Var3 = le0Var18;
                        btVar = 0;
                        ao1 ao1Var102 = (ao1) lS5Rgt96tfkO;
                        ao1Var102.PxuCJdSBwIXG();
                        z82 KUoIVIumpKat3 = fx1.KUoIVIumpKat(ruVar2, btVar, new ld2(up1Var2, btVar, i2), i2);
                        if (qe0Var2 == z20Var) {
                        }
                        if (le0Var3 != null) {
                        }
                        return suVar;
                    case 2:
                        xs0Var = (xs0) nd2Var.XL4ISE6Oc65B;
                        le0Var7 = (le0) nd2Var.BRwzKIf41E4i;
                        qe0Var3 = (qe0) nd2Var.gPXPFXrUH4XX;
                        le0Var6 = (le0) nd2Var.QrzZRwfaDlRX;
                        le0Var8 = nd2Var.r3s1LDPKFs1S;
                        up1Var3 = (up1) nd2Var.cpQdD2nAriOS;
                        ruVar4 = (ru) nd2Var.x50lh2ztY7Y5;
                        oc2Var2 = (oc2) nd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        ao1Var2 = (ao1) obj;
                        ru ruVar92 = ruVar4;
                        le0Var3 = le0Var6;
                        up1Var5 = up1Var3;
                        ruVar3 = ruVar92;
                        if (ao1Var2 == null) {
                        }
                        if (ao1Var2 != null) {
                        }
                        return no2Var;
                    case 3:
                        xs0Var = (xs0) nd2Var.RfyTYNmI9Srp;
                        ao1Var = (ao1) nd2Var.XL4ISE6Oc65B;
                        le0Var5 = (le0) nd2Var.BRwzKIf41E4i;
                        qe0Var2 = (qe0) nd2Var.gPXPFXrUH4XX;
                        le0Var3 = (le0) nd2Var.QrzZRwfaDlRX;
                        le0Var4 = nd2Var.r3s1LDPKFs1S;
                        up1Var4 = (up1) nd2Var.cpQdD2nAriOS;
                        ruVar3 = (ru) nd2Var.x50lh2ztY7Y5;
                        oc2Var2 = (oc2) nd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        k31Var = (k31) obj;
                        if (cs0.wdg6QnbFHrFF(k31Var, j31Var2)) {
                        }
                        break;
                    case 4:
                        xs0Var = (xs0) nd2Var.cpQdD2nAriOS;
                        up1Var6 = (up1) nd2Var.x50lh2ztY7Y5;
                        ruVar5 = (ru) nd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        btVar2 = null;
                        a92UlCVFR9N8(ruVar5, xs0Var, new kd2(up1Var6, btVar2, 2));
                        return no2Var2;
                    case 5:
                        xs0Var2 = (xs0) nd2Var.RfyTYNmI9Srp;
                        ao1Var3 = (ao1) nd2Var.XL4ISE6Oc65B;
                        le0 le0Var20 = (le0) nd2Var.BRwzKIf41E4i;
                        qe0Var4 = (qe0) nd2Var.gPXPFXrUH4XX;
                        le0 le0Var21 = (le0) nd2Var.QrzZRwfaDlRX;
                        le0 le0Var22 = nd2Var.r3s1LDPKFs1S;
                        up1Var5 = (up1) nd2Var.cpQdD2nAriOS;
                        ru ruVar11 = (ru) nd2Var.x50lh2ztY7Y5;
                        oc2 oc2Var7 = (oc2) nd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        le0Var11 = le0Var20;
                        oc2Var3 = oc2Var7;
                        le0Var9 = le0Var22;
                        le0Var10 = le0Var21;
                        ruVar3 = ruVar11;
                        j31Var = j31Var2;
                        no2Var = no2Var2;
                        ao1Var4 = (ao1) obj;
                        if (ao1Var4 == null) {
                        }
                        break;
                    case 6:
                        ao1Var8 = (ao1) nd2Var.gPXPFXrUH4XX;
                        xs0Var4 = (xs0) nd2Var.QrzZRwfaDlRX;
                        le0Var15 = nd2Var.r3s1LDPKFs1S;
                        le0Var16 = (le0) nd2Var.cpQdD2nAriOS;
                        up1Var7 = (up1) nd2Var.x50lh2ztY7Y5;
                        ruVar7 = (ru) nd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        no2Var = no2Var2;
                        btVar4 = null;
                        ao1Var9 = (ao1) obj;
                        btVar5 = btVar4;
                        if (ao1Var9 != null) {
                        }
                        break;
                    case 7:
                        ao1Var6 = (ao1) nd2Var.RfyTYNmI9Srp;
                        ao1 ao1Var12 = (ao1) nd2Var.XL4ISE6Oc65B;
                        xs0Var3 = (xs0) nd2Var.BRwzKIf41E4i;
                        le0Var12 = (le0) nd2Var.gPXPFXrUH4XX;
                        le0Var13 = (le0) nd2Var.QrzZRwfaDlRX;
                        le0Var14 = nd2Var.r3s1LDPKFs1S;
                        up1 up1Var14 = (up1) nd2Var.cpQdD2nAriOS;
                        ruVar6 = (ru) nd2Var.x50lh2ztY7Y5;
                        oc2 oc2Var8 = (oc2) nd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        oc2Var4 = oc2Var8;
                        j31Var = j31Var2;
                        no2Var = no2Var2;
                        r13 = 0;
                        ao1Var7 = ao1Var12;
                        up1Var8 = up1Var14;
                        k31Var2 = (k31) obj;
                        if (cs0.wdg6QnbFHrFF(k31Var2, j31Var)) {
                        }
                        break;
                    case 8:
                        xs0Var5 = (xs0) nd2Var.cpQdD2nAriOS;
                        up1Var8 = (up1) nd2Var.x50lh2ztY7Y5;
                        ruVar8 = (ru) nd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        no2Var = no2Var2;
                        btVar6 = null;
                        a92UlCVFR9N8(ruVar8, xs0Var5, new kd2(up1Var8, btVar6, 7));
                        return no2Var;
                    default:
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        nd2Var = new nd2(ncVar);
        Object obj2 = nd2Var.EcgxDIVH5in8;
        i = nd2Var.S9EYkSpbGuxq;
        rn1 rn1Var2 = rn1.OPXfSBeufaJ8;
        j31 j31Var22 = j31.PxuCJdSBwIXG;
        z20 z20Var2 = PxuCJdSBwIXG;
        no2 no2Var22 = no2.PxuCJdSBwIXG;
        su suVar2 = su.rtx2ld2ELZv4;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[LOOP:0: B:11:0x004a->B:12:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object TSizfFm2Yiuu(oc2 oc2Var, ct ctVar) {
        jd2 jd2Var;
        int i;
        su suVar;
        int size;
        int i2;
        int i3;
        int size2;
        if (ctVar instanceof jd2) {
            jd2Var = (jd2) ctVar;
            int i4 = jd2Var.cpQdD2nAriOS;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jd2Var.cpQdD2nAriOS = i4 - Integer.MIN_VALUE;
                Object obj = jd2Var.x50lh2ztY7Y5;
                i = jd2Var.cpQdD2nAriOS;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    jd2Var.dgRBjINgWbAK = oc2Var;
                    jd2Var.cpQdD2nAriOS = 1;
                    obj = oc2Var.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, jd2Var);
                    suVar = su.rtx2ld2ELZv4;
                    if (obj == suVar) {
                    }
                    qn1 qn1Var = (qn1) obj;
                    List list = qn1Var.PxuCJdSBwIXG;
                    size = list.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    List list2 = qn1Var.PxuCJdSBwIXG;
                    size2 = list2.size();
                    while (i2 < size2) {
                    }
                    return no2.PxuCJdSBwIXG;
                }
                if (i != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oc2Var = jd2Var.dgRBjINgWbAK;
                ng0.tmVwIGCQF4zR(obj);
                qn1 qn1Var2 = (qn1) obj;
                List list3 = qn1Var2.PxuCJdSBwIXG;
                size = list3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    ((ao1) list3.get(i3)).PxuCJdSBwIXG();
                }
                List list22 = qn1Var2.PxuCJdSBwIXG;
                size2 = list22.size();
                while (i2 < size2) {
                    if (((ao1) list22.get(i2)).Y1f8riQaR6yg) {
                        jd2Var.dgRBjINgWbAK = oc2Var;
                        jd2Var.cpQdD2nAriOS = 1;
                        obj = oc2Var.PxuCJdSBwIXG(rn1.OPXfSBeufaJ8, jd2Var);
                        suVar = su.rtx2ld2ELZv4;
                        if (obj == suVar) {
                            return suVar;
                        }
                        qn1 qn1Var22 = (qn1) obj;
                        List list32 = qn1Var22.PxuCJdSBwIXG;
                        size = list32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        List list222 = qn1Var22.PxuCJdSBwIXG;
                        size2 = list222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return no2.PxuCJdSBwIXG;
            }
        }
        jd2Var = new jd2(ctVar);
        Object obj2 = jd2Var.x50lh2ztY7Y5;
        i = jd2Var.cpQdD2nAriOS;
        if (i != 0) {
        }
    }

    public static Object Y1f8riQaR6yg(eo1 eo1Var, u62 u62Var, le0 le0Var, bt btVar, int i) {
        qe0 qe0Var = u62Var;
        if ((i & 4) != 0) {
            qe0Var = PxuCJdSBwIXG;
        }
        Object XL4ISE6Oc65B = cs0.XL4ISE6Oc65B(new e4(eo1Var, qe0Var, le0Var, (bt) null), btVar);
        return XL4ISE6Oc65B == su.rtx2ld2ELZv4 ? XL4ISE6Oc65B : no2.PxuCJdSBwIXG;
    }

    public static z82 a92UlCVFR9N8(ru ruVar, xs0 xs0Var, pe0 pe0Var) {
        return fx1.KUoIVIumpKat(ruVar, null, new rtx2ld2ELZv4(xs0Var, pe0Var, null, 20), 1);
    }

    public static boolean e9gEMXR7LXtO(qn1 qn1Var, boolean z) {
        List list = qn1Var.PxuCJdSBwIXG;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ao1 ao1Var = (ao1) list.get(i);
            if (!(z ? ni0.OPXfSBeufaJ8(ao1Var) : ni0.wdg6QnbFHrFF(ao1Var))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object lS5Rgt96tfkO(oc2 oc2Var, nc ncVar, int i) {
        return PxuCJdSBwIXG(oc2Var, (i & 1) != 0, rn1.OPXfSBeufaJ8, ncVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rtx2ld2ELZv4(oc2 oc2Var, rn1 rn1Var, ct ctVar) {
        pd2 pd2Var;
        int i;
        zt1 zt1Var;
        try {
            if (ctVar instanceof pd2) {
                pd2Var = (pd2) ctVar;
                int i2 = pd2Var.cpQdD2nAriOS;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pd2Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                    Object obj = pd2Var.x50lh2ztY7Y5;
                    i = pd2Var.cpQdD2nAriOS;
                    bt btVar = null;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        zt1 zt1Var2 = new zt1();
                        zt1Var2.rtx2ld2ELZv4 = h31.PxuCJdSBwIXG;
                        long TSizfFm2Yiuu = oc2Var.a92UlCVFR9N8().TSizfFm2Yiuu();
                        pe0 bd0Var = new bd0(rn1Var, zt1Var2, btVar, 3);
                        pd2Var.dgRBjINgWbAK = zt1Var2;
                        pd2Var.cpQdD2nAriOS = 1;
                        Object OPXfSBeufaJ8 = oc2Var.OPXfSBeufaJ8(TSizfFm2Yiuu, bd0Var, pd2Var);
                        Object obj2 = su.rtx2ld2ELZv4;
                        if (OPXfSBeufaJ8 == obj2) {
                            return obj2;
                        }
                        zt1Var = zt1Var2;
                    } else {
                        if (i != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zt1Var = pd2Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    return zt1Var.rtx2ld2ELZv4;
                }
            }
            if (i != 0) {
            }
            return zt1Var.rtx2ld2ELZv4;
        } catch (sn1 unused) {
            return j31.PxuCJdSBwIXG;
        }
        pd2Var = new pd2(ctVar);
        Object obj3 = pd2Var.x50lh2ztY7Y5;
        i = pd2Var.cpQdD2nAriOS;
        bt btVar2 = null;
    }
}
