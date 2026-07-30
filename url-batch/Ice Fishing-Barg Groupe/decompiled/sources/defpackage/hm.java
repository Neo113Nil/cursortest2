package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hm extends jc2 implements pe0 {
    public final /* synthetic */ Object BRwzKIf41E4i;
    public Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public /* synthetic */ Object gPXPFXrUH4XX;
    public int r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(v80[] v80VarArr, int i, AtomicInteger atomicInteger, eg egVar, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = v80VarArr;
        this.r3s1LDPKFs1S = i;
        this.gPXPFXrUH4XX = atomicInteger;
        this.BRwzKIf41E4i = egVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if (r11 == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        Object uv1Var;
        Throwable PxuCJdSBwIXG;
        int i;
        int i2 = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        Object obj2 = this.BRwzKIf41E4i;
        switch (i2) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.gPXPFXrUH4XX;
                eg egVar = (eg) obj2;
                int i3 = this.cpQdD2nAriOS;
                try {
                    if (i3 == 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        v80[] v80VarArr = (v80[]) this.QrzZRwfaDlRX;
                        int i4 = this.r3s1LDPKFs1S;
                        v80 v80Var = v80VarArr[i4];
                        gm gmVar = new gm(egVar, i4);
                        this.cpQdD2nAriOS = 1;
                        if (v80Var.PxuCJdSBwIXG(gmVar, this) == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i3 != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return no2Var;
                    }
                    vi0.wdg6QnbFHrFF(egVar);
                    return no2Var;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        vi0.wdg6QnbFHrFF(egVar);
                    }
                }
            default:
                ov0 ov0Var = (ov0) obj2;
                l92 l92Var = ov0Var.TSizfFm2Yiuu;
                int i5 = this.r3s1LDPKFs1S;
                try {
                } catch (Throwable th) {
                    uv1Var = new uv1(th);
                }
                if (i5 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    l92Var.getClass();
                    l92Var.OPXfSBeufaJ8(null, sv0.PxuCJdSBwIXG);
                    gg0 gg0Var = ov0Var.lS5Rgt96tfkO;
                    this.gPXPFXrUH4XX = null;
                    this.QrzZRwfaDlRX = ov0Var;
                    i = 0;
                    this.cpQdD2nAriOS = 0;
                    this.r3s1LDPKFs1S = 1;
                    obj = gg0Var.TSizfFm2Yiuu(this);
                    if (obj == suVar) {
                        return suVar;
                    }
                } else if (i5 == 1) {
                    i = this.cpQdD2nAriOS;
                    ov0Var = (ov0) this.QrzZRwfaDlRX;
                    ng0.tmVwIGCQF4zR(obj);
                } else {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                        uv1Var = (tv0) obj;
                        if (!(uv1Var instanceof uv1)) {
                            l92Var.rtx2ld2ELZv4((tv0) uv1Var);
                        }
                        PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
                        if (PxuCJdSBwIXG == null) {
                            return no2Var;
                        }
                        if (PxuCJdSBwIXG instanceof CancellationException) {
                            throw PxuCJdSBwIXG;
                        }
                        l92Var.getClass();
                        l92Var.OPXfSBeufaJ8(null, rv0.PxuCJdSBwIXG);
                        return no2Var;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                    uv1Var = (tv0) obj;
                    if (!(uv1Var instanceof uv1)) {
                    }
                    PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
                    if (PxuCJdSBwIXG == null) {
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    this.gPXPFXrUH4XX = null;
                    this.QrzZRwfaDlRX = null;
                    this.cpQdD2nAriOS = i;
                    this.r3s1LDPKFs1S = 3;
                    obj = ov0.e9gEMXR7LXtO(ov0Var, this);
                    break;
                } else {
                    this.gPXPFXrUH4XX = null;
                    this.QrzZRwfaDlRX = null;
                    this.cpQdD2nAriOS = i;
                    this.r3s1LDPKFs1S = 2;
                    obj = ov0.a92UlCVFR9N8(ov0Var, this);
                    if (obj == suVar) {
                    }
                    uv1Var = (tv0) obj;
                    if (!(uv1Var instanceof uv1)) {
                    }
                    PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
                    if (PxuCJdSBwIXG == null) {
                    }
                }
                return suVar;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.BRwzKIf41E4i;
        switch (i) {
            case 0:
                return new hm((v80[]) this.QrzZRwfaDlRX, this.r3s1LDPKFs1S, (AtomicInteger) this.gPXPFXrUH4XX, (eg) obj2, btVar);
            default:
                hm hmVar = new hm((ov0) obj2, btVar);
                hmVar.gPXPFXrUH4XX = obj;
                return hmVar;
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
        return ((hm) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(ov0 ov0Var, bt btVar) {
        super(2, btVar);
        this.BRwzKIf41E4i = ov0Var;
    }
}
