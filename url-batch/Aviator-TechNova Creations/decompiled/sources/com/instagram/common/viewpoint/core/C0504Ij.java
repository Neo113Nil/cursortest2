package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.SlowMotionData;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0504Ij {
    public static byte[] A03;
    public static String[] A04 = {"1LFyGIpszZgsQUUW5R18ay4ATJEAL43c", "dt6orGbglcsjMqs", "9FFDgagoC1", "foXErnBO9GEWWKnhx2CBLj59I1mQsasl", "8wc6iy8fDBcca8zNmQv", "", "jjxV28nHyp6my1wOvIi", "qfRjwVGa5Ot2KmC8yJE9Z4CCjcQdKZvd"};
    public static final C1508jH A05;
    public static final C1508jH A06;
    public int A01;
    public final List<C0501Ig> A02 = new ArrayList();
    public int A00 = 0;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
            if (A04[0].charAt(18) != '1') {
                throw new RuntimeException();
            }
            A04[1] = "QzkInJPgctLD5w2";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{45, 10, Ascii.DC2, 5, 8, Ascii.CR, 0, 68, 55, 33, 34, 68, 10, 5, 9, 1, 56, 7, 4, Ascii.FS, 38, 4, Ascii.US, 2, 4, 5, 52, 47, 10, Ascii.US, 10, 93, 123, 126, 107, 124, 81, 93, 98, 97, 121, 67, 97, 122, 103, 97, 96, 81, 76, 73, 67, 94, 120, 125, 104, Byte.MAX_VALUE, 82, 94, 97, 98, 122, 64, 98, 121, 100, 98, 99, 82, 73, 108, 121, 108, 50, Ascii.DC4, 17, 4, 19, 62, 50, Ascii.CR, Ascii.SO, Ascii.SYN, 44, Ascii.SO, Ascii.NAK, 8, Ascii.SO, Ascii.SI, 62, 37, 4, 7, Ascii.CR, 8, 2, 10, 4, 19, 8, Ascii.SI, 6, 62, 46, Ascii.SI, 65, 103, 98, 119, 96, 77, 65, 126, 125, 101, 95, 125, 102, 123, 125, 124, 77, 87, 118, 123, 102, 77, 86, 115, 102, 115};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(InterfaceC1625lN interfaceC1625lN, List<Metadata.Entry> list) throws IOException {
        long A8f = interfaceC1625lN.A8f();
        int A8G = (int) ((interfaceC1625lN.A8G() - interfaceC1625lN.A8f()) - this.A01);
        C4J c4j = new C4J(A8G);
        interfaceC1625lN.readFully(c4j.A0l(), 0, A8G);
        for (int i = 0; i < this.A02.size(); i++) {
            C0501Ig c0501Ig = this.A02.get(i);
            c4j.A0f((int) (c0501Ig.A02 - A8f));
            c4j.A0g(4);
            int A0E = c4j.A0E();
            String[] strArr = A04;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A04[7] = "1HViS9NC9rn2qgqFvoB7LQiD1FLq6ChH";
            int A00 = A00(c4j.A0W(A0E));
            int i2 = c0501Ig.A01 - (A0E + 8);
            switch (A00) {
                case 2192:
                    list.add(A01(c4j, i2));
                    break;
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    static {
        A03();
        A06 = C1508jH.A02(AbstractJsonLexerKt.COLON);
        A05 = C1508jH.A02('*');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) throws C01042i {
        char c;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals(A02(16, 15, 81))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1332107749:
                if (str.equals(A02(104, 26, 40))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1251387154:
                if (str.equals(A02(51, 21, 55))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -830665521:
                if (str.equals(A02(72, 32, 91))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1760745220:
                if (str.equals(A02(31, 20, 52))) {
                    c = 2;
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
                return 2192;
            case 1:
                return 2816;
            case 2:
                return 2817;
            case 3:
                return 2819;
            case 4:
                return 2820;
            default:
                throw C01042i.A01(A02(0, 16, 94), null);
        }
    }

    public static SlowMotionData A01(C4J c4j, int i) throws C01042i {
        List<SlowMotionData.Segment> segments = new ArrayList<>();
        String dataString = c4j.A0W(i);
        List<String> A062 = A05.A06(dataString);
        for (int i2 = 0; i2 < A062.size(); i2++) {
            List<String> A063 = A06.A06(A062.get(i2));
            if (A063.size() == 3) {
                try {
                    long parseLong = Long.parseLong(A063.get(0));
                    long startTimeMs = Long.parseLong(A063.get(1));
                    segments.add(new SlowMotionData.Segment(parseLong, startTimeMs, 1 << (Integer.parseInt(A063.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw C01042i.A01(null, e);
                }
            } else {
                throw C01042i.A01(null, null);
            }
        }
        return new SlowMotionData(segments);
    }

    private void A04(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        C4J c4j = new C4J(8);
        interfaceC1625lN.readFully(c4j.A0l(), 0, 8);
        this.A01 = c4j.A0E() + 8;
        if (c4j.A0C() != 1397048916) {
            c0463Gt.A00 = 0L;
        } else {
            c0463Gt.A00 = interfaceC1625lN.A8f() - (this.A01 - 12);
            this.A00 = 2;
        }
    }

    private void A05(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        long A8G = interfaceC1625lN.A8G();
        int i = (this.A01 - 12) - 8;
        C4J c4j = new C4J(i);
        interfaceC1625lN.readFully(c4j.A0l(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            c4j.A0g(2);
            int i3 = c4j.A0a();
            switch (i3) {
                case 2192:
                case 2816:
                case 2817:
                case 2819:
                case 2820:
                    long streamLength = this.A01;
                    long j = A8G - streamLength;
                    long streamLength2 = c4j.A0E();
                    int size = c4j.A0E();
                    this.A02.add(new C0501Ig(i3, j - streamLength2, size));
                    break;
                default:
                    c4j.A0g(8);
                    break;
            }
        }
        if (this.A02.isEmpty()) {
            c0463Gt.A00 = 0L;
            return;
        }
        this.A00 = 3;
        long streamLength3 = this.A02.get(0).A02;
        c0463Gt.A00 = streamLength3;
    }

    public final int A07(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt, List<Metadata.Entry> slowMotionMetadataEntries) throws IOException {
        long j = 0;
        switch (this.A00) {
            case 0:
                long A8G = interfaceC1625lN.A8G();
                if (A8G != -1 && A8G >= 8) {
                    j = A8G - 8;
                }
                c0463Gt.A00 = j;
                this.A00 = 1;
                return 1;
            case 1:
                A04(interfaceC1625lN, c0463Gt);
                return 1;
            case 2:
                A05(interfaceC1625lN, c0463Gt);
                return 1;
            case 3:
                A06(interfaceC1625lN, slowMotionMetadataEntries);
                c0463Gt.A00 = 0L;
                return 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final void A08() {
        this.A02.clear();
        this.A00 = 0;
    }
}
