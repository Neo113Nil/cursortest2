package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l92 extends wLFCmsViZrNT implements v80, bf0, j92, z81 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater cpQdD2nAriOS = AtomicReferenceFieldUpdater.newUpdater(l92.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long r3s1LDPKFs1S = ty1.PxuCJdSBwIXG.objectFieldOffset(l92.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int x50lh2ztY7Y5;

    public l92(Object obj) {
        this._state$volatile = obj;
    }

    public final boolean OPXfSBeufaJ8(Object obj, Object obj2) {
        int i;
        xbgXKYA2cIfu[] xbgxkya2cifuArr;
        f50 f50Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = cpQdD2nAriOS;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !cs0.wdg6QnbFHrFF(obj3, obj)) {
                return false;
            }
            if (cs0.wdg6QnbFHrFF(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.x50lh2ztY7Y5;
            if ((i2 & 1) != 0) {
                this.x50lh2ztY7Y5 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.x50lh2ztY7Y5 = i3;
            xbgXKYA2cIfu[] xbgxkya2cifuArr2 = this.rtx2ld2ELZv4;
            while (true) {
                m92[] m92VarArr = (m92[]) xbgxkya2cifuArr2;
                if (m92VarArr != null) {
                    for (m92 m92Var : m92VarArr) {
                        if (m92Var != null) {
                            AtomicReference atomicReference = m92Var.PxuCJdSBwIXG;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (f50Var = hq0.BRwzKIf41E4i)) {
                                    f50 f50Var2 = hq0.gPXPFXrUH4XX;
                                    if (obj4 != f50Var2) {
                                        while (!atomicReference.compareAndSet(obj4, f50Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((bi) obj4).RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, f50Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.x50lh2ztY7Y5;
                    if (i == i3) {
                        this.x50lh2ztY7Y5 = i3 + 1;
                        return true;
                    }
                    xbgxkya2cifuArr = this.rtx2ld2ELZv4;
                }
                xbgxkya2cifuArr2 = xbgxkya2cifuArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        r1 = r1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        if (r13.equals(r15) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        if (r9 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007a, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x007a, B:16:0x0082, B:19:0x0089, B:20:0x008d, B:24:0x0090, B:26:0x00b1, B:29:0x00c1, B:30:0x00dd, B:36:0x00ed, B:32:0x00e4, B:35:0x00ea, B:45:0x0096, B:48:0x009d, B:56:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x007a, B:16:0x0082, B:19:0x0089, B:20:0x008d, B:24:0x0090, B:26:0x00b1, B:29:0x00c1, B:30:0x00dd, B:36:0x00ed, B:32:0x00e4, B:35:0x00ea, B:45:0x0096, B:48:0x009d, B:56:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [m92] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [xbgXKYA2cIfu] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [m92] */
    /* JADX WARN: Type inference failed for: r1v7, types: [m92] */
    /* JADX WARN: Type inference failed for: r1v8, types: [m92] */
    /* JADX WARN: Type inference failed for: r8v1, types: [wLFCmsViZrNT] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [l92] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, l92] */
    /* JADX WARN: Type inference failed for: r8v7, types: [l92] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c0 -> B:14:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.v80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(w80 w80Var, bt btVar) {
        k92 k92Var;
        ?? r1;
        su suVar;
        ?? r8;
        w80 w80Var2;
        xs0 xs0Var;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (btVar instanceof k92) {
                k92Var = (k92) btVar;
                int i = k92Var.XL4ISE6Oc65B;
                if ((i & Integer.MIN_VALUE) != 0) {
                    k92Var.XL4ISE6Oc65B = i - Integer.MIN_VALUE;
                    Object obj3 = k92Var.gPXPFXrUH4XX;
                    r1 = k92Var.XL4ISE6Oc65B;
                    suVar = su.rtx2ld2ELZv4;
                    if (r1 != 0) {
                        ng0.tmVwIGCQF4zR(obj3);
                        r1 = (m92) TSizfFm2Yiuu();
                    } else if (r1 == 1) {
                        r1 = k92Var.cpQdD2nAriOS;
                        w80Var = k92Var.x50lh2ztY7Y5;
                        this = k92Var.dgRBjINgWbAK;
                        try {
                            ng0.tmVwIGCQF4zR(obj3);
                            r1 = r1;
                        } catch (Throwable th) {
                            r8 = this;
                            th = th;
                            r8.a92UlCVFR9N8(r1);
                            throw th;
                        }
                    } else if (r1 == 2) {
                        obj = k92Var.QrzZRwfaDlRX;
                        xs0Var = k92Var.r3s1LDPKFs1S;
                        m92 m92Var = k92Var.cpQdD2nAriOS;
                        w80Var2 = k92Var.x50lh2ztY7Y5;
                        l92 l92Var = k92Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj3);
                        r1 = m92Var;
                        r8 = l92Var;
                        AtomicReference atomicReference = r1.PxuCJdSBwIXG;
                        f50 f50Var = hq0.gPXPFXrUH4XX;
                        andSet = atomicReference.getAndSet(f50Var);
                        andSet.getClass();
                        if (andSet == hq0.BRwzKIf41E4i) {
                        }
                        Object obj4 = cpQdD2nAriOS.get(r8);
                        if (xs0Var != null) {
                        }
                        if (obj4 == fx1.a92UlCVFR9N8) {
                        }
                        k92Var.dgRBjINgWbAK = r8;
                        k92Var.x50lh2ztY7Y5 = w80Var2;
                        k92Var.cpQdD2nAriOS = r1;
                        k92Var.r3s1LDPKFs1S = xs0Var;
                        k92Var.QrzZRwfaDlRX = obj4;
                        k92Var.XL4ISE6Oc65B = 2;
                        if (w80Var2.cpQdD2nAriOS(obj2, k92Var) == suVar) {
                        }
                    } else {
                        if (r1 != 3) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = k92Var.QrzZRwfaDlRX;
                        xs0Var = k92Var.r3s1LDPKFs1S;
                        r1 = k92Var.cpQdD2nAriOS;
                        w80Var2 = k92Var.x50lh2ztY7Y5;
                        r8 = k92Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj3);
                        Object obj42 = cpQdD2nAriOS.get(r8);
                        if (xs0Var != null && !xs0Var.lS5Rgt96tfkO()) {
                            throw xs0Var.pnx5pC0XzaCw();
                        }
                        obj2 = obj42 == fx1.a92UlCVFR9N8 ? null : obj42;
                        k92Var.dgRBjINgWbAK = r8;
                        k92Var.x50lh2ztY7Y5 = w80Var2;
                        k92Var.cpQdD2nAriOS = r1;
                        k92Var.r3s1LDPKFs1S = xs0Var;
                        k92Var.QrzZRwfaDlRX = obj42;
                        k92Var.XL4ISE6Oc65B = 2;
                        if (w80Var2.cpQdD2nAriOS(obj2, k92Var) == suVar) {
                            return suVar;
                        }
                        obj = obj42;
                        r1 = r1;
                        r8 = r8;
                        AtomicReference atomicReference2 = r1.PxuCJdSBwIXG;
                        f50 f50Var2 = hq0.gPXPFXrUH4XX;
                        andSet = atomicReference2.getAndSet(f50Var2);
                        andSet.getClass();
                        if (andSet == hq0.BRwzKIf41E4i) {
                            k92Var.dgRBjINgWbAK = r8;
                            k92Var.x50lh2ztY7Y5 = w80Var2;
                            k92Var.cpQdD2nAriOS = r1;
                            k92Var.r3s1LDPKFs1S = xs0Var;
                            k92Var.QrzZRwfaDlRX = obj;
                            k92Var.XL4ISE6Oc65B = 3;
                            no2 no2Var = no2.PxuCJdSBwIXG;
                            bi biVar = new bi(1, ng0.IAToe7bXGz4N(k92Var));
                            biVar.ZbWwgt3aGe7A();
                            AtomicReference atomicReference3 = r1.PxuCJdSBwIXG;
                            while (true) {
                                if (atomicReference3.compareAndSet(f50Var2, biVar)) {
                                    break;
                                }
                                if (atomicReference3.get() != f50Var2) {
                                    biVar.RAsUl2FVSrh6(no2Var);
                                    break;
                                }
                            }
                            Object VhhvGxCb8gfr = biVar.VhhvGxCb8gfr();
                            if (VhhvGxCb8gfr == suVar) {
                            }
                        }
                        Object obj422 = cpQdD2nAriOS.get(r8);
                        if (xs0Var != null) {
                            throw xs0Var.pnx5pC0XzaCw();
                        }
                        if (obj422 == fx1.a92UlCVFR9N8) {
                        }
                        k92Var.dgRBjINgWbAK = r8;
                        k92Var.x50lh2ztY7Y5 = w80Var2;
                        k92Var.cpQdD2nAriOS = r1;
                        k92Var.r3s1LDPKFs1S = xs0Var;
                        k92Var.QrzZRwfaDlRX = obj422;
                        k92Var.XL4ISE6Oc65B = 2;
                        if (w80Var2.cpQdD2nAriOS(obj2, k92Var) == suVar) {
                        }
                    }
                    hu huVar = k92Var.OPXfSBeufaJ8;
                    huVar.getClass();
                    r8 = this;
                    w80Var2 = w80Var;
                    xs0Var = (xs0) huVar.S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
                    obj = null;
                    Object obj4222 = cpQdD2nAriOS.get(r8);
                    if (xs0Var != null) {
                    }
                    if (obj4222 == fx1.a92UlCVFR9N8) {
                    }
                    k92Var.dgRBjINgWbAK = r8;
                    k92Var.x50lh2ztY7Y5 = w80Var2;
                    k92Var.cpQdD2nAriOS = r1;
                    k92Var.r3s1LDPKFs1S = xs0Var;
                    k92Var.QrzZRwfaDlRX = obj4222;
                    k92Var.XL4ISE6Oc65B = 2;
                    if (w80Var2.cpQdD2nAriOS(obj2, k92Var) == suVar) {
                    }
                }
            }
            if (r1 != 0) {
            }
            hu huVar2 = k92Var.OPXfSBeufaJ8;
            huVar2.getClass();
            r8 = this;
            w80Var2 = w80Var;
            xs0Var = (xs0) huVar2.S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
            obj = null;
            Object obj42222 = cpQdD2nAriOS.get(r8);
            if (xs0Var != null) {
            }
            if (obj42222 == fx1.a92UlCVFR9N8) {
            }
            k92Var.dgRBjINgWbAK = r8;
            k92Var.x50lh2ztY7Y5 = w80Var2;
            k92Var.cpQdD2nAriOS = r1;
            k92Var.r3s1LDPKFs1S = xs0Var;
            k92Var.QrzZRwfaDlRX = obj42222;
            k92Var.XL4ISE6Oc65B = 2;
            if (w80Var2.cpQdD2nAriOS(obj2, k92Var) == suVar) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        k92Var = new k92(this, btVar);
        Object obj32 = k92Var.gPXPFXrUH4XX;
        r1 = k92Var.XL4ISE6Oc65B;
        suVar = su.rtx2ld2ELZv4;
    }

    @Override // defpackage.wLFCmsViZrNT
    public final xbgXKYA2cIfu Y1f8riQaR6yg() {
        return new m92();
    }

    @Override // defpackage.w80
    public final Object cpQdD2nAriOS(Object obj, bt btVar) {
        rtx2ld2ELZv4(obj);
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.wLFCmsViZrNT
    public final xbgXKYA2cIfu[] e9gEMXR7LXtO() {
        return new m92[2];
    }

    @Override // defpackage.j92
    public final Object getValue() {
        f50 f50Var = fx1.a92UlCVFR9N8;
        cpQdD2nAriOS.getClass();
        Object objectVolatile = ty1.PxuCJdSBwIXG.getObjectVolatile(this, r3s1LDPKFs1S);
        if (objectVolatile == f50Var) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.bf0
    public final v80 lS5Rgt96tfkO(hu huVar, int i, ag agVar) {
        return ((((i < 0 || i >= 2) && i != -2) || agVar != ag.OPXfSBeufaJ8) && !((i == 0 || i == -3) && agVar == ag.rtx2ld2ELZv4)) ? new yi(this, huVar, i, agVar) : this;
    }

    public final void rtx2ld2ELZv4(Object obj) {
        if (obj == null) {
            obj = fx1.a92UlCVFR9N8;
        }
        OPXfSBeufaJ8(null, obj);
    }
}
