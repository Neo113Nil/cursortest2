package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1545jt implements InterfaceC0549Kc {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C1836or> A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C1836or> A03(C0548Kb c0548Kb) {
        String A022;
        int i;
        if (A05(32)) {
            return this.A01;
        }
        C4J c4j = new C4J(c0548Kb.A03);
        List<C1836or> list = this.A01;
        while (c4j.A07() > 0) {
            int A0I = c4j.A0I();
            int A09 = c4j.A09() + c4j.A0I();
            if (A0I == 134) {
                list = new ArrayList<>();
                int A0I2 = c4j.A0I() & 31;
                for (int i2 = 0; i2 < A0I2; i2++) {
                    String A0W = c4j.A0W(3);
                    int A0I3 = c4j.A0I();
                    boolean z = (A0I3 & 128) != 0;
                    if (z) {
                        A022 = A02(19, 19, 47);
                        i = A0I3 & 63;
                    } else {
                        A022 = A02(0, 19, 57);
                        i = 1;
                    }
                    byte A0I4 = (byte) c4j.A0I();
                    c4j.A0g(1);
                    List<byte[]> list2 = null;
                    if (z) {
                        boolean z2 = (A0I4 & 64) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        list2 = C3U.A04(z2);
                    }
                    list.add(new C2D().A11(A022).A10(A0W).A0Z(i).A12(list2).A14());
                }
            }
            c4j.A0f(A09);
        }
        return list;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, Ascii.FF, Ascii.ESC, Ascii.ESC, Ascii.ETB, Ascii.DC4, Ascii.SO, Ascii.FF, Ascii.US, Ascii.DC4, Ascii.SUB, Ascii.EM, -38, 33, Ascii.EM, Ascii.SI, -39, Ascii.SI, 33, Ascii.CR, -39, Ascii.FF, Ascii.DC4, Ascii.US, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C1545jt() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C1545jt(int i) {
        this(i, MetaExoPlayerCustomizedCollections.A03(new C1836or[0]));
    }

    public C1545jt(int i, List<C1836or> list) {
        this.A00 = i;
        this.A01 = list;
    }

    private KX A00(C0548Kb c0548Kb) {
        return new KX(A03(c0548Kb));
    }

    private C0554Kh A01(C0548Kb c0548Kb) {
        return new C0554Kh(A03(c0548Kb));
    }

    private boolean A05(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0549Kc
    public final SparseArray<InterfaceC0552Kf> A5I() {
        return new SparseArray<>();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0549Kc
    public final InterfaceC0552Kf A5N(int i, C0548Kb c0548Kb) {
        switch (i) {
            case 2:
            case 128:
                return new C1534ji(new C1542jq(A01(c0548Kb)));
            case 3:
            case 4:
                return new C1534ji(new C1536jk(c0548Kb.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C1534ji(new C1546ju(false, c0548Kb.A01));
            case 16:
                return new C1534ji(new C1541jp(A01(c0548Kb)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C1534ji(new C1537jl(c0548Kb.A01));
            case 21:
                return new C1534ji(new C1538jm());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C1534ji(new C1540jo(A00(c0548Kb), A05(1), A05(8)));
            case 36:
                return new C1534ji(new C1539jn(A00(c0548Kb)));
            case 89:
                return new C1534ji(new C1543jr(c0548Kb.A02));
            case Opcodes.LOR /* 129 */:
            case Opcodes.I2D /* 135 */:
                return new C1534ji(new C1552k0(c0548Kb.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case Opcodes.I2F /* 134 */:
                if (A05(16)) {
                    return null;
                }
                return new C1529jd(new C1535jj(A02(61, 20, 26)));
            case Opcodes.L2D /* 138 */:
                break;
            case Opcodes.IRETURN /* 172 */:
                return new C1534ji(new C1549jx(c0548Kb.A01));
            case 257:
                return new C1529jd(new C1535jj(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C1534ji(new C1544js(c0548Kb.A01));
    }
}
