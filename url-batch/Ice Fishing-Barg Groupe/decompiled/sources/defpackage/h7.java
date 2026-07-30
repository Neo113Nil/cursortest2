package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h7 extends jc2 implements pe0 {
    public /* synthetic */ Object BRwzKIf41E4i;
    public Object QrzZRwfaDlRX;
    public final /* synthetic */ Object RfyTYNmI9Srp;
    public final /* synthetic */ Object XL4ISE6Oc65B;
    public Object cpQdD2nAriOS;
    public Object gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(Object obj, Object obj2, Object obj3, Object obj4, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.gPXPFXrUH4XX = obj;
        this.BRwzKIf41E4i = obj2;
        this.XL4ISE6Oc65B = obj3;
        this.RfyTYNmI9Srp = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c A[Catch: all -> 0x00cd, TryCatch #5 {all -> 0x00cd, blocks: (B:33:0x004b, B:38:0x0087, B:43:0x009f, B:49:0x0094, B:51:0x0099, B:52:0x009c, B:53:0x007d, B:55:0x0081, B:56:0x0084), top: B:32:0x004b }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, no2, p91] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int, p91] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x02ba -> B:155:0x02be). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        ru ruVar;
        bg it;
        Object lS5Rgt96tfkO;
        p91 p91Var;
        le0 le0Var;
        k91 k91Var;
        n91 n91Var;
        Object OPXfSBeufaJ8;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        p91 p91Var2;
        le0 le0Var2;
        l91 l91Var;
        l91 l91Var2;
        Object OPXfSBeufaJ82;
        p91 p91Var3;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        zt1 zt1Var;
        zt1 zt1Var2;
        e01 e01Var;
        e01 e01Var2;
        int ordinal;
        e01 e01Var3;
        e01 e01Var4;
        xs0 xs0Var;
        l01 l01Var;
        int i = this.x50lh2ztY7Y5;
        ?? r2 = no2.PxuCJdSBwIXG;
        Object obj2 = this.RfyTYNmI9Srp;
        Object obj3 = this.XL4ISE6Oc65B;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                ui uiVar = (ui) this.gPXPFXrUH4XX;
                int i2 = this.r3s1LDPKFs1S;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    ruVar = (ru) this.cpQdD2nAriOS;
                    it = uiVar.iterator();
                    this.cpQdD2nAriOS = ruVar;
                    this.QrzZRwfaDlRX = it;
                    this.r3s1LDPKFs1S = 1;
                    lS5Rgt96tfkO = it.lS5Rgt96tfkO(this);
                    if (lS5Rgt96tfkO == suVar) {
                    }
                    if (((Boolean) lS5Rgt96tfkO).booleanValue()) {
                    }
                } else {
                    if (i2 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (bg) this.QrzZRwfaDlRX;
                    ruVar = (ru) this.cpQdD2nAriOS;
                    ng0.tmVwIGCQF4zR(obj);
                    lS5Rgt96tfkO = obj;
                    if (((Boolean) lS5Rgt96tfkO).booleanValue()) {
                        Object TSizfFm2Yiuu = it.TSizfFm2Yiuu();
                        Object PxuCJdSBwIXG = gj.PxuCJdSBwIXG(uiVar.x50lh2ztY7Y5());
                        fx1.KUoIVIumpKat(ruVar, null, new e4(PxuCJdSBwIXG == null ? TSizfFm2Yiuu : PxuCJdSBwIXG, (g7) this.BRwzKIf41E4i, (d91) obj3, (d91) obj2, null, 1), 3);
                        this.cpQdD2nAriOS = ruVar;
                        this.QrzZRwfaDlRX = it;
                        this.r3s1LDPKFs1S = 1;
                        lS5Rgt96tfkO = it.lS5Rgt96tfkO(this);
                        if (lS5Rgt96tfkO == suVar) {
                            return suVar;
                        }
                        if (((Boolean) lS5Rgt96tfkO).booleanValue()) {
                            return r2;
                        }
                    }
                }
            case 1:
                n91 n91Var2 = (n91) obj3;
                int i3 = this.r3s1LDPKFs1S;
                try {
                    try {
                        if (i3 == 0) {
                            ng0.tmVwIGCQF4zR(obj);
                            fu S2OOm9zPNm0h = ((ru) this.BRwzKIf41E4i).cpQdD2nAriOS().S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
                            S2OOm9zPNm0h.getClass();
                            k91 k91Var2 = new k91(h91.rtx2ld2ELZv4, (xs0) S2OOm9zPNm0h);
                            n91.PxuCJdSBwIXG(n91Var2, k91Var2);
                            r91 r91Var = n91Var2.lS5Rgt96tfkO;
                            le0 le0Var3 = (le0) obj2;
                            this.BRwzKIf41E4i = k91Var2;
                            this.QrzZRwfaDlRX = r91Var;
                            this.cpQdD2nAriOS = le0Var3;
                            this.gPXPFXrUH4XX = n91Var2;
                            this.r3s1LDPKFs1S = 1;
                            if (r91Var.a92UlCVFR9N8(this) == suVar) {
                                return suVar;
                            }
                            p91Var = r91Var;
                            le0Var = le0Var3;
                            k91Var = k91Var2;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                n91Var = (n91) this.cpQdD2nAriOS;
                                p91Var = (p91) this.QrzZRwfaDlRX;
                                k91Var = (k91) this.BRwzKIf41E4i;
                                try {
                                    ng0.tmVwIGCQF4zR(obj);
                                    OPXfSBeufaJ8 = obj;
                                    atomicReference2 = n91Var.PxuCJdSBwIXG;
                                    while (!atomicReference2.compareAndSet(k91Var, null) && atomicReference2.get() == k91Var) {
                                    }
                                    p91Var.lS5Rgt96tfkO(null);
                                    return OPXfSBeufaJ8;
                                } catch (Throwable th) {
                                    th = th;
                                    atomicReference = n91Var.PxuCJdSBwIXG;
                                    while (!atomicReference.compareAndSet(k91Var, null) && atomicReference.get() == k91Var) {
                                    }
                                    throw th;
                                }
                            }
                            n91Var2 = (n91) this.gPXPFXrUH4XX;
                            le0Var = (le0) this.cpQdD2nAriOS;
                            p91Var = (p91) this.QrzZRwfaDlRX;
                            k91Var = (k91) this.BRwzKIf41E4i;
                            ng0.tmVwIGCQF4zR(obj);
                        }
                        this.BRwzKIf41E4i = k91Var;
                        this.QrzZRwfaDlRX = p91Var;
                        this.cpQdD2nAriOS = n91Var2;
                        this.gPXPFXrUH4XX = null;
                        this.r3s1LDPKFs1S = 2;
                        OPXfSBeufaJ8 = le0Var.OPXfSBeufaJ8(this);
                        if (OPXfSBeufaJ8 == suVar) {
                            return suVar;
                        }
                        n91Var = n91Var2;
                        atomicReference2 = n91Var.PxuCJdSBwIXG;
                        while (!atomicReference2.compareAndSet(k91Var, null)) {
                        }
                        p91Var.lS5Rgt96tfkO(null);
                        return OPXfSBeufaJ8;
                    } catch (Throwable th2) {
                        th = th2;
                        n91Var = n91Var2;
                        atomicReference = n91Var.PxuCJdSBwIXG;
                        while (!atomicReference.compareAndSet(k91Var, null)) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    r2.lS5Rgt96tfkO(null);
                    throw th3;
                }
            case 2:
                o91 o91Var = (o91) obj3;
                ?? r22 = this.r3s1LDPKFs1S;
                try {
                    try {
                        if (r22 == 0) {
                            ng0.tmVwIGCQF4zR(obj);
                            fu S2OOm9zPNm0h2 = ((ru) this.BRwzKIf41E4i).cpQdD2nAriOS().S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
                            S2OOm9zPNm0h2.getClass();
                            l91 l91Var3 = new l91((xs0) S2OOm9zPNm0h2);
                            AtomicReference atomicReference5 = o91Var.PxuCJdSBwIXG;
                            while (true) {
                                l91 l91Var4 = (l91) atomicReference5.get();
                                if (l91Var4 != null) {
                                    i91 i91Var = i91.rtx2ld2ELZv4;
                                    if (i91Var.compareTo(i91Var) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference5.compareAndSet(l91Var4, l91Var3)) {
                                    if (atomicReference5.get() != l91Var4) {
                                        break;
                                    }
                                }
                                if (l91Var4 != null) {
                                    l91Var4.PxuCJdSBwIXG.a92UlCVFR9N8(new j91("Mutation interrupted"));
                                }
                                r91 r91Var2 = o91Var.lS5Rgt96tfkO;
                                le0 le0Var4 = (le0) obj2;
                                this.BRwzKIf41E4i = l91Var3;
                                this.QrzZRwfaDlRX = r91Var2;
                                this.cpQdD2nAriOS = le0Var4;
                                this.gPXPFXrUH4XX = o91Var;
                                this.r3s1LDPKFs1S = 1;
                                if (r91Var2.a92UlCVFR9N8(this) == suVar) {
                                    return suVar;
                                }
                                p91Var2 = r91Var2;
                                le0Var2 = le0Var4;
                                l91Var = l91Var3;
                            }
                        } else {
                            if (r22 != 1) {
                                if (r22 != 2) {
                                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                o91Var = (o91) this.cpQdD2nAriOS;
                                p91Var3 = (p91) this.QrzZRwfaDlRX;
                                l91Var2 = (l91) this.BRwzKIf41E4i;
                                try {
                                    ng0.tmVwIGCQF4zR(obj);
                                    OPXfSBeufaJ82 = obj;
                                    atomicReference4 = o91Var.PxuCJdSBwIXG;
                                    while (!atomicReference4.compareAndSet(l91Var2, null) && atomicReference4.get() == l91Var2) {
                                    }
                                    p91Var3.lS5Rgt96tfkO(null);
                                    return OPXfSBeufaJ82;
                                } catch (Throwable th4) {
                                    th = th4;
                                    atomicReference3 = o91Var.PxuCJdSBwIXG;
                                    while (!atomicReference3.compareAndSet(l91Var2, null) && atomicReference3.get() == l91Var2) {
                                    }
                                    throw th;
                                }
                            }
                            o91Var = (o91) this.gPXPFXrUH4XX;
                            le0Var2 = (le0) this.cpQdD2nAriOS;
                            p91Var2 = (p91) this.QrzZRwfaDlRX;
                            l91Var = (l91) this.BRwzKIf41E4i;
                            ng0.tmVwIGCQF4zR(obj);
                        }
                        this.BRwzKIf41E4i = l91Var;
                        this.QrzZRwfaDlRX = p91Var2;
                        this.cpQdD2nAriOS = o91Var;
                        this.gPXPFXrUH4XX = null;
                        this.r3s1LDPKFs1S = 2;
                        OPXfSBeufaJ82 = le0Var2.OPXfSBeufaJ8(this);
                        if (OPXfSBeufaJ82 == suVar) {
                            return suVar;
                        }
                        p91Var3 = p91Var2;
                        l91Var2 = l91Var;
                        atomicReference4 = o91Var.PxuCJdSBwIXG;
                        while (!atomicReference4.compareAndSet(l91Var2, null)) {
                        }
                        p91Var3.lS5Rgt96tfkO(null);
                        return OPXfSBeufaJ82;
                    } catch (Throwable th5) {
                        th = th5;
                        l91Var2 = l91Var;
                        atomicReference3 = o91Var.PxuCJdSBwIXG;
                        while (!atomicReference3.compareAndSet(l91Var2, null)) {
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    r22.lS5Rgt96tfkO(null);
                    throw th6;
                }
            default:
                s01 s01Var = (s01) this.gPXPFXrUH4XX;
                int i4 = this.r3s1LDPKFs1S;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    if (s01Var.rtx2ld2ELZv4 == f01.rtx2ld2ELZv4) {
                        return r2;
                    }
                    zt1 zt1Var3 = new zt1();
                    zt1 zt1Var4 = new zt1();
                    try {
                        f01 f01Var = (f01) this.BRwzKIf41E4i;
                        ru ruVar2 = (ru) obj3;
                        rtx2ld2ELZv4 rtx2ld2elzv4 = (rtx2ld2ELZv4) obj2;
                        this.QrzZRwfaDlRX = zt1Var3;
                        this.cpQdD2nAriOS = zt1Var4;
                        this.r3s1LDPKFs1S = 1;
                        bi biVar = new bi(1, ng0.IAToe7bXGz4N(this));
                        biVar.ZbWwgt3aGe7A();
                        e01.Companion.getClass();
                        f01Var.getClass();
                        int ordinal2 = f01Var.ordinal();
                        if (ordinal2 == 2) {
                            e01Var = e01.ON_CREATE;
                        } else if (ordinal2 == 3) {
                            e01Var = e01.ON_START;
                        } else if (ordinal2 != 4) {
                            e01Var2 = null;
                            ordinal = f01Var.ordinal();
                            if (ordinal != 2) {
                                e01Var3 = e01.ON_DESTROY;
                            } else if (ordinal == 3) {
                                e01Var3 = e01.ON_STOP;
                            } else if (ordinal != 4) {
                                e01Var4 = null;
                                vu1 vu1Var = new vu1(e01Var2, zt1Var3, ruVar2, e01Var4, biVar, new r91(), rtx2ld2elzv4);
                                zt1Var4.rtx2ld2ELZv4 = vu1Var;
                                s01Var.PxuCJdSBwIXG(vu1Var);
                                if (biVar.VhhvGxCb8gfr() == suVar) {
                                    return suVar;
                                }
                                zt1Var = zt1Var4;
                                zt1Var2 = zt1Var3;
                            } else {
                                e01Var3 = e01.ON_PAUSE;
                            }
                            e01Var4 = e01Var3;
                            vu1 vu1Var2 = new vu1(e01Var2, zt1Var3, ruVar2, e01Var4, biVar, new r91(), rtx2ld2elzv4);
                            zt1Var4.rtx2ld2ELZv4 = vu1Var2;
                            s01Var.PxuCJdSBwIXG(vu1Var2);
                            if (biVar.VhhvGxCb8gfr() == suVar) {
                            }
                        } else {
                            e01Var = e01.ON_RESUME;
                        }
                        e01Var2 = e01Var;
                        ordinal = f01Var.ordinal();
                        if (ordinal != 2) {
                        }
                        e01Var4 = e01Var3;
                        vu1 vu1Var22 = new vu1(e01Var2, zt1Var3, ruVar2, e01Var4, biVar, new r91(), rtx2ld2elzv4);
                        zt1Var4.rtx2ld2ELZv4 = vu1Var22;
                        s01Var.PxuCJdSBwIXG(vu1Var22);
                        if (biVar.VhhvGxCb8gfr() == suVar) {
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        zt1Var = zt1Var4;
                        zt1Var2 = zt1Var3;
                        xs0Var = (xs0) zt1Var2.rtx2ld2ELZv4;
                        if (xs0Var != null) {
                            xs0Var.a92UlCVFR9N8(null);
                        }
                        l01Var = (l01) zt1Var.rtx2ld2ELZv4;
                        if (l01Var != null) {
                            s01Var.a92UlCVFR9N8(l01Var);
                        }
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zt1Var = (zt1) this.cpQdD2nAriOS;
                    zt1Var2 = (zt1) this.QrzZRwfaDlRX;
                    try {
                        ng0.tmVwIGCQF4zR(obj);
                    } catch (Throwable th8) {
                        th = th8;
                        xs0Var = (xs0) zt1Var2.rtx2ld2ELZv4;
                        if (xs0Var != null) {
                        }
                        l01Var = (l01) zt1Var.rtx2ld2ELZv4;
                        if (l01Var != null) {
                        }
                        throw th;
                    }
                }
                xs0 xs0Var2 = (xs0) zt1Var2.rtx2ld2ELZv4;
                if (xs0Var2 != null) {
                    xs0Var2.a92UlCVFR9N8(null);
                }
                l01 l01Var2 = (l01) zt1Var.rtx2ld2ELZv4;
                if (l01Var2 == null) {
                    return r2;
                }
                s01Var.a92UlCVFR9N8(l01Var2);
                return r2;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.RfyTYNmI9Srp;
        Object obj3 = this.XL4ISE6Oc65B;
        switch (i) {
            case 0:
                h7 h7Var = new h7((ui) this.gPXPFXrUH4XX, (g7) this.BRwzKIf41E4i, (d91) obj3, (d91) obj2, btVar, 0);
                h7Var.cpQdD2nAriOS = obj;
                return h7Var;
            case 1:
                h7 h7Var2 = new h7((n91) obj3, (le0) obj2, btVar, 1);
                h7Var2.BRwzKIf41E4i = obj;
                return h7Var2;
            case 2:
                h7 h7Var3 = new h7((o91) obj3, (le0) obj2, btVar, 2);
                h7Var3.BRwzKIf41E4i = obj;
                return h7Var3;
            default:
                return new h7((s01) this.gPXPFXrUH4XX, (f01) this.BRwzKIf41E4i, (ru) obj3, (rtx2ld2ELZv4) obj2, btVar, 3);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ru ruVar = (ru) obj;
        bt btVar = (bt) obj2;
        switch (i) {
        }
        return ((h7) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h7(Object obj, le0 le0Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.XL4ISE6Oc65B = obj;
        this.RfyTYNmI9Srp = le0Var;
    }
}
