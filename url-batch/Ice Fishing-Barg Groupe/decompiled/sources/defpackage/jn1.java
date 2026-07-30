package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class jn1 {
    public static final t92 PxuCJdSBwIXG = new t92(dq.S9EYkSpbGuxq);

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PxuCJdSBwIXG(tz0 tz0Var, e4 e4Var, ct ctVar) {
        hn1 hn1Var;
        int i;
        if (ctVar instanceof hn1) {
            hn1Var = (hn1) ctVar;
            int i2 = hn1Var.x50lh2ztY7Y5;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hn1Var.x50lh2ztY7Y5 = i2 - Integer.MIN_VALUE;
                Object obj = hn1Var.dgRBjINgWbAK;
                i = hn1Var.x50lh2ztY7Y5;
                if (i == 0) {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return;
                    } else {
                        ng0.tmVwIGCQF4zR(obj);
                        u9.Y1f8riQaR6yg();
                        return;
                    }
                }
                ng0.tmVwIGCQF4zR(obj);
                if (!tz0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                    u9.XL4ISE6Oc65B("establishTextInputSession called from an unattached node");
                    return;
                }
                ei1 wLFCmsViZrNT = zv.wLFCmsViZrNT(tz0Var);
                il1 il1Var = (il1) zv.zf8DYfih6EZu(tz0Var).tmVwIGCQF4zR;
                il1Var.getClass();
                if (hq0.BjEWd04qc7Mw(il1Var, PxuCJdSBwIXG) != null) {
                    u9.VhhvGxCb8gfr();
                    return;
                } else {
                    hn1Var.x50lh2ztY7Y5 = 1;
                    lS5Rgt96tfkO(wLFCmsViZrNT, e4Var, hn1Var);
                    return;
                }
            }
        }
        hn1Var = new hn1(ctVar);
        Object obj2 = hn1Var.dgRBjINgWbAK;
        i = hn1Var.x50lh2ztY7Y5;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void lS5Rgt96tfkO(ei1 ei1Var, pe0 pe0Var, ct ctVar) {
        in1 in1Var;
        int i;
        if (ctVar instanceof in1) {
            in1Var = (in1) ctVar;
            int i2 = in1Var.x50lh2ztY7Y5;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                in1Var.x50lh2ztY7Y5 = i2 - Integer.MIN_VALUE;
                Object obj = in1Var.dgRBjINgWbAK;
                i = in1Var.x50lh2ztY7Y5;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    in1Var.x50lh2ztY7Y5 = 1;
                    ((r1) ei1Var).xfACYKDMU6Dj(pe0Var, in1Var);
                    return;
                } else if (i == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                    u9.Y1f8riQaR6yg();
                    return;
                } else if (i != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    u9.Y1f8riQaR6yg();
                    return;
                }
            }
        }
        in1Var = new in1(ctVar);
        Object obj2 = in1Var.dgRBjINgWbAK;
        i = in1Var.x50lh2ztY7Y5;
        if (i != 0) {
        }
    }
}
