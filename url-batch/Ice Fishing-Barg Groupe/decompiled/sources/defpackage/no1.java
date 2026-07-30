package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class no1 {
    public final int PxuCJdSBwIXG;
    public final s32 RAsUl2FVSrh6;
    public final ReentrantLock TSizfFm2Yiuu = new ReentrantLock();
    public int Y1f8riQaR6yg;
    public final gr[] a92UlCVFR9N8;
    public boolean e9gEMXR7LXtO;
    public final ae0 lS5Rgt96tfkO;
    public final da rtx2ld2ELZv4;

    public no1(int i, ae0 ae0Var) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = ae0Var;
        this.a92UlCVFR9N8 = new gr[i];
        int i2 = t32.PxuCJdSBwIXG;
        this.RAsUl2FVSrh6 = new s32(i);
        this.rtx2ld2ELZv4 = new da(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0061, code lost:
    
        r1.wdg6QnbFHrFF(r5, r4.OPXfSBeufaJ8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:13:0x0080, B:15:0x0084, B:17:0x008a, B:20:0x0091, B:21:0x00ab, B:25:0x00b9, B:26:0x00c0), top: B:12:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, blocks: (B:13:0x0080, B:15:0x0084, B:17:0x008a, B:20:0x0091, B:21:0x00ab, B:25:0x00b9, B:26:0x00c0), top: B:12:0x0080, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(ct ctVar) {
        lo1 lo1Var;
        int i;
        s32 s32Var;
        int andDecrement;
        ReentrantLock reentrantLock;
        da daVar = this.rtx2ld2ELZv4;
        try {
            try {
                if (ctVar instanceof lo1) {
                    lo1Var = (lo1) ctVar;
                    int i2 = lo1Var.cpQdD2nAriOS;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        lo1Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                        Object obj = lo1Var.dgRBjINgWbAK;
                        i = lo1Var.cpQdD2nAriOS;
                        s32Var = this.RAsUl2FVSrh6;
                        if (i != 0) {
                            ng0.tmVwIGCQF4zR(obj);
                            lo1Var.cpQdD2nAriOS = 1;
                            s32Var.getClass();
                            int i3 = s32Var.rtx2ld2ELZv4;
                            do {
                                andDecrement = r32.r3s1LDPKFs1S.getAndDecrement(s32Var);
                            } while (andDecrement > i3);
                            Object obj2 = no2.PxuCJdSBwIXG;
                            Object obj3 = su.rtx2ld2ELZv4;
                            if (andDecrement <= 0) {
                                bi VhhvGxCb8gfr = f2.VhhvGxCb8gfr(ng0.IAToe7bXGz4N(lo1Var));
                                try {
                                    if (!s32Var.PxuCJdSBwIXG(VhhvGxCb8gfr)) {
                                        while (true) {
                                            int andDecrement2 = r32.r3s1LDPKFs1S.getAndDecrement(s32Var);
                                            if (andDecrement2 <= i3) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (s32Var.PxuCJdSBwIXG(VhhvGxCb8gfr)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    Object VhhvGxCb8gfr2 = VhhvGxCb8gfr.VhhvGxCb8gfr();
                                    Object obj4 = VhhvGxCb8gfr2;
                                    if (VhhvGxCb8gfr2 != obj3) {
                                        obj4 = obj2;
                                    }
                                    if (obj4 == obj3) {
                                        obj2 = obj4;
                                    }
                                } catch (Throwable th) {
                                    VhhvGxCb8gfr.rZjpSjn4zoMv();
                                    throw th;
                                }
                            }
                            if (obj2 == obj3) {
                                return obj3;
                            }
                        } else {
                            if (i != 1) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ng0.tmVwIGCQF4zR(obj);
                        }
                        reentrantLock = this.TSizfFm2Yiuu;
                        reentrantLock.lock();
                        if (!this.e9gEMXR7LXtO) {
                            sj0.zf8DYfih6EZu("Connection pool is closed", 21);
                            throw null;
                        }
                        if (daVar.isEmpty() && this.Y1f8riQaR6yg < this.PxuCJdSBwIXG) {
                            gr grVar = new gr((fy1) this.lS5Rgt96tfkO.PxuCJdSBwIXG());
                            gr[] grVarArr = this.a92UlCVFR9N8;
                            int i4 = this.Y1f8riQaR6yg;
                            this.Y1f8riQaR6yg = i4 + 1;
                            grVarArr[i4] = grVar;
                            daVar.addLast(grVar);
                        }
                        return (gr) daVar.removeLast();
                    }
                }
                if (!this.e9gEMXR7LXtO) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.TSizfFm2Yiuu;
            reentrantLock.lock();
        } catch (Throwable th2) {
            s32Var.TSizfFm2Yiuu();
            throw th2;
        }
        lo1Var = new lo1(this, ctVar);
        Object obj5 = lo1Var.dgRBjINgWbAK;
        i = lo1Var.cpQdD2nAriOS;
        s32Var = this.RAsUl2FVSrh6;
        if (i != 0) {
        }
    }

    public final void TSizfFm2Yiuu() {
        ReentrantLock reentrantLock = this.TSizfFm2Yiuu;
        reentrantLock.lock();
        try {
            this.e9gEMXR7LXtO = true;
            for (gr grVar : this.a92UlCVFR9N8) {
                if (grVar != null) {
                    grVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void Y1f8riQaR6yg(StringBuilder sb) {
        da daVar = this.rtx2ld2ELZv4;
        ReentrantLock reentrantLock = this.TSizfFm2Yiuu;
        reentrantLock.lock();
        try {
            z11 BjEWd04qc7Mw = fx1.BjEWd04qc7Mw();
            int i = daVar.wdg6QnbFHrFF;
            for (int i2 = 0; i2 < i; i2++) {
                BjEWd04qc7Mw.add(daVar.get(i2));
            }
            z11 ZbWwgt3aGe7A = fx1.ZbWwgt3aGe7A(BjEWd04qc7Mw);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.PxuCJdSBwIXG + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            s32 s32Var = this.RAsUl2FVSrh6;
            s32Var.getClass();
            sb2.append(Math.max(r32.r3s1LDPKFs1S.get(s32Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + ZbWwgt3aGe7A.PxuCJdSBwIXG() + ")[" + zk.ctD2u3GUHhtA(ZbWwgt3aGe7A, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            gr[] grVarArr = this.a92UlCVFR9N8;
            int length = grVarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                gr grVar = grVarArr[i4];
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                sb3.append(grVar != null ? grVar.rtx2ld2ELZv4.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (grVar != null) {
                    grVar.OPXfSBeufaJ8(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e9gEMXR7LXtO(gr grVar) {
        grVar.getClass();
        ReentrantLock reentrantLock = this.TSizfFm2Yiuu;
        reentrantLock.lock();
        try {
            this.rtx2ld2ELZv4.addLast(grVar);
            reentrantLock.unlock();
            this.RAsUl2FVSrh6.TSizfFm2Yiuu();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:13|14|(1:(1:34)(2:31|(1:33)))(1:16)|17|18|19|20|21|(1:23)(11:25|12|13|14|(0)(0)|17|18|19|20|21|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r10 = r10;
        r9 = r9;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[Catch: all -> 0x006d, TryCatch #2 {all -> 0x006d, blocks: (B:14:0x0065, B:16:0x0069, B:31:0x0071, B:34:0x0078), top: B:13:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r1v10, types: [ae0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0054 -> B:12:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lS5Rgt96tfkO(long j, uq uqVar, ct ctVar) {
        mo1 mo1Var;
        int i;
        zt1 zt1Var;
        mo1 mo1Var2;
        Throwable th;
        Object xbgXKYA2cIfu;
        su suVar;
        uq uqVar2;
        if (ctVar instanceof mo1) {
            mo1Var = (mo1) ctVar;
            int i2 = mo1Var.gPXPFXrUH4XX;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mo1Var.gPXPFXrUH4XX = i2 - Integer.MIN_VALUE;
                Object obj = mo1Var.r3s1LDPKFs1S;
                i = mo1Var.gPXPFXrUH4XX;
                bt btVar = null;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    zt1 zt1Var2 = new zt1();
                    rtx2ld2ELZv4 rtx2ld2elzv4 = new rtx2ld2ELZv4(zt1Var2, this, btVar, 13);
                    mo1Var.x50lh2ztY7Y5 = uqVar;
                    mo1Var.cpQdD2nAriOS = zt1Var2;
                    mo1Var.dgRBjINgWbAK = j;
                    mo1Var.gPXPFXrUH4XX = 1;
                    xbgXKYA2cIfu = kj0.xbgXKYA2cIfu(j, rtx2ld2elzv4, mo1Var);
                    suVar = su.rtx2ld2ELZv4;
                    if (xbgXKYA2cIfu == suVar) {
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = mo1Var.dgRBjINgWbAK;
                    zt1 zt1Var3 = mo1Var.cpQdD2nAriOS;
                    ?? r1 = mo1Var.x50lh2ztY7Y5;
                    try {
                        ng0.tmVwIGCQF4zR(obj);
                        uqVar2 = r1;
                    } catch (Throwable th2) {
                        zt1Var = zt1Var3;
                        uqVar = r1;
                        mo1Var2 = mo1Var;
                        th = th2;
                    }
                    zt1Var = zt1Var3;
                    uqVar = uqVar2;
                    mo1Var2 = mo1Var;
                    th = null;
                    try {
                        if (th instanceof zj2) {
                            uqVar.PxuCJdSBwIXG();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = zt1Var.rtx2ld2ELZv4;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        mo1Var = mo1Var2;
                        zt1 zt1Var22 = new zt1();
                        rtx2ld2ELZv4 rtx2ld2elzv42 = new rtx2ld2ELZv4(zt1Var22, this, btVar, 13);
                        mo1Var.x50lh2ztY7Y5 = uqVar;
                        mo1Var.cpQdD2nAriOS = zt1Var22;
                        mo1Var.dgRBjINgWbAK = j;
                        mo1Var.gPXPFXrUH4XX = 1;
                        xbgXKYA2cIfu = kj0.xbgXKYA2cIfu(j, rtx2ld2elzv42, mo1Var);
                        suVar = su.rtx2ld2ELZv4;
                        if (xbgXKYA2cIfu == suVar) {
                            return suVar;
                        }
                        uqVar2 = uqVar;
                        zt1Var3 = zt1Var22;
                        zt1Var = zt1Var3;
                        uqVar = uqVar2;
                        mo1Var2 = mo1Var;
                        th = null;
                        if (th instanceof zj2) {
                        }
                        mo1Var = mo1Var2;
                        zt1 zt1Var222 = new zt1();
                        rtx2ld2ELZv4 rtx2ld2elzv422 = new rtx2ld2ELZv4(zt1Var222, this, btVar, 13);
                        mo1Var.x50lh2ztY7Y5 = uqVar;
                        mo1Var.cpQdD2nAriOS = zt1Var222;
                        mo1Var.dgRBjINgWbAK = j;
                        mo1Var.gPXPFXrUH4XX = 1;
                        xbgXKYA2cIfu = kj0.xbgXKYA2cIfu(j, rtx2ld2elzv422, mo1Var);
                        suVar = su.rtx2ld2ELZv4;
                        if (xbgXKYA2cIfu == suVar) {
                        }
                    } catch (Throwable th3) {
                        gr grVar = (gr) zt1Var.rtx2ld2ELZv4;
                        if (grVar != null) {
                            e9gEMXR7LXtO(grVar);
                        }
                        throw th3;
                    }
                }
            }
        }
        mo1Var = new mo1(this, ctVar);
        Object obj3 = mo1Var.r3s1LDPKFs1S;
        i = mo1Var.gPXPFXrUH4XX;
        bt btVar2 = null;
        if (i != 0) {
        }
    }
}
