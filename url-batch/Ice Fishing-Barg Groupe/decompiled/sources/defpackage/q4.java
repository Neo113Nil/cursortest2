package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q4 implements zi1 {
    public final hw0 OPXfSBeufaJ8;
    public final String PxuCJdSBwIXG;
    public final p6 RAsUl2FVSrh6;
    public final List TSizfFm2Yiuu;
    public final List Y1f8riQaR6yg;
    public final hy a92UlCVFR9N8;
    public final boolean dgRBjINgWbAK;
    public final ob0 e9gEMXR7LXtO;
    public final dj2 lS5Rgt96tfkO;
    public final CharSequence rtx2ld2ELZv4;
    public m9 wdg6QnbFHrFF;
    public final int x50lh2ztY7Y5;

    /* JADX WARN: Code restructure failed: missing block: B:157:0x051a, code lost:
    
        if ((r5.lS5Rgt96tfkO.TSizfFm2Yiuu & 1095216660480L) == 0) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x00b1, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x09f9 A[LOOP:7: B:318:0x09f7->B:319:0x09f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0324 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c1  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q4] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v76, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q4(String str, dj2 dj2Var, List list, List list2, ob0 ob0Var, hy hyVar) {
        boolean booleanValue;
        Locale locale;
        int i;
        p4 p4Var;
        qi2 qi2Var;
        int i2;
        q82 q82Var;
        int size;
        int i3;
        Object obj;
        boolean z;
        String str2;
        p21 p21Var;
        rh2 rh2Var;
        th2 th2Var;
        long j;
        long lS5Rgt96tfkO;
        pb0 pb0Var;
        xc0 xc0Var;
        rc0 rc0Var;
        int i4;
        tc0 tc0Var;
        int i5;
        boolean z2;
        p4 p4Var2;
        rh2 rh2Var2;
        cn2 lS5Rgt96tfkO2;
        Typeface typeface;
        long lS5Rgt96tfkO3;
        uc ucVar;
        boolean z3;
        boolean z4;
        q82 q82Var2;
        List list3;
        ?? r1;
        dj2 dj2Var2;
        boolean z5;
        String str3;
        float f;
        CharSequence charSequence;
        long j2;
        q4 q4Var;
        if2 if2Var;
        ln1 ln1Var;
        p11 p11Var;
        float ryVscX7ZL4Ux;
        int i6;
        int length;
        zh2 zh2Var;
        List list4;
        Object obj2;
        ArrayList arrayList;
        int size2;
        int i7;
        ArrayList arrayList2;
        q82 q82Var3;
        int i8;
        int size3;
        boolean z6;
        int i9;
        List list5;
        zh2 zh2Var2;
        int size4;
        int i10;
        List list6;
        int i11;
        boolean z7;
        int i12;
        int i13;
        xm1 xm1Var;
        zh2 zh2Var3;
        int i14;
        so2 so2Var;
        int i15;
        ym2[] ym2VarArr;
        xm1 xm1Var2;
        ?? obj3 = new Object();
        obj3.PxuCJdSBwIXG = str;
        obj3.lS5Rgt96tfkO = dj2Var;
        obj3.TSizfFm2Yiuu = list;
        obj3.Y1f8riQaR6yg = list2;
        obj3.e9gEMXR7LXtO = ob0Var;
        obj3.a92UlCVFR9N8 = hyVar;
        float lS5Rgt96tfkO4 = hyVar.lS5Rgt96tfkO();
        p6 p6Var = new p6(1);
        ((TextPaint) p6Var).density = lS5Rgt96tfkO4;
        if2.Companion.getClass();
        p6Var.lS5Rgt96tfkO = if2.lS5Rgt96tfkO;
        k30.Companion.getClass();
        p6Var.TSizfFm2Yiuu = 3;
        w42.Companion.getClass();
        p6Var.Y1f8riQaR6yg = w42.Y1f8riQaR6yg;
        obj3.RAsUl2FVSrh6 = p6Var;
        int i16 = 0;
        if (f2.e9gEMXR7LXtO(dj2Var)) {
            i2 i2Var = b50.PxuCJdSBwIXG;
            i2 i2Var2 = b50.PxuCJdSBwIXG;
            i92 i92Var = (i92) i2Var2.OPXfSBeufaJ8;
            if (i92Var == null) {
                if (x40.Y1f8riQaR6yg()) {
                    i92Var = i2Var2.a92UlCVFR9N8();
                    i2Var2.OPXfSBeufaJ8 = i92Var;
                } else {
                    i92Var = ov2.RAsUl2FVSrh6;
                }
            }
            booleanValue = ((Boolean) i92Var.getValue()).booleanValue();
        } else {
            booleanValue = false;
        }
        obj3.dgRBjINgWbAK = booleanValue;
        int i17 = dj2Var.lS5Rgt96tfkO.lS5Rgt96tfkO;
        p21 p21Var2 = dj2Var.PxuCJdSBwIXG.dgRBjINgWbAK;
        nf2.Companion.getClass();
        if (i17 != 4) {
            if (i17 != 5) {
                if (i17 == 1) {
                    i = 0;
                } else if (i17 == 2) {
                    i = 1;
                } else {
                    if (i17 != 3 && i17 != 0) {
                        u9.rtx2ld2ELZv4("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((p21Var2 == null || (locale = ((n21) p21Var2.rtx2ld2ELZv4.get(0)).PxuCJdSBwIXG) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                obj3.x50lh2ztY7Y5 = i;
                p4Var = new p4(i16, obj3);
                qi2Var = dj2Var.lS5Rgt96tfkO.OPXfSBeufaJ8;
                if (qi2Var == null) {
                    qi2.Companion.getClass();
                    qi2Var = qi2.TSizfFm2Yiuu;
                }
                p6Var.setFlags(qi2Var.lS5Rgt96tfkO ? p6Var.getFlags() | 128 : p6Var.getFlags() & (-129));
                i2 = qi2Var.PxuCJdSBwIXG;
                pi2.Companion.getClass();
                if (i2 == 1) {
                    p6Var.setFlags(p6Var.getFlags() | 64);
                    p6Var.setHinting(0);
                } else if (i2 == 2) {
                    p6Var.getFlags();
                    p6Var.setHinting(1);
                } else if (i2 == 3) {
                    p6Var.getFlags();
                    p6Var.setHinting(0);
                } else {
                    p6Var.getFlags();
                }
                q82Var = dj2Var.PxuCJdSBwIXG;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((u8) obj).PxuCJdSBwIXG instanceof q82) {
                        break;
                    } else {
                        i3++;
                    }
                }
                z = obj != null;
                long j3 = q82Var.lS5Rgt96tfkO;
                str2 = q82Var.RAsUl2FVSrh6;
                p21Var = q82Var.dgRBjINgWbAK;
                rh2Var = q82Var.PxuCJdSBwIXG;
                th2Var = q82Var.wdg6QnbFHrFF;
                j = q82Var.rtx2ld2ELZv4;
                lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j3);
                jj2.Companion.getClass();
                if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
                    p6Var.setTextSize(hyVar.qudtW7lwm99e(j3));
                } else if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 8589934592L)) {
                    p6Var.setTextSize(hj2.TSizfFm2Yiuu(j3) * p6Var.getTextSize());
                }
                pb0Var = q82Var.a92UlCVFR9N8;
                if (pb0Var != null && q82Var.Y1f8riQaR6yg == null && q82Var.TSizfFm2Yiuu == null) {
                    z2 = z;
                    p4Var2 = p4Var;
                    rh2Var2 = rh2Var;
                } else {
                    xc0Var = q82Var.TSizfFm2Yiuu;
                    if (xc0Var == null) {
                        xc0.Companion.getClass();
                        xc0Var = xc0.x50lh2ztY7Y5;
                    }
                    rc0Var = q82Var.Y1f8riQaR6yg;
                    if (rc0Var != null) {
                        i4 = rc0Var.PxuCJdSBwIXG;
                    } else {
                        rc0.Companion.getClass();
                        i4 = 0;
                    }
                    tc0Var = q82Var.e9gEMXR7LXtO;
                    if (tc0Var != null) {
                        i5 = tc0Var.PxuCJdSBwIXG;
                    } else {
                        tc0.Companion.getClass();
                        i5 = 65535;
                    }
                    z2 = z;
                    p4Var2 = p4Var;
                    q4 q4Var2 = (q4) p4Var2.OPXfSBeufaJ8;
                    rh2Var2 = rh2Var;
                    lS5Rgt96tfkO2 = ((qb0) q4Var2.e9gEMXR7LXtO).lS5Rgt96tfkO(pb0Var, xc0Var, i4, i5);
                    if (lS5Rgt96tfkO2 instanceof bn2) {
                        Object obj4 = ((bn2) lS5Rgt96tfkO2).rtx2ld2ELZv4;
                        obj4.getClass();
                        typeface = (Typeface) obj4;
                    } else {
                        m9 m9Var = new m9(lS5Rgt96tfkO2, q4Var2.wdg6QnbFHrFF);
                        q4Var2.wdg6QnbFHrFF = m9Var;
                        Object obj5 = m9Var.dgRBjINgWbAK;
                        obj5.getClass();
                        typeface = (Typeface) obj5;
                    }
                    p6Var.setTypeface(typeface);
                }
                if (p21Var != null) {
                    p21.Companion.getClass();
                    if (!p21Var.equals(om1.PxuCJdSBwIXG.EcgxDIVH5in8())) {
                        ArrayList arrayList3 = new ArrayList(al.KZw9XyiywG4x(p21Var, 10));
                        Iterator it = p21Var.rtx2ld2ELZv4.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((n21) it.next()).PxuCJdSBwIXG);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        p6Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    p6Var.setFontFeatureSettings(str2);
                }
                if (th2Var != null) {
                    th2.Companion.getClass();
                    if (!th2Var.equals(th2.TSizfFm2Yiuu)) {
                        p6Var.setTextScaleX(p6Var.getTextScaleX() * th2Var.PxuCJdSBwIXG);
                        p6Var.setTextSkewX(p6Var.getTextSkewX() + th2Var.lS5Rgt96tfkO);
                    }
                }
                p6Var.Y1f8riQaR6yg(rh2Var2.lS5Rgt96tfkO());
                uf TSizfFm2Yiuu = rh2Var2.TSizfFm2Yiuu();
                a62.Companion.getClass();
                p6Var.TSizfFm2Yiuu(TSizfFm2Yiuu, 9205357640488583168L, rh2Var2.PxuCJdSBwIXG());
                p6Var.a92UlCVFR9N8(q82Var.r3s1LDPKFs1S);
                p6Var.RAsUl2FVSrh6(q82Var.cpQdD2nAriOS);
                p6Var.e9gEMXR7LXtO(q82Var.gPXPFXrUH4XX);
                lS5Rgt96tfkO3 = hj2.lS5Rgt96tfkO(j);
                jj2.Companion.getClass();
                if (!jj2.PxuCJdSBwIXG(lS5Rgt96tfkO3, 4294967296L) && hj2.TSizfFm2Yiuu(j) != 0.0f) {
                    float textScaleX = p6Var.getTextScaleX() * p6Var.getTextSize();
                    float qudtW7lwm99e = hyVar.qudtW7lwm99e(j);
                    if (textScaleX != 0.0f) {
                        p6Var.setLetterSpacing(qudtW7lwm99e / textScaleX);
                    }
                } else if (jj2.PxuCJdSBwIXG(hj2.lS5Rgt96tfkO(j), 8589934592L)) {
                    p6Var.setLetterSpacing(hj2.TSizfFm2Yiuu(j));
                }
                long j4 = q82Var.x50lh2ztY7Y5;
                ucVar = q82Var.OPXfSBeufaJ8;
                z3 = (z2 || !jj2.PxuCJdSBwIXG(hj2.lS5Rgt96tfkO(j), 4294967296L) || hj2.TSizfFm2Yiuu(j) == 0.0f) ? false : true;
                hl.Companion.getClass();
                long j5 = hl.RAsUl2FVSrh6;
                boolean z8 = hl.TSizfFm2Yiuu(j4, j5) && !hl.TSizfFm2Yiuu(j4, hl.a92UlCVFR9N8);
                if (ucVar != null) {
                    uc.Companion.getClass();
                    if (Float.compare(ucVar.PxuCJdSBwIXG, 0.0f) != 0) {
                        z4 = true;
                        if (!z3 || z8 || z4) {
                            if (!z3) {
                                hj2.Companion.getClass();
                                j = hj2.TSizfFm2Yiuu;
                            }
                            q82Var2 = new q82(0L, 0L, (xc0) null, (rc0) null, (tc0) null, (pb0) null, (String) null, j, !z4 ? ucVar : null, (th2) null, (p21) null, !z8 ? j4 : j5, (if2) null, (w42) null, 63103);
                        } else {
                            q82Var2 = null;
                        }
                        list3 = obj3.TSizfFm2Yiuu;
                        if (q82Var2 != null) {
                            int size5 = list3.size() + 1;
                            ArrayList arrayList4 = new ArrayList(size5);
                            int i18 = 0;
                            while (i18 < size5) {
                                arrayList4.add(i18 == 0 ? new u8(0, obj3.PxuCJdSBwIXG.length(), q82Var2) : (u8) obj3.TSizfFm2Yiuu.get(i18 - 1));
                                i18++;
                            }
                            list3 = arrayList4;
                        }
                        r1 = obj3.PxuCJdSBwIXG;
                        float textSize = obj3.RAsUl2FVSrh6.getTextSize();
                        dj2Var2 = obj3.lS5Rgt96tfkO;
                        List list7 = obj3.Y1f8riQaR6yg;
                        hy hyVar2 = obj3.a92UlCVFR9N8;
                        z5 = obj3.dgRBjINgWbAK;
                        n4 n4Var = o4.PxuCJdSBwIXG;
                        if (z5 || !x40.Y1f8riQaR6yg()) {
                            str3 = r1;
                            f = 0.0f;
                            charSequence = str3;
                        } else {
                            ln1 ln1Var2 = dj2Var2.TSizfFm2Yiuu;
                            i50 i50Var = (ln1Var2 == null || (xm1Var2 = ln1Var2.lS5Rgt96tfkO) == null) ? null : new i50(xm1Var2.lS5Rgt96tfkO);
                            i50.Companion.getClass();
                            boolean z9 = i50Var != null && i50Var.PxuCJdSBwIXG == 2;
                            x40 PxuCJdSBwIXG = x40.PxuCJdSBwIXG();
                            int length2 = r1.length();
                            if (!(PxuCJdSBwIXG.TSizfFm2Yiuu() == 1)) {
                                u9.rtx2ld2ELZv4("Not initialized yet");
                                throw null;
                            }
                            if (length2 < 0) {
                                u9.XL4ISE6Oc65B("end cannot be negative");
                                throw null;
                            }
                            if (!(length2 >= 0)) {
                                u9.XL4ISE6Oc65B("start should be <= than end");
                                throw null;
                            }
                            if (!(r1.length() >= 0)) {
                                u9.XL4ISE6Oc65B("start should be < than charSequence length");
                                throw null;
                            }
                            if (!(length2 <= r1.length())) {
                                u9.XL4ISE6Oc65B("end should be < than charSequence length");
                                throw null;
                            }
                            if (r1.length() == 0 || length2 == 0) {
                                str3 = r1;
                                f = 0.0f;
                            } else {
                                boolean z10 = z9;
                                m9 m9Var2 = PxuCJdSBwIXG.e9gEMXR7LXtO.lS5Rgt96tfkO;
                                m9Var2.getClass();
                                if (r1 instanceof Spannable) {
                                    so2Var = new so2((Spannable) r1);
                                    i14 = 0;
                                } else if (!(r1 instanceof Spanned) || ((Spanned) r1).nextSpanTransition(-1, length2 + 1, ym2.class) > length2) {
                                    i14 = 0;
                                    so2Var = null;
                                } else {
                                    so2Var = new so2();
                                    i14 = 0;
                                    so2Var.rtx2ld2ELZv4 = false;
                                    so2Var.OPXfSBeufaJ8 = new SpannableString(r1);
                                }
                                if (so2Var == null || (ym2VarArr = (ym2[]) so2Var.OPXfSBeufaJ8.getSpans(i14, length2, ym2.class)) == null || ym2VarArr.length <= 0) {
                                    str3 = r1;
                                    f = 0.0f;
                                    i15 = 0;
                                } else {
                                    int length3 = ym2VarArr.length;
                                    f = 0.0f;
                                    i15 = 0;
                                    int i19 = 0;
                                    String str4 = r1;
                                    while (true) {
                                        str3 = str4;
                                        if (i19 >= length3) {
                                            break;
                                        }
                                        ym2 ym2Var = ym2VarArr[i19];
                                        int i20 = i19;
                                        int spanStart = so2Var.OPXfSBeufaJ8.getSpanStart(ym2Var);
                                        int i21 = length3;
                                        int spanEnd = so2Var.OPXfSBeufaJ8.getSpanEnd(ym2Var);
                                        if (spanStart != length2) {
                                            so2Var.removeSpan(ym2Var);
                                        }
                                        i15 = Math.min(spanStart, i15);
                                        length2 = Math.max(spanEnd, length2);
                                        i19 = i20 + 1;
                                        length3 = i21;
                                        str4 = str3;
                                    }
                                }
                                if (i15 != length2 && i15 < str3.length()) {
                                    so2 so2Var2 = (so2) m9Var2.e6tOsSdd2EFb(str3, i15, length2, Integer.MAX_VALUE, z10, new op0(15, so2Var, (jx1) m9Var2.OPXfSBeufaJ8));
                                    if (so2Var2 != null) {
                                        charSequence = so2Var2.OPXfSBeufaJ8;
                                        charSequence.getClass();
                                    }
                                }
                            }
                            charSequence = str3;
                            charSequence.getClass();
                        }
                        if (list3.isEmpty() && list7.isEmpty()) {
                            zh2Var3 = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                            zh2.Companion.getClass();
                            if (cs0.wdg6QnbFHrFF(zh2Var3, zh2.TSizfFm2Yiuu)) {
                                j2 = 0;
                                q4Var = obj3;
                            }
                        }
                        j2 = 0;
                        SpannableString spannableString = !(charSequence instanceof Spannable) ? (Spannable) charSequence : new SpannableString(charSequence);
                        if2Var = dj2Var2.PxuCJdSBwIXG.cpQdD2nAriOS;
                        if2.Companion.getClass();
                        if (cs0.wdg6QnbFHrFF(if2Var, if2.TSizfFm2Yiuu)) {
                            spannableString.setSpan(o4.PxuCJdSBwIXG, 0, str3.length(), 33);
                        }
                        ln1Var = dj2Var2.TSizfFm2Yiuu;
                        if ((ln1Var != null || (xm1Var = ln1Var.lS5Rgt96tfkO) == null) ? false : xm1Var.PxuCJdSBwIXG) {
                            bj1 bj1Var = dj2Var2.lS5Rgt96tfkO;
                            if (bj1Var.a92UlCVFR9N8 == null) {
                                float ryVscX7ZL4Ux2 = ni0.ryVscX7ZL4Ux(bj1Var.TSizfFm2Yiuu, textSize, hyVar2);
                                if (!Float.isNaN(ryVscX7ZL4Ux2)) {
                                    spannableString.setSpan(new h11(ryVscX7ZL4Ux2), 0, spannableString.length(), 33);
                                }
                                zh2Var = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                                if (zh2Var != null) {
                                    long j6 = zh2Var.PxuCJdSBwIXG;
                                    list4 = list3;
                                    long j7 = zh2Var.lS5Rgt96tfkO;
                                    if ((!hj2.PxuCJdSBwIXG(j6, ki0.tmVwIGCQF4zR(0)) || !hj2.PxuCJdSBwIXG(j7, ki0.tmVwIGCQF4zR(0))) && (j6 & 1095216660480L) != j2 && (j7 & 1095216660480L) != j2) {
                                        long lS5Rgt96tfkO5 = hj2.lS5Rgt96tfkO(j6);
                                        jj2.Companion.getClass();
                                        obj2 = ym2.class;
                                        float qudtW7lwm99e2 = jj2.PxuCJdSBwIXG(lS5Rgt96tfkO5, 4294967296L) ? hyVar2.qudtW7lwm99e(j6) : jj2.PxuCJdSBwIXG(lS5Rgt96tfkO5, 8589934592L) ? hj2.TSizfFm2Yiuu(j6) * textSize : f;
                                        long lS5Rgt96tfkO6 = hj2.lS5Rgt96tfkO(j7);
                                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(qudtW7lwm99e2), (int) Math.ceil(jj2.PxuCJdSBwIXG(lS5Rgt96tfkO6, 4294967296L) ? hyVar2.qudtW7lwm99e(j7) : jj2.PxuCJdSBwIXG(lS5Rgt96tfkO6, 8589934592L) ? hj2.TSizfFm2Yiuu(j7) * textSize : f)), 0, spannableString.length(), 33);
                                        arrayList = new ArrayList(list4.size());
                                        size2 = list4.size();
                                        i7 = 0;
                                        while (i7 < size2) {
                                            List list8 = list4;
                                            u8 u8Var = (u8) list8.get(i7);
                                            Object obj6 = u8Var.PxuCJdSBwIXG;
                                            if (obj6 instanceof q82) {
                                                q82 q82Var4 = (q82) obj6;
                                                if (q82Var4.a92UlCVFR9N8 != null || q82Var4.Y1f8riQaR6yg != null || q82Var4.TSizfFm2Yiuu != null || ((q82) obj6).e9gEMXR7LXtO != null) {
                                                    arrayList.add(u8Var);
                                                }
                                            }
                                            i7++;
                                            list4 = list8;
                                        }
                                        List list9 = list4;
                                        q82 q82Var5 = dj2Var2.PxuCJdSBwIXG;
                                        pb0 pb0Var2 = q82Var5.a92UlCVFR9N8;
                                        q82 q82Var6 = (pb0Var2 != null && q82Var5.Y1f8riQaR6yg == null && q82Var5.TSizfFm2Yiuu == null && q82Var5.e9gEMXR7LXtO == null) ? null : new q82(0L, 0L, q82Var5.TSizfFm2Yiuu, q82Var5.Y1f8riQaR6yg, q82Var5.e9gEMXR7LXtO, pb0Var2, (String) null, 0L, (uc) null, (th2) null, (p21) null, 0L, (if2) null, (w42) null, 65475);
                                        ws wsVar = new ws(6, spannableString, p4Var2);
                                        if (arrayList.size() <= 1) {
                                            int size6 = arrayList.size();
                                            int i22 = size6 * 2;
                                            int[] iArr = new int[i22];
                                            int size7 = arrayList.size();
                                            for (int i23 = 0; i23 < size7; i23++) {
                                                u8 u8Var2 = (u8) arrayList.get(i23);
                                                iArr[i23] = u8Var2.lS5Rgt96tfkO;
                                                iArr[i23 + size6] = u8Var2.TSizfFm2Yiuu;
                                            }
                                            if (i22 > 1) {
                                                Arrays.sort(iArr);
                                            }
                                            if (i22 == 0) {
                                                rc1.RAsUl2FVSrh6("Array is empty.");
                                                throw null;
                                            }
                                            int i24 = iArr[0];
                                            int i25 = 0;
                                            while (i25 < i22) {
                                                int i26 = iArr[i25];
                                                if (i26 == i24) {
                                                    arrayList2 = arrayList;
                                                    q82Var3 = q82Var6;
                                                    i8 = i22;
                                                } else {
                                                    int size8 = arrayList.size();
                                                    q82 q82Var7 = q82Var6;
                                                    int i27 = 0;
                                                    while (i27 < size8) {
                                                        ArrayList arrayList5 = arrayList;
                                                        u8 u8Var3 = (u8) arrayList.get(i27);
                                                        q82 q82Var8 = q82Var6;
                                                        int i28 = u8Var3.lS5Rgt96tfkO;
                                                        int i29 = i22;
                                                        int i30 = u8Var3.TSizfFm2Yiuu;
                                                        if (i28 != i30 && w8.lS5Rgt96tfkO(i24, i26, i28, i30)) {
                                                            q82 q82Var9 = (q82) u8Var3.PxuCJdSBwIXG;
                                                            q82Var7 = q82Var7 != null ? q82Var7.TSizfFm2Yiuu(q82Var9) : q82Var9;
                                                        }
                                                        i27++;
                                                        arrayList = arrayList5;
                                                        q82Var6 = q82Var8;
                                                        i22 = i29;
                                                    }
                                                    arrayList2 = arrayList;
                                                    q82Var3 = q82Var6;
                                                    i8 = i22;
                                                    if (q82Var7 != null) {
                                                        wsVar.a92UlCVFR9N8(q82Var7, Integer.valueOf(i24), Integer.valueOf(i26));
                                                    }
                                                    i24 = i26;
                                                }
                                                i25++;
                                                arrayList = arrayList2;
                                                q82Var6 = q82Var3;
                                                i22 = i8;
                                            }
                                        } else if (!arrayList.isEmpty()) {
                                            q82 q82Var10 = (q82) ((u8) arrayList.get(0)).PxuCJdSBwIXG;
                                            wsVar.a92UlCVFR9N8(q82Var6 != null ? q82Var6.TSizfFm2Yiuu(q82Var10) : q82Var10, Integer.valueOf(((u8) arrayList.get(0)).lS5Rgt96tfkO), Integer.valueOf(((u8) arrayList.get(0)).TSizfFm2Yiuu));
                                        }
                                        size3 = list9.size();
                                        z6 = false;
                                        i9 = 0;
                                        while (i9 < size3) {
                                            u8 u8Var4 = (u8) list9.get(i9);
                                            Object obj7 = u8Var4.PxuCJdSBwIXG;
                                            if (obj7 instanceof q82) {
                                                int i31 = u8Var4.lS5Rgt96tfkO;
                                                int i32 = u8Var4.TSizfFm2Yiuu;
                                                if (i31 >= 0 && i31 < spannableString.length() && i32 > i31 && i32 <= spannableString.length()) {
                                                    q82 q82Var11 = (q82) obj7;
                                                    uc ucVar2 = q82Var11.OPXfSBeufaJ8;
                                                    rh2 rh2Var3 = q82Var11.PxuCJdSBwIXG;
                                                    if (ucVar2 != null) {
                                                        spannableString.setSpan(new vc(ucVar2.PxuCJdSBwIXG, 0), i31, i32, 33);
                                                    }
                                                    ni0.Pf0ThKz3j5YS(spannableString, rh2Var3.lS5Rgt96tfkO(), i31, i32);
                                                    uf TSizfFm2Yiuu2 = rh2Var3.TSizfFm2Yiuu();
                                                    float PxuCJdSBwIXG2 = rh2Var3.PxuCJdSBwIXG();
                                                    if (TSizfFm2Yiuu2 != null) {
                                                        if (TSizfFm2Yiuu2 instanceof m82) {
                                                            ni0.Pf0ThKz3j5YS(spannableString, ((m82) TSizfFm2Yiuu2).PxuCJdSBwIXG, i31, i32);
                                                        } else {
                                                            spannableString.setSpan(new u42((vf) TSizfFm2Yiuu2, PxuCJdSBwIXG2), i31, i32, 33);
                                                        }
                                                    }
                                                    if2 if2Var2 = q82Var11.cpQdD2nAriOS;
                                                    if (if2Var2 != null) {
                                                        int i33 = if2Var2.PxuCJdSBwIXG;
                                                        if2.Companion.getClass();
                                                        jf2 jf2Var = new jf2((i33 | 1) == i33, (i33 | 2) == i33);
                                                        i12 = 33;
                                                        spannableString.setSpan(jf2Var, i31, i32, 33);
                                                    } else {
                                                        i12 = 33;
                                                    }
                                                    ni0.gGoUzNp9JO5I(spannableString, q82Var11.lS5Rgt96tfkO, hyVar2, i31, i32);
                                                    String str5 = q82Var11.RAsUl2FVSrh6;
                                                    if (str5 != null) {
                                                        spannableString.setSpan(new sb0(0, str5), i31, i32, i12);
                                                    }
                                                    th2 th2Var2 = q82Var11.wdg6QnbFHrFF;
                                                    if (th2Var2 != null) {
                                                        spannableString.setSpan(new ScaleXSpan(th2Var2.PxuCJdSBwIXG), i31, i32, i12);
                                                        spannableString.setSpan(new vc(th2Var2.lS5Rgt96tfkO, 1), i31, i32, i12);
                                                    }
                                                    ni0.POWyO8hTM6YC(spannableString, q82Var11.dgRBjINgWbAK, i31, i32);
                                                    long j8 = q82Var11.x50lh2ztY7Y5;
                                                    if (j8 != 16) {
                                                        spannableString.setSpan(new BackgroundColorSpan(mm2.ngxnMNrpiKat(j8)), i31, i32, 33);
                                                    }
                                                    w42 w42Var = q82Var11.r3s1LDPKFs1S;
                                                    if (w42Var != null) {
                                                        long j9 = w42Var.lS5Rgt96tfkO;
                                                        int ngxnMNrpiKat = mm2.ngxnMNrpiKat(w42Var.PxuCJdSBwIXG);
                                                        i11 = size3;
                                                        z7 = z6;
                                                        float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                                                        float f2 = w42Var.TSizfFm2Yiuu;
                                                        y42 y42Var = new y42(ngxnMNrpiKat, intBitsToFloat, intBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                                        i13 = 33;
                                                        spannableString.setSpan(y42Var, i31, i32, 33);
                                                    } else {
                                                        i11 = size3;
                                                        z7 = z6;
                                                        i13 = 33;
                                                    }
                                                    l30 l30Var = q82Var11.gPXPFXrUH4XX;
                                                    if (l30Var != null) {
                                                        spannableString.setSpan(new m30(l30Var), i31, i32, i13);
                                                    }
                                                    long lS5Rgt96tfkO7 = hj2.lS5Rgt96tfkO(q82Var11.rtx2ld2ELZv4);
                                                    jj2.Companion.getClass();
                                                    if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO7, 4294967296L) || jj2.PxuCJdSBwIXG(hj2.lS5Rgt96tfkO(q82Var11.rtx2ld2ELZv4), 8589934592L)) {
                                                        z6 = true;
                                                        i9++;
                                                        size3 = i11;
                                                    }
                                                    z6 = z7;
                                                    i9++;
                                                    size3 = i11;
                                                }
                                            }
                                            i11 = size3;
                                            z7 = z6;
                                            z6 = z7;
                                            i9++;
                                            size3 = i11;
                                        }
                                        if (z6) {
                                            int size9 = list9.size();
                                            int i34 = 0;
                                            while (i34 < size9) {
                                                u8 u8Var5 = (u8) list9.get(i34);
                                                p8 p8Var = (p8) u8Var5.PxuCJdSBwIXG;
                                                if (p8Var instanceof q82) {
                                                    int i35 = u8Var5.lS5Rgt96tfkO;
                                                    int i36 = u8Var5.TSizfFm2Yiuu;
                                                    if (i35 >= 0 && i35 < spannableString.length() && i36 > i35 && i36 <= spannableString.length()) {
                                                        long j10 = ((q82) p8Var).rtx2ld2ELZv4;
                                                        long lS5Rgt96tfkO8 = hj2.lS5Rgt96tfkO(j10);
                                                        jj2.Companion.getClass();
                                                        list6 = list7;
                                                        Object b01Var = jj2.PxuCJdSBwIXG(lS5Rgt96tfkO8, 4294967296L) ? new b01(hyVar2.qudtW7lwm99e(j10)) : jj2.PxuCJdSBwIXG(lS5Rgt96tfkO8, 8589934592L) ? new a01(hj2.TSizfFm2Yiuu(j10)) : null;
                                                        if (b01Var != null) {
                                                            spannableString.setSpan(b01Var, i35, i36, 33);
                                                        }
                                                        i34++;
                                                        list7 = list6;
                                                    }
                                                }
                                                list6 = list7;
                                                i34++;
                                                list7 = list6;
                                            }
                                        }
                                        list5 = list7;
                                        zh2Var2 = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                                        if (zh2Var2 != null) {
                                            long j11 = zh2Var2.PxuCJdSBwIXG;
                                            long lS5Rgt96tfkO9 = hj2.lS5Rgt96tfkO(j11);
                                            jj2.Companion.getClass();
                                            if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO9, 4294967296L)) {
                                                hyVar2.qudtW7lwm99e(j11);
                                            } else if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO9, 8589934592L)) {
                                                hj2.TSizfFm2Yiuu(j11);
                                            }
                                        }
                                        size4 = list9.size();
                                        for (i10 = 0; i10 < size4; i10++) {
                                            Object obj8 = ((u8) list9.get(i10)).PxuCJdSBwIXG;
                                        }
                                        if (list5.size() > 0) {
                                            q4Var = this;
                                            charSequence = spannableString;
                                            q4Var.rtx2ld2ELZv4 = charSequence;
                                            q4Var.OPXfSBeufaJ8 = new hw0(charSequence, q4Var.RAsUl2FVSrh6, q4Var.x50lh2ztY7Y5);
                                            return;
                                        }
                                        u8 u8Var6 = (u8) list5.get(0);
                                        if (u8Var6.PxuCJdSBwIXG != null) {
                                            u9.VhhvGxCb8gfr();
                                            throw null;
                                        }
                                        for (Object obj9 : spannableString.getSpans(u8Var6.lS5Rgt96tfkO, u8Var6.TSizfFm2Yiuu, obj2)) {
                                            spannableString.removeSpan((ym2) obj9);
                                        }
                                        throw null;
                                    }
                                } else {
                                    list4 = list3;
                                }
                                obj2 = ym2.class;
                                arrayList = new ArrayList(list4.size());
                                size2 = list4.size();
                                i7 = 0;
                                while (i7 < size2) {
                                }
                                List list92 = list4;
                                q82 q82Var52 = dj2Var2.PxuCJdSBwIXG;
                                pb0 pb0Var22 = q82Var52.a92UlCVFR9N8;
                                if (pb0Var22 != null) {
                                }
                                ws wsVar2 = new ws(6, spannableString, p4Var2);
                                if (arrayList.size() <= 1) {
                                }
                                size3 = list92.size();
                                z6 = false;
                                i9 = 0;
                                while (i9 < size3) {
                                }
                                if (z6) {
                                }
                                list5 = list7;
                                zh2Var2 = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                                if (zh2Var2 != null) {
                                }
                                size4 = list92.size();
                                while (i10 < size4) {
                                }
                                if (list5.size() > 0) {
                                }
                            }
                        }
                        p11Var = dj2Var2.lS5Rgt96tfkO.a92UlCVFR9N8;
                        if (p11Var == null) {
                            p11.Companion.getClass();
                            p11Var = p11.Y1f8riQaR6yg;
                        }
                        ryVscX7ZL4Ux = ni0.ryVscX7ZL4Ux(dj2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu, textSize, hyVar2);
                        if (!Float.isNaN(ryVscX7ZL4Ux)) {
                            if (spannableString.length() == 0) {
                                i6 = 1;
                            } else {
                                if (spannableString.length() == 0) {
                                    rc1.RAsUl2FVSrh6("Char sequence is empty.");
                                    throw null;
                                }
                                i6 = 1;
                                if (spannableString.charAt(spannableString.length() - 1) != '\n') {
                                    length = spannableString.length();
                                    int i37 = length;
                                    int i38 = p11Var.lS5Rgt96tfkO;
                                    spannableString.setSpan(new q11(ryVscX7ZL4Ux, i37, (i38 & 1) <= 0, (i38 & 16) <= 0, p11Var.PxuCJdSBwIXG, p11Var.TSizfFm2Yiuu), 0, spannableString.length(), 33);
                                }
                            }
                            length = spannableString.length() + i6;
                            int i372 = length;
                            int i382 = p11Var.lS5Rgt96tfkO;
                            spannableString.setSpan(new q11(ryVscX7ZL4Ux, i372, (i382 & 1) <= 0, (i382 & 16) <= 0, p11Var.PxuCJdSBwIXG, p11Var.TSizfFm2Yiuu), 0, spannableString.length(), 33);
                        }
                        zh2Var = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                        if (zh2Var != null) {
                        }
                        obj2 = ym2.class;
                        arrayList = new ArrayList(list4.size());
                        size2 = list4.size();
                        i7 = 0;
                        while (i7 < size2) {
                        }
                        List list922 = list4;
                        q82 q82Var522 = dj2Var2.PxuCJdSBwIXG;
                        pb0 pb0Var222 = q82Var522.a92UlCVFR9N8;
                        if (pb0Var222 != null) {
                        }
                        ws wsVar22 = new ws(6, spannableString, p4Var2);
                        if (arrayList.size() <= 1) {
                        }
                        size3 = list922.size();
                        z6 = false;
                        i9 = 0;
                        while (i9 < size3) {
                        }
                        if (z6) {
                        }
                        list5 = list7;
                        zh2Var2 = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                        if (zh2Var2 != null) {
                        }
                        size4 = list922.size();
                        while (i10 < size4) {
                        }
                        if (list5.size() > 0) {
                        }
                    }
                }
                z4 = false;
                if (z3) {
                }
                if (!z3) {
                }
                q82Var2 = new q82(0L, 0L, (xc0) null, (rc0) null, (tc0) null, (pb0) null, (String) null, j, !z4 ? ucVar : null, (th2) null, (p21) null, !z8 ? j4 : j5, (if2) null, (w42) null, 63103);
                list3 = obj3.TSizfFm2Yiuu;
                if (q82Var2 != null) {
                }
                r1 = obj3.PxuCJdSBwIXG;
                float textSize2 = obj3.RAsUl2FVSrh6.getTextSize();
                dj2Var2 = obj3.lS5Rgt96tfkO;
                List list72 = obj3.Y1f8riQaR6yg;
                hy hyVar22 = obj3.a92UlCVFR9N8;
                z5 = obj3.dgRBjINgWbAK;
                n4 n4Var2 = o4.PxuCJdSBwIXG;
                if (z5) {
                }
                str3 = r1;
                f = 0.0f;
                charSequence = str3;
                if (list3.isEmpty()) {
                    zh2Var3 = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                    zh2.Companion.getClass();
                    if (cs0.wdg6QnbFHrFF(zh2Var3, zh2.TSizfFm2Yiuu)) {
                    }
                }
                j2 = 0;
                if (!(charSequence instanceof Spannable)) {
                }
                if2Var = dj2Var2.PxuCJdSBwIXG.cpQdD2nAriOS;
                if2.Companion.getClass();
                if (cs0.wdg6QnbFHrFF(if2Var, if2.TSizfFm2Yiuu)) {
                }
                ln1Var = dj2Var2.TSizfFm2Yiuu;
                if ((ln1Var != null || (xm1Var = ln1Var.lS5Rgt96tfkO) == null) ? false : xm1Var.PxuCJdSBwIXG) {
                }
                p11Var = dj2Var2.lS5Rgt96tfkO.a92UlCVFR9N8;
                if (p11Var == null) {
                }
                ryVscX7ZL4Ux = ni0.ryVscX7ZL4Ux(dj2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu, textSize2, hyVar22);
                if (!Float.isNaN(ryVscX7ZL4Ux)) {
                }
                zh2Var = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                if (zh2Var != null) {
                }
                obj2 = ym2.class;
                arrayList = new ArrayList(list4.size());
                size2 = list4.size();
                i7 = 0;
                while (i7 < size2) {
                }
                List list9222 = list4;
                q82 q82Var5222 = dj2Var2.PxuCJdSBwIXG;
                pb0 pb0Var2222 = q82Var5222.a92UlCVFR9N8;
                if (pb0Var2222 != null) {
                }
                ws wsVar222 = new ws(6, spannableString, p4Var2);
                if (arrayList.size() <= 1) {
                }
                size3 = list9222.size();
                z6 = false;
                i9 = 0;
                while (i9 < size3) {
                }
                if (z6) {
                }
                list5 = list72;
                zh2Var2 = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
                if (zh2Var2 != null) {
                }
                size4 = list9222.size();
                while (i10 < size4) {
                }
                if (list5.size() > 0) {
                }
            }
            i = 3;
            obj3.x50lh2ztY7Y5 = i;
            p4Var = new p4(i16, obj3);
            qi2Var = dj2Var.lS5Rgt96tfkO.OPXfSBeufaJ8;
            if (qi2Var == null) {
            }
            p6Var.setFlags(qi2Var.lS5Rgt96tfkO ? p6Var.getFlags() | 128 : p6Var.getFlags() & (-129));
            i2 = qi2Var.PxuCJdSBwIXG;
            pi2.Companion.getClass();
            if (i2 == 1) {
            }
            q82Var = dj2Var.PxuCJdSBwIXG;
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j32 = q82Var.lS5Rgt96tfkO;
            str2 = q82Var.RAsUl2FVSrh6;
            p21Var = q82Var.dgRBjINgWbAK;
            rh2Var = q82Var.PxuCJdSBwIXG;
            th2Var = q82Var.wdg6QnbFHrFF;
            j = q82Var.rtx2ld2ELZv4;
            lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j32);
            jj2.Companion.getClass();
            if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
            }
            pb0Var = q82Var.a92UlCVFR9N8;
            if (pb0Var != null) {
            }
            xc0Var = q82Var.TSizfFm2Yiuu;
            if (xc0Var == null) {
            }
            rc0Var = q82Var.Y1f8riQaR6yg;
            if (rc0Var != null) {
            }
            tc0Var = q82Var.e9gEMXR7LXtO;
            if (tc0Var != null) {
            }
            z2 = z;
            p4Var2 = p4Var;
            q4 q4Var22 = (q4) p4Var2.OPXfSBeufaJ8;
            rh2Var2 = rh2Var;
            lS5Rgt96tfkO2 = ((qb0) q4Var22.e9gEMXR7LXtO).lS5Rgt96tfkO(pb0Var, xc0Var, i4, i5);
            if (lS5Rgt96tfkO2 instanceof bn2) {
            }
            p6Var.setTypeface(typeface);
            if (p21Var != null) {
            }
            if (str2 != null) {
                p6Var.setFontFeatureSettings(str2);
            }
            if (th2Var != null) {
            }
            p6Var.Y1f8riQaR6yg(rh2Var2.lS5Rgt96tfkO());
            uf TSizfFm2Yiuu3 = rh2Var2.TSizfFm2Yiuu();
            a62.Companion.getClass();
            p6Var.TSizfFm2Yiuu(TSizfFm2Yiuu3, 9205357640488583168L, rh2Var2.PxuCJdSBwIXG());
            p6Var.a92UlCVFR9N8(q82Var.r3s1LDPKFs1S);
            p6Var.RAsUl2FVSrh6(q82Var.cpQdD2nAriOS);
            p6Var.e9gEMXR7LXtO(q82Var.gPXPFXrUH4XX);
            lS5Rgt96tfkO3 = hj2.lS5Rgt96tfkO(j);
            jj2.Companion.getClass();
            if (!jj2.PxuCJdSBwIXG(lS5Rgt96tfkO3, 4294967296L)) {
            }
            if (jj2.PxuCJdSBwIXG(hj2.lS5Rgt96tfkO(j), 8589934592L)) {
            }
            long j42 = q82Var.x50lh2ztY7Y5;
            ucVar = q82Var.OPXfSBeufaJ8;
            if (z2) {
            }
            hl.Companion.getClass();
            long j52 = hl.RAsUl2FVSrh6;
            if (hl.TSizfFm2Yiuu(j42, j52)) {
            }
            if (ucVar != null) {
            }
            z4 = false;
            if (z3) {
            }
            if (!z3) {
            }
            q82Var2 = new q82(0L, 0L, (xc0) null, (rc0) null, (tc0) null, (pb0) null, (String) null, j, !z4 ? ucVar : null, (th2) null, (p21) null, !z8 ? j42 : j52, (if2) null, (w42) null, 63103);
            list3 = obj3.TSizfFm2Yiuu;
            if (q82Var2 != null) {
            }
            r1 = obj3.PxuCJdSBwIXG;
            float textSize22 = obj3.RAsUl2FVSrh6.getTextSize();
            dj2Var2 = obj3.lS5Rgt96tfkO;
            List list722 = obj3.Y1f8riQaR6yg;
            hy hyVar222 = obj3.a92UlCVFR9N8;
            z5 = obj3.dgRBjINgWbAK;
            n4 n4Var22 = o4.PxuCJdSBwIXG;
            if (z5) {
            }
            str3 = r1;
            f = 0.0f;
            charSequence = str3;
            if (list3.isEmpty()) {
            }
            j2 = 0;
            if (!(charSequence instanceof Spannable)) {
            }
            if2Var = dj2Var2.PxuCJdSBwIXG.cpQdD2nAriOS;
            if2.Companion.getClass();
            if (cs0.wdg6QnbFHrFF(if2Var, if2.TSizfFm2Yiuu)) {
            }
            ln1Var = dj2Var2.TSizfFm2Yiuu;
            if ((ln1Var != null || (xm1Var = ln1Var.lS5Rgt96tfkO) == null) ? false : xm1Var.PxuCJdSBwIXG) {
            }
            p11Var = dj2Var2.lS5Rgt96tfkO.a92UlCVFR9N8;
            if (p11Var == null) {
            }
            ryVscX7ZL4Ux = ni0.ryVscX7ZL4Ux(dj2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu, textSize22, hyVar222);
            if (!Float.isNaN(ryVscX7ZL4Ux)) {
            }
            zh2Var = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
            if (zh2Var != null) {
            }
            obj2 = ym2.class;
            arrayList = new ArrayList(list4.size());
            size2 = list4.size();
            i7 = 0;
            while (i7 < size2) {
            }
            List list92222 = list4;
            q82 q82Var52222 = dj2Var2.PxuCJdSBwIXG;
            pb0 pb0Var22222 = q82Var52222.a92UlCVFR9N8;
            if (pb0Var22222 != null) {
            }
            ws wsVar2222 = new ws(6, spannableString, p4Var2);
            if (arrayList.size() <= 1) {
            }
            size3 = list92222.size();
            z6 = false;
            i9 = 0;
            while (i9 < size3) {
            }
            if (z6) {
            }
            list5 = list722;
            zh2Var2 = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
            if (zh2Var2 != null) {
            }
            size4 = list92222.size();
            while (i10 < size4) {
            }
            if (list5.size() > 0) {
            }
        }
        i = 2;
        obj3.x50lh2ztY7Y5 = i;
        p4Var = new p4(i16, obj3);
        qi2Var = dj2Var.lS5Rgt96tfkO.OPXfSBeufaJ8;
        if (qi2Var == null) {
        }
        p6Var.setFlags(qi2Var.lS5Rgt96tfkO ? p6Var.getFlags() | 128 : p6Var.getFlags() & (-129));
        i2 = qi2Var.PxuCJdSBwIXG;
        pi2.Companion.getClass();
        if (i2 == 1) {
        }
        q82Var = dj2Var.PxuCJdSBwIXG;
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j322 = q82Var.lS5Rgt96tfkO;
        str2 = q82Var.RAsUl2FVSrh6;
        p21Var = q82Var.dgRBjINgWbAK;
        rh2Var = q82Var.PxuCJdSBwIXG;
        th2Var = q82Var.wdg6QnbFHrFF;
        j = q82Var.rtx2ld2ELZv4;
        lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j322);
        jj2.Companion.getClass();
        if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
        }
        pb0Var = q82Var.a92UlCVFR9N8;
        if (pb0Var != null) {
        }
        xc0Var = q82Var.TSizfFm2Yiuu;
        if (xc0Var == null) {
        }
        rc0Var = q82Var.Y1f8riQaR6yg;
        if (rc0Var != null) {
        }
        tc0Var = q82Var.e9gEMXR7LXtO;
        if (tc0Var != null) {
        }
        z2 = z;
        p4Var2 = p4Var;
        q4 q4Var222 = (q4) p4Var2.OPXfSBeufaJ8;
        rh2Var2 = rh2Var;
        lS5Rgt96tfkO2 = ((qb0) q4Var222.e9gEMXR7LXtO).lS5Rgt96tfkO(pb0Var, xc0Var, i4, i5);
        if (lS5Rgt96tfkO2 instanceof bn2) {
        }
        p6Var.setTypeface(typeface);
        if (p21Var != null) {
        }
        if (str2 != null) {
        }
        if (th2Var != null) {
        }
        p6Var.Y1f8riQaR6yg(rh2Var2.lS5Rgt96tfkO());
        uf TSizfFm2Yiuu32 = rh2Var2.TSizfFm2Yiuu();
        a62.Companion.getClass();
        p6Var.TSizfFm2Yiuu(TSizfFm2Yiuu32, 9205357640488583168L, rh2Var2.PxuCJdSBwIXG());
        p6Var.a92UlCVFR9N8(q82Var.r3s1LDPKFs1S);
        p6Var.RAsUl2FVSrh6(q82Var.cpQdD2nAriOS);
        p6Var.e9gEMXR7LXtO(q82Var.gPXPFXrUH4XX);
        lS5Rgt96tfkO3 = hj2.lS5Rgt96tfkO(j);
        jj2.Companion.getClass();
        if (!jj2.PxuCJdSBwIXG(lS5Rgt96tfkO3, 4294967296L)) {
        }
        if (jj2.PxuCJdSBwIXG(hj2.lS5Rgt96tfkO(j), 8589934592L)) {
        }
        long j422 = q82Var.x50lh2ztY7Y5;
        ucVar = q82Var.OPXfSBeufaJ8;
        if (z2) {
        }
        hl.Companion.getClass();
        long j522 = hl.RAsUl2FVSrh6;
        if (hl.TSizfFm2Yiuu(j422, j522)) {
        }
        if (ucVar != null) {
        }
        z4 = false;
        if (z3) {
        }
        if (!z3) {
        }
        q82Var2 = new q82(0L, 0L, (xc0) null, (rc0) null, (tc0) null, (pb0) null, (String) null, j, !z4 ? ucVar : null, (th2) null, (p21) null, !z8 ? j422 : j522, (if2) null, (w42) null, 63103);
        list3 = obj3.TSizfFm2Yiuu;
        if (q82Var2 != null) {
        }
        r1 = obj3.PxuCJdSBwIXG;
        float textSize222 = obj3.RAsUl2FVSrh6.getTextSize();
        dj2Var2 = obj3.lS5Rgt96tfkO;
        List list7222 = obj3.Y1f8riQaR6yg;
        hy hyVar2222 = obj3.a92UlCVFR9N8;
        z5 = obj3.dgRBjINgWbAK;
        n4 n4Var222 = o4.PxuCJdSBwIXG;
        if (z5) {
        }
        str3 = r1;
        f = 0.0f;
        charSequence = str3;
        if (list3.isEmpty()) {
        }
        j2 = 0;
        if (!(charSequence instanceof Spannable)) {
        }
        if2Var = dj2Var2.PxuCJdSBwIXG.cpQdD2nAriOS;
        if2.Companion.getClass();
        if (cs0.wdg6QnbFHrFF(if2Var, if2.TSizfFm2Yiuu)) {
        }
        ln1Var = dj2Var2.TSizfFm2Yiuu;
        if ((ln1Var != null || (xm1Var = ln1Var.lS5Rgt96tfkO) == null) ? false : xm1Var.PxuCJdSBwIXG) {
        }
        p11Var = dj2Var2.lS5Rgt96tfkO.a92UlCVFR9N8;
        if (p11Var == null) {
        }
        ryVscX7ZL4Ux = ni0.ryVscX7ZL4Ux(dj2Var2.lS5Rgt96tfkO.TSizfFm2Yiuu, textSize222, hyVar2222);
        if (!Float.isNaN(ryVscX7ZL4Ux)) {
        }
        zh2Var = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
        if (zh2Var != null) {
        }
        obj2 = ym2.class;
        arrayList = new ArrayList(list4.size());
        size2 = list4.size();
        i7 = 0;
        while (i7 < size2) {
        }
        List list922222 = list4;
        q82 q82Var522222 = dj2Var2.PxuCJdSBwIXG;
        pb0 pb0Var222222 = q82Var522222.a92UlCVFR9N8;
        if (pb0Var222222 != null) {
        }
        ws wsVar22222 = new ws(6, spannableString, p4Var2);
        if (arrayList.size() <= 1) {
        }
        size3 = list922222.size();
        z6 = false;
        i9 = 0;
        while (i9 < size3) {
        }
        if (z6) {
        }
        list5 = list7222;
        zh2Var2 = dj2Var2.lS5Rgt96tfkO.Y1f8riQaR6yg;
        if (zh2Var2 != null) {
        }
        size4 = list922222.size();
        while (i10 < size4) {
        }
        if (list5.size() > 0) {
        }
    }

    @Override // defpackage.zi1
    public final float PxuCJdSBwIXG() {
        hw0 hw0Var = this.OPXfSBeufaJ8;
        float f = hw0Var.e9gEMXR7LXtO;
        TextPaint textPaint = hw0Var.lS5Rgt96tfkO;
        if (!Float.isNaN(f)) {
            return hw0Var.e9gEMXR7LXtO;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = hw0Var.PxuCJdSBwIXG;
        lineInstance.setText(new nj(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, b51.OPXfSBeufaJ8);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new br0(i, next, 1));
            } else {
                br0 br0Var = (br0) priorityQueue.peek();
                if (br0Var != null && br0Var.OPXfSBeufaJ8 - br0Var.rtx2ld2ELZv4 < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new br0(i, next, 1));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                u9.RfyTYNmI9Srp();
                return 0.0f;
            }
            br0 br0Var2 = (br0) it.next();
            f2 = Layout.getDesiredWidth(hw0Var.lS5Rgt96tfkO(), br0Var2.rtx2ld2ELZv4, br0Var2.OPXfSBeufaJ8, textPaint);
            while (it.hasNext()) {
                br0 br0Var3 = (br0) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(hw0Var.lS5Rgt96tfkO(), br0Var3.rtx2ld2ELZv4, br0Var3.OPXfSBeufaJ8, textPaint));
            }
        }
        hw0Var.e9gEMXR7LXtO = f2;
        return f2;
    }

    @Override // defpackage.zi1
    public final float TSizfFm2Yiuu() {
        return this.OPXfSBeufaJ8.TSizfFm2Yiuu();
    }

    @Override // defpackage.zi1
    public final boolean lS5Rgt96tfkO() {
        m9 m9Var = this.wdg6QnbFHrFF;
        if (m9Var != null ? m9Var.IAToe7bXGz4N() : false) {
            return true;
        }
        if (!this.dgRBjINgWbAK && f2.e9gEMXR7LXtO(this.lS5Rgt96tfkO)) {
            i2 i2Var = b50.PxuCJdSBwIXG;
            i2 i2Var2 = b50.PxuCJdSBwIXG;
            i92 i92Var = (i92) i2Var2.OPXfSBeufaJ8;
            if (i92Var == null) {
                if (x40.Y1f8riQaR6yg()) {
                    i92Var = i2Var2.a92UlCVFR9N8();
                    i2Var2.OPXfSBeufaJ8 = i92Var;
                } else {
                    i92Var = ov2.RAsUl2FVSrh6;
                }
            }
            if (((Boolean) i92Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
