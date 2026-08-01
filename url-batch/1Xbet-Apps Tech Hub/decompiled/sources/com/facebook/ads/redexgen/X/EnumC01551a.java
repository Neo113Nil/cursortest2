package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.1a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC01551a {
    public static byte[] A01;
    public static final /* synthetic */ EnumC01551a[] A02;
    public static final EnumC01551a A03;
    public static final EnumC01551a A04;
    public static final EnumC01551a A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{Ascii.CAN, Ascii.ETB, Ascii.DC2, Ascii.ESC, 1, Ascii.SO, Ascii.FF, Ascii.ESC, Ascii.GS, Ascii.US, Ascii.GS, Ascii.SYN, Ascii.ESC, 3, 1, Ascii.FS, Ascii.VT, 10, Ascii.FF, 3, 1, Ascii.SYN, 16, Ascii.DC2, 16, Ascii.ESC, Ascii.SYN, 119, 101, 98, 118, 105, 101, 119, Byte.MAX_VALUE, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String A012 = A01(27, 16, 0);
        EnumC01551a enumC01551a = new EnumC01551a(A012, 0, A012);
        A05 = enumC01551a;
        String A013 = A01(13, 14, 115);
        EnumC01551a enumC01551a2 = new EnumC01551a(A013, 1, A013);
        A04 = enumC01551a2;
        String A014 = A01(0, 13, 126);
        EnumC01551a enumC01551a3 = new EnumC01551a(A014, 2, A014);
        A03 = enumC01551a3;
        A02 = new EnumC01551a[]{enumC01551a, enumC01551a2, enumC01551a3};
    }

    public EnumC01551a(String str, int i, String str2) {
        this.A00 = str2;
    }

    public static EnumC01551a A00(String str) {
        for (EnumC01551a enumC01551a : values()) {
            if (enumC01551a.A00.equalsIgnoreCase(str)) {
                return enumC01551a;
            }
        }
        return A03;
    }

    public static EnumC01551a valueOf(String str) {
        return (EnumC01551a) Enum.valueOf(EnumC01551a.class, str);
    }

    public static EnumC01551a[] values() {
        return (EnumC01551a[]) A02.clone();
    }
}
