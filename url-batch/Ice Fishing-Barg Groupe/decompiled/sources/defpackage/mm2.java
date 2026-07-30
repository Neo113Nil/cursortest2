package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import com.ice.fishing.grenza.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class mm2 {
    public static final float BjEWd04qc7Mw;
    public static final fb0 EcgxDIVH5in8;
    public static final Object EpkonXwzFgDB;
    public static final float IAToe7bXGz4N;
    public static final float J54yh1s3n4Aq;
    public static final ao2 OPXfSBeufaJ8;
    public static final char[] Pf0ThKz3j5YS;
    public static final sr0 QrzZRwfaDlRX;
    public static final ql S2OOm9zPNm0h;
    public static final ib0 S9EYkSpbGuxq;
    public static final ql VhhvGxCb8gfr;
    public static final float ZbWwgt3aGe7A;
    public static final ql aF05bpZJlKEP;
    public static final Object amuv7NJvPxHu;
    public static final ql e6tOsSdd2EFb;
    public static final /* synthetic */ int gGoUzNp9JO5I = 0;
    public static final float jyegZNwi31qc;
    public static final float kpCQ9veP6n3I;
    public static final Object nLZGh9p8gVSu;
    public static final ql ozEBbv0hFTAB;
    public static final ql pnx5pC0XzaCw;
    public static final sr0 r3s1LDPKFs1S;
    public static final b52 rZjpSjn4zoMv;
    public static final Object ryVscX7ZL4Ux;
    public static final float tmVwIGCQF4zR;
    public static final ao2 wdg6QnbFHrFF;
    public static final Object xfACYKDMU6Dj;
    public static final float[] PxuCJdSBwIXG = new float[91];
    public static final Object[] lS5Rgt96tfkO = new Object[0];
    public static final int[] TSizfFm2Yiuu = new int[0];
    public static final long[] Y1f8riQaR6yg = new long[0];
    public static final Object[] e9gEMXR7LXtO = new Object[0];
    public static final q00 a92UlCVFR9N8 = new q00();
    public static final ao2 RAsUl2FVSrh6 = new ao2(5, true);
    public static final ao2 rtx2ld2ELZv4 = new ao2(1 == true ? 1 : 0, 1 == true ? 1 : 0);
    public static final ao2 dgRBjINgWbAK = new ao2(4, 1 == true ? 1 : 0);
    public static final ao2 x50lh2ztY7Y5 = new ao2(6, 1 == true ? 1 : 0);
    public static final ao2 cpQdD2nAriOS = new ao2(7, 0 == true ? 1 : 0);
    public static final sr0 gPXPFXrUH4XX = new sr0(0 == true ? 1 : 0, 1 == true ? 1 : 0);
    public static final sr0 BRwzKIf41E4i = new sr0(1 == true ? 1 : 0, 1 == true ? 1 : 0);
    public static final KSerializer[] XL4ISE6Oc65B = new KSerializer[0];
    public static final ib0 RfyTYNmI9Srp = new ib0(13);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 3;
        OPXfSBeufaJ8 = new ao2(i, false);
        int i2 = 2;
        wdg6QnbFHrFF = new ao2(i2, 1 == true ? 1 : 0);
        r3s1LDPKFs1S = new sr0(i2, 1 == true ? 1 : 0);
        QrzZRwfaDlRX = new sr0(i, 1 == true ? 1 : 0);
        int i3 = 14;
        EcgxDIVH5in8 = new fb0(i3);
        S9EYkSpbGuxq = new ib0(i3);
        ql qlVar = ql.x50lh2ztY7Y5;
        VhhvGxCb8gfr = qlVar;
        ql qlVar2 = ql.wdg6QnbFHrFF;
        S2OOm9zPNm0h = qlVar2;
        ZbWwgt3aGe7A = 0.38f;
        pnx5pC0XzaCw = qlVar2;
        IAToe7bXGz4N = 0.38f;
        e6tOsSdd2EFb = qlVar2;
        jyegZNwi31qc = 0.12f;
        aF05bpZJlKEP = qlVar;
        kpCQ9veP6n3I = 44.0f;
        rZjpSjn4zoMv = b52.OPXfSBeufaJ8;
        BjEWd04qc7Mw = 4.0f;
        ozEBbv0hFTAB = ql.cpQdD2nAriOS;
        tmVwIGCQF4zR = 16.0f;
        J54yh1s3n4Aq = 4.0f;
        EpkonXwzFgDB = new Object();
        xfACYKDMU6Dj = new Object();
        nLZGh9p8gVSu = new Object();
        ryVscX7ZL4Ux = new Object();
        amuv7NJvPxHu = new Object();
        Pf0ThKz3j5YS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static final boolean BRwzKIf41E4i(d32 d32Var, Resources resources) {
        Object RAsUl2FVSrh62 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.PxuCJdSBwIXG);
        if (RAsUl2FVSrh62 == null) {
            RAsUl2FVSrh62 = null;
        }
        List list = (List) RAsUl2FVSrh62;
        return !bs0.ZbWwgt3aGe7A(d32Var) && (d32Var.Y1f8riQaR6yg.wdg6QnbFHrFF || (d32Var.BRwzKIf41E4i() && ((list != null ? (String) zk.FT2GK7JK5Ma2(list) : null) != null || gGoUzNp9JO5I(d32Var) != null || Pf0ThKz3j5YS(d32Var, resources) != null || amuv7NJvPxHu(d32Var))));
    }

    public static final void BjEWd04qc7Mw(r71 r71Var, gi giVar, uf ufVar, float f, w42 w42Var, if2 if2Var, l30 l30Var) {
        ArrayList arrayList = r71Var.rtx2ld2ELZv4;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xi1 xi1Var = (xi1) arrayList.get(i);
            xi1Var.PxuCJdSBwIXG.RAsUl2FVSrh6(giVar, ufVar, f, w42Var, if2Var, l30Var);
            giVar.Y1f8riQaR6yg(0.0f, xi1Var.PxuCJdSBwIXG.lS5Rgt96tfkO());
        }
    }

    public static final String D0aTLcX6Uhyo(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r4 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r0 == r1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ad EcgxDIVH5in8(on onVar, hp hpVar, int i) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        boolean z = (((i & 14) ^ 6) > 4 && ((tf0) hpVar).a92UlCVFR9N8(onVar)) || (i & 6) == 4;
        tf0 tf0Var = (tf0) hpVar;
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (!z) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu2 = new ad(onVar);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
        ad adVar = (ad) nLZGh9p8gVSu2;
        boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(adVar);
        Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
        if (!a92UlCVFR9N82) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu3 = new r3s1LDPKFs1S(5, adVar);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
        rtx2ld2ELZv4(adVar, (le0) nLZGh9p8gVSu3, tf0Var);
        return adVar;
    }

    public static final int EpkonXwzFgDB(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object pnx5pC0XzaCw2 = ni0.pnx5pC0XzaCw(view);
            view = pnx5pC0XzaCw2 instanceof View ? (View) pnx5pC0XzaCw2 : null;
        }
        return i3;
    }

    public static final byte IAToe7bXGz4N(char c) {
        if (c < '~') {
            return mj.lS5Rgt96tfkO[c];
        }
        return (byte) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c3, code lost:
    
        if (r5 == r26.length()) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01cb, code lost:
    
        if (r26.charAt(r5) != 'S') goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cd, code lost:
    
        r2 = (r14 * 1000000000) + r15;
        r14 = r9;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01db, code lost:
    
        switch(r8.ordinal()) {
            case 0: goto L130;
            case 1: goto L129;
            case 2: goto L128;
            case 3: goto L127;
            case 4: goto L126;
            case 5: goto L125;
            case 6: goto L124;
            default: goto L123;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01de, code lost:
    
        defpackage.u9.BRwzKIf41E4i(r8, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0215, code lost:
    
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e6, code lost:
    
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020f, code lost:
    
        r2 = defpackage.b51.JHNfcAUfKc4G(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ec, code lost:
    
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f2, code lost:
    
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f8, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01fe, code lost:
    
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0204, code lost:
    
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020a, code lost:
    
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0109, code lost:
    
        defpackage.u9.XL4ISE6Oc65B("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x010c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00f7, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        if (r5 >= r26.length()) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        r3 = r26.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        if ('0' > r3) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e2, code lost:
    
        if (r3 >= ':') goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        if (r5 == r26.length()) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        if (r2 == '+') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
    
        if (r2 == '-') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
    
        if (r5 == (r23 + r2)) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
    
        r20 = 4611686018427387903L;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161 A[LOOP:5: B:75:0x015f->B:76:0x0161, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019e A[LOOP:7: B:87:0x019c->B:88:0x019e, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long IXK6ba3ucyzm(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int min;
        int i7;
        int i8;
        int i9;
        int i10;
        char charAt;
        int i11;
        char charAt2;
        int i12;
        int i13;
        if (str.length() == 0) {
            u9.XL4ISE6Oc65B("The string is empty");
            return 0L;
        }
        char charAt3 = str.charAt(0);
        int i14 = 1;
        char c = '-';
        char c2 = '+';
        if (charAt3 != '+') {
            i2 = charAt3 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            u9.XL4ISE6Oc65B("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            u9.XL4ISE6Oc65B("");
            return 0L;
        }
        int i15 = i2 + 1;
        if (i15 == str.length()) {
            u9.XL4ISE6Oc65B("");
            return 0L;
        }
        int i16 = 0;
        x30 x30Var = null;
        long j2 = 0;
        long j3 = 0;
        while (i15 < str.length()) {
            char charAt4 = str.charAt(i15);
            if (charAt4 != 'T') {
                g31.Companion.getClass();
                g31 g31Var = g31.TSizfFm2Yiuu;
                int i17 = i14;
                char charAt5 = str.charAt(i15);
                if (charAt5 == c2) {
                    i3 = i15 + 1;
                } else {
                    if (charAt5 == c) {
                        i3 = i15 + 1;
                        i4 = -1;
                        while (i3 < str.length() && str.charAt(i3) == '0') {
                            i3++;
                        }
                        j = 0;
                        while (true) {
                            if (i3 >= str.length()) {
                                char charAt6 = str.charAt(i3);
                                i5 = i15;
                                if ('0' <= charAt6 && charAt6 < ':') {
                                    i12 = charAt6 - '0';
                                    i13 = i;
                                    long j4 = g31Var.PxuCJdSBwIXG;
                                    if (j <= j4 && (j != j4 || i12 <= g31Var.lS5Rgt96tfkO)) {
                                        j = (j << 3) + (j << i17) + i12;
                                        i3++;
                                        i15 = i5;
                                        g31Var = g31Var;
                                        i = i13;
                                    }
                                }
                            } else {
                                i5 = i15;
                            }
                        }
                        int i18 = i;
                        if (i3 != str.length()) {
                            if (i3 == i5 + ((charAt4 == '+' || charAt4 == '-') ? i17 : 0)) {
                            }
                            long j5 = j;
                            char charAt7 = str.charAt(i3);
                            x30 x30Var2 = x30.SECONDS;
                            if (charAt7 == '.') {
                                int i19 = i3 + 1;
                                int min2 = Math.min(i3 + 7, str.length());
                                int i20 = 0;
                                for (int i21 = i19; i21 < min2; i21++) {
                                    char charAt8 = str.charAt(i21);
                                    if ('0' <= charAt8 && charAt8 < ':') {
                                        i20 = (charAt8 - '0') + (i20 << 3) + (i20 << 1);
                                    }
                                    for (i6 = 0; i6 < 6 - (i21 - i19); i6++) {
                                        i20 = (i20 << 1) + (i20 << 3);
                                    }
                                    min = Math.min(i21 + 9, str.length());
                                    i7 = i21;
                                    i8 = 0;
                                    while (true) {
                                        if (i7 >= min) {
                                            i11 = min;
                                            charAt2 = str.charAt(i7);
                                            i9 = i7;
                                            if ('0' <= charAt2 && charAt2 < ':') {
                                                i8 = (charAt2 - '0') + (i8 << 3) + (i8 << 1);
                                                i7 = i9 + 1;
                                                min = i11;
                                            }
                                        } else {
                                            i9 = i7;
                                        }
                                    }
                                    for (i10 = 0; i10 < 9 - (i9 - i21); i10++) {
                                        i8 = (i8 << 1) + (i8 << 3);
                                    }
                                    i3 = i9;
                                    while (i3 < str.length() && '0' <= (charAt = str.charAt(i3)) && charAt < ':') {
                                        i3++;
                                    }
                                    u9.XL4ISE6Oc65B("");
                                    return 0L;
                                }
                                while (i6 < 6 - (i21 - i19)) {
                                }
                                min = Math.min(i21 + 9, str.length());
                                i7 = i21;
                                i8 = 0;
                                while (true) {
                                    if (i7 >= min) {
                                    }
                                    i8 = (charAt2 - '0') + (i8 << 3) + (i8 << 1);
                                    i7 = i9 + 1;
                                    min = i11;
                                }
                                while (i10 < 9 - (i9 - i21)) {
                                }
                                i3 = i9;
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                u9.XL4ISE6Oc65B("");
                                return 0L;
                            }
                            char charAt9 = str.charAt(i3);
                            x30 x30Var3 = x30.DAYS;
                            if (charAt9 == 'D') {
                                x30Var2 = x30Var3;
                            } else if (charAt9 == 'H') {
                                x30Var2 = x30.HOURS;
                            } else if (charAt9 == 'M') {
                                x30Var2 = x30.MINUTES;
                            } else if (charAt9 != 'S') {
                                x30Var2 = null;
                            }
                            if (x30Var2 == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (x30Var != null && x30Var.compareTo(x30Var2) <= 0) {
                                u9.XL4ISE6Oc65B("Unexpected order of duration components");
                                return 0L;
                            }
                            if (x30Var2 == x30Var3) {
                                if (i16 != 0) {
                                    u9.XL4ISE6Oc65B("");
                                    return 0L;
                                }
                                j2 = ov2.S2OOm9zPNm0h(j5, x30Var2) * i4;
                            } else {
                                if (i16 == 0) {
                                    u9.XL4ISE6Oc65B("");
                                    return 0L;
                                }
                                long XL4ISE6Oc65B2 = XL4ISE6Oc65B(j2, ov2.S2OOm9zPNm0h(j5, x30Var2) * i4);
                                if (XL4ISE6Oc65B2 == 9223372036854759646L) {
                                    u9.XL4ISE6Oc65B("");
                                    return 0L;
                                }
                                j2 = XL4ISE6Oc65B2;
                            }
                            i15 = i3 + 1;
                            x30Var = x30Var2;
                            i14 = i17;
                            i = i18;
                            c = '-';
                            c2 = '+';
                        }
                        u9.XL4ISE6Oc65B("");
                        return 0L;
                    }
                    i3 = i15;
                }
                i4 = i17;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 >= str.length()) {
                    }
                    j = (j << 3) + (j << i17) + i12;
                    i3++;
                    i15 = i5;
                    g31Var = g31Var;
                    i = i13;
                }
                int i182 = i;
                if (i3 != str.length()) {
                }
                u9.XL4ISE6Oc65B("");
                return 0L;
            }
            if (i16 != 0 || (i15 = i15 + 1) == str.length()) {
                u9.XL4ISE6Oc65B("");
                return 0L;
            }
            i16 = i14;
        }
        int i22 = i;
        long e9gEMXR7LXtO2 = u30.e9gEMXR7LXtO(jJwa0q7P5wHq(j2, x30.MILLISECONDS), jJwa0q7P5wHq(j3, x30.NANOSECONDS));
        if (i22 == 0) {
            return e9gEMXR7LXtO2;
        }
        u30.Companion.getClass();
        return e9gEMXR7LXtO2 == u30.dgRBjINgWbAK ? e9gEMXR7LXtO2 : u30.RAsUl2FVSrh6(e9gEMXR7LXtO2);
    }

    public static final void J54yh1s3n4Aq(qz1 qz1Var) {
        f01 f01Var = qz1Var.rtx2ld2ELZv4().rtx2ld2ELZv4;
        if (f01Var != f01.OPXfSBeufaJ8 && f01Var != f01.wdg6QnbFHrFF) {
            u9.cpQdD2nAriOS("Failed to enable `SavedStateHandle` for `", qz1Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", f01Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (qz1Var.TSizfFm2Yiuu().rtx2ld2ELZv4("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            iz1 iz1Var = new iz1(qz1Var.TSizfFm2Yiuu(), (pr2) qz1Var);
            qz1Var.TSizfFm2Yiuu().wdg6QnbFHrFF("androidx.lifecycle.internal.SavedStateHandlesProvider", iz1Var);
            qz1Var.rtx2ld2ELZv4().PxuCJdSBwIXG(new bn(2, iz1Var));
        }
    }

    public static String JHNfcAUfKc4G(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int i5 = i;
        while (i5 < i2) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                yf yfVar = new yf();
                yfVar.wLFCmsViZrNT(i, i5, str);
                while (i5 < i2) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt != 37 || (i4 = i5 + 2) >= i2) {
                        if (codePointAt == 43 && z) {
                            yfVar.Pf0ThKz3j5YS(32);
                            i5++;
                        }
                        yfVar.nxJAScVArhE9(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    } else {
                        int dgRBjINgWbAK2 = kv2.dgRBjINgWbAK(str.charAt(i5 + 1));
                        int dgRBjINgWbAK3 = kv2.dgRBjINgWbAK(str.charAt(i4));
                        if (dgRBjINgWbAK2 != -1 && dgRBjINgWbAK3 != -1) {
                            yfVar.Pf0ThKz3j5YS((dgRBjINgWbAK2 << 4) + dgRBjINgWbAK3);
                            i5 = Character.charCount(codePointAt) + i4;
                        }
                        yfVar.nxJAScVArhE9(codePointAt);
                        i5 += Character.charCount(codePointAt);
                    }
                }
                return yfVar.pnx5pC0XzaCw();
            }
            i5++;
        }
        return str.substring(i, i2);
    }

    public static final Object[] KUoIVIumpKat(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OPXfSBeufaJ8(Object obj, Object obj2, le0 le0Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(obj) | tf0Var.a92UlCVFR9N8(obj2);
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (!a92UlCVFR9N82) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu2 = new o00(le0Var);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
    }

    public static final jz1 POWyO8hTM6YC(pr2 pr2Var) {
        ir2 ir2Var = nr2.Companion;
        hz1 hz1Var = new hz1();
        zu EpkonXwzFgDB2 = ki0.EpkonXwzFgDB(pr2Var);
        ir2Var.getClass();
        EpkonXwzFgDB2.getClass();
        or2 RAsUl2FVSrh62 = pr2Var.RAsUl2FVSrh6();
        RAsUl2FVSrh62.getClass();
        return (jz1) new e0(RAsUl2FVSrh62, hz1Var, EpkonXwzFgDB2).wdg6QnbFHrFF(bu1.PxuCJdSBwIXG(jz1.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final String Pf0ThKz3j5YS(d32 d32Var, Resources resources) {
        z22 z22Var = d32Var.Y1f8riQaR6yg;
        z22 z22Var2 = d32Var.Y1f8riQaR6yg;
        Object RAsUl2FVSrh62 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.lS5Rgt96tfkO);
        String str = null;
        if (RAsUl2FVSrh62 == null) {
            RAsUl2FVSrh62 = null;
        }
        v81 v81Var = z22Var2.rtx2ld2ELZv4;
        Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(h32.xfACYKDMU6Dj);
        if (RAsUl2FVSrh63 == null) {
            RAsUl2FVSrh63 = null;
        }
        ek2 ek2Var = (ek2) RAsUl2FVSrh63;
        Object RAsUl2FVSrh64 = v81Var.RAsUl2FVSrh6(h32.IAToe7bXGz4N);
        if (RAsUl2FVSrh64 == null) {
            RAsUl2FVSrh64 = null;
        }
        ww1 ww1Var = (ww1) RAsUl2FVSrh64;
        if (ek2Var != null) {
            int ordinal = ek2Var.ordinal();
            if (ordinal == 0) {
                ww1.Companion.getClass();
                if (ww1Var != null && ww1Var.PxuCJdSBwIXG == 2 && RAsUl2FVSrh62 == null) {
                    RAsUl2FVSrh62 = resources.getString(R.string.state_on);
                }
            } else if (ordinal == 1) {
                ww1.Companion.getClass();
                if (ww1Var != null && ww1Var.PxuCJdSBwIXG == 2 && RAsUl2FVSrh62 == null) {
                    RAsUl2FVSrh62 = resources.getString(R.string.state_off);
                }
            } else {
                if (ordinal != 2) {
                    u9.gPXPFXrUH4XX();
                    return null;
                }
                if (RAsUl2FVSrh62 == null) {
                    RAsUl2FVSrh62 = resources.getString(R.string.indeterminate);
                }
            }
        }
        Object RAsUl2FVSrh65 = v81Var.RAsUl2FVSrh6(h32.EpkonXwzFgDB);
        if (RAsUl2FVSrh65 == null) {
            RAsUl2FVSrh65 = null;
        }
        Boolean bool = (Boolean) RAsUl2FVSrh65;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            ww1.Companion.getClass();
            if ((ww1Var == null || ww1Var.PxuCJdSBwIXG != 4) && RAsUl2FVSrh62 == null) {
                RAsUl2FVSrh62 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object RAsUl2FVSrh66 = v81Var.RAsUl2FVSrh6(h32.TSizfFm2Yiuu);
        if (RAsUl2FVSrh66 == null) {
            RAsUl2FVSrh66 = null;
        }
        xq1 xq1Var = (xq1) RAsUl2FVSrh66;
        if (xq1Var != null) {
            xq1.Companion.getClass();
            if (xq1Var != xq1.TSizfFm2Yiuu) {
                if (RAsUl2FVSrh62 == null) {
                    tk tkVar = xq1Var.lS5Rgt96tfkO;
                    float f = tkVar.lS5Rgt96tfkO;
                    float f2 = tkVar.PxuCJdSBwIXG;
                    float f3 = f - f2 == 0.0f ? 0.0f : (xq1Var.PxuCJdSBwIXG - f2) / (f - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    RAsUl2FVSrh62 = resources.getString(R.string.template_percent, Integer.valueOf(f3 == 0.0f ? 0 : f3 == 1.0f ? 100 : ng0.wdg6QnbFHrFF(Math.round(f3 * 100.0f), 1, 99)));
                }
            } else if (RAsUl2FVSrh62 == null) {
                RAsUl2FVSrh62 = resources.getString(R.string.in_progress);
            }
        }
        k32 k32Var = h32.ozEBbv0hFTAB;
        if (v81Var.TSizfFm2Yiuu(k32Var)) {
            v81 v81Var2 = new d32(d32Var.PxuCJdSBwIXG, true, d32Var.TSizfFm2Yiuu, z22Var2).dgRBjINgWbAK().rtx2ld2ELZv4;
            Object RAsUl2FVSrh67 = v81Var2.RAsUl2FVSrh6(h32.PxuCJdSBwIXG);
            if (RAsUl2FVSrh67 == null) {
                RAsUl2FVSrh67 = null;
            }
            Collection collection = (Collection) RAsUl2FVSrh67;
            if (collection == null || collection.isEmpty()) {
                Object RAsUl2FVSrh68 = v81Var2.RAsUl2FVSrh6(h32.aF05bpZJlKEP);
                if (RAsUl2FVSrh68 == null) {
                    RAsUl2FVSrh68 = null;
                }
                Collection collection2 = (Collection) RAsUl2FVSrh68;
                if (collection2 == null || collection2.isEmpty()) {
                    Object RAsUl2FVSrh69 = v81Var2.RAsUl2FVSrh6(k32Var);
                    if (RAsUl2FVSrh69 == null) {
                        RAsUl2FVSrh69 = null;
                    }
                    CharSequence charSequence = (CharSequence) RAsUl2FVSrh69;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            RAsUl2FVSrh62 = str;
        }
        return (String) RAsUl2FVSrh62;
    }

    public static eg PxuCJdSBwIXG(int i, int i2, ag agVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        ag agVar2 = ag.rtx2ld2ELZv4;
        if (i3 != 0) {
            agVar = agVar2;
        }
        if (i == -2) {
            if (agVar != agVar2) {
                return new kq(1, agVar);
            }
            ui.lS5Rgt96tfkO.getClass();
            return new eg(ti.lS5Rgt96tfkO);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? agVar == agVar2 ? new eg(i) : new kq(i, agVar) : new eg(Integer.MAX_VALUE) : agVar == agVar2 ? new eg(0) : new kq(1, agVar);
        }
        if (agVar == agVar2) {
            return new kq(1, ag.OPXfSBeufaJ8);
        }
        u9.XL4ISE6Oc65B("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long QrzZRwfaDlRX(float f, float f2, float f3, float f4, tl tlVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (tlVar.TSizfFm2Yiuu()) {
            long j = ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32;
            gl glVar = hl.Companion;
            return j;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i10 = floatToRawIntBits >>> 31;
        int i11 = (floatToRawIntBits >>> 23) & 255;
        int i12 = floatToRawIntBits & 8388607;
        int i13 = 49;
        int i14 = 0;
        if (i11 == 255) {
            i2 = i12 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i11 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i15 = i12 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i15) + 1) | (i10 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    int i16 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i17 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i17 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i18 = i17 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i18) + 1) | (i16 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f3);
                                int i19 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i20 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i14 = i20 == 0 ? 0 : 512;
                                    i13 = 31;
                                } else {
                                    int i21 = i8 - 112;
                                    if (i21 < 31) {
                                        if (i21 > 0) {
                                            i14 = i20 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i21 << 10) | i14) + 1) | (i19 << 15);
                                                long max = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (tlVar.TSizfFm2Yiuu & 63);
                                                gl glVar2 = hl.Companion;
                                                return max;
                                            }
                                            i13 = i21;
                                        } else if (i21 >= -10) {
                                            int i22 = (i20 | 8388608) >> (1 - i21);
                                            if ((i22 & 4096) != 0) {
                                                i22 += 8192;
                                            }
                                            i13 = 0;
                                            i14 = i22 >> 13;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                }
                                i9 = (i19 << 15) | (i13 << 10) | i14;
                                long max2 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (tlVar.TSizfFm2Yiuu & 63);
                                gl glVar22 = hl.Companion;
                                return max2;
                            }
                            i6 = i18;
                        } else if (i5 >= -10) {
                            int i23 = (i17 | 8388608) >> (1 - i5);
                            if ((i23 & 4096) != 0) {
                                i23 += 8192;
                            }
                            i6 = i23 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i16 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f3);
                    int i192 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i202 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i192 << 15) | (i13 << 10) | i14;
                    long max22 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (tlVar.TSizfFm2Yiuu & 63);
                    gl glVar222 = hl.Companion;
                    return max22;
                }
                i2 = i15;
            } else if (i >= -10) {
                int i24 = (i12 | 8388608) >> (1 - i);
                if ((i24 & 4096) != 0) {
                    i24 += 8192;
                }
                i2 = i24 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i10 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f2);
        int i162 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i172 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i162 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f3);
        int i1922 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2022 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i1922 << 15) | (i13 << 10) | i14;
        long max222 = ((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (tlVar.TSizfFm2Yiuu & 63);
        gl glVar2222 = hl.Companion;
        return max222;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r5 == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0137, code lost:
    
        if (r2 == r7) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RAsUl2FVSrh6(wz wzVar, hp hpVar, int i) {
        Object obj;
        wz wzVar2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(294589392);
        if ((((tf0Var.rtx2ld2ELZv4(wzVar) ? 4 : 2) | i) & 3) == 2 && tf0Var.e6tOsSdd2EFb()) {
            tf0Var.i68hK7ahKtgp();
            wzVar2 = wzVar;
        } else {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            yy1 nLZGh9p8gVSu2 = ni0.nLZGh9p8gVSu(tf0Var);
            d91 QrzZRwfaDlRX2 = sj0.QrzZRwfaDlRX(wzVar.lS5Rgt96tfkO().e9gEMXR7LXtO, tf0Var);
            List list = (List) QrzZRwfaDlRX2.getValue();
            boolean booleanValue = ((Boolean) tf0Var.wdg6QnbFHrFF(bq0.PxuCJdSBwIXG)).booleanValue();
            boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(list);
            Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
            Object obj2 = fp.lS5Rgt96tfkO;
            if (!a92UlCVFR9N82) {
                hp.Companion.getClass();
                obj = nLZGh9p8gVSu3;
            }
            d82 d82Var = new d82();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                x91 x91Var = (x91) obj3;
                if (booleanValue || x91Var.QrzZRwfaDlRX.wdg6QnbFHrFF.rtx2ld2ELZv4.compareTo(f01.dgRBjINgWbAK) >= 0) {
                    arrayList.add(obj3);
                }
            }
            d82Var.addAll(arrayList);
            tf0Var.JTxCbbCwomzt(d82Var);
            obj = d82Var;
            d82 d82Var2 = (d82) obj;
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
            x50lh2ztY7Y5(d82Var2, (List) QrzZRwfaDlRX2.getValue(), tf0Var, 0);
            d91 QrzZRwfaDlRX3 = sj0.QrzZRwfaDlRX(wzVar.lS5Rgt96tfkO().a92UlCVFR9N8, tf0Var);
            Object nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu4 == obj2) {
                nLZGh9p8gVSu4 = new d82();
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu4);
            }
            d82 d82Var3 = (d82) nLZGh9p8gVSu4;
            tf0Var.IXK6ba3ucyzm(-367418626);
            ListIterator listIterator = d82Var2.listIterator();
            while (true) {
                xj0 xj0Var = (xj0) listIterator;
                if (!xj0Var.hasNext()) {
                    break;
                }
                x91 x91Var2 = (x91) xj0Var.next();
                za1 za1Var = x91Var2.OPXfSBeufaJ8;
                za1Var.getClass();
                vz vzVar = (vz) za1Var;
                boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(wzVar) | tf0Var.rtx2ld2ELZv4(x91Var2);
                Object nLZGh9p8gVSu5 = tf0Var.nLZGh9p8gVSu();
                if (!rtx2ld2ELZv42) {
                    hp.Companion.getClass();
                    if (nLZGh9p8gVSu5 != obj2) {
                        d82 d82Var4 = d82Var3;
                        wz wzVar3 = wzVar;
                        zv.Y1f8riQaR6yg((ae0) nLZGh9p8gVSu5, vzVar.x50lh2ztY7Y5, bs0.kpCQ9veP6n3I(1129586364, new qz(x91Var2, wzVar3, nLZGh9p8gVSu2, d82Var4, vzVar), tf0Var), tf0Var, 384);
                        wzVar = wzVar3;
                        d82Var3 = d82Var4;
                    }
                }
                nLZGh9p8gVSu5 = new e6(8, wzVar, x91Var2);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu5);
                d82 d82Var42 = d82Var3;
                wz wzVar32 = wzVar;
                zv.Y1f8riQaR6yg((ae0) nLZGh9p8gVSu5, vzVar.x50lh2ztY7Y5, bs0.kpCQ9veP6n3I(1129586364, new qz(x91Var2, wzVar32, nLZGh9p8gVSu2, d82Var42, vzVar), tf0Var), tf0Var, 384);
                wzVar = wzVar32;
                d82Var3 = d82Var42;
            }
            wzVar2 = wzVar;
            d82 d82Var5 = d82Var3;
            tf0Var.gPXPFXrUH4XX(false);
            Set set = (Set) QrzZRwfaDlRX3.getValue();
            boolean a92UlCVFR9N83 = tf0Var.a92UlCVFR9N8(QrzZRwfaDlRX3) | tf0Var.rtx2ld2ELZv4(wzVar2);
            Object nLZGh9p8gVSu6 = tf0Var.nLZGh9p8gVSu();
            if (!a92UlCVFR9N83) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu6 = new rz(QrzZRwfaDlRX3, wzVar2, d82Var5, null);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu6);
            dgRBjINgWbAK(set, d82Var5, (pe0) nLZGh9p8gVSu6, tf0Var);
            gg1 gg1Var3 = mp.PxuCJdSBwIXG;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new l4(i, 5, wzVar2);
        }
    }

    public static Map RfyTYNmI9Srp(Object obj) {
        if ((obj instanceof fu0) && !(obj instanceof gu0)) {
            bEKsvqmvPh2y(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            cs0.BjEWd04qc7Mw(e, mm2.class.getName());
            throw e;
        }
    }

    public static final int S2OOm9zPNm0h(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static void S9EYkSpbGuxq(int i, Object obj) {
        if (obj == null || i68hK7ahKtgp(i, obj)) {
            return;
        }
        bEKsvqmvPh2y(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final long TSizfFm2Yiuu(int i) {
        long j = i << 32;
        gl glVar = hl.Companion;
        return j;
    }

    public static final int VhhvGxCb8gfr(int[] iArr, int i, int i2) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final long XL4ISE6Oc65B(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : ng0.dgRBjINgWbAK(j + j2);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long Y1f8riQaR6yg(long j) {
        long j2 = j << 32;
        gl glVar = hl.Companion;
        return j2;
    }

    public static final Bundle ZbWwgt3aGe7A(vi1... vi1VarArr) {
        Bundle bundle = new Bundle(vi1VarArr.length);
        for (vi1 vi1Var : vi1VarArr) {
            String str = (String) vi1Var.rtx2ld2ELZv4;
            Object obj = vi1Var.OPXfSBeufaJ8;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + "\"");
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + "\"");
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void a92UlCVFR9N8(eh2 eh2Var, on onVar, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(2080741862);
        if ((i & 6) == 0) {
            i2 = (tf0Var.rtx2ld2ELZv4(eh2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16;
        }
        int i3 = 1;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            f2.PxuCJdSBwIXG(eh2Var, onVar, tf0Var, i2 & 126);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new nm(eh2Var, onVar, i, i3);
        }
    }

    public static final o8 aF05bpZJlKEP(o8 o8Var) {
        o8 TSizfFm2Yiuu2 = o8Var.TSizfFm2Yiuu();
        int lS5Rgt96tfkO2 = TSizfFm2Yiuu2.lS5Rgt96tfkO();
        for (int i = 0; i < lS5Rgt96tfkO2; i++) {
            TSizfFm2Yiuu2.e9gEMXR7LXtO(o8Var.PxuCJdSBwIXG(i), i);
        }
        return TSizfFm2Yiuu2;
    }

    public static final boolean amuv7NJvPxHu(d32 d32Var) {
        Object RAsUl2FVSrh62 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.xfACYKDMU6Dj);
        if (RAsUl2FVSrh62 == null) {
            RAsUl2FVSrh62 = null;
        }
        ek2 ek2Var = (ek2) RAsUl2FVSrh62;
        v81 v81Var = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4;
        Object RAsUl2FVSrh63 = v81Var.RAsUl2FVSrh6(h32.IAToe7bXGz4N);
        if (RAsUl2FVSrh63 == null) {
            RAsUl2FVSrh63 = null;
        }
        ww1 ww1Var = (ww1) RAsUl2FVSrh63;
        boolean z = ek2Var != null;
        Object RAsUl2FVSrh64 = v81Var.RAsUl2FVSrh6(h32.EpkonXwzFgDB);
        if (((Boolean) (RAsUl2FVSrh64 != null ? RAsUl2FVSrh64 : null)) != null) {
            ww1.Companion.getClass();
            if (ww1Var == null || ww1Var.PxuCJdSBwIXG != 4) {
                return true;
            }
        }
        return z;
    }

    public static void bEKsvqmvPh2y(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        cs0.BjEWd04qc7Mw(classCastException, mm2.class.getName());
        throw classCastException;
    }

    public static final void cpQdD2nAriOS(n61 n61Var, gr1 gr1Var, on onVar, hp hpVar, int i) {
        int i2;
        on onVar2 = f2.a92UlCVFR9N8;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-714464401);
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.a92UlCVFR9N8(gr1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 2048 : 1024;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu2 == fp.lS5Rgt96tfkO) {
                mj1 mj1Var = new mj1(null, ih0.EcgxDIVH5in8);
                tf0Var.JTxCbbCwomzt(mj1Var);
                nLZGh9p8gVSu2 = mj1Var;
            }
            ad EcgxDIVH5in82 = EcgxDIVH5in8(onVar2, tf0Var, (i2 >> 6) & 14);
            zv.lS5Rgt96tfkO(gr1Var.PxuCJdSBwIXG(EcgxDIVH5in82), bs0.kpCQ9veP6n3I(274270255, new bd(n61Var, (d91) nLZGh9p8gVSu2, onVar, EcgxDIVH5in82), tf0Var), tf0Var, 56);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new q5(n61Var, gr1Var, onVar, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void dgRBjINgWbAK(Object obj, Object obj2, pe0 pe0Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        hu huVar = ((tf0) hpVar).i68hK7ahKtgp;
        tf0 tf0Var = (tf0) hpVar;
        boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(obj) | tf0Var.a92UlCVFR9N8(obj2);
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (!a92UlCVFR9N82) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu2 = new vv0(huVar, pe0Var);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
    }

    public static final d91 e6tOsSdd2EFb(e81 e81Var, hp hpVar, int i) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (nLZGh9p8gVSu2 == jx1Var) {
            nLZGh9p8gVSu2 = sj0.tmVwIGCQF4zR(Boolean.FALSE);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
        }
        d91 d91Var = (d91) nLZGh9p8gVSu2;
        boolean z = (((i & 14) ^ 6) > 4 && tf0Var.a92UlCVFR9N8(e81Var)) || (i & 6) == 4;
        Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
        if (z || nLZGh9p8gVSu3 == jx1Var) {
            nLZGh9p8gVSu3 = new a92UlCVFR9N8(e81Var, d91Var, null, 17);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
        }
        wdg6QnbFHrFF(tf0Var, (pe0) nLZGh9p8gVSu3, e81Var);
        return d91Var;
    }

    public static long e9gEMXR7LXtO(int i, int i2, int i3) {
        return TSizfFm2Yiuu(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final v8 gGoUzNp9JO5I(d32 d32Var) {
        Object RAsUl2FVSrh62 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.ozEBbv0hFTAB);
        if (RAsUl2FVSrh62 == null) {
            RAsUl2FVSrh62 = null;
        }
        v8 v8Var = (v8) RAsUl2FVSrh62;
        Object RAsUl2FVSrh63 = d32Var.Y1f8riQaR6yg.rtx2ld2ELZv4.RAsUl2FVSrh6(h32.aF05bpZJlKEP);
        if (RAsUl2FVSrh63 == null) {
            RAsUl2FVSrh63 = null;
        }
        List list = (List) RAsUl2FVSrh63;
        return v8Var == null ? list != null ? (v8) zk.FT2GK7JK5Ma2(list) : null : v8Var;
    }

    public static final boolean gPXPFXrUH4XX(d32 d32Var) {
        z22 dgRBjINgWbAK2 = d32Var.dgRBjINgWbAK();
        return !dgRBjINgWbAK2.rtx2ld2ELZv4.TSizfFm2Yiuu(h32.wdg6QnbFHrFF);
    }

    public static boolean i68hK7ahKtgp(int i, Object obj) {
        if (obj instanceof xe0) {
            if ((obj instanceof ze0 ? ((ze0) obj).lS5Rgt96tfkO() : obj instanceof ae0 ? 0 : obj instanceof le0 ? 1 : obj instanceof pe0 ? 2 : obj instanceof qe0 ? 3 : obj instanceof re0 ? 4 : obj instanceof se0 ? 5 : obj instanceof te0 ? 6 : obj instanceof ue0 ? 7 : obj instanceof ve0 ? 8 : obj instanceof we0 ? 9 : obj instanceof be0 ? 10 : obj instanceof ce0 ? 11 : obj instanceof ee0 ? 13 : obj instanceof fe0 ? 14 : obj instanceof ge0 ? 15 : obj instanceof he0 ? 16 : obj instanceof ie0 ? 17 : obj instanceof je0 ? 18 : obj instanceof ke0 ? 19 : obj instanceof me0 ? 20 : obj instanceof ne0 ? 21 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static final long jJwa0q7P5wHq(long j, x30 x30Var) {
        TimeUnit timeUnit = x30Var.rtx2ld2ELZv4;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            return tmVwIGCQF4zR(timeUnit2.convert(j, timeUnit));
        }
        if (x30Var.compareTo(x30.MILLISECONDS) < 0) {
            return ozEBbv0hFTAB(ng0.dgRBjINgWbAK(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return ozEBbv0hFTAB(ov2.S2OOm9zPNm0h(Math.abs(j), x30Var) * signum);
    }

    public static final long jyegZNwi31qc(long j, long j2) {
        float f;
        float f2;
        long PxuCJdSBwIXG2 = hl.PxuCJdSBwIXG(j, hl.a92UlCVFR9N8(j2));
        float Y1f8riQaR6yg2 = hl.Y1f8riQaR6yg(j2);
        float Y1f8riQaR6yg3 = hl.Y1f8riQaR6yg(PxuCJdSBwIXG2);
        float f3 = 1.0f - Y1f8riQaR6yg3;
        float f4 = (Y1f8riQaR6yg2 * f3) + Y1f8riQaR6yg3;
        float rtx2ld2ELZv42 = hl.rtx2ld2ELZv4(PxuCJdSBwIXG2);
        float rtx2ld2ELZv43 = hl.rtx2ld2ELZv4(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((rtx2ld2ELZv43 * Y1f8riQaR6yg2) * f3) + (rtx2ld2ELZv42 * Y1f8riQaR6yg3)) / f4;
        }
        float RAsUl2FVSrh62 = hl.RAsUl2FVSrh6(PxuCJdSBwIXG2);
        float RAsUl2FVSrh63 = hl.RAsUl2FVSrh6(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((RAsUl2FVSrh63 * Y1f8riQaR6yg2) * f3) + (RAsUl2FVSrh62 * Y1f8riQaR6yg3)) / f4;
        }
        float e9gEMXR7LXtO2 = hl.e9gEMXR7LXtO(PxuCJdSBwIXG2);
        float e9gEMXR7LXtO3 = hl.e9gEMXR7LXtO(j2);
        if (f4 != 0.0f) {
            f5 = (((e9gEMXR7LXtO3 * Y1f8riQaR6yg2) * f3) + (e9gEMXR7LXtO2 * Y1f8riQaR6yg3)) / f4;
        }
        return QrzZRwfaDlRX(f, f2, f5, f4, hl.a92UlCVFR9N8(j2));
    }

    public static final ru kpCQ9veP6n3I(hp hpVar) {
        return new ou1(((tf0) hpVar).i68hK7ahKtgp);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long lS5Rgt96tfkO(float f, float f2, float f3, float f4, tl tlVar) {
        int i;
        int i2;
        int i3;
        float lS5Rgt96tfkO2;
        float PxuCJdSBwIXG2;
        int i4;
        int i5;
        int i6;
        int i7;
        float lS5Rgt96tfkO3;
        float PxuCJdSBwIXG3;
        int i8;
        int i9;
        int i10;
        if (tlVar.TSizfFm2Yiuu()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            long j = (i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            gl glVar = hl.Companion;
            return j;
        }
        if (((int) (tlVar.lS5Rgt96tfkO >> 32)) != 3) {
            dp0.PxuCJdSBwIXG("Color only works with ColorSpaces with 3 components");
        }
        int i14 = tlVar.TSizfFm2Yiuu;
        if (i14 == -1) {
            dp0.PxuCJdSBwIXG("Unknown color space, please use a color space in ColorSpaces");
        }
        float lS5Rgt96tfkO4 = tlVar.lS5Rgt96tfkO(0);
        float PxuCJdSBwIXG4 = tlVar.PxuCJdSBwIXG(0);
        if (f >= lS5Rgt96tfkO4) {
            lS5Rgt96tfkO4 = f;
        }
        if (lS5Rgt96tfkO4 <= PxuCJdSBwIXG4) {
            PxuCJdSBwIXG4 = lS5Rgt96tfkO4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(PxuCJdSBwIXG4);
        int i15 = floatToRawIntBits >>> 31;
        int i16 = (floatToRawIntBits >>> 23) & 255;
        int i17 = floatToRawIntBits & 8388607;
        if (i16 == 255) {
            i2 = i17 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i16 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i18 = i17 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i18) + 1) | (i15 << 15);
                    short s = (short) i3;
                    lS5Rgt96tfkO2 = tlVar.lS5Rgt96tfkO(1);
                    PxuCJdSBwIXG2 = tlVar.PxuCJdSBwIXG(1);
                    if (f2 >= lS5Rgt96tfkO2) {
                        lS5Rgt96tfkO2 = f2;
                    }
                    if (lS5Rgt96tfkO2 <= PxuCJdSBwIXG2) {
                        PxuCJdSBwIXG2 = lS5Rgt96tfkO2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(PxuCJdSBwIXG2);
                    int i19 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i20 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i20 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i21 = i20 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i21) + 1) | (i19 << 15);
                                short s2 = (short) i7;
                                lS5Rgt96tfkO3 = tlVar.lS5Rgt96tfkO(2);
                                PxuCJdSBwIXG3 = tlVar.PxuCJdSBwIXG(2);
                                if (f3 >= lS5Rgt96tfkO3) {
                                    lS5Rgt96tfkO3 = f3;
                                }
                                if (lS5Rgt96tfkO3 <= PxuCJdSBwIXG3) {
                                    PxuCJdSBwIXG3 = lS5Rgt96tfkO3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(PxuCJdSBwIXG3);
                                int i22 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i23 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i23 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i24 = i8 - 112;
                                    if (i24 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i24 > 0) {
                                        int i25 = i23 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i24 << 10) | i25) + 1) | (i22 << 15);
                                            long j2 = (i14 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            gl glVar2 = hl.Companion;
                                            return j2;
                                        }
                                        i9 = i25;
                                        r7 = i24;
                                    } else if (i24 >= -10) {
                                        int i26 = (i23 | 8388608) >> (1 - i24);
                                        if ((i26 & 4096) != 0) {
                                            i26 += 8192;
                                        }
                                        i9 = i26 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i22 << 15) | (r7 << 10);
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (i14 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                gl glVar22 = hl.Companion;
                                return j22;
                            }
                            i6 = i21;
                        } else if (i5 >= -10) {
                            int i27 = (i20 | 8388608) >> (1 - i5);
                            if ((i27 & 4096) != 0) {
                                i27 += 8192;
                            }
                            i6 = i27 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i19 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    lS5Rgt96tfkO3 = tlVar.lS5Rgt96tfkO(2);
                    PxuCJdSBwIXG3 = tlVar.PxuCJdSBwIXG(2);
                    if (f3 >= lS5Rgt96tfkO3) {
                    }
                    if (lS5Rgt96tfkO3 <= PxuCJdSBwIXG3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(PxuCJdSBwIXG3);
                    int i222 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i232 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i222 << 15) | (r7 << 10);
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (i14 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    gl glVar222 = hl.Companion;
                    return j222;
                }
                i2 = i18;
            } else if (i >= -10) {
                int i28 = (i17 | 8388608) >> (1 - i);
                if ((i28 & 4096) != 0) {
                    i28 += 8192;
                }
                i2 = i28 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i15 << 15) | (i << 10);
        short s3 = (short) i3;
        lS5Rgt96tfkO2 = tlVar.lS5Rgt96tfkO(1);
        PxuCJdSBwIXG2 = tlVar.PxuCJdSBwIXG(1);
        if (f2 >= lS5Rgt96tfkO2) {
        }
        if (lS5Rgt96tfkO2 <= PxuCJdSBwIXG2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(PxuCJdSBwIXG2);
        int i192 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i202 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i192 << 15) | (i5 << 10);
        short s222 = (short) i7;
        lS5Rgt96tfkO3 = tlVar.lS5Rgt96tfkO(2);
        PxuCJdSBwIXG3 = tlVar.PxuCJdSBwIXG(2);
        if (f3 >= lS5Rgt96tfkO3) {
        }
        if (lS5Rgt96tfkO3 <= PxuCJdSBwIXG3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(PxuCJdSBwIXG3);
        int i2222 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2322 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2222 << 15) | (r7 << 10);
        if (f4 >= 0.0f) {
        }
        long j2222 = (i14 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        gl glVar2222 = hl.Companion;
        return j2222;
    }

    public static final n61 nLZGh9p8gVSu(n61 n61Var, boolean z, e81 e81Var) {
        return n61Var.TSizfFm2Yiuu(z ? new eb0(e81Var) : n61.Companion);
    }

    public static final int ngxnMNrpiKat(long j) {
        float[] fArr = wl.PxuCJdSBwIXG;
        return (int) (hl.PxuCJdSBwIXG(j, wl.e9gEMXR7LXtO) >>> 32);
    }

    public static final n61 nxJAScVArhE9(n61 n61Var, le0 le0Var) {
        return n61Var.TSizfFm2Yiuu(new xf1(le0Var));
    }

    public static final long ozEBbv0hFTAB(long j) {
        long j2 = (j << 1) + 1;
        u30.Companion.getClass();
        int i = v30.PxuCJdSBwIXG;
        return j2;
    }

    public static String pnx5pC0XzaCw(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        int i5 = i4;
        while (i5 < length) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || ia2.D0aTLcX6Uhyo(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !zf8DYfih6EZu(i5, length, str)))) || (codePointAt == 43 && z3)))) {
                yf yfVar = new yf();
                yfVar.wLFCmsViZrNT(i4, i5, str);
                yf yfVar2 = null;
                while (i5 < length) {
                    int codePointAt2 = str.codePointAt(i5);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == i6 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            yfVar.xbgXKYA2cIfu("+");
                        } else if (codePointAt2 == 43 && z3) {
                            yfVar.xbgXKYA2cIfu(z ? "+" : "%2B");
                        } else {
                            if (codePointAt2 >= i6 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z4) && !ia2.D0aTLcX6Uhyo(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z && (!z2 || zf8DYfih6EZu(i5, length, str))))) {
                                    yfVar.nxJAScVArhE9(codePointAt2);
                                }
                            }
                            if (yfVar2 == null) {
                                yfVar2 = new yf();
                            }
                            yfVar2.nxJAScVArhE9(codePointAt2);
                            while (!yfVar2.OPXfSBeufaJ8()) {
                                byte readByte = yfVar2.readByte();
                                yfVar.Pf0ThKz3j5YS(37);
                                char[] cArr = Pf0ThKz3j5YS;
                                yfVar.Pf0ThKz3j5YS(cArr[((readByte & 255) >> 4) & 15]);
                                yfVar.Pf0ThKz3j5YS(cArr[readByte & 15]);
                            }
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 32;
                }
                return yfVar.pnx5pC0XzaCw();
            }
            i5 += Character.charCount(codePointAt);
        }
        return str.substring(i4, length);
    }

    public static final long qudtW7lwm99e(int i) {
        x30 x30Var = x30.SECONDS;
        if (x30Var.compareTo(x30Var) > 0) {
            return jJwa0q7P5wHq(i, x30Var);
        }
        return tmVwIGCQF4zR(TimeUnit.NANOSECONDS.convert(i, TimeUnit.SECONDS));
    }

    public static final void r3s1LDPKFs1S(ae0 ae0Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        ph1 ph1Var = ((tf0) hpVar).ryVscX7ZL4Ux.lS5Rgt96tfkO.POWyO8hTM6YC;
        ph1Var.i68hK7ahKtgp(fh1.TSizfFm2Yiuu);
        sj0.gGoUzNp9JO5I(ph1Var, 0, ae0Var);
    }

    public static final ez1 rZjpSjn4zoMv(zu zuVar) {
        zuVar.getClass();
        qz1 qz1Var = (qz1) zuVar.PxuCJdSBwIXG(RfyTYNmI9Srp);
        Bundle bundle = null;
        if (qz1Var == null) {
            u9.XL4ISE6Oc65B("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        pr2 pr2Var = (pr2) zuVar.PxuCJdSBwIXG(EcgxDIVH5in8);
        if (pr2Var == null) {
            u9.XL4ISE6Oc65B("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) zuVar.PxuCJdSBwIXG(S9EYkSpbGuxq);
        String str = (String) zuVar.PxuCJdSBwIXG(nr2.lS5Rgt96tfkO);
        if (str == null) {
            u9.XL4ISE6Oc65B("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        lz1 rtx2ld2ELZv42 = qz1Var.TSizfFm2Yiuu().rtx2ld2ELZv4("androidx.lifecycle.internal.SavedStateHandlesProvider");
        iz1 iz1Var = rtx2ld2ELZv42 instanceof iz1 ? (iz1) rtx2ld2ELZv42 : null;
        if (iz1Var == null) {
            u9.rtx2ld2ELZv4("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = POWyO8hTM6YC(pr2Var).lS5Rgt96tfkO;
        ez1 ez1Var = (ez1) linkedHashMap.get(str);
        if (ez1Var != null) {
            return ez1Var;
        }
        dz1 dz1Var = ez1.Companion;
        iz1Var.lS5Rgt96tfkO();
        Bundle bundle3 = iz1Var.TSizfFm2Yiuu;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                iz1Var.TSizfFm2Yiuu = null;
            }
            bundle = bundle4;
        }
        dz1Var.getClass();
        ez1 PxuCJdSBwIXG2 = dz1.PxuCJdSBwIXG(bundle, bundle2);
        linkedHashMap.put(str, PxuCJdSBwIXG2);
        return PxuCJdSBwIXG2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0 == defpackage.fp.lS5Rgt96tfkO) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rtx2ld2ELZv4(Object obj, le0 le0Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(obj);
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (!a92UlCVFR9N82) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu2 = new o00(le0Var);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
    }

    public static final dp ryVscX7ZL4Ux(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (dp) weakReference.get();
        }
        return null;
    }

    public static final long tmVwIGCQF4zR(long j) {
        long j2 = j << 1;
        u30.Companion.getClass();
        int i = v30.PxuCJdSBwIXG;
        return j2;
    }

    public static final n61 wLFCmsViZrNT(k61 k61Var, vy0 vy0Var, ef efVar, th1 th1Var) {
        sx0 sx0Var = new sx0(vy0Var, efVar, th1Var);
        k61Var.getClass();
        return sx0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1 == defpackage.fp.lS5Rgt96tfkO) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void wdg6QnbFHrFF(hp hpVar, pe0 pe0Var, Object obj) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        hu huVar = ((tf0) hpVar).i68hK7ahKtgp;
        tf0 tf0Var = (tf0) hpVar;
        boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(obj);
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (!a92UlCVFR9N82) {
            hp.Companion.getClass();
        }
        nLZGh9p8gVSu2 = new vv0(huVar, pe0Var);
        tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
    }

    public static final void x50lh2ztY7Y5(final List list, Collection collection, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1537894851);
        if ((((tf0Var.rtx2ld2ELZv4(list) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(collection) ? 32 : 16)) & 19) == 18 && tf0Var.e6tOsSdd2EFb()) {
            tf0Var.i68hK7ahKtgp();
        } else {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            final boolean booleanValue = ((Boolean) tf0Var.wdg6QnbFHrFF(bq0.PxuCJdSBwIXG)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                final x91 x91Var = (x91) it.next();
                s01 s01Var = x91Var.QrzZRwfaDlRX.wdg6QnbFHrFF;
                boolean RAsUl2FVSrh62 = tf0Var.RAsUl2FVSrh6(booleanValue) | tf0Var.rtx2ld2ELZv4(list) | tf0Var.rtx2ld2ELZv4(x91Var);
                Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                if (!RAsUl2FVSrh62) {
                    hp.Companion.getClass();
                    if (nLZGh9p8gVSu2 != fp.lS5Rgt96tfkO) {
                        rtx2ld2ELZv4(s01Var, (le0) nLZGh9p8gVSu2, tf0Var);
                    }
                }
                nLZGh9p8gVSu2 = new le0() { // from class: nz
                    @Override // defpackage.le0
                    public final Object OPXfSBeufaJ8(Object obj) {
                        final x91 x91Var2 = x91.this;
                        final List list2 = list;
                        final boolean z = booleanValue;
                        l01 l01Var = new l01() { // from class: oz
                            @Override // defpackage.l01
                            public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
                                boolean z2 = z;
                                List list3 = list2;
                                x91 x91Var3 = x91Var2;
                                if (z2 && !list3.contains(x91Var3)) {
                                    list3.add(x91Var3);
                                }
                                if (e01Var == e01.ON_START && !list3.contains(x91Var3)) {
                                    list3.add(x91Var3);
                                }
                                if (e01Var == e01.ON_STOP) {
                                    list3.remove(x91Var3);
                                }
                            }
                        };
                        x91Var2.QrzZRwfaDlRX.wdg6QnbFHrFF.PxuCJdSBwIXG(l01Var);
                        return new gc(1, x91Var2, l01Var);
                    }
                };
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                rtx2ld2ELZv4(s01Var, (le0) nLZGh9p8gVSu2, tf0Var);
            }
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new bf(i, 6, list, collection);
        }
    }

    public static final long xbgXKYA2cIfu(float f, long j, long j2) {
        kf1 kf1Var = wl.ZbWwgt3aGe7A;
        long PxuCJdSBwIXG2 = hl.PxuCJdSBwIXG(j, kf1Var);
        long PxuCJdSBwIXG3 = hl.PxuCJdSBwIXG(j2, kf1Var);
        float Y1f8riQaR6yg2 = hl.Y1f8riQaR6yg(PxuCJdSBwIXG2);
        float rtx2ld2ELZv42 = hl.rtx2ld2ELZv4(PxuCJdSBwIXG2);
        float RAsUl2FVSrh62 = hl.RAsUl2FVSrh6(PxuCJdSBwIXG2);
        float e9gEMXR7LXtO2 = hl.e9gEMXR7LXtO(PxuCJdSBwIXG2);
        float Y1f8riQaR6yg3 = hl.Y1f8riQaR6yg(PxuCJdSBwIXG3);
        float rtx2ld2ELZv43 = hl.rtx2ld2ELZv4(PxuCJdSBwIXG3);
        float RAsUl2FVSrh63 = hl.RAsUl2FVSrh6(PxuCJdSBwIXG3);
        float e9gEMXR7LXtO3 = hl.e9gEMXR7LXtO(PxuCJdSBwIXG3);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return hl.PxuCJdSBwIXG(QrzZRwfaDlRX(ni0.rZjpSjn4zoMv(rtx2ld2ELZv42, rtx2ld2ELZv43, f), ni0.rZjpSjn4zoMv(RAsUl2FVSrh62, RAsUl2FVSrh63, f), ni0.rZjpSjn4zoMv(e9gEMXR7LXtO2, e9gEMXR7LXtO3, f), ni0.rZjpSjn4zoMv(Y1f8riQaR6yg2, Y1f8riQaR6yg3, f), kf1Var), hl.a92UlCVFR9N8(j2));
    }

    public static final View xfACYKDMU6Dj(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(EpkonXwzFgDB(view, R.id.view_tree_lifecycle_owner), EpkonXwzFgDB(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (ryVscX7ZL4Ux(view) == null) {
                i++;
                Object pnx5pC0XzaCw2 = ni0.pnx5pC0XzaCw(view);
                View view4 = view2;
                view2 = view;
                view = pnx5pC0XzaCw2 instanceof View ? (View) pnx5pC0XzaCw2 : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final Object[] yQRudnv4La6p(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = lS5Rgt96tfkO;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static final boolean zf8DYfih6EZu(int i, int i2, String str) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && kv2.dgRBjINgWbAK(str.charAt(i + 1)) != -1 && kv2.dgRBjINgWbAK(str.charAt(i3)) != -1;
    }
}
