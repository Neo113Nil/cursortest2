package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0542Jv {
    public static byte[] A02;
    public static String[] A03 = {"WgUeKuj9wfEgVxNwMhsYWmskS6gvsk4u", "lY3t8mYoNwyGRU5cssOmtzsYdTPyfvrC", "tzc0Un4Rz02llsU2wRoiLNj111WzmA0w", "wjCansXDTCdJlU5xzgIWdtLXD8W6m4ff", "dSf2E5RYsrIqqVu4QtCEIfuVexQKgaAl", "hprG2SUWJwqzwErLsBPmt0UTVTrRmWBo", "Dvzgny", "YcbZLjapWumuyxPaIgpkq7v611"};
    public static final Pattern A04;
    public static final Pattern A05;
    public final C4J A00 = new C4J();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ Opcodes.LREM);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{8, 90, 83, Ascii.ETB, 57, 121, 34, 34, 123, 109, 125, 106, 96, 71, 95, 72, 69, 64, 77, 9, 79, 70, 71, 93, 4, 90, 64, 83, 76, 19, 9, Ascii.SO, 95, 109, 106, 126, 124, 124, 75, 123, 123, 88, 105, 122, 123, 109, 122, 36, 86, Ascii.NAK, Ascii.DC2, Utf8.REPLACEMENT_BYTE, 38, 32, 42, 44, 116, 107, 97, Ascii.DC2, Ascii.ETB, 107, Ascii.DC4, 99, 96, 107, Ascii.NAK, Ascii.DC4, 44, 90, 90, 77, 72, 41, 66, 95, 75, 47, 88, 46, 92, 91, 77, 41, 66, 95, 75, 47, 89, 91, 90, 2, 10, Ascii.SO, Ascii.ETB, Ascii.US, Ascii.SO, 87, 91, 86, 39, 42, 42, 19, 16, Ascii.DC2, Ascii.SUB, Ascii.SYN, 3, Ascii.RS, 4, Ascii.US, Ascii.NAK, 92, Ascii.DC2, Ascii.RS, Ascii.GS, Ascii.RS, 3, 93, 80, 83, 91, 52, 56, 59, 56, 37, 6, Ascii.VT, 5, Ascii.VT, Ascii.SYN, 17, 116, 124, 51, 58, 59, 33, 120, 51, 52, 56, 60, 57, 44, 100, 109, 108, 118, 47, 113, 107, 120, 103, 111, 102, 103, 125, 36, 122, 125, 112, 101, 108, 40, 33, 32, 58, 99, 57, 43, 39, 41, 38, 58, 101, 120, 109, 96, 101, 111, Ascii.DC2, Ascii.VT, Ascii.CAN, Ascii.SI, 119, Byte.MAX_VALUE, 124, 123, 108, 119, 35, 126, 97, 125, 103, 122, 103, 97, 96, 42, 59, 38, 42, 115, Base64.padSymbol, 49, 51, 60, 55, 48, 59, 115, 43, 46, 44, 55, 57, 54, 42, 69, 84, 73, 69, Ascii.FS, 85, 84, 82, 94, 67, 80, 69, 88, 94, 95, 117, 110, 100, 101, 114, Ascii.DC2, 9, 3, 2, Ascii.NAK, Ascii.VT, Ascii.SO, 9, 2, 37, 115};
    }

    static {
        A07();
        A05 = Pattern.compile(A01(49, 19, 56));
        A04 = Pattern.compile(A01(68, 32, 3));
    }

    public static char A00(C4J c4j, int i) {
        return (char) c4j.A0l()[i];
    }

    public static String A02(C4J c4j) {
        int limit = c4j.A09();
        int A0A = c4j.A0A();
        char c = 0;
        while (limit < A0A && c == 0) {
            int i = limit + 1;
            int position = c4j.A0l()[limit];
            int limit2 = (char) position;
            c = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i;
        }
        int position2 = c4j.A09();
        String trim = c4j.A0W((limit - 1) - position2).trim();
        int limit3 = A03[6].length();
        if (limit3 == 22) {
            throw new RuntimeException();
        }
        A03[6] = "T";
        return trim;
    }

    public static String A03(C4J c4j, StringBuilder sb) {
        sb.setLength(0);
        int A09 = c4j.A09();
        int A0A = c4j.A0A();
        boolean z = false;
        while (A09 < A0A && !z) {
            int position = c4j.A0l()[A09];
            char c = (char) position;
            if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                A09++;
                sb.append(c);
            } else {
                z = true;
            }
        }
        int position2 = c4j.A09();
        c4j.A0g(A09 - position2);
        return sb.toString();
    }

    public static String A04(C4J c4j, StringBuilder sb) {
        A09(c4j);
        if (c4j.A07() == 0) {
            return null;
        }
        String A032 = A03(c4j, sb);
        String A01 = A01(0, 0, 111);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) c4j.A0I());
        return identifier;
    }

    public static String A05(C4J c4j, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int A09 = c4j.A09();
            String token = A04(c4j, sb);
            if (token == null) {
                return null;
            }
            if (A01(252, 1, 127).equals(token) || A01(11, 1, 32).equals(token)) {
                c4j.A0f(A09);
                z = true;
            } else {
                sb2.append(token);
            }
        }
        String token2 = sb2.toString();
        String[] strArr = A03;
        if (strArr[5].charAt(6) == strArr[0].charAt(6)) {
            throw new RuntimeException();
        }
        A03[1] = "H7IbVoVWHhMCEaN9uIz63JDuRBiIUDdu";
        return token2;
    }

    public static String A06(C4J c4j, StringBuilder sb) {
        A09(c4j);
        if (c4j.A07() < 5) {
            return null;
        }
        String A0W = c4j.A0W(5);
        String cueSelector = A01(6, 5, 105);
        if (!cueSelector.equals(A0W)) {
            return null;
        }
        int A09 = c4j.A09();
        String token = A04(c4j, sb);
        if (token == null) {
            return null;
        }
        String cueSelector2 = A01(251, 1, 47);
        if (cueSelector2.equals(token)) {
            c4j.A0f(A09);
            String cueSelector3 = A01(0, 0, 111);
            return cueSelector3;
        }
        String str = null;
        String cueSelector4 = A01(3, 1, 78);
        if (cueSelector4.equals(token)) {
            str = A02(c4j);
        }
        String target = A04(c4j, sb);
        if (A03[1].charAt(23) == '0') {
            throw new RuntimeException();
        }
        A03[2] = "kXJ9Slail85MSzeGoJKC016PF6DECpEt";
        String cueSelector5 = A01(4, 1, 97);
        if (cueSelector5.equals(target)) {
            return str;
        }
        return null;
    }

    public static void A08(C4J c4j) {
        String line;
        do {
            line = c4j.A0T();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A09(C4J c4j) {
        boolean skipping = true;
        while (c4j.A07() > 0 && skipping) {
            boolean A0E = A0E(c4j);
            String[] strArr = A03;
            if (strArr[5].charAt(6) == strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            A03[4] = "0TKGD6osFOak97huLTwvjNDJFBkvRURl";
            if (!A0E) {
                boolean skipping2 = A0D(c4j);
                if (!skipping2) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0A(C4J c4j, C0546Jz c0546Jz, StringBuilder sb) {
        A09(c4j);
        String A032 = A03(c4j, sb);
        String A01 = A01(0, 0, 111);
        if (A01.equals(A032)) {
            return;
        }
        String property = A03[7];
        if (property.length() != 9) {
            String[] strArr = A03;
            strArr[5] = "0USPULEwqSqheHB8AwvifNHGUwFlc4Dk";
            strArr[0] = "K61Ol0RKHiZGAookV7xLX0vZAqBJUPJk";
            String A012 = A01(5, 1, 50);
            String property2 = A04(c4j, sb);
            if (!A012.equals(property2)) {
                return;
            }
            A09(c4j);
            String token = A05(c4j, sb);
            if (token == null || A01.equals(token)) {
                return;
            }
            int A09 = c4j.A09();
            String A042 = A04(c4j, sb);
            String property3 = A01(11, 1, 32);
            if (!property3.equals(A042)) {
                String property4 = A01(252, 1, 127);
                if (property4.equals(A042)) {
                    c4j.A0f(A09);
                } else {
                    return;
                }
            }
            String property5 = A01(Opcodes.LSHR, 5, 38);
            if (property5.equals(A032)) {
                c0546Jz.A0C(C3V.A00(token));
                return;
            }
            String property6 = A01(103, 16, 0);
            if (property6.equals(A032)) {
                c0546Jz.A0B(C3V.A00(token));
                return;
            }
            String property7 = A01(Opcodes.ANEWARRAY, 13, 127);
            boolean z = true;
            if (property7.equals(A032)) {
                String property8 = A01(Opcodes.INVOKESPECIAL, 4, 12);
                if (property8.equals(token)) {
                    c0546Jz.A0E(1);
                    return;
                }
                String property9 = A01(237, 5, Opcodes.LREM);
                if (!property9.equals(token)) {
                    return;
                }
                c0546Jz.A0E(2);
                return;
            }
            String[] strArr2 = A03;
            String str = strArr2[5];
            String value = strArr2[0];
            int position = str.charAt(6);
            if (position != value.charAt(6)) {
                A03[7] = "r";
                String property10 = A01(202, 20, 47);
                if (property10.equals(A032)) {
                    String property11 = A01(100, 3, 55);
                    if (!property11.equals(token)) {
                        String property12 = A01(128, 6, 19);
                        if (!token.startsWith(property12)) {
                            z = false;
                        }
                    }
                    c0546Jz.A0H(z);
                    return;
                }
                String property13 = A01(222, 15, 64);
                boolean equals = property13.equals(A032);
                int position2 = A03[1].charAt(23);
                if (position2 == 48) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A03;
                strArr3[5] = "yV6z32KBYC5kRTQJBEYXfmL3n0QpULhq";
                strArr3[0] = "ddMdMWLPn2YWu0ZxAW3O28brDgrMgVms";
                if (equals) {
                    String property14 = A01(242, 9, 22);
                    if (!property14.equals(token)) {
                        return;
                    }
                    c0546Jz.A0J(true);
                    return;
                }
                String property15 = A01(Opcodes.L2I, 11, 36);
                if (property15.equals(A032)) {
                    c0546Jz.A0F(token);
                    return;
                }
                String property16 = A01(Opcodes.IF_ACMPNE, 11, 63);
                if (property16.equals(A032)) {
                    String property17 = A01(Opcodes.DNEG, 4, 78);
                    if (!property17.equals(token)) {
                        return;
                    }
                    c0546Jz.A0G(true);
                    return;
                }
                String property18 = A01(156, 10, 120);
                if (property18.equals(A032)) {
                    String property19 = A01(Opcodes.RETURN, 6, Opcodes.LUSHR);
                    if (!property19.equals(token)) {
                        return;
                    }
                    c0546Jz.A0I(true);
                    return;
                }
                String property20 = A01(Opcodes.I2S, 9, Opcodes.DREM);
                if (!property20.equals(A032)) {
                    return;
                }
                A0C(token, c0546Jz);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0B(C0546Jz c0546Jz, String str) {
        if (A01(0, 0, 111).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = A05.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c0546Jz.A0N((String) C3M.A01(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] A1O = AbstractC01484a.A1O(str, A01(47, 2, 9));
        String str2 = A1O[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c0546Jz.A0M(str2.substring(0, indexOf2));
            int voiceStartIndex = indexOf2 + 1;
            c0546Jz.A0L(str2.substring(voiceStartIndex));
        } else {
            c0546Jz.A0M(str2);
        }
        int voiceStartIndex2 = A1O.length;
        if (voiceStartIndex2 > 1) {
            int voiceStartIndex3 = A1O.length;
            c0546Jz.A0O((String[]) AbstractC01484a.A1J(A1O, 1, voiceStartIndex3));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0C(String str, C0546Jz c0546Jz) {
        char c;
        Matcher matcher = A04.matcher(AbstractC1466iY.A01(str));
        if (!matcher.matches()) {
            AnonymousClass44.A07(A01(32, 15, Opcodes.LSHL), A01(12, 20, 88) + str + A01(1, 2, 12));
            return;
        }
        String str2 = (String) C3M.A01(matcher.group(2));
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals(A01(0, 1, 92))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3240:
                if (str2.equals(A01(Opcodes.I2F, 2, 96))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3592:
                if (str2.equals(A01(Opcodes.NEW, 2, Opcodes.FNEG))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                c0546Jz.A0D(1);
                break;
            case 1:
                c0546Jz.A0D(2);
                break;
            case 2:
                if (A03[6].length() != 22) {
                    A03[3] = "l0BGY6Ka6m0f3MeGwvnWH7AIpst7Q8cB";
                    c0546Jz.A0D(3);
                    break;
                } else {
                    throw new RuntimeException();
                }
            default:
                throw new IllegalStateException();
        }
        c0546Jz.A0A(Float.parseFloat((String) C3M.A01(matcher.group(1))));
    }

    public static boolean A0D(C4J c4j) {
        int position = c4j.A09();
        int limit = c4j.A0A();
        byte[] A0l = c4j.A0l();
        if (position + 2 > limit) {
            return false;
        }
        int i = position + 1;
        if (A0l[position] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (A0l[i] == 42) {
            while (i2 + 1 < limit) {
                int i3 = i2 + 1;
                char skippedChar = (char) A0l[i2];
                if (skippedChar == '*') {
                    char skippedChar2 = A0l[i3];
                    if (skippedChar2 == '/') {
                        limit = i3 + 1;
                        i2 = limit;
                    }
                }
                i2 = i3;
            }
            c4j.A0g(limit - c4j.A09());
            return true;
        }
        return false;
    }

    public static boolean A0E(C4J c4j) {
        switch (A00(c4j, c4j.A09())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c4j.A0g(1);
                return true;
            default:
                return false;
        }
    }

    public final List<C0546Jz> A0F(C4J c4j) {
        String selector;
        this.A01.setLength(0);
        int A09 = c4j.A09();
        A08(c4j);
        C4J c4j2 = this.A00;
        byte[] A0l = c4j.A0l();
        int initialInputPosition = c4j.A09();
        c4j2.A0j(A0l, initialInputPosition);
        this.A00.A0f(A09);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String selector2 = A06(this.A00, this.A01);
            if (selector2 == null) {
                return arrayList;
            }
            if (!A01(251, 1, 47).equals(A04(this.A00, this.A01))) {
                return arrayList;
            }
            C0546Jz c0546Jz = new C0546Jz();
            A0B(c0546Jz, selector2);
            String str = null;
            boolean z = false;
            while (true) {
                selector = A01(252, 1, 127);
                if (z) {
                    break;
                }
                int A092 = this.A00.A09();
                str = A04(this.A00, this.A01);
                z = str == null || selector.equals(str);
                if (!z) {
                    this.A00.A0f(A092);
                    A0A(this.A00, c0546Jz, this.A01);
                }
            }
            if (selector.equals(str)) {
                arrayList.add(c0546Jz);
            }
        }
    }
}
