package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class cb1 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public Object RAsUl2FVSrh6;
    public Object TSizfFm2Yiuu;
    public Object Y1f8riQaR6yg;
    public Object a92UlCVFR9N8;
    public Serializable e9gEMXR7LXtO;
    public int lS5Rgt96tfkO;

    /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.io.Serializable] */
    public cb1() {
        this.PxuCJdSBwIXG = 1;
        this.TSizfFm2Yiuu = new ey1[32];
        this.Y1f8riQaR6yg = new float[32];
        this.e9gEMXR7LXtO = new byte[32];
        w81 w81Var = d02.PxuCJdSBwIXG;
        this.a92UlCVFR9N8 = new w81();
        this.RAsUl2FVSrh6 = new w81();
    }

    public static /* synthetic */ void x50lh2ztY7Y5(cb1 cb1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = cb1Var.lS5Rgt96tfkO;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        cb1Var.dgRBjINgWbAK(i, str, str2);
        throw null;
    }

    public String BRwzKIf41E4i() {
        if (gPXPFXrUH4XX() != 1) {
            return null;
        }
        String OPXfSBeufaJ8 = OPXfSBeufaJ8();
        this.a92UlCVFR9N8 = OPXfSBeufaJ8;
        return OPXfSBeufaJ8;
    }

    public boolean EcgxDIVH5in8() {
        int RfyTYNmI9Srp = RfyTYNmI9Srp();
        String str = (String) this.RAsUl2FVSrh6;
        if (RfyTYNmI9Srp >= str.length() || RfyTYNmI9Srp == -1 || str.charAt(RfyTYNmI9Srp) != ',') {
            return false;
        }
        this.lS5Rgt96tfkO++;
        return true;
    }

    public String OPXfSBeufaJ8() {
        String str = (String) this.a92UlCVFR9N8;
        if (str == null) {
            return Y1f8riQaR6yg();
        }
        str.getClass();
        this.a92UlCVFR9N8 = null;
        return str;
    }

    public int PxuCJdSBwIXG(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.e9gEMXR7LXtO).append((char) (cpQdD2nAriOS(charSequence, i + 3) + (cpQdD2nAriOS(charSequence, i) << 12) + (cpQdD2nAriOS(charSequence, i + 1) << 8) + (cpQdD2nAriOS(charSequence, i + 2) << 4)));
            return i2;
        }
        this.lS5Rgt96tfkO = i;
        if (i2 < charSequence.length()) {
            return PxuCJdSBwIXG(charSequence, this.lS5Rgt96tfkO);
        }
        x50lh2ztY7Y5(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public String QrzZRwfaDlRX(String str) {
        str.getClass();
        int i = this.lS5Rgt96tfkO;
        try {
            if (e9gEMXR7LXtO() == 6 && cs0.wdg6QnbFHrFF(BRwzKIf41E4i(), str)) {
                this.a92UlCVFR9N8 = null;
                if (e9gEMXR7LXtO() == 5) {
                    return BRwzKIf41E4i();
                }
            }
            return null;
        } finally {
            this.lS5Rgt96tfkO = i;
            this.a92UlCVFR9N8 = null;
        }
    }

    public void RAsUl2FVSrh6(char c) {
        int i = this.lS5Rgt96tfkO;
        if (i == -1) {
            S9EYkSpbGuxq(c);
            throw null;
        }
        String str = (String) this.RAsUl2FVSrh6;
        while (i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.lS5Rgt96tfkO = i2;
                if (charAt == c) {
                    return;
                }
                S9EYkSpbGuxq(c);
                throw null;
            }
            i = i2;
        }
        this.lS5Rgt96tfkO = -1;
        S9EYkSpbGuxq(c);
        throw null;
    }

    public int RfyTYNmI9Srp() {
        char charAt;
        int i = this.lS5Rgt96tfkO;
        if (i == -1) {
            return i;
        }
        String str = (String) this.RAsUl2FVSrh6;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.lS5Rgt96tfkO = i;
        return i;
    }

    public void S9EYkSpbGuxq(char c) {
        String str = (String) this.RAsUl2FVSrh6;
        int i = this.lS5Rgt96tfkO;
        if (i > 0 && c == '\"') {
            try {
                this.lS5Rgt96tfkO = i - 1;
                String wdg6QnbFHrFF = wdg6QnbFHrFF();
                this.lS5Rgt96tfkO = i;
                if (cs0.wdg6QnbFHrFF(wdg6QnbFHrFF, "null")) {
                    dgRBjINgWbAK(this.lS5Rgt96tfkO - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.lS5Rgt96tfkO = i;
                throw th;
            }
        }
        String D0aTLcX6Uhyo = mm2.D0aTLcX6Uhyo(mm2.IAToe7bXGz4N(c));
        int i2 = this.lS5Rgt96tfkO;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        x50lh2ztY7Y5(this, "Expected " + D0aTLcX6Uhyo + ", but had '" + ((i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, null, 4);
        throw null;
    }

    public void TSizfFm2Yiuu(String str, int i) {
        String str2 = (String) this.RAsUl2FVSrh6;
        if (str2.length() - i < str.length()) {
            x50lh2ztY7Y5(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                x50lh2ztY7Y5(this, "Expected valid boolean literal prefix, but had '" + wdg6QnbFHrFF() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.lS5Rgt96tfkO = str.length() + i;
    }

    public int XL4ISE6Oc65B(int i) {
        if (i < ((String) this.RAsUl2FVSrh6).length()) {
            return i;
        }
        return -1;
    }

    public String Y1f8riQaR6yg() {
        String str;
        StringBuilder sb = (StringBuilder) this.e9gEMXR7LXtO;
        String str2 = (String) this.RAsUl2FVSrh6;
        RAsUl2FVSrh6('\"');
        int i = this.lS5Rgt96tfkO;
        int rxipThha848g = ia2.rxipThha848g(str2, '\"', i, 4);
        if (rxipThha848g == -1) {
            wdg6QnbFHrFF();
            int i2 = this.lS5Rgt96tfkO;
            x50lh2ztY7Y5(this, o0.x50lh2ztY7Y5("Expected quotation mark '\"', but had '", (i2 == str2.length() || i2 < 0) ? "EOF" : String.valueOf(str2.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < rxipThha848g) {
            if (str2.charAt(i3) == '\\') {
                int i4 = this.lS5Rgt96tfkO;
                char charAt = str2.charAt(i3);
                boolean z = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        sb.append((CharSequence) str2, i4, i3);
                        int XL4ISE6Oc65B = XL4ISE6Oc65B(i3 + 1);
                        if (XL4ISE6Oc65B == -1) {
                            x50lh2ztY7Y5(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i5 = XL4ISE6Oc65B + 1;
                        char charAt2 = str2.charAt(XL4ISE6Oc65B);
                        if (charAt2 == 'u') {
                            i5 = PxuCJdSBwIXG(str2, i5);
                        } else {
                            char c = charAt2 < 'u' ? mj.PxuCJdSBwIXG[charAt2] : (char) 0;
                            if (c == 0) {
                                x50lh2ztY7Y5(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        i4 = XL4ISE6Oc65B(i5);
                        if (i4 == -1) {
                            x50lh2ztY7Y5(this, "Unexpected EOF", i4, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str2.length()) {
                            sb.append((CharSequence) str2, i4, i3);
                            i4 = XL4ISE6Oc65B(i3);
                            if (i4 == -1) {
                                x50lh2ztY7Y5(this, "Unexpected EOF", i4, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str2.charAt(i3);
                        }
                    }
                    i3 = i4;
                    z = true;
                    charAt = str2.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str2, i4, i3);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    str = sb2;
                } else {
                    str = str2.subSequence(i4, i3).toString();
                }
                this.lS5Rgt96tfkO = i3 + 1;
                return str;
            }
            i3++;
        }
        this.lS5Rgt96tfkO = rxipThha848g + 1;
        return str2.substring(i, rxipThha848g);
    }

    public byte a92UlCVFR9N8(byte b) {
        String str = (String) this.RAsUl2FVSrh6;
        byte e9gEMXR7LXtO = e9gEMXR7LXtO();
        if (e9gEMXR7LXtO == b) {
            return e9gEMXR7LXtO;
        }
        String D0aTLcX6Uhyo = mm2.D0aTLcX6Uhyo(b);
        int i = this.lS5Rgt96tfkO;
        int i2 = i > 0 ? i - 1 : i;
        x50lh2ztY7Y5(this, "Expected " + D0aTLcX6Uhyo + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, null, 4);
        throw null;
    }

    public int cpQdD2nAriOS(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        x50lh2ztY7Y5(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public void dgRBjINgWbAK(int i, String str, String str2) {
        String lS5Rgt96tfkO = ((j4) this.Y1f8riQaR6yg).lS5Rgt96tfkO();
        String str3 = (String) this.RAsUl2FVSrh6;
        str3.getClass();
        throw new nt0(vi0.EcgxDIVH5in8(i, str, lS5Rgt96tfkO, str2, ((lt0) this.TSizfFm2Yiuu).TSizfFm2Yiuu ? vi0.Pf0ThKz3j5YS(str3, i).toString() : null));
    }

    public byte e9gEMXR7LXtO() {
        String str = (String) this.RAsUl2FVSrh6;
        int i = this.lS5Rgt96tfkO;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.lS5Rgt96tfkO = i2;
                return mm2.IAToe7bXGz4N(charAt);
            }
            i = i2;
        }
        this.lS5Rgt96tfkO = str.length();
        return (byte) 10;
    }

    public byte gPXPFXrUH4XX() {
        String str = (String) this.RAsUl2FVSrh6;
        int i = this.lS5Rgt96tfkO;
        while (true) {
            int XL4ISE6Oc65B = XL4ISE6Oc65B(i);
            if (XL4ISE6Oc65B == -1) {
                this.lS5Rgt96tfkO = XL4ISE6Oc65B;
                return (byte) 10;
            }
            char charAt = str.charAt(XL4ISE6Oc65B);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.lS5Rgt96tfkO = XL4ISE6Oc65B;
                return mm2.IAToe7bXGz4N(charAt);
            }
            i = XL4ISE6Oc65B + 1;
        }
    }

    public boolean lS5Rgt96tfkO() {
        int i = this.lS5Rgt96tfkO;
        if (i == -1) {
            return false;
        }
        String str = (String) this.RAsUl2FVSrh6;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.lS5Rgt96tfkO = i;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i++;
        }
        this.lS5Rgt96tfkO = i;
        return false;
    }

    public ya1 r3s1LDPKFs1S(String str) {
        ta1 ta1Var;
        str.getClass();
        qc2 qc2Var = (qc2) this.RAsUl2FVSrh6;
        if (qc2Var == null || (ta1Var = (ta1) qc2Var.getValue()) == null) {
            return null;
        }
        za1.Companion.getClass();
        Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
        parse.getClass();
        Bundle Y1f8riQaR6yg = ta1Var.Y1f8riQaR6yg(parse, (LinkedHashMap) this.e9gEMXR7LXtO);
        if (Y1f8riQaR6yg == null) {
            return null;
        }
        return new ya1((za1) this.TSizfFm2Yiuu, Y1f8riQaR6yg, ta1Var.x50lh2ztY7Y5, ta1Var.lS5Rgt96tfkO(parse), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b6, code lost:
    
        x50lh2ztY7Y5(r22, "Expected numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0121, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        x50lh2ztY7Y5(r22, "Unexpected symbol '" + r15 + "' in numeric literal", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011d, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0122, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012e, code lost:
    
        if (r20 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        if (r2.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        x50lh2ztY7Y5(r22, "Expected closing quotation mark", r12, null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0145, code lost:
    
        x50lh2ztY7Y5(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014c, code lost:
    
        r22.lS5Rgt96tfkO = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
    
        if (r21 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        if (r11 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0166, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016b, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017b, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a5, code lost:
    
        if (r14 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ac, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b0, code lost:
    
        x50lh2ztY7Y5(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017e, code lost:
    
        x50lh2ztY7Y5(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0198, code lost:
    
        x50lh2ztY7Y5(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015f, code lost:
    
        if (r11 != true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0161, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019f, code lost:
    
        defpackage.u9.gPXPFXrUH4XX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a3, code lost:
    
        r10 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long rtx2ld2ELZv4() {
        boolean z;
        boolean z2;
        boolean z3;
        int XL4ISE6Oc65B = XL4ISE6Oc65B(RfyTYNmI9Srp());
        String str = (String) this.RAsUl2FVSrh6;
        if (XL4ISE6Oc65B < str.length() && XL4ISE6Oc65B != -1) {
            if (str.charAt(XL4ISE6Oc65B) == '\"') {
                XL4ISE6Oc65B++;
                if (XL4ISE6Oc65B == str.length()) {
                    x50lh2ztY7Y5(this, "EOF", 0, null, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i = XL4ISE6Oc65B;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i == str.length()) {
                    z2 = z;
                    z3 = z5;
                    break;
                }
                char charAt = str.charAt(i);
                if ((charAt != 'e' && charAt != 'E') || z5) {
                    z2 = z;
                    if (charAt == '-' && z5) {
                        if (i == XL4ISE6Oc65B) {
                            x50lh2ztY7Y5(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z4 = false;
                    } else if (charAt != '+' || !z5) {
                        z3 = z5;
                        if (charAt != '-') {
                            if (mm2.IAToe7bXGz4N(charAt) != 0) {
                                break;
                            }
                            int i2 = i + 1;
                            int i3 = charAt - '0';
                            if (i3 < 0 || i3 >= 10) {
                                break;
                            }
                            if (z3) {
                                j = (j * 10) + i3;
                            } else {
                                j2 = (j2 * 10) - i3;
                                if (j2 > 0) {
                                    x50lh2ztY7Y5(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            i = i2;
                            z = z2;
                            z5 = z3;
                        } else {
                            if (i != XL4ISE6Oc65B) {
                                x50lh2ztY7Y5(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                                throw null;
                            }
                            i++;
                            z = z2;
                            z5 = z3;
                            z6 = true;
                        }
                    } else {
                        if (i == XL4ISE6Oc65B) {
                            x50lh2ztY7Y5(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z4 = true;
                    }
                } else {
                    if (i == XL4ISE6Oc65B) {
                        x50lh2ztY7Y5(this, "Unexpected symbol '" + charAt + "' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z4 = true;
                    z5 = true;
                }
            }
        } else {
            x50lh2ztY7Y5(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public String toString() {
        switch (this.PxuCJdSBwIXG) {
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.RAsUl2FVSrh6);
                sb.append("', currentPosition=");
                return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
            default:
                return super.toString();
        }
    }

    public String wdg6QnbFHrFF() {
        String str;
        StringBuilder sb = (StringBuilder) this.e9gEMXR7LXtO;
        String str2 = (String) this.RAsUl2FVSrh6;
        String str3 = (String) this.a92UlCVFR9N8;
        if (str3 != null) {
            str3.getClass();
            this.a92UlCVFR9N8 = null;
            return str3;
        }
        int RfyTYNmI9Srp = RfyTYNmI9Srp();
        if (RfyTYNmI9Srp >= str2.length() || RfyTYNmI9Srp == -1) {
            x50lh2ztY7Y5(this, "EOF", RfyTYNmI9Srp, null, 4);
            throw null;
        }
        byte IAToe7bXGz4N = mm2.IAToe7bXGz4N(str2.charAt(RfyTYNmI9Srp));
        if (IAToe7bXGz4N == 1) {
            return OPXfSBeufaJ8();
        }
        if (IAToe7bXGz4N != 0) {
            x50lh2ztY7Y5(this, "Expected beginning of the string, but got " + str2.charAt(RfyTYNmI9Srp), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (mm2.IAToe7bXGz4N(str2.charAt(RfyTYNmI9Srp)) == 0) {
            RfyTYNmI9Srp++;
            if (RfyTYNmI9Srp >= str2.length()) {
                sb.append((CharSequence) str2, this.lS5Rgt96tfkO, RfyTYNmI9Srp);
                int XL4ISE6Oc65B = XL4ISE6Oc65B(RfyTYNmI9Srp);
                if (XL4ISE6Oc65B == -1) {
                    this.lS5Rgt96tfkO = RfyTYNmI9Srp;
                    sb.append((CharSequence) str2, 0, 0);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    return sb2;
                }
                RfyTYNmI9Srp = XL4ISE6Oc65B;
                z = true;
            }
        }
        int i = this.lS5Rgt96tfkO;
        if (z) {
            sb.append((CharSequence) str2, i, RfyTYNmI9Srp);
            String sb3 = sb.toString();
            sb.setLength(0);
            str = sb3;
        } else {
            str = str2.subSequence(i, RfyTYNmI9Srp).toString();
        }
        this.lS5Rgt96tfkO = RfyTYNmI9Srp;
        return str;
    }

    public cb1(String str, lt0 lt0Var) {
        this.PxuCJdSBwIXG = 2;
        str.getClass();
        this.TSizfFm2Yiuu = lt0Var;
        this.Y1f8riQaR6yg = new j4(lt0Var);
        this.e9gEMXR7LXtO = new StringBuilder();
        this.RAsUl2FVSrh6 = str;
    }

    public cb1(za1 za1Var) {
        this.PxuCJdSBwIXG = 0;
        this.TSizfFm2Yiuu = za1Var;
        this.Y1f8riQaR6yg = new ArrayList();
        this.e9gEMXR7LXtO = new LinkedHashMap();
    }
}
