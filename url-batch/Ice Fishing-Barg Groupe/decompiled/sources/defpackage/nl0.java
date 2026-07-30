package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nl0 implements d70 {
    public static final ml0 Companion = new ml0();
    public static final List RAsUl2FVSrh6 = mv2.wdg6QnbFHrFF(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List rtx2ld2ELZv4 = mv2.wdg6QnbFHrFF(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final ls1 PxuCJdSBwIXG;
    public final ll0 TSizfFm2Yiuu;
    public volatile vl0 Y1f8riQaR6yg;
    public volatile boolean a92UlCVFR9N8;
    public final fr1 e9gEMXR7LXtO;
    public final ps1 lS5Rgt96tfkO;

    public nl0(if1 if1Var, ls1 ls1Var, ps1 ps1Var, ll0 ll0Var) {
        ll0Var.getClass();
        this.PxuCJdSBwIXG = ls1Var;
        this.lS5Rgt96tfkO = ps1Var;
        this.TSizfFm2Yiuu = ll0Var;
        List list = if1Var.XL4ISE6Oc65B;
        fr1 fr1Var = fr1.cpQdD2nAriOS;
        this.e9gEMXR7LXtO = list.contains(fr1Var) ? fr1Var : fr1.x50lh2ztY7Y5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r4 == false) goto L20;
     */
    @Override // defpackage.d70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mv1 OPXfSBeufaJ8(boolean z) {
        hj0 hj0Var;
        vl0 vl0Var = this.Y1f8riQaR6yg;
        if (vl0Var == null) {
            u9.S9EYkSpbGuxq("stream wasn't created");
            return null;
        }
        synchronized (vl0Var) {
            while (true) {
                boolean z2 = false;
                if (!vl0Var.cpQdD2nAriOS.isEmpty() || vl0Var.a92UlCVFR9N8() != null) {
                    break;
                }
                if (!z) {
                    vl0Var.OPXfSBeufaJ8.getClass();
                    sl0 sl0Var = vl0Var.gPXPFXrUH4XX;
                }
                z2 = true;
                if (z2) {
                    vl0Var.BRwzKIf41E4i.wdg6QnbFHrFF();
                }
                try {
                    try {
                        vl0Var.wait();
                        if (z2) {
                            vl0Var.BRwzKIf41E4i.r3s1LDPKFs1S();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        vl0Var.BRwzKIf41E4i.r3s1LDPKFs1S();
                    }
                    throw th;
                }
            }
            if (vl0Var.cpQdD2nAriOS.isEmpty()) {
                IOException iOException = vl0Var.EcgxDIVH5in8;
                if (iOException != null) {
                    throw iOException;
                }
                o60 a92UlCVFR9N8 = vl0Var.a92UlCVFR9N8();
                a92UlCVFR9N8.getClass();
                throw new aa2(a92UlCVFR9N8);
            }
            Object removeFirst = vl0Var.cpQdD2nAriOS.removeFirst();
            removeFirst.getClass();
            hj0Var = (hj0) removeFirst;
        }
        ml0 ml0Var = Companion;
        fr1 fr1Var = this.e9gEMXR7LXtO;
        ml0Var.getClass();
        fr1Var.getClass();
        ArrayList arrayList = new ArrayList(20);
        int size = hj0Var.size();
        w92 w92Var = null;
        for (int i = 0; i < size; i++) {
            String lS5Rgt96tfkO = hj0Var.lS5Rgt96tfkO(i);
            String Y1f8riQaR6yg = hj0Var.Y1f8riQaR6yg(i);
            if (lS5Rgt96tfkO.equals(":status")) {
                v92 v92Var = w92.Companion;
                String concat = "HTTP/1.1 ".concat(Y1f8riQaR6yg);
                v92Var.getClass();
                w92Var = v92.PxuCJdSBwIXG(concat);
            } else if (!rtx2ld2ELZv4.contains(lS5Rgt96tfkO)) {
                arrayList.add(lS5Rgt96tfkO);
                arrayList.add(ia2.GlTbNTgfSMqy(Y1f8riQaR6yg).toString());
            }
        }
        if (w92Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        mv1 mv1Var = new mv1();
        mv1Var.lS5Rgt96tfkO = fr1Var;
        mv1Var.TSizfFm2Yiuu = w92Var.lS5Rgt96tfkO;
        mv1Var.Y1f8riQaR6yg = w92Var.TSizfFm2Yiuu;
        mv1Var.a92UlCVFR9N8 = new hj0((String[]) arrayList.toArray(new String[0])).TSizfFm2Yiuu();
        if (z && mv1Var.TSizfFm2Yiuu == 100) {
            return null;
        }
        return mv1Var;
    }

    @Override // defpackage.d70
    public final void PxuCJdSBwIXG(xb xbVar) {
        int i;
        vl0 vl0Var;
        if (this.Y1f8riQaR6yg != null) {
            return;
        }
        Companion.getClass();
        hj0 hj0Var = (hj0) xbVar.Y1f8riQaR6yg;
        ArrayList arrayList = new ArrayList(hj0Var.size() + 4);
        arrayList.add(new fj0(fj0.a92UlCVFR9N8, (String) xbVar.TSizfFm2Yiuu));
        ah ahVar = fj0.RAsUl2FVSrh6;
        gm0 gm0Var = (gm0) xbVar.lS5Rgt96tfkO;
        gm0Var.getClass();
        String lS5Rgt96tfkO = gm0Var.lS5Rgt96tfkO();
        String Y1f8riQaR6yg = gm0Var.Y1f8riQaR6yg();
        if (Y1f8riQaR6yg != null) {
            lS5Rgt96tfkO = lS5Rgt96tfkO + '?' + Y1f8riQaR6yg;
        }
        arrayList.add(new fj0(ahVar, lS5Rgt96tfkO));
        String PxuCJdSBwIXG = hj0Var.PxuCJdSBwIXG("Host");
        if (PxuCJdSBwIXG != null) {
            arrayList.add(new fj0(fj0.OPXfSBeufaJ8, PxuCJdSBwIXG));
        }
        arrayList.add(new fj0(fj0.rtx2ld2ELZv4, gm0Var.PxuCJdSBwIXG));
        int size = hj0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lS5Rgt96tfkO2 = hj0Var.lS5Rgt96tfkO(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = lS5Rgt96tfkO2.toLowerCase(locale);
            lowerCase.getClass();
            if (!RAsUl2FVSrh6.contains(lowerCase) || (lowerCase.equals("te") && hj0Var.Y1f8riQaR6yg(i2).equals("trailers"))) {
                arrayList.add(new fj0(lowerCase, hj0Var.Y1f8riQaR6yg(i2)));
            }
        }
        ll0 ll0Var = this.TSizfFm2Yiuu;
        ll0Var.getClass();
        boolean z = !false;
        synchronized (ll0Var.rZjpSjn4zoMv) {
            synchronized (ll0Var) {
                try {
                    if (ll0Var.x50lh2ztY7Y5 > 1073741823) {
                        ll0Var.cpQdD2nAriOS(o60.cpQdD2nAriOS);
                    }
                    if (ll0Var.cpQdD2nAriOS) {
                        throw new yq();
                    }
                    i = ll0Var.x50lh2ztY7Y5;
                    ll0Var.x50lh2ztY7Y5 = i + 2;
                    vl0Var = new vl0(i, ll0Var, z, false, null);
                    if (vl0Var.rtx2ld2ELZv4()) {
                        ll0Var.OPXfSBeufaJ8.put(Integer.valueOf(i), vl0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ll0Var.rZjpSjn4zoMv.gPXPFXrUH4XX(z, i, arrayList);
        }
        ll0Var.rZjpSjn4zoMv.flush();
        this.Y1f8riQaR6yg = vl0Var;
        boolean z2 = this.a92UlCVFR9N8;
        vl0 vl0Var2 = this.Y1f8riQaR6yg;
        if (z2) {
            vl0Var2.getClass();
            vl0Var2.e9gEMXR7LXtO(o60.r3s1LDPKFs1S);
            u9.S9EYkSpbGuxq("Canceled");
            return;
        }
        vl0Var2.getClass();
        ul0 ul0Var = vl0Var2.BRwzKIf41E4i;
        long j = this.lS5Rgt96tfkO.RAsUl2FVSrh6;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ul0Var.RAsUl2FVSrh6(j, timeUnit);
        vl0 vl0Var3 = this.Y1f8riQaR6yg;
        vl0Var3.getClass();
        vl0Var3.XL4ISE6Oc65B.RAsUl2FVSrh6(this.lS5Rgt96tfkO.rtx2ld2ELZv4, timeUnit);
    }

    @Override // defpackage.d70
    public final b70 RAsUl2FVSrh6() {
        return this.PxuCJdSBwIXG;
    }

    @Override // defpackage.d70
    public final void TSizfFm2Yiuu() {
        vl0 vl0Var = this.Y1f8riQaR6yg;
        vl0Var.getClass();
        vl0Var.gPXPFXrUH4XX.close();
    }

    @Override // defpackage.d70
    public final boolean Y1f8riQaR6yg() {
        boolean z;
        vl0 vl0Var = this.Y1f8riQaR6yg;
        if (vl0Var != null) {
            synchronized (vl0Var) {
                tl0 tl0Var = vl0Var.QrzZRwfaDlRX;
                if (tl0Var.OPXfSBeufaJ8) {
                    if (tl0Var.dgRBjINgWbAK.OPXfSBeufaJ8()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.d70
    public final g82 a92UlCVFR9N8() {
        vl0 vl0Var = this.Y1f8riQaR6yg;
        vl0Var.getClass();
        return vl0Var;
    }

    @Override // defpackage.d70
    public final void cancel() {
        this.a92UlCVFR9N8 = true;
        vl0 vl0Var = this.Y1f8riQaR6yg;
        if (vl0Var != null) {
            vl0Var.e9gEMXR7LXtO(o60.r3s1LDPKFs1S);
        }
    }

    @Override // defpackage.d70
    public final void e9gEMXR7LXtO() {
        this.TSizfFm2Yiuu.flush();
    }

    @Override // defpackage.d70
    public final o82 lS5Rgt96tfkO(nv1 nv1Var) {
        vl0 vl0Var = this.Y1f8riQaR6yg;
        vl0Var.getClass();
        return vl0Var.QrzZRwfaDlRX;
    }

    @Override // defpackage.d70
    public final long rtx2ld2ELZv4(nv1 nv1Var) {
        if (yl0.PxuCJdSBwIXG(nv1Var)) {
            return mv2.e9gEMXR7LXtO(nv1Var);
        }
        return 0L;
    }
}
