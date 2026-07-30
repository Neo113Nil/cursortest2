package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ice.fishing.grenza.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x1 extends bEKsvqmvPh2y implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final s1 Companion = new s1();
    public static final b81 xbgXKYA2cIfu;
    public final op0 BRwzKIf41E4i;
    public t1 BjEWd04qc7Mw;
    public twy4zb2fCtqq EcgxDIVH5in8;
    public final a81 EpkonXwzFgDB;
    public final s82 IAToe7bXGz4N;
    public final a81 J54yh1s3n4Aq;
    public final a81 POWyO8hTM6YC;
    public e32 Pf0ThKz3j5YS;
    public long QrzZRwfaDlRX;
    public int RfyTYNmI9Srp;
    public final c81 S2OOm9zPNm0h;
    public twy4zb2fCtqq S9EYkSpbGuxq;
    public boolean VhhvGxCb8gfr;
    public int XL4ISE6Oc65B;
    public final c81 ZbWwgt3aGe7A;
    public final ma aF05bpZJlKEP;
    public final c81 amuv7NJvPxHu;
    public final r1 dgRBjINgWbAK;
    public int e6tOsSdd2EFb;
    public boolean gGoUzNp9JO5I;
    public List gPXPFXrUH4XX;
    public final BRwzKIf41E4i i68hK7ahKtgp;
    public Integer jyegZNwi31qc;
    public final eg kpCQ9veP6n3I;
    public final String nLZGh9p8gVSu;
    public c81 ozEBbv0hFTAB;
    public final s82 pnx5pC0XzaCw;
    public final AccessibilityManager r3s1LDPKFs1S;
    public boolean rZjpSjn4zoMv;
    public final m9 ryVscX7ZL4Ux;
    public final d81 tmVwIGCQF4zR;
    public final w1 wLFCmsViZrNT;
    public final String xfACYKDMU6Dj;
    public final ArrayList zf8DYfih6EZu;
    public int x50lh2ztY7Y5 = Integer.MIN_VALUE;
    public final w1 cpQdD2nAriOS = new w1(this, 0);

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        b81 b81Var = sq0.PxuCJdSBwIXG;
        b81 b81Var2 = new b81(32);
        int i = b81Var2.lS5Rgt96tfkO;
        if (i < 0) {
            throw new IndexOutOfBoundsException("");
        }
        int i2 = i + 32;
        int[] iArr2 = b81Var2.PxuCJdSBwIXG;
        if (iArr2.length < i2) {
            b81Var2.PxuCJdSBwIXG = Arrays.copyOf(iArr2, Math.max(i2, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = b81Var2.PxuCJdSBwIXG;
        int i3 = b81Var2.lS5Rgt96tfkO;
        if (i != i3) {
            na.PsecLrZVVK61(iArr3, iArr3, i2, i, i3);
        }
        na.rxipThha848g(iArr, iArr3, i, 0, 12);
        b81Var2.lS5Rgt96tfkO += 32;
        xbgXKYA2cIfu = b81Var2;
    }

    public x1(r1 r1Var) {
        this.dgRBjINgWbAK = r1Var;
        Object systemService = r1Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.r3s1LDPKFs1S = (AccessibilityManager) systemService;
        this.QrzZRwfaDlRX = 100L;
        new Handler(Looper.getMainLooper());
        this.BRwzKIf41E4i = new op0(this);
        this.XL4ISE6Oc65B = Integer.MIN_VALUE;
        this.RfyTYNmI9Srp = Integer.MIN_VALUE;
        this.S2OOm9zPNm0h = new c81();
        this.ZbWwgt3aGe7A = new c81();
        this.pnx5pC0XzaCw = new s82();
        this.IAToe7bXGz4N = new s82();
        this.e6tOsSdd2EFb = -1;
        this.aF05bpZJlKEP = new ma(0);
        int i = 1;
        this.kpCQ9veP6n3I = mm2.PxuCJdSBwIXG(1, 6, null);
        this.rZjpSjn4zoMv = true;
        c81 c81Var = uq0.PxuCJdSBwIXG;
        c81Var.getClass();
        this.ozEBbv0hFTAB = c81Var;
        this.tmVwIGCQF4zR = new d81();
        this.J54yh1s3n4Aq = new a81();
        this.EpkonXwzFgDB = new a81();
        this.xfACYKDMU6Dj = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.nLZGh9p8gVSu = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.ryVscX7ZL4Ux = new m9(20);
        this.amuv7NJvPxHu = new c81();
        this.Pf0ThKz3j5YS = new e32(r1Var.getSemanticsOwner().PxuCJdSBwIXG(), c81Var);
        int i2 = pq0.PxuCJdSBwIXG;
        this.POWyO8hTM6YC = new a81();
        r1Var.addOnAttachStateChangeListener(this);
        this.i68hK7ahKtgp = new BRwzKIf41E4i(i, this);
        this.zf8DYfih6EZu = new ArrayList();
        this.wLFCmsViZrNT = new w1(this, i);
    }

    public static final boolean BRwzKIf41E4i(h02 h02Var) {
        ae0 ae0Var = h02Var.PxuCJdSBwIXG;
        if (((Number) ae0Var.PxuCJdSBwIXG()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) ae0Var.PxuCJdSBwIXG()).floatValue();
        ((Number) h02Var.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue();
        return false;
    }

    public static float[] BjEWd04qc7Mw(th0 th0Var) {
        if (!(th0Var instanceof yh1)) {
            return null;
        }
        mx1 mx1Var = ((yh1) th0Var).TSizfFm2Yiuu;
        long j = mx1Var.rtx2ld2ELZv4;
        long j2 = mx1Var.RAsUl2FVSrh6;
        long j3 = mx1Var.a92UlCVFR9N8;
        long j4 = mx1Var.e9gEMXR7LXtO;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static /* synthetic */ void S2OOm9zPNm0h(x1 x1Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        x1Var.VhhvGxCb8gfr(i, i2, num, null);
    }

    public static final boolean XL4ISE6Oc65B(h02 h02Var) {
        ae0 ae0Var = h02Var.PxuCJdSBwIXG;
        if (((Number) ae0Var.PxuCJdSBwIXG()).floatValue() < ((Number) h02Var.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue()) {
            return true;
        }
        ((Number) ae0Var.PxuCJdSBwIXG()).floatValue();
        return false;
    }

    public static final boolean gPXPFXrUH4XX(h02 h02Var, float f) {
        ae0 ae0Var = h02Var.PxuCJdSBwIXG;
        if (f >= 0.0f || ((Number) ae0Var.PxuCJdSBwIXG()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) ae0Var.PxuCJdSBwIXG()).floatValue() < ((Number) h02Var.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue();
        }
        return true;
    }

    public static Rect kpCQ9veP6n3I(th0 th0Var, float f, float f2) {
        if (!(th0Var instanceof xh1) && !(th0Var instanceof yh1)) {
            return null;
        }
        qt1 RfyTYNmI9Srp = th0Var.RfyTYNmI9Srp();
        return new Rect((int) (RfyTYNmI9Srp.PxuCJdSBwIXG + f), (int) (RfyTYNmI9Srp.lS5Rgt96tfkO + f2), (int) (RfyTYNmI9Srp.TSizfFm2Yiuu + f), (int) (RfyTYNmI9Srp.Y1f8riQaR6yg + f2));
    }

    public static Region ozEBbv0hFTAB(th0 th0Var, float f, float f2) {
        if (!(th0Var instanceof wh1)) {
            return null;
        }
        wh1 wh1Var = (wh1) th0Var;
        qt1 rtx2ld2ELZv4 = wh1Var.RfyTYNmI9Srp().rtx2ld2ELZv4(f, f2);
        Region region = new Region(new Rect((int) (rtx2ld2ELZv4.PxuCJdSBwIXG + 0.0f), (int) (rtx2ld2ELZv4.lS5Rgt96tfkO + 0.0f), (int) (rtx2ld2ELZv4.TSizfFm2Yiuu + 0.0f), (int) (rtx2ld2ELZv4.Y1f8riQaR6yg + 0.0f)));
        Region region2 = new Region();
        yj1 yj1Var = wh1Var.TSizfFm2Yiuu;
        if (!(yj1Var instanceof r4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((r4) yj1Var).PxuCJdSBwIXG;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence tmVwIGCQF4zR(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String x50lh2ztY7Y5(d32 d32Var) {
        v8 v8Var;
        if (d32Var != null) {
            z22 z22Var = d32Var.Y1f8riQaR6yg;
            v81 v81Var = z22Var.rtx2ld2ELZv4;
            k32 k32Var = h32.PxuCJdSBwIXG;
            if (v81Var.TSizfFm2Yiuu(k32Var)) {
                return c21.PxuCJdSBwIXG((List) z22Var.TSizfFm2Yiuu(k32Var), ",", null, 62);
            }
            k32 k32Var2 = h32.ozEBbv0hFTAB;
            if (v81Var.TSizfFm2Yiuu(k32Var2)) {
                Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(k32Var2);
                if (RAsUl2FVSrh6 == null) {
                    RAsUl2FVSrh6 = null;
                }
                v8 v8Var2 = (v8) RAsUl2FVSrh6;
                if (v8Var2 != null) {
                    return v8Var2.OPXfSBeufaJ8;
                }
            } else {
                Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(h32.aF05bpZJlKEP);
                if (RAsUl2FVSrh62 == null) {
                    RAsUl2FVSrh62 = null;
                }
                List list = (List) RAsUl2FVSrh62;
                if (list != null && (v8Var = (v8) zk.FT2GK7JK5Ma2(list)) != null) {
                    return v8Var.OPXfSBeufaJ8;
                }
            }
        }
        return null;
    }

    public final void EcgxDIVH5in8(d32 d32Var, e32 e32Var) {
        int[] iArr = gr0.PxuCJdSBwIXG;
        d81 d81Var = new d81();
        List wdg6QnbFHrFF = d32.wdg6QnbFHrFF(4, d32Var);
        vw0 vw0Var = d32Var.TSizfFm2Yiuu;
        int size = wdg6QnbFHrFF.size();
        for (int i = 0; i < size; i++) {
            d32 d32Var2 = (d32) wdg6QnbFHrFF.get(i);
            tq0 dgRBjINgWbAK = dgRBjINgWbAK();
            int i2 = d32Var2.a92UlCVFR9N8;
            if (dgRBjINgWbAK.PxuCJdSBwIXG(i2)) {
                if (!e32Var.lS5Rgt96tfkO.lS5Rgt96tfkO(i2)) {
                    QrzZRwfaDlRX(vw0Var);
                    return;
                }
                d81Var.PxuCJdSBwIXG(i2);
            }
        }
        d81 d81Var2 = e32Var.lS5Rgt96tfkO;
        int[] iArr2 = d81Var2.lS5Rgt96tfkO;
        long[] jArr = d81Var2.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !d81Var.lS5Rgt96tfkO(iArr2[(i3 << 3) + i5])) {
                            QrzZRwfaDlRX(vw0Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List wdg6QnbFHrFF2 = d32.wdg6QnbFHrFF(4, d32Var);
        int size2 = wdg6QnbFHrFF2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            d32 d32Var3 = (d32) wdg6QnbFHrFF2.get(i6);
            e32 e32Var2 = (e32) this.amuv7NJvPxHu.lS5Rgt96tfkO(d32Var3.a92UlCVFR9N8);
            if (e32Var2 != null && dgRBjINgWbAK().PxuCJdSBwIXG(d32Var3.a92UlCVFR9N8)) {
                EcgxDIVH5in8(d32Var3, e32Var2);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void IAToe7bXGz4N(defpackage.tq0 r57) {
        /*
            Method dump skipped, instructions count: 1651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x1.IAToe7bXGz4N(tq0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J54yh1s3n4Aq() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        d81 d81Var = new d81();
        d81 d81Var2 = this.tmVwIGCQF4zR;
        int[] iArr = d81Var2.lS5Rgt96tfkO;
        long[] jArr3 = d81Var2.PxuCJdSBwIXG;
        int length = jArr3.length - 2;
        c81 c81Var = this.amuv7NJvPxHu;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            f32 f32Var = (f32) dgRBjINgWbAK().lS5Rgt96tfkO(i8);
                            d32 d32Var = f32Var != null ? f32Var.PxuCJdSBwIXG : null;
                            if (d32Var != null) {
                                if (d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.TSizfFm2Yiuu(h32.Y1f8riQaR6yg)) {
                                }
                            }
                            d81Var.PxuCJdSBwIXG(i8);
                            e32 e32Var = (e32) c81Var.lS5Rgt96tfkO(i8);
                            if (e32Var != null) {
                                Object RAsUl2FVSrh6 = e32Var.PxuCJdSBwIXG.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.Y1f8riQaR6yg);
                                r23 = RAsUl2FVSrh6 != 0 ? RAsUl2FVSrh6 : null;
                            }
                            ZbWwgt3aGe7A(i8, 32, r23);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = d81Var.lS5Rgt96tfkO;
        long[] jArr4 = d81Var.PxuCJdSBwIXG;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = d81Var2.TSizfFm2Yiuu;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = d81Var2.PxuCJdSBwIXG;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (d81Var2.lS5Rgt96tfkO[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                d81Var2.a92UlCVFR9N8(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        c81Var.TSizfFm2Yiuu();
        tq0 dgRBjINgWbAK = dgRBjINgWbAK();
        int[] iArr3 = dgRBjINgWbAK.lS5Rgt96tfkO;
        Object[] objArr = dgRBjINgWbAK.TSizfFm2Yiuu;
        long[] jArr6 = dgRBjINgWbAK.PxuCJdSBwIXG;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            d32 d32Var2 = ((f32) objArr[i26]).PxuCJdSBwIXG;
                            z22 z22Var = d32Var2.Y1f8riQaR6yg;
                            k32 k32Var = h32.Y1f8riQaR6yg;
                            if (z22Var.rtx2ld2ELZv4.TSizfFm2Yiuu(k32Var) && d81Var2.PxuCJdSBwIXG(i27)) {
                                ZbWwgt3aGe7A(i27, 16, (String) d32Var2.Y1f8riQaR6yg.TSizfFm2Yiuu(k32Var));
                            }
                            c81Var.rtx2ld2ELZv4(i27, new e32(d32Var2, dgRBjINgWbAK()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.Pf0ThKz3j5YS = new e32(this.dgRBjINgWbAK.getSemanticsOwner().PxuCJdSBwIXG(), dgRBjINgWbAK());
    }

    public final int OPXfSBeufaJ8(d32 d32Var) {
        z22 z22Var = d32Var.Y1f8riQaR6yg;
        if (!z22Var.rtx2ld2ELZv4.TSizfFm2Yiuu(h32.PxuCJdSBwIXG)) {
            k32 k32Var = h32.tmVwIGCQF4zR;
            if (z22Var.rtx2ld2ELZv4.TSizfFm2Yiuu(k32Var)) {
                return (int) (((vi2) z22Var.TSizfFm2Yiuu(k32Var)).PxuCJdSBwIXG & 4294967295L);
            }
        }
        return this.e6tOsSdd2EFb;
    }

    @Override // defpackage.bEKsvqmvPh2y
    public final op0 PxuCJdSBwIXG(View view) {
        return this.BRwzKIf41E4i;
    }

    public final void QrzZRwfaDlRX(vw0 vw0Var) {
        if (this.aF05bpZJlKEP.add(vw0Var)) {
            this.kpCQ9veP6n3I.Y1f8riQaR6yg(no2.PxuCJdSBwIXG);
        }
    }

    public final AccessibilityEvent RAsUl2FVSrh6(int i, int i2) {
        f32 f32Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        r1 r1Var = this.dgRBjINgWbAK;
        obtain.setPackageName(r1Var.getContext().getPackageName());
        obtain.setSource(r1Var, i);
        if (r3s1LDPKFs1S() && (f32Var = (f32) dgRBjINgWbAK().lS5Rgt96tfkO(i)) != null) {
            d32 d32Var = f32Var.PxuCJdSBwIXG;
            obtain.setPassword(d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.TSizfFm2Yiuu(h32.nLZGh9p8gVSu));
            Object RAsUl2FVSrh6 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.QrzZRwfaDlRX);
            if (RAsUl2FVSrh6 == null) {
                RAsUl2FVSrh6 = null;
            }
            boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(RAsUl2FVSrh6, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                ngxnMNrpiKat.a92UlCVFR9N8(obtain, wdg6QnbFHrFF);
            }
        }
        return obtain;
    }

    public final int RfyTYNmI9Srp(int i) {
        if (i == this.dgRBjINgWbAK.getSemanticsOwner().PxuCJdSBwIXG().a92UlCVFR9N8) {
            return -1;
        }
        return i;
    }

    public final boolean S9EYkSpbGuxq(AccessibilityEvent accessibilityEvent) {
        if (!r3s1LDPKFs1S()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.VhhvGxCb8gfr = true;
        }
        try {
            return ((Boolean) this.cpQdD2nAriOS.OPXfSBeufaJ8(accessibilityEvent)).booleanValue();
        } finally {
            this.VhhvGxCb8gfr = false;
        }
    }

    public final Rect TSizfFm2Yiuu(f32 f32Var) {
        dr0 dr0Var = f32Var.lS5Rgt96tfkO;
        return rZjpSjn4zoMv(dr0Var.PxuCJdSBwIXG, dr0Var.lS5Rgt96tfkO, dr0Var.TSizfFm2Yiuu, dr0Var.Y1f8riQaR6yg);
    }

    public final boolean VhhvGxCb8gfr(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !r3s1LDPKFs1S()) {
            return false;
        }
        AccessibilityEvent RAsUl2FVSrh6 = RAsUl2FVSrh6(i, i2);
        if (num != null) {
            RAsUl2FVSrh6.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            RAsUl2FVSrh6.setContentDescription(c21.PxuCJdSBwIXG(list, ",", null, 62));
        }
        return S9EYkSpbGuxq(RAsUl2FVSrh6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        if (defpackage.f2.gPXPFXrUH4XX(r4, r2) == r7) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:54:0x0046, B:56:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f7 -> B:14:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y1f8riQaR6yg(ct ctVar) {
        u1 u1Var;
        int i;
        ma maVar;
        ma maVar2;
        d81 d81Var;
        bg bgVar;
        d81 d81Var2;
        bg bgVar2;
        int i2;
        long j;
        Object lS5Rgt96tfkO;
        try {
            if (ctVar instanceof u1) {
                u1Var = (u1) ctVar;
                int i3 = u1Var.QrzZRwfaDlRX;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    u1Var.QrzZRwfaDlRX = i3 - Integer.MIN_VALUE;
                    Object obj = u1Var.cpQdD2nAriOS;
                    i = u1Var.QrzZRwfaDlRX;
                    maVar = this.aF05bpZJlKEP;
                    su suVar = su.rtx2ld2ELZv4;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        d81Var = new d81();
                        eg egVar = this.kpCQ9veP6n3I;
                        egVar.getClass();
                        bgVar = new bg(egVar);
                        u1Var.dgRBjINgWbAK = d81Var;
                        u1Var.x50lh2ztY7Y5 = bgVar;
                        u1Var.QrzZRwfaDlRX = 1;
                        lS5Rgt96tfkO = bgVar.lS5Rgt96tfkO(u1Var);
                        if (lS5Rgt96tfkO != suVar) {
                        }
                    } else if (i == 1) {
                        bgVar2 = u1Var.x50lh2ztY7Y5;
                        d81Var2 = u1Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bgVar2 = u1Var.x50lh2ztY7Y5;
                        d81Var2 = u1Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj);
                        char c = 2;
                        maVar2 = maVar;
                        d81Var = d81Var2;
                        maVar = maVar2;
                        bgVar = bgVar2;
                        u1Var.dgRBjINgWbAK = d81Var;
                        u1Var.x50lh2ztY7Y5 = bgVar;
                        u1Var.QrzZRwfaDlRX = 1;
                        lS5Rgt96tfkO = bgVar.lS5Rgt96tfkO(u1Var);
                        if (lS5Rgt96tfkO != suVar) {
                            return suVar;
                        }
                        bg bgVar3 = bgVar;
                        d81Var2 = d81Var;
                        obj = lS5Rgt96tfkO;
                        bgVar2 = bgVar3;
                        if (((Boolean) obj).booleanValue()) {
                            maVar.clear();
                            return no2.PxuCJdSBwIXG;
                        }
                        bgVar2.TSizfFm2Yiuu();
                        if (r3s1LDPKFs1S()) {
                            int i4 = maVar.wdg6QnbFHrFF;
                            for (int i5 = 0; i5 < i4; i5++) {
                                vw0 vw0Var = (vw0) maVar.OPXfSBeufaJ8[i5];
                                e6tOsSdd2EFb(vw0Var, d81Var2);
                                jyegZNwi31qc(vw0Var);
                            }
                            d81Var2.Y1f8riQaR6yg = 0;
                            long[] jArr = d81Var2.PxuCJdSBwIXG;
                            if (jArr != c02.PxuCJdSBwIXG) {
                                try {
                                    na.Nlhe969cAGO8(jArr, -9187201950435737472L);
                                    long[] jArr2 = d81Var2.PxuCJdSBwIXG;
                                    i2 = d81Var2.TSizfFm2Yiuu;
                                    int i6 = i2 >> 3;
                                    jArr2[i6] = ((~j) & jArr2[i6]) | j;
                                } catch (Throwable th) {
                                    th = th;
                                    maVar2.clear();
                                    throw th;
                                }
                                j = 255 << ((i2 & 7) << 3);
                                maVar2 = maVar;
                            } else {
                                maVar2 = maVar;
                            }
                            d81Var2.e9gEMXR7LXtO = c02.PxuCJdSBwIXG(d81Var2.TSizfFm2Yiuu) - d81Var2.Y1f8riQaR6yg;
                            Handler handler = this.dgRBjINgWbAK.getHandler();
                            if (!this.gGoUzNp9JO5I && handler != null) {
                                this.gGoUzNp9JO5I = true;
                                handler.post(this.i68hK7ahKtgp);
                            }
                        } else {
                            maVar2 = maVar;
                        }
                        maVar2.clear();
                        this.S2OOm9zPNm0h.TSizfFm2Yiuu();
                        this.ZbWwgt3aGe7A.TSizfFm2Yiuu();
                        long j2 = this.QrzZRwfaDlRX;
                        u1Var.dgRBjINgWbAK = d81Var2;
                        u1Var.x50lh2ztY7Y5 = bgVar2;
                        c = 2;
                        u1Var.QrzZRwfaDlRX = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
            maVar2 = maVar;
        }
        u1Var = new u1(this, ctVar);
        Object obj2 = u1Var.cpQdD2nAriOS;
        i = u1Var.QrzZRwfaDlRX;
        maVar = this.aF05bpZJlKEP;
        su suVar2 = su.rtx2ld2ELZv4;
    }

    public final void ZbWwgt3aGe7A(int i, int i2, String str) {
        AccessibilityEvent RAsUl2FVSrh6 = RAsUl2FVSrh6(RfyTYNmI9Srp(i), 32);
        RAsUl2FVSrh6.setContentChangeTypes(i2);
        if (str != null) {
            RAsUl2FVSrh6.getText().add(str);
        }
        S9EYkSpbGuxq(RAsUl2FVSrh6);
    }

    public final void a92UlCVFR9N8() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (r3s1LDPKFs1S()) {
                EcgxDIVH5in8(this.dgRBjINgWbAK.getSemanticsOwner().PxuCJdSBwIXG(), this.Pf0ThKz3j5YS);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                IAToe7bXGz4N(dgRBjINgWbAK());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    J54yh1s3n4Aq();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final boolean aF05bpZJlKEP(d32 d32Var, int i, int i2, boolean z) {
        String x50lh2ztY7Y5;
        z22 z22Var = d32Var.Y1f8riQaR6yg;
        int i3 = d32Var.a92UlCVFR9N8;
        k32 k32Var = y22.wdg6QnbFHrFF;
        if (z22Var.rtx2ld2ELZv4.TSizfFm2Yiuu(k32Var) && mm2.gPXPFXrUH4XX(d32Var)) {
            qe0 qe0Var = (qe0) ((nxJAScVArhE9) d32Var.Y1f8riQaR6yg.TSizfFm2Yiuu(k32Var)).lS5Rgt96tfkO;
            if (qe0Var != null) {
                return ((Boolean) qe0Var.a92UlCVFR9N8(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.e6tOsSdd2EFb) && (x50lh2ztY7Y5 = x50lh2ztY7Y5(d32Var)) != null) {
            if (i < 0 || i != i2 || i2 > x50lh2ztY7Y5.length()) {
                i = -1;
            }
            this.e6tOsSdd2EFb = i;
            boolean z2 = x50lh2ztY7Y5.length() > 0;
            S9EYkSpbGuxq(rtx2ld2ELZv4(RfyTYNmI9Srp(i3), z2 ? Integer.valueOf(this.e6tOsSdd2EFb) : null, z2 ? Integer.valueOf(this.e6tOsSdd2EFb) : null, z2 ? Integer.valueOf(x50lh2ztY7Y5.length()) : null, x50lh2ztY7Y5));
            pnx5pC0XzaCw(i3);
            return true;
        }
        return false;
    }

    public final qt1 cpQdD2nAriOS(d32 d32Var, Rect rect, z42 z42Var) {
        v1 v1Var = new v1(z42Var);
        vw0 vw0Var = d32Var.TSizfFm2Yiuu;
        m61 m61Var = vw0Var.nLZGh9p8gVSu.a92UlCVFR9N8;
        tx txVar = null;
        if ((m61Var.dgRBjINgWbAK & 8) != 0) {
            loop0: while (true) {
                if (m61Var == null) {
                    break;
                }
                if ((m61Var.wdg6QnbFHrFF & 8) != 0) {
                    m61 m61Var2 = m61Var;
                    f91 f91Var = null;
                    while (m61Var2 != null) {
                        if (m61Var2 instanceof b32) {
                            ((b32) m61Var2).D0aTLcX6Uhyo(v1Var);
                            if (v1Var.rtx2ld2ELZv4) {
                                txVar = m61Var2;
                                break loop0;
                            }
                        } else if ((m61Var2.wdg6QnbFHrFF & 8) != 0 && (m61Var2 instanceof ux)) {
                            int i = 0;
                            for (m61 m61Var3 = ((ux) m61Var2).S2OOm9zPNm0h; m61Var3 != null; m61Var3 = m61Var3.cpQdD2nAriOS) {
                                if ((m61Var3.wdg6QnbFHrFF & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        m61Var2 = m61Var3;
                                    } else {
                                        if (f91Var == null) {
                                            f91Var = new f91(new m61[16]);
                                        }
                                        if (m61Var2 != null) {
                                            f91Var.lS5Rgt96tfkO(m61Var2);
                                            m61Var2 = null;
                                        }
                                        f91Var.lS5Rgt96tfkO(m61Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        m61Var2 = zv.dgRBjINgWbAK(f91Var);
                    }
                }
                if ((m61Var.dgRBjINgWbAK & 8) == 0) {
                    break;
                }
                m61Var = m61Var.cpQdD2nAriOS;
            }
        }
        tx txVar2 = (b32) txVar;
        if (txVar2 == null || !((m61) txVar2).rtx2ld2ELZv4.S9EYkSpbGuxq) {
            return kj0.wdg6QnbFHrFF(vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg, false);
        }
        pd1 i68hK7ahKtgp = zv.i68hK7ahKtgp(txVar2);
        qt1 nLZGh9p8gVSu = kj0.ZbWwgt3aGe7A(i68hK7ahKtgp).nLZGh9p8gVSu(i68hK7ahKtgp, false);
        Rect rZjpSjn4zoMv = rZjpSjn4zoMv(nLZGh9p8gVSu.PxuCJdSBwIXG, nLZGh9p8gVSu.lS5Rgt96tfkO, nLZGh9p8gVSu.TSizfFm2Yiuu, nLZGh9p8gVSu.Y1f8riQaR6yg);
        float f = rZjpSjn4zoMv.left - rect.left;
        float f2 = rZjpSjn4zoMv.top - rect.top;
        return new qt1(f, f2, rZjpSjn4zoMv.width() + f, rZjpSjn4zoMv.height() + f2);
    }

    public final tq0 dgRBjINgWbAK() {
        if (this.rZjpSjn4zoMv) {
            this.rZjpSjn4zoMv = false;
            r1 r1Var = this.dgRBjINgWbAK;
            this.ozEBbv0hFTAB = bs0.RfyTYNmI9Srp(r1Var.getSemanticsOwner(), k1.dgRBjINgWbAK);
            if (r3s1LDPKFs1S()) {
                c81 c81Var = this.ozEBbv0hFTAB;
                Resources resources = r1Var.getContext().getResources();
                a81 a81Var = this.J54yh1s3n4Aq;
                a81Var.PxuCJdSBwIXG();
                a81 a81Var2 = this.EpkonXwzFgDB;
                a81Var2.PxuCJdSBwIXG();
                f32 f32Var = (f32) c81Var.lS5Rgt96tfkO(-1);
                d32 d32Var = f32Var != null ? f32Var.PxuCJdSBwIXG : null;
                d32Var.getClass();
                ArrayList lS5Rgt96tfkO = o32.lS5Rgt96tfkO(d32Var, new y(3, c81Var), new y(4, resources), fx1.jJwa0q7P5wHq(d32Var));
                int i = 1;
                int size = lS5Rgt96tfkO.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((d32) lS5Rgt96tfkO.get(i - 1)).a92UlCVFR9N8;
                        int i3 = ((d32) lS5Rgt96tfkO.get(i)).a92UlCVFR9N8;
                        a81Var.a92UlCVFR9N8(i2, i3);
                        a81Var2.a92UlCVFR9N8(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.ozEBbv0hFTAB;
    }

    public final void e6tOsSdd2EFb(vw0 vw0Var, d81 d81Var) {
        z22 S2OOm9zPNm0h;
        if (vw0Var.J54yh1s3n4Aq() && !this.dgRBjINgWbAK.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(vw0Var)) {
            vw0 vw0Var2 = null;
            if (!vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg(8)) {
                vw0Var = vw0Var.S9EYkSpbGuxq();
                while (true) {
                    if (vw0Var == null) {
                        vw0Var = null;
                        break;
                    } else if (vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg(8)) {
                        break;
                    } else {
                        vw0Var = vw0Var.S9EYkSpbGuxq();
                    }
                }
            }
            if (vw0Var == null || (S2OOm9zPNm0h = vw0Var.S2OOm9zPNm0h()) == null) {
                return;
            }
            if (!S2OOm9zPNm0h.wdg6QnbFHrFF) {
                vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
                while (true) {
                    if (S9EYkSpbGuxq != null) {
                        z22 S2OOm9zPNm0h2 = S9EYkSpbGuxq.S2OOm9zPNm0h();
                        if (S2OOm9zPNm0h2 != null && S2OOm9zPNm0h2.wdg6QnbFHrFF) {
                            vw0Var2 = S9EYkSpbGuxq;
                            break;
                        }
                        S9EYkSpbGuxq = S9EYkSpbGuxq.S9EYkSpbGuxq();
                    } else {
                        break;
                    }
                }
                if (vw0Var2 != null) {
                    vw0Var = vw0Var2;
                }
            }
            int i = vw0Var.OPXfSBeufaJ8;
            if (d81Var.PxuCJdSBwIXG(i)) {
                S2OOm9zPNm0h(this, RfyTYNmI9Srp(i), 2048, 1, 8);
            }
        }
    }

    public final boolean e9gEMXR7LXtO(boolean z, int i, long j) {
        k32 k32Var;
        int i2;
        if (cs0.wdg6QnbFHrFF(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            tq0 dgRBjINgWbAK = dgRBjINgWbAK();
            bf1.Companion.getClass();
            if (!bf1.lS5Rgt96tfkO(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    k32Var = h32.S2OOm9zPNm0h;
                } else {
                    if (z) {
                        u9.gPXPFXrUH4XX();
                        return false;
                    }
                    k32Var = h32.VhhvGxCb8gfr;
                }
                Object[] objArr = dgRBjINgWbAK.TSizfFm2Yiuu;
                long[] jArr = dgRBjINgWbAK.PxuCJdSBwIXG;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    f32 f32Var = (f32) objArr[(i3 << 3) + i6];
                                    dr0 dr0Var = f32Var.lS5Rgt96tfkO;
                                    float f = dr0Var.PxuCJdSBwIXG;
                                    i2 = i4;
                                    float f2 = dr0Var.lS5Rgt96tfkO;
                                    float f3 = dr0Var.TSizfFm2Yiuu;
                                    float f4 = dr0Var.Y1f8riQaR6yg;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((intBitsToFloat2 < f4) & (intBitsToFloat >= f) & (intBitsToFloat < f3) & (intBitsToFloat2 >= f2)) {
                                        Object RAsUl2FVSrh6 = f32Var.PxuCJdSBwIXG.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(k32Var);
                                        if (RAsUl2FVSrh6 == null) {
                                            RAsUl2FVSrh6 = null;
                                        }
                                        h02 h02Var = (h02) RAsUl2FVSrh6;
                                        if (h02Var != null) {
                                            ae0 ae0Var = h02Var.PxuCJdSBwIXG;
                                            if (i < 0) {
                                                if (((Number) ae0Var.PxuCJdSBwIXG()).floatValue() <= 0.0f) {
                                                }
                                                z2 = true;
                                            } else {
                                                if (((Number) ae0Var.PxuCJdSBwIXG()).floatValue() >= ((Number) h02Var.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue()) {
                                                }
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void jyegZNwi31qc(vw0 vw0Var) {
        if (vw0Var.J54yh1s3n4Aq() && !this.dgRBjINgWbAK.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(vw0Var)) {
            int i = vw0Var.OPXfSBeufaJ8;
            h02 h02Var = (h02) this.S2OOm9zPNm0h.lS5Rgt96tfkO(i);
            h02 h02Var2 = (h02) this.ZbWwgt3aGe7A.lS5Rgt96tfkO(i);
            if (h02Var == null && h02Var2 == null) {
                return;
            }
            AccessibilityEvent RAsUl2FVSrh6 = RAsUl2FVSrh6(i, 4096);
            if (h02Var != null) {
                RAsUl2FVSrh6.setScrollX((int) ((Number) h02Var.PxuCJdSBwIXG.PxuCJdSBwIXG()).floatValue());
                RAsUl2FVSrh6.setMaxScrollX((int) ((Number) h02Var.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue());
            }
            if (h02Var2 != null) {
                RAsUl2FVSrh6.setScrollY((int) ((Number) h02Var2.PxuCJdSBwIXG.PxuCJdSBwIXG()).floatValue());
                RAsUl2FVSrh6.setMaxScrollY((int) ((Number) h02Var2.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue());
            }
            S9EYkSpbGuxq(RAsUl2FVSrh6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lS5Rgt96tfkO(int i, twy4zb2fCtqq twy4zb2fctqq, String str, Bundle bundle) {
        d32 d32Var;
        long j;
        qt1 OPXfSBeufaJ8;
        qt1 RAsUl2FVSrh6;
        int i2;
        int i3;
        r1 r1Var;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = twy4zb2fctqq.PxuCJdSBwIXG;
        f32 f32Var = (f32) dgRBjINgWbAK().lS5Rgt96tfkO(i);
        if (f32Var == null || (d32Var = f32Var.PxuCJdSBwIXG) == null) {
            return;
        }
        vw0 vw0Var = d32Var.TSizfFm2Yiuu;
        z22 z22Var = d32Var.Y1f8riQaR6yg;
        v81 v81Var = z22Var.rtx2ld2ELZv4;
        String x50lh2ztY7Y5 = x50lh2ztY7Y5(d32Var);
        if (cs0.wdg6QnbFHrFF(str, this.xfACYKDMU6Dj)) {
            int Y1f8riQaR6yg = this.J54yh1s3n4Aq.Y1f8riQaR6yg(i);
            if (Y1f8riQaR6yg != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, Y1f8riQaR6yg);
                return;
            }
            return;
        }
        if (cs0.wdg6QnbFHrFF(str, this.nLZGh9p8gVSu)) {
            int Y1f8riQaR6yg2 = this.EpkonXwzFgDB.Y1f8riQaR6yg(i);
            if (Y1f8riQaR6yg2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, Y1f8riQaR6yg2);
                return;
            }
            return;
        }
        boolean TSizfFm2Yiuu = v81Var.TSizfFm2Yiuu(y22.PxuCJdSBwIXG);
        r1 r1Var2 = this.dgRBjINgWbAK;
        pd1 pd1Var = null;
        if (TSizfFm2Yiuu && bundle != null && cs0.wdg6QnbFHrFF(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (x50lh2ztY7Y5 != null ? x50lh2ztY7Y5.length() : Integer.MAX_VALUE)) {
                    ji2 e6tOsSdd2EFb = ni0.e6tOsSdd2EFb(z22Var);
                    if (e6tOsSdd2EFb == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        if (i7 >= e6tOsSdd2EFb.PxuCJdSBwIXG.PxuCJdSBwIXG.OPXfSBeufaJ8.length()) {
                            arrayList.add(pd1Var);
                            i2 = i4;
                            i3 = i5;
                            r1Var = r1Var2;
                        } else {
                            qt1 lS5Rgt96tfkO = e6tOsSdd2EFb.lS5Rgt96tfkO(i7);
                            pd1 Y1f8riQaR6yg3 = d32Var.Y1f8riQaR6yg();
                            if (Y1f8riQaR6yg3 != null) {
                                if (!Y1f8riQaR6yg3.kRWHK87H9qm4().S9EYkSpbGuxq) {
                                    Y1f8riQaR6yg3 = pd1Var;
                                }
                                if (Y1f8riQaR6yg3 != null) {
                                    j = kj0.J54yh1s3n4Aq(Y1f8riQaR6yg3);
                                    OPXfSBeufaJ8 = lS5Rgt96tfkO.OPXfSBeufaJ8(j);
                                    RAsUl2FVSrh6 = d32Var.RAsUl2FVSrh6();
                                    if ((!OPXfSBeufaJ8.RAsUl2FVSrh6(RAsUl2FVSrh6) ? OPXfSBeufaJ8.e9gEMXR7LXtO(RAsUl2FVSrh6) : pd1Var) == 0) {
                                        long VhhvGxCb8gfr = r1Var2.VhhvGxCb8gfr((Float.floatToRawIntBits(r8.lS5Rgt96tfkO) & 4294967295L) | (Float.floatToRawIntBits(r8.PxuCJdSBwIXG) << 32));
                                        r1Var = r1Var2;
                                        long VhhvGxCb8gfr2 = r1Var.VhhvGxCb8gfr((Float.floatToRawIntBits(r8.Y1f8riQaR6yg) & 4294967295L) | (Float.floatToRawIntBits(r8.TSizfFm2Yiuu) << 32));
                                        int i8 = (int) (VhhvGxCb8gfr >> 32);
                                        i2 = i4;
                                        i3 = i5;
                                        int i9 = (int) (VhhvGxCb8gfr2 >> 32);
                                        int i10 = (int) (VhhvGxCb8gfr & 4294967295L);
                                        int i11 = (int) (VhhvGxCb8gfr2 & 4294967295L);
                                        rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                                    } else {
                                        i2 = i4;
                                        i3 = i5;
                                        r1Var = r1Var2;
                                        rectF = null;
                                    }
                                    arrayList.add(rectF);
                                }
                            }
                            bf1.Companion.getClass();
                            j = 0;
                            OPXfSBeufaJ8 = lS5Rgt96tfkO.OPXfSBeufaJ8(j);
                            RAsUl2FVSrh6 = d32Var.RAsUl2FVSrh6();
                            if (!OPXfSBeufaJ8.RAsUl2FVSrh6(RAsUl2FVSrh6)) {
                            }
                            if ((!OPXfSBeufaJ8.RAsUl2FVSrh6(RAsUl2FVSrh6) ? OPXfSBeufaJ8.e9gEMXR7LXtO(RAsUl2FVSrh6) : pd1Var) == 0) {
                            }
                            arrayList.add(rectF);
                        }
                        i6++;
                        i5 = i3;
                        r1Var2 = r1Var;
                        i4 = i2;
                        pd1Var = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        k32 k32Var = h32.e6tOsSdd2EFb;
        if (v81Var.TSizfFm2Yiuu(k32Var) && bundle != null && cs0.wdg6QnbFHrFF(str, "androidx.compose.ui.semantics.testTag")) {
            Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(k32Var);
            String str2 = (String) (RAsUl2FVSrh62 == null ? null : RAsUl2FVSrh62);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (cs0.wdg6QnbFHrFF(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, d32Var.a92UlCVFR9N8);
            return;
        }
        if (cs0.wdg6QnbFHrFF(str, "androidx.compose.ui.semantics.shapeType")) {
            Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(h32.POWyO8hTM6YC);
            z42 z42Var = (z42) (RAsUl2FVSrh63 == null ? null : RAsUl2FVSrh63);
            if (z42Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                qt1 cpQdD2nAriOS = cpQdD2nAriOS(d32Var, rect, z42Var);
                float f = cpQdD2nAriOS.lS5Rgt96tfkO;
                float f2 = cpQdD2nAriOS.PxuCJdSBwIXG;
                th0 PxuCJdSBwIXG = z42Var.PxuCJdSBwIXG(cpQdD2nAriOS.TSizfFm2Yiuu(), vw0Var.BjEWd04qc7Mw, r1Var2.getDensity());
                if (PxuCJdSBwIXG instanceof xh1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", kpCQ9veP6n3I(PxuCJdSBwIXG, f2, f));
                    return;
                } else if (PxuCJdSBwIXG instanceof yh1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", kpCQ9veP6n3I(PxuCJdSBwIXG, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", BjEWd04qc7Mw(PxuCJdSBwIXG));
                    return;
                } else if (!(PxuCJdSBwIXG instanceof wh1)) {
                    u9.gPXPFXrUH4XX();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", ozEBbv0hFTAB(PxuCJdSBwIXG, f2, f));
                    return;
                }
            }
            return;
        }
        if (cs0.wdg6QnbFHrFF(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object RAsUl2FVSrh64 = v81Var.RAsUl2FVSrh6(h32.POWyO8hTM6YC);
            z42 z42Var2 = (z42) (RAsUl2FVSrh64 == null ? null : RAsUl2FVSrh64);
            if (z42Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                qt1 cpQdD2nAriOS2 = cpQdD2nAriOS(d32Var, rect2, z42Var2);
                Rect kpCQ9veP6n3I = kpCQ9veP6n3I(z42Var2.PxuCJdSBwIXG(cpQdD2nAriOS2.TSizfFm2Yiuu(), vw0Var.BjEWd04qc7Mw, r1Var2.getDensity()), cpQdD2nAriOS2.PxuCJdSBwIXG, cpQdD2nAriOS2.lS5Rgt96tfkO);
                if (kpCQ9veP6n3I != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", kpCQ9veP6n3I);
                    return;
                }
                return;
            }
            return;
        }
        if (cs0.wdg6QnbFHrFF(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object RAsUl2FVSrh65 = v81Var.RAsUl2FVSrh6(h32.POWyO8hTM6YC);
            z42 z42Var3 = (z42) (RAsUl2FVSrh65 == null ? null : RAsUl2FVSrh65);
            if (z42Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] BjEWd04qc7Mw = BjEWd04qc7Mw(z42Var3.PxuCJdSBwIXG(cpQdD2nAriOS(d32Var, rect3, z42Var3).TSizfFm2Yiuu(), vw0Var.BjEWd04qc7Mw, r1Var2.getDensity()));
                if (BjEWd04qc7Mw != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", BjEWd04qc7Mw);
                    return;
                }
                return;
            }
            return;
        }
        if (cs0.wdg6QnbFHrFF(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object RAsUl2FVSrh66 = v81Var.RAsUl2FVSrh6(h32.POWyO8hTM6YC);
            z42 z42Var4 = (z42) (RAsUl2FVSrh66 == null ? null : RAsUl2FVSrh66);
            if (z42Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                qt1 cpQdD2nAriOS3 = cpQdD2nAriOS(d32Var, rect4, z42Var4);
                Region ozEBbv0hFTAB = ozEBbv0hFTAB(z42Var4.PxuCJdSBwIXG(cpQdD2nAriOS3.TSizfFm2Yiuu(), vw0Var.BjEWd04qc7Mw, r1Var2.getDensity()), cpQdD2nAriOS3.PxuCJdSBwIXG, cpQdD2nAriOS3.lS5Rgt96tfkO);
                if (ozEBbv0hFTAB != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", ozEBbv0hFTAB);
                }
            }
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.gPXPFXrUH4XX = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.gPXPFXrUH4XX = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.r3s1LDPKFs1S;
        if (accessibilityManager.isEnabled()) {
            this.gPXPFXrUH4XX = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.dgRBjINgWbAK.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.i68hK7ahKtgp);
        AccessibilityManager accessibilityManager = this.r3s1LDPKFs1S;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void pnx5pC0XzaCw(int i) {
        t1 t1Var = this.BjEWd04qc7Mw;
        if (t1Var != null) {
            d32 d32Var = t1Var.PxuCJdSBwIXG;
            if (i != d32Var.a92UlCVFR9N8) {
                return;
            }
            if (SystemClock.uptimeMillis() - t1Var.a92UlCVFR9N8 <= 1000) {
                AccessibilityEvent RAsUl2FVSrh6 = RAsUl2FVSrh6(RfyTYNmI9Srp(d32Var.a92UlCVFR9N8), 131072);
                RAsUl2FVSrh6.setFromIndex(t1Var.Y1f8riQaR6yg);
                RAsUl2FVSrh6.setToIndex(t1Var.e9gEMXR7LXtO);
                RAsUl2FVSrh6.setAction(t1Var.lS5Rgt96tfkO);
                RAsUl2FVSrh6.setMovementGranularity(t1Var.TSizfFm2Yiuu);
                RAsUl2FVSrh6.getText().add(x50lh2ztY7Y5(d32Var));
                S9EYkSpbGuxq(RAsUl2FVSrh6);
            }
        }
        this.BjEWd04qc7Mw = null;
    }

    public final boolean r3s1LDPKFs1S() {
        AccessibilityManager accessibilityManager = this.r3s1LDPKFs1S;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.gPXPFXrUH4XX;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.gPXPFXrUH4XX = list;
        }
        return !list.isEmpty();
    }

    public final Rect rZjpSjn4zoMv(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        r1 r1Var = this.dgRBjINgWbAK;
        long VhhvGxCb8gfr = r1Var.VhhvGxCb8gfr((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long VhhvGxCb8gfr2 = r1Var.VhhvGxCb8gfr((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (VhhvGxCb8gfr >> 32);
        int i2 = (int) (VhhvGxCb8gfr2 >> 32);
        int i3 = (int) (VhhvGxCb8gfr & 4294967295L);
        int i4 = (int) (VhhvGxCb8gfr2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    public final AccessibilityEvent rtx2ld2ELZv4(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent RAsUl2FVSrh6 = RAsUl2FVSrh6(i, 8192);
        if (num != null) {
            RAsUl2FVSrh6.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            RAsUl2FVSrh6.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            RAsUl2FVSrh6.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            RAsUl2FVSrh6.getText().add(charSequence);
        }
        return RAsUl2FVSrh6;
    }

    public final int wdg6QnbFHrFF(d32 d32Var) {
        z22 z22Var = d32Var.Y1f8riQaR6yg;
        if (!z22Var.rtx2ld2ELZv4.TSizfFm2Yiuu(h32.PxuCJdSBwIXG)) {
            k32 k32Var = h32.tmVwIGCQF4zR;
            if (z22Var.rtx2ld2ELZv4.TSizfFm2Yiuu(k32Var)) {
                return (int) (((vi2) z22Var.TSizfFm2Yiuu(k32Var)).PxuCJdSBwIXG >> 32);
            }
        }
        return this.e6tOsSdd2EFb;
    }
}
