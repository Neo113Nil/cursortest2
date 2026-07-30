package defpackage;

import android.R;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Trace;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.TextPaint;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class bs0 {
    public static en0 IAToe7bXGz4N;
    public static final f50 RAsUl2FVSrh6;
    public static final on a92UlCVFR9N8;
    public static boolean aF05bpZJlKEP;
    public static Method e6tOsSdd2EFb;
    public static final on e9gEMXR7LXtO;
    public static Method jyegZNwi31qc;
    public static final uk2 pnx5pC0XzaCw;
    public static final f50 rtx2ld2ELZv4;
    public static final int[] PxuCJdSBwIXG = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] lS5Rgt96tfkO = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] TSizfFm2Yiuu = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] Y1f8riQaR6yg = {R.attr.name, R.attr.pathData};
    public static final ql OPXfSBeufaJ8 = ql.r3s1LDPKFs1S;
    public static final ql wdg6QnbFHrFF = ql.QrzZRwfaDlRX;
    public static final float dgRBjINgWbAK = 0.38f;
    public static final float x50lh2ztY7Y5 = 6.0f;
    public static final float cpQdD2nAriOS = 1.0f;
    public static final ib0 r3s1LDPKFs1S = new ib0(5);
    public static final StackTraceElement[] QrzZRwfaDlRX = new StackTraceElement[0];
    public static final byte[] gPXPFXrUH4XX = {48, 49, 53, 0};
    public static final byte[] BRwzKIf41E4i = {48, 49, 48, 0};
    public static final byte[] XL4ISE6Oc65B = {48, 48, 57, 0};
    public static final byte[] RfyTYNmI9Srp = {48, 48, 53, 0};
    public static final byte[] EcgxDIVH5in8 = {48, 48, 49, 0};
    public static final byte[] S9EYkSpbGuxq = {48, 48, 49, 0};
    public static final byte[] VhhvGxCb8gfr = {48, 48, 50, 0};
    public static final qt1 S2OOm9zPNm0h = new qt1(0.0f, 0.0f, 10.0f, 10.0f);
    public static final r10 ZbWwgt3aGe7A = new r10();

    static {
        int i = 1;
        byte b = 0;
        e9gEMXR7LXtO = new on(-931934968, false, new jm(i, b));
        a92UlCVFR9N8 = new on(-1365807533, false, new jm(2, b));
        RAsUl2FVSrh6 = new f50("UNDEFINED", i);
        rtx2ld2ELZv4 = new f50("REUSABLE_CLAIMED", i);
        pnx5pC0XzaCw = new uk2(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r1.cpQdD2nAriOS(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object BRwzKIf41E4i(w80 w80Var, ui uiVar, boolean z, bt btVar) {
        b90 b90Var;
        int i;
        bg it;
        bg bgVar;
        w80 w80Var2;
        Object lS5Rgt96tfkO2;
        try {
            if (btVar instanceof b90) {
                b90Var = (b90) btVar;
                int i2 = b90Var.gPXPFXrUH4XX;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    b90Var.gPXPFXrUH4XX = i2 - Integer.MIN_VALUE;
                    Object obj = b90Var.QrzZRwfaDlRX;
                    i = b90Var.gPXPFXrUH4XX;
                    CancellationException cancellationException = null;
                    su suVar = su.rtx2ld2ELZv4;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        if (w80Var instanceof vj2) {
                            throw ((vj2) w80Var).rtx2ld2ELZv4;
                        }
                        it = uiVar.iterator();
                        b90Var.dgRBjINgWbAK = w80Var;
                        b90Var.x50lh2ztY7Y5 = uiVar;
                        b90Var.cpQdD2nAriOS = it;
                        b90Var.r3s1LDPKFs1S = z;
                        b90Var.gPXPFXrUH4XX = 1;
                        lS5Rgt96tfkO2 = it.lS5Rgt96tfkO(b90Var);
                        if (lS5Rgt96tfkO2 != suVar) {
                        }
                    } else if (i == 1) {
                        z = b90Var.r3s1LDPKFs1S;
                        bgVar = b90Var.cpQdD2nAriOS;
                        uiVar = b90Var.x50lh2ztY7Y5;
                        w80Var2 = b90Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = b90Var.r3s1LDPKFs1S;
                        bgVar = b90Var.cpQdD2nAriOS;
                        uiVar = b90Var.x50lh2ztY7Y5;
                        w80Var2 = b90Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        it = bgVar;
                        w80Var = w80Var2;
                        b90Var.dgRBjINgWbAK = w80Var;
                        b90Var.x50lh2ztY7Y5 = uiVar;
                        b90Var.cpQdD2nAriOS = it;
                        b90Var.r3s1LDPKFs1S = z;
                        b90Var.gPXPFXrUH4XX = 1;
                        lS5Rgt96tfkO2 = it.lS5Rgt96tfkO(b90Var);
                        if (lS5Rgt96tfkO2 != suVar) {
                            return suVar;
                        }
                        w80Var2 = w80Var;
                        bgVar = it;
                        obj = lS5Rgt96tfkO2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                uiVar.a92UlCVFR9N8(null);
                            }
                            return no2.PxuCJdSBwIXG;
                        }
                        Object TSizfFm2Yiuu2 = bgVar.TSizfFm2Yiuu();
                        b90Var.dgRBjINgWbAK = w80Var2;
                        b90Var.x50lh2ztY7Y5 = uiVar;
                        b90Var.cpQdD2nAriOS = bgVar;
                        b90Var.r3s1LDPKFs1S = z;
                        b90Var.gPXPFXrUH4XX = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        b90Var = new b90(btVar);
        Object obj2 = b90Var.QrzZRwfaDlRX;
        i = b90Var.gPXPFXrUH4XX;
        CancellationException cancellationException2 = null;
        su suVar2 = su.rtx2ld2ELZv4;
    }

    public static final int BjEWd04qc7Mw(e22 e22Var, int i) {
        int i2;
        int[] iArr = e22Var.cpQdD2nAriOS;
        int i3 = i + 1;
        int length = e22Var.x50lh2ztY7Y5.length;
        iArr.getClass();
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static final void EcgxDIVH5in8(i2 i2Var, i2 i2Var2, le0 le0Var, c81 c81Var, d32 d32Var, d32 d32Var2) {
        i2 i2Var3 = i2Var;
        Region region = (Region) i2Var3.OPXfSBeufaJ8;
        i2 i2Var4 = i2Var2;
        Region region2 = (Region) i2Var4.OPXfSBeufaJ8;
        vw0 vw0Var = d32Var2.TSizfFm2Yiuu;
        vw0 vw0Var2 = d32Var2.TSizfFm2Yiuu;
        if (!vw0Var.EpkonXwzFgDB() || !vw0Var2.J54yh1s3n4Aq() || region2.isEmpty()) {
            if (d32Var2.QrzZRwfaDlRX()) {
                S9EYkSpbGuxq(c81Var, d32Var, d32Var2);
                return;
            }
            return;
        }
        qt1 cpQdD2nAriOS2 = d32Var2.cpQdD2nAriOS();
        if (cpQdD2nAriOS2.a92UlCVFR9N8()) {
            tx a92UlCVFR9N82 = d32Var2.a92UlCVFR9N8();
            if (a92UlCVFR9N82 == null) {
                mp0 mp0Var = vw0Var2.nLZGh9p8gVSu.TSizfFm2Yiuu;
                cpQdD2nAriOS2 = kj0.ZbWwgt3aGe7A(mp0Var).nLZGh9p8gVSu(mp0Var, false);
            } else {
                m61 m61Var = ((m61) a92UlCVFR9N82).rtx2ld2ELZv4;
                Object RAsUl2FVSrh62 = d32Var2.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.lS5Rgt96tfkO);
                if (RAsUl2FVSrh62 == null) {
                    RAsUl2FVSrh62 = null;
                }
                cpQdD2nAriOS2 = th0.BRwzKIf41E4i(m61Var, RAsUl2FVSrh62 != null, false);
            }
        }
        dr0 wLFCmsViZrNT = xi0.wLFCmsViZrNT(cpQdD2nAriOS2);
        i2Var3.gPXPFXrUH4XX(wLFCmsViZrNT);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = d32Var2.a92UlCVFR9N8;
            d32 d32Var3 = d32Var;
            if (i == d32Var3.a92UlCVFR9N8) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            f32 f32Var = new f32(d32Var2, new dr0(bounds.left, bounds.top, bounds.right, bounds.bottom));
            c81 c81Var2 = c81Var;
            c81Var2.rtx2ld2ELZv4(i, f32Var);
            List wdg6QnbFHrFF2 = d32.wdg6QnbFHrFF(4, d32Var2);
            int size = wdg6QnbFHrFF2.size() - 1;
            while (-1 < size) {
                if (!((Boolean) le0Var.OPXfSBeufaJ8(wdg6QnbFHrFF2.get(size))).booleanValue()) {
                    EcgxDIVH5in8(i2Var3, i2Var4, le0Var, c81Var2, d32Var3, (d32) wdg6QnbFHrFF2.get(size));
                }
                size--;
                i2Var3 = i2Var;
                i2Var4 = i2Var2;
                c81Var2 = c81Var;
                d32Var3 = d32Var;
            }
            if (pnx5pC0XzaCw(d32Var2)) {
                region2.op(wLFCmsViZrNT.PxuCJdSBwIXG, wLFCmsViZrNT.lS5Rgt96tfkO, wLFCmsViZrNT.TSizfFm2Yiuu, wLFCmsViZrNT.Y1f8riQaR6yg, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ab2] */
    public static final n61 EpkonXwzFgDB(k61 k61Var, boolean z, boolean z2, ae0 ae0Var) {
        if (!z || !za2.PxuCJdSBwIXG) {
            return k61Var;
        }
        if (z2) {
            ?? ab2Var = new ab2(ZbWwgt3aGe7A);
            k61Var.getClass();
            k61Var = ab2Var;
        }
        return k61Var.TSizfFm2Yiuu(new xa2(ae0Var));
    }

    public static void J54yh1s3n4Aq(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final float OPXfSBeufaJ8(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static ly PxuCJdSBwIXG() {
        return new ly(1.0f, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r14 == r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
    
        if (r10 == r8) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fl2 QrzZRwfaDlRX(gl2 gl2Var, Object obj, Object obj2, w82 w82Var, lm2 lm2Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        boolean a92UlCVFR9N82 = ((tf0) hpVar).a92UlCVFR9N8(gl2Var);
        tf0 tf0Var = (tf0) hpVar;
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (!a92UlCVFR9N82) {
            hp.Companion.getClass();
        }
        j72.Companion.getClass();
        j72 PxuCJdSBwIXG2 = i72.PxuCJdSBwIXG();
        le0 e9gEMXR7LXtO2 = PxuCJdSBwIXG2 != null ? PxuCJdSBwIXG2.e9gEMXR7LXtO() : null;
        j72 lS5Rgt96tfkO2 = i72.lS5Rgt96tfkO(PxuCJdSBwIXG2);
        try {
            o8 o8Var = (o8) lm2Var.PxuCJdSBwIXG.OPXfSBeufaJ8(obj2);
            o8Var.Y1f8riQaR6yg();
            fl2 fl2Var = new fl2(gl2Var, obj, o8Var, lm2Var);
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG2, lS5Rgt96tfkO2, e9gEMXR7LXtO2);
            tf0Var.JTxCbbCwomzt(fl2Var);
            nLZGh9p8gVSu = fl2Var;
            fl2 fl2Var2 = (fl2) nLZGh9p8gVSu;
            rtx2ld2ELZv4(gl2Var, fl2Var2, obj, obj2, w82Var, tf0Var, 0);
            boolean a92UlCVFR9N83 = tf0Var.a92UlCVFR9N8(gl2Var) | tf0Var.a92UlCVFR9N8(fl2Var2);
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            if (!a92UlCVFR9N83) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu2 = new xf2(4, gl2Var, fl2Var2);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            mm2.rtx2ld2ELZv4(fl2Var2, (le0) nLZGh9p8gVSu2, tf0Var);
            return fl2Var2;
        } catch (Throwable th) {
            i72.e9gEMXR7LXtO(PxuCJdSBwIXG2, lS5Rgt96tfkO2, e9gEMXR7LXtO2);
            throw th;
        }
    }

    public static final void RAsUl2FVSrh6(String str, String str2, long j, n61 n61Var, hp hpVar, int i) {
        tf0 tf0Var;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(-102606792);
        int i2 = i | (tf0Var2.a92UlCVFR9N8(str) ? 4 : 2) | (tf0Var2.a92UlCVFR9N8(str2) ? 32 : 16) | (tf0Var2.e9gEMXR7LXtO(j) ? 256 : 128) | (tf0Var2.a92UlCVFR9N8(n61Var) ? 2048 : 1024);
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 TSizfFm2Yiuu2 = c62.TSizfFm2Yiuu(n61Var, 96.0f);
            ox1 ox1Var = n9.PxuCJdSBwIXG;
            n61 BRwzKIf41E4i2 = hq0.BRwzKIf41E4i(TSizfFm2Yiuu2, ox1Var);
            long lS5Rgt96tfkO2 = hl.lS5Rgt96tfkO(j, 0.14f);
            gk0 gk0Var = b51.x50lh2ztY7Y5;
            n61 jyegZNwi31qc2 = f2.jyegZNwi31qc(hq0.r3s1LDPKFs1S(BRwzKIf41E4i2, lS5Rgt96tfkO2, gk0Var).TSizfFm2Yiuu(new ke(1.5f, new m82(hl.lS5Rgt96tfkO(j, 0.45f)), ox1Var)), 12.0f);
            s.Companion.getClass();
            pd pdVar = r.lS5Rgt96tfkO;
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(pdVar, false);
            int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var2, jyegZNwi31qc2);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var2, xo.a92UlCVFR9N8, Y1f8riQaR6yg2);
            th0.tmVwIGCQF4zR(tf0Var2, xo.e9gEMXR7LXtO, x50lh2ztY7Y52);
            th0.tmVwIGCQF4zR(tf0Var2, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
            th0.kpCQ9veP6n3I(tf0Var2, xo.rtx2ld2ELZv4);
            th0.tmVwIGCQF4zR(tf0Var2, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
            jx1 jx1Var = jx1.dgRBjINgWbAK;
            k61 k61Var = n61.Companion;
            xe.PxuCJdSBwIXG(hq0.r3s1LDPKFs1S(hq0.BRwzKIf41E4i(c62.a92UlCVFR9N8(jx1Var.cpQdD2nAriOS(k61Var, pdVar), 10.0f), px1.PxuCJdSBwIXG), j, gk0Var), tf0Var2, 0);
            n61 cpQdD2nAriOS2 = jx1Var.cpQdD2nAriOS(k61Var, r.Y1f8riQaR6yg);
            t92 t92Var = fn2.PxuCJdSBwIXG;
            dj2 dj2Var = ((en2) tf0Var2.wdg6QnbFHrFF(t92Var)).RAsUl2FVSrh6;
            t92 t92Var2 = rl.PxuCJdSBwIXG;
            gi2.lS5Rgt96tfkO(str, cpQdD2nAriOS2, ((pl) tf0Var2.wdg6QnbFHrFF(t92Var2)).a92UlCVFR9N8, 0L, 0L, null, 0L, 0, false, 0, 0, dj2Var, tf0Var2, i2 & 14, 0, 131064);
            n61 lS5Rgt96tfkO3 = c62.lS5Rgt96tfkO(jx1Var.cpQdD2nAriOS(k61Var, r.wdg6QnbFHrFF), 1.0f);
            dj2 dj2Var2 = ((en2) tf0Var2.wdg6QnbFHrFF(t92Var)).OPXfSBeufaJ8;
            long j2 = ((pl) tf0Var2.wdg6QnbFHrFF(t92Var2)).PxuCJdSBwIXG;
            si2.Companion.getClass();
            he2.Companion.getClass();
            gi2.lS5Rgt96tfkO(str2, lS5Rgt96tfkO3, j2, 0L, 0L, new he2(6), 0L, 2, false, 1, 0, dj2Var2, tf0Var2, (i2 >> 3) & 14, 24960, 109560);
            tf0Var = tf0Var2;
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new yy(str, str2, j, n61Var, i, 1);
        }
    }

    public static final c81 RfyTYNmI9Srp(g32 g32Var, le0 le0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            d32 PxuCJdSBwIXG2 = g32Var.PxuCJdSBwIXG();
            vw0 vw0Var = PxuCJdSBwIXG2.TSizfFm2Yiuu;
            if (vw0Var.EpkonXwzFgDB() && vw0Var.J54yh1s3n4Aq()) {
                qt1 RAsUl2FVSrh62 = PxuCJdSBwIXG2.RAsUl2FVSrh6();
                c81 c81Var = new c81(48);
                i2 i2Var = new i2(29, (byte) 0);
                i2Var.gPXPFXrUH4XX(xi0.wLFCmsViZrNT(RAsUl2FVSrh62));
                VhhvGxCb8gfr(new i2(29, (byte) 0), i2Var, le0Var, c81Var, PxuCJdSBwIXG2, PxuCJdSBwIXG2);
                return c81Var;
            }
            c81 c81Var2 = uq0.PxuCJdSBwIXG;
            c81Var2.getClass();
            return c81Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void S2OOm9zPNm0h(hu huVar, Throwable th) {
        try {
            ku kuVar = (ku) huVar.S2OOm9zPNm0h(jx1.x50lh2ztY7Y5);
            if (kuVar != null) {
                kuVar.ZbWwgt3aGe7A(huVar, th);
            } else {
                hq0.IAToe7bXGz4N(huVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                f2.RAsUl2FVSrh6(runtimeException, th);
                th = runtimeException;
            }
            hq0.IAToe7bXGz4N(huVar, th);
        }
    }

    public static final void S9EYkSpbGuxq(c81 c81Var, d32 d32Var, d32 d32Var2) {
        vw0 vw0Var;
        d32 x50lh2ztY7Y52 = d32Var2.x50lh2ztY7Y5();
        qt1 RAsUl2FVSrh62 = (x50lh2ztY7Y52 == null || (vw0Var = x50lh2ztY7Y52.TSizfFm2Yiuu) == null || !vw0Var.EpkonXwzFgDB()) ? S2OOm9zPNm0h : x50lh2ztY7Y52.RAsUl2FVSrh6();
        int i = d32Var2.a92UlCVFR9N8;
        if (i == d32Var.a92UlCVFR9N8) {
            i = -1;
        }
        c81Var.rtx2ld2ELZv4(i, new f32(d32Var2, xi0.wLFCmsViZrNT(RAsUl2FVSrh62)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (r11 == r12) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011c, code lost:
    
        if (r6 == r12) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TSizfFm2Yiuu(lb1 lb1Var, hm0 hm0Var, hp hpVar, int i) {
        tf0 tf0Var;
        hm0 hm0Var2;
        hm0 hm0Var3;
        lb1Var.getClass();
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(-1454981525);
        int i2 = (tf0Var2.rtx2ld2ELZv4(lb1Var) ? 4 : 2) | i | 16;
        int i3 = 0;
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            tf0Var2.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var2.pnx5pC0XzaCw()) {
                pr2 PxuCJdSBwIXG2 = l21.PxuCJdSBwIXG(tf0Var2);
                if (PxuCJdSBwIXG2 == null) {
                    u9.rtx2ld2ELZv4("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                hm0Var3 = (hm0) th0.Pf0ThKz3j5YS(bu1.PxuCJdSBwIXG(hm0.class), PxuCJdSBwIXG2, sj0.nLZGh9p8gVSu(ki0.xfACYKDMU6Dj(PxuCJdSBwIXG2), tf0Var2), ki0.EpkonXwzFgDB(PxuCJdSBwIXG2), tf0Var2);
            } else {
                tf0Var2.i68hK7ahKtgp();
                hm0Var3 = hm0Var;
            }
            tf0Var2.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            d91 QrzZRwfaDlRX2 = sj0.QrzZRwfaDlRX(hm0Var3.Y1f8riQaR6yg, tf0Var2);
            d91 QrzZRwfaDlRX3 = sj0.QrzZRwfaDlRX(hm0Var3.a92UlCVFR9N8, tf0Var2);
            d91 QrzZRwfaDlRX4 = sj0.QrzZRwfaDlRX(hm0Var3.rtx2ld2ELZv4, tf0Var2);
            d91 QrzZRwfaDlRX5 = sj0.QrzZRwfaDlRX(hm0Var3.wdg6QnbFHrFF, tf0Var2);
            boolean rtx2ld2ELZv42 = tf0Var2.rtx2ld2ELZv4(hm0Var3);
            Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!rtx2ld2ELZv42) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new km0(hm0Var3, null, i3);
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
            mm2.wdg6QnbFHrFF(tf0Var2, (pe0) nLZGh9p8gVSu, no2.PxuCJdSBwIXG);
            k61 k61Var = n61.Companion;
            w70 w70Var = c62.TSizfFm2Yiuu;
            k61Var.getClass();
            n61 r3s1LDPKFs1S2 = hq0.r3s1LDPKFs1S(w70Var, ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S, b51.x50lh2ztY7Y5);
            ls2 ls2Var = ms2.Companion;
            n61 kpCQ9veP6n3I = f2.kpCQ9veP6n3I(f2.rZjpSjn4zoMv(r3s1LDPKFs1S2, 0.0f, ki0.QrzZRwfaDlRX(ni0.IAToe7bXGz4N(tf0Var2), tf0Var2).Y1f8riQaR6yg() + 10.0f, 0.0f, ki0.QrzZRwfaDlRX(ni0.ZbWwgt3aGe7A(tf0Var2), tf0Var2).TSizfFm2Yiuu() + 2.0f, 5), 16.0f, 0.0f, 2);
            y9 y9Var = new y9(12.0f, new u9(i3));
            boolean a92UlCVFR9N82 = tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX3) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX4) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX5) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX2) | tf0Var2.rtx2ld2ELZv4(lb1Var);
            Object nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
            if (!a92UlCVFR9N82) {
                hp.Companion.getClass();
            }
            a4 a4Var = new a4(QrzZRwfaDlRX3, QrzZRwfaDlRX4, QrzZRwfaDlRX5, QrzZRwfaDlRX2, lb1Var, 1);
            tf0Var2.JTxCbbCwomzt(a4Var);
            nLZGh9p8gVSu2 = a4Var;
            hm0Var2 = hm0Var3;
            tf0Var = tf0Var2;
            ni0.PxuCJdSBwIXG(kpCQ9veP6n3I, null, null, y9Var, null, null, false, null, (le0) nLZGh9p8gVSu2, tf0Var, 24576);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
            hm0Var2 = hm0Var;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new bf(i, 9, lb1Var, hm0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VhhvGxCb8gfr(i2 i2Var, i2 i2Var2, le0 le0Var, c81 c81Var, d32 d32Var, d32 d32Var2) {
        boolean z;
        qt1 BRwzKIf41E4i2;
        c81 c81Var2 = c81Var;
        d32 d32Var3 = d32Var;
        int i = d32Var3.a92UlCVFR9N8;
        Region region = (Region) i2Var.OPXfSBeufaJ8;
        i2 i2Var3 = i2Var2;
        Region region2 = (Region) i2Var3.OPXfSBeufaJ8;
        vw0 vw0Var = d32Var2.TSizfFm2Yiuu;
        z22 z22Var = d32Var2.Y1f8riQaR6yg;
        vw0 vw0Var2 = d32Var2.TSizfFm2Yiuu;
        int i2 = d32Var2.a92UlCVFR9N8;
        boolean z2 = (vw0Var.EpkonXwzFgDB() && vw0Var2.J54yh1s3n4Aq()) ? false : true;
        if (region2.isEmpty() && i2 != i) {
            return;
        }
        if (z2 && !d32Var2.QrzZRwfaDlRX()) {
            return;
        }
        dr0 wLFCmsViZrNT = xi0.wLFCmsViZrNT(d32Var2.cpQdD2nAriOS());
        i2Var.gPXPFXrUH4XX(wLFCmsViZrNT);
        if (i2 == i) {
            i2 = -1;
        }
        if (!region.op(region2, Region.Op.INTERSECT)) {
            if (d32Var2.QrzZRwfaDlRX()) {
                S9EYkSpbGuxq(c81Var, d32Var, d32Var2);
                return;
            } else {
                if (i2 == -1) {
                    Rect bounds = region.getBounds();
                    c81Var2.rtx2ld2ELZv4(i2, new f32(d32Var2, new dr0(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        Rect bounds2 = region.getBounds();
        c81Var2.rtx2ld2ELZv4(i2, new f32(d32Var2, new dr0(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        List wdg6QnbFHrFF2 = d32.wdg6QnbFHrFF(4, d32Var2);
        if (z22Var.wdg6QnbFHrFF) {
            d32 x50lh2ztY7Y52 = d32Var2.x50lh2ztY7Y5();
            while (true) {
                if (x50lh2ztY7Y52 == null) {
                    x50lh2ztY7Y52 = null;
                    break;
                }
                v81 v81Var = x50lh2ztY7Y52.Y1f8riQaR6yg.rtx2ld2ELZv4;
                if (v81Var.TSizfFm2Yiuu(h32.S2OOm9zPNm0h) || v81Var.TSizfFm2Yiuu(h32.VhhvGxCb8gfr)) {
                    break;
                } else {
                    x50lh2ztY7Y52 = x50lh2ztY7Y52.x50lh2ztY7Y5();
                }
            }
            if (x50lh2ztY7Y52 != null) {
                pd1 Y1f8riQaR6yg2 = d32Var2.Y1f8riQaR6yg();
                if (Y1f8riQaR6yg2 != null) {
                    if (!Y1f8riQaR6yg2.kRWHK87H9qm4().S9EYkSpbGuxq) {
                        Y1f8riQaR6yg2 = null;
                    }
                }
                Y1f8riQaR6yg2 = null;
                pd1 Y1f8riQaR6yg3 = x50lh2ztY7Y52.Y1f8riQaR6yg();
                if (Y1f8riQaR6yg3 != null) {
                    if (!Y1f8riQaR6yg3.kRWHK87H9qm4().S9EYkSpbGuxq) {
                        Y1f8riQaR6yg3 = null;
                    }
                }
                Y1f8riQaR6yg3 = null;
                if (Y1f8riQaR6yg2 != null && Y1f8riQaR6yg3 != null) {
                    qt1 nLZGh9p8gVSu = Y1f8riQaR6yg3.nLZGh9p8gVSu(Y1f8riQaR6yg2, false);
                    bf1.Companion.getClass();
                    z = !nLZGh9p8gVSu.equals(nLZGh9p8gVSu.e9gEMXR7LXtO(xi0.PxuCJdSBwIXG(0L, kj0.gGoUzNp9JO5I(Y1f8riQaR6yg3.wdg6QnbFHrFF))));
                    if (z) {
                        i2 i2Var4 = new i2(29, (byte) 0);
                        tx a92UlCVFR9N82 = d32Var2.a92UlCVFR9N8();
                        if (a92UlCVFR9N82 == null) {
                            mp0 mp0Var = vw0Var2.nLZGh9p8gVSu.TSizfFm2Yiuu;
                            BRwzKIf41E4i2 = kj0.ZbWwgt3aGe7A(mp0Var).nLZGh9p8gVSu(mp0Var, false);
                        } else {
                            m61 m61Var = ((m61) a92UlCVFR9N82).rtx2ld2ELZv4;
                            Object RAsUl2FVSrh62 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.lS5Rgt96tfkO);
                            BRwzKIf41E4i2 = th0.BRwzKIf41E4i(m61Var, (RAsUl2FVSrh62 == null ? null : RAsUl2FVSrh62) != null, false);
                        }
                        i2Var4.gPXPFXrUH4XX(xi0.wLFCmsViZrNT(BRwzKIf41E4i2));
                        int size = wdg6QnbFHrFF2.size() - 1;
                        while (-1 < size) {
                            if (!((Boolean) le0Var.OPXfSBeufaJ8(wdg6QnbFHrFF2.get(size))).booleanValue()) {
                                EcgxDIVH5in8(new i2(29, (byte) 0), i2Var4, le0Var, c81Var2, d32Var3, (d32) wdg6QnbFHrFF2.get(size));
                            }
                            size--;
                            c81Var2 = c81Var;
                            d32Var3 = d32Var;
                        }
                        if (pnx5pC0XzaCw(d32Var2)) {
                            return;
                        }
                        region2.op(wLFCmsViZrNT.PxuCJdSBwIXG, wLFCmsViZrNT.lS5Rgt96tfkO, wLFCmsViZrNT.TSizfFm2Yiuu, wLFCmsViZrNT.Y1f8riQaR6yg, Region.Op.DIFFERENCE);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        le0 le0Var2 = le0Var;
        int size2 = wdg6QnbFHrFF2.size() - 1;
        while (-1 < size2) {
            if (!((Boolean) le0Var2.OPXfSBeufaJ8(wdg6QnbFHrFF2.get(size2))).booleanValue()) {
                VhhvGxCb8gfr(i2Var, i2Var3, le0Var2, c81Var, d32Var, (d32) wdg6QnbFHrFF2.get(size2));
            }
            size2--;
            i2Var3 = i2Var2;
            le0Var2 = le0Var;
        }
        if (pnx5pC0XzaCw(d32Var2)) {
        }
    }

    public static void XL4ISE6Oc65B(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!aF05bpZJlKEP) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    e6tOsSdd2EFb = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    jyegZNwi31qc = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    e6tOsSdd2EFb = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    jyegZNwi31qc = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = e6tOsSdd2EFb;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = jyegZNwi31qc;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            aF05bpZJlKEP = true;
        }
        if (z) {
            try {
                Method method4 = e6tOsSdd2EFb;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = jyegZNwi31qc) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r9 == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Y1f8riQaR6yg(lb1 lb1Var, u51 u51Var, hp hpVar, int i) {
        tf0 tf0Var;
        u51 u51Var2;
        u51 u51Var3;
        lb1Var.getClass();
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(1523917857);
        int i2 = 2;
        int i3 = (tf0Var2.rtx2ld2ELZv4(lb1Var) ? 4 : 2) | i | 16;
        int i4 = 0;
        if (tf0Var2.Pf0ThKz3j5YS(i3 & 1, (i3 & 19) != 18)) {
            tf0Var2.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var2.pnx5pC0XzaCw()) {
                pr2 PxuCJdSBwIXG2 = l21.PxuCJdSBwIXG(tf0Var2);
                if (PxuCJdSBwIXG2 == null) {
                    u9.rtx2ld2ELZv4("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u51Var3 = (u51) th0.Pf0ThKz3j5YS(bu1.PxuCJdSBwIXG(u51.class), PxuCJdSBwIXG2, sj0.nLZGh9p8gVSu(ki0.xfACYKDMU6Dj(PxuCJdSBwIXG2), tf0Var2), ki0.EpkonXwzFgDB(PxuCJdSBwIXG2), tf0Var2);
            } else {
                tf0Var2.i68hK7ahKtgp();
                u51Var3 = u51Var;
            }
            tf0Var2.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            d91 QrzZRwfaDlRX2 = sj0.QrzZRwfaDlRX(u51Var3.RAsUl2FVSrh6, tf0Var2);
            d91 QrzZRwfaDlRX3 = sj0.QrzZRwfaDlRX(u51Var3.e9gEMXR7LXtO, tf0Var2);
            boolean rtx2ld2ELZv42 = tf0Var2.rtx2ld2ELZv4(u51Var3);
            Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!rtx2ld2ELZv42) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new km0(u51Var3, null, i2);
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
            mm2.wdg6QnbFHrFF(tf0Var2, (pe0) nLZGh9p8gVSu, no2.PxuCJdSBwIXG);
            k61 k61Var = n61.Companion;
            w70 w70Var = c62.TSizfFm2Yiuu;
            k61Var.getClass();
            n61 r3s1LDPKFs1S2 = hq0.r3s1LDPKFs1S(w70Var, ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).r3s1LDPKFs1S, b51.x50lh2ztY7Y5);
            ls2 ls2Var = ms2.Companion;
            n61 kpCQ9veP6n3I = f2.kpCQ9veP6n3I(f2.rZjpSjn4zoMv(r3s1LDPKFs1S2, 0.0f, ki0.QrzZRwfaDlRX(ni0.IAToe7bXGz4N(tf0Var2), tf0Var2).Y1f8riQaR6yg() + 10.0f, 0.0f, ki0.QrzZRwfaDlRX(ni0.ZbWwgt3aGe7A(tf0Var2), tf0Var2).TSizfFm2Yiuu() + 2.0f, 5), 16.0f, 0.0f, 2);
            y9 y9Var = new y9(12.0f, new u9(i4));
            boolean rtx2ld2ELZv43 = tf0Var2.rtx2ld2ELZv4(lb1Var) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX3) | tf0Var2.rtx2ld2ELZv4(u51Var3) | tf0Var2.a92UlCVFR9N8(QrzZRwfaDlRX2);
            Object nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv43) {
                hp.Companion.getClass();
                if (nLZGh9p8gVSu2 != jx1Var) {
                    u51Var2 = u51Var3;
                    tf0Var = tf0Var2;
                    ni0.PxuCJdSBwIXG(kpCQ9veP6n3I, null, null, y9Var, null, null, false, null, (le0) nLZGh9p8gVSu2, tf0Var, 24576);
                }
            }
            u51Var2 = u51Var3;
            d7 d7Var = new d7(lb1Var, u51Var2, QrzZRwfaDlRX3, QrzZRwfaDlRX2, 5);
            tf0Var2.JTxCbbCwomzt(d7Var);
            nLZGh9p8gVSu2 = d7Var;
            tf0Var = tf0Var2;
            ni0.PxuCJdSBwIXG(kpCQ9veP6n3I, null, null, y9Var, null, null, false, null, (le0) nLZGh9p8gVSu2, tf0Var, 24576);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
            u51Var2 = u51Var;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new bf(i, 14, lb1Var, u51Var2);
        }
    }

    public static final boolean ZbWwgt3aGe7A(d32 d32Var) {
        pd1 Y1f8riQaR6yg2 = d32Var.Y1f8riQaR6yg();
        v81 v81Var = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4;
        return (Y1f8riQaR6yg2 != null ? Y1f8riQaR6yg2.d() : false) || v81Var.TSizfFm2Yiuu(h32.BRwzKIf41E4i) || v81Var.TSizfFm2Yiuu(h32.gPXPFXrUH4XX);
    }

    public static final void a92UlCVFR9N8(String str, le0 le0Var, String str2, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1636419729);
        int i2 = 2;
        int i3 = i | (tf0Var.a92UlCVFR9N8(str) ? 4 : 2) | (tf0Var.rtx2ld2ELZv4(le0Var) ? 32 : 16) | (tf0Var.a92UlCVFR9N8(str2) ? 256 : 128);
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            n61 lS5Rgt96tfkO2 = c62.lS5Rgt96tfkO(n61.Companion, 1.0f);
            float f = 1.0f;
            ox1 ox1Var = n9.PxuCJdSBwIXG;
            t92 t92Var = rl.PxuCJdSBwIXG;
            long j = ((pl) tf0Var.wdg6QnbFHrFF(t92Var)).r3s1LDPKFs1S;
            tf0Var.IXK6ba3ucyzm(89374938);
            long PxuCJdSBwIXG2 = rl.PxuCJdSBwIXG((pl) tf0Var.wdg6QnbFHrFF(t92Var), j);
            if (PxuCJdSBwIXG2 == 16) {
                PxuCJdSBwIXG2 = ((hl) tf0Var.wdg6QnbFHrFF(zr.PxuCJdSBwIXG)).PxuCJdSBwIXG;
            }
            tf0Var.gPXPFXrUH4XX(false);
            hl.Companion.getClass();
            long j2 = hl.RAsUl2FVSrh6;
            long lS5Rgt96tfkO3 = hl.lS5Rgt96tfkO(PxuCJdSBwIXG2, 0.38f);
            li S2OOm9zPNm0h2 = cs0.S2OOm9zPNm0h((pl) tf0Var.wdg6QnbFHrFF(t92Var));
            if (j == 16) {
                j = S2OOm9zPNm0h2.PxuCJdSBwIXG;
            }
            long j3 = j;
            if (PxuCJdSBwIXG2 == 16) {
                PxuCJdSBwIXG2 = S2OOm9zPNm0h2.lS5Rgt96tfkO;
            }
            li liVar = new li(j3, PxuCJdSBwIXG2, j2 != 16 ? j2 : S2OOm9zPNm0h2.TSizfFm2Yiuu, lS5Rgt96tfkO3 != 16 ? lS5Rgt96tfkO3 : S2OOm9zPNm0h2.Y1f8riQaR6yg);
            le leVar = new le(new m82(((pl) tf0Var.wdg6QnbFHrFF(t92Var)).PxuCJdSBwIXG));
            if ((1 & 62) != 0) {
                f = 0.0f;
            }
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
            b51.BjEWd04qc7Mw(lS5Rgt96tfkO2, ox1Var, liVar, new mi(f, cpQdD2nAriOS, x50lh2ztY7Y5), leVar, kpCQ9veP6n3I(2123292127, new kf0(str, le0Var, str2, i2), tf0Var), tf0Var, 196662);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new n6(str, le0Var, str2, i, 4);
        }
    }

    public static List aF05bpZJlKEP(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final n61 cpQdD2nAriOS(n61 n61Var, hf hfVar) {
        return n61Var.TSizfFm2Yiuu(new ff(hfVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Typeface dgRBjINgWbAK(jv1 jv1Var, Context context) {
        int i = lv1.PxuCJdSBwIXG;
        Typeface typeface = null;
        if (!context.isRestricted()) {
            TypedValue typedValue = new TypedValue();
            Resources resources = context.getResources();
            resources.getValue(com.ice.fishing.grenza.R.font.roboto, typedValue, true);
            CharSequence charSequence = typedValue.string;
            if (charSequence == null) {
                throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(com.ice.fishing.grenza.R.font.roboto) + "\" (" + Integer.toHexString(com.ice.fishing.grenza.R.font.roboto) + ") is not a Font: " + typedValue);
            }
            String charSequence2 = charSequence.toString();
            if (charSequence2.startsWith("res/")) {
                int i2 = typedValue.assetCookie;
                b41 b41Var = pm2.lS5Rgt96tfkO;
                Typeface typeface2 = (Typeface) b41Var.TSizfFm2Yiuu(pm2.lS5Rgt96tfkO(resources, charSequence2, i2));
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            ic0 jyegZNwi31qc2 = jyegZNwi31qc(resources.getXml(com.ice.fishing.grenza.R.font.roboto), resources);
                            if (jyegZNwi31qc2 == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                            } else {
                                typeface = pm2.PxuCJdSBwIXG(context, jyegZNwi31qc2, resources, charSequence2, typedValue.assetCookie, null);
                            }
                        } else {
                            int i3 = typedValue.assetCookie;
                            Typeface r3s1LDPKFs1S2 = pm2.PxuCJdSBwIXG.r3s1LDPKFs1S(context, resources, charSequence2);
                            if (r3s1LDPKFs1S2 != null) {
                                b41Var.Y1f8riQaR6yg(pm2.lS5Rgt96tfkO(resources, charSequence2, i3), r3s1LDPKFs1S2);
                            }
                            typeface = r3s1LDPKFs1S2;
                        }
                    } catch (IOException e) {
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    } catch (XmlPullParserException e2) {
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    }
                }
                if (typeface == null) {
                    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(com.ice.fishing.grenza.R.font.roboto) + " could not be retrieved.");
                }
            }
            typeface = null;
            if (typeface == null) {
            }
        }
        typeface.getClass();
        return typeface;
    }

    public static final void e9gEMXR7LXtO(String str, String str2, long j, ae0 ae0Var, hp hpVar, int i) {
        tf0 tf0Var;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(1412548812);
        int i2 = i | (tf0Var2.a92UlCVFR9N8(str) ? 4 : 2) | (tf0Var2.a92UlCVFR9N8(str2) ? 32 : 16) | (tf0Var2.e9gEMXR7LXtO(j) ? 256 : 128) | (tf0Var2.rtx2ld2ELZv4(ae0Var) ? 2048 : 1024);
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            k61 k61Var = n61.Companion;
            n61 BRwzKIf41E4i2 = hq0.BRwzKIf41E4i(c62.TSizfFm2Yiuu(c62.lS5Rgt96tfkO(k61Var, 1.0f), 72.0f), n9.PxuCJdSBwIXG);
            t92 t92Var = rl.PxuCJdSBwIXG;
            long j2 = ((pl) tf0Var2.wdg6QnbFHrFF(t92Var)).PxuCJdSBwIXG;
            gk0 gk0Var = b51.x50lh2ztY7Y5;
            int i3 = i2 >> 3;
            n61 kpCQ9veP6n3I = zv.kpCQ9veP6n3I(1, tf0Var2, ae0Var, hq0.r3s1LDPKFs1S(BRwzKIf41E4i2, j2, gk0Var), false);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var2, kpCQ9veP6n3I);
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
            xe.PxuCJdSBwIXG(hq0.r3s1LDPKFs1S(c62.TSizfFm2Yiuu(c62.lS5Rgt96tfkO(jx1.dgRBjINgWbAK.cpQdD2nAriOS(k61Var, r.OPXfSBeufaJ8), 1.0f), 5.0f), j, gk0Var), tf0Var2, 0);
            n61 aF05bpZJlKEP2 = f2.aF05bpZJlKEP(c62.lS5Rgt96tfkO(k61Var, 1.0f), 16.0f, 12.0f);
            by1 PxuCJdSBwIXG2 = ay1.PxuCJdSBwIXG(new y9(12.0f, new u9(0)), r.x50lh2ztY7Y5, tf0Var2, 54);
            int hashCode2 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var2, aF05bpZJlKEP2);
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, PxuCJdSBwIXG2);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y53);
            o0.EcgxDIVH5in8(hashCode2, tf0Var2, p7Var3, tf0Var2, k1Var);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj2);
            n61 a92UlCVFR9N82 = c62.a92UlCVFR9N8(k61Var, 40.0f);
            ox1 ox1Var = px1.PxuCJdSBwIXG;
            n61 TSizfFm2Yiuu2 = hq0.r3s1LDPKFs1S(hq0.BRwzKIf41E4i(a92UlCVFR9N82, ox1Var), hl.lS5Rgt96tfkO(j, 0.18f), gk0Var).TSizfFm2Yiuu(new ke(1.5f, new m82(j), ox1Var));
            j51 Y1f8riQaR6yg3 = xe.Y1f8riQaR6yg(r.a92UlCVFR9N8, false);
            int hashCode3 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y54 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj3 = ov2.xfACYKDMU6Dj(tf0Var2, TSizfFm2Yiuu2);
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, Y1f8riQaR6yg3);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y54);
            o0.EcgxDIVH5in8(hashCode3, tf0Var2, p7Var3, tf0Var2, k1Var);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj3);
            t92 t92Var2 = fn2.PxuCJdSBwIXG;
            gi2.lS5Rgt96tfkO(str, null, j, 0L, 0L, null, 0L, 0, false, 0, 0, ((en2) tf0Var2.wdg6QnbFHrFF(t92Var2)).rtx2ld2ELZv4, tf0Var2, i2 & 910, 0, 131066);
            tf0Var2.gPXPFXrUH4XX(true);
            lx0 lx0Var = new lx0(1.0f, true);
            dj2 dj2Var = ((en2) tf0Var2.wdg6QnbFHrFF(t92Var2)).rtx2ld2ELZv4;
            long j3 = ((pl) tf0Var2.wdg6QnbFHrFF(t92Var)).r3s1LDPKFs1S;
            si2.Companion.getClass();
            gi2.lS5Rgt96tfkO(str2, lx0Var, j3, 0L, 0L, null, 0L, 2, false, 1, 0, dj2Var, tf0Var2, i3 & 14, 24960, 110584);
            gi2.lS5Rgt96tfkO("›", null, hl.lS5Rgt96tfkO(j, 0.85f), 0L, 0L, null, 0L, 0, false, 0, 0, ((en2) tf0Var2.wdg6QnbFHrFF(t92Var2)).RAsUl2FVSrh6, tf0Var2, 6, 0, 131066);
            tf0Var = tf0Var2;
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new yy(str, str2, j, ae0Var, i, 2);
        }
    }

    public static final void gPXPFXrUH4XX(eq0 eq0Var) {
        try {
            eq0Var.PxuCJdSBwIXG = 3;
            if (eq0Var.Y1f8riQaR6yg != null) {
                ni0.ozEBbv0hFTAB("Unbinding from service.");
                eq0Var.lS5Rgt96tfkO.unbindService(eq0Var.Y1f8riQaR6yg);
                eq0Var.Y1f8riQaR6yg = null;
            }
            eq0Var.TSizfFm2Yiuu = null;
        } catch (Throwable unused) {
        }
    }

    public static ic0 jyegZNwi31qc(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        int i3;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            J54yh1s3n4Aq(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rr1.lS5Rgt96tfkO);
        int i4 = 0;
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int i5 = 3;
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rr1.TSizfFm2Yiuu);
                        int i6 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i7 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i8 = obtainAttributes2.getInt(i7, 0);
                        int i9 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                        String string7 = obtainAttributes2.getString(i9);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            J54yh1s3n4Aq(xmlResourceParser);
                        }
                        arrayList.add(new kc0(i6, i8, resourceId2, string7, string6, z));
                    } else {
                        J54yh1s3n4Aq(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new jc0((kc0[]) arrayList.toArray(new kc0[0]));
        }
        List aF05bpZJlKEP2 = aF05bpZJlKEP(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i5) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), rr1.Y1f8riQaR6yg);
                    try {
                        String string8 = obtainAttributes3.getString(i4);
                        String string9 = obtainAttributes3.getString(1);
                        i3 = integer;
                        String string10 = obtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = obtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i5) {
                            J54yh1s3n4Aq(xmlResourceParser);
                        }
                        try {
                            typedArray = obtainAttributes3;
                            i2 = i5;
                            try {
                                bc0 bc0Var = new bc0(string, string2, string8, aF05bpZJlKEP2, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(bc0Var);
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            typedArray = obtainAttributes3;
                        }
                        th = th;
                    } catch (Throwable th3) {
                        th = th3;
                        typedArray = obtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i2 = i5;
                i3 = integer;
                J54yh1s3n4Aq(xmlResourceParser);
                i5 = i2;
                integer = i3;
                i = 2;
                i4 = 0;
            }
        }
        int i10 = integer;
        if (!arrayList2.isEmpty()) {
            return new lc0(arrayList2, i10, integer2, string5);
        }
        if (string3 == null) {
            u9.XL4ISE6Oc65B("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new bc0(string, string2, string3, aF05bpZJlKEP2, null, null));
        if (string4 != null) {
            arrayList2.add(new bc0(string, string2, string4, aF05bpZJlKEP2, null, null));
        }
        return new lc0(arrayList2, i10, integer2, string5);
    }

    public static final on kpCQ9veP6n3I(int i, xe0 xe0Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
            nLZGh9p8gVSu = new on(i, true, xe0Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        }
        on onVar = (on) nLZGh9p8gVSu;
        if (!onVar.wdg6QnbFHrFF.equals(xe0Var)) {
            onVar.wdg6QnbFHrFF = xe0Var;
            if (onVar.OPXfSBeufaJ8) {
                zs1 zs1Var = onVar.dgRBjINgWbAK;
                if (zs1Var != null) {
                    zp zpVar = zs1Var.PxuCJdSBwIXG;
                    if (zpVar != null) {
                        zpVar.RfyTYNmI9Srp(zs1Var, null);
                    }
                    onVar.dgRBjINgWbAK = null;
                }
                ArrayList arrayList = onVar.x50lh2ztY7Y5;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        zs1 zs1Var2 = (zs1) arrayList.get(i2);
                        zp zpVar2 = zs1Var2.PxuCJdSBwIXG;
                        if (zpVar2 != null) {
                            zpVar2.RfyTYNmI9Srp(zs1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        gg1 gg1Var2 = mp.PxuCJdSBwIXG;
        return onVar;
    }

    public static final void lS5Rgt96tfkO(String str, String str2, long j, hp hpVar, int i) {
        tf0 tf0Var;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(865899517);
        int i2 = i | (tf0Var2.a92UlCVFR9N8(str) ? 4 : 2) | (tf0Var2.a92UlCVFR9N8(str2) ? 32 : 16) | (tf0Var2.e9gEMXR7LXtO(j) ? 256 : 128);
        int i3 = 0;
        if (tf0Var2.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            k61 k61Var = n61.Companion;
            n61 jyegZNwi31qc2 = f2.jyegZNwi31qc(hq0.r3s1LDPKFs1S(hq0.BRwzKIf41E4i(c62.lS5Rgt96tfkO(k61Var, 1.0f), n9.PxuCJdSBwIXG), j, b51.x50lh2ztY7Y5), 16.0f);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(r.lS5Rgt96tfkO, false);
            int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y52 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var2, jyegZNwi31qc2);
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
            dm PxuCJdSBwIXG2 = bm.PxuCJdSBwIXG(new y9(8.0f, new u9(i3)), r.cpQdD2nAriOS, tf0Var2, 6);
            int hashCode2 = Long.hashCode(tf0Var2.wLFCmsViZrNT);
            il1 x50lh2ztY7Y53 = tf0Var2.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var2, k61Var);
            tf0Var2.ngxnMNrpiKat();
            if (tf0Var2.zf8DYfih6EZu) {
                tf0Var2.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var2.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var2, p7Var, PxuCJdSBwIXG2);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var2, x50lh2ztY7Y53);
            o0.EcgxDIVH5in8(hashCode2, tf0Var2, p7Var3, tf0Var2, k1Var);
            th0.tmVwIGCQF4zR(tf0Var2, p7Var4, xfACYKDMU6Dj2);
            t92 t92Var = fn2.PxuCJdSBwIXG;
            dj2 dj2Var = ((en2) tf0Var2.wdg6QnbFHrFF(t92Var)).rtx2ld2ELZv4;
            t92 t92Var2 = rl.PxuCJdSBwIXG;
            gi2.lS5Rgt96tfkO(str, null, ((pl) tf0Var2.wdg6QnbFHrFF(t92Var2)).PxuCJdSBwIXG, 0L, 0L, null, 0L, 0, false, 0, 0, dj2Var, tf0Var2, i2 & 14, 0, 131066);
            gi2.lS5Rgt96tfkO(str2, null, hl.lS5Rgt96tfkO(((pl) tf0Var2.wdg6QnbFHrFF(t92Var2)).PxuCJdSBwIXG, 0.75f), 0L, 0L, null, 0L, 0, false, 0, 0, ((en2) tf0Var2.wdg6QnbFHrFF(t92Var)).OPXfSBeufaJ8, tf0Var2, (i2 >> 3) & 14, 0, 131066);
            tf0Var = tf0Var2;
            tf0Var.gPXPFXrUH4XX(true);
            tf0Var.gPXPFXrUH4XX(true);
        } else {
            tf0Var = tf0Var2;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new s2(str, str2, j, i, 1);
        }
    }

    public static final void ozEBbv0hFTAB(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    public static final boolean pnx5pC0XzaCw(d32 d32Var) {
        if (!ZbWwgt3aGe7A(d32Var)) {
            z22 z22Var = d32Var.Y1f8riQaR6yg;
            if (z22Var.wdg6QnbFHrFF) {
                return true;
            }
            v81 v81Var = z22Var.rtx2ld2ELZv4;
            Object[] objArr = v81Var.lS5Rgt96tfkO;
            Object[] objArr2 = v81Var.TSizfFm2Yiuu;
            long[] jArr = v81Var.PxuCJdSBwIXG;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((k32) obj).TSizfFm2Yiuu) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r3 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r6 == r0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final cl2 r3s1LDPKFs1S(gl2 gl2Var, lm2 lm2Var, String str, hp hpVar, int i, int i2) {
        bl2 bl2Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        boolean a92UlCVFR9N82 = ((tf0) hpVar).a92UlCVFR9N8(gl2Var);
        tf0 tf0Var = (tf0) hpVar;
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (!a92UlCVFR9N82) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu = new cl2(gl2Var, lm2Var, str);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        cl2 cl2Var = (cl2) nLZGh9p8gVSu;
        boolean a92UlCVFR9N83 = tf0Var.a92UlCVFR9N8(gl2Var) | tf0Var.rtx2ld2ELZv4(cl2Var);
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (!a92UlCVFR9N83) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu2 = new xf2(7, gl2Var, cl2Var);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
        mm2.rtx2ld2ELZv4(cl2Var, (le0) nLZGh9p8gVSu2, tf0Var);
        if (gl2Var.RAsUl2FVSrh6() && (bl2Var = (bl2) cl2Var.lS5Rgt96tfkO.getValue()) != null) {
            gl2 gl2Var2 = cl2Var.TSizfFm2Yiuu;
            bl2Var.rtx2ld2ELZv4.rtx2ld2ELZv4(bl2Var.wdg6QnbFHrFF.OPXfSBeufaJ8(gl2Var2.a92UlCVFR9N8().lS5Rgt96tfkO()), bl2Var.wdg6QnbFHrFF.OPXfSBeufaJ8(gl2Var2.a92UlCVFR9N8().TSizfFm2Yiuu()), (e80) bl2Var.OPXfSBeufaJ8.OPXfSBeufaJ8(gl2Var2.a92UlCVFR9N8()));
        }
        return cl2Var;
    }

    public static final void rZjpSjn4zoMv(bt btVar, Object obj) {
        if (!(btVar instanceof e00)) {
            btVar.RAsUl2FVSrh6(obj);
            return;
        }
        e00 e00Var = (e00) btVar;
        ju juVar = e00Var.dgRBjINgWbAK;
        ct ctVar = e00Var.x50lh2ztY7Y5;
        Throwable PxuCJdSBwIXG2 = vv1.PxuCJdSBwIXG(obj);
        Object smVar = PxuCJdSBwIXG2 == null ? obj : new sm(PxuCJdSBwIXG2, false);
        if (juVar.POWyO8hTM6YC(ctVar.e9gEMXR7LXtO())) {
            e00Var.cpQdD2nAriOS = smVar;
            e00Var.wdg6QnbFHrFF = 1;
            juVar.Pf0ThKz3j5YS(ctVar.e9gEMXR7LXtO(), e00Var);
            return;
        }
        t60 PxuCJdSBwIXG3 = nj2.PxuCJdSBwIXG();
        if (PxuCJdSBwIXG3.wdg6QnbFHrFF >= 4294967296L) {
            e00Var.cpQdD2nAriOS = smVar;
            e00Var.wdg6QnbFHrFF = 1;
            PxuCJdSBwIXG3.wLFCmsViZrNT(e00Var);
            return;
        }
        PxuCJdSBwIXG3.xbgXKYA2cIfu(true);
        try {
            xs0 xs0Var = (xs0) ctVar.e9gEMXR7LXtO().S2OOm9zPNm0h(ih0.BRwzKIf41E4i);
            if (xs0Var == null || xs0Var.lS5Rgt96tfkO()) {
                Object obj2 = e00Var.r3s1LDPKFs1S;
                hu e9gEMXR7LXtO2 = ctVar.e9gEMXR7LXtO();
                Object JHNfcAUfKc4G = hq0.JHNfcAUfKc4G(e9gEMXR7LXtO2, obj2);
                ko2 JHNfcAUfKc4G2 = JHNfcAUfKc4G != hq0.XL4ISE6Oc65B ? zv.JHNfcAUfKc4G(ctVar, e9gEMXR7LXtO2, JHNfcAUfKc4G) : null;
                try {
                    ctVar.RAsUl2FVSrh6(obj);
                } finally {
                    if (JHNfcAUfKc4G2 == null || JHNfcAUfKc4G2.iSxsmagYqzHM()) {
                        hq0.Pf0ThKz3j5YS(e9gEMXR7LXtO2, JHNfcAUfKc4G);
                    }
                }
            } else {
                e00Var.RAsUl2FVSrh6(ng0.gPXPFXrUH4XX(xs0Var.pnx5pC0XzaCw()));
            }
            while (PxuCJdSBwIXG3.IXK6ba3ucyzm()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void rtx2ld2ELZv4(gl2 gl2Var, fl2 fl2Var, Object obj, Object obj2, w82 w82Var, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(867041821);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(gl2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.a92UlCVFR9N8(fl2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? tf0Var.a92UlCVFR9N8(obj) : tf0Var.rtx2ld2ELZv4(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? tf0Var.a92UlCVFR9N8(obj2) : tf0Var.rtx2ld2ELZv4(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? tf0Var.a92UlCVFR9N8(w82Var) : tf0Var.rtx2ld2ELZv4(w82Var) ? 16384 : 8192;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 9363) != 9362)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            if (gl2Var.RAsUl2FVSrh6()) {
                fl2Var.rtx2ld2ELZv4(obj, obj2, w82Var);
            } else {
                fl2Var.OPXfSBeufaJ8(obj2, w82Var);
            }
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new r90(gl2Var, fl2Var, obj, obj2, w82Var, i, 1);
        }
    }

    public static final long tmVwIGCQF4zR(long j, float f) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final boolean wdg6QnbFHrFF(v10 v10Var, long j) {
        if (!v10Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            return false;
        }
        mp0 mp0Var = zv.zf8DYfih6EZu(v10Var).nLZGh9p8gVSu.TSizfFm2Yiuu;
        if (!mp0Var.bEKsvqmvPh2y.S9EYkSpbGuxq) {
            return false;
        }
        long J54yh1s3n4Aq = kj0.J54yh1s3n4Aq(mp0Var);
        float intBitsToFloat = Float.intBitsToFloat((int) (J54yh1s3n4Aq >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (J54yh1s3n4Aq & 4294967295L));
        long j2 = v10Var.ZbWwgt3aGe7A;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static final int x50lh2ztY7Y5(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final nk xfACYKDMU6Dj(v8 v8Var) {
        SpannableString spannableString;
        List list = v8Var.wdg6QnbFHrFF;
        List list2 = p50.rtx2ld2ELZv4;
        List list3 = list == null ? list2 : list;
        CharSequence charSequence = v8Var.OPXfSBeufaJ8;
        if (!list3.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            cw cwVar = new cw();
            cwVar.PxuCJdSBwIXG = Parcel.obtain();
            if (list == null) {
                list = list2;
            }
            int size = list.size();
            int i = 0;
            SpannableString spannableString3 = spannableString2;
            while (i < size) {
                u8 u8Var = (u8) list.get(i);
                q82 q82Var = (q82) u8Var.PxuCJdSBwIXG;
                int i2 = u8Var.lS5Rgt96tfkO;
                int i3 = u8Var.TSizfFm2Yiuu;
                cwVar.PxuCJdSBwIXG.recycle();
                cwVar.PxuCJdSBwIXG = Parcel.obtain();
                rh2 rh2Var = q82Var.PxuCJdSBwIXG;
                long j = q82Var.x50lh2ztY7Y5;
                long j2 = q82Var.rtx2ld2ELZv4;
                int i4 = i;
                long j3 = q82Var.lS5Rgt96tfkO;
                List list4 = list;
                int i5 = size;
                long lS5Rgt96tfkO2 = rh2Var.lS5Rgt96tfkO();
                hl.Companion.getClass();
                long j4 = hl.RAsUl2FVSrh6;
                if (hl.TSizfFm2Yiuu(lS5Rgt96tfkO2, j4)) {
                    spannableString = spannableString3;
                } else {
                    cwVar.TSizfFm2Yiuu((byte) 1);
                    spannableString = spannableString3;
                    cwVar.PxuCJdSBwIXG.writeLong(q82Var.PxuCJdSBwIXG.lS5Rgt96tfkO());
                }
                hj2.Companion.getClass();
                long j5 = hj2.TSizfFm2Yiuu;
                byte b = 2;
                if (!hj2.PxuCJdSBwIXG(j3, j5)) {
                    cwVar.TSizfFm2Yiuu((byte) 2);
                    cwVar.e9gEMXR7LXtO(j3);
                }
                xc0 xc0Var = q82Var.TSizfFm2Yiuu;
                if (xc0Var != null) {
                    cwVar.TSizfFm2Yiuu((byte) 3);
                    cwVar.PxuCJdSBwIXG.writeInt(xc0Var.rtx2ld2ELZv4);
                }
                rc0 rc0Var = q82Var.Y1f8riQaR6yg;
                if (rc0Var != null) {
                    int i6 = rc0Var.PxuCJdSBwIXG;
                    cwVar.TSizfFm2Yiuu((byte) 4);
                    rc0.Companion.getClass();
                    cwVar.TSizfFm2Yiuu((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                tc0 tc0Var = q82Var.e9gEMXR7LXtO;
                if (tc0Var != null) {
                    int i7 = tc0Var.PxuCJdSBwIXG;
                    cwVar.TSizfFm2Yiuu((byte) 5);
                    tc0.Companion.getClass();
                    if (i7 != 0) {
                        if (i7 == 65535) {
                            b = 1;
                        } else if (i7 != 1) {
                            if (i7 == 2) {
                                b = 3;
                            }
                        }
                        cwVar.TSizfFm2Yiuu(b);
                    }
                    b = 0;
                    cwVar.TSizfFm2Yiuu(b);
                }
                String str = q82Var.RAsUl2FVSrh6;
                if (str != null) {
                    cwVar.TSizfFm2Yiuu((byte) 6);
                    cwVar.PxuCJdSBwIXG.writeString(str);
                }
                if (!hj2.PxuCJdSBwIXG(j2, j5)) {
                    cwVar.TSizfFm2Yiuu((byte) 7);
                    cwVar.e9gEMXR7LXtO(j2);
                }
                uc ucVar = q82Var.OPXfSBeufaJ8;
                if (ucVar != null) {
                    float f = ucVar.PxuCJdSBwIXG;
                    cwVar.TSizfFm2Yiuu((byte) 8);
                    cwVar.Y1f8riQaR6yg(f);
                }
                th2 th2Var = q82Var.wdg6QnbFHrFF;
                if (th2Var != null) {
                    cwVar.TSizfFm2Yiuu((byte) 9);
                    cwVar.Y1f8riQaR6yg(th2Var.PxuCJdSBwIXG);
                    cwVar.Y1f8riQaR6yg(th2Var.lS5Rgt96tfkO);
                }
                if (!hl.TSizfFm2Yiuu(j, j4)) {
                    cwVar.TSizfFm2Yiuu((byte) 10);
                    cwVar.PxuCJdSBwIXG.writeLong(j);
                }
                if2 if2Var = q82Var.cpQdD2nAriOS;
                if (if2Var != null) {
                    cwVar.TSizfFm2Yiuu((byte) 11);
                    cwVar.PxuCJdSBwIXG.writeInt(if2Var.PxuCJdSBwIXG);
                }
                w42 w42Var = q82Var.r3s1LDPKFs1S;
                if (w42Var != null) {
                    cwVar.TSizfFm2Yiuu((byte) 12);
                    cwVar.PxuCJdSBwIXG.writeLong(w42Var.PxuCJdSBwIXG);
                    long j6 = w42Var.lS5Rgt96tfkO;
                    cwVar.Y1f8riQaR6yg(Float.intBitsToFloat((int) (j6 >> 32)));
                    cwVar.Y1f8riQaR6yg(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    cwVar.Y1f8riQaR6yg(w42Var.TSizfFm2Yiuu);
                }
                SpannableString spannableString4 = spannableString;
                spannableString4.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(cwVar.PxuCJdSBwIXG.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString3 = spannableString4;
                list = list4;
                size = i5;
            }
            charSequence = spannableString3;
        }
        return new nk(ClipData.newPlainText("plain text", charSequence));
    }

    public abstract void IAToe7bXGz4N(Throwable th);

    public abstract void e6tOsSdd2EFb(e0 e0Var);
}
