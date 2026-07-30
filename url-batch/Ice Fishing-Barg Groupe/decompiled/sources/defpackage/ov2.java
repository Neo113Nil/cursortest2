package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.ice.fishing.grenza.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ov2 {
    public static final byte[] cpQdD2nAriOS;
    public static final cr1 dgRBjINgWbAK;
    public static final b5 wdg6QnbFHrFF;
    public static final Object x50lh2ztY7Y5;
    public final /* synthetic */ int PxuCJdSBwIXG;
    public static final v9 lS5Rgt96tfkO = new v9(0);
    public static final v9 TSizfFm2Yiuu = new v9(1);
    public static final on Y1f8riQaR6yg = new on(-1571120048, false, new tn());
    public static final on e9gEMXR7LXtO = new on(-1455401925, false, new HGgCfDnf0ga9(2));
    public static final vv a92UlCVFR9N8 = new vv();
    public static final mn0 RAsUl2FVSrh6 = new mn0(false);
    public static final k5 rtx2ld2ELZv4 = new k5(5);
    public static final b5 OPXfSBeufaJ8 = new b5(1000);

    static {
        new b5(1007);
        wdg6QnbFHrFF = new b5(1008);
        new b5(1002);
        dgRBjINgWbAK = new cr1(5, new jm(13, (byte) 0), new mq1(4));
        x50lh2ztY7Y5 = new Object();
        cpQdD2nAriOS = new byte[0];
    }

    public /* synthetic */ ov2(int i) {
        this.PxuCJdSBwIXG = i;
    }

    public static final boolean BRwzKIf41E4i(o92 o92Var, int i, tmVwIGCQF4zR tmvwigcqf4zr, boolean z) {
        boolean z2;
        synchronized (x50lh2ztY7Y5) {
            try {
                int i2 = o92Var.Y1f8riQaR6yg;
                if (i2 == i) {
                    o92Var.TSizfFm2Yiuu = tmvwigcqf4zr;
                    z2 = true;
                    if (z) {
                        o92Var.e9gEMXR7LXtO++;
                    }
                    o92Var.Y1f8riQaR6yg = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final int BjEWd04qc7Mw(d82 d82Var) {
        o92 o92Var = d82Var.rtx2ld2ELZv4;
        o92Var.getClass();
        return ((o92) s72.RAsUl2FVSrh6(o92Var)).e9gEMXR7LXtO;
    }

    public static final float[] EcgxDIVH5in8(float[] fArr, float[] fArr2, float[] fArr3) {
        ryVscX7ZL4Ux(fArr, fArr2);
        ryVscX7ZL4Ux(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] ozEBbv0hFTAB = ozEBbv0hFTAB(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return nLZGh9p8gVSu(ozEBbv0hFTAB, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final n61 EpkonXwzFgDB(hp hpVar, n61 n61Var) {
        if (n61Var.lS5Rgt96tfkO(k1.VhhvGxCb8gfr)) {
            return n61Var;
        }
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.getClass();
        hi0.Companion.getClass();
        tf0Var.zf8DYfih6EZu(1219399079, 0, null, null);
        n61 n61Var2 = (n61) n61Var.PxuCJdSBwIXG(new XL4ISE6Oc65B(4, hpVar), n61.Companion);
        ((tf0) hpVar).gPXPFXrUH4XX(false);
        return n61Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void IAToe7bXGz4N(o2 o2Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        f32 f32Var;
        d32 d32Var;
        le0 le0Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse gPXPFXrUH4XX = b2.gPXPFXrUH4XX(longSparseArray.get(keyAt));
            if (gPXPFXrUH4XX != null && value != null && text != null && (f32Var = (f32) o2Var.Y1f8riQaR6yg().lS5Rgt96tfkO((int) keyAt)) != null && (d32Var = f32Var.PxuCJdSBwIXG) != null) {
                Object RAsUl2FVSrh62 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.x50lh2ztY7Y5);
                if (RAsUl2FVSrh62 == null) {
                    RAsUl2FVSrh62 = null;
                }
                nxJAScVArhE9 nxjascvarhe9 = (nxJAScVArhE9) RAsUl2FVSrh62;
                if (nxjascvarhe9 != null && (le0Var = (le0) nxjascvarhe9.lS5Rgt96tfkO) != null) {
                }
            }
        }
    }

    public static boolean J54yh1s3n4Aq(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final j4 OPXfSBeufaJ8() {
        return new j4(new Paint(7));
    }

    public static final void POWyO8hTM6YC(bi biVar, bt btVar, boolean z) {
        Object S2OOm9zPNm0h = biVar.S2OOm9zPNm0h();
        Throwable a92UlCVFR9N82 = biVar.a92UlCVFR9N8(S2OOm9zPNm0h);
        Object uv1Var = a92UlCVFR9N82 != null ? new uv1(a92UlCVFR9N82) : biVar.rtx2ld2ELZv4(S2OOm9zPNm0h);
        if (!z) {
            btVar.RAsUl2FVSrh6(uv1Var);
            return;
        }
        btVar.getClass();
        e00 e00Var = (e00) btVar;
        ct ctVar = e00Var.x50lh2ztY7Y5;
        Object obj = e00Var.r3s1LDPKFs1S;
        hu e9gEMXR7LXtO2 = ctVar.e9gEMXR7LXtO();
        Object JHNfcAUfKc4G = hq0.JHNfcAUfKc4G(e9gEMXR7LXtO2, obj);
        ko2 JHNfcAUfKc4G2 = JHNfcAUfKc4G != hq0.XL4ISE6Oc65B ? zv.JHNfcAUfKc4G(ctVar, e9gEMXR7LXtO2, JHNfcAUfKc4G) : null;
        try {
            ctVar.RAsUl2FVSrh6(uv1Var);
            if (JHNfcAUfKc4G2 == null || JHNfcAUfKc4G2.iSxsmagYqzHM()) {
                hq0.Pf0ThKz3j5YS(e9gEMXR7LXtO2, JHNfcAUfKc4G);
            }
        } catch (Throwable th) {
            if (JHNfcAUfKc4G2 == null || JHNfcAUfKc4G2.iSxsmagYqzHM()) {
                hq0.Pf0ThKz3j5YS(e9gEMXR7LXtO2, JHNfcAUfKc4G);
            }
            throw th;
        }
    }

    public static final void Pf0ThKz3j5YS(yz0 yz0Var, oh2 oh2Var, df1 df1Var) {
        j72.Companion.getClass();
        j72 PxuCJdSBwIXG = i72.PxuCJdSBwIXG();
        le0 e9gEMXR7LXtO2 = PxuCJdSBwIXG != null ? PxuCJdSBwIXG.e9gEMXR7LXtO() : null;
        j72 lS5Rgt96tfkO2 = i72.lS5Rgt96tfkO(PxuCJdSBwIXG);
        try {
            ki2 Y1f8riQaR6yg2 = yz0Var.Y1f8riQaR6yg();
            if (Y1f8riQaR6yg2 == null) {
                return;
            }
            ei2 ei2Var = yz0Var.e9gEMXR7LXtO;
            if (ei2Var == null) {
                return;
            }
            bw0 TSizfFm2Yiuu2 = yz0Var.TSizfFm2Yiuu();
            if (TSizfFm2Yiuu2 == null) {
                return;
            }
            tf2 tf2Var = uf2.Companion;
            lf2 lf2Var = yz0Var.PxuCJdSBwIXG;
            ji2 ji2Var = Y1f8riQaR6yg2.PxuCJdSBwIXG;
            boolean lS5Rgt96tfkO3 = yz0Var.lS5Rgt96tfkO();
            tf2Var.getClass();
            tf2.lS5Rgt96tfkO(oh2Var, lf2Var, ji2Var, TSizfFm2Yiuu2, ei2Var, lS5Rgt96tfkO3, df1Var);
        } finally {
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG, lS5Rgt96tfkO2, e9gEMXR7LXtO2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0211  */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PxuCJdSBwIXG(final String str, final n61 n61Var, final dj2 dj2Var, int i, boolean z, final int i2, int i3, hp hpVar, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        final int i12;
        final boolean z3;
        final int i13;
        zs1 XL4ISE6Oc65B;
        boolean z4;
        boolean z5;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (tf0Var.a92UlCVFR9N8(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= tf0Var.a92UlCVFR9N8(n61Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= tf0Var.a92UlCVFR9N8(dj2Var) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i6 |= tf0Var.rtx2ld2ELZv4(null) ? 2048 : 1024;
        }
        int i14 = i5 & 16;
        if (i14 != 0) {
            i6 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i7 = i;
            i6 |= tf0Var.Y1f8riQaR6yg(i7) ? 16384 : 8192;
            i8 = i5 & 32;
            if (i8 == 0) {
                i6 |= 196608;
            } else if ((196608 & i4) == 0) {
                z2 = z;
                i6 |= tf0Var.RAsUl2FVSrh6(z2) ? 131072 : 65536;
                if ((1572864 & i4) == 0) {
                    i6 |= tf0Var.Y1f8riQaR6yg(i2) ? 1048576 : 524288;
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                } else if ((12582912 & i4) == 0) {
                    i10 = i3;
                    i6 |= tf0Var.Y1f8riQaR6yg(i10) ? 8388608 : 4194304;
                    i11 = i6 | 100663296;
                    if ((i5 & 512) == 0) {
                        i11 = i6 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        i11 |= (1073741824 & i4) == 0 ? tf0Var.a92UlCVFR9N8(null) : tf0Var.rtx2ld2ELZv4(null) ? 536870912 : 268435456;
                    }
                    int i15 = 1;
                    if (tf0Var.Pf0ThKz3j5YS(i11 & 1, (i11 & 306783379) == 306783378)) {
                        tf0Var.i68hK7ahKtgp();
                        i12 = i7;
                        z3 = z2;
                        i13 = i10;
                    } else {
                        if (i14 != 0) {
                            si2.Companion.getClass();
                            z4 = true;
                        } else {
                            z4 = true;
                            i15 = i7;
                        }
                        boolean z6 = i8 != 0 ? z4 : z2;
                        ?? r10 = i9 != 0 ? z4 : i10;
                        gg1 gg1Var = mp.PxuCJdSBwIXG;
                        kj0.wLFCmsViZrNT(r10, i2);
                        if (tf0Var.wdg6QnbFHrFF(x22.PxuCJdSBwIXG) != null) {
                            u9.VhhvGxCb8gfr();
                            return;
                        }
                        tf0Var.IXK6ba3ucyzm(356914239);
                        tf0Var.gPXPFXrUH4XX(false);
                        ob0 ob0Var = (ob0) tf0Var.wdg6QnbFHrFF(eq.dgRBjINgWbAK);
                        Executor executor = (Executor) tf0Var.wdg6QnbFHrFF(hd.PxuCJdSBwIXG);
                        if (executor != null) {
                            int length = str.length();
                            if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                                if (hd.lS5Rgt96tfkO == null) {
                                    hd.lS5Rgt96tfkO = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4 ? z4 : false);
                                }
                                Boolean bool = hd.lS5Rgt96tfkO;
                                bool.getClass();
                                if (bool.booleanValue()) {
                                    tf0Var.IXK6ba3ucyzm(1254298614);
                                    try {
                                        executor.execute(new gd(dj2Var, (cw0) tf0Var.wdg6QnbFHrFF(eq.r3s1LDPKFs1S), str, (hy) tf0Var.wdg6QnbFHrFF(eq.rtx2ld2ELZv4), ob0Var, 0));
                                    } catch (RejectedExecutionException unused) {
                                    }
                                    z5 = false;
                                    tf0Var.gPXPFXrUH4XX(false);
                                    gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                    tf0Var.IXK6ba3ucyzm(357875859);
                                    tf0Var.gPXPFXrUH4XX(z5);
                                    boolean z7 = z4;
                                    n61 TSizfFm2Yiuu2 = n61Var.TSizfFm2Yiuu(new yi2(str, dj2Var, ob0Var, i15, z6, i2, r10));
                                    c3 c3Var = c3.e9gEMXR7LXtO;
                                    int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
                                    n61 xfACYKDMU6Dj = xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu2);
                                    il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
                                    yo.Companion.getClass();
                                    dq dqVar = xo.lS5Rgt96tfkO;
                                    tf0Var.ngxnMNrpiKat();
                                    if (tf0Var.zf8DYfih6EZu) {
                                        tf0Var.hVNtCUZb4tYH();
                                    } else {
                                        tf0Var.dgRBjINgWbAK(dqVar);
                                    }
                                    th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, c3Var);
                                    th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
                                    th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
                                    th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
                                    th0.tmVwIGCQF4zR(tf0Var, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
                                    tf0Var.gPXPFXrUH4XX(z7);
                                    i12 = i15;
                                    z3 = z6;
                                    i13 = r10;
                                }
                            }
                        }
                        z5 = false;
                        tf0Var.IXK6ba3ucyzm(1255914055);
                        tf0Var.gPXPFXrUH4XX(false);
                        gg1 gg1Var22 = mp.PxuCJdSBwIXG;
                        tf0Var.IXK6ba3ucyzm(357875859);
                        tf0Var.gPXPFXrUH4XX(z5);
                        boolean z72 = z4;
                        n61 TSizfFm2Yiuu22 = n61Var.TSizfFm2Yiuu(new yi2(str, dj2Var, ob0Var, i15, z6, i2, r10));
                        c3 c3Var2 = c3.e9gEMXR7LXtO;
                        int hashCode2 = Long.hashCode(tf0Var.wLFCmsViZrNT);
                        n61 xfACYKDMU6Dj2 = xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu22);
                        il1 x50lh2ztY7Y522 = tf0Var.x50lh2ztY7Y5();
                        yo.Companion.getClass();
                        dq dqVar2 = xo.lS5Rgt96tfkO;
                        tf0Var.ngxnMNrpiKat();
                        if (tf0Var.zf8DYfih6EZu) {
                        }
                        th0.tmVwIGCQF4zR(tf0Var, xo.a92UlCVFR9N8, c3Var2);
                        th0.tmVwIGCQF4zR(tf0Var, xo.e9gEMXR7LXtO, x50lh2ztY7Y522);
                        th0.kpCQ9veP6n3I(tf0Var, xo.rtx2ld2ELZv4);
                        th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj2);
                        th0.tmVwIGCQF4zR(tf0Var, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode2));
                        tf0Var.gPXPFXrUH4XX(z72);
                        i12 = i15;
                        z3 = z6;
                        i13 = r10;
                    }
                    XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
                    if (XL4ISE6Oc65B == null) {
                        XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: fd
                            @Override // defpackage.pe0
                            public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ov2.PxuCJdSBwIXG(str, n61Var, dj2Var, i12, z3, i2, i13, (hp) obj, ki0.bEKsvqmvPh2y(i4 | 1), i5);
                                return no2.PxuCJdSBwIXG;
                            }
                        };
                        return;
                    }
                    return;
                }
                i10 = i3;
                i11 = i6 | 100663296;
                if ((i5 & 512) == 0) {
                }
                int i152 = 1;
                if (tf0Var.Pf0ThKz3j5YS(i11 & 1, (i11 & 306783379) == 306783378)) {
                }
                XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
                if (XL4ISE6Oc65B == null) {
                }
            }
            z2 = z;
            if ((1572864 & i4) == 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            i10 = i3;
            i11 = i6 | 100663296;
            if ((i5 & 512) == 0) {
            }
            int i1522 = 1;
            if (tf0Var.Pf0ThKz3j5YS(i11 & 1, (i11 & 306783379) == 306783378)) {
            }
            XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
            if (XL4ISE6Oc65B == null) {
            }
        }
        i7 = i;
        i8 = i5 & 32;
        if (i8 == 0) {
        }
        z2 = z;
        if ((1572864 & i4) == 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        i10 = i3;
        i11 = i6 | 100663296;
        if ((i5 & 512) == 0) {
        }
        int i15222 = 1;
        if (tf0Var.Pf0ThKz3j5YS(i11 & 1, (i11 & 306783379) == 306783378)) {
        }
        XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B == null) {
        }
    }

    public static tl QrzZRwfaDlRX(tl tlVar) {
        gs2 gs2Var = b51.e9gEMXR7LXtO;
        j.Companion.getClass();
        long j = tlVar.lS5Rgt96tfkO;
        ml.Companion.getClass();
        if (ml.PxuCJdSBwIXG(j, 12884901888L)) {
            lw1 lw1Var = (lw1) tlVar;
            gs2 gs2Var2 = lw1Var.Y1f8riQaR6yg;
            if (!S9EYkSpbGuxq(gs2Var2, gs2Var)) {
                return new lw1(lw1Var.PxuCJdSBwIXG, lw1Var.rtx2ld2ELZv4, gs2Var, nLZGh9p8gVSu(EcgxDIVH5in8(j.lS5Rgt96tfkO.PxuCJdSBwIXG, gs2Var2.PxuCJdSBwIXG(), gs2Var.PxuCJdSBwIXG()), lw1Var.OPXfSBeufaJ8), lw1Var.dgRBjINgWbAK, lw1Var.r3s1LDPKFs1S, lw1Var.e9gEMXR7LXtO, lw1Var.a92UlCVFR9N8, lw1Var.RAsUl2FVSrh6, -1);
            }
        }
        return tlVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x010b, code lost:
    
        if (r6 == defpackage.fp.lS5Rgt96tfkO) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RAsUl2FVSrh6(lb1 lb1Var, cf0 cf0Var, hp hpVar, int i) {
        tf0 tf0Var;
        cf0 cf0Var2;
        lb1Var.getClass();
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(1351064155);
        int i2 = (tf0Var2.rtx2ld2ELZv4(lb1Var) ? 4 : 2) | i | 16;
        int i3 = 0;
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            tf0Var2.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var2.pnx5pC0XzaCw()) {
                pr2 PxuCJdSBwIXG = l21.PxuCJdSBwIXG(tf0Var2);
                if (PxuCJdSBwIXG == null) {
                    u9.rtx2ld2ELZv4("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                cf0Var2 = (cf0) th0.Pf0ThKz3j5YS(bu1.PxuCJdSBwIXG(cf0.class), PxuCJdSBwIXG, sj0.nLZGh9p8gVSu(ki0.xfACYKDMU6Dj(PxuCJdSBwIXG), tf0Var2), ki0.EpkonXwzFgDB(PxuCJdSBwIXG), tf0Var2);
            } else {
                tf0Var2.i68hK7ahKtgp();
                cf0Var2 = cf0Var;
            }
            tf0Var2.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            d91 QrzZRwfaDlRX = sj0.QrzZRwfaDlRX(cf0Var2.TSizfFm2Yiuu, tf0Var2);
            d91 QrzZRwfaDlRX2 = sj0.QrzZRwfaDlRX(cf0Var2.e9gEMXR7LXtO, tf0Var2);
            d91 QrzZRwfaDlRX3 = sj0.QrzZRwfaDlRX(cf0Var2.RAsUl2FVSrh6, tf0Var2);
            d91 QrzZRwfaDlRX4 = sj0.QrzZRwfaDlRX(cf0Var2.OPXfSBeufaJ8, tf0Var2);
            d91 QrzZRwfaDlRX5 = sj0.QrzZRwfaDlRX(cf0Var2.dgRBjINgWbAK, tf0Var2);
            k61 k61Var = n61.Companion;
            w70 w70Var = c62.TSizfFm2Yiuu;
            k61Var.getClass();
            n61 r3s1LDPKFs1S = hq0.r3s1LDPKFs1S(w70Var, ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S, b51.x50lh2ztY7Y5);
            ls2 ls2Var = ms2.Companion;
            n61 kpCQ9veP6n3I = f2.kpCQ9veP6n3I(f2.rZjpSjn4zoMv(r3s1LDPKFs1S, 0.0f, ki0.QrzZRwfaDlRX(ni0.IAToe7bXGz4N(tf0Var2), tf0Var2).Y1f8riQaR6yg() + 10.0f, 0.0f, ki0.QrzZRwfaDlRX(ni0.ZbWwgt3aGe7A(tf0Var2), tf0Var2).TSizfFm2Yiuu() + 2.0f, 5), 16.0f, 0.0f, 2);
            y9 y9Var = new y9(14.0f, new u9(i3));
            boolean rtx2ld2ELZv42 = tf0Var2.rtx2ld2ELZv4(lb1Var) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX4) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX3) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX2) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX5) | tf0Var2.rtx2ld2ELZv4(cf0Var2);
            Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv42) {
                hp.Companion.getClass();
            }
            df0 df0Var = new df0(lb1Var, QrzZRwfaDlRX4, QrzZRwfaDlRX3, QrzZRwfaDlRX2, cf0Var2, QrzZRwfaDlRX, QrzZRwfaDlRX5);
            tf0Var2.JTxCbbCwomzt(df0Var);
            nLZGh9p8gVSu = df0Var;
            tf0Var = tf0Var2;
            ni0.PxuCJdSBwIXG(kpCQ9veP6n3I, null, null, y9Var, null, null, false, null, (le0) nLZGh9p8gVSu, tf0Var, 24576);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
            cf0Var2 = cf0Var;
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new bf(i, 7, lb1Var, cf0Var2);
        }
    }

    public static void RfyTYNmI9Srp(int i) {
        if (2 > i || i >= 37) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i, "radix ", " was not in valid range ");
            BRwzKIf41E4i.append(new br0(2, 36, 1));
            throw new IllegalArgumentException(BRwzKIf41E4i.toString());
        }
    }

    public static final long S2OOm9zPNm0h(long j, x30 x30Var) {
        long j2;
        int ordinal = x30Var.ordinal();
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                u9.BRwzKIf41E4i(x30Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static final boolean S9EYkSpbGuxq(gs2 gs2Var, gs2 gs2Var2) {
        if (gs2Var == gs2Var2) {
            return true;
        }
        return Math.abs(gs2Var.PxuCJdSBwIXG - gs2Var2.PxuCJdSBwIXG) < 0.001f && Math.abs(gs2Var.lS5Rgt96tfkO - gs2Var2.lS5Rgt96tfkO) < 0.001f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x04d0, code lost:
    
        if (r17 > ((r0 != null ? r0.longValue() : 0) + 5000)) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x05a2, code lost:
    
        if (r4 == r5) goto L246;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x063a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0831 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0869 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x08b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0924 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0453  */
    /* JADX WARN: Type inference failed for: r10v11, types: [n61] */
    /* JADX WARN: Type inference failed for: r10v8, types: [k61, n61] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v23, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TSizfFm2Yiuu(final oh2 oh2Var, final le0 le0Var, final n61 n61Var, final dj2 dj2Var, final wr2 wr2Var, final le0 le0Var2, final e81 e81Var, final m82 m82Var, final boolean z, final int i, final int i2, final ln0 ln0Var, final bv0 bv0Var, final boolean z2, final on onVar, hp hpVar, final int i3, final int i4) {
        int i5;
        int i6;
        tf0 tf0Var;
        int i7;
        ug2 ug2Var;
        vi2 vi2Var;
        v8 v8Var;
        Object yz0Var;
        yk2 yk2Var;
        v8 v8Var2;
        df1 df1Var;
        Object obj;
        tf0 tf0Var2;
        int i8;
        is2 is2Var;
        dj2 dj2Var2;
        boolean z3;
        v8 v8Var3;
        long j;
        hy hyVar;
        ob0 ob0Var;
        hy hyVar2;
        long j2;
        boolean z4;
        boolean z5;
        boolean z6;
        oh2 oh2Var2;
        oh2 PxuCJdSBwIXG;
        oh2 oh2Var3;
        Object nLZGh9p8gVSu;
        Object obj2;
        lo2 lo2Var;
        Object nLZGh9p8gVSu2;
        Object nLZGh9p8gVSu3;
        Object nLZGh9p8gVSu4;
        int i9;
        na0 na0Var;
        cn1 cn1Var;
        boolean z7;
        int i10;
        ai2 ai2Var;
        boolean z8;
        boolean rtx2ld2ELZv42;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        int i13;
        lo2 lo2Var2;
        na0 na0Var2;
        final yz0 yz0Var2;
        f4 f4Var;
        int i14;
        final e81 e81Var2;
        final ln0 ln0Var2;
        tf0 tf0Var3;
        int i15;
        va0 va0Var;
        boolean z9;
        ai2 ai2Var2;
        ru ruVar;
        df1 df1Var2;
        hf hfVar;
        oh2 oh2Var4;
        final eh2 eh2Var;
        n61 nLZGh9p8gVSu5;
        n61 n61Var2;
        boolean z10;
        boolean z11;
        ai2 ai2Var3;
        ru ruVar2;
        n61 n61Var3;
        Object obj5;
        d91 d91Var;
        final df1 df1Var3;
        final is2 is2Var2;
        boolean rtx2ld2ELZv43;
        Object nLZGh9p8gVSu6;
        is2 is2Var3;
        final eh2 eh2Var2;
        final yz0 yz0Var3;
        df1 df1Var4;
        n61 n61Var4;
        boolean rtx2ld2ELZv44;
        Object nLZGh9p8gVSu7;
        boolean rtx2ld2ELZv45;
        Object nLZGh9p8gVSu8;
        ln0 ln0Var3;
        int i16;
        boolean z12;
        boolean RAsUl2FVSrh62;
        Object nLZGh9p8gVSu9;
        uf m82Var2;
        boolean rtx2ld2ELZv46;
        Object nLZGh9p8gVSu10;
        int i17;
        long j3 = oh2Var.lS5Rgt96tfkO;
        vi2 vi2Var2 = oh2Var.TSizfFm2Yiuu;
        v8 v8Var4 = oh2Var.PxuCJdSBwIXG;
        int i18 = ln0Var.TSizfFm2Yiuu;
        tf0 tf0Var4 = (tf0) hpVar;
        tf0Var4.JHNfcAUfKc4G(31062401);
        if ((i3 & 6) == 0) {
            i5 = i3 | (tf0Var4.a92UlCVFR9N8(oh2Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= tf0Var4.rtx2ld2ELZv4(le0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= tf0Var4.a92UlCVFR9N8(n61Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= tf0Var4.a92UlCVFR9N8(dj2Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= tf0Var4.a92UlCVFR9N8(wr2Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= tf0Var4.rtx2ld2ELZv4(le0Var2) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= tf0Var4.a92UlCVFR9N8(e81Var) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= tf0Var4.a92UlCVFR9N8(m82Var) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= tf0Var4.RAsUl2FVSrh6(z) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= tf0Var4.Y1f8riQaR6yg(i) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (tf0Var4.Y1f8riQaR6yg(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= tf0Var4.a92UlCVFR9N8(ln0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= tf0Var4.a92UlCVFR9N8(bv0Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= tf0Var4.RAsUl2FVSrh6(z2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= tf0Var4.RAsUl2FVSrh6(false) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= tf0Var4.rtx2ld2ELZv4(onVar) ? 131072 : 65536;
        }
        int i19 = i6 | 1572864;
        if (tf0Var4.Pf0ThKz3j5YS(i5 & 1, ((i5 & 306783379) == 306783378 && (599187 & i19) == 599186) ? false : true)) {
            tf0Var4.wLFCmsViZrNT();
            if ((i3 & 1) != 0 && !tf0Var4.pnx5pC0XzaCw()) {
                tf0Var4.i68hK7ahKtgp();
            }
            tf0Var4.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu11 = tf0Var4.nLZGh9p8gVSu();
            fp fpVar = hp.Companion;
            fpVar.getClass();
            Object obj6 = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu11 == obj6) {
                nLZGh9p8gVSu11 = new va0();
                tf0Var4.JTxCbbCwomzt(nLZGh9p8gVSu11);
            }
            va0 va0Var2 = (va0) nLZGh9p8gVSu11;
            Object nLZGh9p8gVSu12 = tf0Var4.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu12 == obj6) {
                vz0 vz0Var = wz0.PxuCJdSBwIXG;
                nLZGh9p8gVSu12 = new f4();
                tf0Var4.JTxCbbCwomzt(nLZGh9p8gVSu12);
            }
            f4 f4Var2 = (f4) nLZGh9p8gVSu12;
            Object nLZGh9p8gVSu13 = tf0Var4.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu13 == obj6) {
                nLZGh9p8gVSu13 = new ai2(f4Var2);
                tf0Var4.JTxCbbCwomzt(nLZGh9p8gVSu13);
            }
            ai2 ai2Var4 = (ai2) nLZGh9p8gVSu13;
            hy hyVar3 = (hy) tf0Var4.wdg6QnbFHrFF(eq.rtx2ld2ELZv4);
            ob0 ob0Var2 = (ob0) tf0Var4.wdg6QnbFHrFF(eq.dgRBjINgWbAK);
            long j4 = ((wi2) tf0Var4.wdg6QnbFHrFF(xi2.PxuCJdSBwIXG)).lS5Rgt96tfkO;
            na0 na0Var3 = (na0) tf0Var4.wdg6QnbFHrFF(eq.OPXfSBeufaJ8);
            is2 is2Var4 = (is2) tf0Var4.wdg6QnbFHrFF(eq.S9EYkSpbGuxq);
            j82 j82Var = (j82) tf0Var4.wdg6QnbFHrFF(eq.BRwzKIf41E4i);
            tf0Var4.IXK6ba3ucyzm(-213744626);
            th1 th1Var = th1.rtx2ld2ELZv4;
            Object[] objArr = {th1Var};
            ug2.Companion.getClass();
            cr1 cr1Var = ug2.RAsUl2FVSrh6;
            boolean Y1f8riQaR6yg2 = tf0Var4.Y1f8riQaR6yg(th1Var.ordinal());
            Object nLZGh9p8gVSu14 = tf0Var4.nLZGh9p8gVSu();
            int i20 = 8;
            if (Y1f8riQaR6yg2 || nLZGh9p8gVSu14 == obj6) {
                nLZGh9p8gVSu14 = new o5(i20, th1Var);
                tf0Var4.JTxCbbCwomzt(nLZGh9p8gVSu14);
            }
            ug2 ug2Var2 = (ug2) sj0.ryVscX7ZL4Ux(objArr, cr1Var, (ae0) nLZGh9p8gVSu14, tf0Var4, 0);
            tf0Var4.gPXPFXrUH4XX(false);
            if (((th1) ug2Var2.a92UlCVFR9N8.getValue()) != th1Var) {
                u9.XL4ISE6Oc65B("Mismatching scroller orientation; ".concat("only single-line, non-wrap text fields can scroll horizontally"));
                return;
            }
            int i21 = i5 & 14;
            boolean z13 = (i21 == 4) | ((i5 & 57344) == 16384);
            Object nLZGh9p8gVSu15 = tf0Var4.nLZGh9p8gVSu();
            if (z13 || nLZGh9p8gVSu15 == obj6) {
                yk2 PxuCJdSBwIXG2 = ip2.PxuCJdSBwIXG(wr2Var, v8Var4);
                df1 df1Var5 = PxuCJdSBwIXG2.lS5Rgt96tfkO;
                if (vi2Var2 != null) {
                    ug2Var = ug2Var2;
                    v8Var = v8Var4;
                    long j5 = vi2Var2.PxuCJdSBwIXG;
                    uf2.Companion.getClass();
                    ui2 ui2Var = vi2.Companion;
                    int lS5Rgt96tfkO2 = df1Var5.lS5Rgt96tfkO((int) (j5 >> 32));
                    i7 = i21;
                    int lS5Rgt96tfkO3 = df1Var5.lS5Rgt96tfkO((int) (j5 & 4294967295L));
                    int min = Math.min(lS5Rgt96tfkO2, lS5Rgt96tfkO3);
                    int max = Math.max(lS5Rgt96tfkO2, lS5Rgt96tfkO3);
                    s8 s8Var = new s8(PxuCJdSBwIXG2.PxuCJdSBwIXG);
                    if2.Companion.getClass();
                    vi2Var = vi2Var2;
                    s8Var.OPXfSBeufaJ8.add(new r8(min, max, new q82(0L, 0L, (xc0) null, (rc0) null, (tc0) null, (pb0) null, (String) null, 0L, (uc) null, (th2) null, (p21) null, 0L, if2.TSizfFm2Yiuu, (w42) null, 61439), ""));
                    nLZGh9p8gVSu15 = new yk2(s8Var.lS5Rgt96tfkO(), df1Var5);
                } else {
                    i7 = i21;
                    ug2Var = ug2Var2;
                    vi2Var = vi2Var2;
                    v8Var = v8Var4;
                    nLZGh9p8gVSu15 = PxuCJdSBwIXG2;
                }
                tf0Var4.JTxCbbCwomzt(nLZGh9p8gVSu15);
            } else {
                i7 = i21;
                ug2Var = ug2Var2;
                vi2Var = vi2Var2;
                v8Var = v8Var4;
            }
            yk2 yk2Var2 = (yk2) nLZGh9p8gVSu15;
            v8 v8Var5 = yk2Var2.PxuCJdSBwIXG;
            df1 df1Var6 = yk2Var2.lS5Rgt96tfkO;
            zs1 ZbWwgt3aGe7A = tf0Var4.ZbWwgt3aGe7A();
            if (ZbWwgt3aGe7A == null) {
                u9.rtx2ld2ELZv4("no recompose scope found");
                return;
            }
            ZbWwgt3aGe7A.lS5Rgt96tfkO |= 1;
            boolean a92UlCVFR9N82 = tf0Var4.a92UlCVFR9N8(j82Var);
            Object nLZGh9p8gVSu16 = tf0Var4.nLZGh9p8gVSu();
            if (a92UlCVFR9N82 || nLZGh9p8gVSu16 == obj6) {
                si2.Companion.getClass();
                v8 v8Var6 = v8Var;
                yk2Var = yk2Var2;
                v8Var2 = v8Var6;
                df1Var = df1Var6;
                obj = obj6;
                tf0Var2 = tf0Var4;
                i8 = i18;
                is2Var = is2Var4;
                dj2Var2 = dj2Var;
                z3 = z;
                v8Var3 = v8Var5;
                j = j3;
                hyVar = hyVar3;
                ob0Var = ob0Var2;
                yz0Var = new yz0(new lf2(v8Var3, dj2Var2, z3, hyVar3, ob0Var2, 0), ZbWwgt3aGe7A, j82Var);
                tf0Var2.JTxCbbCwomzt(yz0Var);
            } else {
                v8 v8Var7 = v8Var;
                yk2Var = yk2Var2;
                v8Var2 = v8Var7;
                dj2Var2 = dj2Var;
                z3 = z;
                df1Var = df1Var6;
                obj = obj6;
                yz0Var = nLZGh9p8gVSu16;
                tf0Var2 = tf0Var4;
                i8 = i18;
                hyVar = hyVar3;
                ob0Var = ob0Var2;
                is2Var = is2Var4;
                v8Var3 = v8Var5;
                j = j3;
            }
            yz0 yz0Var4 = (yz0) yz0Var;
            yz0Var4.S9EYkSpbGuxq = le0Var;
            yz0Var4.IAToe7bXGz4N = j4;
            m9 m9Var = yz0Var4.XL4ISE6Oc65B;
            m9Var.wdg6QnbFHrFF = bv0Var;
            m9Var.dgRBjINgWbAK = na0Var3;
            yz0Var4.wdg6QnbFHrFF = v8Var2;
            lf2 lf2Var = yz0Var4.PxuCJdSBwIXG;
            si2.Companion.getClass();
            if (cs0.wdg6QnbFHrFF(lf2Var.PxuCJdSBwIXG, v8Var3) && cs0.wdg6QnbFHrFF(lf2Var.lS5Rgt96tfkO, dj2Var2) && lf2Var.e9gEMXR7LXtO == z3 && lf2Var.a92UlCVFR9N8 == 1 && lf2Var.TSizfFm2Yiuu == Integer.MAX_VALUE && lf2Var.Y1f8riQaR6yg == 1 && cs0.wdg6QnbFHrFF(lf2Var.RAsUl2FVSrh6, hyVar) && cs0.wdg6QnbFHrFF(lf2Var.OPXfSBeufaJ8, p50.rtx2ld2ELZv4) && lf2Var.rtx2ld2ELZv4 == ob0Var) {
                hyVar2 = hyVar;
            } else {
                hyVar2 = hyVar;
                lf2Var = new lf2(v8Var3, dj2Var2, z3, hyVar2, ob0Var, 0);
            }
            if (yz0Var4.PxuCJdSBwIXG != lf2Var) {
                yz0Var4.gPXPFXrUH4XX = true;
            }
            yz0Var4.PxuCJdSBwIXG = lf2Var;
            op0 op0Var = yz0Var4.Y1f8riQaR6yg;
            ei2 ei2Var = yz0Var4.e9gEMXR7LXtO;
            vi2 vi2Var3 = vi2Var;
            boolean wdg6QnbFHrFF2 = cs0.wdg6QnbFHrFF(vi2Var3, ((o40) op0Var.wdg6QnbFHrFF).TSizfFm2Yiuu());
            if (cs0.wdg6QnbFHrFF(((oh2) op0Var.OPXfSBeufaJ8).PxuCJdSBwIXG.OPXfSBeufaJ8, v8Var2.OPXfSBeufaJ8)) {
                j2 = j;
                if (vi2.lS5Rgt96tfkO(((oh2) op0Var.OPXfSBeufaJ8).lS5Rgt96tfkO, j2)) {
                    z4 = false;
                } else {
                    ((o40) op0Var.wdg6QnbFHrFF).a92UlCVFR9N8(vi2.a92UlCVFR9N8(j2), vi2.e9gEMXR7LXtO(j2));
                    z5 = true;
                    z4 = false;
                    if (vi2Var3 != null) {
                        o40 o40Var = (o40) op0Var.wdg6QnbFHrFF;
                        o40Var.Y1f8riQaR6yg = -1;
                        o40Var.e9gEMXR7LXtO = -1;
                        z6 = z4;
                    } else {
                        z6 = z4;
                        long j6 = vi2Var3.PxuCJdSBwIXG;
                        if (!vi2.TSizfFm2Yiuu(j6)) {
                            ((o40) op0Var.wdg6QnbFHrFF).e9gEMXR7LXtO(vi2.a92UlCVFR9N8(j6), vi2.e9gEMXR7LXtO(j6));
                        }
                    }
                    if (z6 && (z5 || wdg6QnbFHrFF2)) {
                        PxuCJdSBwIXG = oh2Var;
                        oh2Var2 = PxuCJdSBwIXG;
                    } else {
                        o40 o40Var2 = (o40) op0Var.wdg6QnbFHrFF;
                        o40Var2.Y1f8riQaR6yg = -1;
                        o40Var2.e9gEMXR7LXtO = -1;
                        oh2Var2 = oh2Var;
                        PxuCJdSBwIXG = oh2.PxuCJdSBwIXG(oh2Var2, null, 0L, 3);
                    }
                    oh2Var3 = (oh2) op0Var.OPXfSBeufaJ8;
                    op0Var.OPXfSBeufaJ8 = PxuCJdSBwIXG;
                    if (ei2Var != null && cs0.wdg6QnbFHrFF((ei2) ei2Var.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var)) {
                        ei2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(oh2Var3, PxuCJdSBwIXG);
                    }
                    nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                    obj2 = obj;
                    if (nLZGh9p8gVSu == obj2) {
                        nLZGh9p8gVSu = new lo2();
                        tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
                    }
                    lo2Var = (lo2) nLZGh9p8gVSu;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!lo2Var.e9gEMXR7LXtO) {
                        Long l = lo2Var.Y1f8riQaR6yg;
                    }
                    lo2Var.Y1f8riQaR6yg = Long.valueOf(currentTimeMillis);
                    lo2Var.PxuCJdSBwIXG(oh2Var2);
                    nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
                    if (nLZGh9p8gVSu2 == obj2) {
                        nLZGh9p8gVSu2 = mm2.kpCQ9veP6n3I(tf0Var2);
                        tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu2);
                    }
                    final ru ruVar3 = (ru) nLZGh9p8gVSu2;
                    nLZGh9p8gVSu3 = tf0Var2.nLZGh9p8gVSu();
                    if (nLZGh9p8gVSu3 == obj2) {
                        nLZGh9p8gVSu3 = new hf();
                        tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu3);
                    }
                    final hf hfVar2 = (hf) nLZGh9p8gVSu3;
                    nLZGh9p8gVSu4 = tf0Var2.nLZGh9p8gVSu();
                    if (nLZGh9p8gVSu4 == obj2) {
                        nLZGh9p8gVSu4 = new eh2(lo2Var);
                        tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu4);
                    }
                    final eh2 eh2Var3 = (eh2) nLZGh9p8gVSu4;
                    final df1 df1Var7 = df1Var;
                    eh2Var3.lS5Rgt96tfkO = df1Var7;
                    eh2Var3.TSizfFm2Yiuu = yz0Var4.VhhvGxCb8gfr;
                    eh2Var3.Y1f8riQaR6yg = yz0Var4;
                    eh2Var3.e9gEMXR7LXtO.setValue(oh2Var2);
                    eh2Var3.VhhvGxCb8gfr = new vi2(j2);
                    eh2Var3.RAsUl2FVSrh6 = (qk) tf0Var2.wdg6QnbFHrFF(eq.a92UlCVFR9N8);
                    eh2Var3.rtx2ld2ELZv4 = ruVar3;
                    eh2Var3.wdg6QnbFHrFF = (yi0) tf0Var2.wdg6QnbFHrFF(eq.x50lh2ztY7Y5);
                    eh2Var3.dgRBjINgWbAK = va0Var2;
                    final boolean z14 = true;
                    eh2Var3.x50lh2ztY7Y5.setValue(true);
                    eh2Var3.cpQdD2nAriOS.setValue(Boolean.valueOf(z2));
                    tf0Var2.IXK6ba3ucyzm(1966756105);
                    p21 p21Var = dj2Var2.PxuCJdSBwIXG.dgRBjINgWbAK;
                    t92 t92Var = en1.PxuCJdSBwIXG;
                    tf0Var2.IXK6ba3ucyzm(430530635);
                    i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 28) {
                        z7 = false;
                        tf0Var2.gPXPFXrUH4XX(false);
                        na0Var = na0Var3;
                        cn1Var = null;
                    } else {
                        Context context = (Context) tf0Var2.wdg6QnbFHrFF(h2.lS5Rgt96tfkO);
                        na0Var = na0Var3;
                        hu huVar = (hu) tf0Var2.wdg6QnbFHrFF(en1.PxuCJdSBwIXG);
                        boolean a92UlCVFR9N83 = tf0Var2.a92UlCVFR9N8(huVar) | tf0Var2.a92UlCVFR9N8(context) | tf0Var2.a92UlCVFR9N8(p21Var);
                        Object nLZGh9p8gVSu17 = tf0Var2.nLZGh9p8gVSu();
                        if (!a92UlCVFR9N83) {
                            fpVar.getClass();
                        }
                        en1.lS5Rgt96tfkO.getClass();
                        nLZGh9p8gVSu17 = new cn1(huVar, context, f22.rtx2ld2ELZv4, p21Var);
                        tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu17);
                        cn1Var = (cn1) nLZGh9p8gVSu17;
                        z7 = false;
                        tf0Var2.gPXPFXrUH4XX(false);
                    }
                    eh2Var3.OPXfSBeufaJ8 = cn1Var;
                    tf0Var2.gPXPFXrUH4XX(z7);
                    yz0Var4.lS5Rgt96tfkO();
                    ?? r10 = n61.Companion;
                    int i22 = i19 & 7168;
                    int i23 = i7;
                    boolean rtx2ld2ELZv47 = ((i19 & 57344) != 16384) | tf0Var2.rtx2ld2ELZv4(yz0Var4) | (i22 != 2048) | tf0Var2.rtx2ld2ELZv4(ai2Var4) | (i23 != 4);
                    i10 = (i19 & 112) ^ 48;
                    if (i10 > 32 && tf0Var2.a92UlCVFR9N8(ln0Var)) {
                        ai2Var = ai2Var4;
                        z8 = true;
                        rtx2ld2ELZv42 = rtx2ld2ELZv47 | z8 | tf0Var2.rtx2ld2ELZv4(df1Var7) | tf0Var2.rtx2ld2ELZv4(ruVar3) | tf0Var2.rtx2ld2ELZv4(hfVar2) | tf0Var2.rtx2ld2ELZv4(eh2Var3);
                        Object nLZGh9p8gVSu18 = tf0Var2.nLZGh9p8gVSu();
                        if (!rtx2ld2ELZv42 || nLZGh9p8gVSu18 == obj2) {
                            i11 = i23;
                            i12 = i22;
                            obj4 = obj2;
                            i13 = i19;
                            lo2Var2 = lo2Var;
                            na0Var2 = na0Var;
                            yz0Var2 = yz0Var4;
                            f4Var = f4Var2;
                            i14 = 32;
                            e81Var2 = e81Var;
                            ln0Var2 = ln0Var;
                            tf0Var3 = tf0Var2;
                            i15 = i9;
                            final ai2 ai2Var5 = ai2Var;
                            va0Var = va0Var2;
                            obj3 = new le0() { // from class: pt
                                @Override // defpackage.le0
                                public final Object OPXfSBeufaJ8(Object obj7) {
                                    ki2 Y1f8riQaR6yg3;
                                    za0 za0Var = (za0) obj7;
                                    yz0 yz0Var5 = yz0.this;
                                    boolean lS5Rgt96tfkO4 = yz0Var5.lS5Rgt96tfkO();
                                    boolean PxuCJdSBwIXG3 = za0Var.PxuCJdSBwIXG();
                                    no2 no2Var = no2.PxuCJdSBwIXG;
                                    if (lS5Rgt96tfkO4 != PxuCJdSBwIXG3) {
                                        yz0Var5.a92UlCVFR9N8.setValue(Boolean.valueOf(za0Var.PxuCJdSBwIXG()));
                                        boolean lS5Rgt96tfkO5 = yz0Var5.lS5Rgt96tfkO();
                                        oh2 oh2Var5 = oh2Var;
                                        df1 df1Var8 = df1Var7;
                                        if (lS5Rgt96tfkO5 && z2) {
                                            tf2 tf2Var = uf2.Companion;
                                            op0 op0Var2 = yz0Var5.Y1f8riQaR6yg;
                                            mt mtVar = yz0Var5.VhhvGxCb8gfr;
                                            mt mtVar2 = yz0Var5.S2OOm9zPNm0h;
                                            tf2Var.getClass();
                                            zt1 zt1Var = new zt1();
                                            cd cdVar = new cd(op0Var2, mtVar, zt1Var);
                                            ai2 ai2Var6 = ai2Var5;
                                            kn1 kn1Var = ai2Var6.PxuCJdSBwIXG;
                                            kn1Var.PxuCJdSBwIXG(oh2Var5, ln0Var2, cdVar, mtVar2);
                                            ei2 ei2Var2 = new ei2(ai2Var6, kn1Var);
                                            ai2Var6.lS5Rgt96tfkO.set(ei2Var2);
                                            zt1Var.rtx2ld2ELZv4 = ei2Var2;
                                            yz0Var5.e9gEMXR7LXtO = ei2Var2;
                                            ov2.Pf0ThKz3j5YS(yz0Var5, oh2Var5, df1Var8);
                                        } else {
                                            ov2.e6tOsSdd2EFb(yz0Var5);
                                        }
                                        if (za0Var.PxuCJdSBwIXG() && (Y1f8riQaR6yg3 = yz0Var5.Y1f8riQaR6yg()) != null) {
                                            fx1.KUoIVIumpKat(ruVar3, null, new d4(hfVar2, oh2Var5, yz0Var5, Y1f8riQaR6yg3, df1Var8, null, 2), 3);
                                        }
                                        if (!za0Var.PxuCJdSBwIXG()) {
                                            eh2Var3.RAsUl2FVSrh6(null);
                                        }
                                    }
                                    return no2Var;
                                }
                            };
                            z9 = z2;
                            ai2Var2 = ai2Var5;
                            ruVar = ruVar3;
                            df1Var2 = df1Var7;
                            hfVar = hfVar2;
                            oh2Var4 = oh2Var;
                            eh2Var = eh2Var3;
                            tf0Var3.JTxCbbCwomzt(obj3);
                        } else {
                            hfVar = hfVar2;
                            obj3 = nLZGh9p8gVSu18;
                            i12 = i22;
                            obj4 = obj2;
                            eh2Var = eh2Var3;
                            df1Var2 = df1Var7;
                            i11 = i23;
                            i13 = i19;
                            lo2Var2 = lo2Var;
                            na0Var2 = na0Var;
                            yz0Var2 = yz0Var4;
                            f4Var = f4Var2;
                            ai2Var2 = ai2Var;
                            i14 = 32;
                            oh2Var4 = oh2Var;
                            e81Var2 = e81Var;
                            ln0Var2 = ln0Var;
                            tf0Var3 = tf0Var2;
                            ruVar = ruVar3;
                            i15 = i9;
                            va0Var = va0Var2;
                            z9 = z2;
                        }
                        nLZGh9p8gVSu5 = mm2.nLZGh9p8gVSu(b51.nxJAScVArhE9(fx1.i68hK7ahKtgp(r10, va0Var), (le0) obj3), z9, e81Var2);
                        d91 Pf0ThKz3j5YS = sj0.Pf0ThKz3j5YS(Boolean.valueOf(z9), tf0Var3);
                        boolean a92UlCVFR9N84 = tf0Var3.a92UlCVFR9N8(Pf0ThKz3j5YS) | tf0Var3.rtx2ld2ELZv4(yz0Var2) | tf0Var3.rtx2ld2ELZv4(ai2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var);
                        if (i10 > i14 || !tf0Var3.a92UlCVFR9N8(ln0Var2)) {
                            n61Var2 = nLZGh9p8gVSu5;
                            if ((i13 & 48) != i14) {
                                z10 = false;
                                z11 = z10 | a92UlCVFR9N84;
                                Object nLZGh9p8gVSu19 = tf0Var3.nLZGh9p8gVSu();
                                if (!z11) {
                                    Object obj7 = obj4;
                                    if (nLZGh9p8gVSu19 == obj7) {
                                        obj4 = obj7;
                                    } else {
                                        obj5 = obj7;
                                        ai2Var3 = ai2Var2;
                                        ruVar2 = ruVar;
                                        d91Var = Pf0ThKz3j5YS;
                                        n61Var3 = n61Var2;
                                        mm2.wdg6QnbFHrFF(tf0Var3, (pe0) nLZGh9p8gVSu19, no2.PxuCJdSBwIXG);
                                        gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                                        n61 PxuCJdSBwIXG3 = lc2.PxuCJdSBwIXG(r10, 8675309, new j3(1, new mt(yz0Var2, 4)));
                                        va0 va0Var3 = va0Var;
                                        df1Var3 = df1Var2;
                                        ia1 ia1Var = new ia1(yz0Var2, va0Var3, z9, eh2Var, df1Var3);
                                        int i24 = 7;
                                        if (z2) {
                                            PxuCJdSBwIXG3 = VhhvGxCb8gfr(PxuCJdSBwIXG3, new ws(i24, ia1Var, e81Var2));
                                        }
                                        n61 TSizfFm2Yiuu2 = PxuCJdSBwIXG3.TSizfFm2Yiuu(new kc2(eh2Var.IAToe7bXGz4N, eh2Var.pnx5pC0XzaCw, new j3(5, eh2Var), 4));
                                        yn1.Companion.getClass();
                                        n61 TSizfFm2Yiuu3 = TSizfFm2Yiuu2.TSizfFm2Yiuu(new vn1());
                                        final n61 ozEBbv0hFTAB = fx1.ozEBbv0hFTAB(r10, new cd(yz0Var2, oh2Var4, df1Var3, 2));
                                        is2Var2 = is2Var;
                                        int i25 = i11;
                                        rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(yz0Var2) | (i12 == 2048) | tf0Var3.a92UlCVFR9N8(is2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var) | (i25 == 4) | tf0Var3.rtx2ld2ELZv4(df1Var3);
                                        nLZGh9p8gVSu6 = tf0Var3.nLZGh9p8gVSu();
                                        if (!rtx2ld2ELZv43 || nLZGh9p8gVSu6 == obj5) {
                                            final oh2 oh2Var5 = oh2Var4;
                                            le0 le0Var3 = new le0() { // from class: qt
                                                @Override // defpackage.le0
                                                public final Object OPXfSBeufaJ8(Object obj8) {
                                                    ei2 ei2Var2;
                                                    bw0 bw0Var;
                                                    yz0 yz0Var5 = yz0.this;
                                                    mj1 mj1Var = yz0Var5.QrzZRwfaDlRX;
                                                    bw0 bw0Var2 = (bw0) obj8;
                                                    yz0Var5.rtx2ld2ELZv4 = bw0Var2;
                                                    ki2 Y1f8riQaR6yg3 = yz0Var5.Y1f8riQaR6yg();
                                                    if (Y1f8riQaR6yg3 != null) {
                                                        Y1f8riQaR6yg3.lS5Rgt96tfkO = bw0Var2;
                                                    }
                                                    if (z2) {
                                                        mi0 PxuCJdSBwIXG4 = yz0Var5.PxuCJdSBwIXG();
                                                        mi0 mi0Var = mi0.OPXfSBeufaJ8;
                                                        eh2 eh2Var4 = eh2Var;
                                                        oh2 oh2Var6 = oh2Var5;
                                                        if (PxuCJdSBwIXG4 == mi0Var) {
                                                            if (((Boolean) yz0Var5.x50lh2ztY7Y5.getValue()).booleanValue() && ((Boolean) ((rz0) is2Var2).PxuCJdSBwIXG.getValue()).booleanValue()) {
                                                                eh2Var4.EcgxDIVH5in8();
                                                            } else {
                                                                eh2Var4.QrzZRwfaDlRX();
                                                            }
                                                            yz0Var5.cpQdD2nAriOS.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                                            yz0Var5.r3s1LDPKFs1S.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, false)));
                                                            mj1Var.setValue(Boolean.valueOf(vi2.TSizfFm2Yiuu(oh2Var6.lS5Rgt96tfkO)));
                                                        } else if (yz0Var5.PxuCJdSBwIXG() == mi0.wdg6QnbFHrFF) {
                                                            mj1Var.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                                        }
                                                        df1 df1Var8 = df1Var3;
                                                        ov2.Pf0ThKz3j5YS(yz0Var5, oh2Var6, df1Var8);
                                                        ki2 Y1f8riQaR6yg4 = yz0Var5.Y1f8riQaR6yg();
                                                        if (Y1f8riQaR6yg4 != null && (ei2Var2 = yz0Var5.e9gEMXR7LXtO) != null && yz0Var5.lS5Rgt96tfkO()) {
                                                            uf2.Companion.getClass();
                                                            bw0 bw0Var3 = Y1f8riQaR6yg4.lS5Rgt96tfkO;
                                                            if (bw0Var3 != null && bw0Var3.aF05bpZJlKEP() && (bw0Var = Y1f8riQaR6yg4.TSizfFm2Yiuu) != null) {
                                                                ji2 ji2Var = Y1f8riQaR6yg4.PxuCJdSBwIXG;
                                                                d0 d0Var = new d0(3, bw0Var3);
                                                                qt1 ryVscX7ZL4Ux = ng0.ryVscX7ZL4Ux(bw0Var3);
                                                                qt1 nLZGh9p8gVSu20 = bw0Var3.nLZGh9p8gVSu(bw0Var, false);
                                                                if (cs0.wdg6QnbFHrFF((ei2) ei2Var2.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var2)) {
                                                                    ei2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu(oh2Var6, df1Var8, ji2Var, d0Var, ryVscX7ZL4Ux, nLZGh9p8gVSu20);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return no2.PxuCJdSBwIXG;
                                                }
                                            };
                                            is2Var3 = is2Var2;
                                            df1Var3 = df1Var3;
                                            tf0Var3.JTxCbbCwomzt(le0Var3);
                                            nLZGh9p8gVSu6 = le0Var3;
                                        } else {
                                            is2Var3 = is2Var2;
                                        }
                                        final n61 nxJAScVArhE9 = mm2.nxJAScVArhE9(r10, (le0) nLZGh9p8gVSu6);
                                        yz0 yz0Var5 = yz0Var2;
                                        eh2Var2 = eh2Var;
                                        ai2 ai2Var6 = ai2Var3;
                                        yt ytVar = new yt(yk2Var, oh2Var, yz0Var5, z2, df1Var3, eh2Var2, ln0Var, va0Var3);
                                        yz0Var3 = yz0Var5;
                                        if (!z2 && ((Boolean) ((rz0) is2Var3).PxuCJdSBwIXG.getValue()).booleanValue() && vi2.TSizfFm2Yiuu(((vi2) yz0Var3.e6tOsSdd2EFb.getValue()).PxuCJdSBwIXG) && vi2.TSizfFm2Yiuu(((vi2) yz0Var3.jyegZNwi31qc.getValue()).PxuCJdSBwIXG)) {
                                            df1Var4 = df1Var3;
                                            ey0 ey0Var = new ey0(m82Var, yz0Var3, oh2Var, df1Var4, 1);
                                            yz0Var3 = yz0Var3;
                                            n61Var4 = VhhvGxCb8gfr(r10, ey0Var);
                                        } else {
                                            df1Var4 = df1Var3;
                                            n61Var4 = r10;
                                        }
                                        rtx2ld2ELZv44 = tf0Var3.rtx2ld2ELZv4(eh2Var2);
                                        nLZGh9p8gVSu7 = tf0Var3.nLZGh9p8gVSu();
                                        if (!rtx2ld2ELZv44 || nLZGh9p8gVSu7 == obj5) {
                                            nLZGh9p8gVSu7 = new rt(eh2Var2, 0);
                                            tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu7);
                                        }
                                        mm2.rtx2ld2ELZv4(eh2Var2, (le0) nLZGh9p8gVSu7, tf0Var3);
                                        rtx2ld2ELZv45 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.rtx2ld2ELZv4(ai2Var6) | (i25 == 4) | ((i10 <= 32 && tf0Var3.a92UlCVFR9N8(ln0Var)) || (i13 & 48) == 32);
                                        nLZGh9p8gVSu8 = tf0Var3.nLZGh9p8gVSu();
                                        if (!rtx2ld2ELZv45 || nLZGh9p8gVSu8 == obj5) {
                                            d7 d7Var = new d7(yz0Var3, ai2Var6, oh2Var, ln0Var, 1);
                                            ln0Var3 = ln0Var;
                                            tf0Var3.JTxCbbCwomzt(d7Var);
                                            nLZGh9p8gVSu8 = d7Var;
                                        } else {
                                            ln0Var3 = ln0Var;
                                        }
                                        mm2.rtx2ld2ELZv4(ln0Var3, (le0) nLZGh9p8gVSu8, tf0Var3);
                                        final mt mtVar = yz0Var3.VhhvGxCb8gfr;
                                        final boolean z15 = i == 1;
                                        final int i26 = ln0Var3.Y1f8riQaR6yg;
                                        final lo2 lo2Var3 = lo2Var2;
                                        final df1 df1Var8 = df1Var4;
                                        n61 VhhvGxCb8gfr = VhhvGxCb8gfr(r10, new qe0() { // from class: eg2
                                            @Override // defpackage.qe0
                                            public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                                ((Integer) obj10).getClass();
                                                tf0 tf0Var5 = (tf0) ((hp) obj9);
                                                tf0Var5.IXK6ba3ucyzm(851809892);
                                                gg1 gg1Var3 = mp.PxuCJdSBwIXG;
                                                Object nLZGh9p8gVSu20 = tf0Var5.nLZGh9p8gVSu();
                                                hp.Companion.getClass();
                                                jx1 jx1Var = fp.lS5Rgt96tfkO;
                                                if (nLZGh9p8gVSu20 == jx1Var) {
                                                    nLZGh9p8gVSu20 = new ti2();
                                                    tf0Var5.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                }
                                                ti2 ti2Var = (ti2) nLZGh9p8gVSu20;
                                                Object nLZGh9p8gVSu21 = tf0Var5.nLZGh9p8gVSu();
                                                if (nLZGh9p8gVSu21 == jx1Var) {
                                                    nLZGh9p8gVSu21 = new xv();
                                                    tf0Var5.JTxCbbCwomzt(nLZGh9p8gVSu21);
                                                }
                                                dg2 dg2Var = new dg2(yz0.this, eh2Var2, oh2Var, z14, z15, ti2Var, df1Var8, lo2Var3, (xv) nLZGh9p8gVSu21, mtVar, i26);
                                                k61 k61Var = n61.Companion;
                                                boolean rtx2ld2ELZv48 = tf0Var5.rtx2ld2ELZv4(dg2Var);
                                                Object nLZGh9p8gVSu22 = tf0Var5.nLZGh9p8gVSu();
                                                if (rtx2ld2ELZv48 || nLZGh9p8gVSu22 == jx1Var) {
                                                    RAsUl2FVSrh6 rAsUl2FVSrh6 = new RAsUl2FVSrh6(1, dg2Var, dg2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                                                    tf0Var5.JTxCbbCwomzt(rAsUl2FVSrh6);
                                                    nLZGh9p8gVSu22 = rAsUl2FVSrh6;
                                                }
                                                n61 aF05bpZJlKEP = hq0.aF05bpZJlKEP(k61Var, (le0) ((af0) nLZGh9p8gVSu22));
                                                tf0Var5.gPXPFXrUH4XX(false);
                                                return aF05bpZJlKEP;
                                            }
                                        });
                                        hv0.Companion.getClass();
                                        i16 = i8;
                                        if (i16 == 7 && i16 != 8) {
                                            z12 = true;
                                            boolean booleanValue = ((Boolean) d91Var.getValue()).booleanValue();
                                            f4 f4Var3 = f4Var;
                                            RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var3);
                                            nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
                                            if (!RAsUl2FVSrh62 || nLZGh9p8gVSu9 == obj5) {
                                                nLZGh9p8gVSu9 = new uq(z12, f4Var3);
                                                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
                                            }
                                            n61 EpkonXwzFgDB = bs0.EpkonXwzFgDB(r10, booleanValue, z12, (ae0) nLZGh9p8gVSu9);
                                            uf ufVar = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
                                            long j7 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
                                            m82Var2 = !hl.TSizfFm2Yiuu(j7, mm2.TSizfFm2Yiuu(1308617531)) ? new m82(j7) : ufVar;
                                            rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
                                            nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
                                            if (!rtx2ld2ELZv46 || nLZGh9p8gVSu10 == obj5) {
                                                nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
                                                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
                                            }
                                            n61 J54yh1s3n4Aq = fx1.J54yh1s3n4Aq(r10, (le0) nLZGh9p8gVSu10);
                                            gg1 gg1Var3 = mp.PxuCJdSBwIXG;
                                            i17 = 0;
                                            n61 TSizfFm2Yiuu4 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq), f4Var3, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr);
                                            final ug2 ug2Var3 = ug2Var;
                                            n61 TSizfFm2Yiuu5 = mm2.nxJAScVArhE9(TSizfFm2Yiuu4.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                                                /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                                                
                                                    if (r14 == r4) goto L16;
                                                 */
                                                @Override // defpackage.qe0
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                                    ug2 ug2Var4 = ug2.this;
                                                    mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                                                    ((Integer) obj10).getClass();
                                                    tf0 tf0Var5 = (tf0) ((hp) obj9);
                                                    tf0Var5.IXK6ba3ucyzm(-2137546592);
                                                    gg1 gg1Var4 = mp.PxuCJdSBwIXG;
                                                    boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var5.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                                                    boolean a92UlCVFR9N85 = tf0Var5.a92UlCVFR9N8(ug2Var4);
                                                    Object nLZGh9p8gVSu20 = tf0Var5.nLZGh9p8gVSu();
                                                    Object obj11 = fp.lS5Rgt96tfkO;
                                                    if (!a92UlCVFR9N85) {
                                                        hp.Companion.getClass();
                                                    }
                                                    nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                                                    tf0Var5.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                    d91 Pf0ThKz3j5YS2 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var5);
                                                    Object nLZGh9p8gVSu21 = tf0Var5.nLZGh9p8gVSu();
                                                    hp.Companion.getClass();
                                                    if (nLZGh9p8gVSu21 == obj11) {
                                                        Object axVar = new ax(new o6(Pf0ThKz3j5YS2, 3));
                                                        tf0Var5.JTxCbbCwomzt(axVar);
                                                        nLZGh9p8gVSu21 = axVar;
                                                    }
                                                    e12 e12Var = (e12) nLZGh9p8gVSu21;
                                                    boolean a92UlCVFR9N86 = tf0Var5.a92UlCVFR9N8(e12Var) | tf0Var5.a92UlCVFR9N8(ug2Var4);
                                                    Object nLZGh9p8gVSu22 = tf0Var5.nLZGh9p8gVSu();
                                                    if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                                                        nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                                                        tf0Var5.JTxCbbCwomzt(nLZGh9p8gVSu22);
                                                    }
                                                    n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                                                    tf0Var5.gPXPFXrUH4XX(false);
                                                    return lS5Rgt96tfkO4;
                                                }
                                            })).TSizfFm2Yiuu(TSizfFm2Yiuu3).TSizfFm2Yiuu(ytVar), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
                                            if (z2 && yz0Var3.lS5Rgt96tfkO() && ((Boolean) yz0Var3.BRwzKIf41E4i.getValue()).booleanValue() && ((Boolean) ((rz0) is2Var3).PxuCJdSBwIXG.getValue()).booleanValue()) {
                                                i17 = 1;
                                            }
                                            if (i17 != 0) {
                                                k32 k32Var = f41.PxuCJdSBwIXG;
                                                if (i15 >= 28) {
                                                    r10 = VhhvGxCb8gfr(r10, new ai(12, eh2Var2));
                                                }
                                            }
                                            final n61 n61Var5 = r10;
                                            tf0 tf0Var5 = tf0Var3;
                                            final hy hyVar4 = hyVar2;
                                            final hf hfVar3 = hfVar;
                                            final n61 n61Var6 = n61Var4;
                                            final yz0 yz0Var6 = yz0Var3;
                                            final ?? r15 = i17;
                                            pe0 pe0Var = new pe0() { // from class: nt
                                                @Override // defpackage.pe0
                                                public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                                                    hp hpVar2 = (hp) obj8;
                                                    int intValue = ((Integer) obj9).intValue();
                                                    tf0 tf0Var6 = (tf0) hpVar2;
                                                    if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                                                        gg1 gg1Var4 = mp.PxuCJdSBwIXG;
                                                        final yz0 yz0Var7 = yz0Var6;
                                                        final dj2 dj2Var3 = dj2Var;
                                                        final int i27 = i2;
                                                        final int i28 = i;
                                                        final ug2 ug2Var4 = ug2Var3;
                                                        final oh2 oh2Var6 = oh2Var;
                                                        final wr2 wr2Var2 = wr2Var;
                                                        final n61 n61Var7 = n61Var6;
                                                        final n61 n61Var8 = ozEBbv0hFTAB;
                                                        final n61 n61Var9 = nxJAScVArhE9;
                                                        final n61 n61Var10 = n61Var5;
                                                        final hf hfVar4 = hfVar3;
                                                        final eh2 eh2Var4 = eh2Var2;
                                                        final boolean z16 = r15;
                                                        final le0 le0Var4 = le0Var2;
                                                        final df1 df1Var9 = df1Var8;
                                                        final hy hyVar5 = hyVar4;
                                                        on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                                                            /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                                                            
                                                                if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                                                             */
                                                            @Override // defpackage.pe0
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                                                n61 jq2Var;
                                                                oh2 oh2Var7 = oh2Var6;
                                                                long j8 = oh2Var7.lS5Rgt96tfkO;
                                                                hp hpVar3 = (hp) obj10;
                                                                int intValue2 = ((Integer) obj11).intValue();
                                                                tf0 tf0Var7 = (tf0) hpVar3;
                                                                if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                                    gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                                                    k61 k61Var = n61.Companion;
                                                                    yz0 yz0Var8 = yz0.this;
                                                                    n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                                                    int i29 = i27;
                                                                    int i30 = i28;
                                                                    kj0.wLFCmsViZrNT(i29, i30);
                                                                    dj2 dj2Var4 = dj2Var3;
                                                                    if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                                        Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                                                    }
                                                                    boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                                                    Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                                                    if (!rtx2ld2ELZv48) {
                                                                        hp.Companion.getClass();
                                                                    }
                                                                    nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                                                    tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                                    ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                                                    ug2 ug2Var5 = ug2Var4;
                                                                    th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                                                    ui2 ui2Var2 = vi2.Companion;
                                                                    int i31 = (int) (j8 >> 32);
                                                                    long j9 = ug2Var5.e9gEMXR7LXtO;
                                                                    n61 n61Var11 = Y1f8riQaR6yg3;
                                                                    if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                                        i31 = vi2.a92UlCVFR9N8(j8);
                                                                    }
                                                                    ug2Var5.e9gEMXR7LXtO = j8;
                                                                    yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                                                    int ordinal = th1Var2.ordinal();
                                                                    if (ordinal == 0) {
                                                                        jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                                    } else {
                                                                        if (ordinal != 1) {
                                                                            u9.gPXPFXrUH4XX();
                                                                            return null;
                                                                        }
                                                                        jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                                    }
                                                                    ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                                                } else {
                                                                    tf0Var7.i68hK7ahKtgp();
                                                                }
                                                                return no2.PxuCJdSBwIXG;
                                                            }
                                                        }, tf0Var6), tf0Var6, 6);
                                                    } else {
                                                        tf0Var6.i68hK7ahKtgp();
                                                    }
                                                    return no2.PxuCJdSBwIXG;
                                                }
                                            };
                                            tf0Var = tf0Var5;
                                            Y1f8riQaR6yg(TSizfFm2Yiuu5, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var, tf0Var), tf0Var, 384);
                                            gg1 gg1Var4 = mp.PxuCJdSBwIXG;
                                        }
                                        z12 = false;
                                        boolean booleanValue2 = ((Boolean) d91Var.getValue()).booleanValue();
                                        f4 f4Var32 = f4Var;
                                        RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var32);
                                        nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
                                        if (!RAsUl2FVSrh62) {
                                        }
                                        nLZGh9p8gVSu9 = new uq(z12, f4Var32);
                                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
                                        n61 EpkonXwzFgDB2 = bs0.EpkonXwzFgDB(r10, booleanValue2, z12, (ae0) nLZGh9p8gVSu9);
                                        uf ufVar2 = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
                                        long j72 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
                                        if (!hl.TSizfFm2Yiuu(j72, mm2.TSizfFm2Yiuu(1308617531))) {
                                        }
                                        rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
                                        nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
                                        if (!rtx2ld2ELZv46) {
                                        }
                                        nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
                                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
                                        n61 J54yh1s3n4Aq2 = fx1.J54yh1s3n4Aq(r10, (le0) nLZGh9p8gVSu10);
                                        gg1 gg1Var32 = mp.PxuCJdSBwIXG;
                                        i17 = 0;
                                        n61 TSizfFm2Yiuu42 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq2), f4Var32, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB2).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr);
                                        final ug2 ug2Var32 = ug2Var;
                                        n61 TSizfFm2Yiuu52 = mm2.nxJAScVArhE9(TSizfFm2Yiuu42.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                                            /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                                            
                                                if (r14 == r4) goto L16;
                                             */
                                            @Override // defpackage.qe0
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                            */
                                            public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                                ug2 ug2Var4 = ug2.this;
                                                mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                                                ((Integer) obj10).getClass();
                                                tf0 tf0Var52 = (tf0) ((hp) obj9);
                                                tf0Var52.IXK6ba3ucyzm(-2137546592);
                                                gg1 gg1Var42 = mp.PxuCJdSBwIXG;
                                                boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var52.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                                                boolean a92UlCVFR9N85 = tf0Var52.a92UlCVFR9N8(ug2Var4);
                                                Object nLZGh9p8gVSu20 = tf0Var52.nLZGh9p8gVSu();
                                                Object obj11 = fp.lS5Rgt96tfkO;
                                                if (!a92UlCVFR9N85) {
                                                    hp.Companion.getClass();
                                                }
                                                nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                                                tf0Var52.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                d91 Pf0ThKz3j5YS2 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var52);
                                                Object nLZGh9p8gVSu21 = tf0Var52.nLZGh9p8gVSu();
                                                hp.Companion.getClass();
                                                if (nLZGh9p8gVSu21 == obj11) {
                                                    Object axVar = new ax(new o6(Pf0ThKz3j5YS2, 3));
                                                    tf0Var52.JTxCbbCwomzt(axVar);
                                                    nLZGh9p8gVSu21 = axVar;
                                                }
                                                e12 e12Var = (e12) nLZGh9p8gVSu21;
                                                boolean a92UlCVFR9N86 = tf0Var52.a92UlCVFR9N8(e12Var) | tf0Var52.a92UlCVFR9N8(ug2Var4);
                                                Object nLZGh9p8gVSu22 = tf0Var52.nLZGh9p8gVSu();
                                                if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                                                    nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                                                    tf0Var52.JTxCbbCwomzt(nLZGh9p8gVSu22);
                                                }
                                                n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                                                tf0Var52.gPXPFXrUH4XX(false);
                                                return lS5Rgt96tfkO4;
                                            }
                                        })).TSizfFm2Yiuu(TSizfFm2Yiuu3).TSizfFm2Yiuu(ytVar), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
                                        if (z2) {
                                            i17 = 1;
                                        }
                                        if (i17 != 0) {
                                        }
                                        final n61 n61Var52 = r10;
                                        tf0 tf0Var52 = tf0Var3;
                                        final hy hyVar42 = hyVar2;
                                        final hf hfVar32 = hfVar;
                                        final n61 n61Var62 = n61Var4;
                                        final yz0 yz0Var62 = yz0Var3;
                                        final boolean r152 = i17;
                                        pe0 pe0Var2 = new pe0() { // from class: nt
                                            @Override // defpackage.pe0
                                            public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                                                hp hpVar2 = (hp) obj8;
                                                int intValue = ((Integer) obj9).intValue();
                                                tf0 tf0Var6 = (tf0) hpVar2;
                                                if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                                                    gg1 gg1Var42 = mp.PxuCJdSBwIXG;
                                                    final yz0 yz0Var7 = yz0Var62;
                                                    final dj2 dj2Var3 = dj2Var;
                                                    final int i27 = i2;
                                                    final int i28 = i;
                                                    final ug2 ug2Var4 = ug2Var32;
                                                    final oh2 oh2Var6 = oh2Var;
                                                    final wr2 wr2Var2 = wr2Var;
                                                    final n61 n61Var7 = n61Var62;
                                                    final n61 n61Var8 = ozEBbv0hFTAB;
                                                    final n61 n61Var9 = nxJAScVArhE9;
                                                    final n61 n61Var10 = n61Var52;
                                                    final hf hfVar4 = hfVar32;
                                                    final eh2 eh2Var4 = eh2Var2;
                                                    final boolean z16 = r152;
                                                    final le0 le0Var4 = le0Var2;
                                                    final df1 df1Var9 = df1Var8;
                                                    final hy hyVar5 = hyVar42;
                                                    on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                                                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                                                        
                                                            if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                                                         */
                                                        @Override // defpackage.pe0
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                        */
                                                        public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                                            n61 jq2Var;
                                                            oh2 oh2Var7 = oh2Var6;
                                                            long j8 = oh2Var7.lS5Rgt96tfkO;
                                                            hp hpVar3 = (hp) obj10;
                                                            int intValue2 = ((Integer) obj11).intValue();
                                                            tf0 tf0Var7 = (tf0) hpVar3;
                                                            if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                                gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                                                k61 k61Var = n61.Companion;
                                                                yz0 yz0Var8 = yz0.this;
                                                                n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                                                int i29 = i27;
                                                                int i30 = i28;
                                                                kj0.wLFCmsViZrNT(i29, i30);
                                                                dj2 dj2Var4 = dj2Var3;
                                                                if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                                    Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                                                }
                                                                boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                                                Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                                                if (!rtx2ld2ELZv48) {
                                                                    hp.Companion.getClass();
                                                                }
                                                                nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                                                tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                                ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                                                ug2 ug2Var5 = ug2Var4;
                                                                th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                                                ui2 ui2Var2 = vi2.Companion;
                                                                int i31 = (int) (j8 >> 32);
                                                                long j9 = ug2Var5.e9gEMXR7LXtO;
                                                                n61 n61Var11 = Y1f8riQaR6yg3;
                                                                if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                                    i31 = vi2.a92UlCVFR9N8(j8);
                                                                }
                                                                ug2Var5.e9gEMXR7LXtO = j8;
                                                                yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                                                int ordinal = th1Var2.ordinal();
                                                                if (ordinal == 0) {
                                                                    jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                                } else {
                                                                    if (ordinal != 1) {
                                                                        u9.gPXPFXrUH4XX();
                                                                        return null;
                                                                    }
                                                                    jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                                }
                                                                ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                                            } else {
                                                                tf0Var7.i68hK7ahKtgp();
                                                            }
                                                            return no2.PxuCJdSBwIXG;
                                                        }
                                                    }, tf0Var6), tf0Var6, 6);
                                                } else {
                                                    tf0Var6.i68hK7ahKtgp();
                                                }
                                                return no2.PxuCJdSBwIXG;
                                            }
                                        };
                                        tf0Var = tf0Var52;
                                        Y1f8riQaR6yg(TSizfFm2Yiuu52, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var2, tf0Var), tf0Var, 384);
                                        gg1 gg1Var42 = mp.PxuCJdSBwIXG;
                                    }
                                }
                                ai2Var3 = ai2Var2;
                                ruVar2 = ruVar;
                                n61Var3 = n61Var2;
                                obj5 = obj4;
                                d4 d4Var = new d4(yz0Var2, Pf0ThKz3j5YS, ai2Var3, eh2Var, ln0Var2, null, 1);
                                d91Var = Pf0ThKz3j5YS;
                                tf0Var3.JTxCbbCwomzt(d4Var);
                                nLZGh9p8gVSu19 = d4Var;
                                mm2.wdg6QnbFHrFF(tf0Var3, (pe0) nLZGh9p8gVSu19, no2.PxuCJdSBwIXG);
                                gg1 gg1Var22 = mp.PxuCJdSBwIXG;
                                n61 PxuCJdSBwIXG32 = lc2.PxuCJdSBwIXG(r10, 8675309, new j3(1, new mt(yz0Var2, 4)));
                                va0 va0Var32 = va0Var;
                                df1Var3 = df1Var2;
                                ia1 ia1Var2 = new ia1(yz0Var2, va0Var32, z9, eh2Var, df1Var3);
                                int i242 = 7;
                                if (z2) {
                                }
                                n61 TSizfFm2Yiuu22 = PxuCJdSBwIXG32.TSizfFm2Yiuu(new kc2(eh2Var.IAToe7bXGz4N, eh2Var.pnx5pC0XzaCw, new j3(5, eh2Var), 4));
                                yn1.Companion.getClass();
                                n61 TSizfFm2Yiuu32 = TSizfFm2Yiuu22.TSizfFm2Yiuu(new vn1());
                                final n61 ozEBbv0hFTAB2 = fx1.ozEBbv0hFTAB(r10, new cd(yz0Var2, oh2Var4, df1Var3, 2));
                                is2Var2 = is2Var;
                                int i252 = i11;
                                rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(yz0Var2) | (i12 == 2048) | tf0Var3.a92UlCVFR9N8(is2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var) | (i252 == 4) | tf0Var3.rtx2ld2ELZv4(df1Var3);
                                nLZGh9p8gVSu6 = tf0Var3.nLZGh9p8gVSu();
                                if (rtx2ld2ELZv43) {
                                }
                                final oh2 oh2Var52 = oh2Var4;
                                le0 le0Var32 = new le0() { // from class: qt
                                    @Override // defpackage.le0
                                    public final Object OPXfSBeufaJ8(Object obj8) {
                                        ei2 ei2Var2;
                                        bw0 bw0Var;
                                        yz0 yz0Var52 = yz0.this;
                                        mj1 mj1Var = yz0Var52.QrzZRwfaDlRX;
                                        bw0 bw0Var2 = (bw0) obj8;
                                        yz0Var52.rtx2ld2ELZv4 = bw0Var2;
                                        ki2 Y1f8riQaR6yg3 = yz0Var52.Y1f8riQaR6yg();
                                        if (Y1f8riQaR6yg3 != null) {
                                            Y1f8riQaR6yg3.lS5Rgt96tfkO = bw0Var2;
                                        }
                                        if (z2) {
                                            mi0 PxuCJdSBwIXG4 = yz0Var52.PxuCJdSBwIXG();
                                            mi0 mi0Var = mi0.OPXfSBeufaJ8;
                                            eh2 eh2Var4 = eh2Var;
                                            oh2 oh2Var6 = oh2Var52;
                                            if (PxuCJdSBwIXG4 == mi0Var) {
                                                if (((Boolean) yz0Var52.x50lh2ztY7Y5.getValue()).booleanValue() && ((Boolean) ((rz0) is2Var2).PxuCJdSBwIXG.getValue()).booleanValue()) {
                                                    eh2Var4.EcgxDIVH5in8();
                                                } else {
                                                    eh2Var4.QrzZRwfaDlRX();
                                                }
                                                yz0Var52.cpQdD2nAriOS.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                                yz0Var52.r3s1LDPKFs1S.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, false)));
                                                mj1Var.setValue(Boolean.valueOf(vi2.TSizfFm2Yiuu(oh2Var6.lS5Rgt96tfkO)));
                                            } else if (yz0Var52.PxuCJdSBwIXG() == mi0.wdg6QnbFHrFF) {
                                                mj1Var.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                            }
                                            df1 df1Var82 = df1Var3;
                                            ov2.Pf0ThKz3j5YS(yz0Var52, oh2Var6, df1Var82);
                                            ki2 Y1f8riQaR6yg4 = yz0Var52.Y1f8riQaR6yg();
                                            if (Y1f8riQaR6yg4 != null && (ei2Var2 = yz0Var52.e9gEMXR7LXtO) != null && yz0Var52.lS5Rgt96tfkO()) {
                                                uf2.Companion.getClass();
                                                bw0 bw0Var3 = Y1f8riQaR6yg4.lS5Rgt96tfkO;
                                                if (bw0Var3 != null && bw0Var3.aF05bpZJlKEP() && (bw0Var = Y1f8riQaR6yg4.TSizfFm2Yiuu) != null) {
                                                    ji2 ji2Var = Y1f8riQaR6yg4.PxuCJdSBwIXG;
                                                    d0 d0Var = new d0(3, bw0Var3);
                                                    qt1 ryVscX7ZL4Ux = ng0.ryVscX7ZL4Ux(bw0Var3);
                                                    qt1 nLZGh9p8gVSu20 = bw0Var3.nLZGh9p8gVSu(bw0Var, false);
                                                    if (cs0.wdg6QnbFHrFF((ei2) ei2Var2.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var2)) {
                                                        ei2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu(oh2Var6, df1Var82, ji2Var, d0Var, ryVscX7ZL4Ux, nLZGh9p8gVSu20);
                                                    }
                                                }
                                            }
                                        }
                                        return no2.PxuCJdSBwIXG;
                                    }
                                };
                                is2Var3 = is2Var2;
                                df1Var3 = df1Var3;
                                tf0Var3.JTxCbbCwomzt(le0Var32);
                                nLZGh9p8gVSu6 = le0Var32;
                                final n61 nxJAScVArhE92 = mm2.nxJAScVArhE9(r10, (le0) nLZGh9p8gVSu6);
                                yz0 yz0Var52 = yz0Var2;
                                eh2Var2 = eh2Var;
                                ai2 ai2Var62 = ai2Var3;
                                yt ytVar2 = new yt(yk2Var, oh2Var, yz0Var52, z2, df1Var3, eh2Var2, ln0Var, va0Var32);
                                yz0Var3 = yz0Var52;
                                if (!z2) {
                                }
                                df1Var4 = df1Var3;
                                n61Var4 = r10;
                                rtx2ld2ELZv44 = tf0Var3.rtx2ld2ELZv4(eh2Var2);
                                nLZGh9p8gVSu7 = tf0Var3.nLZGh9p8gVSu();
                                if (!rtx2ld2ELZv44) {
                                }
                                nLZGh9p8gVSu7 = new rt(eh2Var2, 0);
                                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu7);
                                mm2.rtx2ld2ELZv4(eh2Var2, (le0) nLZGh9p8gVSu7, tf0Var3);
                                rtx2ld2ELZv45 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.rtx2ld2ELZv4(ai2Var62) | (i252 == 4) | ((i10 <= 32 && tf0Var3.a92UlCVFR9N8(ln0Var)) || (i13 & 48) == 32);
                                nLZGh9p8gVSu8 = tf0Var3.nLZGh9p8gVSu();
                                if (rtx2ld2ELZv45) {
                                }
                                d7 d7Var2 = new d7(yz0Var3, ai2Var62, oh2Var, ln0Var, 1);
                                ln0Var3 = ln0Var;
                                tf0Var3.JTxCbbCwomzt(d7Var2);
                                nLZGh9p8gVSu8 = d7Var2;
                                mm2.rtx2ld2ELZv4(ln0Var3, (le0) nLZGh9p8gVSu8, tf0Var3);
                                final le0 mtVar2 = yz0Var3.VhhvGxCb8gfr;
                                if (i == 1) {
                                }
                                final int i262 = ln0Var3.Y1f8riQaR6yg;
                                final lo2 lo2Var32 = lo2Var2;
                                final df1 df1Var82 = df1Var4;
                                n61 VhhvGxCb8gfr2 = VhhvGxCb8gfr(r10, new qe0() { // from class: eg2
                                    @Override // defpackage.qe0
                                    public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                        ((Integer) obj10).getClass();
                                        tf0 tf0Var53 = (tf0) ((hp) obj9);
                                        tf0Var53.IXK6ba3ucyzm(851809892);
                                        gg1 gg1Var33 = mp.PxuCJdSBwIXG;
                                        Object nLZGh9p8gVSu20 = tf0Var53.nLZGh9p8gVSu();
                                        hp.Companion.getClass();
                                        jx1 jx1Var = fp.lS5Rgt96tfkO;
                                        if (nLZGh9p8gVSu20 == jx1Var) {
                                            nLZGh9p8gVSu20 = new ti2();
                                            tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                        }
                                        ti2 ti2Var = (ti2) nLZGh9p8gVSu20;
                                        Object nLZGh9p8gVSu21 = tf0Var53.nLZGh9p8gVSu();
                                        if (nLZGh9p8gVSu21 == jx1Var) {
                                            nLZGh9p8gVSu21 = new xv();
                                            tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu21);
                                        }
                                        dg2 dg2Var = new dg2(yz0.this, eh2Var2, oh2Var, z14, z15, ti2Var, df1Var82, lo2Var32, (xv) nLZGh9p8gVSu21, mtVar2, i262);
                                        k61 k61Var = n61.Companion;
                                        boolean rtx2ld2ELZv48 = tf0Var53.rtx2ld2ELZv4(dg2Var);
                                        Object nLZGh9p8gVSu22 = tf0Var53.nLZGh9p8gVSu();
                                        if (rtx2ld2ELZv48 || nLZGh9p8gVSu22 == jx1Var) {
                                            RAsUl2FVSrh6 rAsUl2FVSrh6 = new RAsUl2FVSrh6(1, dg2Var, dg2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                                            tf0Var53.JTxCbbCwomzt(rAsUl2FVSrh6);
                                            nLZGh9p8gVSu22 = rAsUl2FVSrh6;
                                        }
                                        n61 aF05bpZJlKEP = hq0.aF05bpZJlKEP(k61Var, (le0) ((af0) nLZGh9p8gVSu22));
                                        tf0Var53.gPXPFXrUH4XX(false);
                                        return aF05bpZJlKEP;
                                    }
                                });
                                hv0.Companion.getClass();
                                i16 = i8;
                                if (i16 == 7) {
                                    z12 = true;
                                    boolean booleanValue22 = ((Boolean) d91Var.getValue()).booleanValue();
                                    f4 f4Var322 = f4Var;
                                    RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var322);
                                    nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
                                    if (!RAsUl2FVSrh62) {
                                    }
                                    nLZGh9p8gVSu9 = new uq(z12, f4Var322);
                                    tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
                                    n61 EpkonXwzFgDB22 = bs0.EpkonXwzFgDB(r10, booleanValue22, z12, (ae0) nLZGh9p8gVSu9);
                                    uf ufVar22 = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
                                    long j722 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
                                    if (!hl.TSizfFm2Yiuu(j722, mm2.TSizfFm2Yiuu(1308617531))) {
                                    }
                                    rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
                                    nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
                                    if (!rtx2ld2ELZv46) {
                                    }
                                    nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
                                    tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
                                    n61 J54yh1s3n4Aq22 = fx1.J54yh1s3n4Aq(r10, (le0) nLZGh9p8gVSu10);
                                    gg1 gg1Var322 = mp.PxuCJdSBwIXG;
                                    i17 = 0;
                                    n61 TSizfFm2Yiuu422 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq22), f4Var322, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB22).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr2);
                                    final ug2 ug2Var322 = ug2Var;
                                    n61 TSizfFm2Yiuu522 = mm2.nxJAScVArhE9(TSizfFm2Yiuu422.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                                        /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                                        
                                            if (r14 == r4) goto L16;
                                         */
                                        @Override // defpackage.qe0
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                            ug2 ug2Var4 = ug2.this;
                                            mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                                            ((Integer) obj10).getClass();
                                            tf0 tf0Var522 = (tf0) ((hp) obj9);
                                            tf0Var522.IXK6ba3ucyzm(-2137546592);
                                            gg1 gg1Var422 = mp.PxuCJdSBwIXG;
                                            boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var522.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                                            boolean a92UlCVFR9N85 = tf0Var522.a92UlCVFR9N8(ug2Var4);
                                            Object nLZGh9p8gVSu20 = tf0Var522.nLZGh9p8gVSu();
                                            Object obj11 = fp.lS5Rgt96tfkO;
                                            if (!a92UlCVFR9N85) {
                                                hp.Companion.getClass();
                                            }
                                            nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                                            tf0Var522.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                            d91 Pf0ThKz3j5YS2 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var522);
                                            Object nLZGh9p8gVSu21 = tf0Var522.nLZGh9p8gVSu();
                                            hp.Companion.getClass();
                                            if (nLZGh9p8gVSu21 == obj11) {
                                                Object axVar = new ax(new o6(Pf0ThKz3j5YS2, 3));
                                                tf0Var522.JTxCbbCwomzt(axVar);
                                                nLZGh9p8gVSu21 = axVar;
                                            }
                                            e12 e12Var = (e12) nLZGh9p8gVSu21;
                                            boolean a92UlCVFR9N86 = tf0Var522.a92UlCVFR9N8(e12Var) | tf0Var522.a92UlCVFR9N8(ug2Var4);
                                            Object nLZGh9p8gVSu22 = tf0Var522.nLZGh9p8gVSu();
                                            if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                                                nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                                                tf0Var522.JTxCbbCwomzt(nLZGh9p8gVSu22);
                                            }
                                            n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                                            tf0Var522.gPXPFXrUH4XX(false);
                                            return lS5Rgt96tfkO4;
                                        }
                                    })).TSizfFm2Yiuu(TSizfFm2Yiuu32).TSizfFm2Yiuu(ytVar2), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
                                    if (z2) {
                                    }
                                    if (i17 != 0) {
                                    }
                                    final n61 n61Var522 = r10;
                                    tf0 tf0Var522 = tf0Var3;
                                    final hy hyVar422 = hyVar2;
                                    final hf hfVar322 = hfVar;
                                    final n61 n61Var622 = n61Var4;
                                    final yz0 yz0Var622 = yz0Var3;
                                    final boolean r1522 = i17;
                                    pe0 pe0Var22 = new pe0() { // from class: nt
                                        @Override // defpackage.pe0
                                        public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                                            hp hpVar2 = (hp) obj8;
                                            int intValue = ((Integer) obj9).intValue();
                                            tf0 tf0Var6 = (tf0) hpVar2;
                                            if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                                                gg1 gg1Var422 = mp.PxuCJdSBwIXG;
                                                final yz0 yz0Var7 = yz0Var622;
                                                final dj2 dj2Var3 = dj2Var;
                                                final int i27 = i2;
                                                final int i28 = i;
                                                final ug2 ug2Var4 = ug2Var322;
                                                final oh2 oh2Var6 = oh2Var;
                                                final wr2 wr2Var2 = wr2Var;
                                                final n61 n61Var7 = n61Var622;
                                                final n61 n61Var8 = ozEBbv0hFTAB2;
                                                final n61 n61Var9 = nxJAScVArhE92;
                                                final n61 n61Var10 = n61Var522;
                                                final hf hfVar4 = hfVar322;
                                                final eh2 eh2Var4 = eh2Var2;
                                                final boolean z16 = r1522;
                                                final le0 le0Var4 = le0Var2;
                                                final df1 df1Var9 = df1Var82;
                                                final hy hyVar5 = hyVar422;
                                                on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                                                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                                                    
                                                        if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                                                     */
                                                    @Override // defpackage.pe0
                                                    /*
                                                        Code decompiled incorrectly, please refer to instructions dump.
                                                    */
                                                    public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                                        n61 jq2Var;
                                                        oh2 oh2Var7 = oh2Var6;
                                                        long j8 = oh2Var7.lS5Rgt96tfkO;
                                                        hp hpVar3 = (hp) obj10;
                                                        int intValue2 = ((Integer) obj11).intValue();
                                                        tf0 tf0Var7 = (tf0) hpVar3;
                                                        if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                            gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                                            k61 k61Var = n61.Companion;
                                                            yz0 yz0Var8 = yz0.this;
                                                            n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                                            int i29 = i27;
                                                            int i30 = i28;
                                                            kj0.wLFCmsViZrNT(i29, i30);
                                                            dj2 dj2Var4 = dj2Var3;
                                                            if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                                Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                                            }
                                                            boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                                            Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                                            if (!rtx2ld2ELZv48) {
                                                                hp.Companion.getClass();
                                                            }
                                                            nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                                            tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                            ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                                            ug2 ug2Var5 = ug2Var4;
                                                            th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                                            ui2 ui2Var2 = vi2.Companion;
                                                            int i31 = (int) (j8 >> 32);
                                                            long j9 = ug2Var5.e9gEMXR7LXtO;
                                                            n61 n61Var11 = Y1f8riQaR6yg3;
                                                            if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                                i31 = vi2.a92UlCVFR9N8(j8);
                                                            }
                                                            ug2Var5.e9gEMXR7LXtO = j8;
                                                            yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                                            int ordinal = th1Var2.ordinal();
                                                            if (ordinal == 0) {
                                                                jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                            } else {
                                                                if (ordinal != 1) {
                                                                    u9.gPXPFXrUH4XX();
                                                                    return null;
                                                                }
                                                                jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                            }
                                                            ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                                        } else {
                                                            tf0Var7.i68hK7ahKtgp();
                                                        }
                                                        return no2.PxuCJdSBwIXG;
                                                    }
                                                }, tf0Var6), tf0Var6, 6);
                                            } else {
                                                tf0Var6.i68hK7ahKtgp();
                                            }
                                            return no2.PxuCJdSBwIXG;
                                        }
                                    };
                                    tf0Var = tf0Var522;
                                    Y1f8riQaR6yg(TSizfFm2Yiuu522, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var22, tf0Var), tf0Var, 384);
                                    gg1 gg1Var422 = mp.PxuCJdSBwIXG;
                                }
                                z12 = false;
                                boolean booleanValue222 = ((Boolean) d91Var.getValue()).booleanValue();
                                f4 f4Var3222 = f4Var;
                                RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var3222);
                                nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
                                if (!RAsUl2FVSrh62) {
                                }
                                nLZGh9p8gVSu9 = new uq(z12, f4Var3222);
                                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
                                n61 EpkonXwzFgDB222 = bs0.EpkonXwzFgDB(r10, booleanValue222, z12, (ae0) nLZGh9p8gVSu9);
                                uf ufVar222 = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
                                long j7222 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
                                if (!hl.TSizfFm2Yiuu(j7222, mm2.TSizfFm2Yiuu(1308617531))) {
                                }
                                rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
                                nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
                                if (!rtx2ld2ELZv46) {
                                }
                                nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
                                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
                                n61 J54yh1s3n4Aq222 = fx1.J54yh1s3n4Aq(r10, (le0) nLZGh9p8gVSu10);
                                gg1 gg1Var3222 = mp.PxuCJdSBwIXG;
                                i17 = 0;
                                n61 TSizfFm2Yiuu4222 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq222), f4Var3222, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB222).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr2);
                                final ug2 ug2Var3222 = ug2Var;
                                n61 TSizfFm2Yiuu5222 = mm2.nxJAScVArhE9(TSizfFm2Yiuu4222.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                                    
                                        if (r14 == r4) goto L16;
                                     */
                                    @Override // defpackage.qe0
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                        ug2 ug2Var4 = ug2.this;
                                        mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                                        ((Integer) obj10).getClass();
                                        tf0 tf0Var5222 = (tf0) ((hp) obj9);
                                        tf0Var5222.IXK6ba3ucyzm(-2137546592);
                                        gg1 gg1Var4222 = mp.PxuCJdSBwIXG;
                                        boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var5222.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                                        boolean a92UlCVFR9N85 = tf0Var5222.a92UlCVFR9N8(ug2Var4);
                                        Object nLZGh9p8gVSu20 = tf0Var5222.nLZGh9p8gVSu();
                                        Object obj11 = fp.lS5Rgt96tfkO;
                                        if (!a92UlCVFR9N85) {
                                            hp.Companion.getClass();
                                        }
                                        nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                                        tf0Var5222.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                        d91 Pf0ThKz3j5YS2 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var5222);
                                        Object nLZGh9p8gVSu21 = tf0Var5222.nLZGh9p8gVSu();
                                        hp.Companion.getClass();
                                        if (nLZGh9p8gVSu21 == obj11) {
                                            Object axVar = new ax(new o6(Pf0ThKz3j5YS2, 3));
                                            tf0Var5222.JTxCbbCwomzt(axVar);
                                            nLZGh9p8gVSu21 = axVar;
                                        }
                                        e12 e12Var = (e12) nLZGh9p8gVSu21;
                                        boolean a92UlCVFR9N86 = tf0Var5222.a92UlCVFR9N8(e12Var) | tf0Var5222.a92UlCVFR9N8(ug2Var4);
                                        Object nLZGh9p8gVSu22 = tf0Var5222.nLZGh9p8gVSu();
                                        if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                                            nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                                            tf0Var5222.JTxCbbCwomzt(nLZGh9p8gVSu22);
                                        }
                                        n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                                        tf0Var5222.gPXPFXrUH4XX(false);
                                        return lS5Rgt96tfkO4;
                                    }
                                })).TSizfFm2Yiuu(TSizfFm2Yiuu32).TSizfFm2Yiuu(ytVar2), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
                                if (z2) {
                                }
                                if (i17 != 0) {
                                }
                                final n61 n61Var5222 = r10;
                                tf0 tf0Var5222 = tf0Var3;
                                final hy hyVar4222 = hyVar2;
                                final hf hfVar3222 = hfVar;
                                final n61 n61Var6222 = n61Var4;
                                final yz0 yz0Var6222 = yz0Var3;
                                final boolean r15222 = i17;
                                pe0 pe0Var222 = new pe0() { // from class: nt
                                    @Override // defpackage.pe0
                                    public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                                        hp hpVar2 = (hp) obj8;
                                        int intValue = ((Integer) obj9).intValue();
                                        tf0 tf0Var6 = (tf0) hpVar2;
                                        if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                                            gg1 gg1Var4222 = mp.PxuCJdSBwIXG;
                                            final yz0 yz0Var7 = yz0Var6222;
                                            final dj2 dj2Var3 = dj2Var;
                                            final int i27 = i2;
                                            final int i28 = i;
                                            final ug2 ug2Var4 = ug2Var3222;
                                            final oh2 oh2Var6 = oh2Var;
                                            final wr2 wr2Var2 = wr2Var;
                                            final n61 n61Var7 = n61Var6222;
                                            final n61 n61Var8 = ozEBbv0hFTAB2;
                                            final n61 n61Var9 = nxJAScVArhE92;
                                            final n61 n61Var10 = n61Var5222;
                                            final hf hfVar4 = hfVar3222;
                                            final eh2 eh2Var4 = eh2Var2;
                                            final boolean z16 = r15222;
                                            final le0 le0Var4 = le0Var2;
                                            final df1 df1Var9 = df1Var82;
                                            final hy hyVar5 = hyVar4222;
                                            on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                                                /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                                                
                                                    if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                                                 */
                                                @Override // defpackage.pe0
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                                    n61 jq2Var;
                                                    oh2 oh2Var7 = oh2Var6;
                                                    long j8 = oh2Var7.lS5Rgt96tfkO;
                                                    hp hpVar3 = (hp) obj10;
                                                    int intValue2 = ((Integer) obj11).intValue();
                                                    tf0 tf0Var7 = (tf0) hpVar3;
                                                    if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                        gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                                        k61 k61Var = n61.Companion;
                                                        yz0 yz0Var8 = yz0.this;
                                                        n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                                        int i29 = i27;
                                                        int i30 = i28;
                                                        kj0.wLFCmsViZrNT(i29, i30);
                                                        dj2 dj2Var4 = dj2Var3;
                                                        if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                            Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                                        }
                                                        boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                                        Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                                        if (!rtx2ld2ELZv48) {
                                                            hp.Companion.getClass();
                                                        }
                                                        nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                                        tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                        ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                                        ug2 ug2Var5 = ug2Var4;
                                                        th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                                        ui2 ui2Var2 = vi2.Companion;
                                                        int i31 = (int) (j8 >> 32);
                                                        long j9 = ug2Var5.e9gEMXR7LXtO;
                                                        n61 n61Var11 = Y1f8riQaR6yg3;
                                                        if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                            i31 = vi2.a92UlCVFR9N8(j8);
                                                        }
                                                        ug2Var5.e9gEMXR7LXtO = j8;
                                                        yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                                        int ordinal = th1Var2.ordinal();
                                                        if (ordinal == 0) {
                                                            jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                        } else {
                                                            if (ordinal != 1) {
                                                                u9.gPXPFXrUH4XX();
                                                                return null;
                                                            }
                                                            jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                        }
                                                        ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                                    } else {
                                                        tf0Var7.i68hK7ahKtgp();
                                                    }
                                                    return no2.PxuCJdSBwIXG;
                                                }
                                            }, tf0Var6), tf0Var6, 6);
                                        } else {
                                            tf0Var6.i68hK7ahKtgp();
                                        }
                                        return no2.PxuCJdSBwIXG;
                                    }
                                };
                                tf0Var = tf0Var5222;
                                Y1f8riQaR6yg(TSizfFm2Yiuu5222, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var222, tf0Var), tf0Var, 384);
                                gg1 gg1Var4222 = mp.PxuCJdSBwIXG;
                            }
                        } else {
                            n61Var2 = nLZGh9p8gVSu5;
                        }
                        z10 = true;
                        z11 = z10 | a92UlCVFR9N84;
                        Object nLZGh9p8gVSu192 = tf0Var3.nLZGh9p8gVSu();
                        if (!z11) {
                        }
                        ai2Var3 = ai2Var2;
                        ruVar2 = ruVar;
                        n61Var3 = n61Var2;
                        obj5 = obj4;
                        d4 d4Var2 = new d4(yz0Var2, Pf0ThKz3j5YS, ai2Var3, eh2Var, ln0Var2, null, 1);
                        d91Var = Pf0ThKz3j5YS;
                        tf0Var3.JTxCbbCwomzt(d4Var2);
                        nLZGh9p8gVSu192 = d4Var2;
                        mm2.wdg6QnbFHrFF(tf0Var3, (pe0) nLZGh9p8gVSu192, no2.PxuCJdSBwIXG);
                        gg1 gg1Var222 = mp.PxuCJdSBwIXG;
                        n61 PxuCJdSBwIXG322 = lc2.PxuCJdSBwIXG(r10, 8675309, new j3(1, new mt(yz0Var2, 4)));
                        va0 va0Var322 = va0Var;
                        df1Var3 = df1Var2;
                        ia1 ia1Var22 = new ia1(yz0Var2, va0Var322, z9, eh2Var, df1Var3);
                        int i2422 = 7;
                        if (z2) {
                        }
                        n61 TSizfFm2Yiuu222 = PxuCJdSBwIXG322.TSizfFm2Yiuu(new kc2(eh2Var.IAToe7bXGz4N, eh2Var.pnx5pC0XzaCw, new j3(5, eh2Var), 4));
                        yn1.Companion.getClass();
                        n61 TSizfFm2Yiuu322 = TSizfFm2Yiuu222.TSizfFm2Yiuu(new vn1());
                        final n61 ozEBbv0hFTAB22 = fx1.ozEBbv0hFTAB(r10, new cd(yz0Var2, oh2Var4, df1Var3, 2));
                        is2Var2 = is2Var;
                        int i2522 = i11;
                        rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(yz0Var2) | (i12 == 2048) | tf0Var3.a92UlCVFR9N8(is2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var) | (i2522 == 4) | tf0Var3.rtx2ld2ELZv4(df1Var3);
                        nLZGh9p8gVSu6 = tf0Var3.nLZGh9p8gVSu();
                        if (rtx2ld2ELZv43) {
                        }
                        final oh2 oh2Var522 = oh2Var4;
                        le0 le0Var322 = new le0() { // from class: qt
                            @Override // defpackage.le0
                            public final Object OPXfSBeufaJ8(Object obj8) {
                                ei2 ei2Var2;
                                bw0 bw0Var;
                                yz0 yz0Var522 = yz0.this;
                                mj1 mj1Var = yz0Var522.QrzZRwfaDlRX;
                                bw0 bw0Var2 = (bw0) obj8;
                                yz0Var522.rtx2ld2ELZv4 = bw0Var2;
                                ki2 Y1f8riQaR6yg3 = yz0Var522.Y1f8riQaR6yg();
                                if (Y1f8riQaR6yg3 != null) {
                                    Y1f8riQaR6yg3.lS5Rgt96tfkO = bw0Var2;
                                }
                                if (z2) {
                                    mi0 PxuCJdSBwIXG4 = yz0Var522.PxuCJdSBwIXG();
                                    mi0 mi0Var = mi0.OPXfSBeufaJ8;
                                    eh2 eh2Var4 = eh2Var;
                                    oh2 oh2Var6 = oh2Var522;
                                    if (PxuCJdSBwIXG4 == mi0Var) {
                                        if (((Boolean) yz0Var522.x50lh2ztY7Y5.getValue()).booleanValue() && ((Boolean) ((rz0) is2Var2).PxuCJdSBwIXG.getValue()).booleanValue()) {
                                            eh2Var4.EcgxDIVH5in8();
                                        } else {
                                            eh2Var4.QrzZRwfaDlRX();
                                        }
                                        yz0Var522.cpQdD2nAriOS.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                        yz0Var522.r3s1LDPKFs1S.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, false)));
                                        mj1Var.setValue(Boolean.valueOf(vi2.TSizfFm2Yiuu(oh2Var6.lS5Rgt96tfkO)));
                                    } else if (yz0Var522.PxuCJdSBwIXG() == mi0.wdg6QnbFHrFF) {
                                        mj1Var.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                    }
                                    df1 df1Var822 = df1Var3;
                                    ov2.Pf0ThKz3j5YS(yz0Var522, oh2Var6, df1Var822);
                                    ki2 Y1f8riQaR6yg4 = yz0Var522.Y1f8riQaR6yg();
                                    if (Y1f8riQaR6yg4 != null && (ei2Var2 = yz0Var522.e9gEMXR7LXtO) != null && yz0Var522.lS5Rgt96tfkO()) {
                                        uf2.Companion.getClass();
                                        bw0 bw0Var3 = Y1f8riQaR6yg4.lS5Rgt96tfkO;
                                        if (bw0Var3 != null && bw0Var3.aF05bpZJlKEP() && (bw0Var = Y1f8riQaR6yg4.TSizfFm2Yiuu) != null) {
                                            ji2 ji2Var = Y1f8riQaR6yg4.PxuCJdSBwIXG;
                                            d0 d0Var = new d0(3, bw0Var3);
                                            qt1 ryVscX7ZL4Ux = ng0.ryVscX7ZL4Ux(bw0Var3);
                                            qt1 nLZGh9p8gVSu20 = bw0Var3.nLZGh9p8gVSu(bw0Var, false);
                                            if (cs0.wdg6QnbFHrFF((ei2) ei2Var2.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var2)) {
                                                ei2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu(oh2Var6, df1Var822, ji2Var, d0Var, ryVscX7ZL4Ux, nLZGh9p8gVSu20);
                                            }
                                        }
                                    }
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        };
                        is2Var3 = is2Var2;
                        df1Var3 = df1Var3;
                        tf0Var3.JTxCbbCwomzt(le0Var322);
                        nLZGh9p8gVSu6 = le0Var322;
                        final n61 nxJAScVArhE922 = mm2.nxJAScVArhE9(r10, (le0) nLZGh9p8gVSu6);
                        yz0 yz0Var522 = yz0Var2;
                        eh2Var2 = eh2Var;
                        ai2 ai2Var622 = ai2Var3;
                        yt ytVar22 = new yt(yk2Var, oh2Var, yz0Var522, z2, df1Var3, eh2Var2, ln0Var, va0Var322);
                        yz0Var3 = yz0Var522;
                        if (!z2) {
                        }
                        df1Var4 = df1Var3;
                        n61Var4 = r10;
                        rtx2ld2ELZv44 = tf0Var3.rtx2ld2ELZv4(eh2Var2);
                        nLZGh9p8gVSu7 = tf0Var3.nLZGh9p8gVSu();
                        if (!rtx2ld2ELZv44) {
                        }
                        nLZGh9p8gVSu7 = new rt(eh2Var2, 0);
                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu7);
                        mm2.rtx2ld2ELZv4(eh2Var2, (le0) nLZGh9p8gVSu7, tf0Var3);
                        rtx2ld2ELZv45 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.rtx2ld2ELZv4(ai2Var622) | (i2522 == 4) | ((i10 <= 32 && tf0Var3.a92UlCVFR9N8(ln0Var)) || (i13 & 48) == 32);
                        nLZGh9p8gVSu8 = tf0Var3.nLZGh9p8gVSu();
                        if (rtx2ld2ELZv45) {
                        }
                        d7 d7Var22 = new d7(yz0Var3, ai2Var622, oh2Var, ln0Var, 1);
                        ln0Var3 = ln0Var;
                        tf0Var3.JTxCbbCwomzt(d7Var22);
                        nLZGh9p8gVSu8 = d7Var22;
                        mm2.rtx2ld2ELZv4(ln0Var3, (le0) nLZGh9p8gVSu8, tf0Var3);
                        final le0 mtVar22 = yz0Var3.VhhvGxCb8gfr;
                        if (i == 1) {
                        }
                        final int i2622 = ln0Var3.Y1f8riQaR6yg;
                        final lo2 lo2Var322 = lo2Var2;
                        final df1 df1Var822 = df1Var4;
                        n61 VhhvGxCb8gfr22 = VhhvGxCb8gfr(r10, new qe0() { // from class: eg2
                            @Override // defpackage.qe0
                            public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                ((Integer) obj10).getClass();
                                tf0 tf0Var53 = (tf0) ((hp) obj9);
                                tf0Var53.IXK6ba3ucyzm(851809892);
                                gg1 gg1Var33 = mp.PxuCJdSBwIXG;
                                Object nLZGh9p8gVSu20 = tf0Var53.nLZGh9p8gVSu();
                                hp.Companion.getClass();
                                jx1 jx1Var = fp.lS5Rgt96tfkO;
                                if (nLZGh9p8gVSu20 == jx1Var) {
                                    nLZGh9p8gVSu20 = new ti2();
                                    tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                }
                                ti2 ti2Var = (ti2) nLZGh9p8gVSu20;
                                Object nLZGh9p8gVSu21 = tf0Var53.nLZGh9p8gVSu();
                                if (nLZGh9p8gVSu21 == jx1Var) {
                                    nLZGh9p8gVSu21 = new xv();
                                    tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu21);
                                }
                                dg2 dg2Var = new dg2(yz0.this, eh2Var2, oh2Var, z14, z15, ti2Var, df1Var822, lo2Var322, (xv) nLZGh9p8gVSu21, mtVar22, i2622);
                                k61 k61Var = n61.Companion;
                                boolean rtx2ld2ELZv48 = tf0Var53.rtx2ld2ELZv4(dg2Var);
                                Object nLZGh9p8gVSu22 = tf0Var53.nLZGh9p8gVSu();
                                if (rtx2ld2ELZv48 || nLZGh9p8gVSu22 == jx1Var) {
                                    RAsUl2FVSrh6 rAsUl2FVSrh6 = new RAsUl2FVSrh6(1, dg2Var, dg2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                                    tf0Var53.JTxCbbCwomzt(rAsUl2FVSrh6);
                                    nLZGh9p8gVSu22 = rAsUl2FVSrh6;
                                }
                                n61 aF05bpZJlKEP = hq0.aF05bpZJlKEP(k61Var, (le0) ((af0) nLZGh9p8gVSu22));
                                tf0Var53.gPXPFXrUH4XX(false);
                                return aF05bpZJlKEP;
                            }
                        });
                        hv0.Companion.getClass();
                        i16 = i8;
                        if (i16 == 7) {
                        }
                        z12 = false;
                        boolean booleanValue2222 = ((Boolean) d91Var.getValue()).booleanValue();
                        f4 f4Var32222 = f4Var;
                        RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var32222);
                        nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
                        if (!RAsUl2FVSrh62) {
                        }
                        nLZGh9p8gVSu9 = new uq(z12, f4Var32222);
                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
                        n61 EpkonXwzFgDB2222 = bs0.EpkonXwzFgDB(r10, booleanValue2222, z12, (ae0) nLZGh9p8gVSu9);
                        uf ufVar2222 = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
                        long j72222 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
                        if (!hl.TSizfFm2Yiuu(j72222, mm2.TSizfFm2Yiuu(1308617531))) {
                        }
                        rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
                        nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
                        if (!rtx2ld2ELZv46) {
                        }
                        nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
                        n61 J54yh1s3n4Aq2222 = fx1.J54yh1s3n4Aq(r10, (le0) nLZGh9p8gVSu10);
                        gg1 gg1Var32222 = mp.PxuCJdSBwIXG;
                        i17 = 0;
                        n61 TSizfFm2Yiuu42222 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq2222), f4Var32222, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB2222).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr22);
                        final ug2 ug2Var32222 = ug2Var;
                        n61 TSizfFm2Yiuu52222 = mm2.nxJAScVArhE9(TSizfFm2Yiuu42222.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                            /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                            
                                if (r14 == r4) goto L16;
                             */
                            @Override // defpackage.qe0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                ug2 ug2Var4 = ug2.this;
                                mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                                ((Integer) obj10).getClass();
                                tf0 tf0Var52222 = (tf0) ((hp) obj9);
                                tf0Var52222.IXK6ba3ucyzm(-2137546592);
                                gg1 gg1Var42222 = mp.PxuCJdSBwIXG;
                                boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var52222.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                                boolean a92UlCVFR9N85 = tf0Var52222.a92UlCVFR9N8(ug2Var4);
                                Object nLZGh9p8gVSu20 = tf0Var52222.nLZGh9p8gVSu();
                                Object obj11 = fp.lS5Rgt96tfkO;
                                if (!a92UlCVFR9N85) {
                                    hp.Companion.getClass();
                                }
                                nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                                tf0Var52222.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                d91 Pf0ThKz3j5YS2 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var52222);
                                Object nLZGh9p8gVSu21 = tf0Var52222.nLZGh9p8gVSu();
                                hp.Companion.getClass();
                                if (nLZGh9p8gVSu21 == obj11) {
                                    Object axVar = new ax(new o6(Pf0ThKz3j5YS2, 3));
                                    tf0Var52222.JTxCbbCwomzt(axVar);
                                    nLZGh9p8gVSu21 = axVar;
                                }
                                e12 e12Var = (e12) nLZGh9p8gVSu21;
                                boolean a92UlCVFR9N86 = tf0Var52222.a92UlCVFR9N8(e12Var) | tf0Var52222.a92UlCVFR9N8(ug2Var4);
                                Object nLZGh9p8gVSu22 = tf0Var52222.nLZGh9p8gVSu();
                                if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                                    nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                                    tf0Var52222.JTxCbbCwomzt(nLZGh9p8gVSu22);
                                }
                                n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                                tf0Var52222.gPXPFXrUH4XX(false);
                                return lS5Rgt96tfkO4;
                            }
                        })).TSizfFm2Yiuu(TSizfFm2Yiuu322).TSizfFm2Yiuu(ytVar22), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
                        if (z2) {
                        }
                        if (i17 != 0) {
                        }
                        final n61 n61Var52222 = r10;
                        tf0 tf0Var52222 = tf0Var3;
                        final hy hyVar42222 = hyVar2;
                        final hf hfVar32222 = hfVar;
                        final n61 n61Var62222 = n61Var4;
                        final yz0 yz0Var62222 = yz0Var3;
                        final boolean r152222 = i17;
                        pe0 pe0Var2222 = new pe0() { // from class: nt
                            @Override // defpackage.pe0
                            public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                                hp hpVar2 = (hp) obj8;
                                int intValue = ((Integer) obj9).intValue();
                                tf0 tf0Var6 = (tf0) hpVar2;
                                if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                                    gg1 gg1Var42222 = mp.PxuCJdSBwIXG;
                                    final yz0 yz0Var7 = yz0Var62222;
                                    final dj2 dj2Var3 = dj2Var;
                                    final int i27 = i2;
                                    final int i28 = i;
                                    final ug2 ug2Var4 = ug2Var32222;
                                    final oh2 oh2Var6 = oh2Var;
                                    final wr2 wr2Var2 = wr2Var;
                                    final n61 n61Var7 = n61Var62222;
                                    final n61 n61Var8 = ozEBbv0hFTAB22;
                                    final n61 n61Var9 = nxJAScVArhE922;
                                    final n61 n61Var10 = n61Var52222;
                                    final hf hfVar4 = hfVar32222;
                                    final eh2 eh2Var4 = eh2Var2;
                                    final boolean z16 = r152222;
                                    final le0 le0Var4 = le0Var2;
                                    final df1 df1Var9 = df1Var822;
                                    final hy hyVar5 = hyVar42222;
                                    on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                                        
                                            if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                                         */
                                        @Override // defpackage.pe0
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                            n61 jq2Var;
                                            oh2 oh2Var7 = oh2Var6;
                                            long j8 = oh2Var7.lS5Rgt96tfkO;
                                            hp hpVar3 = (hp) obj10;
                                            int intValue2 = ((Integer) obj11).intValue();
                                            tf0 tf0Var7 = (tf0) hpVar3;
                                            if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                                k61 k61Var = n61.Companion;
                                                yz0 yz0Var8 = yz0.this;
                                                n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                                int i29 = i27;
                                                int i30 = i28;
                                                kj0.wLFCmsViZrNT(i29, i30);
                                                dj2 dj2Var4 = dj2Var3;
                                                if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                    Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                                }
                                                boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                                Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                                if (!rtx2ld2ELZv48) {
                                                    hp.Companion.getClass();
                                                }
                                                nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                                tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                                ug2 ug2Var5 = ug2Var4;
                                                th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                                ui2 ui2Var2 = vi2.Companion;
                                                int i31 = (int) (j8 >> 32);
                                                long j9 = ug2Var5.e9gEMXR7LXtO;
                                                n61 n61Var11 = Y1f8riQaR6yg3;
                                                if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                    i31 = vi2.a92UlCVFR9N8(j8);
                                                }
                                                ug2Var5.e9gEMXR7LXtO = j8;
                                                yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                                int ordinal = th1Var2.ordinal();
                                                if (ordinal == 0) {
                                                    jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                } else {
                                                    if (ordinal != 1) {
                                                        u9.gPXPFXrUH4XX();
                                                        return null;
                                                    }
                                                    jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                }
                                                ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                            } else {
                                                tf0Var7.i68hK7ahKtgp();
                                            }
                                            return no2.PxuCJdSBwIXG;
                                        }
                                    }, tf0Var6), tf0Var6, 6);
                                } else {
                                    tf0Var6.i68hK7ahKtgp();
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        };
                        tf0Var = tf0Var52222;
                        Y1f8riQaR6yg(TSizfFm2Yiuu52222, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var2222, tf0Var), tf0Var, 384);
                        gg1 gg1Var42222 = mp.PxuCJdSBwIXG;
                    }
                    ai2Var = ai2Var4;
                    if ((i19 & 48) != 32) {
                        z8 = false;
                        rtx2ld2ELZv42 = rtx2ld2ELZv47 | z8 | tf0Var2.rtx2ld2ELZv4(df1Var7) | tf0Var2.rtx2ld2ELZv4(ruVar3) | tf0Var2.rtx2ld2ELZv4(hfVar2) | tf0Var2.rtx2ld2ELZv4(eh2Var3);
                        Object nLZGh9p8gVSu182 = tf0Var2.nLZGh9p8gVSu();
                        if (rtx2ld2ELZv42) {
                        }
                        i11 = i23;
                        i12 = i22;
                        obj4 = obj2;
                        i13 = i19;
                        lo2Var2 = lo2Var;
                        na0Var2 = na0Var;
                        yz0Var2 = yz0Var4;
                        f4Var = f4Var2;
                        i14 = 32;
                        e81Var2 = e81Var;
                        ln0Var2 = ln0Var;
                        tf0Var3 = tf0Var2;
                        i15 = i9;
                        final ai2 ai2Var52 = ai2Var;
                        va0Var = va0Var2;
                        obj3 = new le0() { // from class: pt
                            @Override // defpackage.le0
                            public final Object OPXfSBeufaJ8(Object obj72) {
                                ki2 Y1f8riQaR6yg3;
                                za0 za0Var = (za0) obj72;
                                yz0 yz0Var53 = yz0.this;
                                boolean lS5Rgt96tfkO4 = yz0Var53.lS5Rgt96tfkO();
                                boolean PxuCJdSBwIXG33 = za0Var.PxuCJdSBwIXG();
                                no2 no2Var = no2.PxuCJdSBwIXG;
                                if (lS5Rgt96tfkO4 != PxuCJdSBwIXG33) {
                                    yz0Var53.a92UlCVFR9N8.setValue(Boolean.valueOf(za0Var.PxuCJdSBwIXG()));
                                    boolean lS5Rgt96tfkO5 = yz0Var53.lS5Rgt96tfkO();
                                    oh2 oh2Var53 = oh2Var;
                                    df1 df1Var83 = df1Var7;
                                    if (lS5Rgt96tfkO5 && z2) {
                                        tf2 tf2Var = uf2.Companion;
                                        op0 op0Var2 = yz0Var53.Y1f8riQaR6yg;
                                        mt mtVar3 = yz0Var53.VhhvGxCb8gfr;
                                        mt mtVar23 = yz0Var53.S2OOm9zPNm0h;
                                        tf2Var.getClass();
                                        zt1 zt1Var = new zt1();
                                        cd cdVar = new cd(op0Var2, mtVar3, zt1Var);
                                        ai2 ai2Var63 = ai2Var52;
                                        kn1 kn1Var = ai2Var63.PxuCJdSBwIXG;
                                        kn1Var.PxuCJdSBwIXG(oh2Var53, ln0Var2, cdVar, mtVar23);
                                        ei2 ei2Var2 = new ei2(ai2Var63, kn1Var);
                                        ai2Var63.lS5Rgt96tfkO.set(ei2Var2);
                                        zt1Var.rtx2ld2ELZv4 = ei2Var2;
                                        yz0Var53.e9gEMXR7LXtO = ei2Var2;
                                        ov2.Pf0ThKz3j5YS(yz0Var53, oh2Var53, df1Var83);
                                    } else {
                                        ov2.e6tOsSdd2EFb(yz0Var53);
                                    }
                                    if (za0Var.PxuCJdSBwIXG() && (Y1f8riQaR6yg3 = yz0Var53.Y1f8riQaR6yg()) != null) {
                                        fx1.KUoIVIumpKat(ruVar3, null, new d4(hfVar2, oh2Var53, yz0Var53, Y1f8riQaR6yg3, df1Var83, null, 2), 3);
                                    }
                                    if (!za0Var.PxuCJdSBwIXG()) {
                                        eh2Var3.RAsUl2FVSrh6(null);
                                    }
                                }
                                return no2Var;
                            }
                        };
                        z9 = z2;
                        ai2Var2 = ai2Var52;
                        ruVar = ruVar3;
                        df1Var2 = df1Var7;
                        hfVar = hfVar2;
                        oh2Var4 = oh2Var;
                        eh2Var = eh2Var3;
                        tf0Var3.JTxCbbCwomzt(obj3);
                        nLZGh9p8gVSu5 = mm2.nLZGh9p8gVSu(b51.nxJAScVArhE9(fx1.i68hK7ahKtgp(r10, va0Var), (le0) obj3), z9, e81Var2);
                        d91 Pf0ThKz3j5YS2 = sj0.Pf0ThKz3j5YS(Boolean.valueOf(z9), tf0Var3);
                        boolean a92UlCVFR9N842 = tf0Var3.a92UlCVFR9N8(Pf0ThKz3j5YS2) | tf0Var3.rtx2ld2ELZv4(yz0Var2) | tf0Var3.rtx2ld2ELZv4(ai2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var);
                        if (i10 > i14) {
                        }
                        n61Var2 = nLZGh9p8gVSu5;
                        if ((i13 & 48) != i14) {
                        }
                        z10 = true;
                        z11 = z10 | a92UlCVFR9N842;
                        Object nLZGh9p8gVSu1922 = tf0Var3.nLZGh9p8gVSu();
                        if (!z11) {
                        }
                        ai2Var3 = ai2Var2;
                        ruVar2 = ruVar;
                        n61Var3 = n61Var2;
                        obj5 = obj4;
                        d4 d4Var22 = new d4(yz0Var2, Pf0ThKz3j5YS2, ai2Var3, eh2Var, ln0Var2, null, 1);
                        d91Var = Pf0ThKz3j5YS2;
                        tf0Var3.JTxCbbCwomzt(d4Var22);
                        nLZGh9p8gVSu1922 = d4Var22;
                        mm2.wdg6QnbFHrFF(tf0Var3, (pe0) nLZGh9p8gVSu1922, no2.PxuCJdSBwIXG);
                        gg1 gg1Var2222 = mp.PxuCJdSBwIXG;
                        n61 PxuCJdSBwIXG3222 = lc2.PxuCJdSBwIXG(r10, 8675309, new j3(1, new mt(yz0Var2, 4)));
                        va0 va0Var3222 = va0Var;
                        df1Var3 = df1Var2;
                        ia1 ia1Var222 = new ia1(yz0Var2, va0Var3222, z9, eh2Var, df1Var3);
                        int i24222 = 7;
                        if (z2) {
                        }
                        n61 TSizfFm2Yiuu2222 = PxuCJdSBwIXG3222.TSizfFm2Yiuu(new kc2(eh2Var.IAToe7bXGz4N, eh2Var.pnx5pC0XzaCw, new j3(5, eh2Var), 4));
                        yn1.Companion.getClass();
                        n61 TSizfFm2Yiuu3222 = TSizfFm2Yiuu2222.TSizfFm2Yiuu(new vn1());
                        final n61 ozEBbv0hFTAB222 = fx1.ozEBbv0hFTAB(r10, new cd(yz0Var2, oh2Var4, df1Var3, 2));
                        is2Var2 = is2Var;
                        int i25222 = i11;
                        rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(yz0Var2) | (i12 == 2048) | tf0Var3.a92UlCVFR9N8(is2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var) | (i25222 == 4) | tf0Var3.rtx2ld2ELZv4(df1Var3);
                        nLZGh9p8gVSu6 = tf0Var3.nLZGh9p8gVSu();
                        if (rtx2ld2ELZv43) {
                        }
                        final oh2 oh2Var5222 = oh2Var4;
                        le0 le0Var3222 = new le0() { // from class: qt
                            @Override // defpackage.le0
                            public final Object OPXfSBeufaJ8(Object obj8) {
                                ei2 ei2Var2;
                                bw0 bw0Var;
                                yz0 yz0Var5222 = yz0.this;
                                mj1 mj1Var = yz0Var5222.QrzZRwfaDlRX;
                                bw0 bw0Var2 = (bw0) obj8;
                                yz0Var5222.rtx2ld2ELZv4 = bw0Var2;
                                ki2 Y1f8riQaR6yg3 = yz0Var5222.Y1f8riQaR6yg();
                                if (Y1f8riQaR6yg3 != null) {
                                    Y1f8riQaR6yg3.lS5Rgt96tfkO = bw0Var2;
                                }
                                if (z2) {
                                    mi0 PxuCJdSBwIXG4 = yz0Var5222.PxuCJdSBwIXG();
                                    mi0 mi0Var = mi0.OPXfSBeufaJ8;
                                    eh2 eh2Var4 = eh2Var;
                                    oh2 oh2Var6 = oh2Var5222;
                                    if (PxuCJdSBwIXG4 == mi0Var) {
                                        if (((Boolean) yz0Var5222.x50lh2ztY7Y5.getValue()).booleanValue() && ((Boolean) ((rz0) is2Var2).PxuCJdSBwIXG.getValue()).booleanValue()) {
                                            eh2Var4.EcgxDIVH5in8();
                                        } else {
                                            eh2Var4.QrzZRwfaDlRX();
                                        }
                                        yz0Var5222.cpQdD2nAriOS.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                        yz0Var5222.r3s1LDPKFs1S.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, false)));
                                        mj1Var.setValue(Boolean.valueOf(vi2.TSizfFm2Yiuu(oh2Var6.lS5Rgt96tfkO)));
                                    } else if (yz0Var5222.PxuCJdSBwIXG() == mi0.wdg6QnbFHrFF) {
                                        mj1Var.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                    }
                                    df1 df1Var8222 = df1Var3;
                                    ov2.Pf0ThKz3j5YS(yz0Var5222, oh2Var6, df1Var8222);
                                    ki2 Y1f8riQaR6yg4 = yz0Var5222.Y1f8riQaR6yg();
                                    if (Y1f8riQaR6yg4 != null && (ei2Var2 = yz0Var5222.e9gEMXR7LXtO) != null && yz0Var5222.lS5Rgt96tfkO()) {
                                        uf2.Companion.getClass();
                                        bw0 bw0Var3 = Y1f8riQaR6yg4.lS5Rgt96tfkO;
                                        if (bw0Var3 != null && bw0Var3.aF05bpZJlKEP() && (bw0Var = Y1f8riQaR6yg4.TSizfFm2Yiuu) != null) {
                                            ji2 ji2Var = Y1f8riQaR6yg4.PxuCJdSBwIXG;
                                            d0 d0Var = new d0(3, bw0Var3);
                                            qt1 ryVscX7ZL4Ux = ng0.ryVscX7ZL4Ux(bw0Var3);
                                            qt1 nLZGh9p8gVSu20 = bw0Var3.nLZGh9p8gVSu(bw0Var, false);
                                            if (cs0.wdg6QnbFHrFF((ei2) ei2Var2.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var2)) {
                                                ei2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu(oh2Var6, df1Var8222, ji2Var, d0Var, ryVscX7ZL4Ux, nLZGh9p8gVSu20);
                                            }
                                        }
                                    }
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        };
                        is2Var3 = is2Var2;
                        df1Var3 = df1Var3;
                        tf0Var3.JTxCbbCwomzt(le0Var3222);
                        nLZGh9p8gVSu6 = le0Var3222;
                        final n61 nxJAScVArhE9222 = mm2.nxJAScVArhE9(r10, (le0) nLZGh9p8gVSu6);
                        yz0 yz0Var5222 = yz0Var2;
                        eh2Var2 = eh2Var;
                        ai2 ai2Var6222 = ai2Var3;
                        yt ytVar222 = new yt(yk2Var, oh2Var, yz0Var5222, z2, df1Var3, eh2Var2, ln0Var, va0Var3222);
                        yz0Var3 = yz0Var5222;
                        if (!z2) {
                        }
                        df1Var4 = df1Var3;
                        n61Var4 = r10;
                        rtx2ld2ELZv44 = tf0Var3.rtx2ld2ELZv4(eh2Var2);
                        nLZGh9p8gVSu7 = tf0Var3.nLZGh9p8gVSu();
                        if (!rtx2ld2ELZv44) {
                        }
                        nLZGh9p8gVSu7 = new rt(eh2Var2, 0);
                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu7);
                        mm2.rtx2ld2ELZv4(eh2Var2, (le0) nLZGh9p8gVSu7, tf0Var3);
                        rtx2ld2ELZv45 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.rtx2ld2ELZv4(ai2Var6222) | (i25222 == 4) | ((i10 <= 32 && tf0Var3.a92UlCVFR9N8(ln0Var)) || (i13 & 48) == 32);
                        nLZGh9p8gVSu8 = tf0Var3.nLZGh9p8gVSu();
                        if (rtx2ld2ELZv45) {
                        }
                        d7 d7Var222 = new d7(yz0Var3, ai2Var6222, oh2Var, ln0Var, 1);
                        ln0Var3 = ln0Var;
                        tf0Var3.JTxCbbCwomzt(d7Var222);
                        nLZGh9p8gVSu8 = d7Var222;
                        mm2.rtx2ld2ELZv4(ln0Var3, (le0) nLZGh9p8gVSu8, tf0Var3);
                        final le0 mtVar222 = yz0Var3.VhhvGxCb8gfr;
                        if (i == 1) {
                        }
                        final int i26222 = ln0Var3.Y1f8riQaR6yg;
                        final lo2 lo2Var3222 = lo2Var2;
                        final df1 df1Var8222 = df1Var4;
                        n61 VhhvGxCb8gfr222 = VhhvGxCb8gfr(r10, new qe0() { // from class: eg2
                            @Override // defpackage.qe0
                            public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                ((Integer) obj10).getClass();
                                tf0 tf0Var53 = (tf0) ((hp) obj9);
                                tf0Var53.IXK6ba3ucyzm(851809892);
                                gg1 gg1Var33 = mp.PxuCJdSBwIXG;
                                Object nLZGh9p8gVSu20 = tf0Var53.nLZGh9p8gVSu();
                                hp.Companion.getClass();
                                jx1 jx1Var = fp.lS5Rgt96tfkO;
                                if (nLZGh9p8gVSu20 == jx1Var) {
                                    nLZGh9p8gVSu20 = new ti2();
                                    tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                }
                                ti2 ti2Var = (ti2) nLZGh9p8gVSu20;
                                Object nLZGh9p8gVSu21 = tf0Var53.nLZGh9p8gVSu();
                                if (nLZGh9p8gVSu21 == jx1Var) {
                                    nLZGh9p8gVSu21 = new xv();
                                    tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu21);
                                }
                                dg2 dg2Var = new dg2(yz0.this, eh2Var2, oh2Var, z14, z15, ti2Var, df1Var8222, lo2Var3222, (xv) nLZGh9p8gVSu21, mtVar222, i26222);
                                k61 k61Var = n61.Companion;
                                boolean rtx2ld2ELZv48 = tf0Var53.rtx2ld2ELZv4(dg2Var);
                                Object nLZGh9p8gVSu22 = tf0Var53.nLZGh9p8gVSu();
                                if (rtx2ld2ELZv48 || nLZGh9p8gVSu22 == jx1Var) {
                                    RAsUl2FVSrh6 rAsUl2FVSrh6 = new RAsUl2FVSrh6(1, dg2Var, dg2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                                    tf0Var53.JTxCbbCwomzt(rAsUl2FVSrh6);
                                    nLZGh9p8gVSu22 = rAsUl2FVSrh6;
                                }
                                n61 aF05bpZJlKEP = hq0.aF05bpZJlKEP(k61Var, (le0) ((af0) nLZGh9p8gVSu22));
                                tf0Var53.gPXPFXrUH4XX(false);
                                return aF05bpZJlKEP;
                            }
                        });
                        hv0.Companion.getClass();
                        i16 = i8;
                        if (i16 == 7) {
                        }
                        z12 = false;
                        boolean booleanValue22222 = ((Boolean) d91Var.getValue()).booleanValue();
                        f4 f4Var322222 = f4Var;
                        RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var322222);
                        nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
                        if (!RAsUl2FVSrh62) {
                        }
                        nLZGh9p8gVSu9 = new uq(z12, f4Var322222);
                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
                        n61 EpkonXwzFgDB22222 = bs0.EpkonXwzFgDB(r10, booleanValue22222, z12, (ae0) nLZGh9p8gVSu9);
                        uf ufVar22222 = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
                        long j722222 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
                        if (!hl.TSizfFm2Yiuu(j722222, mm2.TSizfFm2Yiuu(1308617531))) {
                        }
                        rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
                        nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
                        if (!rtx2ld2ELZv46) {
                        }
                        nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
                        tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
                        n61 J54yh1s3n4Aq22222 = fx1.J54yh1s3n4Aq(r10, (le0) nLZGh9p8gVSu10);
                        gg1 gg1Var322222 = mp.PxuCJdSBwIXG;
                        i17 = 0;
                        n61 TSizfFm2Yiuu422222 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq22222), f4Var322222, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB22222).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr222);
                        final ug2 ug2Var322222 = ug2Var;
                        n61 TSizfFm2Yiuu522222 = mm2.nxJAScVArhE9(TSizfFm2Yiuu422222.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                            /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                            
                                if (r14 == r4) goto L16;
                             */
                            @Override // defpackage.qe0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                                ug2 ug2Var4 = ug2.this;
                                mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                                ((Integer) obj10).getClass();
                                tf0 tf0Var522222 = (tf0) ((hp) obj9);
                                tf0Var522222.IXK6ba3ucyzm(-2137546592);
                                gg1 gg1Var422222 = mp.PxuCJdSBwIXG;
                                boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var522222.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                                boolean a92UlCVFR9N85 = tf0Var522222.a92UlCVFR9N8(ug2Var4);
                                Object nLZGh9p8gVSu20 = tf0Var522222.nLZGh9p8gVSu();
                                Object obj11 = fp.lS5Rgt96tfkO;
                                if (!a92UlCVFR9N85) {
                                    hp.Companion.getClass();
                                }
                                nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                                tf0Var522222.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                d91 Pf0ThKz3j5YS22 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var522222);
                                Object nLZGh9p8gVSu21 = tf0Var522222.nLZGh9p8gVSu();
                                hp.Companion.getClass();
                                if (nLZGh9p8gVSu21 == obj11) {
                                    Object axVar = new ax(new o6(Pf0ThKz3j5YS22, 3));
                                    tf0Var522222.JTxCbbCwomzt(axVar);
                                    nLZGh9p8gVSu21 = axVar;
                                }
                                e12 e12Var = (e12) nLZGh9p8gVSu21;
                                boolean a92UlCVFR9N86 = tf0Var522222.a92UlCVFR9N8(e12Var) | tf0Var522222.a92UlCVFR9N8(ug2Var4);
                                Object nLZGh9p8gVSu22 = tf0Var522222.nLZGh9p8gVSu();
                                if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                                    nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                                    tf0Var522222.JTxCbbCwomzt(nLZGh9p8gVSu22);
                                }
                                n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                                tf0Var522222.gPXPFXrUH4XX(false);
                                return lS5Rgt96tfkO4;
                            }
                        })).TSizfFm2Yiuu(TSizfFm2Yiuu3222).TSizfFm2Yiuu(ytVar222), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
                        if (z2) {
                        }
                        if (i17 != 0) {
                        }
                        final n61 n61Var522222 = r10;
                        tf0 tf0Var522222 = tf0Var3;
                        final hy hyVar422222 = hyVar2;
                        final hf hfVar322222 = hfVar;
                        final n61 n61Var622222 = n61Var4;
                        final yz0 yz0Var622222 = yz0Var3;
                        final boolean r1522222 = i17;
                        pe0 pe0Var22222 = new pe0() { // from class: nt
                            @Override // defpackage.pe0
                            public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                                hp hpVar2 = (hp) obj8;
                                int intValue = ((Integer) obj9).intValue();
                                tf0 tf0Var6 = (tf0) hpVar2;
                                if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                                    gg1 gg1Var422222 = mp.PxuCJdSBwIXG;
                                    final yz0 yz0Var7 = yz0Var622222;
                                    final dj2 dj2Var3 = dj2Var;
                                    final int i27 = i2;
                                    final int i28 = i;
                                    final ug2 ug2Var4 = ug2Var322222;
                                    final oh2 oh2Var6 = oh2Var;
                                    final wr2 wr2Var2 = wr2Var;
                                    final n61 n61Var7 = n61Var622222;
                                    final n61 n61Var8 = ozEBbv0hFTAB222;
                                    final n61 n61Var9 = nxJAScVArhE9222;
                                    final n61 n61Var10 = n61Var522222;
                                    final hf hfVar4 = hfVar322222;
                                    final eh2 eh2Var4 = eh2Var2;
                                    final boolean z16 = r1522222;
                                    final le0 le0Var4 = le0Var2;
                                    final df1 df1Var9 = df1Var8222;
                                    final hy hyVar5 = hyVar422222;
                                    on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                                        
                                            if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                                         */
                                        @Override // defpackage.pe0
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                            n61 jq2Var;
                                            oh2 oh2Var7 = oh2Var6;
                                            long j8 = oh2Var7.lS5Rgt96tfkO;
                                            hp hpVar3 = (hp) obj10;
                                            int intValue2 = ((Integer) obj11).intValue();
                                            tf0 tf0Var7 = (tf0) hpVar3;
                                            if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                                k61 k61Var = n61.Companion;
                                                yz0 yz0Var8 = yz0.this;
                                                n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                                int i29 = i27;
                                                int i30 = i28;
                                                kj0.wLFCmsViZrNT(i29, i30);
                                                dj2 dj2Var4 = dj2Var3;
                                                if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                    Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                                }
                                                boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                                Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                                if (!rtx2ld2ELZv48) {
                                                    hp.Companion.getClass();
                                                }
                                                nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                                tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                                ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                                ug2 ug2Var5 = ug2Var4;
                                                th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                                ui2 ui2Var2 = vi2.Companion;
                                                int i31 = (int) (j8 >> 32);
                                                long j9 = ug2Var5.e9gEMXR7LXtO;
                                                n61 n61Var11 = Y1f8riQaR6yg3;
                                                if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                    i31 = vi2.a92UlCVFR9N8(j8);
                                                }
                                                ug2Var5.e9gEMXR7LXtO = j8;
                                                yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                                int ordinal = th1Var2.ordinal();
                                                if (ordinal == 0) {
                                                    jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                } else {
                                                    if (ordinal != 1) {
                                                        u9.gPXPFXrUH4XX();
                                                        return null;
                                                    }
                                                    jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                                }
                                                ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                            } else {
                                                tf0Var7.i68hK7ahKtgp();
                                            }
                                            return no2.PxuCJdSBwIXG;
                                        }
                                    }, tf0Var6), tf0Var6, 6);
                                } else {
                                    tf0Var6.i68hK7ahKtgp();
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        };
                        tf0Var = tf0Var522222;
                        Y1f8riQaR6yg(TSizfFm2Yiuu522222, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var22222, tf0Var), tf0Var, 384);
                        gg1 gg1Var422222 = mp.PxuCJdSBwIXG;
                    }
                    z8 = true;
                    rtx2ld2ELZv42 = rtx2ld2ELZv47 | z8 | tf0Var2.rtx2ld2ELZv4(df1Var7) | tf0Var2.rtx2ld2ELZv4(ruVar3) | tf0Var2.rtx2ld2ELZv4(hfVar2) | tf0Var2.rtx2ld2ELZv4(eh2Var3);
                    Object nLZGh9p8gVSu1822 = tf0Var2.nLZGh9p8gVSu();
                    if (rtx2ld2ELZv42) {
                    }
                    i11 = i23;
                    i12 = i22;
                    obj4 = obj2;
                    i13 = i19;
                    lo2Var2 = lo2Var;
                    na0Var2 = na0Var;
                    yz0Var2 = yz0Var4;
                    f4Var = f4Var2;
                    i14 = 32;
                    e81Var2 = e81Var;
                    ln0Var2 = ln0Var;
                    tf0Var3 = tf0Var2;
                    i15 = i9;
                    final ai2 ai2Var522 = ai2Var;
                    va0Var = va0Var2;
                    obj3 = new le0() { // from class: pt
                        @Override // defpackage.le0
                        public final Object OPXfSBeufaJ8(Object obj72) {
                            ki2 Y1f8riQaR6yg3;
                            za0 za0Var = (za0) obj72;
                            yz0 yz0Var53 = yz0.this;
                            boolean lS5Rgt96tfkO4 = yz0Var53.lS5Rgt96tfkO();
                            boolean PxuCJdSBwIXG33 = za0Var.PxuCJdSBwIXG();
                            no2 no2Var = no2.PxuCJdSBwIXG;
                            if (lS5Rgt96tfkO4 != PxuCJdSBwIXG33) {
                                yz0Var53.a92UlCVFR9N8.setValue(Boolean.valueOf(za0Var.PxuCJdSBwIXG()));
                                boolean lS5Rgt96tfkO5 = yz0Var53.lS5Rgt96tfkO();
                                oh2 oh2Var53 = oh2Var;
                                df1 df1Var83 = df1Var7;
                                if (lS5Rgt96tfkO5 && z2) {
                                    tf2 tf2Var = uf2.Companion;
                                    op0 op0Var2 = yz0Var53.Y1f8riQaR6yg;
                                    mt mtVar3 = yz0Var53.VhhvGxCb8gfr;
                                    mt mtVar23 = yz0Var53.S2OOm9zPNm0h;
                                    tf2Var.getClass();
                                    zt1 zt1Var = new zt1();
                                    cd cdVar = new cd(op0Var2, mtVar3, zt1Var);
                                    ai2 ai2Var63 = ai2Var522;
                                    kn1 kn1Var = ai2Var63.PxuCJdSBwIXG;
                                    kn1Var.PxuCJdSBwIXG(oh2Var53, ln0Var2, cdVar, mtVar23);
                                    ei2 ei2Var2 = new ei2(ai2Var63, kn1Var);
                                    ai2Var63.lS5Rgt96tfkO.set(ei2Var2);
                                    zt1Var.rtx2ld2ELZv4 = ei2Var2;
                                    yz0Var53.e9gEMXR7LXtO = ei2Var2;
                                    ov2.Pf0ThKz3j5YS(yz0Var53, oh2Var53, df1Var83);
                                } else {
                                    ov2.e6tOsSdd2EFb(yz0Var53);
                                }
                                if (za0Var.PxuCJdSBwIXG() && (Y1f8riQaR6yg3 = yz0Var53.Y1f8riQaR6yg()) != null) {
                                    fx1.KUoIVIumpKat(ruVar3, null, new d4(hfVar2, oh2Var53, yz0Var53, Y1f8riQaR6yg3, df1Var83, null, 2), 3);
                                }
                                if (!za0Var.PxuCJdSBwIXG()) {
                                    eh2Var3.RAsUl2FVSrh6(null);
                                }
                            }
                            return no2Var;
                        }
                    };
                    z9 = z2;
                    ai2Var2 = ai2Var522;
                    ruVar = ruVar3;
                    df1Var2 = df1Var7;
                    hfVar = hfVar2;
                    oh2Var4 = oh2Var;
                    eh2Var = eh2Var3;
                    tf0Var3.JTxCbbCwomzt(obj3);
                    nLZGh9p8gVSu5 = mm2.nLZGh9p8gVSu(b51.nxJAScVArhE9(fx1.i68hK7ahKtgp(r10, va0Var), (le0) obj3), z9, e81Var2);
                    d91 Pf0ThKz3j5YS22 = sj0.Pf0ThKz3j5YS(Boolean.valueOf(z9), tf0Var3);
                    boolean a92UlCVFR9N8422 = tf0Var3.a92UlCVFR9N8(Pf0ThKz3j5YS22) | tf0Var3.rtx2ld2ELZv4(yz0Var2) | tf0Var3.rtx2ld2ELZv4(ai2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var);
                    if (i10 > i14) {
                    }
                    n61Var2 = nLZGh9p8gVSu5;
                    if ((i13 & 48) != i14) {
                    }
                    z10 = true;
                    z11 = z10 | a92UlCVFR9N8422;
                    Object nLZGh9p8gVSu19222 = tf0Var3.nLZGh9p8gVSu();
                    if (!z11) {
                    }
                    ai2Var3 = ai2Var2;
                    ruVar2 = ruVar;
                    n61Var3 = n61Var2;
                    obj5 = obj4;
                    d4 d4Var222 = new d4(yz0Var2, Pf0ThKz3j5YS22, ai2Var3, eh2Var, ln0Var2, null, 1);
                    d91Var = Pf0ThKz3j5YS22;
                    tf0Var3.JTxCbbCwomzt(d4Var222);
                    nLZGh9p8gVSu19222 = d4Var222;
                    mm2.wdg6QnbFHrFF(tf0Var3, (pe0) nLZGh9p8gVSu19222, no2.PxuCJdSBwIXG);
                    gg1 gg1Var22222 = mp.PxuCJdSBwIXG;
                    n61 PxuCJdSBwIXG32222 = lc2.PxuCJdSBwIXG(r10, 8675309, new j3(1, new mt(yz0Var2, 4)));
                    va0 va0Var32222 = va0Var;
                    df1Var3 = df1Var2;
                    ia1 ia1Var2222 = new ia1(yz0Var2, va0Var32222, z9, eh2Var, df1Var3);
                    int i242222 = 7;
                    if (z2) {
                    }
                    n61 TSizfFm2Yiuu22222 = PxuCJdSBwIXG32222.TSizfFm2Yiuu(new kc2(eh2Var.IAToe7bXGz4N, eh2Var.pnx5pC0XzaCw, new j3(5, eh2Var), 4));
                    yn1.Companion.getClass();
                    n61 TSizfFm2Yiuu32222 = TSizfFm2Yiuu22222.TSizfFm2Yiuu(new vn1());
                    final n61 ozEBbv0hFTAB2222 = fx1.ozEBbv0hFTAB(r10, new cd(yz0Var2, oh2Var4, df1Var3, 2));
                    is2Var2 = is2Var;
                    int i252222 = i11;
                    rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(yz0Var2) | (i12 == 2048) | tf0Var3.a92UlCVFR9N8(is2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var) | (i252222 == 4) | tf0Var3.rtx2ld2ELZv4(df1Var3);
                    nLZGh9p8gVSu6 = tf0Var3.nLZGh9p8gVSu();
                    if (rtx2ld2ELZv43) {
                    }
                    final oh2 oh2Var52222 = oh2Var4;
                    le0 le0Var32222 = new le0() { // from class: qt
                        @Override // defpackage.le0
                        public final Object OPXfSBeufaJ8(Object obj8) {
                            ei2 ei2Var2;
                            bw0 bw0Var;
                            yz0 yz0Var52222 = yz0.this;
                            mj1 mj1Var = yz0Var52222.QrzZRwfaDlRX;
                            bw0 bw0Var2 = (bw0) obj8;
                            yz0Var52222.rtx2ld2ELZv4 = bw0Var2;
                            ki2 Y1f8riQaR6yg3 = yz0Var52222.Y1f8riQaR6yg();
                            if (Y1f8riQaR6yg3 != null) {
                                Y1f8riQaR6yg3.lS5Rgt96tfkO = bw0Var2;
                            }
                            if (z2) {
                                mi0 PxuCJdSBwIXG4 = yz0Var52222.PxuCJdSBwIXG();
                                mi0 mi0Var = mi0.OPXfSBeufaJ8;
                                eh2 eh2Var4 = eh2Var;
                                oh2 oh2Var6 = oh2Var52222;
                                if (PxuCJdSBwIXG4 == mi0Var) {
                                    if (((Boolean) yz0Var52222.x50lh2ztY7Y5.getValue()).booleanValue() && ((Boolean) ((rz0) is2Var2).PxuCJdSBwIXG.getValue()).booleanValue()) {
                                        eh2Var4.EcgxDIVH5in8();
                                    } else {
                                        eh2Var4.QrzZRwfaDlRX();
                                    }
                                    yz0Var52222.cpQdD2nAriOS.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                    yz0Var52222.r3s1LDPKFs1S.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, false)));
                                    mj1Var.setValue(Boolean.valueOf(vi2.TSizfFm2Yiuu(oh2Var6.lS5Rgt96tfkO)));
                                } else if (yz0Var52222.PxuCJdSBwIXG() == mi0.wdg6QnbFHrFF) {
                                    mj1Var.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                }
                                df1 df1Var82222 = df1Var3;
                                ov2.Pf0ThKz3j5YS(yz0Var52222, oh2Var6, df1Var82222);
                                ki2 Y1f8riQaR6yg4 = yz0Var52222.Y1f8riQaR6yg();
                                if (Y1f8riQaR6yg4 != null && (ei2Var2 = yz0Var52222.e9gEMXR7LXtO) != null && yz0Var52222.lS5Rgt96tfkO()) {
                                    uf2.Companion.getClass();
                                    bw0 bw0Var3 = Y1f8riQaR6yg4.lS5Rgt96tfkO;
                                    if (bw0Var3 != null && bw0Var3.aF05bpZJlKEP() && (bw0Var = Y1f8riQaR6yg4.TSizfFm2Yiuu) != null) {
                                        ji2 ji2Var = Y1f8riQaR6yg4.PxuCJdSBwIXG;
                                        d0 d0Var = new d0(3, bw0Var3);
                                        qt1 ryVscX7ZL4Ux = ng0.ryVscX7ZL4Ux(bw0Var3);
                                        qt1 nLZGh9p8gVSu20 = bw0Var3.nLZGh9p8gVSu(bw0Var, false);
                                        if (cs0.wdg6QnbFHrFF((ei2) ei2Var2.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var2)) {
                                            ei2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu(oh2Var6, df1Var82222, ji2Var, d0Var, ryVscX7ZL4Ux, nLZGh9p8gVSu20);
                                        }
                                    }
                                }
                            }
                            return no2.PxuCJdSBwIXG;
                        }
                    };
                    is2Var3 = is2Var2;
                    df1Var3 = df1Var3;
                    tf0Var3.JTxCbbCwomzt(le0Var32222);
                    nLZGh9p8gVSu6 = le0Var32222;
                    final n61 nxJAScVArhE92222 = mm2.nxJAScVArhE9(r10, (le0) nLZGh9p8gVSu6);
                    yz0 yz0Var52222 = yz0Var2;
                    eh2Var2 = eh2Var;
                    ai2 ai2Var62222 = ai2Var3;
                    yt ytVar2222 = new yt(yk2Var, oh2Var, yz0Var52222, z2, df1Var3, eh2Var2, ln0Var, va0Var32222);
                    yz0Var3 = yz0Var52222;
                    if (!z2) {
                    }
                    df1Var4 = df1Var3;
                    n61Var4 = r10;
                    rtx2ld2ELZv44 = tf0Var3.rtx2ld2ELZv4(eh2Var2);
                    nLZGh9p8gVSu7 = tf0Var3.nLZGh9p8gVSu();
                    if (!rtx2ld2ELZv44) {
                    }
                    nLZGh9p8gVSu7 = new rt(eh2Var2, 0);
                    tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu7);
                    mm2.rtx2ld2ELZv4(eh2Var2, (le0) nLZGh9p8gVSu7, tf0Var3);
                    rtx2ld2ELZv45 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.rtx2ld2ELZv4(ai2Var62222) | (i252222 == 4) | ((i10 <= 32 && tf0Var3.a92UlCVFR9N8(ln0Var)) || (i13 & 48) == 32);
                    nLZGh9p8gVSu8 = tf0Var3.nLZGh9p8gVSu();
                    if (rtx2ld2ELZv45) {
                    }
                    d7 d7Var2222 = new d7(yz0Var3, ai2Var62222, oh2Var, ln0Var, 1);
                    ln0Var3 = ln0Var;
                    tf0Var3.JTxCbbCwomzt(d7Var2222);
                    nLZGh9p8gVSu8 = d7Var2222;
                    mm2.rtx2ld2ELZv4(ln0Var3, (le0) nLZGh9p8gVSu8, tf0Var3);
                    final le0 mtVar2222 = yz0Var3.VhhvGxCb8gfr;
                    if (i == 1) {
                    }
                    final int i262222 = ln0Var3.Y1f8riQaR6yg;
                    final lo2 lo2Var32222 = lo2Var2;
                    final df1 df1Var82222 = df1Var4;
                    n61 VhhvGxCb8gfr2222 = VhhvGxCb8gfr(r10, new qe0() { // from class: eg2
                        @Override // defpackage.qe0
                        public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                            ((Integer) obj10).getClass();
                            tf0 tf0Var53 = (tf0) ((hp) obj9);
                            tf0Var53.IXK6ba3ucyzm(851809892);
                            gg1 gg1Var33 = mp.PxuCJdSBwIXG;
                            Object nLZGh9p8gVSu20 = tf0Var53.nLZGh9p8gVSu();
                            hp.Companion.getClass();
                            jx1 jx1Var = fp.lS5Rgt96tfkO;
                            if (nLZGh9p8gVSu20 == jx1Var) {
                                nLZGh9p8gVSu20 = new ti2();
                                tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu20);
                            }
                            ti2 ti2Var = (ti2) nLZGh9p8gVSu20;
                            Object nLZGh9p8gVSu21 = tf0Var53.nLZGh9p8gVSu();
                            if (nLZGh9p8gVSu21 == jx1Var) {
                                nLZGh9p8gVSu21 = new xv();
                                tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu21);
                            }
                            dg2 dg2Var = new dg2(yz0.this, eh2Var2, oh2Var, z14, z15, ti2Var, df1Var82222, lo2Var32222, (xv) nLZGh9p8gVSu21, mtVar2222, i262222);
                            k61 k61Var = n61.Companion;
                            boolean rtx2ld2ELZv48 = tf0Var53.rtx2ld2ELZv4(dg2Var);
                            Object nLZGh9p8gVSu22 = tf0Var53.nLZGh9p8gVSu();
                            if (rtx2ld2ELZv48 || nLZGh9p8gVSu22 == jx1Var) {
                                RAsUl2FVSrh6 rAsUl2FVSrh6 = new RAsUl2FVSrh6(1, dg2Var, dg2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                                tf0Var53.JTxCbbCwomzt(rAsUl2FVSrh6);
                                nLZGh9p8gVSu22 = rAsUl2FVSrh6;
                            }
                            n61 aF05bpZJlKEP = hq0.aF05bpZJlKEP(k61Var, (le0) ((af0) nLZGh9p8gVSu22));
                            tf0Var53.gPXPFXrUH4XX(false);
                            return aF05bpZJlKEP;
                        }
                    });
                    hv0.Companion.getClass();
                    i16 = i8;
                    if (i16 == 7) {
                    }
                    z12 = false;
                    boolean booleanValue222222 = ((Boolean) d91Var.getValue()).booleanValue();
                    f4 f4Var3222222 = f4Var;
                    RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var3222222);
                    nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
                    if (!RAsUl2FVSrh62) {
                    }
                    nLZGh9p8gVSu9 = new uq(z12, f4Var3222222);
                    tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
                    n61 EpkonXwzFgDB222222 = bs0.EpkonXwzFgDB(r10, booleanValue222222, z12, (ae0) nLZGh9p8gVSu9);
                    uf ufVar222222 = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
                    long j7222222 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
                    if (!hl.TSizfFm2Yiuu(j7222222, mm2.TSizfFm2Yiuu(1308617531))) {
                    }
                    rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
                    nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
                    if (!rtx2ld2ELZv46) {
                    }
                    nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
                    tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
                    n61 J54yh1s3n4Aq222222 = fx1.J54yh1s3n4Aq(r10, (le0) nLZGh9p8gVSu10);
                    gg1 gg1Var3222222 = mp.PxuCJdSBwIXG;
                    i17 = 0;
                    n61 TSizfFm2Yiuu4222222 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq222222), f4Var3222222, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB222222).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr2222);
                    final ug2 ug2Var3222222 = ug2Var;
                    n61 TSizfFm2Yiuu5222222 = mm2.nxJAScVArhE9(TSizfFm2Yiuu4222222.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                        /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                        
                            if (r14 == r4) goto L16;
                         */
                        @Override // defpackage.qe0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                            ug2 ug2Var4 = ug2.this;
                            mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                            ((Integer) obj10).getClass();
                            tf0 tf0Var5222222 = (tf0) ((hp) obj9);
                            tf0Var5222222.IXK6ba3ucyzm(-2137546592);
                            gg1 gg1Var4222222 = mp.PxuCJdSBwIXG;
                            boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var5222222.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                            boolean a92UlCVFR9N85 = tf0Var5222222.a92UlCVFR9N8(ug2Var4);
                            Object nLZGh9p8gVSu20 = tf0Var5222222.nLZGh9p8gVSu();
                            Object obj11 = fp.lS5Rgt96tfkO;
                            if (!a92UlCVFR9N85) {
                                hp.Companion.getClass();
                            }
                            nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                            tf0Var5222222.JTxCbbCwomzt(nLZGh9p8gVSu20);
                            d91 Pf0ThKz3j5YS222 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var5222222);
                            Object nLZGh9p8gVSu21 = tf0Var5222222.nLZGh9p8gVSu();
                            hp.Companion.getClass();
                            if (nLZGh9p8gVSu21 == obj11) {
                                Object axVar = new ax(new o6(Pf0ThKz3j5YS222, 3));
                                tf0Var5222222.JTxCbbCwomzt(axVar);
                                nLZGh9p8gVSu21 = axVar;
                            }
                            e12 e12Var = (e12) nLZGh9p8gVSu21;
                            boolean a92UlCVFR9N86 = tf0Var5222222.a92UlCVFR9N8(e12Var) | tf0Var5222222.a92UlCVFR9N8(ug2Var4);
                            Object nLZGh9p8gVSu22 = tf0Var5222222.nLZGh9p8gVSu();
                            if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                                nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                                tf0Var5222222.JTxCbbCwomzt(nLZGh9p8gVSu22);
                            }
                            n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                            tf0Var5222222.gPXPFXrUH4XX(false);
                            return lS5Rgt96tfkO4;
                        }
                    })).TSizfFm2Yiuu(TSizfFm2Yiuu32222).TSizfFm2Yiuu(ytVar2222), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
                    if (z2) {
                    }
                    if (i17 != 0) {
                    }
                    final n61 n61Var5222222 = r10;
                    tf0 tf0Var5222222 = tf0Var3;
                    final hy hyVar4222222 = hyVar2;
                    final hf hfVar3222222 = hfVar;
                    final n61 n61Var6222222 = n61Var4;
                    final yz0 yz0Var6222222 = yz0Var3;
                    final boolean r15222222 = i17;
                    pe0 pe0Var222222 = new pe0() { // from class: nt
                        @Override // defpackage.pe0
                        public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                            hp hpVar2 = (hp) obj8;
                            int intValue = ((Integer) obj9).intValue();
                            tf0 tf0Var6 = (tf0) hpVar2;
                            if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                                gg1 gg1Var4222222 = mp.PxuCJdSBwIXG;
                                final yz0 yz0Var7 = yz0Var6222222;
                                final dj2 dj2Var3 = dj2Var;
                                final int i27 = i2;
                                final int i28 = i;
                                final ug2 ug2Var4 = ug2Var3222222;
                                final oh2 oh2Var6 = oh2Var;
                                final wr2 wr2Var2 = wr2Var;
                                final n61 n61Var7 = n61Var6222222;
                                final n61 n61Var8 = ozEBbv0hFTAB2222;
                                final n61 n61Var9 = nxJAScVArhE92222;
                                final n61 n61Var10 = n61Var5222222;
                                final hf hfVar4 = hfVar3222222;
                                final eh2 eh2Var4 = eh2Var2;
                                final boolean z16 = r15222222;
                                final le0 le0Var4 = le0Var2;
                                final df1 df1Var9 = df1Var82222;
                                final hy hyVar5 = hyVar4222222;
                                on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                                    
                                        if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                                     */
                                    @Override // defpackage.pe0
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                        n61 jq2Var;
                                        oh2 oh2Var7 = oh2Var6;
                                        long j8 = oh2Var7.lS5Rgt96tfkO;
                                        hp hpVar3 = (hp) obj10;
                                        int intValue2 = ((Integer) obj11).intValue();
                                        tf0 tf0Var7 = (tf0) hpVar3;
                                        if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                            k61 k61Var = n61.Companion;
                                            yz0 yz0Var8 = yz0.this;
                                            n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                            int i29 = i27;
                                            int i30 = i28;
                                            kj0.wLFCmsViZrNT(i29, i30);
                                            dj2 dj2Var4 = dj2Var3;
                                            if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                                Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                            }
                                            boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                            Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                            if (!rtx2ld2ELZv48) {
                                                hp.Companion.getClass();
                                            }
                                            nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                            tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                            ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                            ug2 ug2Var5 = ug2Var4;
                                            th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                            ui2 ui2Var2 = vi2.Companion;
                                            int i31 = (int) (j8 >> 32);
                                            long j9 = ug2Var5.e9gEMXR7LXtO;
                                            n61 n61Var11 = Y1f8riQaR6yg3;
                                            if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                                i31 = vi2.a92UlCVFR9N8(j8);
                                            }
                                            ug2Var5.e9gEMXR7LXtO = j8;
                                            yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                            int ordinal = th1Var2.ordinal();
                                            if (ordinal == 0) {
                                                jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                            } else {
                                                if (ordinal != 1) {
                                                    u9.gPXPFXrUH4XX();
                                                    return null;
                                                }
                                                jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                            }
                                            ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                        } else {
                                            tf0Var7.i68hK7ahKtgp();
                                        }
                                        return no2.PxuCJdSBwIXG;
                                    }
                                }, tf0Var6), tf0Var6, 6);
                            } else {
                                tf0Var6.i68hK7ahKtgp();
                            }
                            return no2.PxuCJdSBwIXG;
                        }
                    };
                    tf0Var = tf0Var5222222;
                    Y1f8riQaR6yg(TSizfFm2Yiuu5222222, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var222222, tf0Var), tf0Var, 384);
                    gg1 gg1Var4222222 = mp.PxuCJdSBwIXG;
                }
            } else {
                j2 = j;
                op0Var.wdg6QnbFHrFF = new o40(v8Var2, j2);
                z4 = true;
            }
            z5 = false;
            if (vi2Var3 != null) {
            }
            if (z6) {
            }
            o40 o40Var22 = (o40) op0Var.wdg6QnbFHrFF;
            o40Var22.Y1f8riQaR6yg = -1;
            o40Var22.e9gEMXR7LXtO = -1;
            oh2Var2 = oh2Var;
            PxuCJdSBwIXG = oh2.PxuCJdSBwIXG(oh2Var2, null, 0L, 3);
            oh2Var3 = (oh2) op0Var.OPXfSBeufaJ8;
            op0Var.OPXfSBeufaJ8 = PxuCJdSBwIXG;
            if (ei2Var != null) {
                ei2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(oh2Var3, PxuCJdSBwIXG);
            }
            nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            obj2 = obj;
            if (nLZGh9p8gVSu == obj2) {
            }
            lo2Var = (lo2) nLZGh9p8gVSu;
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!lo2Var.e9gEMXR7LXtO) {
            }
            lo2Var.Y1f8riQaR6yg = Long.valueOf(currentTimeMillis2);
            lo2Var.PxuCJdSBwIXG(oh2Var2);
            nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu2 == obj2) {
            }
            final ru ruVar32 = (ru) nLZGh9p8gVSu2;
            nLZGh9p8gVSu3 = tf0Var2.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu3 == obj2) {
            }
            final hf hfVar22 = (hf) nLZGh9p8gVSu3;
            nLZGh9p8gVSu4 = tf0Var2.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu4 == obj2) {
            }
            final eh2 eh2Var32 = (eh2) nLZGh9p8gVSu4;
            final df1 df1Var72 = df1Var;
            eh2Var32.lS5Rgt96tfkO = df1Var72;
            eh2Var32.TSizfFm2Yiuu = yz0Var4.VhhvGxCb8gfr;
            eh2Var32.Y1f8riQaR6yg = yz0Var4;
            eh2Var32.e9gEMXR7LXtO.setValue(oh2Var2);
            eh2Var32.VhhvGxCb8gfr = new vi2(j2);
            eh2Var32.RAsUl2FVSrh6 = (qk) tf0Var2.wdg6QnbFHrFF(eq.a92UlCVFR9N8);
            eh2Var32.rtx2ld2ELZv4 = ruVar32;
            eh2Var32.wdg6QnbFHrFF = (yi0) tf0Var2.wdg6QnbFHrFF(eq.x50lh2ztY7Y5);
            eh2Var32.dgRBjINgWbAK = va0Var2;
            final boolean z142 = true;
            eh2Var32.x50lh2ztY7Y5.setValue(true);
            eh2Var32.cpQdD2nAriOS.setValue(Boolean.valueOf(z2));
            tf0Var2.IXK6ba3ucyzm(1966756105);
            p21 p21Var2 = dj2Var2.PxuCJdSBwIXG.dgRBjINgWbAK;
            t92 t92Var2 = en1.PxuCJdSBwIXG;
            tf0Var2.IXK6ba3ucyzm(430530635);
            i9 = Build.VERSION.SDK_INT;
            if (i9 >= 28) {
            }
            eh2Var32.OPXfSBeufaJ8 = cn1Var;
            tf0Var2.gPXPFXrUH4XX(z7);
            yz0Var4.lS5Rgt96tfkO();
            ?? r102 = n61.Companion;
            int i222 = i19 & 7168;
            int i232 = i7;
            boolean rtx2ld2ELZv472 = ((i19 & 57344) != 16384) | tf0Var2.rtx2ld2ELZv4(yz0Var4) | (i222 != 2048) | tf0Var2.rtx2ld2ELZv4(ai2Var4) | (i232 != 4);
            i10 = (i19 & 112) ^ 48;
            if (i10 > 32) {
                ai2Var = ai2Var4;
                z8 = true;
                rtx2ld2ELZv42 = rtx2ld2ELZv472 | z8 | tf0Var2.rtx2ld2ELZv4(df1Var72) | tf0Var2.rtx2ld2ELZv4(ruVar32) | tf0Var2.rtx2ld2ELZv4(hfVar22) | tf0Var2.rtx2ld2ELZv4(eh2Var32);
                Object nLZGh9p8gVSu18222 = tf0Var2.nLZGh9p8gVSu();
                if (rtx2ld2ELZv42) {
                }
                i11 = i232;
                i12 = i222;
                obj4 = obj2;
                i13 = i19;
                lo2Var2 = lo2Var;
                na0Var2 = na0Var;
                yz0Var2 = yz0Var4;
                f4Var = f4Var2;
                i14 = 32;
                e81Var2 = e81Var;
                ln0Var2 = ln0Var;
                tf0Var3 = tf0Var2;
                i15 = i9;
                final ai2 ai2Var5222 = ai2Var;
                va0Var = va0Var2;
                obj3 = new le0() { // from class: pt
                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj72) {
                        ki2 Y1f8riQaR6yg3;
                        za0 za0Var = (za0) obj72;
                        yz0 yz0Var53 = yz0.this;
                        boolean lS5Rgt96tfkO4 = yz0Var53.lS5Rgt96tfkO();
                        boolean PxuCJdSBwIXG33 = za0Var.PxuCJdSBwIXG();
                        no2 no2Var = no2.PxuCJdSBwIXG;
                        if (lS5Rgt96tfkO4 != PxuCJdSBwIXG33) {
                            yz0Var53.a92UlCVFR9N8.setValue(Boolean.valueOf(za0Var.PxuCJdSBwIXG()));
                            boolean lS5Rgt96tfkO5 = yz0Var53.lS5Rgt96tfkO();
                            oh2 oh2Var53 = oh2Var;
                            df1 df1Var83 = df1Var72;
                            if (lS5Rgt96tfkO5 && z2) {
                                tf2 tf2Var = uf2.Companion;
                                op0 op0Var2 = yz0Var53.Y1f8riQaR6yg;
                                mt mtVar3 = yz0Var53.VhhvGxCb8gfr;
                                mt mtVar23 = yz0Var53.S2OOm9zPNm0h;
                                tf2Var.getClass();
                                zt1 zt1Var = new zt1();
                                cd cdVar = new cd(op0Var2, mtVar3, zt1Var);
                                ai2 ai2Var63 = ai2Var5222;
                                kn1 kn1Var = ai2Var63.PxuCJdSBwIXG;
                                kn1Var.PxuCJdSBwIXG(oh2Var53, ln0Var2, cdVar, mtVar23);
                                ei2 ei2Var2 = new ei2(ai2Var63, kn1Var);
                                ai2Var63.lS5Rgt96tfkO.set(ei2Var2);
                                zt1Var.rtx2ld2ELZv4 = ei2Var2;
                                yz0Var53.e9gEMXR7LXtO = ei2Var2;
                                ov2.Pf0ThKz3j5YS(yz0Var53, oh2Var53, df1Var83);
                            } else {
                                ov2.e6tOsSdd2EFb(yz0Var53);
                            }
                            if (za0Var.PxuCJdSBwIXG() && (Y1f8riQaR6yg3 = yz0Var53.Y1f8riQaR6yg()) != null) {
                                fx1.KUoIVIumpKat(ruVar32, null, new d4(hfVar22, oh2Var53, yz0Var53, Y1f8riQaR6yg3, df1Var83, null, 2), 3);
                            }
                            if (!za0Var.PxuCJdSBwIXG()) {
                                eh2Var32.RAsUl2FVSrh6(null);
                            }
                        }
                        return no2Var;
                    }
                };
                z9 = z2;
                ai2Var2 = ai2Var5222;
                ruVar = ruVar32;
                df1Var2 = df1Var72;
                hfVar = hfVar22;
                oh2Var4 = oh2Var;
                eh2Var = eh2Var32;
                tf0Var3.JTxCbbCwomzt(obj3);
                nLZGh9p8gVSu5 = mm2.nLZGh9p8gVSu(b51.nxJAScVArhE9(fx1.i68hK7ahKtgp(r102, va0Var), (le0) obj3), z9, e81Var2);
                d91 Pf0ThKz3j5YS222 = sj0.Pf0ThKz3j5YS(Boolean.valueOf(z9), tf0Var3);
                boolean a92UlCVFR9N84222 = tf0Var3.a92UlCVFR9N8(Pf0ThKz3j5YS222) | tf0Var3.rtx2ld2ELZv4(yz0Var2) | tf0Var3.rtx2ld2ELZv4(ai2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var);
                if (i10 > i14) {
                }
                n61Var2 = nLZGh9p8gVSu5;
                if ((i13 & 48) != i14) {
                }
                z10 = true;
                z11 = z10 | a92UlCVFR9N84222;
                Object nLZGh9p8gVSu192222 = tf0Var3.nLZGh9p8gVSu();
                if (!z11) {
                }
                ai2Var3 = ai2Var2;
                ruVar2 = ruVar;
                n61Var3 = n61Var2;
                obj5 = obj4;
                d4 d4Var2222 = new d4(yz0Var2, Pf0ThKz3j5YS222, ai2Var3, eh2Var, ln0Var2, null, 1);
                d91Var = Pf0ThKz3j5YS222;
                tf0Var3.JTxCbbCwomzt(d4Var2222);
                nLZGh9p8gVSu192222 = d4Var2222;
                mm2.wdg6QnbFHrFF(tf0Var3, (pe0) nLZGh9p8gVSu192222, no2.PxuCJdSBwIXG);
                gg1 gg1Var222222 = mp.PxuCJdSBwIXG;
                n61 PxuCJdSBwIXG322222 = lc2.PxuCJdSBwIXG(r102, 8675309, new j3(1, new mt(yz0Var2, 4)));
                va0 va0Var322222 = va0Var;
                df1Var3 = df1Var2;
                ia1 ia1Var22222 = new ia1(yz0Var2, va0Var322222, z9, eh2Var, df1Var3);
                int i2422222 = 7;
                if (z2) {
                }
                n61 TSizfFm2Yiuu222222 = PxuCJdSBwIXG322222.TSizfFm2Yiuu(new kc2(eh2Var.IAToe7bXGz4N, eh2Var.pnx5pC0XzaCw, new j3(5, eh2Var), 4));
                yn1.Companion.getClass();
                n61 TSizfFm2Yiuu322222 = TSizfFm2Yiuu222222.TSizfFm2Yiuu(new vn1());
                final n61 ozEBbv0hFTAB22222 = fx1.ozEBbv0hFTAB(r102, new cd(yz0Var2, oh2Var4, df1Var3, 2));
                is2Var2 = is2Var;
                int i2522222 = i11;
                rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(yz0Var2) | (i12 == 2048) | tf0Var3.a92UlCVFR9N8(is2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var) | (i2522222 == 4) | tf0Var3.rtx2ld2ELZv4(df1Var3);
                nLZGh9p8gVSu6 = tf0Var3.nLZGh9p8gVSu();
                if (rtx2ld2ELZv43) {
                }
                final oh2 oh2Var522222 = oh2Var4;
                le0 le0Var322222 = new le0() { // from class: qt
                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj8) {
                        ei2 ei2Var2;
                        bw0 bw0Var;
                        yz0 yz0Var522222 = yz0.this;
                        mj1 mj1Var = yz0Var522222.QrzZRwfaDlRX;
                        bw0 bw0Var2 = (bw0) obj8;
                        yz0Var522222.rtx2ld2ELZv4 = bw0Var2;
                        ki2 Y1f8riQaR6yg3 = yz0Var522222.Y1f8riQaR6yg();
                        if (Y1f8riQaR6yg3 != null) {
                            Y1f8riQaR6yg3.lS5Rgt96tfkO = bw0Var2;
                        }
                        if (z2) {
                            mi0 PxuCJdSBwIXG4 = yz0Var522222.PxuCJdSBwIXG();
                            mi0 mi0Var = mi0.OPXfSBeufaJ8;
                            eh2 eh2Var4 = eh2Var;
                            oh2 oh2Var6 = oh2Var522222;
                            if (PxuCJdSBwIXG4 == mi0Var) {
                                if (((Boolean) yz0Var522222.x50lh2ztY7Y5.getValue()).booleanValue() && ((Boolean) ((rz0) is2Var2).PxuCJdSBwIXG.getValue()).booleanValue()) {
                                    eh2Var4.EcgxDIVH5in8();
                                } else {
                                    eh2Var4.QrzZRwfaDlRX();
                                }
                                yz0Var522222.cpQdD2nAriOS.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                                yz0Var522222.r3s1LDPKFs1S.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, false)));
                                mj1Var.setValue(Boolean.valueOf(vi2.TSizfFm2Yiuu(oh2Var6.lS5Rgt96tfkO)));
                            } else if (yz0Var522222.PxuCJdSBwIXG() == mi0.wdg6QnbFHrFF) {
                                mj1Var.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                            }
                            df1 df1Var822222 = df1Var3;
                            ov2.Pf0ThKz3j5YS(yz0Var522222, oh2Var6, df1Var822222);
                            ki2 Y1f8riQaR6yg4 = yz0Var522222.Y1f8riQaR6yg();
                            if (Y1f8riQaR6yg4 != null && (ei2Var2 = yz0Var522222.e9gEMXR7LXtO) != null && yz0Var522222.lS5Rgt96tfkO()) {
                                uf2.Companion.getClass();
                                bw0 bw0Var3 = Y1f8riQaR6yg4.lS5Rgt96tfkO;
                                if (bw0Var3 != null && bw0Var3.aF05bpZJlKEP() && (bw0Var = Y1f8riQaR6yg4.TSizfFm2Yiuu) != null) {
                                    ji2 ji2Var = Y1f8riQaR6yg4.PxuCJdSBwIXG;
                                    d0 d0Var = new d0(3, bw0Var3);
                                    qt1 ryVscX7ZL4Ux = ng0.ryVscX7ZL4Ux(bw0Var3);
                                    qt1 nLZGh9p8gVSu20 = bw0Var3.nLZGh9p8gVSu(bw0Var, false);
                                    if (cs0.wdg6QnbFHrFF((ei2) ei2Var2.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var2)) {
                                        ei2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu(oh2Var6, df1Var822222, ji2Var, d0Var, ryVscX7ZL4Ux, nLZGh9p8gVSu20);
                                    }
                                }
                            }
                        }
                        return no2.PxuCJdSBwIXG;
                    }
                };
                is2Var3 = is2Var2;
                df1Var3 = df1Var3;
                tf0Var3.JTxCbbCwomzt(le0Var322222);
                nLZGh9p8gVSu6 = le0Var322222;
                final n61 nxJAScVArhE922222 = mm2.nxJAScVArhE9(r102, (le0) nLZGh9p8gVSu6);
                yz0 yz0Var522222 = yz0Var2;
                eh2Var2 = eh2Var;
                ai2 ai2Var622222 = ai2Var3;
                yt ytVar22222 = new yt(yk2Var, oh2Var, yz0Var522222, z2, df1Var3, eh2Var2, ln0Var, va0Var322222);
                yz0Var3 = yz0Var522222;
                if (!z2) {
                }
                df1Var4 = df1Var3;
                n61Var4 = r102;
                rtx2ld2ELZv44 = tf0Var3.rtx2ld2ELZv4(eh2Var2);
                nLZGh9p8gVSu7 = tf0Var3.nLZGh9p8gVSu();
                if (!rtx2ld2ELZv44) {
                }
                nLZGh9p8gVSu7 = new rt(eh2Var2, 0);
                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu7);
                mm2.rtx2ld2ELZv4(eh2Var2, (le0) nLZGh9p8gVSu7, tf0Var3);
                rtx2ld2ELZv45 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.rtx2ld2ELZv4(ai2Var622222) | (i2522222 == 4) | ((i10 <= 32 && tf0Var3.a92UlCVFR9N8(ln0Var)) || (i13 & 48) == 32);
                nLZGh9p8gVSu8 = tf0Var3.nLZGh9p8gVSu();
                if (rtx2ld2ELZv45) {
                }
                d7 d7Var22222 = new d7(yz0Var3, ai2Var622222, oh2Var, ln0Var, 1);
                ln0Var3 = ln0Var;
                tf0Var3.JTxCbbCwomzt(d7Var22222);
                nLZGh9p8gVSu8 = d7Var22222;
                mm2.rtx2ld2ELZv4(ln0Var3, (le0) nLZGh9p8gVSu8, tf0Var3);
                final le0 mtVar22222 = yz0Var3.VhhvGxCb8gfr;
                if (i == 1) {
                }
                final int i2622222 = ln0Var3.Y1f8riQaR6yg;
                final lo2 lo2Var322222 = lo2Var2;
                final df1 df1Var822222 = df1Var4;
                n61 VhhvGxCb8gfr22222 = VhhvGxCb8gfr(r102, new qe0() { // from class: eg2
                    @Override // defpackage.qe0
                    public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                        ((Integer) obj10).getClass();
                        tf0 tf0Var53 = (tf0) ((hp) obj9);
                        tf0Var53.IXK6ba3ucyzm(851809892);
                        gg1 gg1Var33 = mp.PxuCJdSBwIXG;
                        Object nLZGh9p8gVSu20 = tf0Var53.nLZGh9p8gVSu();
                        hp.Companion.getClass();
                        jx1 jx1Var = fp.lS5Rgt96tfkO;
                        if (nLZGh9p8gVSu20 == jx1Var) {
                            nLZGh9p8gVSu20 = new ti2();
                            tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu20);
                        }
                        ti2 ti2Var = (ti2) nLZGh9p8gVSu20;
                        Object nLZGh9p8gVSu21 = tf0Var53.nLZGh9p8gVSu();
                        if (nLZGh9p8gVSu21 == jx1Var) {
                            nLZGh9p8gVSu21 = new xv();
                            tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu21);
                        }
                        dg2 dg2Var = new dg2(yz0.this, eh2Var2, oh2Var, z142, z15, ti2Var, df1Var822222, lo2Var322222, (xv) nLZGh9p8gVSu21, mtVar22222, i2622222);
                        k61 k61Var = n61.Companion;
                        boolean rtx2ld2ELZv48 = tf0Var53.rtx2ld2ELZv4(dg2Var);
                        Object nLZGh9p8gVSu22 = tf0Var53.nLZGh9p8gVSu();
                        if (rtx2ld2ELZv48 || nLZGh9p8gVSu22 == jx1Var) {
                            RAsUl2FVSrh6 rAsUl2FVSrh6 = new RAsUl2FVSrh6(1, dg2Var, dg2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                            tf0Var53.JTxCbbCwomzt(rAsUl2FVSrh6);
                            nLZGh9p8gVSu22 = rAsUl2FVSrh6;
                        }
                        n61 aF05bpZJlKEP = hq0.aF05bpZJlKEP(k61Var, (le0) ((af0) nLZGh9p8gVSu22));
                        tf0Var53.gPXPFXrUH4XX(false);
                        return aF05bpZJlKEP;
                    }
                });
                hv0.Companion.getClass();
                i16 = i8;
                if (i16 == 7) {
                }
                z12 = false;
                boolean booleanValue2222222 = ((Boolean) d91Var.getValue()).booleanValue();
                f4 f4Var32222222 = f4Var;
                RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var32222222);
                nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
                if (!RAsUl2FVSrh62) {
                }
                nLZGh9p8gVSu9 = new uq(z12, f4Var32222222);
                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
                n61 EpkonXwzFgDB2222222 = bs0.EpkonXwzFgDB(r102, booleanValue2222222, z12, (ae0) nLZGh9p8gVSu9);
                uf ufVar2222222 = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
                long j72222222 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
                if (!hl.TSizfFm2Yiuu(j72222222, mm2.TSizfFm2Yiuu(1308617531))) {
                }
                rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
                nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
                if (!rtx2ld2ELZv46) {
                }
                nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
                tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
                n61 J54yh1s3n4Aq2222222 = fx1.J54yh1s3n4Aq(r102, (le0) nLZGh9p8gVSu10);
                gg1 gg1Var32222222 = mp.PxuCJdSBwIXG;
                i17 = 0;
                n61 TSizfFm2Yiuu42222222 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq2222222), f4Var32222222, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB2222222).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr22222);
                final ug2 ug2Var32222222 = ug2Var;
                n61 TSizfFm2Yiuu52222222 = mm2.nxJAScVArhE9(TSizfFm2Yiuu42222222.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                    
                        if (r14 == r4) goto L16;
                     */
                    @Override // defpackage.qe0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                        ug2 ug2Var4 = ug2.this;
                        mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                        ((Integer) obj10).getClass();
                        tf0 tf0Var52222222 = (tf0) ((hp) obj9);
                        tf0Var52222222.IXK6ba3ucyzm(-2137546592);
                        gg1 gg1Var42222222 = mp.PxuCJdSBwIXG;
                        boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var52222222.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                        boolean a92UlCVFR9N85 = tf0Var52222222.a92UlCVFR9N8(ug2Var4);
                        Object nLZGh9p8gVSu20 = tf0Var52222222.nLZGh9p8gVSu();
                        Object obj11 = fp.lS5Rgt96tfkO;
                        if (!a92UlCVFR9N85) {
                            hp.Companion.getClass();
                        }
                        nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                        tf0Var52222222.JTxCbbCwomzt(nLZGh9p8gVSu20);
                        d91 Pf0ThKz3j5YS2222 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var52222222);
                        Object nLZGh9p8gVSu21 = tf0Var52222222.nLZGh9p8gVSu();
                        hp.Companion.getClass();
                        if (nLZGh9p8gVSu21 == obj11) {
                            Object axVar = new ax(new o6(Pf0ThKz3j5YS2222, 3));
                            tf0Var52222222.JTxCbbCwomzt(axVar);
                            nLZGh9p8gVSu21 = axVar;
                        }
                        e12 e12Var = (e12) nLZGh9p8gVSu21;
                        boolean a92UlCVFR9N86 = tf0Var52222222.a92UlCVFR9N8(e12Var) | tf0Var52222222.a92UlCVFR9N8(ug2Var4);
                        Object nLZGh9p8gVSu22 = tf0Var52222222.nLZGh9p8gVSu();
                        if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                            nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                            tf0Var52222222.JTxCbbCwomzt(nLZGh9p8gVSu22);
                        }
                        n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                        tf0Var52222222.gPXPFXrUH4XX(false);
                        return lS5Rgt96tfkO4;
                    }
                })).TSizfFm2Yiuu(TSizfFm2Yiuu322222).TSizfFm2Yiuu(ytVar22222), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
                if (z2) {
                }
                if (i17 != 0) {
                }
                final n61 n61Var52222222 = r102;
                tf0 tf0Var52222222 = tf0Var3;
                final hy hyVar42222222 = hyVar2;
                final hf hfVar32222222 = hfVar;
                final n61 n61Var62222222 = n61Var4;
                final yz0 yz0Var62222222 = yz0Var3;
                final boolean r152222222 = i17;
                pe0 pe0Var2222222 = new pe0() { // from class: nt
                    @Override // defpackage.pe0
                    public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                        hp hpVar2 = (hp) obj8;
                        int intValue = ((Integer) obj9).intValue();
                        tf0 tf0Var6 = (tf0) hpVar2;
                        if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                            gg1 gg1Var42222222 = mp.PxuCJdSBwIXG;
                            final yz0 yz0Var7 = yz0Var62222222;
                            final dj2 dj2Var3 = dj2Var;
                            final int i27 = i2;
                            final int i28 = i;
                            final ug2 ug2Var4 = ug2Var32222222;
                            final oh2 oh2Var6 = oh2Var;
                            final wr2 wr2Var2 = wr2Var;
                            final n61 n61Var7 = n61Var62222222;
                            final n61 n61Var8 = ozEBbv0hFTAB22222;
                            final n61 n61Var9 = nxJAScVArhE922222;
                            final n61 n61Var10 = n61Var52222222;
                            final hf hfVar4 = hfVar32222222;
                            final eh2 eh2Var4 = eh2Var2;
                            final boolean z16 = r152222222;
                            final le0 le0Var4 = le0Var2;
                            final df1 df1Var9 = df1Var822222;
                            final hy hyVar5 = hyVar42222222;
                            on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                                /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                                
                                    if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                                 */
                                @Override // defpackage.pe0
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                    n61 jq2Var;
                                    oh2 oh2Var7 = oh2Var6;
                                    long j8 = oh2Var7.lS5Rgt96tfkO;
                                    hp hpVar3 = (hp) obj10;
                                    int intValue2 = ((Integer) obj11).intValue();
                                    tf0 tf0Var7 = (tf0) hpVar3;
                                    if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                        k61 k61Var = n61.Companion;
                                        yz0 yz0Var8 = yz0.this;
                                        n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                        int i29 = i27;
                                        int i30 = i28;
                                        kj0.wLFCmsViZrNT(i29, i30);
                                        dj2 dj2Var4 = dj2Var3;
                                        if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                            Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                        }
                                        boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                        Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                        if (!rtx2ld2ELZv48) {
                                            hp.Companion.getClass();
                                        }
                                        nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                        tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                        ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                        ug2 ug2Var5 = ug2Var4;
                                        th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                        ui2 ui2Var2 = vi2.Companion;
                                        int i31 = (int) (j8 >> 32);
                                        long j9 = ug2Var5.e9gEMXR7LXtO;
                                        n61 n61Var11 = Y1f8riQaR6yg3;
                                        if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                            i31 = vi2.a92UlCVFR9N8(j8);
                                        }
                                        ug2Var5.e9gEMXR7LXtO = j8;
                                        yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                        int ordinal = th1Var2.ordinal();
                                        if (ordinal == 0) {
                                            jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                        } else {
                                            if (ordinal != 1) {
                                                u9.gPXPFXrUH4XX();
                                                return null;
                                            }
                                            jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                        }
                                        ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                    } else {
                                        tf0Var7.i68hK7ahKtgp();
                                    }
                                    return no2.PxuCJdSBwIXG;
                                }
                            }, tf0Var6), tf0Var6, 6);
                        } else {
                            tf0Var6.i68hK7ahKtgp();
                        }
                        return no2.PxuCJdSBwIXG;
                    }
                };
                tf0Var = tf0Var52222222;
                Y1f8riQaR6yg(TSizfFm2Yiuu52222222, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var2222222, tf0Var), tf0Var, 384);
                gg1 gg1Var42222222 = mp.PxuCJdSBwIXG;
            }
            ai2Var = ai2Var4;
            if ((i19 & 48) != 32) {
            }
            z8 = true;
            rtx2ld2ELZv42 = rtx2ld2ELZv472 | z8 | tf0Var2.rtx2ld2ELZv4(df1Var72) | tf0Var2.rtx2ld2ELZv4(ruVar32) | tf0Var2.rtx2ld2ELZv4(hfVar22) | tf0Var2.rtx2ld2ELZv4(eh2Var32);
            Object nLZGh9p8gVSu182222 = tf0Var2.nLZGh9p8gVSu();
            if (rtx2ld2ELZv42) {
            }
            i11 = i232;
            i12 = i222;
            obj4 = obj2;
            i13 = i19;
            lo2Var2 = lo2Var;
            na0Var2 = na0Var;
            yz0Var2 = yz0Var4;
            f4Var = f4Var2;
            i14 = 32;
            e81Var2 = e81Var;
            ln0Var2 = ln0Var;
            tf0Var3 = tf0Var2;
            i15 = i9;
            final ai2 ai2Var52222 = ai2Var;
            va0Var = va0Var2;
            obj3 = new le0() { // from class: pt
                @Override // defpackage.le0
                public final Object OPXfSBeufaJ8(Object obj72) {
                    ki2 Y1f8riQaR6yg3;
                    za0 za0Var = (za0) obj72;
                    yz0 yz0Var53 = yz0.this;
                    boolean lS5Rgt96tfkO4 = yz0Var53.lS5Rgt96tfkO();
                    boolean PxuCJdSBwIXG33 = za0Var.PxuCJdSBwIXG();
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    if (lS5Rgt96tfkO4 != PxuCJdSBwIXG33) {
                        yz0Var53.a92UlCVFR9N8.setValue(Boolean.valueOf(za0Var.PxuCJdSBwIXG()));
                        boolean lS5Rgt96tfkO5 = yz0Var53.lS5Rgt96tfkO();
                        oh2 oh2Var53 = oh2Var;
                        df1 df1Var83 = df1Var72;
                        if (lS5Rgt96tfkO5 && z2) {
                            tf2 tf2Var = uf2.Companion;
                            op0 op0Var2 = yz0Var53.Y1f8riQaR6yg;
                            mt mtVar3 = yz0Var53.VhhvGxCb8gfr;
                            mt mtVar23 = yz0Var53.S2OOm9zPNm0h;
                            tf2Var.getClass();
                            zt1 zt1Var = new zt1();
                            cd cdVar = new cd(op0Var2, mtVar3, zt1Var);
                            ai2 ai2Var63 = ai2Var52222;
                            kn1 kn1Var = ai2Var63.PxuCJdSBwIXG;
                            kn1Var.PxuCJdSBwIXG(oh2Var53, ln0Var2, cdVar, mtVar23);
                            ei2 ei2Var2 = new ei2(ai2Var63, kn1Var);
                            ai2Var63.lS5Rgt96tfkO.set(ei2Var2);
                            zt1Var.rtx2ld2ELZv4 = ei2Var2;
                            yz0Var53.e9gEMXR7LXtO = ei2Var2;
                            ov2.Pf0ThKz3j5YS(yz0Var53, oh2Var53, df1Var83);
                        } else {
                            ov2.e6tOsSdd2EFb(yz0Var53);
                        }
                        if (za0Var.PxuCJdSBwIXG() && (Y1f8riQaR6yg3 = yz0Var53.Y1f8riQaR6yg()) != null) {
                            fx1.KUoIVIumpKat(ruVar32, null, new d4(hfVar22, oh2Var53, yz0Var53, Y1f8riQaR6yg3, df1Var83, null, 2), 3);
                        }
                        if (!za0Var.PxuCJdSBwIXG()) {
                            eh2Var32.RAsUl2FVSrh6(null);
                        }
                    }
                    return no2Var;
                }
            };
            z9 = z2;
            ai2Var2 = ai2Var52222;
            ruVar = ruVar32;
            df1Var2 = df1Var72;
            hfVar = hfVar22;
            oh2Var4 = oh2Var;
            eh2Var = eh2Var32;
            tf0Var3.JTxCbbCwomzt(obj3);
            nLZGh9p8gVSu5 = mm2.nLZGh9p8gVSu(b51.nxJAScVArhE9(fx1.i68hK7ahKtgp(r102, va0Var), (le0) obj3), z9, e81Var2);
            d91 Pf0ThKz3j5YS2222 = sj0.Pf0ThKz3j5YS(Boolean.valueOf(z9), tf0Var3);
            boolean a92UlCVFR9N842222 = tf0Var3.a92UlCVFR9N8(Pf0ThKz3j5YS2222) | tf0Var3.rtx2ld2ELZv4(yz0Var2) | tf0Var3.rtx2ld2ELZv4(ai2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var);
            if (i10 > i14) {
            }
            n61Var2 = nLZGh9p8gVSu5;
            if ((i13 & 48) != i14) {
            }
            z10 = true;
            z11 = z10 | a92UlCVFR9N842222;
            Object nLZGh9p8gVSu1922222 = tf0Var3.nLZGh9p8gVSu();
            if (!z11) {
            }
            ai2Var3 = ai2Var2;
            ruVar2 = ruVar;
            n61Var3 = n61Var2;
            obj5 = obj4;
            d4 d4Var22222 = new d4(yz0Var2, Pf0ThKz3j5YS2222, ai2Var3, eh2Var, ln0Var2, null, 1);
            d91Var = Pf0ThKz3j5YS2222;
            tf0Var3.JTxCbbCwomzt(d4Var22222);
            nLZGh9p8gVSu1922222 = d4Var22222;
            mm2.wdg6QnbFHrFF(tf0Var3, (pe0) nLZGh9p8gVSu1922222, no2.PxuCJdSBwIXG);
            gg1 gg1Var2222222 = mp.PxuCJdSBwIXG;
            n61 PxuCJdSBwIXG3222222 = lc2.PxuCJdSBwIXG(r102, 8675309, new j3(1, new mt(yz0Var2, 4)));
            va0 va0Var3222222 = va0Var;
            df1Var3 = df1Var2;
            ia1 ia1Var222222 = new ia1(yz0Var2, va0Var3222222, z9, eh2Var, df1Var3);
            int i24222222 = 7;
            if (z2) {
            }
            n61 TSizfFm2Yiuu2222222 = PxuCJdSBwIXG3222222.TSizfFm2Yiuu(new kc2(eh2Var.IAToe7bXGz4N, eh2Var.pnx5pC0XzaCw, new j3(5, eh2Var), 4));
            yn1.Companion.getClass();
            n61 TSizfFm2Yiuu3222222 = TSizfFm2Yiuu2222222.TSizfFm2Yiuu(new vn1());
            final n61 ozEBbv0hFTAB222222 = fx1.ozEBbv0hFTAB(r102, new cd(yz0Var2, oh2Var4, df1Var3, 2));
            is2Var2 = is2Var;
            int i25222222 = i11;
            rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(yz0Var2) | (i12 == 2048) | tf0Var3.a92UlCVFR9N8(is2Var2) | tf0Var3.rtx2ld2ELZv4(eh2Var) | (i25222222 == 4) | tf0Var3.rtx2ld2ELZv4(df1Var3);
            nLZGh9p8gVSu6 = tf0Var3.nLZGh9p8gVSu();
            if (rtx2ld2ELZv43) {
            }
            final oh2 oh2Var5222222 = oh2Var4;
            le0 le0Var3222222 = new le0() { // from class: qt
                @Override // defpackage.le0
                public final Object OPXfSBeufaJ8(Object obj8) {
                    ei2 ei2Var2;
                    bw0 bw0Var;
                    yz0 yz0Var5222222 = yz0.this;
                    mj1 mj1Var = yz0Var5222222.QrzZRwfaDlRX;
                    bw0 bw0Var2 = (bw0) obj8;
                    yz0Var5222222.rtx2ld2ELZv4 = bw0Var2;
                    ki2 Y1f8riQaR6yg3 = yz0Var5222222.Y1f8riQaR6yg();
                    if (Y1f8riQaR6yg3 != null) {
                        Y1f8riQaR6yg3.lS5Rgt96tfkO = bw0Var2;
                    }
                    if (z2) {
                        mi0 PxuCJdSBwIXG4 = yz0Var5222222.PxuCJdSBwIXG();
                        mi0 mi0Var = mi0.OPXfSBeufaJ8;
                        eh2 eh2Var4 = eh2Var;
                        oh2 oh2Var6 = oh2Var5222222;
                        if (PxuCJdSBwIXG4 == mi0Var) {
                            if (((Boolean) yz0Var5222222.x50lh2ztY7Y5.getValue()).booleanValue() && ((Boolean) ((rz0) is2Var2).PxuCJdSBwIXG.getValue()).booleanValue()) {
                                eh2Var4.EcgxDIVH5in8();
                            } else {
                                eh2Var4.QrzZRwfaDlRX();
                            }
                            yz0Var5222222.cpQdD2nAriOS.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                            yz0Var5222222.r3s1LDPKFs1S.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, false)));
                            mj1Var.setValue(Boolean.valueOf(vi2.TSizfFm2Yiuu(oh2Var6.lS5Rgt96tfkO)));
                        } else if (yz0Var5222222.PxuCJdSBwIXG() == mi0.wdg6QnbFHrFF) {
                            mj1Var.setValue(Boolean.valueOf(kj0.BjEWd04qc7Mw(eh2Var4, true)));
                        }
                        df1 df1Var8222222 = df1Var3;
                        ov2.Pf0ThKz3j5YS(yz0Var5222222, oh2Var6, df1Var8222222);
                        ki2 Y1f8riQaR6yg4 = yz0Var5222222.Y1f8riQaR6yg();
                        if (Y1f8riQaR6yg4 != null && (ei2Var2 = yz0Var5222222.e9gEMXR7LXtO) != null && yz0Var5222222.lS5Rgt96tfkO()) {
                            uf2.Companion.getClass();
                            bw0 bw0Var3 = Y1f8riQaR6yg4.lS5Rgt96tfkO;
                            if (bw0Var3 != null && bw0Var3.aF05bpZJlKEP() && (bw0Var = Y1f8riQaR6yg4.TSizfFm2Yiuu) != null) {
                                ji2 ji2Var = Y1f8riQaR6yg4.PxuCJdSBwIXG;
                                d0 d0Var = new d0(3, bw0Var3);
                                qt1 ryVscX7ZL4Ux = ng0.ryVscX7ZL4Ux(bw0Var3);
                                qt1 nLZGh9p8gVSu20 = bw0Var3.nLZGh9p8gVSu(bw0Var, false);
                                if (cs0.wdg6QnbFHrFF((ei2) ei2Var2.PxuCJdSBwIXG.lS5Rgt96tfkO.get(), ei2Var2)) {
                                    ei2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu(oh2Var6, df1Var8222222, ji2Var, d0Var, ryVscX7ZL4Ux, nLZGh9p8gVSu20);
                                }
                            }
                        }
                    }
                    return no2.PxuCJdSBwIXG;
                }
            };
            is2Var3 = is2Var2;
            df1Var3 = df1Var3;
            tf0Var3.JTxCbbCwomzt(le0Var3222222);
            nLZGh9p8gVSu6 = le0Var3222222;
            final n61 nxJAScVArhE9222222 = mm2.nxJAScVArhE9(r102, (le0) nLZGh9p8gVSu6);
            yz0 yz0Var5222222 = yz0Var2;
            eh2Var2 = eh2Var;
            ai2 ai2Var6222222 = ai2Var3;
            yt ytVar222222 = new yt(yk2Var, oh2Var, yz0Var5222222, z2, df1Var3, eh2Var2, ln0Var, va0Var3222222);
            yz0Var3 = yz0Var5222222;
            if (!z2) {
            }
            df1Var4 = df1Var3;
            n61Var4 = r102;
            rtx2ld2ELZv44 = tf0Var3.rtx2ld2ELZv4(eh2Var2);
            nLZGh9p8gVSu7 = tf0Var3.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv44) {
            }
            nLZGh9p8gVSu7 = new rt(eh2Var2, 0);
            tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu7);
            mm2.rtx2ld2ELZv4(eh2Var2, (le0) nLZGh9p8gVSu7, tf0Var3);
            rtx2ld2ELZv45 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.rtx2ld2ELZv4(ai2Var6222222) | (i25222222 == 4) | ((i10 <= 32 && tf0Var3.a92UlCVFR9N8(ln0Var)) || (i13 & 48) == 32);
            nLZGh9p8gVSu8 = tf0Var3.nLZGh9p8gVSu();
            if (rtx2ld2ELZv45) {
            }
            d7 d7Var222222 = new d7(yz0Var3, ai2Var6222222, oh2Var, ln0Var, 1);
            ln0Var3 = ln0Var;
            tf0Var3.JTxCbbCwomzt(d7Var222222);
            nLZGh9p8gVSu8 = d7Var222222;
            mm2.rtx2ld2ELZv4(ln0Var3, (le0) nLZGh9p8gVSu8, tf0Var3);
            final le0 mtVar222222 = yz0Var3.VhhvGxCb8gfr;
            if (i == 1) {
            }
            final int i26222222 = ln0Var3.Y1f8riQaR6yg;
            final lo2 lo2Var3222222 = lo2Var2;
            final df1 df1Var8222222 = df1Var4;
            n61 VhhvGxCb8gfr222222 = VhhvGxCb8gfr(r102, new qe0() { // from class: eg2
                @Override // defpackage.qe0
                public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    tf0 tf0Var53 = (tf0) ((hp) obj9);
                    tf0Var53.IXK6ba3ucyzm(851809892);
                    gg1 gg1Var33 = mp.PxuCJdSBwIXG;
                    Object nLZGh9p8gVSu20 = tf0Var53.nLZGh9p8gVSu();
                    hp.Companion.getClass();
                    jx1 jx1Var = fp.lS5Rgt96tfkO;
                    if (nLZGh9p8gVSu20 == jx1Var) {
                        nLZGh9p8gVSu20 = new ti2();
                        tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu20);
                    }
                    ti2 ti2Var = (ti2) nLZGh9p8gVSu20;
                    Object nLZGh9p8gVSu21 = tf0Var53.nLZGh9p8gVSu();
                    if (nLZGh9p8gVSu21 == jx1Var) {
                        nLZGh9p8gVSu21 = new xv();
                        tf0Var53.JTxCbbCwomzt(nLZGh9p8gVSu21);
                    }
                    dg2 dg2Var = new dg2(yz0.this, eh2Var2, oh2Var, z142, z15, ti2Var, df1Var8222222, lo2Var3222222, (xv) nLZGh9p8gVSu21, mtVar222222, i26222222);
                    k61 k61Var = n61.Companion;
                    boolean rtx2ld2ELZv48 = tf0Var53.rtx2ld2ELZv4(dg2Var);
                    Object nLZGh9p8gVSu22 = tf0Var53.nLZGh9p8gVSu();
                    if (rtx2ld2ELZv48 || nLZGh9p8gVSu22 == jx1Var) {
                        RAsUl2FVSrh6 rAsUl2FVSrh6 = new RAsUl2FVSrh6(1, dg2Var, dg2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 5);
                        tf0Var53.JTxCbbCwomzt(rAsUl2FVSrh6);
                        nLZGh9p8gVSu22 = rAsUl2FVSrh6;
                    }
                    n61 aF05bpZJlKEP = hq0.aF05bpZJlKEP(k61Var, (le0) ((af0) nLZGh9p8gVSu22));
                    tf0Var53.gPXPFXrUH4XX(false);
                    return aF05bpZJlKEP;
                }
            });
            hv0.Companion.getClass();
            i16 = i8;
            if (i16 == 7) {
            }
            z12 = false;
            boolean booleanValue22222222 = ((Boolean) d91Var.getValue()).booleanValue();
            f4 f4Var322222222 = f4Var;
            RAsUl2FVSrh62 = tf0Var3.RAsUl2FVSrh6(z12) | tf0Var3.rtx2ld2ELZv4(f4Var322222222);
            nLZGh9p8gVSu9 = tf0Var3.nLZGh9p8gVSu();
            if (!RAsUl2FVSrh62) {
            }
            nLZGh9p8gVSu9 = new uq(z12, f4Var322222222);
            tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu9);
            n61 EpkonXwzFgDB22222222 = bs0.EpkonXwzFgDB(r102, booleanValue22222222, z12, (ae0) nLZGh9p8gVSu9);
            uf ufVar22222222 = (uf) tf0Var3.wdg6QnbFHrFF(mb.PxuCJdSBwIXG);
            long j722222222 = ((hl) tf0Var3.wdg6QnbFHrFF(mb.lS5Rgt96tfkO)).PxuCJdSBwIXG;
            if (!hl.TSizfFm2Yiuu(j722222222, mm2.TSizfFm2Yiuu(1308617531))) {
            }
            rtx2ld2ELZv46 = tf0Var3.rtx2ld2ELZv4(yz0Var3) | tf0Var3.a92UlCVFR9N8(m82Var2);
            nLZGh9p8gVSu10 = tf0Var3.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv46) {
            }
            nLZGh9p8gVSu10 = new e9gEMXR7LXtO(8, yz0Var3, m82Var2);
            tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu10);
            n61 J54yh1s3n4Aq22222222 = fx1.J54yh1s3n4Aq(r102, (le0) nLZGh9p8gVSu10);
            gg1 gg1Var322222222 = mp.PxuCJdSBwIXG;
            i17 = 0;
            n61 TSizfFm2Yiuu422222222 = hq0.kpCQ9veP6n3I(hq0.kpCQ9veP6n3I(zv.EpkonXwzFgDB(n61Var.TSizfFm2Yiuu(J54yh1s3n4Aq22222222), f4Var322222222, yz0Var3, eh2Var2).TSizfFm2Yiuu(EpkonXwzFgDB22222222).TSizfFm2Yiuu(n61Var3), new xt(na0Var2, yz0Var3)), new xt(i17, yz0Var3, eh2Var2)).TSizfFm2Yiuu(VhhvGxCb8gfr222222);
            final ug2 ug2Var322222222 = ug2Var;
            n61 TSizfFm2Yiuu522222222 = mm2.nxJAScVArhE9(TSizfFm2Yiuu422222222.TSizfFm2Yiuu(new ep(new qe0() { // from class: qg2
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                
                    if (r14 == r4) goto L16;
                 */
                @Override // defpackage.qe0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object a92UlCVFR9N8(Object obj8, Object obj9, Object obj10) {
                    ug2 ug2Var4 = ug2.this;
                    mj1 mj1Var = ug2Var4.a92UlCVFR9N8;
                    ((Integer) obj10).getClass();
                    tf0 tf0Var522222222 = (tf0) ((hp) obj9);
                    tf0Var522222222.IXK6ba3ucyzm(-2137546592);
                    gg1 gg1Var422222222 = mp.PxuCJdSBwIXG;
                    boolean z16 = ((th1) mj1Var.getValue()) == th1.rtx2ld2ELZv4 || !(tf0Var522222222.wdg6QnbFHrFF(eq.r3s1LDPKFs1S) == cw0.OPXfSBeufaJ8);
                    boolean a92UlCVFR9N85 = tf0Var522222222.a92UlCVFR9N8(ug2Var4);
                    Object nLZGh9p8gVSu20 = tf0Var522222222.nLZGh9p8gVSu();
                    Object obj11 = fp.lS5Rgt96tfkO;
                    if (!a92UlCVFR9N85) {
                        hp.Companion.getClass();
                    }
                    nLZGh9p8gVSu20 = new xw1(14, ug2Var4);
                    tf0Var522222222.JTxCbbCwomzt(nLZGh9p8gVSu20);
                    d91 Pf0ThKz3j5YS22222 = sj0.Pf0ThKz3j5YS((le0) nLZGh9p8gVSu20, tf0Var522222222);
                    Object nLZGh9p8gVSu21 = tf0Var522222222.nLZGh9p8gVSu();
                    hp.Companion.getClass();
                    if (nLZGh9p8gVSu21 == obj11) {
                        Object axVar = new ax(new o6(Pf0ThKz3j5YS22222, 3));
                        tf0Var522222222.JTxCbbCwomzt(axVar);
                        nLZGh9p8gVSu21 = axVar;
                    }
                    e12 e12Var = (e12) nLZGh9p8gVSu21;
                    boolean a92UlCVFR9N86 = tf0Var522222222.a92UlCVFR9N8(e12Var) | tf0Var522222222.a92UlCVFR9N8(ug2Var4);
                    Object nLZGh9p8gVSu22 = tf0Var522222222.nLZGh9p8gVSu();
                    if (a92UlCVFR9N86 || nLZGh9p8gVSu22 == obj11) {
                        nLZGh9p8gVSu22 = new sg2(e12Var, ug2Var4);
                        tf0Var522222222.JTxCbbCwomzt(nLZGh9p8gVSu22);
                    }
                    n61 lS5Rgt96tfkO4 = x02.lS5Rgt96tfkO(n61.Companion, (sg2) nLZGh9p8gVSu22, (th1) mj1Var.getValue(), z2 && ug2Var4.lS5Rgt96tfkO.rtx2ld2ELZv4() != 0.0f, z16, e81Var2);
                    tf0Var522222222.gPXPFXrUH4XX(false);
                    return lS5Rgt96tfkO4;
                }
            })).TSizfFm2Yiuu(TSizfFm2Yiuu3222222).TSizfFm2Yiuu(ytVar222222), new mt(yz0Var3, i17)).TSizfFm2Yiuu(new m(new bf(19, eh2Var2, ruVar2)));
            if (z2) {
            }
            if (i17 != 0) {
            }
            final n61 n61Var522222222 = r102;
            tf0 tf0Var522222222 = tf0Var3;
            final hy hyVar422222222 = hyVar2;
            final hf hfVar322222222 = hfVar;
            final n61 n61Var622222222 = n61Var4;
            final yz0 yz0Var622222222 = yz0Var3;
            final boolean r1522222222 = i17;
            pe0 pe0Var22222222 = new pe0() { // from class: nt
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                    hp hpVar2 = (hp) obj8;
                    int intValue = ((Integer) obj9).intValue();
                    tf0 tf0Var6 = (tf0) hpVar2;
                    if (tf0Var6.Pf0ThKz3j5YS(intValue & 1, (intValue & 3) != 2)) {
                        gg1 gg1Var422222222 = mp.PxuCJdSBwIXG;
                        final yz0 yz0Var7 = yz0Var622222222;
                        final dj2 dj2Var3 = dj2Var;
                        final int i27 = i2;
                        final int i28 = i;
                        final ug2 ug2Var4 = ug2Var322222222;
                        final oh2 oh2Var6 = oh2Var;
                        final wr2 wr2Var2 = wr2Var;
                        final n61 n61Var7 = n61Var622222222;
                        final n61 n61Var8 = ozEBbv0hFTAB222222;
                        final n61 n61Var9 = nxJAScVArhE9222222;
                        final n61 n61Var10 = n61Var522222222;
                        final hf hfVar4 = hfVar322222222;
                        final eh2 eh2Var4 = eh2Var2;
                        final boolean z16 = r1522222222;
                        final le0 le0Var4 = le0Var2;
                        final df1 df1Var9 = df1Var8222222;
                        final hy hyVar5 = hyVar422222222;
                        on.this.a92UlCVFR9N8(bs0.kpCQ9veP6n3I(-44346382, new pe0() { // from class: jt
                            /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
                            
                                if (r11 == defpackage.fp.lS5Rgt96tfkO) goto L18;
                             */
                            @Override // defpackage.pe0
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object rtx2ld2ELZv4(Object obj10, Object obj11) {
                                n61 jq2Var;
                                oh2 oh2Var7 = oh2Var6;
                                long j8 = oh2Var7.lS5Rgt96tfkO;
                                hp hpVar3 = (hp) obj10;
                                int intValue2 = ((Integer) obj11).intValue();
                                tf0 tf0Var7 = (tf0) hpVar3;
                                if (tf0Var7.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                    k61 k61Var = n61.Companion;
                                    yz0 yz0Var8 = yz0.this;
                                    n61 Y1f8riQaR6yg3 = c62.Y1f8riQaR6yg(k61Var, ((k10) yz0Var8.RAsUl2FVSrh6.getValue()).rtx2ld2ELZv4);
                                    int i29 = i27;
                                    int i30 = i28;
                                    kj0.wLFCmsViZrNT(i29, i30);
                                    dj2 dj2Var4 = dj2Var3;
                                    if (i29 != 1 || i30 != Integer.MAX_VALUE) {
                                        Y1f8riQaR6yg3 = Y1f8riQaR6yg3.TSizfFm2Yiuu(new jj0(dj2Var4, i29, i30));
                                    }
                                    boolean rtx2ld2ELZv48 = tf0Var7.rtx2ld2ELZv4(yz0Var8);
                                    Object nLZGh9p8gVSu20 = tf0Var7.nLZGh9p8gVSu();
                                    if (!rtx2ld2ELZv48) {
                                        hp.Companion.getClass();
                                    }
                                    nLZGh9p8gVSu20 = new o5(7, yz0Var8);
                                    tf0Var7.JTxCbbCwomzt(nLZGh9p8gVSu20);
                                    ae0 ae0Var = (ae0) nLZGh9p8gVSu20;
                                    ug2 ug2Var5 = ug2Var4;
                                    th1 th1Var2 = (th1) ug2Var5.a92UlCVFR9N8.getValue();
                                    ui2 ui2Var2 = vi2.Companion;
                                    int i31 = (int) (j8 >> 32);
                                    long j9 = ug2Var5.e9gEMXR7LXtO;
                                    n61 n61Var11 = Y1f8riQaR6yg3;
                                    if (i31 == ((int) (j9 >> 32)) && (i31 = (int) (j8 & 4294967295L)) == ((int) (4294967295L & j9))) {
                                        i31 = vi2.a92UlCVFR9N8(j8);
                                    }
                                    ug2Var5.e9gEMXR7LXtO = j8;
                                    yk2 PxuCJdSBwIXG4 = ip2.PxuCJdSBwIXG(wr2Var2, oh2Var7.PxuCJdSBwIXG);
                                    int ordinal = th1Var2.ordinal();
                                    if (ordinal == 0) {
                                        jq2Var = new jq2(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                    } else {
                                        if (ordinal != 1) {
                                            u9.gPXPFXrUH4XX();
                                            return null;
                                        }
                                        jq2Var = new fk0(ug2Var5, i31, PxuCJdSBwIXG4, ae0Var);
                                    }
                                    ki0.OPXfSBeufaJ8(bs0.cpQdD2nAriOS(hq0.XL4ISE6Oc65B(n61Var11).TSizfFm2Yiuu(jq2Var).TSizfFm2Yiuu(n61Var7).TSizfFm2Yiuu(n61Var8).TSizfFm2Yiuu(new kh2(dj2Var4)).TSizfFm2Yiuu(n61Var9).TSizfFm2Yiuu(n61Var10), hfVar4), bs0.kpCQ9veP6n3I(1412697320, new kt(eh2Var4, yz0Var8, z16, le0Var4, oh2Var7, df1Var9, hyVar5, i30, 0), tf0Var7), tf0Var7, 48);
                                } else {
                                    tf0Var7.i68hK7ahKtgp();
                                }
                                return no2.PxuCJdSBwIXG;
                            }
                        }, tf0Var6), tf0Var6, 6);
                    } else {
                        tf0Var6.i68hK7ahKtgp();
                    }
                    return no2.PxuCJdSBwIXG;
                }
            };
            tf0Var = tf0Var522222222;
            Y1f8riQaR6yg(TSizfFm2Yiuu522222222, eh2Var2, bs0.kpCQ9veP6n3I(-814563849, pe0Var22222222, tf0Var), tf0Var, 384);
            gg1 gg1Var422222222 = mp.PxuCJdSBwIXG;
        } else {
            tf0Var = tf0Var4;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: ot
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(i3 | 1);
                    int bEKsvqmvPh2y2 = ki0.bEKsvqmvPh2y(i4);
                    ov2.TSizfFm2Yiuu(oh2.this, le0Var, n61Var, dj2Var, wr2Var, le0Var2, e81Var, m82Var, z, i, i2, ln0Var, bv0Var, z2, onVar, (hp) obj8, bEKsvqmvPh2y, bEKsvqmvPh2y2);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static n61 VhhvGxCb8gfr(n61 n61Var, qe0 qe0Var) {
        return n61Var.TSizfFm2Yiuu(new ep(qe0Var));
    }

    public static final void Y1f8riQaR6yg(n61 n61Var, eh2 eh2Var, on onVar, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(2036174316);
        int i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(eh2Var) ? 32 : 16);
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, true);
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = xfACYKDMU6Dj(tf0Var, n61Var);
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
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            mm2.a92UlCVFR9N8(eh2Var, onVar, tf0Var, (i2 >> 3) & 126);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new n6(n61Var, eh2Var, onVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dc0 ZbWwgt3aGe7A(Context context) {
        ProviderInfo providerInfo;
        bc0 bc0Var;
        ApplicationInfo applicationInfo;
        int i = 28;
        ih0 hwVar = Build.VERSION.SDK_INT >= 28 ? new hw(i) : new ih0(i);
        PackageManager packageManager = context.getPackageManager();
        ki0.RfyTYNmI9Srp(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] r3s1LDPKFs1S = hwVar.r3s1LDPKFs1S(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : r3s1LDPKFs1S) {
                    arrayList.add(signature.toByteArray());
                }
                bc0Var = new bc0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (bc0Var != null) {
                return null;
            }
            return new dc0(new cc0(context, bc0Var));
        }
        bc0Var = null;
        if (bc0Var != null) {
        }
    }

    public static final long a92UlCVFR9N8(float f, float f2, int i) {
        float f3 = f2 + f;
        float f4 = ((i / 3) * f3) + (f / 2.0f);
        return (Float.floatToRawIntBits(((i % 3) * f3) + r4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
    }

    public static Object aF05bpZJlKEP(Object obj, Class cls) {
        if (obj instanceof ig0) {
            return cls.cast(obj);
        }
        if (obj instanceof jg0) {
            return aF05bpZJlKEP(((jg0) obj).Y1f8riQaR6yg(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + ig0.class + " or " + jg0.class);
    }

    public static final boolean amuv7NJvPxHu(d82 d82Var, le0 le0Var) {
        int i;
        tmVwIGCQF4zR tmvwigcqf4zr;
        Object OPXfSBeufaJ82;
        j72 OPXfSBeufaJ83;
        boolean BRwzKIf41E4i;
        do {
            synchronized (x50lh2ztY7Y5) {
                o92 o92Var = d82Var.rtx2ld2ELZv4;
                o92Var.getClass();
                o92 o92Var2 = (o92) s72.RAsUl2FVSrh6(o92Var);
                i = o92Var2.Y1f8riQaR6yg;
                tmvwigcqf4zr = o92Var2.TSizfFm2Yiuu;
            }
            tmvwigcqf4zr.getClass();
            vl1 e9gEMXR7LXtO2 = tmvwigcqf4zr.e9gEMXR7LXtO();
            OPXfSBeufaJ82 = le0Var.OPXfSBeufaJ8(e9gEMXR7LXtO2);
            tmVwIGCQF4zR TSizfFm2Yiuu2 = e9gEMXR7LXtO2.TSizfFm2Yiuu();
            if (cs0.wdg6QnbFHrFF(TSizfFm2Yiuu2, tmvwigcqf4zr)) {
                break;
            }
            o92 o92Var3 = d82Var.rtx2ld2ELZv4;
            o92Var3.getClass();
            synchronized (s72.TSizfFm2Yiuu) {
                j72.Companion.getClass();
                OPXfSBeufaJ83 = s72.OPXfSBeufaJ8();
                BRwzKIf41E4i = BRwzKIf41E4i((o92) s72.VhhvGxCb8gfr(o92Var3, d82Var, OPXfSBeufaJ83), i, TSizfFm2Yiuu2, true);
            }
            s72.cpQdD2nAriOS(OPXfSBeufaJ83, d82Var);
        } while (!BRwzKIf41E4i);
        return ((Boolean) OPXfSBeufaJ82).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r1 == r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
    
        if (r3 == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        if (r9 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        if (r5 == r2) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void cpQdD2nAriOS(eh2 eh2Var, hp hpVar, int i) {
        v8 cpQdD2nAriOS2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1436003720);
        int i2 = 2;
        int i3 = (tf0Var.rtx2ld2ELZv4(eh2Var) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            yz0 yz0Var = eh2Var.Y1f8riQaR6yg;
            if (yz0Var == null || !((Boolean) yz0Var.QrzZRwfaDlRX.getValue()).booleanValue() || (cpQdD2nAriOS2 = eh2Var.cpQdD2nAriOS()) == null || cpQdD2nAriOS2.OPXfSBeufaJ8.length() <= 0) {
                tf0Var.IXK6ba3ucyzm(-2111042550);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-2112351432);
                boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(eh2Var);
                Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                jx1 jx1Var = fp.lS5Rgt96tfkO;
                if (!a92UlCVFR9N82) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu = new zg2(eh2Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                of2 of2Var = (of2) nLZGh9p8gVSu;
                hy hyVar = (hy) tf0Var.wdg6QnbFHrFF(eq.rtx2ld2ELZv4);
                df1 df1Var = eh2Var.lS5Rgt96tfkO;
                long j = eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO;
                ui2 ui2Var = vi2.Companion;
                int lS5Rgt96tfkO2 = df1Var.lS5Rgt96tfkO((int) (j >> 32));
                yz0 yz0Var2 = eh2Var.Y1f8riQaR6yg;
                ki2 Y1f8riQaR6yg2 = yz0Var2 != null ? yz0Var2.Y1f8riQaR6yg() : null;
                Y1f8riQaR6yg2.getClass();
                ji2 ji2Var = Y1f8riQaR6yg2.PxuCJdSBwIXG;
                qt1 TSizfFm2Yiuu2 = ji2Var.TSizfFm2Yiuu(ng0.wdg6QnbFHrFF(lS5Rgt96tfkO2, 0, ji2Var.PxuCJdSBwIXG.PxuCJdSBwIXG.OPXfSBeufaJ8.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((hyVar.e6tOsSdd2EFb(2.0f) / 2.0f) + TSizfFm2Yiuu2.PxuCJdSBwIXG) << 32) | (Float.floatToRawIntBits(TSizfFm2Yiuu2.Y1f8riQaR6yg) & 4294967295L);
                boolean e9gEMXR7LXtO2 = tf0Var.e9gEMXR7LXtO(floatToRawIntBits);
                Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                if (!e9gEMXR7LXtO2) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu2 = new tt(floatToRawIntBits);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                ef1 ef1Var = (ef1) nLZGh9p8gVSu2;
                k61 k61Var = n61.Companion;
                boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(of2Var) | tf0Var.rtx2ld2ELZv4(eh2Var);
                Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                if (!rtx2ld2ELZv42) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu3 = new wt(of2Var, eh2Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
                n61 PxuCJdSBwIXG = lc2.PxuCJdSBwIXG(k61Var, of2Var, (PointerInputEventHandler) nLZGh9p8gVSu3);
                boolean e9gEMXR7LXtO3 = tf0Var.e9gEMXR7LXtO(floatToRawIntBits);
                Object nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
                if (!e9gEMXR7LXtO3) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu4 = new u2(i2, floatToRawIntBits);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu4);
                w2.PxuCJdSBwIXG(ef1Var, a32.PxuCJdSBwIXG(PxuCJdSBwIXG, (le0) nLZGh9p8gVSu4), 0L, tf0Var, 0);
                tf0Var.gPXPFXrUH4XX(false);
            }
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new l4(i, 3, eh2Var);
        }
    }

    public static final void dgRBjINgWbAK(ae0 ae0Var, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-2100567517);
        int i3 = (tf0Var.rtx2ld2ELZv4(ae0Var) ? 4 : 2) | i;
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 3) != 2)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            k61 k61Var = n61.Companion;
            n61 BRwzKIf41E4i = hq0.BRwzKIf41E4i(c62.TSizfFm2Yiuu(c62.lS5Rgt96tfkO(k61Var, 1.0f), 56.0f), n9.PxuCJdSBwIXG);
            t92 t92Var = rl.PxuCJdSBwIXG;
            long j = ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).PxuCJdSBwIXG;
            gk0 gk0Var = b51.x50lh2ztY7Y5;
            n61 kpCQ9veP6n3I = zv.kpCQ9veP6n3I(1, tf0Var, ae0Var, hq0.r3s1LDPKFs1S(BRwzKIf41E4i, j, gk0Var), false);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = xfACYKDMU6Dj(tf0Var, kpCQ9veP6n3I);
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
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            jx1 jx1Var = jx1.dgRBjINgWbAK;
            xe.PxuCJdSBwIXG(hq0.r3s1LDPKFs1S(c62.TSizfFm2Yiuu(c62.lS5Rgt96tfkO(jx1Var.cpQdD2nAriOS(k61Var, r.OPXfSBeufaJ8), 1.0f), 5.0f), ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).a92UlCVFR9N8, gk0Var), tf0Var, 0);
            String BjEWd04qc7Mw = jh0.BjEWd04qc7Mw(R.string.restart, tf0Var);
            n61 cpQdD2nAriOS2 = jx1Var.cpQdD2nAriOS(k61Var, r.a92UlCVFR9N8);
            dj2 dj2Var = ((en2) tf0Var.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).rtx2ld2ELZv4;
            xc0.Companion.getClass();
            i2 = 1;
            gi2.lS5Rgt96tfkO(BjEWd04qc7Mw, cpQdD2nAriOS2, ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).r3s1LDPKFs1S, 0L, 0L, null, 0L, 0, false, 0, 0, dj2.PxuCJdSBwIXG(dj2Var, 0L, 0L, xc0.r3s1LDPKFs1S, null, 0L, 0L, null, null, 16777211), tf0Var, 0, 0, 131064);
            tf0Var = tf0Var;
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            i2 = 1;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new ec(ae0Var, i, i2);
        }
    }

    public static final void e6tOsSdd2EFb(yz0 yz0Var) {
        ei2 ei2Var = yz0Var.e9gEMXR7LXtO;
        if (ei2Var != null) {
            tf2 tf2Var = uf2.Companion;
            op0 op0Var = yz0Var.Y1f8riQaR6yg;
            mt mtVar = yz0Var.VhhvGxCb8gfr;
            tf2Var.getClass();
            mtVar.OPXfSBeufaJ8(oh2.PxuCJdSBwIXG((oh2) op0Var.OPXfSBeufaJ8, null, 0L, 3));
            ai2 ai2Var = ei2Var.PxuCJdSBwIXG;
            AtomicReference atomicReference = ai2Var.lS5Rgt96tfkO;
            while (true) {
                if (atomicReference.compareAndSet(ei2Var, null)) {
                    ai2Var.PxuCJdSBwIXG.RAsUl2FVSrh6();
                    break;
                } else if (atomicReference.get() != ei2Var) {
                    break;
                }
            }
        }
        yz0Var.e9gEMXR7LXtO = null;
    }

    public static final void e9gEMXR7LXtO(final List list, final List list2, String str, final boolean z, final String str2, final le0 le0Var, hp hpVar, int i) {
        long j;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1731844651);
        int i2 = i | (tf0Var.rtx2ld2ELZv4(list) ? 4 : 2) | (tf0Var.rtx2ld2ELZv4(list2) ? 32 : 16) | (tf0Var.a92UlCVFR9N8(str) ? 256 : 128) | (tf0Var.RAsUl2FVSrh6(z) ? 2048 : 1024) | (tf0Var.a92UlCVFR9N8(str2) ? 16384 : 8192) | (tf0Var.rtx2ld2ELZv4(le0Var) ? 131072 : 65536);
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (74899 & i2) != 74898)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            if (cs0.wdg6QnbFHrFF(str, "X")) {
                tf0Var.IXK6ba3ucyzm(-2057897242);
                j = ((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG;
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-2057842620);
                j = ((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).a92UlCVFR9N8;
                tf0Var.gPXPFXrUH4XX(false);
            }
            k61 k61Var = n61.Companion;
            n61 jyegZNwi31qc = f2.jyegZNwi31qc(hq0.r3s1LDPKFs1S(hq0.BRwzKIf41E4i(c62.lS5Rgt96tfkO(k61Var, 1.0f), n9.PxuCJdSBwIXG), mm2.Y1f8riQaR6yg(4294948941L), b51.x50lh2ztY7Y5), 16.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = xfACYKDMU6Dj(tf0Var, jyegZNwi31qc);
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
            th0.tmVwIGCQF4zR(tf0Var, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            final long j2 = j;
            cs0.PxuCJdSBwIXG(c62.lS5Rgt96tfkO(k61Var, 1.0f), null, bs0.kpCQ9veP6n3I(1636295375, new qe0() { // from class: ef0
                /* JADX WARN: Code restructure failed: missing block: B:83:0x03e2, code lost:
                
                    if (r2 == r12) goto L84;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:47:0x02af  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x030d  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0322  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x02b3  */
                /* JADX WARN: Type inference failed for: r10v20 */
                /* JADX WARN: Type inference failed for: r10v21, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r10v26 */
                @Override // defpackage.qe0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
                    float f;
                    pd pdVar;
                    final List list3;
                    Iterator it;
                    int i3;
                    long lS5Rgt96tfkO2;
                    ?? r10;
                    String str3;
                    long j3;
                    cf cfVar = (cf) obj;
                    hp hpVar2 = (hp) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cfVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((tf0) hpVar2).a92UlCVFR9N8(cfVar) ? 4 : 2;
                    }
                    boolean z2 = true;
                    int i4 = 0;
                    tf0 tf0Var2 = (tf0) hpVar2;
                    if (tf0Var2.Pf0ThKz3j5YS(intValue & 1, (intValue & 19) != 18)) {
                        gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                        hy hyVar = cfVar.PxuCJdSBwIXG;
                        long j4 = cfVar.lS5Rgt96tfkO;
                        if (rr.Y1f8riQaR6yg(j4)) {
                            f = hyVar.e4HgwifUDUCA(rr.rtx2ld2ELZv4(j4));
                        } else {
                            k10.Companion.getClass();
                            f = Float.POSITIVE_INFINITY;
                        }
                        final float f2 = (f - 20.0f) / 3.0f;
                        float f3 = 10.0f;
                        y9 y9Var = new y9(10.0f, new u9(0));
                        k61 k61Var2 = n61.Companion;
                        s.Companion.getClass();
                        int i5 = 6;
                        dm PxuCJdSBwIXG = bm.PxuCJdSBwIXG(y9Var, r.cpQdD2nAriOS, tf0Var2, 6);
                        int hashCode2 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
                        il1 x50lh2ztY7Y53 = tf0Var2.x50lh2ztY7Y5();
                        n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var2, k61Var2);
                        yo.Companion.getClass();
                        ae0 ae0Var = xo.lS5Rgt96tfkO;
                        tf0Var2.ngxnMNrpiKat();
                        if (tf0Var2.zf8DYfih6EZu) {
                            tf0Var2.dgRBjINgWbAK(ae0Var);
                        } else {
                            tf0Var2.hVNtCUZb4tYH();
                        }
                        th0.tmVwIGCQF4zR(tf0Var2, xo.a92UlCVFR9N8, PxuCJdSBwIXG);
                        th0.tmVwIGCQF4zR(tf0Var2, xo.e9gEMXR7LXtO, x50lh2ztY7Y53);
                        th0.tmVwIGCQF4zR(tf0Var2, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode2));
                        th0.kpCQ9veP6n3I(tf0Var2, xo.rtx2ld2ELZv4);
                        th0.tmVwIGCQF4zR(tf0Var2, xo.Y1f8riQaR6yg, xfACYKDMU6Dj2);
                        tf0Var2.IXK6ba3ucyzm(-417647198);
                        Iterator it2 = new br0(0, 2, 1).iterator();
                        while (true) {
                            boolean z3 = ((zq0) it2).wdg6QnbFHrFF;
                            pdVar = r.a92UlCVFR9N8;
                            list3 = list2;
                            Object obj4 = fp.lS5Rgt96tfkO;
                            if (!z3) {
                                break;
                            }
                            int nextInt = ((rq0) it2).nextInt();
                            n61 lS5Rgt96tfkO3 = c62.lS5Rgt96tfkO(n61.Companion, 1.0f);
                            y9 y9Var2 = new y9(f3, new u9(i4));
                            s.Companion.getClass();
                            by1 PxuCJdSBwIXG2 = ay1.PxuCJdSBwIXG(y9Var2, r.dgRBjINgWbAK, tf0Var2, i5);
                            gg1 gg1Var3 = mp.PxuCJdSBwIXG;
                            List list4 = list3;
                            int hashCode3 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
                            il1 x50lh2ztY7Y54 = tf0Var2.x50lh2ztY7Y5();
                            n61 xfACYKDMU6Dj3 = ov2.xfACYKDMU6Dj(tf0Var2, lS5Rgt96tfkO3);
                            yo.Companion.getClass();
                            ae0 ae0Var2 = xo.lS5Rgt96tfkO;
                            tf0Var2.ngxnMNrpiKat();
                            if (tf0Var2.zf8DYfih6EZu) {
                                tf0Var2.dgRBjINgWbAK(ae0Var2);
                            } else {
                                tf0Var2.hVNtCUZb4tYH();
                            }
                            th0.tmVwIGCQF4zR(tf0Var2, xo.a92UlCVFR9N8, PxuCJdSBwIXG2);
                            th0.tmVwIGCQF4zR(tf0Var2, xo.e9gEMXR7LXtO, x50lh2ztY7Y54);
                            th0.tmVwIGCQF4zR(tf0Var2, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode3));
                            th0.kpCQ9veP6n3I(tf0Var2, xo.rtx2ld2ELZv4);
                            th0.tmVwIGCQF4zR(tf0Var2, xo.Y1f8riQaR6yg, xfACYKDMU6Dj3);
                            tf0Var2.IXK6ba3ucyzm(1134526103);
                            Iterator it3 = new br0(i4, 2, z2 ? 1 : 0).iterator();
                            while (((zq0) it3).wdg6QnbFHrFF) {
                                int nextInt2 = (nextInt * 3) + ((rq0) it3).nextInt();
                                boolean contains = list4.contains(Integer.valueOf(nextInt2));
                                k61 k61Var3 = n61.Companion;
                                lx0 lx0Var = new lx0(1.0f, z2);
                                k61Var3.getClass();
                                n61 BRwzKIf41E4i = hq0.BRwzKIf41E4i(zv.cpQdD2nAriOS(lx0Var), n9.PxuCJdSBwIXG);
                                List list5 = list;
                                if (contains && cs0.wdg6QnbFHrFF(list5.get(nextInt2), "X")) {
                                    tf0Var2.IXK6ba3ucyzm(13087726);
                                    gg1 gg1Var4 = mp.PxuCJdSBwIXG;
                                    it = it2;
                                    i3 = nextInt;
                                    lS5Rgt96tfkO2 = ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).a92UlCVFR9N8;
                                    tf0Var2.gPXPFXrUH4XX(false);
                                } else {
                                    it = it2;
                                    i3 = nextInt;
                                    if (contains && cs0.wdg6QnbFHrFF(list5.get(nextInt2), "O")) {
                                        tf0Var2.IXK6ba3ucyzm(13091564);
                                        gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                                        lS5Rgt96tfkO2 = ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG;
                                        tf0Var2.gPXPFXrUH4XX(false);
                                    } else if (cs0.wdg6QnbFHrFF(list5.get(nextInt2), "X")) {
                                        tf0Var2.IXK6ba3ucyzm(13095128);
                                        gg1 gg1Var6 = mp.PxuCJdSBwIXG;
                                        lS5Rgt96tfkO2 = hl.lS5Rgt96tfkO(((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).a92UlCVFR9N8, 0.72f);
                                        tf0Var2.gPXPFXrUH4XX(false);
                                    } else if (cs0.wdg6QnbFHrFF(list5.get(nextInt2), "O")) {
                                        tf0Var2.IXK6ba3ucyzm(13099000);
                                        gg1 gg1Var7 = mp.PxuCJdSBwIXG;
                                        lS5Rgt96tfkO2 = hl.lS5Rgt96tfkO(((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG, 0.82f);
                                        tf0Var2.gPXPFXrUH4XX(false);
                                    } else {
                                        tf0Var2.IXK6ba3ucyzm(13102488);
                                        gg1 gg1Var8 = mp.PxuCJdSBwIXG;
                                        lS5Rgt96tfkO2 = hl.lS5Rgt96tfkO(((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S, 0.55f);
                                        tf0Var2.gPXPFXrUH4XX(false);
                                    }
                                }
                                n61 r3s1LDPKFs1S = hq0.r3s1LDPKFs1S(BRwzKIf41E4i, lS5Rgt96tfkO2, b51.x50lh2ztY7Y5);
                                boolean z4 = !z && cs0.wdg6QnbFHrFF(str2, "X") && ((CharSequence) list5.get(nextInt2)).length() == 0;
                                Object obj5 = le0Var;
                                boolean a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(obj5) | tf0Var2.Y1f8riQaR6yg(nextInt2);
                                Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                                if (!a92UlCVFR9N82) {
                                    hp.Companion.getClass();
                                    if (nLZGh9p8gVSu != obj4) {
                                        r10 = 0;
                                        n61 kpCQ9veP6n3I = zv.kpCQ9veP6n3I(r10, tf0Var2, (ae0) nLZGh9p8gVSu, r3s1LDPKFs1S, z4);
                                        s.Companion.getClass();
                                        j51 Y1f8riQaR6yg3 = xe.Y1f8riQaR6yg(pdVar, r10);
                                        int hashCode4 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
                                        il1 x50lh2ztY7Y55 = tf0Var2.x50lh2ztY7Y5();
                                        n61 xfACYKDMU6Dj4 = ov2.xfACYKDMU6Dj(tf0Var2, kpCQ9veP6n3I);
                                        yo.Companion.getClass();
                                        ae0 ae0Var3 = xo.lS5Rgt96tfkO;
                                        tf0Var2.ngxnMNrpiKat();
                                        Iterator it4 = it3;
                                        if (tf0Var2.zf8DYfih6EZu) {
                                            tf0Var2.hVNtCUZb4tYH();
                                        } else {
                                            tf0Var2.dgRBjINgWbAK(ae0Var3);
                                        }
                                        th0.tmVwIGCQF4zR(tf0Var2, xo.a92UlCVFR9N8, Y1f8riQaR6yg3);
                                        th0.tmVwIGCQF4zR(tf0Var2, xo.e9gEMXR7LXtO, x50lh2ztY7Y55);
                                        th0.tmVwIGCQF4zR(tf0Var2, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode4));
                                        th0.kpCQ9veP6n3I(tf0Var2, xo.rtx2ld2ELZv4);
                                        th0.tmVwIGCQF4zR(tf0Var2, xo.Y1f8riQaR6yg, xfACYKDMU6Dj4);
                                        String str4 = (String) list5.get(nextInt2);
                                        dj2 dj2Var = ((en2) tf0Var2.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).RAsUl2FVSrh6;
                                        xc0.Companion.getClass();
                                        dj2 PxuCJdSBwIXG3 = dj2.PxuCJdSBwIXG(dj2Var, 0L, 0L, xc0.r3s1LDPKFs1S, null, 0L, 0L, null, null, 16777211);
                                        str3 = (String) list5.get(nextInt2);
                                        if (!cs0.wdg6QnbFHrFF(str3, "X")) {
                                            tf0Var2.IXK6ba3ucyzm(-1652211322);
                                            j3 = ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).PxuCJdSBwIXG;
                                            tf0Var2.gPXPFXrUH4XX(false);
                                        } else if (cs0.wdg6QnbFHrFF(str3, "O")) {
                                            tf0Var2.IXK6ba3ucyzm(-1652208727);
                                            j3 = ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S;
                                            tf0Var2.gPXPFXrUH4XX(false);
                                        } else {
                                            tf0Var2.IXK6ba3ucyzm(-1652206646);
                                            tf0Var2.gPXPFXrUH4XX(false);
                                            hl.Companion.getClass();
                                            j3 = hl.a92UlCVFR9N8;
                                        }
                                        tf0 tf0Var3 = tf0Var2;
                                        gi2.lS5Rgt96tfkO(str4, null, j3, 0L, 0L, null, 0L, 0, false, 0, 0, PxuCJdSBwIXG3, tf0Var3, 0, 0, 131066);
                                        tf0Var3.gPXPFXrUH4XX(true);
                                        obj4 = obj4;
                                        list4 = list4;
                                        z2 = true;
                                        it2 = it;
                                        nextInt = i3;
                                        it3 = it4;
                                        pdVar = pdVar;
                                        tf0Var2 = tf0Var3;
                                        i4 = 0;
                                    }
                                }
                                r10 = 0;
                                nLZGh9p8gVSu = new hf0(nextInt2, 0, obj5);
                                tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
                                n61 kpCQ9veP6n3I2 = zv.kpCQ9veP6n3I(r10, tf0Var2, (ae0) nLZGh9p8gVSu, r3s1LDPKFs1S, z4);
                                s.Companion.getClass();
                                j51 Y1f8riQaR6yg32 = xe.Y1f8riQaR6yg(pdVar, r10);
                                int hashCode42 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
                                il1 x50lh2ztY7Y552 = tf0Var2.x50lh2ztY7Y5();
                                n61 xfACYKDMU6Dj42 = ov2.xfACYKDMU6Dj(tf0Var2, kpCQ9veP6n3I2);
                                yo.Companion.getClass();
                                ae0 ae0Var32 = xo.lS5Rgt96tfkO;
                                tf0Var2.ngxnMNrpiKat();
                                Iterator it42 = it3;
                                if (tf0Var2.zf8DYfih6EZu) {
                                }
                                th0.tmVwIGCQF4zR(tf0Var2, xo.a92UlCVFR9N8, Y1f8riQaR6yg32);
                                th0.tmVwIGCQF4zR(tf0Var2, xo.e9gEMXR7LXtO, x50lh2ztY7Y552);
                                th0.tmVwIGCQF4zR(tf0Var2, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode42));
                                th0.kpCQ9veP6n3I(tf0Var2, xo.rtx2ld2ELZv4);
                                th0.tmVwIGCQF4zR(tf0Var2, xo.Y1f8riQaR6yg, xfACYKDMU6Dj42);
                                String str42 = (String) list5.get(nextInt2);
                                dj2 dj2Var2 = ((en2) tf0Var2.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).RAsUl2FVSrh6;
                                xc0.Companion.getClass();
                                dj2 PxuCJdSBwIXG32 = dj2.PxuCJdSBwIXG(dj2Var2, 0L, 0L, xc0.r3s1LDPKFs1S, null, 0L, 0L, null, null, 16777211);
                                str3 = (String) list5.get(nextInt2);
                                if (!cs0.wdg6QnbFHrFF(str3, "X")) {
                                }
                                tf0 tf0Var32 = tf0Var2;
                                gi2.lS5Rgt96tfkO(str42, null, j3, 0L, 0L, null, 0L, 0, false, 0, 0, PxuCJdSBwIXG32, tf0Var32, 0, 0, 131066);
                                tf0Var32.gPXPFXrUH4XX(true);
                                obj4 = obj4;
                                list4 = list4;
                                z2 = true;
                                it2 = it;
                                nextInt = i3;
                                it3 = it42;
                                pdVar = pdVar;
                                tf0Var2 = tf0Var32;
                                i4 = 0;
                            }
                            boolean z5 = z2;
                            boolean z6 = i4;
                            tf0 tf0Var4 = tf0Var2;
                            tf0Var4.gPXPFXrUH4XX(z6);
                            tf0Var4.gPXPFXrUH4XX(z5);
                            i4 = z6 ? 1 : 0;
                            f3 = 10.0f;
                            i5 = 6;
                            z2 = z5;
                        }
                        boolean z7 = i4;
                        tf0 tf0Var5 = tf0Var2;
                        boolean z8 = z2 ? 1 : 0;
                        tf0Var5.gPXPFXrUH4XX(z7);
                        tf0Var5.gPXPFXrUH4XX(z8);
                        if (list3.size() == 3) {
                            tf0Var5.IXK6ba3ucyzm(521913165);
                            k61 k61Var4 = n61.Companion;
                            jx1 jx1Var = jx1.dgRBjINgWbAK;
                            s.Companion.getClass();
                            ve veVar = new ve(pdVar, z8);
                            k61Var4.getClass();
                            boolean TSizfFm2Yiuu2 = tf0Var5.TSizfFm2Yiuu(f2) | tf0Var5.rtx2ld2ELZv4(list3);
                            final long j5 = j2;
                            boolean e9gEMXR7LXtO2 = tf0Var5.e9gEMXR7LXtO(j5) | TSizfFm2Yiuu2;
                            Object nLZGh9p8gVSu2 = tf0Var5.nLZGh9p8gVSu();
                            if (!e9gEMXR7LXtO2) {
                                hp.Companion.getClass();
                            }
                            nLZGh9p8gVSu2 = new le0() { // from class: if0
                                @Override // defpackage.le0
                                public final Object OPXfSBeufaJ8(Object obj6) {
                                    k30 k30Var = (k30) obj6;
                                    k30Var.getClass();
                                    float e6tOsSdd2EFb = k30Var.e6tOsSdd2EFb(10.0f);
                                    float e6tOsSdd2EFb2 = k30Var.e6tOsSdd2EFb(f2);
                                    List list6 = list3;
                                    long a92UlCVFR9N83 = ov2.a92UlCVFR9N8(e6tOsSdd2EFb2, e6tOsSdd2EFb, ((Number) zk.MDTGUQSX7PXD(list6)).intValue());
                                    long a92UlCVFR9N84 = ov2.a92UlCVFR9N8(e6tOsSdd2EFb2, e6tOsSdd2EFb, ((Number) zk.kRWHK87H9qm4(list6)).intValue());
                                    long Y1f8riQaR6yg4 = bf1.Y1f8riQaR6yg(a92UlCVFR9N84, a92UlCVFR9N83);
                                    float TSizfFm2Yiuu3 = bf1.TSizfFm2Yiuu(Y1f8riQaR6yg4);
                                    if (TSizfFm2Yiuu3 < 1.0f) {
                                        TSizfFm2Yiuu3 = 1.0f;
                                    }
                                    float intBitsToFloat = Float.intBitsToFloat((int) (Y1f8riQaR6yg4 >> 32)) / TSizfFm2Yiuu3;
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (Y1f8riQaR6yg4 & 4294967295L)) / TSizfFm2Yiuu3;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                                    float e6tOsSdd2EFb3 = k30Var.e6tOsSdd2EFb(10.0f) + (e6tOsSdd2EFb2 / 2.0f);
                                    hl.Companion.getClass();
                                    long lS5Rgt96tfkO4 = hl.lS5Rgt96tfkO(hl.TSizfFm2Yiuu, 0.95f);
                                    long Y1f8riQaR6yg5 = bf1.Y1f8riQaR6yg(a92UlCVFR9N83, bf1.a92UlCVFR9N8(floatToRawIntBits, e6tOsSdd2EFb3));
                                    long e9gEMXR7LXtO3 = bf1.e9gEMXR7LXtO(a92UlCVFR9N84, bf1.a92UlCVFR9N8(floatToRawIntBits, e6tOsSdd2EFb3));
                                    float e6tOsSdd2EFb4 = k30Var.e6tOsSdd2EFb(10.0f);
                                    ta2.Companion.getClass();
                                    k30.VzNxmvWisHL1(k30Var, lS5Rgt96tfkO4, Y1f8riQaR6yg5, e9gEMXR7LXtO3, e6tOsSdd2EFb4);
                                    k30.VzNxmvWisHL1(k30Var, hl.lS5Rgt96tfkO(j5, 0.95f), bf1.Y1f8riQaR6yg(a92UlCVFR9N83, bf1.a92UlCVFR9N8(floatToRawIntBits, e6tOsSdd2EFb3)), bf1.e9gEMXR7LXtO(a92UlCVFR9N84, bf1.a92UlCVFR9N8(floatToRawIntBits, e6tOsSdd2EFb3)), k30Var.e6tOsSdd2EFb(6.0f));
                                    return no2.PxuCJdSBwIXG;
                                }
                            };
                            tf0Var5.JTxCbbCwomzt(nLZGh9p8gVSu2);
                            hq0.PxuCJdSBwIXG(veVar, (le0) nLZGh9p8gVSu2, tf0Var5, 0);
                            tf0Var5.gPXPFXrUH4XX(false);
                        } else {
                            tf0Var5.IXK6ba3ucyzm(-999117645);
                            tf0Var5.gPXPFXrUH4XX(false);
                        }
                        gg1 gg1Var9 = mp.PxuCJdSBwIXG;
                    } else {
                        tf0Var2.i68hK7ahKtgp();
                    }
                    return no2.PxuCJdSBwIXG;
                }
            }, tf0Var), tf0Var, 3078);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new ff0(list, list2, str, z, str2, le0Var, i);
        }
    }

    public static final n61 gGoUzNp9JO5I(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new cg1(le0Var));
    }

    public static final nf0 gPXPFXrUH4XX(nf0 nf0Var) {
        if (nf0Var == null) {
            nf0Var = null;
        }
        if (nf0Var != null) {
            return nf0Var;
        }
        mp.lS5Rgt96tfkO("Inconsistent composition");
        u9.Y1f8riQaR6yg();
        return null;
    }

    public static final void i68hK7ahKtgp(String str, eu0 eu0Var) {
        String str2;
        eu0Var.getClass();
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        ck ckVar = (ck) eu0Var;
        sb.append(ckVar.TSizfFm2Yiuu());
        sb.append('\'');
        String sb2 = sb.toString();
        if (str == null) {
            str2 = o0.dgRBjINgWbAK("Class discriminator was missing and no default serializers were registered ", sb2, '.');
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + sb2 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + ckVar.TSizfFm2Yiuu() + "' has to be sealed and '@Serializable'.";
        }
        throw new i42(str2);
    }

    public static final boolean jyegZNwi31qc(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final Paint kpCQ9veP6n3I(j4 j4Var) {
        if (j4Var == null) {
            dp0.PxuCJdSBwIXG("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + bu1.PxuCJdSBwIXG(j4Var.getClass()).lS5Rgt96tfkO());
        }
        return (Paint) j4Var.TSizfFm2Yiuu;
    }

    public static final void lS5Rgt96tfkO(final ae0 ae0Var, n61 n61Var, boolean z, final z42 z42Var, final mg mgVar, rg rgVar, mi1 mi1Var, hp hpVar, final int i) {
        n61 n61Var2;
        boolean z2;
        final rg rgVar2;
        final mi1 mi1Var2;
        rg rgVar3;
        mi1 mi1Var3;
        fp fpVar;
        e81 e81Var;
        long j;
        rg rgVar4;
        j8 j8Var;
        e81 e81Var2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1310015664);
        int i2 = i | (tf0Var.rtx2ld2ELZv4(ae0Var) ? 4 : 2) | 384 | (tf0Var.a92UlCVFR9N8(z42Var) ? 2048 : 1024) | (tf0Var.a92UlCVFR9N8(mgVar) ? 16384 : 8192) | 114884608;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (306783379 & i2) != 306783378)) {
            tf0Var.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var.pnx5pC0XzaCw()) {
                oi1 oi1Var = ng.PxuCJdSBwIXG;
                float f = hq0.wdg6QnbFHrFF;
                gg1 gg1Var = mp.PxuCJdSBwIXG;
                rgVar3 = new rg(f);
                mi1Var3 = ng.PxuCJdSBwIXG;
                z2 = true;
            } else {
                tf0Var.i68hK7ahKtgp();
                z2 = z;
                rgVar3 = rgVar;
                mi1Var3 = mi1Var;
            }
            tf0Var.BRwzKIf41E4i();
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
            tf0Var.IXK6ba3ucyzm(1691738187);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            fp fpVar2 = hp.Companion;
            fpVar2.getClass();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu == jx1Var) {
                nLZGh9p8gVSu = new e81();
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            e81 e81Var3 = (e81) nLZGh9p8gVSu;
            tf0Var.gPXPFXrUH4XX(false);
            long j2 = z2 ? mgVar.PxuCJdSBwIXG : mgVar.TSizfFm2Yiuu;
            long j3 = z2 ? mgVar.lS5Rgt96tfkO : mgVar.Y1f8riQaR6yg;
            if (rgVar3 == null) {
                tf0Var.IXK6ba3ucyzm(1691921830);
                tf0Var.gPXPFXrUH4XX(false);
                rgVar4 = rgVar3;
                e81Var = e81Var3;
                fpVar = fpVar2;
                j = j2;
                j8Var = null;
            } else {
                tf0Var.IXK6ba3ucyzm(-499611205);
                Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                fpVar2.getClass();
                if (nLZGh9p8gVSu2 == jx1Var) {
                    nLZGh9p8gVSu2 = new d82();
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                }
                d82 d82Var = (d82) nLZGh9p8gVSu2;
                boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(e81Var3);
                Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                if (a92UlCVFR9N82 || nLZGh9p8gVSu3 == jx1Var) {
                    fpVar = fpVar2;
                    nLZGh9p8gVSu3 = new pg(e81Var3, d82Var, null, 0);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
                } else {
                    fpVar = fpVar2;
                }
                mm2.wdg6QnbFHrFF(tf0Var, (pe0) nLZGh9p8gVSu3, e81Var3);
                kr0 kr0Var = (kr0) zk.BUo4iHFctTZi(d82Var);
                float f2 = (z2 && !(kr0Var instanceof wp1) && (kr0Var instanceof jk0)) ? rgVar3.PxuCJdSBwIXG : 0.0f;
                Object nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
                if (nLZGh9p8gVSu4 == jx1Var) {
                    e81Var = e81Var3;
                    j = j2;
                    nLZGh9p8gVSu4 = new g7(new k10(f2), b51.BRwzKIf41E4i, null, 12);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu4);
                } else {
                    e81Var = e81Var3;
                    j = j2;
                }
                g7 g7Var = (g7) nLZGh9p8gVSu4;
                k10 k10Var = new k10(f2);
                boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(g7Var) | tf0Var.TSizfFm2Yiuu(f2) | tf0Var.a92UlCVFR9N8(rgVar3) | tf0Var.rtx2ld2ELZv4(kr0Var);
                Object nLZGh9p8gVSu5 = tf0Var.nLZGh9p8gVSu();
                if (rtx2ld2ELZv42 || nLZGh9p8gVSu5 == jx1Var) {
                    rgVar4 = rgVar3;
                    qg qgVar = new qg(g7Var, f2, z2, rgVar4, kr0Var, null);
                    tf0Var.JTxCbbCwomzt(qgVar);
                    nLZGh9p8gVSu5 = qgVar;
                } else {
                    rgVar4 = rgVar3;
                }
                mm2.wdg6QnbFHrFF(tf0Var, (pe0) nLZGh9p8gVSu5, k10Var);
                j8Var = g7Var.TSizfFm2Yiuu;
                tf0Var.gPXPFXrUH4XX(false);
            }
            float f3 = j8Var != null ? ((k10) j8Var.OPXfSBeufaJ8.getValue()).rtx2ld2ELZv4 : 0.0f;
            Object nLZGh9p8gVSu6 = tf0Var.nLZGh9p8gVSu();
            fpVar.getClass();
            if (nLZGh9p8gVSu6 == jx1Var) {
                nLZGh9p8gVSu6 = new wnqUPcAvl7HT(7);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu6);
            }
            n61Var2 = n61Var;
            n61 PxuCJdSBwIXG = a32.PxuCJdSBwIXG(n61Var2, (le0) nLZGh9p8gVSu6);
            on kpCQ9veP6n3I = bs0.kpCQ9veP6n3I(-535639973, new ug(j3, mi1Var3), tf0Var);
            fq fqVar = ec2.PxuCJdSBwIXG;
            if (e81Var == null) {
                tf0Var.IXK6ba3ucyzm(-1701037204);
                Object nLZGh9p8gVSu7 = tf0Var.nLZGh9p8gVSu();
                if (nLZGh9p8gVSu7 == jx1Var) {
                    nLZGh9p8gVSu7 = new e81();
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu7);
                }
                e81Var2 = (e81) nLZGh9p8gVSu7;
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(2023337163);
                tf0Var.gPXPFXrUH4XX(false);
                e81Var2 = e81Var;
            }
            fq fqVar2 = ec2.PxuCJdSBwIXG;
            float f4 = ((k10) tf0Var.wdg6QnbFHrFF(fqVar2)).rtx2ld2ELZv4 + 0.0f;
            zv.TSizfFm2Yiuu(new ir1[]{zr.PxuCJdSBwIXG.PxuCJdSBwIXG(new hl(j3)), fqVar2.PxuCJdSBwIXG(new k10(f4))}, bs0.kpCQ9veP6n3I(849208527, new dc2(PxuCJdSBwIXG, z42Var, j, f4, e81Var2, z2, ae0Var, f3, kpCQ9veP6n3I), tf0Var), tf0Var, 56);
            mi1Var2 = mi1Var3;
            rgVar2 = rgVar4;
        } else {
            n61Var2 = n61Var;
            tf0Var.i68hK7ahKtgp();
            z2 = z;
            rgVar2 = rgVar;
            mi1Var2 = mi1Var;
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            final n61 n61Var3 = n61Var2;
            final boolean z3 = z2;
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0(n61Var3, z3, z42Var, mgVar, rgVar2, mi1Var2, i) { // from class: sg
                public final /* synthetic */ n61 OPXfSBeufaJ8;
                public final /* synthetic */ rg cpQdD2nAriOS;
                public final /* synthetic */ z42 dgRBjINgWbAK;
                public final /* synthetic */ mi1 r3s1LDPKFs1S;
                public final /* synthetic */ boolean wdg6QnbFHrFF;
                public final /* synthetic */ mg x50lh2ztY7Y5;

                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(805306417);
                    ov2.lS5Rgt96tfkO(ae0.this, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, (hp) obj, bEKsvqmvPh2y);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final float[] nLZGh9p8gVSu(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final float[] ozEBbv0hFTAB(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final kr pnx5pC0XzaCw(tl tlVar, tl tlVar2) {
        if (tlVar == tlVar2) {
            kr.Companion.getClass();
            ru1.Companion.getClass();
            return new hr(tlVar, tlVar, 1);
        }
        long j = tlVar.lS5Rgt96tfkO;
        ml.Companion.getClass();
        return (ml.PxuCJdSBwIXG(j, 12884901888L) && ml.PxuCJdSBwIXG(tlVar2.lS5Rgt96tfkO, 12884901888L)) ? new jr((lw1) tlVar, (lw1) tlVar2) : new kr(tlVar, tlVar2, 0);
    }

    public static final void r3s1LDPKFs1S(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final o92 rZjpSjn4zoMv(d82 d82Var) {
        o92 o92Var = d82Var.rtx2ld2ELZv4;
        o92Var.getClass();
        return (o92) s72.RfyTYNmI9Srp(o92Var, d82Var);
    }

    public static final void rtx2ld2ELZv4(boolean z, String str, String str2, hp hpVar, int i) {
        String str3;
        String BjEWd04qc7Mw;
        long j;
        boolean z2;
        String str4 = str2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(132839636);
        int i2 = i | (tf0Var.RAsUl2FVSrh6(z) ? 4 : 2) | (tf0Var.a92UlCVFR9N8(str) ? 32 : 16) | (tf0Var.a92UlCVFR9N8(str4) ? 256 : 128);
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            if (z) {
                tf0Var.IXK6ba3ucyzm(1760860023);
                if (cs0.wdg6QnbFHrFF(str, "X")) {
                    tf0Var.IXK6ba3ucyzm(-1190123084);
                    BjEWd04qc7Mw = jh0.BjEWd04qc7Mw(R.string.you_win, tf0Var);
                    tf0Var.gPXPFXrUH4XX(false);
                } else if (cs0.wdg6QnbFHrFF(str, "O")) {
                    tf0Var.IXK6ba3ucyzm(-1190121416);
                    BjEWd04qc7Mw = jh0.BjEWd04qc7Mw(R.string.system_wins, tf0Var);
                    tf0Var.gPXPFXrUH4XX(false);
                } else {
                    tf0Var.IXK6ba3ucyzm(-1190119599);
                    BjEWd04qc7Mw = jh0.BjEWd04qc7Mw(R.string.draw, tf0Var);
                    tf0Var.gPXPFXrUH4XX(false);
                }
                tf0Var.gPXPFXrUH4XX(false);
            } else if (cs0.wdg6QnbFHrFF(str4, "X")) {
                tf0Var.IXK6ba3ucyzm(1761075132);
                BjEWd04qc7Mw = jh0.BjEWd04qc7Mw(R.string.your_turn, tf0Var);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(1761130746);
                BjEWd04qc7Mw = jh0.BjEWd04qc7Mw(R.string.system_turn, tf0Var);
                tf0Var.gPXPFXrUH4XX(false);
            }
            if (z && cs0.wdg6QnbFHrFF(str, "X")) {
                tf0Var.IXK6ba3ucyzm(-1190110691);
                j = ((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).a92UlCVFR9N8;
                tf0Var.gPXPFXrUH4XX(false);
            } else if (z && cs0.wdg6QnbFHrFF(str, "O")) {
                tf0Var.IXK6ba3ucyzm(-1190109179);
                tf0Var.gPXPFXrUH4XX(false);
                j = mm2.Y1f8riQaR6yg(4284142792L);
            } else {
                tf0Var.IXK6ba3ucyzm(-1190107266);
                j = ((pl) tf0Var.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S;
                tf0Var.gPXPFXrUH4XX(false);
            }
            k61 k61Var = n61.Companion;
            n61 BRwzKIf41E4i = hq0.BRwzKIf41E4i(c62.lS5Rgt96tfkO(k61Var, 1.0f), n9.PxuCJdSBwIXG);
            t92 t92Var = rl.PxuCJdSBwIXG;
            n61 jyegZNwi31qc = f2.jyegZNwi31qc(hq0.r3s1LDPKFs1S(BRwzKIf41E4i, ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).PxuCJdSBwIXG, b51.x50lh2ztY7Y5), 18.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = xfACYKDMU6Dj(tf0Var, jyegZNwi31qc);
            yo.Companion.getClass();
            String str5 = BjEWd04qc7Mw;
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            p7 p7Var = xo.a92UlCVFR9N8;
            th0.tmVwIGCQF4zR(tf0Var, p7Var, Y1f8riQaR6yg2);
            p7 p7Var2 = xo.e9gEMXR7LXtO;
            th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y52);
            Integer valueOf = Integer.valueOf(hashCode);
            p7 p7Var3 = xo.RAsUl2FVSrh6;
            th0.tmVwIGCQF4zR(tf0Var, p7Var3, valueOf);
            k1 k1Var = xo.rtx2ld2ELZv4;
            th0.kpCQ9veP6n3I(tf0Var, k1Var);
            long j2 = j;
            p7 p7Var4 = xo.Y1f8riQaR6yg;
            th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj);
            dm PxuCJdSBwIXG = bm.PxuCJdSBwIXG(new y9(12.0f, new u9(0)), r.cpQdD2nAriOS, tf0Var, 6);
            int hashCode2 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = xfACYKDMU6Dj(tf0Var, k61Var);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, p7Var, PxuCJdSBwIXG);
            th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y53);
            o0.EcgxDIVH5in8(hashCode2, tf0Var, p7Var3, tf0Var, k1Var);
            th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj2);
            dj2 dj2Var = ((en2) tf0Var.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).rtx2ld2ELZv4;
            xc0.Companion.getClass();
            gi2.lS5Rgt96tfkO(str5, null, j2, 0L, 0L, null, 0L, 0, false, 0, 0, dj2.PxuCJdSBwIXG(dj2Var, 0L, 0L, xc0.r3s1LDPKFs1S, null, 0L, 0L, null, null, 16777211), tf0Var, 0, 0, 131066);
            tf0Var = tf0Var;
            n61 lS5Rgt96tfkO2 = c62.lS5Rgt96tfkO(k61Var, 1.0f);
            by1 PxuCJdSBwIXG2 = ay1.PxuCJdSBwIXG(new y9(10.0f, new u9(0)), r.dgRBjINgWbAK, tf0Var, 6);
            int hashCode3 = Long.hashCode(tf0Var.wLFCmsViZrNT);
            il1 x50lh2ztY7Y54 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj3 = xfACYKDMU6Dj(tf0Var, lS5Rgt96tfkO2);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, p7Var, PxuCJdSBwIXG2);
            th0.tmVwIGCQF4zR(tf0Var, p7Var2, x50lh2ztY7Y54);
            o0.EcgxDIVH5in8(hashCode3, tf0Var, p7Var3, tf0Var, k1Var);
            th0.tmVwIGCQF4zR(tf0Var, p7Var4, xfACYKDMU6Dj3);
            String BjEWd04qc7Mw2 = jh0.BjEWd04qc7Mw(R.string.player_you, tf0Var);
            str4 = str2;
            if (z || !cs0.wdg6QnbFHrFF(str4, "X")) {
                str3 = str;
                if (!z || !cs0.wdg6QnbFHrFF(str3, "X")) {
                    z2 = false;
                    wdg6QnbFHrFF("X", BjEWd04qc7Mw2, z2, ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).a92UlCVFR9N8, cy1.PxuCJdSBwIXG(k61Var), tf0Var, 6);
                    wdg6QnbFHrFF("O", jh0.BjEWd04qc7Mw(R.string.player_system, tf0Var), (z && cs0.wdg6QnbFHrFF(str4, "O")) || (z && cs0.wdg6QnbFHrFF(str3, "O")), mm2.Y1f8riQaR6yg(4284142792L), cy1.PxuCJdSBwIXG(k61Var), tf0Var, 3078);
                    tf0Var.gPXPFXrUH4XX(true);
                    tf0Var.gPXPFXrUH4XX(true);
                    tf0Var.gPXPFXrUH4XX(true);
                }
            } else {
                str3 = str;
            }
            z2 = true;
            wdg6QnbFHrFF("X", BjEWd04qc7Mw2, z2, ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).a92UlCVFR9N8, cy1.PxuCJdSBwIXG(k61Var), tf0Var, 6);
            wdg6QnbFHrFF("O", jh0.BjEWd04qc7Mw(R.string.player_system, tf0Var), (z && cs0.wdg6QnbFHrFF(str4, "O")) || (z && cs0.wdg6QnbFHrFF(str3, "O")), mm2.Y1f8riQaR6yg(4284142792L), cy1.PxuCJdSBwIXG(k61Var), tf0Var, 3078);
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            str3 = str;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new mf0(z, str3, str4, i, 0);
        }
    }

    public static final float[] ryVscX7ZL4Ux(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static final boolean tmVwIGCQF4zR(int i) {
        fa0 fa0Var = ga0.Companion;
        fa0Var.getClass();
        if (i != 1) {
            fa0Var.getClass();
            if (i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final void wdg6QnbFHrFF(final String str, final String str2, final boolean z, final long j, final n61 n61Var, hp hpVar, final int i) {
        long j2;
        tf0 tf0Var;
        long lS5Rgt96tfkO2;
        boolean z2;
        long j3;
        long lS5Rgt96tfkO3;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(1108625134);
        int i2 = (tf0Var2.a92UlCVFR9N8(str2) ? 32 : 16) | i | (tf0Var2.RAsUl2FVSrh6(z) ? 256 : 128);
        if ((i & 3072) == 0) {
            j2 = j;
            i2 |= tf0Var2.e9gEMXR7LXtO(j2) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        int i3 = i2 | (tf0Var2.a92UlCVFR9N8(n61Var) ? 16384 : 8192);
        int i4 = 0;
        if (tf0Var2.Pf0ThKz3j5YS(i3 & 1, (i3 & 9363) != 9362)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 BRwzKIf41E4i = hq0.BRwzKIf41E4i(n61Var, n9.PxuCJdSBwIXG);
            if (z) {
                tf0Var2.IXK6ba3ucyzm(236872148);
                tf0Var2.gPXPFXrUH4XX(false);
                lS5Rgt96tfkO2 = j2;
            } else {
                tf0Var2.IXK6ba3ucyzm(236873729);
                lS5Rgt96tfkO2 = hl.lS5Rgt96tfkO(((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S, 0.12f);
                tf0Var2.gPXPFXrUH4XX(false);
            }
            n61 aF05bpZJlKEP = f2.aF05bpZJlKEP(hq0.r3s1LDPKFs1S(BRwzKIf41E4i, lS5Rgt96tfkO2, b51.x50lh2ztY7Y5), 14.0f, 10.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = xfACYKDMU6Dj(tf0Var2, aF05bpZJlKEP);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            p7 p7Var = xo.a92UlCVFR9N8;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, Y1f8riQaR6yg2);
            p7 p7Var2 = xo.e9gEMXR7LXtO;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y52);
            Integer valueOf = Integer.valueOf(hashCode);
            p7 p7Var3 = xo.RAsUl2FVSrh6;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var3, valueOf);
            k1 k1Var = xo.rtx2ld2ELZv4;
            th0.kpCQ9veP6n3I(tf0Var2, k1Var);
            p7 p7Var4 = xo.Y1f8riQaR6yg;
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj);
            y9 y9Var = new y9(8.0f, new u9(i4));
            k61 k61Var = n61.Companion;
            by1 PxuCJdSBwIXG = ay1.PxuCJdSBwIXG(y9Var, r.x50lh2ztY7Y5, tf0Var2, 54);
            int hashCode2 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = xfACYKDMU6Dj(tf0Var2, k61Var);
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, PxuCJdSBwIXG);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y53);
            o0.EcgxDIVH5in8(hashCode2, tf0Var2, p7Var3, tf0Var2, k1Var);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj2);
            dj2 dj2Var = ki0.J54yh1s3n4Aq(tf0Var2).rtx2ld2ELZv4;
            xc0.Companion.getClass();
            dj2 PxuCJdSBwIXG2 = dj2.PxuCJdSBwIXG(dj2Var, 0L, 0L, xc0.r3s1LDPKFs1S, null, 0L, 0L, null, null, 16777211);
            if (z) {
                tf0Var2.IXK6ba3ucyzm(1680093055);
                j3 = ki0.aF05bpZJlKEP(tf0Var2).PxuCJdSBwIXG;
                z2 = false;
            } else {
                z2 = false;
                tf0Var2.IXK6ba3ucyzm(1680094306);
                j3 = ki0.aF05bpZJlKEP(tf0Var2).r3s1LDPKFs1S;
            }
            tf0Var2.gPXPFXrUH4XX(z2);
            gi2.lS5Rgt96tfkO(str, null, j3, 0L, 0L, null, 0L, 0, false, 0, 0, PxuCJdSBwIXG2, tf0Var2, 6, 0, 131066);
            tf0Var = tf0Var2;
            dj2 dj2Var2 = ki0.J54yh1s3n4Aq(tf0Var).OPXfSBeufaJ8;
            if (z) {
                tf0Var.IXK6ba3ucyzm(1680100607);
                lS5Rgt96tfkO3 = ki0.aF05bpZJlKEP(tf0Var).PxuCJdSBwIXG;
            } else {
                tf0Var.IXK6ba3ucyzm(1680102218);
                lS5Rgt96tfkO3 = hl.lS5Rgt96tfkO(ki0.aF05bpZJlKEP(tf0Var).r3s1LDPKFs1S, 0.8f);
            }
            tf0Var.gPXPFXrUH4XX(z2);
            gi2.lS5Rgt96tfkO(str2, null, lS5Rgt96tfkO3, 0L, 0L, null, 0L, 0, false, 0, 0, dj2Var2, tf0Var, (i3 >> 3) & 14, 0, 131066);
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: gf0
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ov2.wdg6QnbFHrFF(str, str2, z, j, n61Var, (hp) obj, ki0.bEKsvqmvPh2y(i | 1));
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final void x50lh2ztY7Y5(eh2 eh2Var, boolean z, hp hpVar, int i) {
        ki2 Y1f8riQaR6yg2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(626339208);
        int i2 = (tf0Var.rtx2ld2ELZv4(eh2Var) ? 4 : 2) | i | (tf0Var.RAsUl2FVSrh6(z) ? 32 : 16);
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            if (z) {
                tf0Var.IXK6ba3ucyzm(1530097388);
                yz0 yz0Var = eh2Var.Y1f8riQaR6yg;
                ji2 ji2Var = null;
                if (yz0Var != null && (Y1f8riQaR6yg2 = yz0Var.Y1f8riQaR6yg()) != null) {
                    ji2 ji2Var2 = Y1f8riQaR6yg2.PxuCJdSBwIXG;
                    yz0 yz0Var2 = eh2Var.Y1f8riQaR6yg;
                    if (!(yz0Var2 != null ? yz0Var2.gPXPFXrUH4XX : true)) {
                        ji2Var = ji2Var2;
                    }
                }
                if (ji2Var == null) {
                    tf0Var.IXK6ba3ucyzm(1530097387);
                    tf0Var.gPXPFXrUH4XX(false);
                } else {
                    tf0Var.IXK6ba3ucyzm(1530097388);
                    if (vi2.TSizfFm2Yiuu(eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO)) {
                        tf0Var.IXK6ba3ucyzm(2110860558);
                        tf0Var.gPXPFXrUH4XX(false);
                    } else {
                        tf0Var.IXK6ba3ucyzm(2109807302);
                        int lS5Rgt96tfkO2 = eh2Var.lS5Rgt96tfkO.lS5Rgt96tfkO((int) (eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO >> 32));
                        int lS5Rgt96tfkO3 = eh2Var.lS5Rgt96tfkO.lS5Rgt96tfkO((int) (eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO & 4294967295L));
                        iv1 PxuCJdSBwIXG = ji2Var.PxuCJdSBwIXG(lS5Rgt96tfkO2);
                        iv1 PxuCJdSBwIXG2 = ji2Var.PxuCJdSBwIXG(Math.max(lS5Rgt96tfkO3 - 1, 0));
                        yz0 yz0Var3 = eh2Var.Y1f8riQaR6yg;
                        if (yz0Var3 == null || !((Boolean) yz0Var3.cpQdD2nAriOS.getValue()).booleanValue()) {
                            tf0Var.IXK6ba3ucyzm(2110490542);
                            tf0Var.gPXPFXrUH4XX(false);
                        } else {
                            tf0Var.IXK6ba3ucyzm(2110225306);
                            xi0.TSizfFm2Yiuu(true, PxuCJdSBwIXG, eh2Var, tf0Var, ((i2 << 6) & 896) | 6);
                            tf0Var.gPXPFXrUH4XX(false);
                        }
                        yz0 yz0Var4 = eh2Var.Y1f8riQaR6yg;
                        if (yz0Var4 == null || !((Boolean) yz0Var4.r3s1LDPKFs1S.getValue()).booleanValue()) {
                            tf0Var.IXK6ba3ucyzm(2110838734);
                            tf0Var.gPXPFXrUH4XX(false);
                        } else {
                            tf0Var.IXK6ba3ucyzm(2110574459);
                            xi0.TSizfFm2Yiuu(false, PxuCJdSBwIXG2, eh2Var, tf0Var, ((i2 << 6) & 896) | 6);
                            tf0Var.gPXPFXrUH4XX(false);
                        }
                        tf0Var.gPXPFXrUH4XX(false);
                    }
                    yz0 yz0Var5 = eh2Var.Y1f8riQaR6yg;
                    if (yz0Var5 != null) {
                        mj1 mj1Var = yz0Var5.x50lh2ztY7Y5;
                        if (!cs0.wdg6QnbFHrFF(eh2Var.EcgxDIVH5in8.PxuCJdSBwIXG.OPXfSBeufaJ8, eh2Var.r3s1LDPKFs1S().PxuCJdSBwIXG.OPXfSBeufaJ8)) {
                            mj1Var.setValue(Boolean.FALSE);
                        }
                        if (yz0Var5.lS5Rgt96tfkO()) {
                            if (((Boolean) mj1Var.getValue()).booleanValue()) {
                                eh2Var.EcgxDIVH5in8();
                            } else {
                                eh2Var.QrzZRwfaDlRX();
                            }
                        }
                    }
                    tf0Var.gPXPFXrUH4XX(false);
                }
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(1989076778);
                tf0Var.gPXPFXrUH4XX(false);
                eh2Var.QrzZRwfaDlRX();
            }
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new lt(eh2Var, z, i);
        }
    }

    public static final n61 xfACYKDMU6Dj(hp hpVar, n61 n61Var) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.IXK6ba3ucyzm(439770924);
        n61 EpkonXwzFgDB = EpkonXwzFgDB(tf0Var, n61Var);
        tf0Var.gPXPFXrUH4XX(false);
        return EpkonXwzFgDB;
    }

    public static final n61 zf8DYfih6EZu(n61 n61Var) {
        return n61Var.TSizfFm2Yiuu(new yr0());
    }

    public y8 XL4ISE6Oc65B(Context context, Looper looper, mk mkVar, Object obj, dh0 dh0Var, eh0 eh0Var) {
        int i = this.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                mkVar.getClass();
                Integer num = mkVar.a92UlCVFR9N8;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new r52(context, looper, mkVar, bundle, dh0Var, eh0Var);
            case 1:
                throw o0.RAsUl2FVSrh6(obj);
            default:
                uv2 uv2Var = (uv2) dh0Var;
                uv2 uv2Var2 = (uv2) eh0Var;
                switch (i) {
                    case 2:
                        return new qw2(context, looper, mkVar, (fe2) obj, uv2Var, uv2Var2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
