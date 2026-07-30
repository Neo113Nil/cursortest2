package defpackage;

import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.DragEvent;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class cs0 {
    public static final ql BRwzKIf41E4i;
    public static final ql BjEWd04qc7Mw;
    public static final ib0 D0aTLcX6Uhyo;
    public static final float EcgxDIVH5in8;
    public static final ql EpkonXwzFgDB;
    public static final float IAToe7bXGz4N;
    public static final ql IXK6ba3ucyzm;
    public static final ql J54yh1s3n4Aq;
    public static final ql JHNfcAUfKc4G;
    public static final Object JTxCbbCwomzt;
    public static m9 KUoIVIumpKat;
    public static final ql POWyO8hTM6YC;
    public static final ql Pf0ThKz3j5YS;
    public static final Object PsecLrZVVK61;
    public static final ql QrzZRwfaDlRX;
    public static final ql RfyTYNmI9Srp;
    public static final ql S2OOm9zPNm0h;
    public static final ql S9EYkSpbGuxq;
    public static final float VhhvGxCb8gfr;
    public static final /* synthetic */ int VzNxmvWisHL1 = 0;
    public static final b52 XL4ISE6Oc65B;
    public static final float ZbWwgt3aGe7A;
    public static final ql aF05bpZJlKEP;
    public static final ql amuv7NJvPxHu;
    public static final ql bEKsvqmvPh2y;
    public static final ql e6tOsSdd2EFb;
    public static final ql gGoUzNp9JO5I;
    public static final ql gPXPFXrUH4XX;
    public static final ql i68hK7ahKtgp;
    public static final g42 jJwa0q7P5wHq;
    public static final float jyegZNwi31qc;
    public static final float kpCQ9veP6n3I;
    public static final ql nLZGh9p8gVSu;
    public static final ib0 ngxnMNrpiKat;
    public static final ql nxJAScVArhE9;
    public static final ql ozEBbv0hFTAB;
    public static final ql pnx5pC0XzaCw;
    public static final StackTraceElement[] qudtW7lwm99e;
    public static final ql rZjpSjn4zoMv;
    public static final ql ryVscX7ZL4Ux;
    public static final ql tmVwIGCQF4zR;
    public static final ql wLFCmsViZrNT;
    public static final ql xbgXKYA2cIfu;
    public static final ql xfACYKDMU6Dj;
    public static final m9 yQRudnv4La6p;
    public static final ql zf8DYfih6EZu;
    public static final k8 PxuCJdSBwIXG = new k8(Float.POSITIVE_INFINITY);
    public static final l8 lS5Rgt96tfkO = new l8(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final m8 TSizfFm2Yiuu = new m8(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final n8 Y1f8riQaR6yg = new n8(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final k8 e9gEMXR7LXtO = new k8(Float.NEGATIVE_INFINITY);
    public static final l8 a92UlCVFR9N8 = new l8(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final m8 RAsUl2FVSrh6 = new m8(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final n8 rtx2ld2ELZv4 = new n8(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[][] OPXfSBeufaJ8 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] wdg6QnbFHrFF = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] dgRBjINgWbAK = {95.047f, 100.0f, 108.883f};
    public static final float[][] x50lh2ztY7Y5 = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final on cpQdD2nAriOS = new on(-1022543535, false, new HGgCfDnf0ga9(9));
    public static final Class[] r3s1LDPKFs1S = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    static {
        ql qlVar = ql.dgRBjINgWbAK;
        QrzZRwfaDlRX = qlVar;
        ql qlVar2 = ql.x50lh2ztY7Y5;
        gPXPFXrUH4XX = qlVar2;
        BRwzKIf41E4i = ql.r3s1LDPKFs1S;
        XL4ISE6Oc65B = b52.rtx2ld2ELZv4;
        ql qlVar3 = ql.wdg6QnbFHrFF;
        RfyTYNmI9Srp = qlVar3;
        EcgxDIVH5in8 = 0.38f;
        S9EYkSpbGuxq = qlVar3;
        VhhvGxCb8gfr = 0.38f;
        S2OOm9zPNm0h = qlVar3;
        ZbWwgt3aGe7A = 0.38f;
        pnx5pC0XzaCw = qlVar3;
        IAToe7bXGz4N = 0.38f;
        e6tOsSdd2EFb = qlVar3;
        jyegZNwi31qc = 0.38f;
        aF05bpZJlKEP = qlVar3;
        kpCQ9veP6n3I = 0.38f;
        ql qlVar4 = ql.rtx2ld2ELZv4;
        rZjpSjn4zoMv = qlVar4;
        BjEWd04qc7Mw = qlVar4;
        ozEBbv0hFTAB = qlVar3;
        tmVwIGCQF4zR = qlVar4;
        J54yh1s3n4Aq = qlVar;
        EpkonXwzFgDB = qlVar4;
        xfACYKDMU6Dj = qlVar4;
        nLZGh9p8gVSu = qlVar2;
        ryVscX7ZL4Ux = qlVar3;
        amuv7NJvPxHu = qlVar2;
        Pf0ThKz3j5YS = qlVar;
        gGoUzNp9JO5I = qlVar;
        POWyO8hTM6YC = qlVar;
        i68hK7ahKtgp = qlVar3;
        zf8DYfih6EZu = qlVar;
        wLFCmsViZrNT = qlVar;
        xbgXKYA2cIfu = qlVar;
        nxJAScVArhE9 = qlVar;
        IXK6ba3ucyzm = qlVar;
        JHNfcAUfKc4G = qlVar;
        bEKsvqmvPh2y = qlVar;
        ngxnMNrpiKat = new ib0(4);
        Object obj = null;
        yQRudnv4La6p = new m9(obj, obj, obj, 12);
        qudtW7lwm99e = new StackTraceElement[0];
        jJwa0q7P5wHq = new g42();
        D0aTLcX6Uhyo = new ib0(16);
        PsecLrZVVK61 = new Object();
        JTxCbbCwomzt = new Object();
    }

    public static int BRwzKIf41E4i(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void BjEWd04qc7Mw(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final String[] EcgxDIVH5in8(ks ksVar) {
        ksVar.getClass();
        return (String[]) ((q2) ksVar).PxuCJdSBwIXG.toArray(new String[0]);
    }

    public static final String EpkonXwzFgDB(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = f2.PxuCJdSBwIXG;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        e6tOsSdd2EFb.Companion.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(o0.OPXfSBeufaJ8(i2, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        u9.XL4ISE6Oc65B(o0.OPXfSBeufaJ8(i2, "startIndex: ", " > endIndex: 8"));
        return null;
    }

    public static final long IAToe7bXGz4N(i2 i2Var) {
        DragEvent dragEvent = (DragEvent) i2Var.OPXfSBeufaJ8;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final BlendMode J54yh1s3n4Aq(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        sd.Companion.getClass();
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static boolean OPXfSBeufaJ8(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PxuCJdSBwIXG(n61 n61Var, s sVar, on onVar, hp hpVar, int i) {
        s sVar2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(380139498);
        int i2 = i | 432;
        int i3 = 0;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
            s.Companion.getClass();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            pd pdVar = r.lS5Rgt96tfkO;
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(pdVar, false);
            boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(Y1f8riQaR6yg2);
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            if (!a92UlCVFR9N82) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu2 = new bf(i3, Y1f8riQaR6yg2, onVar);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            a92UlCVFR9N8(n61Var, (pe0) nLZGh9p8gVSu2, tf0Var, 6);
            sVar2 = pdVar;
        } else {
            tf0Var.i68hK7ahKtgp();
            sVar2 = sVar;
        }
        s sVar3 = sVar2;
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new n6(n61Var, sVar3, onVar, i, 1);
        }
    }

    public static final void QrzZRwfaDlRX(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                f2.RAsUl2FVSrh6(th, th2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
    
        if (r1 == defpackage.fp.lS5Rgt96tfkO) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RAsUl2FVSrh6(gb2 gb2Var, n61 n61Var, pe0 pe0Var, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-511989831);
        if ((i & 6) == 0) {
            i2 = (tf0Var.rtx2ld2ELZv4(gb2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.a92UlCVFR9N8(n61Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(pe0Var) ? 256 : 128;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            rf0 rZjpSjn4zoMv2 = rZjpSjn4zoMv(tf0Var);
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var, n61Var);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            vw0.Companion.getClass();
            dq dqVar = dq.XL4ISE6Oc65B;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, gb2Var.TSizfFm2Yiuu, gb2Var);
            th0.tmVwIGCQF4zR(tf0Var, gb2Var.Y1f8riQaR6yg, rZjpSjn4zoMv2);
            th0.tmVwIGCQF4zR(tf0Var, gb2Var.e9gEMXR7LXtO, pe0Var);
            yo.Companion.getClass();
            th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
            th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj2);
            th0.tmVwIGCQF4zR(tf0Var, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
            tf0Var.gPXPFXrUH4XX(true);
            if (tf0Var.e6tOsSdd2EFb()) {
                tf0Var.IXK6ba3ucyzm(-1259187287);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-1259245908);
                boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(gb2Var);
                Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                if (!rtx2ld2ELZv42) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu2 = new y4(13, gb2Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                mm2.r3s1LDPKFs1S((ae0) nLZGh9p8gVSu2, tf0Var);
                tf0Var.gPXPFXrUH4XX(false);
            }
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new db2(gb2Var, n61Var, pe0Var, i);
        }
    }

    public static final int RfyTYNmI9Srp(xc0 xc0Var, int i) {
        xc0.Companion.getClass();
        boolean z = xc0Var.compareTo(xc0.dgRBjINgWbAK) >= 0;
        rc0.Companion.getClass();
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static li S2OOm9zPNm0h(pl plVar) {
        li liVar = plVar.JHNfcAUfKc4G;
        if (liVar != null) {
            return liVar;
        }
        ql qlVar = bs0.OPXfSBeufaJ8;
        li liVar2 = new li(rl.lS5Rgt96tfkO(plVar, qlVar), rl.PxuCJdSBwIXG(plVar, rl.lS5Rgt96tfkO(plVar, qlVar)), mm2.jyegZNwi31qc(hl.lS5Rgt96tfkO(rl.lS5Rgt96tfkO(plVar, bs0.wdg6QnbFHrFF), bs0.dgRBjINgWbAK), rl.lS5Rgt96tfkO(plVar, qlVar)), hl.lS5Rgt96tfkO(rl.PxuCJdSBwIXG(plVar, rl.lS5Rgt96tfkO(plVar, qlVar)), 0.38f));
        plVar.JHNfcAUfKc4G = liVar2;
        return liVar2;
    }

    public static final int S9EYkSpbGuxq(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        hpVar.getClass();
        return Long.hashCode(((tf0) hpVar).wLFCmsViZrNT);
    }

    public static final q2 TSizfFm2Yiuu(String str) {
        Set singleton = Collections.singleton(str);
        singleton.getClass();
        return new q2(singleton);
    }

    public static final long VhhvGxCb8gfr(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        return ((tf0) hpVar).wLFCmsViZrNT;
    }

    public static final Object XL4ISE6Oc65B(pe0 pe0Var, bt btVar) {
        f02 f02Var = new f02(btVar, btVar.e9gEMXR7LXtO());
        return sj0.i68hK7ahKtgp(f02Var, f02Var, pe0Var);
    }

    public static final at Y1f8riQaR6yg(hu huVar) {
        if (huVar.S2OOm9zPNm0h(ih0.BRwzKIf41E4i) == null) {
            huVar = huVar.RfyTYNmI9Srp(new zs0(null));
        }
        return new at(huVar);
    }

    public static Set ZbWwgt3aGe7A() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final void a92UlCVFR9N8(n61 n61Var, pe0 pe0Var, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1298353104);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(pe0Var) ? 32 : 16;
        }
        int i3 = 1;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu2 == fp.lS5Rgt96tfkO) {
                nLZGh9p8gVSu2 = new gb2(jx1.EcgxDIVH5in8);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            RAsUl2FVSrh6((gb2) nLZGh9p8gVSu2, n61Var, pe0Var, tf0Var, (i2 << 3) & 1008);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new d3(n61Var, pe0Var, i, i3);
        }
    }

    public static final n61 aF05bpZJlKEP(n61 n61Var, Object obj) {
        return n61Var.TSizfFm2Yiuu(new fw0(obj));
    }

    public static final void cpQdD2nAriOS(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean dgRBjINgWbAK(Object obj) {
        if (obj instanceof w72) {
            w72 w72Var = (w72) obj;
            if (w72Var.e9gEMXR7LXtO() == ih0.EcgxDIVH5in8 || w72Var.e9gEMXR7LXtO() == jx1.S2OOm9zPNm0h || w72Var.e9gEMXR7LXtO() == jx1.S9EYkSpbGuxq) {
                Object value = w72Var.getValue();
                if (value == null) {
                    return true;
                }
                return dgRBjINgWbAK(value);
            }
        } else if (!(obj instanceof xe0) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (r3s1LDPKFs1S[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int e6tOsSdd2EFb(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = dgRBjINgWbAK;
        return zl.PxuCJdSBwIXG(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r12 == r13) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e9gEMXR7LXtO(lb1 lb1Var, wr1 wr1Var, hp hpVar, int i) {
        tf0 tf0Var;
        int i2;
        wr1 wr1Var2;
        wr1 wr1Var3;
        Object a4Var;
        lb1Var.getClass();
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(127187177);
        int i3 = 4;
        int i4 = (tf0Var2.rtx2ld2ELZv4(lb1Var) ? 4 : 2) | i | 16;
        int i5 = 0;
        if (tf0Var2.Pf0ThKz3j5YS(i4 & 1, (i4 & 19) != 18)) {
            tf0Var2.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var2.pnx5pC0XzaCw()) {
                pr2 PxuCJdSBwIXG2 = l21.PxuCJdSBwIXG(tf0Var2);
                if (PxuCJdSBwIXG2 == null) {
                    u9.rtx2ld2ELZv4("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                wr1Var3 = (wr1) th0.Pf0ThKz3j5YS(bu1.PxuCJdSBwIXG(wr1.class), PxuCJdSBwIXG2, sj0.nLZGh9p8gVSu(ki0.xfACYKDMU6Dj(PxuCJdSBwIXG2), tf0Var2), ki0.EpkonXwzFgDB(PxuCJdSBwIXG2), tf0Var2);
            } else {
                tf0Var2.i68hK7ahKtgp();
                wr1Var3 = wr1Var;
            }
            tf0Var2.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            d91 QrzZRwfaDlRX2 = sj0.QrzZRwfaDlRX(wr1Var3.rtx2ld2ELZv4, tf0Var2);
            d91 QrzZRwfaDlRX3 = sj0.QrzZRwfaDlRX(wr1Var3.Y1f8riQaR6yg, tf0Var2);
            d91 QrzZRwfaDlRX4 = sj0.QrzZRwfaDlRX(wr1Var3.a92UlCVFR9N8, tf0Var2);
            boolean rtx2ld2ELZv42 = tf0Var2.rtx2ld2ELZv4(wr1Var3);
            Object nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!rtx2ld2ELZv42) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu2 = new km0(wr1Var3, null, i3);
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu2);
            mm2.wdg6QnbFHrFF(tf0Var2, (pe0) nLZGh9p8gVSu2, no2.PxuCJdSBwIXG);
            k61 k61Var = n61.Companion;
            w70 w70Var = c62.TSizfFm2Yiuu;
            k61Var.getClass();
            n61 r3s1LDPKFs1S2 = hq0.r3s1LDPKFs1S(w70Var, ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S, b51.x50lh2ztY7Y5);
            ls2 ls2Var = ms2.Companion;
            n61 kpCQ9veP6n3I2 = f2.kpCQ9veP6n3I(f2.rZjpSjn4zoMv(r3s1LDPKFs1S2, 0.0f, ki0.QrzZRwfaDlRX(ni0.IAToe7bXGz4N(tf0Var2), tf0Var2).Y1f8riQaR6yg() + 10.0f, 0.0f, ki0.QrzZRwfaDlRX(ni0.ZbWwgt3aGe7A(tf0Var2), tf0Var2).TSizfFm2Yiuu() + 2.0f, 5), 16.0f, 0.0f, 2);
            y9 y9Var = new y9(12.0f, new u9(i5));
            boolean rtx2ld2ELZv43 = tf0Var2.rtx2ld2ELZv4(lb1Var) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX3) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX4) | tf0Var2.rtx2ld2ELZv4(wr1Var3) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX2);
            Object nLZGh9p8gVSu3 = tf0Var2.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv43) {
                hp.Companion.getClass();
                if (nLZGh9p8gVSu3 != jx1Var) {
                    wr1Var2 = wr1Var3;
                    a4Var = nLZGh9p8gVSu3;
                    le0 le0Var = (le0) a4Var;
                    i2 = 16;
                    tf0Var = tf0Var2;
                    ni0.PxuCJdSBwIXG(kpCQ9veP6n3I2, null, null, y9Var, null, null, false, null, le0Var, tf0Var, 24576);
                }
            }
            wr1Var2 = wr1Var3;
            a4Var = new a4(lb1Var, QrzZRwfaDlRX3, wr1Var2, QrzZRwfaDlRX4, QrzZRwfaDlRX2, 4);
            tf0Var2.JTxCbbCwomzt(a4Var);
            le0 le0Var2 = (le0) a4Var;
            i2 = 16;
            tf0Var = tf0Var2;
            ni0.PxuCJdSBwIXG(kpCQ9veP6n3I2, null, null, y9Var, null, null, false, null, le0Var2, tf0Var, 24576);
        } else {
            tf0Var = tf0Var2;
            i2 = 16;
            tf0Var.i68hK7ahKtgp();
            wr1Var2 = wr1Var;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new bf(i, i2, lb1Var, wr1Var2);
        }
    }

    public static int gPXPFXrUH4XX(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static final boolean jyegZNwi31qc(ru ruVar) {
        xs0 xs0Var = (xs0) ruVar.cpQdD2nAriOS().S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
        if (xs0Var != null) {
            return xs0Var.lS5Rgt96tfkO();
        }
        return true;
    }

    public static float kpCQ9veP6n3I(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void lS5Rgt96tfkO(final String str, final boolean z, final ae0 ae0Var, final n61 n61Var, hp hpVar, final int i) {
        int i2;
        long lS5Rgt96tfkO2;
        long lS5Rgt96tfkO3;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1084642290);
        if ((i & 6) == 0) {
            i2 = i | (tf0Var.a92UlCVFR9N8(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (tf0Var.RAsUl2FVSrh6(z) ? 32 : 16) | (tf0Var.rtx2ld2ELZv4(ae0Var) ? 256 : 128) | (tf0Var.a92UlCVFR9N8(n61Var) ? 2048 : 1024);
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 1171) != 1170)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 BRwzKIf41E4i2 = hq0.BRwzKIf41E4i(n61Var, n9.PxuCJdSBwIXG);
            if (z) {
                tf0Var.IXK6ba3ucyzm(1539737895);
                lS5Rgt96tfkO2 = ((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG;
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(1539816883);
                lS5Rgt96tfkO2 = hl.lS5Rgt96tfkO(((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG, 0.08f);
                tf0Var.gPXPFXrUH4XX(false);
            }
            n61 aF05bpZJlKEP2 = f2.aF05bpZJlKEP(zv.kpCQ9veP6n3I(1, tf0Var, ae0Var, hq0.r3s1LDPKFs1S(BRwzKIf41E4i2, lS5Rgt96tfkO2, b51.x50lh2ztY7Y5), false), 12.0f, 10.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.a92UlCVFR9N8, false);
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var, aF05bpZJlKEP2);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, Y1f8riQaR6yg2);
            th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
            th0.tmVwIGCQF4zR(tf0Var, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
            th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj2);
            dj2 dj2Var = ((en2) tf0Var.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).OPXfSBeufaJ8;
            xc0.Companion.getClass();
            dj2 PxuCJdSBwIXG2 = dj2.PxuCJdSBwIXG(dj2Var, 0L, 0L, z ? xc0.r3s1LDPKFs1S : xc0.x50lh2ztY7Y5, null, 0L, 0L, null, null, 16777211);
            if (z) {
                tf0Var.IXK6ba3ucyzm(-1800791353);
                lS5Rgt96tfkO3 = ((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).a92UlCVFR9N8;
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-1800718410);
                lS5Rgt96tfkO3 = hl.lS5Rgt96tfkO(((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG, 0.5f);
                tf0Var.gPXPFXrUH4XX(false);
            }
            he2.Companion.getClass();
            gi2.lS5Rgt96tfkO(str, null, lS5Rgt96tfkO3, 0L, 0L, new he2(3), 0L, 0, false, 0, 0, PxuCJdSBwIXG2, tf0Var, i3 & 14, 0, 130042);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new pe0() { // from class: yr1
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cs0.lS5Rgt96tfkO(str, z, ae0Var, n61Var, (hp) obj, ki0.bEKsvqmvPh2y(i | 1));
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final void nLZGh9p8gVSu(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object ozEBbv0hFTAB(int i, Object obj, mb0 mb0Var, xc0 xc0Var, int i2) {
        Object[] objArr;
        Object[] objArr2;
        Typeface create;
        Object[] objArr3;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i3 = 0;
        z = false;
        if ((i & 1) != 0 && !wdg6QnbFHrFF(((jv1) mb0Var).PxuCJdSBwIXG, xc0Var)) {
            xc0.Companion.getClass();
            xc0 xc0Var2 = xc0.dgRBjINgWbAK;
            if (xc0Var.compareTo(xc0Var2) >= 0 && gPXPFXrUH4XX(((jv1) mb0Var).PxuCJdSBwIXG.rtx2ld2ELZv4, xc0Var2.rtx2ld2ELZv4) < 0) {
                objArr = true;
                if ((i & 2) != 0) {
                    ((jv1) mb0Var).getClass();
                    if (i2 != 0) {
                        objArr2 = true;
                        if (objArr2 == true && objArr != true) {
                            return obj;
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            int i4 = objArr != false ? xc0Var.rtx2ld2ELZv4 : ((jv1) mb0Var).PxuCJdSBwIXG.rtx2ld2ELZv4;
                            if (objArr2 == true) {
                                rc0.Companion.getClass();
                                if (i2 == 1) {
                                    z = true;
                                }
                            } else {
                                ((jv1) mb0Var).getClass();
                                rc0.Companion.getClass();
                            }
                            create = Typeface.create((Typeface) obj, i4, z);
                            return create;
                        }
                        if (objArr2 != false) {
                            rc0.Companion.getClass();
                            if (i2 == 1) {
                                objArr3 = true;
                                if (objArr3 != true && objArr == true) {
                                    i3 = 3;
                                } else if (objArr != true) {
                                    i3 = 1;
                                } else if (objArr3 != false) {
                                    i3 = 2;
                                }
                                return Typeface.create((Typeface) obj, i3);
                            }
                        }
                        objArr3 = false;
                        if (objArr3 != true) {
                        }
                        if (objArr != true) {
                        }
                        return Typeface.create((Typeface) obj, i3);
                    }
                }
                objArr2 = false;
                if (objArr2 == true) {
                }
                if (Build.VERSION.SDK_INT >= 28) {
                }
            }
        }
        objArr = false;
        if ((i & 2) != 0) {
        }
        objArr2 = false;
        if (objArr2 == true) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
        }
    }

    public static final Object pnx5pC0XzaCw(e51 e51Var) {
        Object wdg6QnbFHrFF2 = e51Var.wdg6QnbFHrFF();
        gw0 gw0Var = wdg6QnbFHrFF2 instanceof gw0 ? (gw0) wdg6QnbFHrFF2 : null;
        if (gw0Var != null) {
            return gw0Var.VhhvGxCb8gfr;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r3s1LDPKFs1S(hy1 hy1Var, Throwable th) {
        boolean isTerminated;
        if (hy1Var != 0) {
            if (th != null) {
                try {
                    o0.VhhvGxCb8gfr(hy1Var);
                    return;
                } catch (Throwable th2) {
                    f2.RAsUl2FVSrh6(th, th2);
                    return;
                }
            }
            if (hy1Var instanceof AutoCloseable) {
                hy1Var.close();
                return;
            }
            if (!(hy1Var instanceof ExecutorService)) {
                if (hy1Var instanceof TypedArray) {
                    ((TypedArray) hy1Var).recycle();
                    return;
                } else if (hy1Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) hy1Var).release();
                    return;
                } else {
                    if (!(hy1Var instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) hy1Var).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) hy1Var;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final rf0 rZjpSjn4zoMv(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.getClass();
        tf0Var.xbgXKYA2cIfu(206, mp.e9gEMXR7LXtO);
        if (tf0Var.zf8DYfih6EZu) {
            e72.IAToe7bXGz4N(tf0Var.J54yh1s3n4Aq);
        }
        Object kpCQ9veP6n3I2 = tf0Var.kpCQ9veP6n3I();
        yf0 yf0Var = kpCQ9veP6n3I2 instanceof yf0 ? (yf0) kpCQ9veP6n3I2 : null;
        if (yf0Var == null) {
            yf0Var = new cw1(new qf0(new rf0(tf0Var, tf0Var.wLFCmsViZrNT, tf0Var.BRwzKIf41E4i, tf0Var.aF05bpZJlKEP, tf0Var.rtx2ld2ELZv4.e6tOsSdd2EFb)), -1);
            tf0Var.VzNxmvWisHL1(yf0Var);
        }
        ku1 ku1Var = yf0Var.PxuCJdSBwIXG;
        ku1Var.getClass();
        rf0 rf0Var = ((qf0) ku1Var).rtx2ld2ELZv4;
        rf0Var.a92UlCVFR9N8.setValue(tf0Var.x50lh2ztY7Y5());
        tf0Var.gPXPFXrUH4XX(false);
        return rf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rtx2ld2ELZv4(vj2 vj2Var, lo loVar, Throwable th, ct ctVar) {
        c90 c90Var;
        int i;
        try {
            if (ctVar instanceof c90) {
                c90Var = (c90) ctVar;
                int i2 = c90Var.cpQdD2nAriOS;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c90Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                    Object obj = c90Var.x50lh2ztY7Y5;
                    i = c90Var.cpQdD2nAriOS;
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        c90Var.dgRBjINgWbAK = th;
                        c90Var.cpQdD2nAriOS = 1;
                        loVar.a92UlCVFR9N8(vj2Var, th, c90Var);
                        su suVar = su.rtx2ld2ELZv4;
                        if (no2Var == suVar) {
                            return suVar;
                        }
                    } else {
                        if (i != 1) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = c90Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    return no2Var;
                }
            }
            if (i != 0) {
            }
            return no2Var;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                f2.RAsUl2FVSrh6(th2, th);
            }
            throw th2;
        }
        c90Var = new c90(ctVar);
        Object obj2 = c90Var.x50lh2ztY7Y5;
        i = c90Var.cpQdD2nAriOS;
        no2 no2Var2 = no2.PxuCJdSBwIXG;
    }

    public static float ryVscX7ZL4Ux() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void tmVwIGCQF4zR(String str) {
        tm tmVar = new tm(o0.x50lh2ztY7Y5("lateinit property ", str, " has not been initialized"));
        BjEWd04qc7Mw(tmVar, cs0.class.getName());
        throw tmVar;
    }

    public static boolean wdg6QnbFHrFF(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void x50lh2ztY7Y5(ru ruVar, q61 q61Var) {
        xs0 xs0Var = (xs0) ruVar.cpQdD2nAriOS().S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
        if (xs0Var != null) {
            xs0Var.a92UlCVFR9N8(q61Var);
        } else {
            u9.BRwzKIf41E4i(ruVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final PorterDuff.Mode xfACYKDMU6Dj(int i) {
        rd rdVar = sd.Companion;
        rdVar.getClass();
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        rdVar.getClass();
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        rdVar.getClass();
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        rdVar.getClass();
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        rdVar.getClass();
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        rdVar.getClass();
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        rdVar.getClass();
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        rdVar.getClass();
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        rdVar.getClass();
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        rdVar.getClass();
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        rdVar.getClass();
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        rdVar.getClass();
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        rdVar.getClass();
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        rdVar.getClass();
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        rdVar.getClass();
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        rdVar.getClass();
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        rdVar.getClass();
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        rdVar.getClass();
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
