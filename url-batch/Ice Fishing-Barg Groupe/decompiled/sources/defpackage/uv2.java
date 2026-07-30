package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PxuCJdSBwIXG;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class uv2 implements dh0, eh0 {
    public final int OPXfSBeufaJ8;
    public final y8 Y1f8riQaR6yg;
    public final cr1 a92UlCVFR9N8;
    public boolean dgRBjINgWbAK;
    public final j9 e9gEMXR7LXtO;
    public final /* synthetic */ fh0 r3s1LDPKFs1S;
    public final ew2 wdg6QnbFHrFF;
    public final LinkedList TSizfFm2Yiuu = new LinkedList();
    public final HashSet RAsUl2FVSrh6 = new HashSet();
    public final HashMap rtx2ld2ELZv4 = new HashMap();
    public final ArrayList x50lh2ztY7Y5 = new ArrayList();
    public xq cpQdD2nAriOS = null;

    public uv2(fh0 fh0Var, ow2 ow2Var) {
        this.r3s1LDPKFs1S = fh0Var;
        Looper looper = fh0Var.cpQdD2nAriOS.getLooper();
        m9 PxuCJdSBwIXG = ow2Var.PxuCJdSBwIXG();
        mk mkVar = new mk((ma) PxuCJdSBwIXG.OPXfSBeufaJ8, (String) PxuCJdSBwIXG.wdg6QnbFHrFF, (String) PxuCJdSBwIXG.dgRBjINgWbAK);
        ov2 ov2Var = (ov2) ow2Var.TSizfFm2Yiuu.OPXfSBeufaJ8;
        jh0.x50lh2ztY7Y5(ov2Var);
        y8 XL4ISE6Oc65B = ov2Var.XL4ISE6Oc65B(ow2Var.PxuCJdSBwIXG, looper, mkVar, ow2Var.Y1f8riQaR6yg, this, this);
        String str = ow2Var.lS5Rgt96tfkO;
        if (str != null && (XL4ISE6Oc65B instanceof PxuCJdSBwIXG)) {
            ((PxuCJdSBwIXG) XL4ISE6Oc65B).XL4ISE6Oc65B = str;
        }
        if (str != null && (XL4ISE6Oc65B instanceof xd1)) {
            o0.ZbWwgt3aGe7A(XL4ISE6Oc65B);
            throw null;
        }
        this.Y1f8riQaR6yg = XL4ISE6Oc65B;
        this.e9gEMXR7LXtO = ow2Var.e9gEMXR7LXtO;
        this.a92UlCVFR9N8 = new cr1(14);
        this.OPXfSBeufaJ8 = ow2Var.a92UlCVFR9N8;
        if (!XL4ISE6Oc65B.wdg6QnbFHrFF()) {
            this.wdg6QnbFHrFF = null;
            return;
        }
        Context context = fh0Var.e9gEMXR7LXtO;
        sw2 sw2Var = fh0Var.cpQdD2nAriOS;
        m9 PxuCJdSBwIXG2 = ow2Var.PxuCJdSBwIXG();
        this.wdg6QnbFHrFF = new ew2(context, sw2Var, new mk((ma) PxuCJdSBwIXG2.OPXfSBeufaJ8, (String) PxuCJdSBwIXG2.wdg6QnbFHrFF, (String) PxuCJdSBwIXG2.dgRBjINgWbAK));
    }

    public final void BRwzKIf41E4i() {
        jh0.wdg6QnbFHrFF(this.r3s1LDPKFs1S.cpQdD2nAriOS);
        Status status = fh0.QrzZRwfaDlRX;
        e9gEMXR7LXtO(status);
        this.a92UlCVFR9N8.x50lh2ztY7Y5(false, status);
        for (d21 d21Var : (d21[]) this.rtx2ld2ELZv4.keySet().toArray(new d21[0])) {
            r3s1LDPKFs1S(new lw2(new vd2()));
        }
        TSizfFm2Yiuu(new xq(4));
        y8 y8Var = this.Y1f8riQaR6yg;
        if (y8Var.PxuCJdSBwIXG()) {
            y8Var.dgRBjINgWbAK(new b42(18, this));
        }
    }

    public final void OPXfSBeufaJ8(int i) {
        fh0 fh0Var = this.r3s1LDPKFs1S;
        sw2 sw2Var = fh0Var.cpQdD2nAriOS;
        jh0.wdg6QnbFHrFF(fh0Var.cpQdD2nAriOS);
        this.cpQdD2nAriOS = null;
        this.dgRBjINgWbAK = true;
        String OPXfSBeufaJ8 = this.Y1f8riQaR6yg.OPXfSBeufaJ8();
        cr1 cr1Var = this.a92UlCVFR9N8;
        cr1Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (OPXfSBeufaJ8 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(OPXfSBeufaJ8);
        }
        cr1Var.x50lh2ztY7Y5(true, new Status(20, sb.toString(), null, null));
        j9 j9Var = this.e9gEMXR7LXtO;
        sw2Var.sendMessageDelayed(Message.obtain(sw2Var, 9, j9Var), 5000L);
        sw2Var.sendMessageDelayed(Message.obtain(sw2Var, 11, j9Var), 120000L);
        ((SparseIntArray) fh0Var.RAsUl2FVSrh6.OPXfSBeufaJ8).clear();
        Iterator it = this.rtx2ld2ELZv4.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            u9.VhhvGxCb8gfr();
        }
    }

    @Override // defpackage.dh0
    public final void PxuCJdSBwIXG(int i) {
        Looper myLooper = Looper.myLooper();
        sw2 sw2Var = this.r3s1LDPKFs1S.cpQdD2nAriOS;
        if (myLooper == sw2Var.getLooper()) {
            OPXfSBeufaJ8(i);
        } else {
            sw2Var.post(new th(i, 2, this));
        }
    }

    public final void QrzZRwfaDlRX(xq xqVar, RuntimeException runtimeException) {
        r52 r52Var;
        jh0.wdg6QnbFHrFF(this.r3s1LDPKFs1S.cpQdD2nAriOS);
        ew2 ew2Var = this.wdg6QnbFHrFF;
        if (ew2Var != null && (r52Var = ew2Var.OPXfSBeufaJ8) != null) {
            r52Var.r3s1LDPKFs1S();
        }
        jh0.wdg6QnbFHrFF(this.r3s1LDPKFs1S.cpQdD2nAriOS);
        this.cpQdD2nAriOS = null;
        ((SparseIntArray) this.r3s1LDPKFs1S.RAsUl2FVSrh6.OPXfSBeufaJ8).clear();
        TSizfFm2Yiuu(xqVar);
        if ((this.Y1f8riQaR6yg instanceof qw2) && xqVar.OPXfSBeufaJ8 != 24) {
            fh0 fh0Var = this.r3s1LDPKFs1S;
            fh0Var.lS5Rgt96tfkO = true;
            sw2 sw2Var = fh0Var.cpQdD2nAriOS;
            sw2Var.sendMessageDelayed(sw2Var.obtainMessage(19), 300000L);
        }
        if (xqVar.OPXfSBeufaJ8 == 4) {
            e9gEMXR7LXtO(fh0.gPXPFXrUH4XX);
            return;
        }
        if (this.TSizfFm2Yiuu.isEmpty()) {
            this.cpQdD2nAriOS = xqVar;
            return;
        }
        fh0 fh0Var2 = this.r3s1LDPKFs1S;
        if (runtimeException != null) {
            jh0.wdg6QnbFHrFF(fh0Var2.cpQdD2nAriOS);
            a92UlCVFR9N8(null, runtimeException, false);
            return;
        }
        boolean z = fh0Var2.r3s1LDPKFs1S;
        j9 j9Var = this.e9gEMXR7LXtO;
        if (!z) {
            e9gEMXR7LXtO(fh0.lS5Rgt96tfkO(j9Var, xqVar));
            return;
        }
        a92UlCVFR9N8(fh0.lS5Rgt96tfkO(j9Var, xqVar), null, true);
        if (this.TSizfFm2Yiuu.isEmpty() || x50lh2ztY7Y5(xqVar) || this.r3s1LDPKFs1S.PxuCJdSBwIXG(xqVar, this.OPXfSBeufaJ8)) {
            return;
        }
        if (xqVar.OPXfSBeufaJ8 == 18) {
            this.dgRBjINgWbAK = true;
        }
        if (!this.dgRBjINgWbAK) {
            e9gEMXR7LXtO(fh0.lS5Rgt96tfkO(this.e9gEMXR7LXtO, xqVar));
            return;
        }
        fh0 fh0Var3 = this.r3s1LDPKFs1S;
        j9 j9Var2 = this.e9gEMXR7LXtO;
        sw2 sw2Var2 = fh0Var3.cpQdD2nAriOS;
        sw2Var2.sendMessageDelayed(Message.obtain(sw2Var2, 9, j9Var2), 5000L);
    }

    public final void RAsUl2FVSrh6() {
        LinkedList linkedList = this.TSizfFm2Yiuu;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bw2 bw2Var = (bw2) arrayList.get(i);
            if (!this.Y1f8riQaR6yg.PxuCJdSBwIXG()) {
                return;
            }
            if (dgRBjINgWbAK(bw2Var)) {
                linkedList.remove(bw2Var);
            }
        }
    }

    public final void TSizfFm2Yiuu(xq xqVar) {
        HashSet hashSet = this.RAsUl2FVSrh6;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            u9.VhhvGxCb8gfr();
        } else {
            if (ni0.BRwzKIf41E4i(xqVar, xq.x50lh2ztY7Y5)) {
                this.Y1f8riQaR6yg.RAsUl2FVSrh6();
            }
            throw null;
        }
    }

    @Override // defpackage.dh0
    public final void Y1f8riQaR6yg() {
        Looper myLooper = Looper.myLooper();
        sw2 sw2Var = this.r3s1LDPKFs1S.cpQdD2nAriOS;
        if (myLooper == sw2Var.getLooper()) {
            rtx2ld2ELZv4();
        } else {
            sw2Var.post(new o1(4, this));
        }
    }

    public final void a92UlCVFR9N8(Status status, Exception exc, boolean z) {
        jh0.wdg6QnbFHrFF(this.r3s1LDPKFs1S.cpQdD2nAriOS);
        if ((status == null) == (exc == null)) {
            u9.XL4ISE6Oc65B("Status XOR exception should be null");
            return;
        }
        Iterator it = this.TSizfFm2Yiuu.iterator();
        while (it.hasNext()) {
            bw2 bw2Var = (bw2) it.next();
            if (!z || bw2Var.PxuCJdSBwIXG == 2) {
                if (status != null) {
                    bw2Var.TSizfFm2Yiuu(status);
                } else {
                    bw2Var.Y1f8riQaR6yg(exc);
                }
                it.remove();
            }
        }
    }

    public final void cpQdD2nAriOS() {
        fh0 fh0Var = this.r3s1LDPKFs1S;
        jh0.wdg6QnbFHrFF(fh0Var.cpQdD2nAriOS);
        y8 y8Var = this.Y1f8riQaR6yg;
        if (y8Var.PxuCJdSBwIXG() || y8Var.e9gEMXR7LXtO()) {
            return;
        }
        try {
            cr1 cr1Var = fh0Var.RAsUl2FVSrh6;
            Context context = fh0Var.e9gEMXR7LXtO;
            SparseIntArray sparseIntArray = (SparseIntArray) cr1Var.OPXfSBeufaJ8;
            jh0.x50lh2ztY7Y5(context);
            int Y1f8riQaR6yg = y8Var.Y1f8riQaR6yg();
            int i = ((SparseIntArray) cr1Var.OPXfSBeufaJ8).get(Y1f8riQaR6yg, -1);
            if (i == -1) {
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= sparseIntArray.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i2);
                    if (keyAt > Y1f8riQaR6yg && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i == -1) {
                    i = ((bh0) cr1Var.wdg6QnbFHrFF).lS5Rgt96tfkO(context, Y1f8riQaR6yg);
                }
                sparseIntArray.put(Y1f8riQaR6yg, i);
            }
            if (i != 0) {
                xq xqVar = new xq(i, null);
                Log.w("GoogleApiManager", "The service for " + y8Var.getClass().getName() + " is not available: " + xqVar.toString());
                QrzZRwfaDlRX(xqVar, null);
                return;
            }
            wv2 wv2Var = new wv2(fh0Var, y8Var, this.e9gEMXR7LXtO);
            if (y8Var.wdg6QnbFHrFF()) {
                ew2 ew2Var = this.wdg6QnbFHrFF;
                jh0.x50lh2ztY7Y5(ew2Var);
                Handler handler = ew2Var.e9gEMXR7LXtO;
                mk mkVar = ew2Var.rtx2ld2ELZv4;
                r52 r52Var = ew2Var.OPXfSBeufaJ8;
                if (r52Var != null) {
                    r52Var.r3s1LDPKFs1S();
                }
                mkVar.a92UlCVFR9N8 = Integer.valueOf(System.identityHashCode(ew2Var));
                ew2Var.OPXfSBeufaJ8 = (r52) ew2Var.a92UlCVFR9N8.XL4ISE6Oc65B(ew2Var.Y1f8riQaR6yg, handler.getLooper(), mkVar, mkVar.e9gEMXR7LXtO, ew2Var, ew2Var);
                ew2Var.wdg6QnbFHrFF = wv2Var;
                Set set = ew2Var.RAsUl2FVSrh6;
                if (set == null || set.isEmpty()) {
                    handler.post(new o1(6, ew2Var));
                } else {
                    r52 r52Var2 = ew2Var.OPXfSBeufaJ8;
                    r52Var2.getClass();
                    r52Var2.rtx2ld2ELZv4(new i2(1, r52Var2));
                }
            }
            try {
                y8Var.rtx2ld2ELZv4(wv2Var);
            } catch (SecurityException e) {
                QrzZRwfaDlRX(new xq(10), e);
            }
        } catch (IllegalStateException e2) {
            QrzZRwfaDlRX(new xq(10), e2);
        }
    }

    public final boolean dgRBjINgWbAK(bw2 bw2Var) {
        t70 t70Var;
        if (bw2Var == null) {
            cr1 cr1Var = this.a92UlCVFR9N8;
            y8 y8Var = this.Y1f8riQaR6yg;
            bw2Var.a92UlCVFR9N8(cr1Var, y8Var.wdg6QnbFHrFF());
            try {
                bw2Var.e9gEMXR7LXtO(this);
                return true;
            } catch (DeadObjectException unused) {
                PxuCJdSBwIXG(1);
                y8Var.TSizfFm2Yiuu("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        t70[] lS5Rgt96tfkO = bw2Var.lS5Rgt96tfkO(this);
        if (lS5Rgt96tfkO != null && lS5Rgt96tfkO.length != 0) {
            t70[] a92UlCVFR9N8 = this.Y1f8riQaR6yg.a92UlCVFR9N8();
            if (a92UlCVFR9N8 == null) {
                a92UlCVFR9N8 = new t70[0];
            }
            ka kaVar = new ka(a92UlCVFR9N8.length);
            for (t70 t70Var2 : a92UlCVFR9N8) {
                kaVar.put(t70Var2.rtx2ld2ELZv4, Long.valueOf(t70Var2.PxuCJdSBwIXG()));
            }
            int length = lS5Rgt96tfkO.length;
            for (int i = 0; i < length; i++) {
                t70Var = lS5Rgt96tfkO[i];
                Long l = (Long) kaVar.get(t70Var.rtx2ld2ELZv4);
                if (l == null || l.longValue() < t70Var.PxuCJdSBwIXG()) {
                    break;
                }
            }
        }
        t70Var = null;
        if (t70Var == null) {
            cr1 cr1Var2 = this.a92UlCVFR9N8;
            y8 y8Var2 = this.Y1f8riQaR6yg;
            bw2Var.a92UlCVFR9N8(cr1Var2, y8Var2.wdg6QnbFHrFF());
            try {
                bw2Var.e9gEMXR7LXtO(this);
                return true;
            } catch (DeadObjectException unused2) {
                PxuCJdSBwIXG(1);
                y8Var2.TSizfFm2Yiuu("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.Y1f8riQaR6yg.getClass().getName() + " could not execute call because it requires feature (" + t70Var.rtx2ld2ELZv4 + ", " + t70Var.PxuCJdSBwIXG() + ").");
        if (!this.r3s1LDPKFs1S.r3s1LDPKFs1S || !bw2Var.PxuCJdSBwIXG(this)) {
            bw2Var.Y1f8riQaR6yg(new yo2(t70Var));
            return true;
        }
        vv2 vv2Var = new vv2(this.e9gEMXR7LXtO, t70Var);
        int indexOf = this.x50lh2ztY7Y5.indexOf(vv2Var);
        ArrayList arrayList = this.x50lh2ztY7Y5;
        if (indexOf >= 0) {
            vv2 vv2Var2 = (vv2) arrayList.get(indexOf);
            this.r3s1LDPKFs1S.cpQdD2nAriOS.removeMessages(15, vv2Var2);
            sw2 sw2Var = this.r3s1LDPKFs1S.cpQdD2nAriOS;
            sw2Var.sendMessageDelayed(Message.obtain(sw2Var, 15, vv2Var2), 5000L);
            return false;
        }
        arrayList.add(vv2Var);
        sw2 sw2Var2 = this.r3s1LDPKFs1S.cpQdD2nAriOS;
        sw2Var2.sendMessageDelayed(Message.obtain(sw2Var2, 15, vv2Var), 5000L);
        sw2 sw2Var3 = this.r3s1LDPKFs1S.cpQdD2nAriOS;
        sw2Var3.sendMessageDelayed(Message.obtain(sw2Var3, 16, vv2Var), 120000L);
        xq xqVar = new xq(2, null);
        if (!x50lh2ztY7Y5(xqVar)) {
            this.r3s1LDPKFs1S.PxuCJdSBwIXG(xqVar, this.OPXfSBeufaJ8);
        }
        return false;
    }

    public final void e9gEMXR7LXtO(Status status) {
        jh0.wdg6QnbFHrFF(this.r3s1LDPKFs1S.cpQdD2nAriOS);
        a92UlCVFR9N8(status, null, false);
    }

    public final void gPXPFXrUH4XX(xq xqVar) {
        jh0.wdg6QnbFHrFF(this.r3s1LDPKFs1S.cpQdD2nAriOS);
        y8 y8Var = this.Y1f8riQaR6yg;
        y8Var.TSizfFm2Yiuu("onSignInFailed for " + y8Var.getClass().getName() + " with " + String.valueOf(xqVar));
        QrzZRwfaDlRX(xqVar, null);
    }

    @Override // defpackage.eh0
    public final void lS5Rgt96tfkO(xq xqVar) {
        QrzZRwfaDlRX(xqVar, null);
    }

    public final void r3s1LDPKFs1S(bw2 bw2Var) {
        jh0.wdg6QnbFHrFF(this.r3s1LDPKFs1S.cpQdD2nAriOS);
        boolean PxuCJdSBwIXG = this.Y1f8riQaR6yg.PxuCJdSBwIXG();
        LinkedList linkedList = this.TSizfFm2Yiuu;
        if (PxuCJdSBwIXG) {
            if (dgRBjINgWbAK(bw2Var)) {
                wdg6QnbFHrFF();
                return;
            } else {
                linkedList.add(bw2Var);
                return;
            }
        }
        linkedList.add(bw2Var);
        xq xqVar = this.cpQdD2nAriOS;
        if (xqVar == null || xqVar.OPXfSBeufaJ8 == 0 || xqVar.wdg6QnbFHrFF == null) {
            cpQdD2nAriOS();
        } else {
            QrzZRwfaDlRX(xqVar, null);
        }
    }

    public final void rtx2ld2ELZv4() {
        fh0 fh0Var = this.r3s1LDPKFs1S;
        jh0.wdg6QnbFHrFF(fh0Var.cpQdD2nAriOS);
        this.cpQdD2nAriOS = null;
        TSizfFm2Yiuu(xq.x50lh2ztY7Y5);
        sw2 sw2Var = fh0Var.cpQdD2nAriOS;
        if (this.dgRBjINgWbAK) {
            j9 j9Var = this.e9gEMXR7LXtO;
            sw2Var.removeMessages(11, j9Var);
            sw2Var.removeMessages(9, j9Var);
            this.dgRBjINgWbAK = false;
        }
        Iterator it = this.rtx2ld2ELZv4.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            u9.VhhvGxCb8gfr();
        } else {
            RAsUl2FVSrh6();
            wdg6QnbFHrFF();
        }
    }

    public final void wdg6QnbFHrFF() {
        fh0 fh0Var = this.r3s1LDPKFs1S;
        sw2 sw2Var = fh0Var.cpQdD2nAriOS;
        j9 j9Var = this.e9gEMXR7LXtO;
        sw2Var.removeMessages(12, j9Var);
        sw2Var.sendMessageDelayed(sw2Var.obtainMessage(12, j9Var), fh0Var.PxuCJdSBwIXG);
    }

    public final boolean x50lh2ztY7Y5(xq xqVar) {
        synchronized (fh0.BRwzKIf41E4i) {
        }
        return false;
    }
}
