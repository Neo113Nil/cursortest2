package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sh implements Runnable {
    public Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final Object wdg6QnbFHrFF;

    public /* synthetic */ sh(int i, Object obj, Object obj2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pm0 pm0Var;
        Exception exc;
        pm0 pm0Var2 = null;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return;
            case 1:
                ((bi) this.OPXfSBeufaJ8).tmVwIGCQF4zR((pi0) this.wdg6QnbFHrFF);
                return;
            case 2:
                y01 y01Var = (y01) this.wdg6QnbFHrFF;
                ju juVar = y01Var.dgRBjINgWbAK;
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.OPXfSBeufaJ8).run();
                    } catch (Throwable th) {
                        bs0.S2OOm9zPNm0h(n50.rtx2ld2ELZv4, th);
                    }
                    Runnable zf8DYfih6EZu = y01Var.zf8DYfih6EZu();
                    if (zf8DYfih6EZu == null) {
                        return;
                    }
                    this.OPXfSBeufaJ8 = zf8DYfih6EZu;
                    i++;
                    if (i >= 16 && juVar.POWyO8hTM6YC(y01Var)) {
                        juVar.Pf0ThKz3j5YS(y01Var, this);
                        return;
                    }
                }
                break;
            case 3:
                ((ec0) this.OPXfSBeufaJ8).accept(this.wdg6QnbFHrFF);
                return;
            case 4:
                ((bi) this.wdg6QnbFHrFF).tmVwIGCQF4zR((i70) this.OPXfSBeufaJ8);
                return;
            case 5:
                xq xqVar = (xq) this.OPXfSBeufaJ8;
                wv2 wv2Var = (wv2) this.wdg6QnbFHrFF;
                y8 y8Var = wv2Var.rtx2ld2ELZv4;
                uv2 uv2Var = (uv2) wv2Var.cpQdD2nAriOS.wdg6QnbFHrFF.get(wv2Var.OPXfSBeufaJ8);
                if (uv2Var == null) {
                    return;
                }
                if (xqVar.OPXfSBeufaJ8 != 0) {
                    uv2Var.QrzZRwfaDlRX(xqVar, null);
                    return;
                }
                wv2Var.x50lh2ztY7Y5 = true;
                if (y8Var.wdg6QnbFHrFF()) {
                    if (!wv2Var.x50lh2ztY7Y5 || (pm0Var = wv2Var.wdg6QnbFHrFF) == null) {
                        return;
                    }
                    y8Var.x50lh2ztY7Y5(pm0Var, wv2Var.dgRBjINgWbAK);
                    return;
                }
                try {
                    y8Var.x50lh2ztY7Y5(null, y8Var.lS5Rgt96tfkO());
                    return;
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    y8Var.TSizfFm2Yiuu("Failed to get service from broker.");
                    uv2Var.QrzZRwfaDlRX(new xq(10), null);
                    return;
                }
            case 6:
                ew2 ew2Var = (ew2) this.wdg6QnbFHrFF;
                nw2 nw2Var = (nw2) this.OPXfSBeufaJ8;
                xq xqVar2 = nw2Var.OPXfSBeufaJ8;
                if (xqVar2.OPXfSBeufaJ8 == 0) {
                    tw2 tw2Var = nw2Var.wdg6QnbFHrFF;
                    jh0.x50lh2ztY7Y5(tw2Var);
                    xq xqVar3 = tw2Var.wdg6QnbFHrFF;
                    if (xqVar3.OPXfSBeufaJ8 != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(xqVar3)), new Exception());
                        ew2Var.wdg6QnbFHrFF.PxuCJdSBwIXG(xqVar3);
                        ew2Var.OPXfSBeufaJ8.r3s1LDPKFs1S();
                        return;
                    }
                    wv2 wv2Var2 = ew2Var.wdg6QnbFHrFF;
                    IBinder iBinder = tw2Var.OPXfSBeufaJ8;
                    if (iBinder != null) {
                        int i2 = FT2GK7JK5Ma2.Y1f8riQaR6yg;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        pm0Var2 = queryLocalInterface instanceof pm0 ? (pm0) queryLocalInterface : new wx2(iBinder);
                    }
                    Set set = ew2Var.RAsUl2FVSrh6;
                    wv2Var2.getClass();
                    if (pm0Var2 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        wv2Var2.PxuCJdSBwIXG(new xq(4));
                    } else {
                        wv2Var2.wdg6QnbFHrFF = pm0Var2;
                        wv2Var2.dgRBjINgWbAK = set;
                        if (wv2Var2.x50lh2ztY7Y5) {
                            wv2Var2.rtx2ld2ELZv4.x50lh2ztY7Y5(pm0Var2, set);
                        }
                    }
                } else {
                    ew2Var.wdg6QnbFHrFF.PxuCJdSBwIXG(xqVar2);
                }
                ew2Var.OPXfSBeufaJ8.r3s1LDPKFs1S();
                return;
            case 7:
                synchronized (((lx2) this.wdg6QnbFHrFF).TSizfFm2Yiuu) {
                    cr1 cr1Var = (cr1) ((lx2) this.wdg6QnbFHrFF).Y1f8riQaR6yg;
                    ((Map) ((cr1) cr1Var.wdg6QnbFHrFF).wdg6QnbFHrFF).remove((vd2) cr1Var.OPXfSBeufaJ8);
                }
                return;
            default:
                synchronized (((lx2) this.wdg6QnbFHrFF).TSizfFm2Yiuu) {
                    ij0 ij0Var = (ij0) ((lx2) this.wdg6QnbFHrFF).Y1f8riQaR6yg;
                    uj ujVar = (uj) this.OPXfSBeufaJ8;
                    synchronized (ujVar.lS5Rgt96tfkO) {
                        exc = (Exception) ujVar.e9gEMXR7LXtO;
                    }
                    jh0.x50lh2ztY7Y5(exc);
                    ij0Var.TSizfFm2Yiuu(exc);
                }
                return;
        }
    }

    public /* synthetic */ sh(int i, Object obj, Object obj2, boolean z) {
        this.rtx2ld2ELZv4 = i;
        this.wdg6QnbFHrFF = obj;
        this.OPXfSBeufaJ8 = obj2;
    }
}
