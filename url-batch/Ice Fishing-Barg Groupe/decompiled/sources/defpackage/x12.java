package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x12 extends to {
    public float BRwzKIf41E4i;
    public final fj1 OPXfSBeufaJ8;
    public q12 QrzZRwfaDlRX;
    public final uy1 RAsUl2FVSrh6;
    public final mj1 TSizfFm2Yiuu;
    public final o12 XL4ISE6Oc65B;
    public Object Y1f8riQaR6yg;
    public long a92UlCVFR9N8;
    public long cpQdD2nAriOS;
    public final r91 dgRBjINgWbAK;
    public gl2 e9gEMXR7LXtO;
    public final o12 gPXPFXrUH4XX;
    public final mj1 lS5Rgt96tfkO;
    public final p81 r3s1LDPKFs1S;
    public f82 rtx2ld2ELZv4;
    public bi wdg6QnbFHrFF;
    public final o91 x50lh2ztY7Y5;
    private static final p12 Companion = new p12();
    public static final k8 RfyTYNmI9Srp = new k8(0.0f);
    public static final k8 EcgxDIVH5in8 = new k8(1.0f);

    /* JADX WARN: Type inference failed for: r3v6, types: [o12] */
    /* JADX WARN: Type inference failed for: r3v7, types: [o12] */
    public x12(x91 x91Var) {
        super(2);
        this.lS5Rgt96tfkO = sj0.tmVwIGCQF4zR(x91Var);
        this.TSizfFm2Yiuu = sj0.tmVwIGCQF4zR(x91Var);
        this.Y1f8riQaR6yg = x91Var;
        this.RAsUl2FVSrh6 = new uy1(5, this);
        this.OPXfSBeufaJ8 = new fj1(0.0f);
        this.dgRBjINgWbAK = new r91();
        this.x50lh2ztY7Y5 = new o91();
        this.cpQdD2nAriOS = Long.MIN_VALUE;
        this.r3s1LDPKFs1S = new p81();
        final int i = 0;
        this.gPXPFXrUH4XX = new le0(this) { // from class: o12
            public final /* synthetic */ x12 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.le0
            public final Object OPXfSBeufaJ8(Object obj) {
                int i2 = i;
                no2 no2Var = no2.PxuCJdSBwIXG;
                x12 x12Var = this.OPXfSBeufaJ8;
                long longValue = ((Long) obj).longValue();
                switch (i2) {
                    case 0:
                        x12Var.cpQdD2nAriOS = longValue;
                        break;
                    default:
                        long j = longValue - x12Var.cpQdD2nAriOS;
                        x12Var.cpQdD2nAriOS = longValue;
                        long JHNfcAUfKc4G = b51.JHNfcAUfKc4G(j / x12Var.BRwzKIf41E4i);
                        p81 p81Var = x12Var.r3s1LDPKFs1S;
                        if (p81Var.OPXfSBeufaJ8()) {
                            Object[] objArr = p81Var.PxuCJdSBwIXG;
                            int i3 = p81Var.lS5Rgt96tfkO;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                q12 q12Var = (q12) objArr[i5];
                                x12.EcgxDIVH5in8(q12Var, JHNfcAUfKc4G);
                                q12Var.TSizfFm2Yiuu = true;
                            }
                            gl2 gl2Var = x12Var.e9gEMXR7LXtO;
                            if (gl2Var != null) {
                                gl2Var.QrzZRwfaDlRX();
                            }
                            int i6 = p81Var.lS5Rgt96tfkO;
                            Object[] objArr2 = p81Var.PxuCJdSBwIXG;
                            br0 nLZGh9p8gVSu = ng0.nLZGh9p8gVSu(0, i6);
                            int i7 = nLZGh9p8gVSu.rtx2ld2ELZv4;
                            int i8 = nLZGh9p8gVSu.OPXfSBeufaJ8;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((q12) objArr2[i7]).TSizfFm2Yiuu) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            na.v6yxfmkxNKhL(i6 - i4, i6, null, objArr2);
                            p81Var.lS5Rgt96tfkO -= i4;
                        }
                        q12 q12Var2 = x12Var.QrzZRwfaDlRX;
                        if (q12Var2 != null) {
                            q12Var2.RAsUl2FVSrh6 = x12Var.a92UlCVFR9N8;
                            x12.EcgxDIVH5in8(q12Var2, JHNfcAUfKc4G);
                            x12Var.S2OOm9zPNm0h(q12Var2.Y1f8riQaR6yg);
                            if (q12Var2.Y1f8riQaR6yg == 1.0f) {
                                x12Var.QrzZRwfaDlRX = null;
                            }
                            x12Var.VhhvGxCb8gfr();
                            break;
                        }
                        break;
                }
                return no2Var;
            }
        };
        final int i2 = 1;
        this.XL4ISE6Oc65B = new le0(this) { // from class: o12
            public final /* synthetic */ x12 OPXfSBeufaJ8;

            {
                this.OPXfSBeufaJ8 = this;
            }

            @Override // defpackage.le0
            public final Object OPXfSBeufaJ8(Object obj) {
                int i22 = i2;
                no2 no2Var = no2.PxuCJdSBwIXG;
                x12 x12Var = this.OPXfSBeufaJ8;
                long longValue = ((Long) obj).longValue();
                switch (i22) {
                    case 0:
                        x12Var.cpQdD2nAriOS = longValue;
                        break;
                    default:
                        long j = longValue - x12Var.cpQdD2nAriOS;
                        x12Var.cpQdD2nAriOS = longValue;
                        long JHNfcAUfKc4G = b51.JHNfcAUfKc4G(j / x12Var.BRwzKIf41E4i);
                        p81 p81Var = x12Var.r3s1LDPKFs1S;
                        if (p81Var.OPXfSBeufaJ8()) {
                            Object[] objArr = p81Var.PxuCJdSBwIXG;
                            int i3 = p81Var.lS5Rgt96tfkO;
                            int i4 = 0;
                            for (int i5 = 0; i5 < i3; i5++) {
                                q12 q12Var = (q12) objArr[i5];
                                x12.EcgxDIVH5in8(q12Var, JHNfcAUfKc4G);
                                q12Var.TSizfFm2Yiuu = true;
                            }
                            gl2 gl2Var = x12Var.e9gEMXR7LXtO;
                            if (gl2Var != null) {
                                gl2Var.QrzZRwfaDlRX();
                            }
                            int i6 = p81Var.lS5Rgt96tfkO;
                            Object[] objArr2 = p81Var.PxuCJdSBwIXG;
                            br0 nLZGh9p8gVSu = ng0.nLZGh9p8gVSu(0, i6);
                            int i7 = nLZGh9p8gVSu.rtx2ld2ELZv4;
                            int i8 = nLZGh9p8gVSu.OPXfSBeufaJ8;
                            if (i7 <= i8) {
                                while (true) {
                                    objArr2[i7 - i4] = objArr2[i7];
                                    if (((q12) objArr2[i7]).TSizfFm2Yiuu) {
                                        i4++;
                                    }
                                    if (i7 != i8) {
                                        i7++;
                                    }
                                }
                            }
                            na.v6yxfmkxNKhL(i6 - i4, i6, null, objArr2);
                            p81Var.lS5Rgt96tfkO -= i4;
                        }
                        q12 q12Var2 = x12Var.QrzZRwfaDlRX;
                        if (q12Var2 != null) {
                            q12Var2.RAsUl2FVSrh6 = x12Var.a92UlCVFR9N8;
                            x12.EcgxDIVH5in8(q12Var2, JHNfcAUfKc4G);
                            x12Var.S2OOm9zPNm0h(q12Var2.Y1f8riQaR6yg);
                            if (q12Var2.Y1f8riQaR6yg == 1.0f) {
                                x12Var.QrzZRwfaDlRX = null;
                            }
                            x12Var.VhhvGxCb8gfr();
                            break;
                        }
                        break;
                }
                return no2Var;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r0.a92UlCVFR9N8(r1) == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object BRwzKIf41E4i(x12 x12Var, ct ctVar) {
        w12 w12Var;
        int i;
        Object value;
        Object obj;
        r91 r91Var = x12Var.dgRBjINgWbAK;
        if (ctVar instanceof w12) {
            w12Var = (w12) ctVar;
            int i2 = w12Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w12Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj2 = w12Var.x50lh2ztY7Y5;
                i = w12Var.r3s1LDPKFs1S;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj2);
                    value = x12Var.lS5Rgt96tfkO.getValue();
                    w12Var.dgRBjINgWbAK = value;
                    w12Var.r3s1LDPKFs1S = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = w12Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj2);
                        if (!cs0.wdg6QnbFHrFF(obj2, obj)) {
                            x12Var.cpQdD2nAriOS = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return no2.PxuCJdSBwIXG;
                    }
                    Object obj3 = w12Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj2);
                    value = obj3;
                }
                if (!cs0.wdg6QnbFHrFF(value, x12Var.Y1f8riQaR6yg)) {
                    r91Var.lS5Rgt96tfkO(null);
                    return no2.PxuCJdSBwIXG;
                }
                w12Var.dgRBjINgWbAK = value;
                w12Var.r3s1LDPKFs1S = 2;
                bi biVar = new bi(1, ng0.IAToe7bXGz4N(w12Var));
                biVar.ZbWwgt3aGe7A();
                x12Var.wdg6QnbFHrFF = biVar;
                r91Var.lS5Rgt96tfkO(null);
                Object VhhvGxCb8gfr = biVar.VhhvGxCb8gfr();
                if (VhhvGxCb8gfr != suVar) {
                    obj = value;
                    obj2 = VhhvGxCb8gfr;
                    if (!cs0.wdg6QnbFHrFF(obj2, obj)) {
                    }
                    return no2.PxuCJdSBwIXG;
                }
                return suVar;
            }
        }
        w12Var = new w12(x12Var, ctVar);
        Object obj22 = w12Var.x50lh2ztY7Y5;
        i = w12Var.r3s1LDPKFs1S;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        if (!cs0.wdg6QnbFHrFF(value, x12Var.Y1f8riQaR6yg)) {
        }
    }

    public static void EcgxDIVH5in8(q12 q12Var, long j) {
        long j2 = q12Var.PxuCJdSBwIXG + j;
        q12Var.PxuCJdSBwIXG = j2;
        long j3 = q12Var.rtx2ld2ELZv4;
        if (j2 >= j3) {
            q12Var.Y1f8riQaR6yg = 1.0f;
            return;
        }
        vp2 vp2Var = q12Var.lS5Rgt96tfkO;
        k8 k8Var = q12Var.e9gEMXR7LXtO;
        if (vp2Var == null) {
            float f = j2 / j3;
            q12Var.Y1f8riQaR6yg = (f * 1.0f) + ((1.0f - f) * k8Var.PxuCJdSBwIXG(0));
            return;
        }
        k8 k8Var2 = q12Var.a92UlCVFR9N8;
        if (k8Var2 == null) {
            k8Var2 = RfyTYNmI9Srp;
        }
        q12Var.Y1f8riQaR6yg = ng0.OPXfSBeufaJ8(((k8) vp2Var.QrzZRwfaDlRX(j2, k8Var, EcgxDIVH5in8, k8Var2)).PxuCJdSBwIXG(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (defpackage.ki0.BjEWd04qc7Mw(r11).PxuCJdSBwIXG(r1, r2) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object QrzZRwfaDlRX(x12 x12Var, ct ctVar) {
        s12 s12Var;
        int i;
        Object obj;
        p81 p81Var = x12Var.r3s1LDPKFs1S;
        if (ctVar instanceof s12) {
            s12Var = (s12) ctVar;
            int i2 = s12Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s12Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                hu huVar = s12Var.OPXfSBeufaJ8;
                Object obj2 = s12Var.dgRBjINgWbAK;
                i = s12Var.cpQdD2nAriOS;
                no2 no2Var = no2.PxuCJdSBwIXG;
                obj = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj2);
                    if (p81Var.rtx2ld2ELZv4() && x12Var.QrzZRwfaDlRX == null) {
                        return no2Var;
                    }
                    huVar.getClass();
                    if (ki0.kpCQ9veP6n3I(huVar) == 0.0f) {
                        x12Var.RfyTYNmI9Srp();
                        x12Var.cpQdD2nAriOS = Long.MIN_VALUE;
                        return no2Var;
                    }
                    if (x12Var.cpQdD2nAriOS == Long.MIN_VALUE) {
                        o12 o12Var = x12Var.gPXPFXrUH4XX;
                        s12Var.cpQdD2nAriOS = 1;
                        huVar.getClass();
                    }
                } else {
                    if (i != 1 && i != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj2);
                }
                do {
                    if (p81Var.OPXfSBeufaJ8() && x12Var.QrzZRwfaDlRX == null) {
                        x12Var.cpQdD2nAriOS = Long.MIN_VALUE;
                        return no2Var;
                    }
                    s12Var.cpQdD2nAriOS = 2;
                } while (x12Var.XL4ISE6Oc65B(s12Var) != obj);
                return obj;
            }
        }
        s12Var = new s12(x12Var, ctVar);
        hu huVar2 = s12Var.OPXfSBeufaJ8;
        Object obj22 = s12Var.dgRBjINgWbAK;
        i = s12Var.cpQdD2nAriOS;
        no2 no2Var2 = no2.PxuCJdSBwIXG;
        obj = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        do {
            if (p81Var.OPXfSBeufaJ8()) {
            }
            s12Var.cpQdD2nAriOS = 2;
        } while (x12Var.XL4ISE6Oc65B(s12Var) != obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r0.a92UlCVFR9N8(r1) == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object gPXPFXrUH4XX(x12 x12Var, ct ctVar) {
        v12 v12Var;
        int i;
        su suVar;
        Object value;
        Object VhhvGxCb8gfr;
        Object obj;
        r91 r91Var = x12Var.dgRBjINgWbAK;
        if (ctVar instanceof v12) {
            v12Var = (v12) ctVar;
            int i2 = v12Var.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v12Var.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj2 = v12Var.x50lh2ztY7Y5;
                i = v12Var.r3s1LDPKFs1S;
                suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj2);
                    value = x12Var.lS5Rgt96tfkO.getValue();
                    v12Var.dgRBjINgWbAK = value;
                    v12Var.r3s1LDPKFs1S = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = v12Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj2);
                        if (!cs0.wdg6QnbFHrFF(obj2, obj)) {
                            return no2.PxuCJdSBwIXG;
                        }
                        x12Var.cpQdD2nAriOS = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = v12Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj2);
                    value = obj3;
                }
                v12Var.dgRBjINgWbAK = value;
                v12Var.r3s1LDPKFs1S = 2;
                bi biVar = new bi(1, ng0.IAToe7bXGz4N(v12Var));
                biVar.ZbWwgt3aGe7A();
                x12Var.wdg6QnbFHrFF = biVar;
                r91Var.lS5Rgt96tfkO(null);
                VhhvGxCb8gfr = biVar.VhhvGxCb8gfr();
                if (VhhvGxCb8gfr != suVar) {
                    obj = value;
                    obj2 = VhhvGxCb8gfr;
                    if (!cs0.wdg6QnbFHrFF(obj2, obj)) {
                    }
                }
                return suVar;
            }
        }
        v12Var = new v12(x12Var, ctVar);
        Object obj22 = v12Var.x50lh2ztY7Y5;
        i = v12Var.r3s1LDPKFs1S;
        suVar = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        v12Var.dgRBjINgWbAK = value;
        v12Var.r3s1LDPKFs1S = 2;
        bi biVar2 = new bi(1, ng0.IAToe7bXGz4N(v12Var));
        biVar2.ZbWwgt3aGe7A();
        x12Var.wdg6QnbFHrFF = biVar2;
        r91Var.lS5Rgt96tfkO(null);
        VhhvGxCb8gfr = biVar2.VhhvGxCb8gfr();
        if (VhhvGxCb8gfr != suVar) {
        }
        return suVar;
    }

    public static final void r3s1LDPKFs1S(x12 x12Var) {
        fj1 fj1Var = x12Var.OPXfSBeufaJ8;
        gl2 gl2Var = x12Var.e9gEMXR7LXtO;
        if (gl2Var == null) {
            return;
        }
        q12 q12Var = x12Var.QrzZRwfaDlRX;
        if (q12Var == null) {
            if (x12Var.a92UlCVFR9N8 <= 0 || fj1Var.rtx2ld2ELZv4() == 1.0f || cs0.wdg6QnbFHrFF(x12Var.TSizfFm2Yiuu.getValue(), x12Var.lS5Rgt96tfkO.getValue())) {
                q12Var = null;
            } else {
                q12Var = new q12();
                q12Var.Y1f8riQaR6yg = fj1Var.rtx2ld2ELZv4();
                long j = x12Var.a92UlCVFR9N8;
                q12Var.RAsUl2FVSrh6 = j;
                q12Var.rtx2ld2ELZv4 = b51.JHNfcAUfKc4G((1.0d - fj1Var.rtx2ld2ELZv4()) * j);
                q12Var.e9gEMXR7LXtO.e9gEMXR7LXtO(fj1Var.rtx2ld2ELZv4(), 0);
            }
        }
        if (q12Var != null) {
            q12Var.RAsUl2FVSrh6 = x12Var.a92UlCVFR9N8;
            x12Var.r3s1LDPKFs1S.PxuCJdSBwIXG(q12Var);
            gl2Var.cpQdD2nAriOS(q12Var);
        }
        x12Var.QrzZRwfaDlRX = null;
    }

    public final void RfyTYNmI9Srp() {
        gl2 gl2Var = this.e9gEMXR7LXtO;
        if (gl2Var != null) {
            gl2Var.TSizfFm2Yiuu();
        }
        this.r3s1LDPKFs1S.Y1f8riQaR6yg();
        if (this.QrzZRwfaDlRX != null) {
            this.QrzZRwfaDlRX = null;
            S2OOm9zPNm0h(1.0f);
            VhhvGxCb8gfr();
        }
    }

    public final void S2OOm9zPNm0h(float f) {
        this.OPXfSBeufaJ8.OPXfSBeufaJ8(f);
    }

    public final Object S9EYkSpbGuxq(float f, Object obj, jc2 jc2Var) {
        if (0.0f > f || f > 1.0f) {
            ip1.PxuCJdSBwIXG("Expecting fraction between 0 and 1. Got " + f);
        }
        gl2 gl2Var = this.e9gEMXR7LXtO;
        if (gl2Var != null) {
            Object PxuCJdSBwIXG = o91.PxuCJdSBwIXG(this.x50lh2ztY7Y5, new u12(obj, this.lS5Rgt96tfkO.getValue(), this, gl2Var, f, null), jc2Var);
            if (PxuCJdSBwIXG == su.rtx2ld2ELZv4) {
                return PxuCJdSBwIXG;
            }
        }
        return no2.PxuCJdSBwIXG;
    }

    public final void VhhvGxCb8gfr() {
        gl2 gl2Var = this.e9gEMXR7LXtO;
        if (gl2Var == null) {
            return;
        }
        gl2Var.x50lh2ztY7Y5(b51.JHNfcAUfKc4G(this.OPXfSBeufaJ8.rtx2ld2ELZv4() * ((Number) gl2Var.x50lh2ztY7Y5.getValue()).longValue()));
    }

    public final Object XL4ISE6Oc65B(ct ctVar) {
        float kpCQ9veP6n3I = ki0.kpCQ9veP6n3I(ctVar.e9gEMXR7LXtO());
        no2 no2Var = no2.PxuCJdSBwIXG;
        if (kpCQ9veP6n3I <= 0.0f) {
            RfyTYNmI9Srp();
            return no2Var;
        }
        this.BRwzKIf41E4i = kpCQ9veP6n3I;
        Object PxuCJdSBwIXG = ki0.BjEWd04qc7Mw(ctVar.e9gEMXR7LXtO()).PxuCJdSBwIXG(ctVar, this.XL4ISE6Oc65B);
        return PxuCJdSBwIXG == su.rtx2ld2ELZv4 ? PxuCJdSBwIXG : no2Var;
    }

    public final void ZbWwgt3aGe7A(f82 f82Var) {
        rf1 rf1Var;
        if (cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, f82Var)) {
            return;
        }
        f82 f82Var2 = this.rtx2ld2ELZv4;
        if (f82Var2 != null) {
            f82Var2.lS5Rgt96tfkO(this);
        }
        f82 f82Var3 = this.rtx2ld2ELZv4;
        if (f82Var3 != null && (rf1Var = f82Var3.rtx2ld2ELZv4) != null) {
            rf1Var.lS5Rgt96tfkO();
        }
        this.rtx2ld2ELZv4 = f82Var;
        if (f82Var != null) {
            i72 i72Var = j72.Companion;
            l4 l4Var = f82Var.Y1f8riQaR6yg;
            i72Var.getClass();
            f82Var.rtx2ld2ELZv4 = i72.Y1f8riQaR6yg(l4Var);
        }
        f82 f82Var4 = this.rtx2ld2ELZv4;
        if (f82Var4 != null) {
            f82Var4.Y1f8riQaR6yg(this, bs0.pnx5pC0XzaCw, this.RAsUl2FVSrh6);
        }
    }

    @Override // defpackage.to
    public final Object a92UlCVFR9N8() {
        return this.TSizfFm2Yiuu.getValue();
    }

    @Override // defpackage.to
    public final void dgRBjINgWbAK(gl2 gl2Var) {
        gl2 gl2Var2 = this.e9gEMXR7LXtO;
        if (gl2Var2 != null && gl2Var != gl2Var2) {
            ip1.lS5Rgt96tfkO("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e9gEMXR7LXtO + ", new instance: " + gl2Var);
        }
        this.e9gEMXR7LXtO = gl2Var;
    }

    @Override // defpackage.to
    public final void wdg6QnbFHrFF(Object obj) {
        this.TSizfFm2Yiuu.setValue(obj);
    }

    @Override // defpackage.to
    public final void x50lh2ztY7Y5() {
        this.e9gEMXR7LXtO = null;
        f82 f82Var = this.rtx2ld2ELZv4;
        if (f82Var != null) {
            f82Var.lS5Rgt96tfkO(this);
        }
    }
}
