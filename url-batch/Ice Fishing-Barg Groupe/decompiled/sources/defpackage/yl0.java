package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class yl0 {
    static {
        ah.Companion.getClass();
        zg.lS5Rgt96tfkO("\"\\");
        zg.lS5Rgt96tfkO("\t ,=");
    }

    public static final boolean PxuCJdSBwIXG(nv1 nv1Var) {
        if (cs0.wdg6QnbFHrFF((String) nv1Var.rtx2ld2ELZv4.TSizfFm2Yiuu, "HEAD")) {
            return false;
        }
        int i = nv1Var.dgRBjINgWbAK;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || mv2.e9gEMXR7LXtO(nv1Var) != -1) {
            return true;
        }
        String PxuCJdSBwIXG = nv1Var.cpQdD2nAriOS.PxuCJdSBwIXG("Transfer-Encoding");
        if (PxuCJdSBwIXG == null) {
            PxuCJdSBwIXG = null;
        }
        return "chunked".equalsIgnoreCase(PxuCJdSBwIXG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0226, code lost:
    
        if (defpackage.lr1.Y1f8riQaR6yg.PxuCJdSBwIXG(r15) == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x020f, code lost:
    
        if (defpackage.iv2.PxuCJdSBwIXG.TSizfFm2Yiuu(r0) == false) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void lS5Rgt96tfkO(gt gtVar, gm0 gm0Var, hj0 hj0Var) {
        int i;
        List list;
        List list2;
        et etVar;
        gm0 gm0Var2;
        long j;
        et etVar2;
        String str;
        gtVar.getClass();
        gm0Var.getClass();
        hj0Var.getClass();
        if (gtVar == gt.TSizfFm2Yiuu) {
            return;
        }
        et.Companion.getClass();
        int size = hj0Var.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (true) {
            i = 2;
            if (i2 >= size) {
                break;
            }
            if ("Set-Cookie".equalsIgnoreCase(hj0Var.lS5Rgt96tfkO(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(hj0Var.Y1f8riQaR6yg(i2));
            }
            i2++;
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            list.getClass();
        } else {
            list = null;
        }
        List list3 = p50.rtx2ld2ELZv4;
        List list4 = list == null ? list3 : list;
        int size2 = list4.size();
        int i3 = 0;
        ArrayList arrayList2 = null;
        while (i3 < size2) {
            String str2 = (String) list4.get(i3);
            str2.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            char c = ';';
            int Y1f8riQaR6yg = kv2.Y1f8riQaR6yg(str2, ';', 0, 0, 6);
            char c2 = '=';
            int Y1f8riQaR6yg2 = kv2.Y1f8riQaR6yg(str2, '=', 0, Y1f8riQaR6yg, i);
            if (Y1f8riQaR6yg2 != Y1f8riQaR6yg) {
                int RAsUl2FVSrh6 = kv2.RAsUl2FVSrh6(0, Y1f8riQaR6yg2, str2);
                String substring = str2.substring(RAsUl2FVSrh6, kv2.rtx2ld2ELZv4(RAsUl2FVSrh6, Y1f8riQaR6yg2, str2));
                if (substring.length() != 0 && kv2.a92UlCVFR9N8(substring) == -1) {
                    int RAsUl2FVSrh62 = kv2.RAsUl2FVSrh6(Y1f8riQaR6yg2 + 1, Y1f8riQaR6yg, str2);
                    String substring2 = str2.substring(RAsUl2FVSrh62, kv2.rtx2ld2ELZv4(RAsUl2FVSrh62, Y1f8riQaR6yg, str2));
                    if (kv2.a92UlCVFR9N8(substring2) == -1) {
                        int i4 = Y1f8riQaR6yg + 1;
                        int length = str2.length();
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long j2 = -1;
                        long j3 = 253402300799999L;
                        String str3 = null;
                        String str4 = null;
                        boolean z4 = true;
                        String str5 = null;
                        while (true) {
                            if (i4 < length) {
                                int TSizfFm2Yiuu = kv2.TSizfFm2Yiuu(str2, c, i4, length);
                                int TSizfFm2Yiuu2 = kv2.TSizfFm2Yiuu(str2, c2, i4, TSizfFm2Yiuu);
                                int RAsUl2FVSrh63 = kv2.RAsUl2FVSrh6(i4, TSizfFm2Yiuu2, str2);
                                String substring3 = str2.substring(RAsUl2FVSrh63, kv2.rtx2ld2ELZv4(RAsUl2FVSrh63, TSizfFm2Yiuu2, str2));
                                if (TSizfFm2Yiuu2 < TSizfFm2Yiuu) {
                                    int RAsUl2FVSrh64 = kv2.RAsUl2FVSrh6(TSizfFm2Yiuu2 + 1, TSizfFm2Yiuu, str2);
                                    str = str2.substring(RAsUl2FVSrh64, kv2.rtx2ld2ELZv4(RAsUl2FVSrh64, TSizfFm2Yiuu, str2));
                                } else {
                                    str = "";
                                }
                                if (substring3.equalsIgnoreCase("expires")) {
                                    try {
                                        j3 = dt.lS5Rgt96tfkO(str, str.length());
                                        z2 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i4 = TSizfFm2Yiuu + 1;
                                    c = ';';
                                    c2 = '=';
                                } else if (substring3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j2 = Long.parseLong(str);
                                        if (j2 <= 0) {
                                            j2 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        compile.getClass();
                                        if (!compile.matcher(str).matches()) {
                                            throw e;
                                        }
                                        j2 = pa2.yQRudnv4La6p(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z2 = true;
                                    i4 = TSizfFm2Yiuu + 1;
                                    c = ';';
                                    c2 = '=';
                                } else {
                                    if (substring3.equalsIgnoreCase("domain")) {
                                        if (str.endsWith(".")) {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        if (pa2.yQRudnv4La6p(str, ".", false)) {
                                            str = str.substring(".".length());
                                        }
                                        String lS5Rgt96tfkO = iv2.lS5Rgt96tfkO(str);
                                        if (lS5Rgt96tfkO == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        str4 = lS5Rgt96tfkO;
                                        z4 = false;
                                    } else if (substring3.equalsIgnoreCase("path")) {
                                        str3 = str;
                                    } else if (substring3.equalsIgnoreCase("secure")) {
                                        z3 = true;
                                    } else if (substring3.equalsIgnoreCase("httponly")) {
                                        z = true;
                                    } else if (substring3.equalsIgnoreCase("samesite")) {
                                        str5 = str;
                                    }
                                    i4 = TSizfFm2Yiuu + 1;
                                    c = ';';
                                    c2 = '=';
                                }
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    gm0Var2 = gm0Var;
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j4 = currentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j4 < currentTimeMillis || j4 > 253402300799999L) {
                                        gm0Var2 = gm0Var;
                                        j = 253402300799999L;
                                    } else {
                                        gm0Var2 = gm0Var;
                                        j = j4;
                                    }
                                } else {
                                    gm0Var2 = gm0Var;
                                    j = j3;
                                }
                                String str6 = gm0Var2.Y1f8riQaR6yg;
                                if (str4 == null) {
                                    str4 = str6;
                                } else if (!cs0.wdg6QnbFHrFF(str6, str4)) {
                                    str6.getClass();
                                    if (str6.endsWith(str4)) {
                                        if (str6.charAt((str6.length() - str4.length()) - 1) == '.') {
                                        }
                                    }
                                    etVar2 = null;
                                    etVar = etVar2;
                                }
                                if (str6.length() != str4.length()) {
                                    lr1.Companion.getClass();
                                }
                                if (str3 == null || !pa2.yQRudnv4La6p(str3, "/", false)) {
                                    String lS5Rgt96tfkO2 = gm0Var2.lS5Rgt96tfkO();
                                    int v6yxfmkxNKhL = ia2.v6yxfmkxNKhL(lS5Rgt96tfkO2, '/', 0, 6);
                                    str3 = v6yxfmkxNKhL != 0 ? lS5Rgt96tfkO2.substring(0, v6yxfmkxNKhL) : "/";
                                }
                                etVar2 = new et(substring, substring2, j, str4, str3, z3, z, z2, z4, str5);
                                etVar = etVar2;
                            }
                        }
                    }
                }
            }
            etVar = null;
            if (etVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(etVar);
            }
            i3++;
            i = 2;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            list2.getClass();
        } else {
            list2 = null;
        }
        if (list2 != null) {
            list3 = list2;
        }
        list3.isEmpty();
    }
}
