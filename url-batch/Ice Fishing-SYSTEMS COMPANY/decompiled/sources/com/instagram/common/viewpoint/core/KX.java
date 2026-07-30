package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network/classes2.dex */
public final class KX {
    public static byte[] A02;
    public static String[] A03 = {"WgUeKuj9wfEgVxNwMhsYWmskS6gvsk4u", "lY3t8mYoNwyGRU5cssOmtzsYdTPyfvrC", "tzc0Un4Rz02llsU2wRoiLNj111WzmA0w", "wjCansXDTCdJlU5xzgIWdtLXD8W6m4ff", "dSf2E5RYsrIqqVu4QtCEIfuVexQKgaAl", "hprG2SUWJwqzwErLsBPmt0UTVTrRmWBo", "Dvzgny", "YcbZLjapWumuyxPaIgpkq7v611"};
    public static final Pattern A04;
    public static final Pattern A05;
    public final C06464v A00 = new C06464v();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{8, 90, 83, 23, 57, 121, 34, 34, 123, 109, 125, 106, 96, 71, 95, 72, 69, c.f16475b, 77, 9, 79, 70, 71, 93, 4, 90, c.f16475b, 83, 76, 19, 9, 14, 95, 109, 106, 126, 124, 124, 75, 123, 123, 88, 105, 122, 123, 109, 122, 36, 86, 21, 18, c.f16476c, 38, 32, 42, 44, 116, 107, 97, 18, 23, 107, 20, 99, 96, 107, 21, 20, 44, 90, 90, 77, 72, 41, 66, 95, 75, 47, 88, 46, 92, 91, 77, 41, 66, 95, 75, 47, 89, 91, 90, 2, 10, 14, 23, 31, 14, 87, 91, 86, 39, 42, 42, 19, 16, 18, 26, 22, 3, 30, 4, 31, 21, 92, 18, 30, 29, 30, 3, 93, 80, 83, 91, 52, 56, 59, 56, 37, 6, 11, 5, 11, 22, 17, 116, 124, 51, 58, 59, 33, 120, 51, 52, 56, 60, 57, 44, 100, 109, 108, 118, 47, 113, 107, 120, 103, 111, 102, 103, 125, 36, 122, 125, 112, 101, 108, 40, 33, 32, 58, 99, 57, 43, 39, 41, 38, 58, 101, 120, 109, 96, 101, 111, 18, 11, 24, 15, 119, Byte.MAX_VALUE, 124, 123, 108, 119, 35, 126, 97, 125, 103, 122, 103, 97, 96, 42, 59, 38, 42, 115, 61, 49, 51, 60, 55, 48, 59, 115, 43, 46, 44, 55, 57, 54, 42, 69, 84, 73, 69, 28, 85, 84, 82, 94, 67, 80, 69, 88, 94, 95, 117, 110, 100, 101, 114, 18, 9, 3, 2, 21, 11, 14, 9, 2, 37, 115};
    }

    static {
        A07();
        A05 = Pattern.compile(A01(49, 19, 56));
        A04 = Pattern.compile(A01(68, 32, 3));
    }

    public static char A00(C06464v c06464v, int i) {
        return (char) c06464v.A0l()[i];
    }

    public static String A02(C06464v c06464v) {
        int limit = c06464v.A09();
        int A0A = c06464v.A0A();
        char c4 = 0;
        while (limit < A0A && c4 == 0) {
            int i = limit + 1;
            int position = c06464v.A0l()[limit];
            int limit2 = (char) position;
            c4 = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i;
        }
        int position2 = c06464v.A09();
        String trim = c06464v.A0W((limit - 1) - position2).trim();
        int limit3 = A03[6].length();
        if (limit3 == 22) {
            throw new RuntimeException();
        }
        A03[6] = "T";
        return trim;
    }

    public static String A03(C06464v c06464v, StringBuilder sb) {
        sb.setLength(0);
        int A09 = c06464v.A09();
        int A0A = c06464v.A0A();
        boolean z8 = false;
        while (A09 < A0A && !z8) {
            int position = c06464v.A0l()[A09];
            char c4 = (char) position;
            if ((c4 >= 'A' && c4 <= 'Z') || ((c4 >= 'a' && c4 <= 'z') || ((c4 >= '0' && c4 <= '9') || c4 == '#' || c4 == '-' || c4 == '.' || c4 == '_'))) {
                A09++;
                sb.append(c4);
            } else {
                z8 = true;
            }
        }
        int position2 = c06464v.A09();
        c06464v.A0g(A09 - position2);
        return sb.toString();
    }

    public static String A04(C06464v c06464v, StringBuilder sb) {
        A09(c06464v);
        if (c06464v.A07() == 0) {
            return null;
        }
        String A032 = A03(c06464v, sb);
        String A01 = A01(0, 0, 111);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) c06464v.A0I());
        return identifier;
    }

    public static String A05(C06464v c06464v, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z8 = false;
        while (!z8) {
            int A09 = c06464v.A09();
            String token = A04(c06464v, sb);
            if (token == null) {
                return null;
            }
            if (A01(252, 1, a.f21886R).equals(token) || A01(11, 1, 32).equals(token)) {
                c06464v.A0f(A09);
                z8 = true;
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

    public static String A06(C06464v c06464v, StringBuilder sb) {
        A09(c06464v);
        if (c06464v.A07() < 5) {
            return null;
        }
        String A0W = c06464v.A0W(5);
        String cueSelector = A01(6, 5, 105);
        if (!cueSelector.equals(A0W)) {
            return null;
        }
        int A09 = c06464v.A09();
        String token = A04(c06464v, sb);
        if (token == null) {
            return null;
        }
        String cueSelector2 = A01(251, 1, 47);
        if (cueSelector2.equals(token)) {
            c06464v.A0f(A09);
            String cueSelector3 = A01(0, 0, 111);
            return cueSelector3;
        }
        String str = null;
        String cueSelector4 = A01(3, 1, 78);
        if (cueSelector4.equals(token)) {
            str = A02(c06464v);
        }
        String target = A04(c06464v, sb);
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

    public static void A08(C06464v c06464v) {
        String line;
        do {
            line = c06464v.A0T();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A09(C06464v c06464v) {
        boolean skipping = true;
        while (c06464v.A07() > 0 && skipping) {
            boolean A0E = A0E(c06464v);
            String[] strArr = A03;
            if (strArr[5].charAt(6) == strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            A03[4] = "0TKGD6osFOak97huLTwvjNDJFBkvRURl";
            if (!A0E) {
                boolean skipping2 = A0D(c06464v);
                if (!skipping2) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0A(C06464v c06464v, C1021Kb c1021Kb, StringBuilder sb) {
        A09(c06464v);
        String A032 = A03(c06464v, sb);
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
            String property2 = A04(c06464v, sb);
            if (!A012.equals(property2)) {
                return;
            }
            A09(c06464v);
            String token = A05(c06464v, sb);
            if (token == null || A01.equals(token)) {
                return;
            }
            int A09 = c06464v.A09();
            String A042 = A04(c06464v, sb);
            String property3 = A01(11, 1, 32);
            if (!property3.equals(A042)) {
                String property4 = A01(252, 1, a.f21886R);
                if (property4.equals(A042)) {
                    c06464v.A0f(A09);
                } else {
                    return;
                }
            }
            String property5 = A01(123, 5, 38);
            if (property5.equals(A032)) {
                c1021Kb.A0C(AnonymousClass47.A00(token));
                return;
            }
            String property6 = A01(103, 16, 0);
            if (property6.equals(A032)) {
                c1021Kb.A0B(AnonymousClass47.A00(token));
                return;
            }
            String property7 = A01(189, 13, a.f21886R);
            boolean z8 = true;
            if (property7.equals(A032)) {
                String property8 = A01(183, 4, 12);
                if (property8.equals(token)) {
                    c1021Kb.A0E(1);
                    return;
                }
                String property9 = A01(237, 5, 113);
                if (!property9.equals(token)) {
                    return;
                }
                c1021Kb.A0E(2);
                return;
            }
            String[] strArr2 = A03;
            String str = strArr2[5];
            String value = strArr2[0];
            int position = str.charAt(6);
            if (position != value.charAt(6)) {
                A03[7] = d.bv;
                String property10 = A01(202, 20, 47);
                if (property10.equals(A032)) {
                    String property11 = A01(100, 3, 55);
                    if (!property11.equals(token)) {
                        String property12 = A01(128, 6, 19);
                        if (!token.startsWith(property12)) {
                            z8 = false;
                        }
                    }
                    c1021Kb.A0H(z8);
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
                    c1021Kb.A0J(true);
                    return;
                }
                String property15 = A01(136, 11, 36);
                if (property15.equals(A032)) {
                    c1021Kb.A0F(token);
                    return;
                }
                String property16 = A01(166, 11, 63);
                if (property16.equals(A032)) {
                    String property17 = A01(119, 4, 78);
                    if (!property17.equals(token)) {
                        return;
                    }
                    c1021Kb.A0G(true);
                    return;
                }
                String property18 = A01(156, 10, 120);
                if (property18.equals(A032)) {
                    String property19 = A01(177, 6, 125);
                    if (!property19.equals(token)) {
                        return;
                    }
                    c1021Kb.A0I(true);
                    return;
                }
                String property20 = A01(147, 9, 115);
                if (!property20.equals(A032)) {
                    return;
                }
                A0C(token, c1021Kb);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0B(C1021Kb c1021Kb, String str) {
        if (A01(0, 0, 111).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = A05.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c1021Kb.A0N((String) AbstractC06233y.A01(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] A1O = C5C.A1O(str, A01(47, 2, 9));
        String str2 = A1O[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c1021Kb.A0M(str2.substring(0, indexOf2));
            int voiceStartIndex = indexOf2 + 1;
            c1021Kb.A0L(str2.substring(voiceStartIndex));
        } else {
            c1021Kb.A0M(str2);
        }
        int voiceStartIndex2 = A1O.length;
        if (voiceStartIndex2 > 1) {
            int voiceStartIndex3 = A1O.length;
            c1021Kb.A0O((String[]) C5C.A1J(A1O, 1, voiceStartIndex3));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void A0C(String str, C1021Kb c1021Kb) {
        char c4;
        Matcher matcher = A04.matcher(AbstractC2034k7.A01(str));
        if (!matcher.matches()) {
            AbstractC06314g.A07(A01(32, 15, 121), A01(12, 20, 88) + str + A01(1, 2, 12));
            return;
        }
        String str2 = (String) AbstractC06233y.A01(matcher.group(2));
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals(A01(0, 1, 92))) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 3240:
                if (str2.equals(A01(134, 2, 96))) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 3592:
                if (str2.equals(A01(187, 2, 118))) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                c1021Kb.A0D(1);
                break;
            case 1:
                c1021Kb.A0D(2);
                break;
            case 2:
                if (A03[6].length() != 22) {
                    A03[3] = "l0BGY6Ka6m0f3MeGwvnWH7AIpst7Q8cB";
                    c1021Kb.A0D(3);
                    break;
                } else {
                    throw new RuntimeException();
                }
            default:
                throw new IllegalStateException();
        }
        c1021Kb.A0A(Float.parseFloat((String) AbstractC06233y.A01(matcher.group(1))));
    }

    public static boolean A0D(C06464v c06464v) {
        int position = c06464v.A09();
        int limit = c06464v.A0A();
        byte[] A0l = c06464v.A0l();
        if (position + 2 > limit) {
            return false;
        }
        int i = position + 1;
        if (A0l[position] != 47) {
            return false;
        }
        int i4 = i + 1;
        if (A0l[i] == 42) {
            while (i4 + 1 < limit) {
                int i9 = i4 + 1;
                char skippedChar = (char) A0l[i4];
                if (skippedChar == '*') {
                    char skippedChar2 = A0l[i9];
                    if (skippedChar2 == '/') {
                        limit = i9 + 1;
                        i4 = limit;
                    }
                }
                i4 = i9;
            }
            c06464v.A0g(limit - c06464v.A09());
            return true;
        }
        return false;
    }

    public static boolean A0E(C06464v c06464v) {
        switch (A00(c06464v, c06464v.A09())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c06464v.A0g(1);
                return true;
            default:
                return false;
        }
    }

    public final List<C1021Kb> A0F(C06464v c06464v) {
        String selector;
        this.A01.setLength(0);
        int A09 = c06464v.A09();
        A08(c06464v);
        C06464v c06464v2 = this.A00;
        byte[] A0l = c06464v.A0l();
        int initialInputPosition = c06464v.A09();
        c06464v2.A0j(A0l, initialInputPosition);
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
            C1021Kb c1021Kb = new C1021Kb();
            A0B(c1021Kb, selector2);
            String str = null;
            boolean z8 = false;
            while (true) {
                selector = A01(252, 1, a.f21886R);
                if (z8) {
                    break;
                }
                int A092 = this.A00.A09();
                str = A04(this.A00, this.A01);
                z8 = str == null || selector.equals(str);
                if (!z8) {
                    this.A00.A0f(A092);
                    A0A(this.A00, c1021Kb, this.A01);
                }
            }
            if (selector.equals(str)) {
                arrayList.add(c1021Kb);
            }
        }
    }
}
