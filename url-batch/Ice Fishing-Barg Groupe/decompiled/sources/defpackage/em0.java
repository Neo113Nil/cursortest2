package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class em0 {
    public String PxuCJdSBwIXG;
    public ArrayList RAsUl2FVSrh6;
    public String Y1f8riQaR6yg;
    public String rtx2ld2ELZv4;
    public String lS5Rgt96tfkO = "";
    public String TSizfFm2Yiuu = "";
    public int e9gEMXR7LXtO = -1;
    public final ArrayList a92UlCVFR9N8 = fx1.PsecLrZVVK61("");

    public static ArrayList TSizfFm2Yiuu(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int rxipThha848g = ia2.rxipThha848g(str, '&', i, 4);
            if (rxipThha848g == -1) {
                rxipThha848g = str.length();
            }
            int rxipThha848g2 = ia2.rxipThha848g(str, '=', i, 4);
            if (rxipThha848g2 == -1 || rxipThha848g2 > rxipThha848g) {
                arrayList.add(str.substring(i, rxipThha848g));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, rxipThha848g2));
                arrayList.add(str.substring(rxipThha848g2 + 1, rxipThha848g));
            }
            i = rxipThha848g + 1;
        }
        return arrayList;
    }

    public final gm0 PxuCJdSBwIXG() {
        ArrayList arrayList;
        String str = this.PxuCJdSBwIXG;
        if (str == null) {
            u9.rtx2ld2ELZv4("scheme == null");
            return null;
        }
        String JHNfcAUfKc4G = mm2.JHNfcAUfKc4G(this.lS5Rgt96tfkO, 0, 0, 7);
        String JHNfcAUfKc4G2 = mm2.JHNfcAUfKc4G(this.TSizfFm2Yiuu, 0, 0, 7);
        String str2 = this.Y1f8riQaR6yg;
        if (str2 == null) {
            u9.rtx2ld2ELZv4("host == null");
            return null;
        }
        int i = this.e9gEMXR7LXtO;
        if (i == -1) {
            fm0 fm0Var = gm0.Companion;
            String str3 = this.PxuCJdSBwIXG;
            str3.getClass();
            fm0Var.getClass();
            i = fm0.PxuCJdSBwIXG(str3);
        }
        ArrayList arrayList2 = this.a92UlCVFR9N8;
        ArrayList arrayList3 = new ArrayList(al.KZw9XyiywG4x(arrayList2, 10));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList3.add(mm2.JHNfcAUfKc4G((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.RAsUl2FVSrh6;
        if (arrayList4 != null) {
            arrayList = new ArrayList(al.KZw9XyiywG4x(arrayList4, 10));
            int size2 = arrayList4.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList4.get(i3);
                i3++;
                String str4 = (String) obj2;
                arrayList.add(str4 != null ? mm2.JHNfcAUfKc4G(str4, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str5 = this.rtx2ld2ELZv4;
        return new gm0(str, JHNfcAUfKc4G, JHNfcAUfKc4G2, str2, i, arrayList, str5 != null ? mm2.JHNfcAUfKc4G(str5, 0, 0, 7) : null, toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x01f2, code lost:
    
        if (r8 < 65536) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0072, code lost:
    
        if (r13 == ':') goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lS5Rgt96tfkO(gm0 gm0Var, String str) {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        int i4;
        int lS5Rgt96tfkO;
        char charAt;
        int i5;
        int i6;
        int i7;
        char charAt2;
        byte[] bArr = kv2.PxuCJdSBwIXG;
        int RAsUl2FVSrh6 = kv2.RAsUl2FVSrh6(0, str.length(), str);
        int rtx2ld2ELZv4 = kv2.rtx2ld2ELZv4(RAsUl2FVSrh6, str.length(), str);
        if (rtx2ld2ELZv4 - RAsUl2FVSrh6 >= 2) {
            char charAt3 = str.charAt(RAsUl2FVSrh6);
            if ((cs0.gPXPFXrUH4XX(charAt3, 97) >= 0 && cs0.gPXPFXrUH4XX(charAt3, 122) <= 0) || (cs0.gPXPFXrUH4XX(charAt3, 65) >= 0 && cs0.gPXPFXrUH4XX(charAt3, 90) <= 0)) {
                i = RAsUl2FVSrh6 + 1;
                while (true) {
                    if (i >= rtx2ld2ELZv4) {
                        break;
                    }
                    char charAt4 = str.charAt(i);
                    if (('a' <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i++;
                    }
                }
                if (i == -1) {
                    if (pa2.ngxnMNrpiKat(str, "https:", RAsUl2FVSrh6, true)) {
                        this.PxuCJdSBwIXG = "https";
                        RAsUl2FVSrh6 += 6;
                    } else {
                        if (!pa2.ngxnMNrpiKat(str, "http:", RAsUl2FVSrh6, true)) {
                            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                        }
                        this.PxuCJdSBwIXG = "http";
                        RAsUl2FVSrh6 += 5;
                    }
                } else {
                    if (gm0Var == null) {
                        u9.XL4ISE6Oc65B("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? ia2.JLGWdXyAxbxj(str, 6).concat("...") : str));
                        return;
                    }
                    this.PxuCJdSBwIXG = gm0Var.PxuCJdSBwIXG;
                }
                i2 = RAsUl2FVSrh6;
                i3 = 0;
                while (true) {
                    c = '\\';
                    c2 = '/';
                    if (i2 >= rtx2ld2ELZv4 || !((charAt2 = str.charAt(i2)) == '/' || charAt2 == '\\')) {
                        break;
                    }
                    i3++;
                    i2++;
                }
                ArrayList arrayList = this.a92UlCVFR9N8;
                char c3 = '#';
                if (i3 < 2 || gm0Var == null || !cs0.wdg6QnbFHrFF(gm0Var.PxuCJdSBwIXG, this.PxuCJdSBwIXG)) {
                    i4 = RAsUl2FVSrh6 + i3;
                    boolean z = false;
                    boolean z2 = false;
                    while (true) {
                        lS5Rgt96tfkO = kv2.lS5Rgt96tfkO(i4, rtx2ld2ELZv4, str, "@/\\?#");
                        charAt = lS5Rgt96tfkO == rtx2ld2ELZv4 ? str.charAt(lS5Rgt96tfkO) : (char) 65535;
                        if (charAt == 65535 || charAt == c3 || charAt == c2 || charAt == c || charAt == '?') {
                            break;
                        }
                        if (charAt == '@') {
                            if (z) {
                                this.TSizfFm2Yiuu += "%40" + mm2.pnx5pC0XzaCw(str, i4, lS5Rgt96tfkO, " \"':;<=>@[]^`{}|/\\?#", 112);
                            } else {
                                int TSizfFm2Yiuu = kv2.TSizfFm2Yiuu(str, ':', i4, lS5Rgt96tfkO);
                                String pnx5pC0XzaCw = mm2.pnx5pC0XzaCw(str, i4, TSizfFm2Yiuu, " \"':;<=>@[]^`{}|/\\?#", 112);
                                if (z2) {
                                    pnx5pC0XzaCw = this.lS5Rgt96tfkO + "%40" + pnx5pC0XzaCw;
                                }
                                this.lS5Rgt96tfkO = pnx5pC0XzaCw;
                                if (TSizfFm2Yiuu != lS5Rgt96tfkO) {
                                    this.TSizfFm2Yiuu = mm2.pnx5pC0XzaCw(str, TSizfFm2Yiuu + 1, lS5Rgt96tfkO, " \"':;<=>@[]^`{}|/\\?#", 112);
                                    z = true;
                                }
                                z2 = true;
                            }
                            i4 = lS5Rgt96tfkO + 1;
                            c3 = '#';
                            c = '\\';
                            c2 = '/';
                        }
                    }
                    i5 = i4;
                    while (true) {
                        if (i5 < lS5Rgt96tfkO) {
                            char charAt5 = str.charAt(i5);
                            if (charAt5 == ':') {
                                break;
                            }
                            if (charAt5 == '[') {
                                do {
                                    i5++;
                                    if (i5 < lS5Rgt96tfkO) {
                                    }
                                } while (str.charAt(i5) != ']');
                            }
                            i5++;
                        } else {
                            i5 = lS5Rgt96tfkO;
                            break;
                        }
                    }
                    i6 = i5 + 1;
                    if (i6 >= lS5Rgt96tfkO) {
                        this.Y1f8riQaR6yg = iv2.lS5Rgt96tfkO(mm2.JHNfcAUfKc4G(str, i4, i5, 4));
                        try {
                            i7 = Integer.parseInt(mm2.pnx5pC0XzaCw(str, i6, lS5Rgt96tfkO, "", 120));
                            if (1 <= i7) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i7 = -1;
                        this.e9gEMXR7LXtO = i7;
                        if (i7 == -1) {
                            throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i6, lS5Rgt96tfkO) + '\"').toString());
                        }
                    } else {
                        this.Y1f8riQaR6yg = iv2.lS5Rgt96tfkO(mm2.JHNfcAUfKc4G(str, i4, i5, 4));
                        fm0 fm0Var = gm0.Companion;
                        String str2 = this.PxuCJdSBwIXG;
                        str2.getClass();
                        fm0Var.getClass();
                        this.e9gEMXR7LXtO = fm0.PxuCJdSBwIXG(str2);
                    }
                    if (this.Y1f8riQaR6yg != null) {
                        throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i4, i5) + '\"').toString());
                    }
                    RAsUl2FVSrh6 = lS5Rgt96tfkO;
                } else {
                    this.lS5Rgt96tfkO = gm0Var.e9gEMXR7LXtO();
                    this.TSizfFm2Yiuu = gm0Var.PxuCJdSBwIXG();
                    this.Y1f8riQaR6yg = gm0Var.Y1f8riQaR6yg;
                    this.e9gEMXR7LXtO = gm0Var.e9gEMXR7LXtO;
                    arrayList.clear();
                    arrayList.addAll(gm0Var.TSizfFm2Yiuu());
                    if (RAsUl2FVSrh6 == rtx2ld2ELZv4 || str.charAt(RAsUl2FVSrh6) == '#') {
                        String Y1f8riQaR6yg = gm0Var.Y1f8riQaR6yg();
                        this.RAsUl2FVSrh6 = Y1f8riQaR6yg != null ? TSizfFm2Yiuu(mm2.pnx5pC0XzaCw(Y1f8riQaR6yg, 0, 0, " \"'<>#", 83)) : null;
                    }
                }
                int lS5Rgt96tfkO2 = kv2.lS5Rgt96tfkO(RAsUl2FVSrh6, rtx2ld2ELZv4, str, "?#");
                if (RAsUl2FVSrh6 != lS5Rgt96tfkO2) {
                    char charAt6 = str.charAt(RAsUl2FVSrh6);
                    if (charAt6 == '/' || charAt6 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        RAsUl2FVSrh6++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (RAsUl2FVSrh6 < lS5Rgt96tfkO2) {
                        int lS5Rgt96tfkO3 = kv2.lS5Rgt96tfkO(RAsUl2FVSrh6, lS5Rgt96tfkO2, str, "/\\");
                        boolean z3 = lS5Rgt96tfkO3 < lS5Rgt96tfkO2;
                        String pnx5pC0XzaCw2 = mm2.pnx5pC0XzaCw(str, RAsUl2FVSrh6, lS5Rgt96tfkO3, " \"<>^`{}|/\\?#", 112);
                        if (!pnx5pC0XzaCw2.equals(".") && !pnx5pC0XzaCw2.equalsIgnoreCase("%2e")) {
                            if (!pnx5pC0XzaCw2.equals("..") && !pnx5pC0XzaCw2.equalsIgnoreCase("%2e.") && !pnx5pC0XzaCw2.equalsIgnoreCase(".%2e") && !pnx5pC0XzaCw2.equalsIgnoreCase("%2e%2e")) {
                                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, pnx5pC0XzaCw2);
                                } else {
                                    arrayList.add(pnx5pC0XzaCw2);
                                }
                                if (z3) {
                                    arrayList.add("");
                                }
                            } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                arrayList.add("");
                            } else {
                                arrayList.set(arrayList.size() - 1, "");
                            }
                        }
                        RAsUl2FVSrh6 = z3 ? lS5Rgt96tfkO3 + 1 : lS5Rgt96tfkO3;
                    }
                }
                if (lS5Rgt96tfkO2 < rtx2ld2ELZv4 && str.charAt(lS5Rgt96tfkO2) == '?') {
                    int TSizfFm2Yiuu2 = kv2.TSizfFm2Yiuu(str, '#', lS5Rgt96tfkO2, rtx2ld2ELZv4);
                    this.RAsUl2FVSrh6 = TSizfFm2Yiuu(mm2.pnx5pC0XzaCw(str, lS5Rgt96tfkO2 + 1, TSizfFm2Yiuu2, " \"'<>#", 80));
                    lS5Rgt96tfkO2 = TSizfFm2Yiuu2;
                }
                if (lS5Rgt96tfkO2 >= rtx2ld2ELZv4 || str.charAt(lS5Rgt96tfkO2) != '#') {
                    return;
                }
                this.rtx2ld2ELZv4 = mm2.pnx5pC0XzaCw(str, lS5Rgt96tfkO2 + 1, rtx2ld2ELZv4, "", 48);
                return;
            }
        }
        i = -1;
        if (i == -1) {
        }
        i2 = RAsUl2FVSrh6;
        i3 = 0;
        while (true) {
            c = '\\';
            c2 = '/';
            if (i2 >= rtx2ld2ELZv4) {
                break;
            } else {
                break;
            }
            i3++;
            i2++;
        }
        ArrayList arrayList2 = this.a92UlCVFR9N8;
        char c32 = '#';
        if (i3 < 2) {
        }
        i4 = RAsUl2FVSrh6 + i3;
        boolean z4 = false;
        boolean z22 = false;
        while (true) {
            lS5Rgt96tfkO = kv2.lS5Rgt96tfkO(i4, rtx2ld2ELZv4, str, "@/\\?#");
            if (lS5Rgt96tfkO == rtx2ld2ELZv4) {
            }
            if (charAt == 65535) {
                break;
            } else {
                break;
            }
        }
        i5 = i4;
        while (true) {
            if (i5 < lS5Rgt96tfkO) {
            }
            i5++;
        }
        i6 = i5 + 1;
        if (i6 >= lS5Rgt96tfkO) {
        }
        if (this.Y1f8riQaR6yg != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
    
        if (r1 != defpackage.fm0.PxuCJdSBwIXG(r3)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.PxuCJdSBwIXG;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.lS5Rgt96tfkO.length() > 0 || this.TSizfFm2Yiuu.length() > 0) {
            sb.append(this.lS5Rgt96tfkO);
            if (this.TSizfFm2Yiuu.length() > 0) {
                sb.append(':');
                sb.append(this.TSizfFm2Yiuu);
            }
            sb.append('@');
        }
        String str2 = this.Y1f8riQaR6yg;
        if (str2 != null) {
            if (ia2.D0aTLcX6Uhyo(str2, ':')) {
                sb.append('[');
                sb.append(this.Y1f8riQaR6yg);
                sb.append(']');
            } else {
                sb.append(this.Y1f8riQaR6yg);
            }
        }
        int i = this.e9gEMXR7LXtO;
        if (i != -1 || this.PxuCJdSBwIXG != null) {
            if (i == -1) {
                fm0 fm0Var = gm0.Companion;
                String str3 = this.PxuCJdSBwIXG;
                str3.getClass();
                fm0Var.getClass();
                i = fm0.PxuCJdSBwIXG(str3);
            }
            String str4 = this.PxuCJdSBwIXG;
            if (str4 != null) {
                gm0.Companion.getClass();
            }
            sb.append(':');
            sb.append(i);
        }
        ArrayList arrayList = this.a92UlCVFR9N8;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.RAsUl2FVSrh6 != null) {
            sb.append('?');
            fm0 fm0Var2 = gm0.Companion;
            ArrayList arrayList2 = this.RAsUl2FVSrh6;
            arrayList2.getClass();
            fm0Var2.getClass();
            yq0 BjEWd04qc7Mw = ng0.BjEWd04qc7Mw(ng0.nLZGh9p8gVSu(0, arrayList2.size()), 2);
            int i3 = BjEWd04qc7Mw.rtx2ld2ELZv4;
            int i4 = BjEWd04qc7Mw.OPXfSBeufaJ8;
            int i5 = BjEWd04qc7Mw.wdg6QnbFHrFF;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    String str5 = (String) arrayList2.get(i3);
                    String str6 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append('&');
                    }
                    sb.append(str5);
                    if (str6 != null) {
                        sb.append('=');
                        sb.append(str6);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
        }
        if (this.rtx2ld2ELZv4 != null) {
            sb.append('#');
            sb.append(this.rtx2ld2ELZv4);
        }
        return sb.toString();
    }
}
