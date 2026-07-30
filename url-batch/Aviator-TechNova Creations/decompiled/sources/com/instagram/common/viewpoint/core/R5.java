package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class R5 {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final R0 A01;
    public final C1159dL A02;
    public final US A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C0575Lc A06() {
        AnonymousClass77 A02 = A02();
        if (A02 == null) {
            return null;
        }
        LY ly = new LY();
        return new C0575Lc(this.A02, this.A03, new C1318fw(this.A01), A02, null, ly, A0K(ly, A02));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C0575Lc A07() {
        AnonymousClass73 A03 = A03();
        if (A03 == null) {
            return null;
        }
        LX lx = new LX();
        return new C0575Lc(this.A02, this.A03, new C6P(this.A01), A03, A03.A1A(), lx, A0K(lx, A03));
    }

    public static String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A04 = new byte[]{99, Byte.MAX_VALUE, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, Ascii.VT, 1, 9, 0, 43, 41, 36, 36, 45, 58, Ascii.FS, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, Ascii.SUB, 38, 41, 44, 38, 46, Ascii.SUB, 33, 32, 41, 36, 60, Ascii.SUB, 40, 54, 124, 115, 102, 123, 100, 119, 83, 118, 86, 115, 102, 115, 80, 103, 124, 118, 126, 119, 106, 118, 123, 121, Byte.MAX_VALUE, 119, Byte.MAX_VALUE, 116, 110, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, Base64.padSymbol, 19, 54, Ascii.SYN, 51, 38, 51, 16, 39, 60, 54, 62, 55, Ascii.SYN, 9, 4, 5, Ascii.SI, Utf8.REPLACEMENT_BYTE, Ascii.DC4, 9, Ascii.CR, 5, Utf8.REPLACEMENT_BYTE, 16, Ascii.SI, Ascii.FF, Ascii.FF, 9, Ascii.SO, 7, Utf8.REPLACEMENT_BYTE, 9, Ascii.SO, Ascii.DC4, 5, Ascii.DC2, Ascii.SYN, 1, Ascii.FF};
    }

    static {
        A0M();
    }

    public R5(R0 r0, Intent intent, US us, C1159dL c1159dL) {
        this.A01 = r0;
        this.A00 = intent;
        this.A03 = us;
        this.A02 = c1159dL;
    }

    private AbstractC1434hy A00() {
        int i = Build.VERSION.SDK_INT;
        String A0L = A0L(68, 18, 41);
        if (i >= 33) {
            return (AbstractC1434hy) this.A00.getSerializableExtra(A0L, AbstractC1434hy.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC1434hy) intent.getSerializableExtra(A0L);
    }

    private C1432hw A01() {
        int i = Build.VERSION.SDK_INT;
        String A0L = A0L(26, 19, 47);
        if (i >= 33) {
            return (C1432hw) this.A00.getSerializableExtra(A0L, C1432hw.class);
        }
        return (C1432hw) this.A00.getSerializableExtra(A0L);
    }

    private AnonymousClass77 A02() {
        int i = Build.VERSION.SDK_INT;
        String A0L = A0L(2, 14, 94);
        if (i >= 33) {
            return (AnonymousClass77) this.A00.getSerializableExtra(A0L, AnonymousClass77.class);
        }
        return (AnonymousClass77) this.A00.getSerializableExtra(A0L);
    }

    private AnonymousClass73 A03() {
        int i = Build.VERSION.SDK_INT;
        String A0L = A0L(95, 25, 105);
        if (i >= 33) {
            return (AnonymousClass73) this.A00.getSerializableExtra(A0L, AnonymousClass73.class);
        }
        return (AnonymousClass73) this.A00.getSerializableExtra(A0L);
    }

    private InterfaceC0891Xo A05() {
        if (U7.A2o(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0L(45, 23, 126));
            R0 r0 = this.A01;
            C1159dL c1159dL = this.A02;
            US us = this.A03;
            C1318fw c1318fw = new C1318fw(this.A01);
            Intent intent = this.A00;
            String clickDelayMs = A0L(16, 10, Opcodes.DREM);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0L(0, 2, Opcodes.LNEG);
            }
            int parseInt = Integer.parseInt(stringExtra);
            if (A05[5].charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new C6H(r0, c1159dL, us, c1318fw, stringExtra2, parseInt);
        }
        return new OD(this.A01, this.A02, this.A03, new C1318fw(this.A01));
    }

    private final C0574Lb A08() {
        return new C0574Lb(this.A02, this.A01);
    }

    private LZ A09(RelativeLayout relativeLayout) {
        LZ lz = new LZ(this.A02, new C1317fv(this), this.A03, new C1318fw(this.A01));
        lz.A05(relativeLayout);
        lz.A04(this.A00.getIntExtra(A0L(120, 27, 91), 200));
        XP.A0K(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return lz;
    }

    private C5K A0A() {
        AnonymousClass77 A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new C5K(this.A02, this.A03, new C1318fw(this.A01), A02, new LY(), 1);
    }

    private C5K A0B() {
        AnonymousClass73 A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new C5K(this.A02, this.A03, new C1318fw(this.A01), A03, new LX(), 0);
    }

    private IG A0C() {
        C1070bt A02;
        AbstractC1434hy A00 = A00();
        if (A00 == null || (A02 = AbstractC1071bu.A02(A00.A17())) == null) {
            return null;
        }
        return new IG(this.A02, new C1318fw(this.A01), A02, A00.A25());
    }

    private C0442Fy A0D(EnumC0829Vb enumC0829Vb) {
        YY lx;
        InterfaceC0890Xn c6p;
        C1432hw A01 = A01();
        if (A01 == null) {
            return null;
        }
        if (enumC0829Vb == EnumC0829Vb.A04) {
            lx = new LY();
            c6p = new C1318fw(this.A01);
        } else {
            lx = new LX();
            c6p = new C6P(this.A01);
        }
        return new C0442Fy(this.A02, lx, this.A03, A01, new SF(this.A02), c6p);
    }

    private C4H A0E() {
        AnonymousClass77 A02 = A02();
        if (A02 != null) {
            return new C4H(this.A02, new LY(), this.A03, A02, new SF(this.A02), new C1318fw(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C01393r A0F() {
        AnonymousClass77 A02 = A02();
        if (A02 == null) {
            return null;
        }
        return new C01393r(this.A02, new LY(), this.A03, A02, new SF(this.A02), new C1318fw(this.A01));
    }

    private C01393r A0G() {
        AnonymousClass73 A03 = A03();
        if (A03 == null) {
            return null;
        }
        return new C01393r(this.A02, new LX(), this.A03, A03, new SF(this.A02), new C6P(this.A01));
    }

    private FL A0H() {
        AnonymousClass73 A03;
        AnonymousClass73 A032 = A03();
        if (A032 == null || (A03 = A03()) == null) {
            return null;
        }
        return new FL(this.A02, this.A03, A032, A03, new C6P(this.A01), this.A01);
    }

    private C01383q A0I() {
        AnonymousClass77 dataBundle = A02();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A1G(this.A01.A08());
        return new C01383q(this.A02, this.A03, new SF(this.A02), new C1318fw(this.A01), dataBundle);
    }

    private C01383q A0J() {
        AnonymousClass73 dataBundle = A03();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A1G(this.A01.A08());
        return new C01383q(this.A02, this.A03, new SF(this.A02), new C1318fw(this.A01), dataBundle);
    }

    private C1138cz A0K(YY yy, AbstractC1434hy abstractC1434hy) {
        NB A07 = abstractC1434hy.A20().A0H().A07();
        if (A07 == null || !A07.A0M()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0L(86, 9, 33), yy.A8d());
        return new C1138cz(this.A02, abstractC1434hy, A07, this.A03, null, hashMap);
    }

    public final InterfaceC0891Xo A0N(EnumC0829Vb enumC0829Vb, RelativeLayout relativeLayout) {
        if (enumC0829Vb == null) {
            return null;
        }
        switch (R4.A00[enumC0829Vb.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A09(relativeLayout);
                }
                return null;
            case 2:
                return A0J();
            case 3:
                return A0G();
            case 4:
                return A07();
            case 5:
                return A05();
            case 6:
                C01393r A0F = A0F();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return A0F;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return A0F;
            case 7:
                return A0E();
            case 8:
                return A0I();
            case 9:
                return A06();
            case 10:
                return A0C();
            case 11:
                C5K A0A = A0A();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return A0A;
            case 12:
                return A0B();
            case 13:
            case 14:
                return A0D(enumC0829Vb);
            case 15:
                return A08();
            case 16:
                return A0H();
            default:
                return null;
        }
    }
}
