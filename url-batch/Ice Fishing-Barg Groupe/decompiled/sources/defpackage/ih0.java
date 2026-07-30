package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ih0 implements te, gu, jy, my0, zv1, y72, pe, hu2, lb0, x9, z9, db, hs, a10 {
    public static ih0 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public static final ih0 wdg6QnbFHrFF = new ih0(1);
    public static final ih0 dgRBjINgWbAK = new ih0(2);
    public static final /* synthetic */ ih0 x50lh2ztY7Y5 = new ih0(3);
    public static final ih0 cpQdD2nAriOS = new ih0(4);
    public static final ih0 r3s1LDPKFs1S = new ih0(5);
    public static final ih0 QrzZRwfaDlRX = new ih0(6);
    public static final ih0 gPXPFXrUH4XX = new ih0(7);
    public static final /* synthetic */ ih0 BRwzKIf41E4i = new ih0(8);
    public static final ih0 XL4ISE6Oc65B = new ih0(9);
    public static final /* synthetic */ ih0 RfyTYNmI9Srp = new ih0(10);
    public static final ih0 EcgxDIVH5in8 = new ih0(11);
    public static final ih0 S9EYkSpbGuxq = new ih0(12);
    public static final ih0 VhhvGxCb8gfr = new ih0(13);
    public static final ih0 S2OOm9zPNm0h = new ih0(14);
    public static final ih0 ZbWwgt3aGe7A = new ih0(15);
    public static final ih0 pnx5pC0XzaCw = new ih0(16);
    public static final ih0 IAToe7bXGz4N = new ih0(17);

    public /* synthetic */ ih0(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    public static final mx2 QrzZRwfaDlRX(PackageInfo packageInfo, mx2... mx2VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            ox2 ox2Var = new ox2(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mx2VarArr.length; i++) {
                if (mx2VarArr[i].equals(ox2Var)) {
                    return mx2VarArr[i];
                }
            }
        }
        return null;
    }

    public static pf2 cpQdD2nAriOS(pl plVar, wi2 wi2Var) {
        pf2 pf2Var = plVar.ngxnMNrpiKat;
        if (pf2Var != null) {
            if (cs0.wdg6QnbFHrFF(pf2Var.dgRBjINgWbAK, wi2Var)) {
                return pf2Var;
            }
            pf2 PxuCJdSBwIXG = pf2Var.PxuCJdSBwIXG(pf2Var.PxuCJdSBwIXG, pf2Var.lS5Rgt96tfkO, pf2Var.TSizfFm2Yiuu, pf2Var.Y1f8riQaR6yg, pf2Var.e9gEMXR7LXtO, pf2Var.a92UlCVFR9N8, pf2Var.RAsUl2FVSrh6, pf2Var.rtx2ld2ELZv4, pf2Var.OPXfSBeufaJ8, pf2Var.wdg6QnbFHrFF, wi2Var, pf2Var.x50lh2ztY7Y5, pf2Var.cpQdD2nAriOS, pf2Var.r3s1LDPKFs1S, pf2Var.QrzZRwfaDlRX, pf2Var.gPXPFXrUH4XX, pf2Var.BRwzKIf41E4i, pf2Var.XL4ISE6Oc65B, pf2Var.RfyTYNmI9Srp, pf2Var.EcgxDIVH5in8, pf2Var.S9EYkSpbGuxq, pf2Var.VhhvGxCb8gfr, pf2Var.S2OOm9zPNm0h, pf2Var.ZbWwgt3aGe7A, pf2Var.pnx5pC0XzaCw, pf2Var.IAToe7bXGz4N, pf2Var.e6tOsSdd2EFb, pf2Var.jyegZNwi31qc, pf2Var.aF05bpZJlKEP, pf2Var.kpCQ9veP6n3I, pf2Var.rZjpSjn4zoMv, pf2Var.BjEWd04qc7Mw, pf2Var.ozEBbv0hFTAB, pf2Var.tmVwIGCQF4zR, pf2Var.J54yh1s3n4Aq, pf2Var.EpkonXwzFgDB, pf2Var.xfACYKDMU6Dj, pf2Var.nLZGh9p8gVSu, pf2Var.ryVscX7ZL4Ux, pf2Var.amuv7NJvPxHu, pf2Var.Pf0ThKz3j5YS, pf2Var.gGoUzNp9JO5I, pf2Var.POWyO8hTM6YC);
            plVar.ngxnMNrpiKat = PxuCJdSBwIXG;
            return PxuCJdSBwIXG;
        }
        long lS5Rgt96tfkO = rl.lS5Rgt96tfkO(plVar, cs0.ryVscX7ZL4Ux);
        long lS5Rgt96tfkO2 = rl.lS5Rgt96tfkO(plVar, cs0.i68hK7ahKtgp);
        ql qlVar = cs0.S9EYkSpbGuxq;
        long lS5Rgt96tfkO3 = rl.lS5Rgt96tfkO(plVar, qlVar);
        float f = cs0.VhhvGxCb8gfr;
        long lS5Rgt96tfkO4 = hl.lS5Rgt96tfkO(lS5Rgt96tfkO3, f);
        long lS5Rgt96tfkO5 = rl.lS5Rgt96tfkO(plVar, cs0.ozEBbv0hFTAB);
        ql qlVar2 = cs0.BRwzKIf41E4i;
        long lS5Rgt96tfkO6 = rl.lS5Rgt96tfkO(plVar, qlVar2);
        long lS5Rgt96tfkO7 = rl.lS5Rgt96tfkO(plVar, qlVar2);
        long lS5Rgt96tfkO8 = rl.lS5Rgt96tfkO(plVar, qlVar2);
        long lS5Rgt96tfkO9 = rl.lS5Rgt96tfkO(plVar, qlVar2);
        long lS5Rgt96tfkO10 = rl.lS5Rgt96tfkO(plVar, cs0.gPXPFXrUH4XX);
        long lS5Rgt96tfkO11 = rl.lS5Rgt96tfkO(plVar, cs0.BjEWd04qc7Mw);
        long lS5Rgt96tfkO12 = rl.lS5Rgt96tfkO(plVar, cs0.nLZGh9p8gVSu);
        long lS5Rgt96tfkO13 = rl.lS5Rgt96tfkO(plVar, cs0.QrzZRwfaDlRX);
        long lS5Rgt96tfkO14 = hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, cs0.RfyTYNmI9Srp), cs0.EcgxDIVH5in8);
        long lS5Rgt96tfkO15 = rl.lS5Rgt96tfkO(plVar, cs0.rZjpSjn4zoMv);
        long lS5Rgt96tfkO16 = rl.lS5Rgt96tfkO(plVar, cs0.Pf0ThKz3j5YS);
        long lS5Rgt96tfkO17 = rl.lS5Rgt96tfkO(plVar, cs0.IXK6ba3ucyzm);
        long lS5Rgt96tfkO18 = hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, cs0.pnx5pC0XzaCw), cs0.IAToe7bXGz4N);
        long lS5Rgt96tfkO19 = rl.lS5Rgt96tfkO(plVar, cs0.J54yh1s3n4Aq);
        long lS5Rgt96tfkO20 = rl.lS5Rgt96tfkO(plVar, cs0.POWyO8hTM6YC);
        long lS5Rgt96tfkO21 = rl.lS5Rgt96tfkO(plVar, cs0.bEKsvqmvPh2y);
        long lS5Rgt96tfkO22 = hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, cs0.aF05bpZJlKEP), cs0.kpCQ9veP6n3I);
        long lS5Rgt96tfkO23 = rl.lS5Rgt96tfkO(plVar, cs0.xfACYKDMU6Dj);
        long lS5Rgt96tfkO24 = rl.lS5Rgt96tfkO(plVar, cs0.amuv7NJvPxHu);
        long lS5Rgt96tfkO25 = rl.lS5Rgt96tfkO(plVar, cs0.nxJAScVArhE9);
        long lS5Rgt96tfkO26 = hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, cs0.S2OOm9zPNm0h), cs0.ZbWwgt3aGe7A);
        long lS5Rgt96tfkO27 = rl.lS5Rgt96tfkO(plVar, cs0.tmVwIGCQF4zR);
        ql qlVar3 = cs0.zf8DYfih6EZu;
        long lS5Rgt96tfkO28 = rl.lS5Rgt96tfkO(plVar, qlVar3);
        long lS5Rgt96tfkO29 = rl.lS5Rgt96tfkO(plVar, qlVar3);
        long lS5Rgt96tfkO30 = hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, qlVar), f);
        long lS5Rgt96tfkO31 = rl.lS5Rgt96tfkO(plVar, qlVar3);
        long lS5Rgt96tfkO32 = rl.lS5Rgt96tfkO(plVar, cs0.gGoUzNp9JO5I);
        long lS5Rgt96tfkO33 = rl.lS5Rgt96tfkO(plVar, cs0.JHNfcAUfKc4G);
        long lS5Rgt96tfkO34 = hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, cs0.e6tOsSdd2EFb), cs0.jyegZNwi31qc);
        long lS5Rgt96tfkO35 = rl.lS5Rgt96tfkO(plVar, cs0.EpkonXwzFgDB);
        ql qlVar4 = cs0.wLFCmsViZrNT;
        long lS5Rgt96tfkO36 = rl.lS5Rgt96tfkO(plVar, qlVar4);
        long lS5Rgt96tfkO37 = rl.lS5Rgt96tfkO(plVar, qlVar4);
        long lS5Rgt96tfkO38 = hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, qlVar4), f);
        long lS5Rgt96tfkO39 = rl.lS5Rgt96tfkO(plVar, qlVar4);
        ql qlVar5 = cs0.xbgXKYA2cIfu;
        pf2 pf2Var2 = new pf2(lS5Rgt96tfkO, lS5Rgt96tfkO2, lS5Rgt96tfkO4, lS5Rgt96tfkO5, lS5Rgt96tfkO6, lS5Rgt96tfkO7, lS5Rgt96tfkO8, lS5Rgt96tfkO9, lS5Rgt96tfkO10, lS5Rgt96tfkO11, wi2Var, lS5Rgt96tfkO12, lS5Rgt96tfkO13, lS5Rgt96tfkO14, lS5Rgt96tfkO15, lS5Rgt96tfkO16, lS5Rgt96tfkO17, lS5Rgt96tfkO18, lS5Rgt96tfkO19, lS5Rgt96tfkO20, lS5Rgt96tfkO21, lS5Rgt96tfkO22, lS5Rgt96tfkO23, lS5Rgt96tfkO24, lS5Rgt96tfkO25, lS5Rgt96tfkO26, lS5Rgt96tfkO27, lS5Rgt96tfkO28, lS5Rgt96tfkO29, lS5Rgt96tfkO30, lS5Rgt96tfkO31, lS5Rgt96tfkO32, lS5Rgt96tfkO33, lS5Rgt96tfkO34, lS5Rgt96tfkO35, lS5Rgt96tfkO36, lS5Rgt96tfkO37, lS5Rgt96tfkO38, lS5Rgt96tfkO39, rl.lS5Rgt96tfkO(plVar, qlVar5), rl.lS5Rgt96tfkO(plVar, qlVar5), hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, qlVar5), f), rl.lS5Rgt96tfkO(plVar, qlVar5));
        plVar.ngxnMNrpiKat = pf2Var2;
        return pf2Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean gPXPFXrUH4XX(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z ? QrzZRwfaDlRX(packageInfo2, px2.PxuCJdSBwIXG) : QrzZRwfaDlRX(packageInfo2, px2.PxuCJdSBwIXG[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z = true;
        if (packageInfo != null) {
            if ((!z ? QrzZRwfaDlRX(packageInfo2, px2.PxuCJdSBwIXG) : QrzZRwfaDlRX(packageInfo2, px2.PxuCJdSBwIXG[0])) == null) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r12 == r13) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OPXfSBeufaJ8(boolean z, e81 e81Var, n61 n61Var, pf2 pf2Var, z42 z42Var, hp hpVar, int i) {
        n61 n61Var2;
        ui uiVar;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-818661242);
        int i2 = i | (tf0Var.RAsUl2FVSrh6(z) ? 4 : 2) | (tf0Var.RAsUl2FVSrh6(false) ? 32 : 16) | (tf0Var.a92UlCVFR9N8(e81Var) ? 256 : 128) | (tf0Var.a92UlCVFR9N8(pf2Var) ? 16384 : 8192) | (tf0Var.a92UlCVFR9N8(z42Var) ? 131072 : 65536);
        int i3 = 1;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (38347923 & i2) != 38347922)) {
            tf0Var.wLFCmsViZrNT();
            if ((i & 1) != 0 && !tf0Var.pnx5pC0XzaCw()) {
                tf0Var.i68hK7ahKtgp();
            }
            tf0Var.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            long j = !z ? pf2Var.RAsUl2FVSrh6 : ((Boolean) mm2.e6tOsSdd2EFb(e81Var, tf0Var, (i2 >> 6) & 14).getValue()).booleanValue() ? pf2Var.e9gEMXR7LXtO : pf2Var.a92UlCVFR9N8;
            w82 KUoIVIumpKat = vi0.KUoIVIumpKat(e71.OPXfSBeufaJ8, tf0Var);
            boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(hl.a92UlCVFR9N8(j));
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!a92UlCVFR9N8) {
                hp.Companion.getClass();
            }
            lm2 lm2Var = new lm2(k1.RfyTYNmI9Srp, new y(7, hl.a92UlCVFR9N8(j)));
            tf0Var.JTxCbbCwomzt(lm2Var);
            nLZGh9p8gVSu = lm2Var;
            lm2 lm2Var2 = (lm2) nLZGh9p8gVSu;
            hl hlVar = new hl(j);
            int i4 = i7.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu2 == jx1Var) {
                nLZGh9p8gVSu2 = sj0.tmVwIGCQF4zR(null);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            d91 d91Var = (d91) nLZGh9p8gVSu2;
            Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu3 == jx1Var) {
                nLZGh9p8gVSu3 = new g7(hlVar, lm2Var2, null);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
            }
            g7 g7Var = (g7) nLZGh9p8gVSu3;
            d91 Pf0ThKz3j5YS = sj0.Pf0ThKz3j5YS(null, tf0Var);
            d91 Pf0ThKz3j5YS2 = sj0.Pf0ThKz3j5YS(KUoIVIumpKat, tf0Var);
            Object nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu4 == jx1Var) {
                nLZGh9p8gVSu4 = mm2.PxuCJdSBwIXG(-1, 6, null);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu4);
            }
            ui uiVar2 = (ui) nLZGh9p8gVSu4;
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(uiVar2) | tf0Var.rtx2ld2ELZv4(hlVar);
            Object nLZGh9p8gVSu5 = tf0Var.nLZGh9p8gVSu();
            if (rtx2ld2ELZv4 || nLZGh9p8gVSu5 == jx1Var) {
                nLZGh9p8gVSu5 = new e6(i3, uiVar2, hlVar);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu5);
            }
            mm2.r3s1LDPKFs1S((ae0) nLZGh9p8gVSu5, tf0Var);
            boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(uiVar2) | tf0Var.rtx2ld2ELZv4(g7Var) | tf0Var.a92UlCVFR9N8(Pf0ThKz3j5YS2) | tf0Var.a92UlCVFR9N8(Pf0ThKz3j5YS);
            Object nLZGh9p8gVSu6 = tf0Var.nLZGh9p8gVSu();
            if (rtx2ld2ELZv42 || nLZGh9p8gVSu6 == jx1Var) {
                h7 h7Var = new h7(uiVar2, g7Var, Pf0ThKz3j5YS2, Pf0ThKz3j5YS, null, 0);
                uiVar = uiVar2;
                tf0Var.JTxCbbCwomzt(h7Var);
                nLZGh9p8gVSu6 = h7Var;
            } else {
                uiVar = uiVar2;
            }
            mm2.wdg6QnbFHrFF(tf0Var, (pe0) nLZGh9p8gVSu6, uiVar);
            Object obj = (i92) d91Var.getValue();
            if (obj == null) {
                obj = g7Var.TSizfFm2Yiuu;
            }
            e9gEMXR7LXtO e9gemxr7lxto = new e9gEMXR7LXtO(29, z42Var, new sf2(new az0(0, 2, i92.class, obj, "value", "getValue()Ljava/lang/Object;")));
            n61Var2 = n61Var;
            xe.PxuCJdSBwIXG(fx1.tmVwIGCQF4zR(n61Var2, e9gemxr7lxto).TSizfFm2Yiuu(new zn0(z, e81Var, pf2Var, z42Var)), tf0Var, 0);
        } else {
            n61Var2 = n61Var;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new ff0(this, z, e81Var, n61Var2, pf2Var, z42Var, i);
        }
    }

    @Override // defpackage.x9, defpackage.z9
    public float PxuCJdSBwIXG() {
        return 0.0f;
    }

    @Override // defpackage.te
    public Rect RAsUl2FVSrh6(Activity activity) {
        switch (this.rtx2ld2ELZv4) {
            case 1:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i = rect.bottom + dimensionPixelSize;
                    if (i == point.y) {
                        rect.bottom = i;
                    } else {
                        int i2 = rect.right + dimensionPixelSize;
                        if (i2 == point.x) {
                            rect.right = i2;
                        }
                    }
                }
                return rect;
            default:
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                    invoke.getClass();
                    return new Rect((Rect) invoke);
                } catch (Exception e) {
                    if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                        throw e;
                    }
                    te.Companion.getClass();
                    Log.w(se.lS5Rgt96tfkO, e);
                    return jx1.wdg6QnbFHrFF.RAsUl2FVSrh6(activity);
                }
        }
    }

    @Override // defpackage.y72
    public boolean TSizfFm2Yiuu(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.pe
    public long a92UlCVFR9N8(of0 of0Var, int i) {
        return ((ji2) of0Var.e9gEMXR7LXtO).rtx2ld2ELZv4(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a8, code lost:
    
        if (r8 == defpackage.fp.lS5Rgt96tfkO) goto L124;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dgRBjINgWbAK(final String str, final pe0 pe0Var, final boolean z, final wr2 wr2Var, final e81 e81Var, final pe0 pe0Var2, final z42 z42Var, final pf2 pf2Var, mi1 mi1Var, pe0 pe0Var3, hp hpVar, final int i) {
        int i2;
        pe0 pe0Var4;
        int i3;
        pe0 pe0Var5;
        final mi1 mi1Var2;
        final pe0 pe0Var6;
        mi1 oi1Var;
        pe0 kpCQ9veP6n3I;
        int i4;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1806980801);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            pe0Var4 = pe0Var;
            i2 |= tf0Var.rtx2ld2ELZv4(pe0Var4) ? 32 : 16;
        } else {
            pe0Var4 = pe0Var;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.RAsUl2FVSrh6(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tf0Var.RAsUl2FVSrh6(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tf0Var.a92UlCVFR9N8(wr2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tf0Var.a92UlCVFR9N8(e81Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tf0Var.RAsUl2FVSrh6(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 = 12582912;
            pe0Var5 = pe0Var2;
            i2 |= tf0Var.rtx2ld2ELZv4(pe0Var5) ? 67108864 : 33554432;
        } else {
            i3 = 12582912;
            pe0Var5 = pe0Var2;
        }
        if ((i & 805306368) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(null) ? 536870912 : 268435456;
        }
        int i5 = 100663296 | (tf0Var.rtx2ld2ELZv4(null) ? 4 : 2) | (tf0Var.rtx2ld2ELZv4(null) ? 32 : 16) | (tf0Var.rtx2ld2ELZv4(null) ? 256 : 128) | (tf0Var.rtx2ld2ELZv4(null) ? 2048 : 1024) | (tf0Var.a92UlCVFR9N8(z42Var) ? 16384 : 8192) | (tf0Var.a92UlCVFR9N8(pf2Var) ? 131072 : 65536) | 13107200;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, ((306783379 & i2) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            tf0Var.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var.pnx5pC0XzaCw()) {
                oi1Var = new oi1(16.0f, 16.0f, 16.0f, 16.0f);
                int i6 = i5 & (-3670017);
                kpCQ9veP6n3I = bs0.kpCQ9veP6n3I(417908150, new rf2(z, e81Var, pf2Var, z42Var), tf0Var);
                i4 = i6;
            } else {
                tf0Var.i68hK7ahKtgp();
                int i7 = i5 & (-3670017);
                kpCQ9veP6n3I = pe0Var3;
                i4 = i7;
                oi1Var = mi1Var;
            }
            tf0Var.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!z2) {
                hp.Companion.getClass();
            }
            v8 v8Var = new v8(str);
            ((rc1) wr2Var).getClass();
            df1.Companion.getClass();
            nLZGh9p8gVSu = new yk2(v8Var, cf1.lS5Rgt96tfkO);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            String str2 = ((yk2) nLZGh9p8gVSu).PxuCJdSBwIXG.OPXfSBeufaJ8;
            jg2 jg2Var = new jg2();
            tf0Var.IXK6ba3ucyzm(-1353131191);
            tf0Var.gPXPFXrUH4XX(false);
            int i8 = i2 >> 9;
            int i9 = i4 << 21;
            pe0 pe0Var7 = pe0Var4;
            mi1Var2 = oi1Var;
            ki0.PxuCJdSBwIXG(str2, pe0Var7, jg2Var, null, pe0Var5, z, e81Var, mi1Var2, pf2Var, kpCQ9veP6n3I, tf0Var, ((i2 << 3) & 896) | 6 | (i8 & 458752) | (i8 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i8 & 7168) | ((i4 >> 9) & 14) | ((i2 >> 6) & 112) | (i2 & 896) | ((i2 >> 3) & 57344) | ((i4 << 3) & 3670016) | i3);
            pe0Var6 = kpCQ9veP6n3I;
        } else {
            tf0Var.i68hK7ahKtgp();
            mi1Var2 = mi1Var;
            pe0Var6 = pe0Var3;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new pe0() { // from class: qf2
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ih0.this.dgRBjINgWbAK(str, pe0Var, z, wr2Var, e81Var, pe0Var2, z42Var, pf2Var, mi1Var2, pe0Var6, (hp) obj, ki0.bEKsvqmvPh2y(i | 1));
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    @Override // defpackage.jy
    public float e9gEMXR7LXtO(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.hu2
    public cu2 lS5Rgt96tfkO(ContextWrapper contextWrapper, jy jyVar) {
        jyVar.getClass();
        Context context = contextWrapper;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof Activity) || (context instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
            context.getClass();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            te.Companion.getClass();
            int i = Build.VERSION.SDK_INT;
            return new cu2(new re((i >= 30 ? ue.rtx2ld2ELZv4 : i >= 29 ? dgRBjINgWbAK : i >= 28 ? jx1.wdg6QnbFHrFF : wdg6QnbFHrFF).RAsUl2FVSrh6(activity)), jyVar.e9gEMXR7LXtO(activity));
        }
        if (!(context instanceof InputMethodService) && !(context instanceof Application)) {
            u9.XL4ISE6Oc65B("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new cu2(new Rect(0, 0, point.x, point.y), jyVar.e9gEMXR7LXtO(contextWrapper));
    }

    public Signature[] r3s1LDPKFs1S(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.x9
    public void rtx2ld2ELZv4(hy hyVar, int i, int[] iArr, cw0 cw0Var, int[] iArr2) {
        if (cw0Var == cw0.rtx2ld2ELZv4) {
            f2.J54yh1s3n4Aq(i, iArr, iArr2, false);
        } else {
            f2.J54yh1s3n4Aq(i, iArr, iArr2, true);
        }
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 6:
                return "{}";
            case 11:
                return "NeverEqualPolicy";
            case 21:
                return "Arrangement#Center";
            case 24:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.z9
    public void wdg6QnbFHrFF(int i, l51 l51Var, int[] iArr, int[] iArr2) {
        f2.J54yh1s3n4Aq(i, iArr, iArr2, false);
    }

    public long x50lh2ztY7Y5(long j, long j2) {
        float OPXfSBeufaJ82 = bs0.OPXfSBeufaJ8(j, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(OPXfSBeufaJ82) << 32) | (Float.floatToRawIntBits(OPXfSBeufaJ82) & 4294967295L);
        a02 a02Var = b02.Companion;
        return floatToRawIntBits;
    }

    @Override // defpackage.my0
    public void Y1f8riQaR6yg() {
    }

    @Override // defpackage.my0
    public void cancel() {
    }
}
