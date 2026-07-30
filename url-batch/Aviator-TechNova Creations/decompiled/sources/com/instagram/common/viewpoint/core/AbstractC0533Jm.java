package com.instagram.common.viewpoint.core;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Jm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0533Jm {
    public static byte[] A00;
    public static String[] A01 = {"KgPme38LEDVaM0D12Uwlfvq6nYMDVVkT", "a5g98XiYqimDBheiX8ybcf7PetcT8W7U", "dRcctykKkiCtpnpKZqpaePhb1Qg1PkeN", "6JMbAfNKE0NkFS9oLsx1Zln6Fen7GSJu", "0ohFdoD3UqF2FgjtvUgt7lzB", "HqtC3No697vYpZ7G6OCOOOlSljo", "Ih90XUpH", "6OUjWPhHhDm3iVNi78UT7lOYQX351vXz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0531Jk A00(C0531Jk c0531Jk, Map<String, C0538Jr> map) {
        while (c0531Jk != null) {
            C0538Jr A02 = A02(c0531Jk.A04, c0531Jk.A0H(), map);
            if (A02 != null && A02.A09() == 1) {
                return c0531Jk;
            }
            c0531Jk = c0531Jk.A03;
        }
        return null;
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(23) != strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A01[6] = "lLmUOaES";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
            i4++;
        }
    }

    public static void A05() {
        if (A01[2].charAt(10) == 'x') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "BbbzftLMD2m3WHwPv0bAANWrbX2mWIyE";
        strArr[7] = "7lYjBODxVBmaGubq4OQdXtxLEf46a0ab";
        A00 = new byte[]{-117, -75, -78, -103, -40, -30, -62, -40, -30, 64, 88, 86, 93, 93, 86, 91, 84, Ascii.CR, 95, 98, 79, 102, 65, 82, 101, 97, Ascii.CR, 91, 92, 81, 82, Ascii.CR, 100, 86, 97, 85, 92, 98, 97, Ascii.CR, 82, 101, 78, 80, 97, 89, 102, Ascii.CR, 92, 91, 82, Ascii.CR, 97, 82, 101, 97, Ascii.CR, 80, 85, 86, 89, 81, Ascii.ESC, -10, Ascii.SYN, Ascii.SI, Ascii.SO, -12, 7, 16, 6, 7, Ascii.DC4, -9, Ascii.SYN, Ascii.VT, Ascii.SO, 73, Ascii.SO, -9, 74, 102, Ascii.RS, 48, -6, -5, 75, Ascii.EM};
    }

    static {
        A05();
    }

    public static C0531Jk A01(C0531Jk c0531Jk, Map<String, C0538Jr> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0531Jk);
        while (!arrayDeque.isEmpty()) {
            C0531Jk c0531Jk2 = (C0531Jk) arrayDeque.pop();
            C0538Jr c0538Jr = c0531Jk2.A04;
            String[] A0H = c0531Jk2.A0H();
            if (A01[6].length() != 8) {
                throw new RuntimeException();
            }
            A01[6] = "prCmMBcG";
            C0538Jr A02 = A02(c0538Jr, A0H, map);
            if (A02 != null && A02.A09() == 3) {
                return c0531Jk2;
            }
            for (int A0C = c0531Jk2.A0C() - 1; A0C >= 0; A0C--) {
                arrayDeque.push(c0531Jk2.A0D(A0C));
            }
        }
        return null;
    }

    public static C0538Jr A02(C0538Jr c0538Jr, String[] strArr, Map<String, C0538Jr> map) {
        int i = 0;
        if (c0538Jr == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C0538Jr c0538Jr2 = new C0538Jr();
                int length = strArr.length;
                while (i < length) {
                    c0538Jr2.A0O(map.get(strArr[i]));
                    i++;
                }
                return c0538Jr2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                String str = strArr[0];
                String[] strArr2 = A01;
                if (strArr2[1].charAt(10) != strArr2[7].charAt(10)) {
                    throw new RuntimeException();
                }
                A01[5] = "FXnyxRIFGSjHG1Q4pZ8iBycDDGv";
                return c0538Jr.A0O(map.get(str));
            }
            if (strArr != null) {
                int length2 = strArr.length;
                if (A01[2].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A01[5] = "6UN5UNrVzg6BSs5KXnnHYvLLh5S";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i < length3) {
                        C0538Jr c0538Jr3 = map.get(strArr[i]);
                        if (A01[5].length() != 27) {
                            throw new RuntimeException();
                        }
                        A01[2] = "LBM9N0gh5w8sQTAl6eCIViVepwnbqV6U";
                        c0538Jr.A0O(c0538Jr3);
                        i++;
                    }
                    return c0538Jr;
                }
            }
        }
        return c0538Jr;
    }

    public static String A04(String str) {
        String A03 = A03(1, 2, 53);
        String A032 = A03(0, 1, 14);
        String replaceAll = str.replaceAll(A03, A032);
        String out = A03(4, 5, 69);
        String replaceAll2 = replaceAll.replaceAll(out, A032);
        String A033 = A03(3, 1, 6);
        String replaceAll3 = replaceAll2.replaceAll(A032, A033);
        String out2 = A03(77, 11, Opcodes.LSHR);
        return replaceAll3.replaceAll(out2, A033);
    }

    public static void A06(Spannable spannable, int i, int i2, C0538Jr c0538Jr, C0531Jk c0531Jk, Map<String, C0538Jr> map, int i3) {
        C0531Jk A012;
        C0538Jr A02;
        int i4;
        int i5;
        int i6;
        if (c0538Jr.A0A() != -1) {
            spannable.setSpan(new StyleSpan(c0538Jr.A0A()), i, i2, 33);
        }
        if (c0538Jr.A0b()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c0538Jr.A0c()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c0538Jr.A0a()) {
            C3H.A00(spannable, new ForegroundColorSpan(c0538Jr.A06()), i, i2, 33);
        }
        boolean A0Z = c0538Jr.A0Z();
        if (A01[5].length() == 27) {
            A01[2] = "DOLHbyxdL1TIGmJ49PhqpcsDL7xIVQFO";
            if (A0Z) {
                C3H.A00(spannable, new BackgroundColorSpan(c0538Jr.A05()), i, i2, 33);
            }
            if (c0538Jr.A0W() != null) {
                C3H.A00(spannable, new TypefaceSpan(c0538Jr.A0W()), i, i2, 33);
            }
            if (c0538Jr.A0D() != null) {
                C0527Jg c0527Jg = (C0527Jg) C3M.A01(c0538Jr.A0D());
                if (c0527Jg.A01 == -1) {
                    String[] strArr = A01;
                    if (strArr[1].charAt(10) == strArr[7].charAt(10)) {
                        A01[5] = "2MSbzH5cEcM3iPzp1Bk7CXgbIPr";
                        if (i3 == 2 || i3 == 1) {
                            i4 = 3;
                        } else {
                            i4 = 1;
                        }
                        i5 = 1;
                    }
                } else {
                    i4 = c0527Jg.A01;
                    i5 = c0527Jg.A00;
                }
                if (c0527Jg.A02 == -2) {
                    i6 = 1;
                } else {
                    i6 = c0527Jg.A02;
                }
                C3H.A00(spannable, new C1779nu(i4, i5, i6), i, i2, 33);
            }
            switch (c0538Jr.A09()) {
                case 2:
                    C0531Jk A002 = A00(c0531Jk, map);
                    if (A002 != null && (A012 = A01(A002, map)) != null) {
                        if (A012.A0C() == 1) {
                            C0531Jk containerNode = A012.A0D(0);
                            if (containerNode.A08 != null) {
                                C0531Jk containerNode2 = A012.A0D(0);
                                String str = (String) AbstractC01484a.A0f(containerNode2.A08);
                                C0538Jr A022 = A02(A012.A04, A012.A0H(), map);
                                int A08 = A022 != null ? A022.A08() : -1;
                                if (A08 == -1 && (A02 = A02(A002.A04, A002.A0H(), map)) != null) {
                                    A08 = A02.A08();
                                }
                                spannable.setSpan(new C1780nv(str, A08), i, i2, 33);
                                break;
                            }
                        }
                        AnonymousClass44.A06(A03(63, 14, 47), A03(9, 54, 122));
                        break;
                    }
                    break;
                case 3:
                case 4:
                    spannable.setSpan(new C0524Jd(), i, i2, 33);
                    break;
            }
            if (c0538Jr.A0Y()) {
                C3H.A00(spannable, new C1781nw(), i, i2, 33);
            }
            switch (c0538Jr.A07()) {
                case 1:
                    C3H.A00(spannable, new AbsoluteSizeSpan((int) c0538Jr.A03(), true), i, i2, 33);
                    return;
                case 2:
                    C3H.A00(spannable, new RelativeSizeSpan(c0538Jr.A03()), i, i2, 33);
                    return;
                case 3:
                    C3H.A00(spannable, new RelativeSizeSpan(c0538Jr.A03() / 100.0f), i, i2, 33);
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }
}
