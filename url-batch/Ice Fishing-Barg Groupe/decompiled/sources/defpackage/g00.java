package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class g00 extends ud2 {
    public int wdg6QnbFHrFF;

    public g00(int i) {
        super(0L, false);
        this.wdg6QnbFHrFF = i;
    }

    public final void OPXfSBeufaJ8(Throwable th) {
        bs0.S2OOm9zPNm0h(Y1f8riQaR6yg().e9gEMXR7LXtO(), new vu("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract bt Y1f8riQaR6yg();

    public Throwable a92UlCVFR9N8(Object obj) {
        sm smVar = obj instanceof sm ? (sm) obj : null;
        if (smVar != null) {
            return smVar.PxuCJdSBwIXG;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.xs0) r5.S2OOm9zPNm0h(defpackage.ih0.BRwzKIf41E4i);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            bt Y1f8riQaR6yg = Y1f8riQaR6yg();
            Y1f8riQaR6yg.getClass();
            e00 e00Var = (e00) Y1f8riQaR6yg;
            ct ctVar = e00Var.x50lh2ztY7Y5;
            Object obj = e00Var.r3s1LDPKFs1S;
            hu e9gEMXR7LXtO = ctVar.e9gEMXR7LXtO();
            Object JHNfcAUfKc4G = hq0.JHNfcAUfKc4G(e9gEMXR7LXtO, obj);
            xs0 xs0Var = null;
            ko2 JHNfcAUfKc4G2 = JHNfcAUfKc4G != hq0.XL4ISE6Oc65B ? zv.JHNfcAUfKc4G(ctVar, e9gEMXR7LXtO, JHNfcAUfKc4G) : null;
            try {
                hu e9gEMXR7LXtO2 = ctVar.e9gEMXR7LXtO();
                Object x50lh2ztY7Y5 = x50lh2ztY7Y5();
                Throwable a92UlCVFR9N8 = a92UlCVFR9N8(x50lh2ztY7Y5);
                if (a92UlCVFR9N8 == null) {
                    int i = this.wdg6QnbFHrFF;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (xs0Var != null && !xs0Var.lS5Rgt96tfkO()) {
                    CancellationException pnx5pC0XzaCw = xs0Var.pnx5pC0XzaCw();
                    lS5Rgt96tfkO(pnx5pC0XzaCw);
                    ctVar.RAsUl2FVSrh6(ng0.gPXPFXrUH4XX(pnx5pC0XzaCw));
                } else if (a92UlCVFR9N8 != null) {
                    ctVar.RAsUl2FVSrh6(new uv1(a92UlCVFR9N8));
                } else {
                    ctVar.RAsUl2FVSrh6(rtx2ld2ELZv4(x50lh2ztY7Y5));
                }
                if (JHNfcAUfKc4G2 != null && !JHNfcAUfKc4G2.iSxsmagYqzHM()) {
                    return;
                }
                hq0.Pf0ThKz3j5YS(e9gEMXR7LXtO, JHNfcAUfKc4G);
            } catch (Throwable th) {
                if (JHNfcAUfKc4G2 == null || JHNfcAUfKc4G2.iSxsmagYqzHM()) {
                    hq0.Pf0ThKz3j5YS(e9gEMXR7LXtO, JHNfcAUfKc4G);
                }
                throw th;
            }
        } catch (Throwable th2) {
            OPXfSBeufaJ8(th2);
        }
    }

    public abstract Object x50lh2ztY7Y5();

    public void lS5Rgt96tfkO(CancellationException cancellationException) {
    }

    public Object rtx2ld2ELZv4(Object obj) {
        return obj;
    }
}
