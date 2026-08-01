package com.bytedance.sdk.component.icD.pvs;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;
import org.slf4j.Marker;

/* compiled from: HttpUrl.java */
/* loaded from: classes.dex */
public final class yiw {
    private static final char[] Jd = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String Mxy;
    private final String NB;
    private final String Wyp;
    final String icD;
    final String pvs;
    private final String sUS;
    private final List<String> so;
    final int vG;
    private final List<String> yiw;

    yiw(pvs pvsVar) {
        this.pvs = pvsVar.pvs;
        this.NB = pvs(pvsVar.icD, false);
        this.sUS = pvs(pvsVar.vG, false);
        this.icD = pvsVar.Jd;
        this.vG = pvsVar.pvs();
        this.yiw = pvs(pvsVar.sUS, false);
        this.so = pvsVar.yiw != null ? pvs(pvsVar.yiw, true) : null;
        this.Mxy = pvsVar.so != null ? pvs(pvsVar.so, false) : null;
        this.Wyp = pvsVar.toString();
    }

    public URL pvs() {
        try {
            return new URL(this.Wyp);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String icD() {
        if (this.NB.isEmpty()) {
            return "";
        }
        int length = this.pvs.length() + 3;
        String str = this.Wyp;
        return this.Wyp.substring(length, com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, length, str.length(), ":@"));
    }

    public String vG() {
        if (this.sUS.isEmpty()) {
            return "";
        }
        return this.Wyp.substring(this.Wyp.indexOf(58, this.pvs.length() + 3) + 1, this.Wyp.indexOf(64));
    }

    public static int pvs(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void pvs(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public List<String> Jd() {
        int indexOf = this.Wyp.indexOf(47, this.pvs.length() + 3);
        String str = this.Wyp;
        int pvs2 = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < pvs2) {
            int i = indexOf + 1;
            int pvs3 = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(this.Wyp, i, pvs2, '/');
            arrayList.add(this.Wyp.substring(i, pvs3));
            indexOf = pvs3;
        }
        return arrayList;
    }

    public String NB() {
        if (this.so == null) {
            return null;
        }
        int indexOf = this.Wyp.indexOf(63) + 1;
        String str = this.Wyp;
        return this.Wyp.substring(indexOf, com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, indexOf, str.length(), '#'));
    }

    static void icD(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(str2);
            }
        }
    }

    static List<String> icD(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public static yiw vG(String str) {
        pvs pvsVar = new pvs();
        if (pvsVar.pvs((yiw) null, str) == pvs.EnumC0051pvs.SUCCESS) {
            return pvsVar.icD();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof yiw) && ((yiw) obj).Wyp.equals(this.Wyp);
    }

    public int hashCode() {
        return this.Wyp.hashCode();
    }

    public String toString() {
        return this.Wyp;
    }

    /* compiled from: HttpUrl.java */
    public static final class pvs {
        String Jd;
        String pvs;
        final List<String> sUS;
        String so;
        List<String> yiw;
        String icD = "";
        String vG = "";
        int NB = -1;

        /* compiled from: HttpUrl.java */
        /* renamed from: com.bytedance.sdk.component.icD.pvs.yiw$pvs$pvs, reason: collision with other inner class name */
        enum EnumC0051pvs {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public pvs() {
            ArrayList arrayList = new ArrayList();
            this.sUS = arrayList;
            arrayList.add("");
        }

        public pvs pvs(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.pvs = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.pvs = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str)));
            }
            return this;
        }

        public pvs icD(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String NB = NB(str, 0, str.length());
            if (NB == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
            }
            this.Jd = NB;
            return this;
        }

        int pvs() {
            int i = this.NB;
            return i != -1 ? i : yiw.pvs(this.pvs);
        }

        public pvs vG(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegments == null");
            }
            return pvs(str, true);
        }

        private pvs pvs(String str, boolean z) {
            int i = 0;
            do {
                int pvs = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, i, str.length(), "/\\");
                pvs(str, i, pvs, pvs < str.length(), z);
                i = pvs + 1;
            } while (i <= str.length());
            return this;
        }

        public pvs Jd(String str) {
            this.yiw = str != null ? yiw.icD(yiw.pvs(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public pvs pvs(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.yiw == null) {
                this.yiw = new ArrayList();
            }
            this.yiw.add(yiw.pvs(str, " \"'<>#&=", true, false, true, true));
            this.yiw.add(str2 != null ? yiw.pvs(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public yiw icD() {
            if (this.pvs == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.Jd == null) {
                throw new IllegalStateException("host == null");
            }
            return new yiw(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.pvs);
            sb.append("://");
            if (!this.icD.isEmpty() || !this.vG.isEmpty()) {
                sb.append(this.icD);
                if (!this.vG.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.vG);
                }
                sb.append('@');
            }
            if (this.Jd.indexOf(58) != -1) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.Jd);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb.append(this.Jd);
            }
            int pvs = pvs();
            if (pvs != yiw.pvs(this.pvs)) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(pvs);
            }
            yiw.pvs(sb, this.sUS);
            if (this.yiw != null) {
                sb.append('?');
                yiw.icD(sb, this.yiw);
            }
            if (this.so != null) {
                sb.append('#');
                sb.append(this.so);
            }
            return sb.toString();
        }

        EnumC0051pvs pvs(yiw yiwVar, String str) {
            int pvs;
            int i;
            int pvs2 = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, 0, str.length());
            int icD = com.bytedance.sdk.component.icD.pvs.icD.Mxy.icD(str, pvs2, str.length());
            if (icD(str, pvs2, icD) != -1) {
                if (str.regionMatches(true, pvs2, "https:", 0, 6)) {
                    this.pvs = "https";
                    pvs2 += 6;
                } else if (str.regionMatches(true, pvs2, "http:", 0, 5)) {
                    this.pvs = "http";
                    pvs2 += 5;
                } else {
                    return EnumC0051pvs.UNSUPPORTED_SCHEME;
                }
            } else if (yiwVar != null) {
                this.pvs = yiwVar.pvs;
            } else {
                return EnumC0051pvs.MISSING_SCHEME;
            }
            int vG = vG(str, pvs2, icD);
            char c = '?';
            char c2 = '#';
            if (vG >= 2 || yiwVar == null || !yiwVar.pvs.equals(this.pvs)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = pvs2 + vG;
                while (true) {
                    pvs = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, i2, icD, "@/\\?#");
                    char charAt = pvs != icD ? str.charAt(pvs) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z) {
                            int pvs3 = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, i2, pvs, AbstractJsonLexerKt.COLON);
                            i = pvs;
                            String pvs4 = yiw.pvs(str, i2, pvs3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                pvs4 = this.icD + "%40" + pvs4;
                            }
                            this.icD = pvs4;
                            if (pvs3 != i) {
                                this.vG = yiw.pvs(str, pvs3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = pvs;
                            this.vG += "%40" + yiw.pvs(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                        c = '?';
                        c2 = '#';
                    }
                }
                int Jd = Jd(str, i2, pvs);
                int i3 = Jd + 1;
                if (i3 < pvs) {
                    this.Jd = NB(str, i2, Jd);
                    int sUS = sUS(str, i3, pvs);
                    this.NB = sUS;
                    if (sUS == -1) {
                        return EnumC0051pvs.INVALID_PORT;
                    }
                } else {
                    this.Jd = NB(str, i2, Jd);
                    this.NB = yiw.pvs(this.pvs);
                }
                if (this.Jd == null) {
                    return EnumC0051pvs.INVALID_HOST;
                }
                pvs2 = pvs;
            } else {
                this.icD = yiwVar.icD();
                this.vG = yiwVar.vG();
                this.Jd = yiwVar.icD;
                this.NB = yiwVar.vG;
                this.sUS.clear();
                this.sUS.addAll(yiwVar.Jd());
                if (pvs2 == icD || str.charAt(pvs2) == '#') {
                    Jd(yiwVar.NB());
                }
            }
            int pvs5 = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, pvs2, icD, "?#");
            pvs(str, pvs2, pvs5);
            if (pvs5 < icD && str.charAt(pvs5) == '?') {
                int pvs6 = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, pvs5, icD, '#');
                this.yiw = yiw.icD(yiw.pvs(str, pvs5 + 1, pvs6, " \"'<>#", true, false, true, true, null));
                pvs5 = pvs6;
            }
            if (pvs5 < icD && str.charAt(pvs5) == '#') {
                this.so = yiw.pvs(str, 1 + pvs5, icD, "", true, false, false, false, null);
            }
            return EnumC0051pvs.SUCCESS;
        }

        private void pvs(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.sUS.clear();
                this.sUS.add("");
                i++;
            } else {
                List<String> list = this.sUS;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str, i3, i2, "/\\");
                boolean z = i < i2;
                pvs(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void pvs(String str, int i, int i2, boolean z, boolean z2) {
            String pvs = yiw.pvs(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (NB(pvs)) {
                return;
            }
            if (sUS(pvs)) {
                vG();
                return;
            }
            if (this.sUS.get(r11.size() - 1).isEmpty()) {
                this.sUS.set(r11.size() - 1, pvs);
            } else {
                this.sUS.add(pvs);
            }
            if (z) {
                this.sUS.add("");
            }
        }

        private boolean NB(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean sUS(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void vG() {
            if (this.sUS.remove(r0.size() - 1).isEmpty() && !this.sUS.isEmpty()) {
                this.sUS.set(r0.size() - 1, "");
            } else {
                this.sUS.add("");
            }
        }

        private static int icD(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int vG(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int Jd(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static String NB(String str, int i, int i2) {
            return com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(yiw.pvs(str, i, i2, false));
        }

        private static int sUS(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(yiw.pvs(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }
    }

    static String pvs(String str, boolean z) {
        return pvs(str, 0, str.length(), z);
    }

    private List<String> pvs(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? pvs(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String pvs(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.bytedance.sdk.component.icD.pvs.icD.pvs pvsVar = new com.bytedance.sdk.component.icD.pvs.icD.pvs();
                pvsVar.pvs(str, i, i3);
                pvs(pvsVar, str, i3, i2, z);
                return pvsVar.vG();
            }
        }
        return str.substring(i, i2);
    }

    static void pvs(com.bytedance.sdk.component.icD.pvs.icD.pvs pvsVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int pvs2 = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str.charAt(i + 1));
                int pvs3 = com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str.charAt(i3));
                if (pvs2 != -1 && pvs3 != -1) {
                    pvsVar.icD((pvs2 << 4) + pvs3);
                    i = i3;
                }
                pvsVar.pvs(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    pvsVar.icD(32);
                }
                pvsVar.pvs(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static boolean pvs(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs(str.charAt(i3)) != -1;
    }

    static String pvs(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || pvs(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            com.bytedance.sdk.component.icD.pvs.icD.pvs pvsVar = new com.bytedance.sdk.component.icD.pvs.icD.pvs();
            pvsVar.pvs(str, i, i3);
            pvs(pvsVar, str, i3, i2, str2, z, z2, z3, z4, charset);
            return pvsVar.vG();
        }
        return str.substring(i, i2);
    }

    static void pvs(com.bytedance.sdk.component.icD.pvs.icD.pvs pvsVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.icD.pvs.icD.pvs pvsVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    pvsVar.pvs(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !pvs(str, i, i2)))))) {
                    if (pvsVar2 == null) {
                        pvsVar2 = new com.bytedance.sdk.component.icD.pvs.icD.pvs();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.icD.pvs.icD.Mxy.pvs)) {
                        pvsVar2.pvs(codePointAt);
                    } else {
                        pvsVar2.pvs(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!pvsVar2.pvs()) {
                        int icD = pvsVar2.icD() & 255;
                        pvsVar.icD(37);
                        char[] cArr = Jd;
                        pvsVar.icD((int) cArr[(icD >> 4) & 15]);
                        pvsVar.icD((int) cArr[icD & 15]);
                    }
                } else {
                    pvsVar.pvs(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    static String pvs(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return pvs(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
