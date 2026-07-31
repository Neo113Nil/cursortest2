package com.bytedance.sdk.component.fs.zmn;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.B5;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Marker;

/* loaded from: classes13.dex */
public final class nps {
    private static final char[] fb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String btk;
    private final String bvs;
    final String fs;
    private final String hhw;
    private final String iv;
    private final List<String> nps;
    private final List<String> zg;
    final String zmn;
    final int zn;

    nps(zmn zmnVar) {
        this.zmn = zmnVar.zmn;
        this.btk = zmn(zmnVar.fs, false);
        this.hhw = zmn(zmnVar.zn, false);
        this.fs = zmnVar.fb;
        this.zn = zmnVar.zmn();
        this.nps = zmn(zmnVar.hhw, false);
        List<String> list = zmnVar.nps;
        this.zg = list != null ? zmn(list, true) : null;
        String str = zmnVar.zg;
        this.bvs = str != null ? zmn(str, false) : null;
        this.iv = zmnVar.toString();
    }

    public URL zmn() {
        try {
            return new URL(this.iv);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String fs() {
        if (this.btk.isEmpty()) {
            return "";
        }
        int length = this.zmn.length() + 3;
        String str = this.iv;
        return this.iv.substring(length, com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, length, str.length(), ":@"));
    }

    public String zn() {
        if (this.hhw.isEmpty()) {
            return "";
        }
        return this.iv.substring(this.iv.indexOf(58, this.zmn.length() + 3) + 1, this.iv.indexOf(64));
    }

    public static int zmn(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void zmn(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public List<String> fb() {
        int indexOf = this.iv.indexOf(47, this.zmn.length() + 3);
        String str = this.iv;
        int zmn2 = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < zmn2) {
            int i = indexOf + 1;
            int zmn3 = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(this.iv, i, zmn2, '/');
            arrayList.add(this.iv.substring(i, zmn3));
            indexOf = zmn3;
        }
        return arrayList;
    }

    public String btk() {
        if (this.zg == null) {
            return null;
        }
        int indexOf = this.iv.indexOf(63) + 1;
        String str = this.iv;
        return this.iv.substring(indexOf, com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, indexOf, str.length(), '#'));
    }

    static void fs(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(B5.U);
                sb.append(str2);
            }
        }
    }

    static List<String> fs(String str) {
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

    public static nps zn(String str) {
        zmn zmnVar = new zmn();
        if (zmnVar.zmn((nps) null, str) == zmn.EnumC0130zmn.SUCCESS) {
            return zmnVar.fs();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof nps) && ((nps) obj).iv.equals(this.iv);
    }

    public int hashCode() {
        return this.iv.hashCode();
    }

    public String toString() {
        return this.iv;
    }

    public static final class zmn {
        String fb;
        final List<String> hhw;
        List<String> nps;
        String zg;
        String zmn;
        String fs = "";
        String zn = "";
        int btk = -1;

        /* renamed from: com.bytedance.sdk.component.fs.zmn.nps$zmn$zmn, reason: collision with other inner class name */
        enum EnumC0130zmn {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public zmn() {
            ArrayList arrayList = new ArrayList();
            this.hhw = arrayList;
            arrayList.add("");
        }

        public zmn zmn(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.zmn = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.zmn = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            return this;
        }

        public zmn fs(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String btk = btk(str, 0, str.length());
            if (btk == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.fb = btk;
            return this;
        }

        int zmn() {
            int i = this.btk;
            return i != -1 ? i : nps.zmn(this.zmn);
        }

        public zmn zn(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegments == null");
            }
            return zmn(str, true);
        }

        private zmn zmn(String str, boolean z) {
            int i = 0;
            do {
                int zmn = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, i, str.length(), "/\\");
                zmn(str, i, zmn, zmn < str.length(), z);
                i = zmn + 1;
            } while (i <= str.length());
            return this;
        }

        public zmn fb(String str) {
            this.nps = str != null ? nps.fs(nps.zmn(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public zmn zmn(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.nps == null) {
                this.nps = new ArrayList();
            }
            this.nps.add(nps.zmn(str, " \"'<>#&=", true, false, true, true));
            this.nps.add(str2 != null ? nps.zmn(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public nps fs() {
            if (this.zmn == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.fb == null) {
                throw new IllegalStateException("host == null");
            }
            return new nps(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zmn);
            sb.append("://");
            if (!this.fs.isEmpty() || !this.zn.isEmpty()) {
                sb.append(this.fs);
                if (!this.zn.isEmpty()) {
                    sb.append(':');
                    sb.append(this.zn);
                }
                sb.append('@');
            }
            if (this.fb.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.fb);
                sb.append(']');
            } else {
                sb.append(this.fb);
            }
            int zmn = zmn();
            if (zmn != nps.zmn(this.zmn)) {
                sb.append(':');
                sb.append(zmn);
            }
            nps.zmn(sb, this.hhw);
            if (this.nps != null) {
                sb.append('?');
                nps.fs(sb, this.nps);
            }
            if (this.zg != null) {
                sb.append('#');
                sb.append(this.zg);
            }
            return sb.toString();
        }

        EnumC0130zmn zmn(nps npsVar, String str) {
            int zmn;
            int i;
            int zmn2 = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, 0, str.length());
            int fs = com.bytedance.sdk.component.fs.zmn.fs.bvs.fs(str, zmn2, str.length());
            if (fs(str, zmn2, fs) != -1) {
                if (str.regionMatches(true, zmn2, "https:", 0, 6)) {
                    this.zmn = "https";
                    zmn2 += 6;
                } else if (str.regionMatches(true, zmn2, "http:", 0, 5)) {
                    this.zmn = "http";
                    zmn2 += 5;
                } else {
                    return EnumC0130zmn.UNSUPPORTED_SCHEME;
                }
            } else if (npsVar != null) {
                this.zmn = npsVar.zmn;
            } else {
                return EnumC0130zmn.MISSING_SCHEME;
            }
            int zn = zn(str, zmn2, fs);
            char c = '?';
            char c2 = '#';
            if (zn >= 2 || npsVar == null || !npsVar.zmn.equals(this.zmn)) {
                boolean z = false;
                boolean z2 = false;
                int i2 = zmn2 + zn;
                while (true) {
                    zmn = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, i2, fs, "@/\\?#");
                    char charAt = zmn != fs ? str.charAt(zmn) : (char) 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z) {
                            int zmn3 = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, i2, zmn, ':');
                            i = zmn;
                            String zmn4 = nps.zmn(str, i2, zmn3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                zmn4 = this.fs + "%40" + zmn4;
                            }
                            this.fs = zmn4;
                            if (zmn3 != i) {
                                this.zn = nps.zmn(str, zmn3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = zmn;
                            this.zn += "%40" + nps.zmn(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                        c = '?';
                        c2 = '#';
                    }
                }
                int fb = fb(str, i2, zmn);
                int i3 = fb + 1;
                if (i3 < zmn) {
                    this.fb = btk(str, i2, fb);
                    int hhw = hhw(str, i3, zmn);
                    this.btk = hhw;
                    if (hhw == -1) {
                        return EnumC0130zmn.INVALID_PORT;
                    }
                } else {
                    this.fb = btk(str, i2, fb);
                    this.btk = nps.zmn(this.zmn);
                }
                if (this.fb == null) {
                    return EnumC0130zmn.INVALID_HOST;
                }
                zmn2 = zmn;
            } else {
                this.fs = npsVar.fs();
                this.zn = npsVar.zn();
                this.fb = npsVar.fs;
                this.btk = npsVar.zn;
                this.hhw.clear();
                this.hhw.addAll(npsVar.fb());
                if (zmn2 == fs || str.charAt(zmn2) == '#') {
                    fb(npsVar.btk());
                }
            }
            int zmn5 = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, zmn2, fs, "?#");
            zmn(str, zmn2, zmn5);
            if (zmn5 < fs && str.charAt(zmn5) == '?') {
                int zmn6 = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, zmn5, fs, '#');
                this.nps = nps.fs(nps.zmn(str, zmn5 + 1, zmn6, " \"'<>#", true, false, true, true, null));
                zmn5 = zmn6;
            }
            if (zmn5 < fs && str.charAt(zmn5) == '#') {
                this.zg = nps.zmn(str, 1 + zmn5, fs, "", true, false, false, false, null);
            }
            return EnumC0130zmn.SUCCESS;
        }

        private void zmn(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.hhw.clear();
                this.hhw.add("");
                i++;
            } else {
                List<String> list = this.hhw;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str, i3, i2, "/\\");
                boolean z = i < i2;
                zmn(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void zmn(String str, int i, int i2, boolean z, boolean z2) {
            String zmn = nps.zmn(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (btk(zmn)) {
                return;
            }
            if (hhw(zmn)) {
                zn();
                return;
            }
            if (this.hhw.get(r11.size() - 1).isEmpty()) {
                this.hhw.set(r11.size() - 1, zmn);
            } else {
                this.hhw.add(zmn);
            }
            if (z) {
                this.hhw.add("");
            }
        }

        private boolean btk(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean hhw(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void zn() {
            if (this.hhw.remove(r0.size() - 1).isEmpty() && !this.hhw.isEmpty()) {
                this.hhw.set(r0.size() - 1, "");
            } else {
                this.hhw.add("");
            }
        }

        private static int fs(String str, int i, int i2) {
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

        private static int zn(String str, int i, int i2) {
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

        private static int fb(String str, int i, int i2) {
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

        private static String btk(String str, int i, int i2) {
            return com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(nps.zmn(str, i, i2, false));
        }

        private static int hhw(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(nps.zmn(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }
    }

    static String zmn(String str, boolean z) {
        return zmn(str, 0, str.length(), z);
    }

    private List<String> zmn(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? zmn(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String zmn(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.bytedance.sdk.component.fs.zmn.fs.zmn zmnVar = new com.bytedance.sdk.component.fs.zmn.fs.zmn();
                zmnVar.zmn(str, i, i3);
                zmn(zmnVar, str, i3, i2, z);
                return zmnVar.zn();
            }
        }
        return str.substring(i, i2);
    }

    static void zmn(com.bytedance.sdk.component.fs.zmn.fs.zmn zmnVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int zmn2 = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str.charAt(i + 1));
                int zmn3 = com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str.charAt(i3));
                if (zmn2 != -1 && zmn3 != -1) {
                    zmnVar.fs((zmn2 << 4) + zmn3);
                    i = i3;
                }
                zmnVar.zmn(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    zmnVar.fs(32);
                }
                zmnVar.zmn(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static boolean zmn(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn(str.charAt(i3)) != -1;
    }

    static String zmn(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || zmn(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            com.bytedance.sdk.component.fs.zmn.fs.zmn zmnVar = new com.bytedance.sdk.component.fs.zmn.fs.zmn();
            zmnVar.zmn(str, i, i3);
            zmn(zmnVar, str, i3, i2, str2, z, z2, z3, z4, charset);
            return zmnVar.zn();
        }
        return str.substring(i, i2);
    }

    static void zmn(com.bytedance.sdk.component.fs.zmn.fs.zmn zmnVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.fs.zmn.fs.zmn zmnVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    zmnVar.zmn(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !zmn(str, i, i2)))))) {
                    if (zmnVar2 == null) {
                        zmnVar2 = new com.bytedance.sdk.component.fs.zmn.fs.zmn();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.fs.zmn.fs.bvs.zmn)) {
                        zmnVar2.zmn(codePointAt);
                    } else {
                        zmnVar2.zmn(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!zmnVar2.zmn()) {
                        byte fs = zmnVar2.fs();
                        int i3 = fs & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        zmnVar.fs(37);
                        char[] cArr = fb;
                        zmnVar.fs((int) cArr[(i3 >> 4) & 15]);
                        zmnVar.fs((int) cArr[fs & 15]);
                    }
                } else {
                    zmnVar.zmn(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    static String zmn(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return zmn(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
