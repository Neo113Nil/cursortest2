package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.b42;
import defpackage.bh0;
import defpackage.ch0;
import defpackage.cx2;
import defpackage.dh0;
import defpackage.eh0;
import defpackage.gx2;
import defpackage.hx2;
import defpackage.jh0;
import defpackage.kx2;
import defpackage.mk;
import defpackage.nx2;
import defpackage.o1;
import defpackage.oc;
import defpackage.p;
import defpackage.pm0;
import defpackage.rg0;
import defpackage.rx2;
import defpackage.t70;
import defpackage.u9;
import defpackage.uv2;
import defpackage.uw2;
import defpackage.vx2;
import defpackage.ww2;
import defpackage.wx2;
import defpackage.xq;
import defpackage.y8;
import defpackage.yw2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class PxuCJdSBwIXG implements y8 {
    public static final t70[] ZbWwgt3aGe7A = new t70[0];
    public final String BRwzKIf41E4i;
    public boolean EcgxDIVH5in8;
    public oc OPXfSBeufaJ8;
    public volatile String PxuCJdSBwIXG;
    public final b42 QrzZRwfaDlRX;
    public final Object RAsUl2FVSrh6;
    public xq RfyTYNmI9Srp;
    public final Set S2OOm9zPNm0h;
    public volatile nx2 S9EYkSpbGuxq;
    public final Context TSizfFm2Yiuu;
    public final AtomicInteger VhhvGxCb8gfr;
    public volatile String XL4ISE6Oc65B;
    public final vx2 Y1f8riQaR6yg;
    public final Object a92UlCVFR9N8;
    public int cpQdD2nAriOS;
    public final ArrayList dgRBjINgWbAK;
    public final yw2 e9gEMXR7LXtO;
    public final int gPXPFXrUH4XX;
    public p lS5Rgt96tfkO;
    public final b42 r3s1LDPKFs1S;
    public ww2 rtx2ld2ELZv4;
    public IInterface wdg6QnbFHrFF;
    public gx2 x50lh2ztY7Y5;

    public PxuCJdSBwIXG(Context context, Looper looper, int i, mk mkVar, dh0 dh0Var, eh0 eh0Var) {
        synchronized (vx2.RAsUl2FVSrh6) {
            try {
                if (vx2.rtx2ld2ELZv4 == null) {
                    vx2.rtx2ld2ELZv4 = new vx2(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        vx2 vx2Var = vx2.rtx2ld2ELZv4;
        Object obj = bh0.TSizfFm2Yiuu;
        jh0.x50lh2ztY7Y5(dh0Var);
        jh0.x50lh2ztY7Y5(eh0Var);
        b42 b42Var = new b42(19, dh0Var);
        b42 b42Var2 = new b42(20, eh0Var);
        String str = mkVar.Y1f8riQaR6yg;
        this.PxuCJdSBwIXG = null;
        this.a92UlCVFR9N8 = new Object();
        this.RAsUl2FVSrh6 = new Object();
        this.dgRBjINgWbAK = new ArrayList();
        this.cpQdD2nAriOS = 1;
        this.RfyTYNmI9Srp = null;
        this.EcgxDIVH5in8 = false;
        this.S9EYkSpbGuxq = null;
        this.VhhvGxCb8gfr = new AtomicInteger(0);
        jh0.cpQdD2nAriOS(context, "Context must not be null");
        this.TSizfFm2Yiuu = context;
        jh0.cpQdD2nAriOS(looper, "Looper must not be null");
        jh0.cpQdD2nAriOS(vx2Var, "Supervisor must not be null");
        this.Y1f8riQaR6yg = vx2Var;
        this.e9gEMXR7LXtO = new yw2(this, looper);
        this.gPXPFXrUH4XX = i;
        this.r3s1LDPKFs1S = b42Var;
        this.QrzZRwfaDlRX = b42Var2;
        this.BRwzKIf41E4i = str;
        Set set = mkVar.lS5Rgt96tfkO;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                u9.rtx2ld2ELZv4("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.S2OOm9zPNm0h = set;
    }

    public static /* bridge */ /* synthetic */ boolean S9EYkSpbGuxq(PxuCJdSBwIXG pxuCJdSBwIXG, int i, int i2, IInterface iInterface) {
        synchronized (pxuCJdSBwIXG.a92UlCVFR9N8) {
            try {
                if (pxuCJdSBwIXG.cpQdD2nAriOS != i) {
                    return false;
                }
                pxuCJdSBwIXG.VhhvGxCb8gfr(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IInterface BRwzKIf41E4i() {
        IInterface iInterface;
        synchronized (this.a92UlCVFR9N8) {
            try {
                if (this.cpQdD2nAriOS == 5) {
                    throw new DeadObjectException();
                }
                if (!PxuCJdSBwIXG()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.wdg6QnbFHrFF;
                jh0.cpQdD2nAriOS(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public boolean EcgxDIVH5in8() {
        return Y1f8riQaR6yg() >= 211700000;
    }

    @Override // defpackage.y8
    public final String OPXfSBeufaJ8() {
        return this.PxuCJdSBwIXG;
    }

    @Override // defpackage.y8
    public final boolean PxuCJdSBwIXG() {
        boolean z;
        synchronized (this.a92UlCVFR9N8) {
            z = this.cpQdD2nAriOS == 4;
        }
        return z;
    }

    public t70[] QrzZRwfaDlRX() {
        return ZbWwgt3aGe7A;
    }

    @Override // defpackage.y8
    public final void RAsUl2FVSrh6() {
        if (!PxuCJdSBwIXG() || this.lS5Rgt96tfkO == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public abstract String RfyTYNmI9Srp();

    @Override // defpackage.y8
    public final void TSizfFm2Yiuu(String str) {
        this.PxuCJdSBwIXG = str;
        r3s1LDPKFs1S();
    }

    public final void VhhvGxCb8gfr(int i, IInterface iInterface) {
        p pVar;
        if ((i == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.a92UlCVFR9N8) {
            try {
                this.cpQdD2nAriOS = i;
                this.wdg6QnbFHrFF = iInterface;
                if (i == 1) {
                    gx2 gx2Var = this.x50lh2ztY7Y5;
                    if (gx2Var != null) {
                        vx2 vx2Var = this.Y1f8riQaR6yg;
                        String str = this.lS5Rgt96tfkO.TSizfFm2Yiuu;
                        jh0.x50lh2ztY7Y5(str);
                        this.lS5Rgt96tfkO.getClass();
                        if (this.BRwzKIf41E4i == null) {
                            this.TSizfFm2Yiuu.getClass();
                        }
                        vx2Var.PxuCJdSBwIXG(str, gx2Var, this.lS5Rgt96tfkO.lS5Rgt96tfkO);
                        this.x50lh2ztY7Y5 = null;
                    }
                } else if (i == 2 || i == 3) {
                    gx2 gx2Var2 = this.x50lh2ztY7Y5;
                    if (gx2Var2 != null && (pVar = this.lS5Rgt96tfkO) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + pVar.TSizfFm2Yiuu + " on com.google.android.gms");
                        vx2 vx2Var2 = this.Y1f8riQaR6yg;
                        String str2 = this.lS5Rgt96tfkO.TSizfFm2Yiuu;
                        jh0.x50lh2ztY7Y5(str2);
                        this.lS5Rgt96tfkO.getClass();
                        if (this.BRwzKIf41E4i == null) {
                            this.TSizfFm2Yiuu.getClass();
                        }
                        vx2Var2.PxuCJdSBwIXG(str2, gx2Var2, this.lS5Rgt96tfkO.lS5Rgt96tfkO);
                        this.VhhvGxCb8gfr.incrementAndGet();
                    }
                    gx2 gx2Var3 = new gx2(this, this.VhhvGxCb8gfr.get());
                    this.x50lh2ztY7Y5 = gx2Var3;
                    String RfyTYNmI9Srp = RfyTYNmI9Srp();
                    boolean EcgxDIVH5in8 = EcgxDIVH5in8();
                    this.lS5Rgt96tfkO = new p(2, RfyTYNmI9Srp, EcgxDIVH5in8);
                    if (EcgxDIVH5in8 && Y1f8riQaR6yg() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.lS5Rgt96tfkO.TSizfFm2Yiuu)));
                    }
                    vx2 vx2Var3 = this.Y1f8riQaR6yg;
                    String str3 = this.lS5Rgt96tfkO.TSizfFm2Yiuu;
                    jh0.x50lh2ztY7Y5(str3);
                    this.lS5Rgt96tfkO.getClass();
                    String str4 = this.BRwzKIf41E4i;
                    if (str4 == null) {
                        str4 = this.TSizfFm2Yiuu.getClass().getName();
                    }
                    if (!vx2Var3.lS5Rgt96tfkO(new rx2(str3, this.lS5Rgt96tfkO.lS5Rgt96tfkO), gx2Var3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.lS5Rgt96tfkO.TSizfFm2Yiuu + " on com.google.android.gms");
                        int i2 = this.VhhvGxCb8gfr.get();
                        kx2 kx2Var = new kx2(this, 16);
                        yw2 yw2Var = this.e9gEMXR7LXtO;
                        yw2Var.sendMessage(yw2Var.obtainMessage(7, i2, -1, kx2Var));
                    }
                } else if (i == 4) {
                    jh0.x50lh2ztY7Y5(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public abstract String XL4ISE6Oc65B();

    @Override // defpackage.y8
    public final t70[] a92UlCVFR9N8() {
        nx2 nx2Var = this.S9EYkSpbGuxq;
        if (nx2Var == null) {
            return null;
        }
        return nx2Var.OPXfSBeufaJ8;
    }

    public abstract IInterface cpQdD2nAriOS(IBinder iBinder);

    @Override // defpackage.y8
    public final void dgRBjINgWbAK(b42 b42Var) {
        ((uv2) b42Var.OPXfSBeufaJ8).r3s1LDPKFs1S.cpQdD2nAriOS.post(new o1(5, b42Var));
    }

    @Override // defpackage.y8
    public final boolean e9gEMXR7LXtO() {
        boolean z;
        synchronized (this.a92UlCVFR9N8) {
            int i = this.cpQdD2nAriOS;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public abstract Bundle gPXPFXrUH4XX();

    @Override // defpackage.y8
    public final Set lS5Rgt96tfkO() {
        return wdg6QnbFHrFF() ? this.S2OOm9zPNm0h : Collections.EMPTY_SET;
    }

    public final void r3s1LDPKFs1S() {
        this.VhhvGxCb8gfr.incrementAndGet();
        synchronized (this.dgRBjINgWbAK) {
            try {
                int size = this.dgRBjINgWbAK.size();
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.dgRBjINgWbAK;
                    if (i < size) {
                        uw2 uw2Var = (uw2) arrayList.get(i);
                        synchronized (uw2Var) {
                            uw2Var.PxuCJdSBwIXG = null;
                        }
                        i++;
                    } else {
                        arrayList.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.RAsUl2FVSrh6) {
            this.rtx2ld2ELZv4 = null;
        }
        VhhvGxCb8gfr(1, null);
    }

    @Override // defpackage.y8
    public final void rtx2ld2ELZv4(oc ocVar) {
        this.OPXfSBeufaJ8 = ocVar;
        VhhvGxCb8gfr(2, null);
    }

    @Override // defpackage.y8
    public boolean wdg6QnbFHrFF() {
        return false;
    }

    @Override // defpackage.y8
    public final void x50lh2ztY7Y5(pm0 pm0Var, Set set) {
        Bundle gPXPFXrUH4XX = gPXPFXrUH4XX();
        String str = this.XL4ISE6Oc65B;
        int i = ch0.PxuCJdSBwIXG;
        Scope[] scopeArr = rg0.VhhvGxCb8gfr;
        Bundle bundle = new Bundle();
        int i2 = this.gPXPFXrUH4XX;
        t70[] t70VarArr = rg0.S2OOm9zPNm0h;
        rg0 rg0Var = new rg0(6, i2, i, null, null, scopeArr, bundle, null, t70VarArr, t70VarArr, true, 0, false, str);
        rg0Var.dgRBjINgWbAK = this.TSizfFm2Yiuu.getPackageName();
        rg0Var.r3s1LDPKFs1S = gPXPFXrUH4XX;
        if (set != null) {
            rg0Var.cpQdD2nAriOS = (Scope[]) set.toArray(new Scope[0]);
        }
        if (wdg6QnbFHrFF()) {
            rg0Var.QrzZRwfaDlRX = new Account("<<default account>>", "com.google");
            if (pm0Var != null) {
                rg0Var.x50lh2ztY7Y5 = ((wx2) pm0Var).TSizfFm2Yiuu;
            }
        }
        rg0Var.gPXPFXrUH4XX = ZbWwgt3aGe7A;
        rg0Var.BRwzKIf41E4i = QrzZRwfaDlRX();
        try {
            synchronized (this.RAsUl2FVSrh6) {
                try {
                    ww2 ww2Var = this.rtx2ld2ELZv4;
                    if (ww2Var != null) {
                        ww2Var.PxuCJdSBwIXG(new cx2(this, this.VhhvGxCb8gfr.get()), rg0Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.VhhvGxCb8gfr.get();
            yw2 yw2Var = this.e9gEMXR7LXtO;
            yw2Var.sendMessage(yw2Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.VhhvGxCb8gfr.get();
            hx2 hx2Var = new hx2(this, 8, null, null);
            yw2 yw2Var2 = this.e9gEMXR7LXtO;
            yw2Var2.sendMessage(yw2Var2.obtainMessage(1, i4, -1, hx2Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i42 = this.VhhvGxCb8gfr.get();
            hx2 hx2Var2 = new hx2(this, 8, null, null);
            yw2 yw2Var22 = this.e9gEMXR7LXtO;
            yw2Var22.sendMessage(yw2Var22.obtainMessage(1, i42, -1, hx2Var2));
        }
    }
}
