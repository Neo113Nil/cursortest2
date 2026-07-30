package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wq implements sq {
    public final no1 OPXfSBeufaJ8;
    public final long cpQdD2nAriOS;
    public final ThreadLocal dgRBjINgWbAK;
    public final int r3s1LDPKFs1S;
    public final no1 rtx2ld2ELZv4;
    public final jx1 wdg6QnbFHrFF;
    public volatile boolean x50lh2ztY7Y5;

    public wq(final op0 op0Var, final String str, int i) {
        str.getClass();
        this.wdg6QnbFHrFF = new jx1(24);
        this.dgRBjINgWbAK = new ThreadLocal();
        t30 t30Var = u30.Companion;
        this.cpQdD2nAriOS = mm2.qudtW7lwm99e(30);
        this.r3s1LDPKFs1S = 2;
        if (i <= 0) {
            u9.XL4ISE6Oc65B("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.rtx2ld2ELZv4 = new no1(i, new ae0() { // from class: tq
            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i3 = i2;
                String str2 = str;
                op0 op0Var2 = op0Var;
                switch (i3) {
                    case 0:
                        fy1 TSizfFm2Yiuu = op0Var2.TSizfFm2Yiuu(str2);
                        sj0.S9EYkSpbGuxq(TSizfFm2Yiuu, "PRAGMA query_only = 1");
                        return TSizfFm2Yiuu;
                    default:
                        return op0Var2.TSizfFm2Yiuu(str2);
                }
            }
        });
        final int i3 = 1;
        this.OPXfSBeufaJ8 = new no1(1, new ae0() { // from class: tq
            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                int i32 = i3;
                String str2 = str;
                op0 op0Var2 = op0Var;
                switch (i32) {
                    case 0:
                        fy1 TSizfFm2Yiuu = op0Var2.TSizfFm2Yiuu(str2);
                        sj0.S9EYkSpbGuxq(TSizfFm2Yiuu, "PRAGMA query_only = 1");
                        return TSizfFm2Yiuu;
                    default:
                        return op0Var2.TSizfFm2Yiuu(str2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #1 {all -> 0x01a6, blocks: (B:55:0x0124, B:59:0x0140, B:61:0x014b, B:65:0x01aa, B:66:0x01b1), top: B:54:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa A[Catch: all -> 0x01a6, TRY_ENTER, TryCatch #1 {all -> 0x01a6, blocks: (B:55:0x0124, B:59:0x0140, B:61:0x014b, B:65:0x01aa, B:66:0x01b1), top: B:54:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.sq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EcgxDIVH5in8(boolean z, pe0 pe0Var, ct ctVar) {
        vq vqVar;
        int i;
        zt1 zt1Var;
        Throwable th;
        no1 no1Var;
        hu huVar;
        pe0 pe0Var2;
        jx1 jx1Var;
        no1 no1Var2;
        zt1 zt1Var2;
        Object obj;
        zt1 zt1Var3;
        vo1 vo1Var;
        boolean z2 = z;
        try {
            if (ctVar instanceof vq) {
                vqVar = (vq) ctVar;
                int i2 = vqVar.EcgxDIVH5in8;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vqVar.EcgxDIVH5in8 = i2 - Integer.MIN_VALUE;
                    Object obj2 = vqVar.XL4ISE6Oc65B;
                    su suVar = su.rtx2ld2ELZv4;
                    i = vqVar.EcgxDIVH5in8;
                    hu huVar2 = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj2);
                        if (this.x50lh2ztY7Y5) {
                            sj0.zf8DYfih6EZu("Connection pool is closed", 21);
                            throw null;
                        }
                        vo1 vo1Var2 = (vo1) this.dgRBjINgWbAK.get();
                        if (vo1Var2 == null) {
                            hu huVar3 = vqVar.OPXfSBeufaJ8;
                            huVar3.getClass();
                            oq oqVar = (oq) huVar3.S2OOm9zPNm0h(this.wdg6QnbFHrFF);
                            vo1Var2 = oqVar != null ? oqVar.OPXfSBeufaJ8 : null;
                        }
                        if (vo1Var2 == null) {
                            no1 no1Var3 = z2 ? this.rtx2ld2ELZv4 : this.OPXfSBeufaJ8;
                            zt1Var = new zt1();
                            try {
                                huVar = vqVar.OPXfSBeufaJ8;
                                huVar.getClass();
                                jx1 jx1Var2 = this.wdg6QnbFHrFF;
                                long j = this.cpQdD2nAriOS;
                                uq uqVar = new uq(this, z2);
                                vqVar.x50lh2ztY7Y5 = pe0Var;
                                vqVar.cpQdD2nAriOS = no1Var3;
                                vqVar.r3s1LDPKFs1S = zt1Var;
                                vqVar.QrzZRwfaDlRX = huVar;
                                vqVar.gPXPFXrUH4XX = zt1Var;
                                vqVar.BRwzKIf41E4i = jx1Var2;
                                vqVar.dgRBjINgWbAK = z2;
                                vqVar.EcgxDIVH5in8 = 3;
                                Object lS5Rgt96tfkO = no1Var3.lS5Rgt96tfkO(j, uqVar, vqVar);
                                if (lS5Rgt96tfkO != suVar) {
                                    pe0Var2 = pe0Var;
                                    jx1Var = jx1Var2;
                                    no1Var2 = no1Var3;
                                    obj2 = lS5Rgt96tfkO;
                                    zt1Var2 = zt1Var;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                no1Var = no1Var3;
                                throw th;
                            }
                        } else {
                            if (!z2 && vo1Var2.TSizfFm2Yiuu) {
                                sj0.zf8DYfih6EZu("Cannot upgrade connection from reader to writer", 1);
                                throw null;
                            }
                            hu huVar4 = vqVar.OPXfSBeufaJ8;
                            huVar4.getClass();
                            if (huVar4.S2OOm9zPNm0h(this.wdg6QnbFHrFF) == null) {
                                oq oqVar2 = new oq(this.wdg6QnbFHrFF, vo1Var2);
                                ThreadLocal threadLocal = this.dgRBjINgWbAK;
                                threadLocal.getClass();
                                hu xfACYKDMU6Dj = f2.xfACYKDMU6Dj(oqVar2, new mj2(vo1Var2, threadLocal));
                                a92UlCVFR9N8 a92ulcvfr9n8 = new a92UlCVFR9N8(pe0Var, vo1Var2, objArr == true ? 1 : 0, 13);
                                vqVar.EcgxDIVH5in8 = 1;
                                Object OYiFbU3x63rc = fx1.OYiFbU3x63rc(xfACYKDMU6Dj, a92ulcvfr9n8, vqVar);
                                if (OYiFbU3x63rc != suVar) {
                                    return OYiFbU3x63rc;
                                }
                            } else {
                                vqVar.EcgxDIVH5in8 = 2;
                                Object rtx2ld2ELZv4 = pe0Var.rtx2ld2ELZv4(vo1Var2, vqVar);
                                if (rtx2ld2ELZv4 != suVar) {
                                    return rtx2ld2ELZv4;
                                }
                            }
                        }
                        return suVar;
                    }
                    if (i == 1) {
                        ng0.tmVwIGCQF4zR(obj2);
                        return obj2;
                    }
                    if (i == 2) {
                        ng0.tmVwIGCQF4zR(obj2);
                        return obj2;
                    }
                    if (i == 3) {
                        z2 = vqVar.dgRBjINgWbAK;
                        jx1Var = vqVar.BRwzKIf41E4i;
                        zt1 zt1Var4 = vqVar.gPXPFXrUH4XX;
                        hu huVar5 = vqVar.QrzZRwfaDlRX;
                        zt1 zt1Var5 = vqVar.r3s1LDPKFs1S;
                        no1Var2 = (no1) vqVar.cpQdD2nAriOS;
                        pe0Var2 = (pe0) vqVar.x50lh2ztY7Y5;
                        try {
                            ng0.tmVwIGCQF4zR(obj2);
                            zt1Var2 = zt1Var4;
                            zt1Var = zt1Var5;
                            huVar = huVar5;
                        } catch (Throwable th3) {
                            th = th3;
                            zt1Var = zt1Var5;
                            no1Var = no1Var2;
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zt1Var3 = (zt1) vqVar.cpQdD2nAriOS;
                        no1Var = (no1) vqVar.x50lh2ztY7Y5;
                        try {
                            ng0.tmVwIGCQF4zR(obj2);
                            vo1Var = (vo1) zt1Var3.rtx2ld2ELZv4;
                            if (vo1Var != null) {
                                if (!vo1Var.e9gEMXR7LXtO) {
                                    vo1Var.e9gEMXR7LXtO = true;
                                    if (vo1Var.lS5Rgt96tfkO.rtx2ld2ELZv4.S9EYkSpbGuxq()) {
                                        sj0.S9EYkSpbGuxq(vo1Var.lS5Rgt96tfkO, "ROLLBACK TRANSACTION");
                                    }
                                }
                                gr grVar = vo1Var.lS5Rgt96tfkO;
                                grVar.wdg6QnbFHrFF = null;
                                grVar.dgRBjINgWbAK = null;
                                no1Var.e9gEMXR7LXtO(grVar);
                            }
                            return obj2;
                        } catch (Throwable th4) {
                            zt1Var = zt1Var3;
                            th = th4;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    gr grVar2 = (gr) obj2;
                    grVar2.getClass();
                    huVar.getClass();
                    grVar2.wdg6QnbFHrFF = huVar;
                    grVar2.dgRBjINgWbAK = new Throwable();
                    zt1Var2.rtx2ld2ELZv4 = new vo1(jx1Var, grVar2, this.rtx2ld2ELZv4 == this.OPXfSBeufaJ8 && z2);
                    obj = zt1Var.rtx2ld2ELZv4;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    vo1 vo1Var3 = (vo1) obj;
                    oq oqVar3 = new oq(this.wdg6QnbFHrFF, vo1Var3);
                    ThreadLocal threadLocal2 = this.dgRBjINgWbAK;
                    threadLocal2.getClass();
                    hu xfACYKDMU6Dj2 = f2.xfACYKDMU6Dj(oqVar3, new mj2(vo1Var3, threadLocal2));
                    a92UlCVFR9N8 a92ulcvfr9n82 = new a92UlCVFR9N8(pe0Var2, zt1Var, objArr2 == true ? 1 : 0, 14);
                    vqVar.x50lh2ztY7Y5 = no1Var2;
                    vqVar.cpQdD2nAriOS = zt1Var;
                    vqVar.r3s1LDPKFs1S = null;
                    vqVar.QrzZRwfaDlRX = null;
                    vqVar.gPXPFXrUH4XX = null;
                    vqVar.BRwzKIf41E4i = null;
                    vqVar.EcgxDIVH5in8 = 4;
                    obj2 = fx1.OYiFbU3x63rc(xfACYKDMU6Dj2, a92ulcvfr9n82, vqVar);
                    if (obj2 != suVar) {
                        zt1Var3 = zt1Var;
                        no1Var = no1Var2;
                        vo1Var = (vo1) zt1Var3.rtx2ld2ELZv4;
                        if (vo1Var != null) {
                        }
                        return obj2;
                    }
                    return suVar;
                }
            }
            gr grVar22 = (gr) obj2;
            grVar22.getClass();
            huVar.getClass();
            grVar22.wdg6QnbFHrFF = huVar;
            grVar22.dgRBjINgWbAK = new Throwable();
            zt1Var2.rtx2ld2ELZv4 = new vo1(jx1Var, grVar22, this.rtx2ld2ELZv4 == this.OPXfSBeufaJ8 && z2);
            obj = zt1Var.rtx2ld2ELZv4;
            if (obj != null) {
            }
        } catch (Throwable th5) {
            th = th5;
            no1Var = no1Var2;
            throw th;
        }
        vqVar = new vq(this, ctVar);
        Object obj22 = vqVar.XL4ISE6Oc65B;
        su suVar2 = su.rtx2ld2ELZv4;
        i = vqVar.EcgxDIVH5in8;
        hu huVar22 = null;
        Object[] objArr4 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        if (i != 0) {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.x50lh2ztY7Y5) {
            return;
        }
        this.x50lh2ztY7Y5 = true;
        this.rtx2ld2ELZv4.TSizfFm2Yiuu();
        this.OPXfSBeufaJ8.TSizfFm2Yiuu();
    }

    public wq(op0 op0Var) {
        this.wdg6QnbFHrFF = new jx1(24);
        this.dgRBjINgWbAK = new ThreadLocal();
        t30 t30Var = u30.Companion;
        this.cpQdD2nAriOS = mm2.qudtW7lwm99e(30);
        this.r3s1LDPKFs1S = 2;
        no1 no1Var = new no1(1, new o5(5, op0Var));
        this.rtx2ld2ELZv4 = no1Var;
        this.OPXfSBeufaJ8 = no1Var;
    }
}
