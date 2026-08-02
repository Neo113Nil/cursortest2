package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.kb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1583kb implements GX {
    public static byte[] A0e;
    public static String[] A0f = {"ywSCwlzG1SMdvvW", "WbYO2rYjmhbf4R3oYDPvQZ3H98amgjSr", "Za", "aa8pMmtLKrvpWkukTfymetmlHniL9M", "752FE5aLUbaesINptKDix8v", "1m6bsNbzXuacY99BBbBsLUDHw0asFdhp", "tFAwrqTGVJ2tUOf2i", "X0elgRXJnrwhMbXNAucG6j3nQ1B9k96A"};
    public static final InterfaceC0439Gb A0g;
    public static final C1830or A0h;
    public static final byte[] A0i;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public SparseArray<IV> A0D;
    public C4J A0E;
    public GY A0F;
    public IV A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public H1[] A0K;
    public H1[] A0L;
    public final int A0M;
    public final DrmInitData A0N;
    public final C4J A0O;
    public final C4J A0P;
    public final C4J A0Q;
    public final C4J A0R;
    public final C4J A0S;
    public final C4R A0T;
    public final H1 A0U;
    public final HO A0V;
    public final C0501Im A0W;
    public final ArrayDeque<C1591kj> A0X;
    public final ArrayDeque<IU> A0Y;
    public final List<C1830or> A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final byte[] A0d;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(IV iv, int i, long j, int i2, C4J c4j, int i3) {
        int i4;
        int i5;
        int i6 = i3;
        long j2 = j;
        c4j.A0f(8);
        int A00 = II.A00(c4j.A0C());
        C0501Im c0501Im = iv.A05;
        C0503Io c0503Io = iv.A07;
        IP ip = c0503Io.A06;
        c0503Io.A0C[i] = c4j.A0L();
        c0503Io.A0E[i] = c0503Io.A04;
        if ((A00 & 1) != 0) {
            long[] jArr = c0503Io.A0E;
            String[] strArr = A0f;
            if (strArr[1].charAt(23) == strArr[5].charAt(23)) {
                A0f[2] = "02";
                jArr[i] = jArr[i] + c4j.A0C();
            }
            throw new RuntimeException();
        }
        boolean z = (A00 & 4) != 0;
        int i7 = ip.A01;
        if (z) {
            i7 = c4j.A0L();
        }
        boolean z2 = (A00 & 256) != 0;
        boolean z3 = (A00 & 512) != 0;
        boolean z4 = (A00 & 1024) != 0;
        boolean z5 = (A00 & 2048) != 0;
        long j3 = 0;
        if (c0501Im.A08 != null && c0501Im.A08.length == 1 && c0501Im.A08[0] == 0) {
            j3 = c0501Im.A09[0];
        }
        int[] iArr = c0503Io.A0B;
        long[] jArr2 = c0503Io.A0D;
        boolean[] zArr = c0503Io.A0G;
        boolean z6 = c0501Im.A03 == 2 && (i2 & 1) != 0;
        int i8 = i6 + c0503Io.A0C[i];
        long j4 = c0501Im.A06;
        if (i > 0) {
            j2 = c0503Io.A05;
        }
        while (i6 < i8) {
            int A0L = z2 ? c4j.A0L() : ip.A00;
            if (z3) {
                i4 = c4j.A0L();
                String[] strArr2 = A0f;
                if (strArr2[3].length() == strArr2[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0f;
                strArr3[1] = "prYCRILb9XoLiqEuzjLvSymHGedE7tyJ";
                strArr3[5] = "tQPxWhVMkiMqfE1WSn5JfVNHf8FlQpL7";
            } else {
                i4 = ip.A03;
            }
            if (i6 == 0 && z) {
                i5 = i7;
            } else if (z4) {
                i5 = c4j.A0C();
            } else {
                if (A0f[4].length() != 23) {
                    throw new RuntimeException();
                }
                A0f[4] = "VUSN2W3IkwtruuiuKY2zNmE";
                i5 = ip.A01;
            }
            jArr2[i6] = AbstractC01424a.A0U(((z5 ? c4j.A0C() : 0) + j2) - j3, 1000000L, j4);
            zArr[i6] = ((i5 >> 16) & 1) == 0 && (!z6 || i6 == 0);
            iArr[i6] = i4;
            j2 += A0L;
            i6++;
        }
        c0503Io.A05 = j2;
        return i8;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C1624lT> A04(C4J c4j, long j) throws C00982i {
        long A0R;
        long A0R2;
        c4j.A0f(8);
        int A01 = II.A01(c4j.A0C());
        c4j.A0g(4);
        long A0Q = c4j.A0Q();
        if (A01 == 0) {
            A0R = c4j.A0Q();
            A0R2 = j + c4j.A0Q();
        } else {
            A0R = c4j.A0R();
            A0R2 = j + c4j.A0R();
        }
        long A0U = AbstractC01424a.A0U(A0R, 1000000L, A0Q);
        c4j.A0g(2);
        int A0M = c4j.A0M();
        int[] iArr = new int[A0M];
        long[] jArr = new long[A0M];
        long[] jArr2 = new long[A0M];
        long[] jArr3 = new long[A0M];
        long j2 = A0U;
        for (int i = 0; i < A0M; i++) {
            int A0C = c4j.A0C();
            if ((Integer.MIN_VALUE & A0C) != 0) {
                throw new C00982i(A0B(634, 28, 93));
            }
            long A0Q2 = c4j.A0Q();
            iArr[i] = Integer.MAX_VALUE & A0C;
            jArr[i] = A0R2;
            jArr3[i] = j2;
            A0R += A0Q2;
            j2 = AbstractC01424a.A0U(A0R, 1000000L, A0Q);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "mBjUzKzbBV9DJWZlH52EoviqXd7Fx3w7";
            jArr2[i] = j2 - jArr3[i];
            c4j.A0g(4);
            A0R2 += iArr[i];
        }
        return Pair.create(Long.valueOf(A0U), new C1624lT(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static IV A09(C4J c4j, SparseArray<IV> sparseArray, boolean z) {
        c4j.A0f(8);
        int A00 = II.A00(c4j.A0C());
        IV A08 = A08(sparseArray, c4j.A0C(), z);
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0R = c4j.A0R();
            A08.A07.A04 = A0R;
            A08.A07.A03 = A0R;
        }
        IP ip = A08.A04;
        A08.A07.A06 = new IP((A00 & 2) != 0 ? c4j.A0L() - 1 : ip.A02, (A00 & 8) != 0 ? c4j.A0L() : ip.A00, (A00 & 16) != 0 ? c4j.A0L() : ip.A03, (A00 & 32) != 0 ? c4j.A0L() : ip.A01);
        return A08;
    }

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0e, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 99);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        String[] strArr = A0f;
        if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[1] = "BGZmKOZPo9hBykc2GdFNUQpHC0I3sPv1";
        strArr2[5] = "CvUkm70dQ0grN9w1V6xWMg6HVylPciNL";
        A0e = new byte[]{84, 88, 95, 106, 113, 115, 62, 109, 119, 100, 123, 62, 114, 123, 109, 109, 62, 106, 118, Byte.MAX_VALUE, 112, 62, 118, 123, Byte.MAX_VALUE, 122, 123, 108, 62, 114, 123, 112, 121, 106, 118, 62, 54, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 55, 48, 99, 72, 82, 84, 95, 6, 69, 73, 83, 72, 82, 6, 79, 72, 6, 85, 68, 65, 86, 6, 7, Ascii.ESC, 6, Ascii.ETB, 6, Ascii.SO, 83, 72, 85, 83, 86, 86, 73, 84, 82, 67, 66, Ascii.SI, 8, 73, 98, 120, 126, 117, 44, 111, 99, 121, 98, 120, 44, 101, 98, 44, Byte.MAX_VALUE, 107, 124, 104, 44, 45, 49, 44, Base64.padSymbol, 44, 36, 121, 98, Byte.MAX_VALUE, 121, 124, 124, 99, 126, 120, 105, 104, 37, 34, 104, 92, 79, 73, 67, 75, 64, 90, 75, 74, 99, 94, Ascii.SUB, 107, 86, 90, 92, 79, 77, 90, 65, 92, 57, Ascii.ETB, Ascii.RS, Ascii.US, 2, Ascii.EM, Ascii.RS, Ascii.ETB, 80, Ascii.RS, Ascii.NAK, Ascii.ETB, 17, 4, Ascii.EM, 6, Ascii.NAK, 80, Ascii.US, Ascii.SYN, Ascii.SYN, 3, Ascii.NAK, 4, 80, 4, Ascii.US, 80, 3, 17, Ascii.GS, 0, Ascii.FS, Ascii.NAK, 80, Ascii.DC4, 17, 4, 17, 94, 116, 83, 75, 92, 81, 84, 89, Ascii.GS, 115, 124, 113, Ascii.GS, 81, 88, 83, 90, 73, 85, 113, 88, 92, 91, Ascii.GS, 92, 73, 82, 80, Ascii.GS, 89, 88, 91, 84, 83, 88, 78, Ascii.GS, 88, 69, 73, 88, 83, 89, 88, 89, Ascii.GS, 92, 73, 82, 80, Ascii.GS, 78, 84, 71, 88, Ascii.GS, Ascii.NAK, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, Ascii.DC4, 19, 62, Ascii.ETB, 19, Ascii.DC4, 82, 19, 6, Ascii.GS, Ascii.US, 82, 5, Ascii.ESC, 6, Ascii.SUB, 82, Ascii.RS, Ascii.ETB, Ascii.FS, Ascii.NAK, 6, Ascii.SUB, 82, 76, 82, 64, 67, 70, 69, 70, 74, 65, 68, 70, 69, 82, 90, 7, Ascii.FS, 1, 7, 2, 2, Ascii.GS, 0, 6, Ascii.ETB, Ascii.SYN, 91, 92, 2, 43, 32, 41, 58, 38, 110, 35, 39, Base64.padSymbol, 35, 47, 58, 45, 38, 116, 110, 82, 123, 123, 110, 120, 105, Base64.padSymbol, 105, 114, Base64.padSymbol, 120, 115, 126, 111, 100, 109, 105, 116, 114, 115, Base64.padSymbol, 121, 124, 105, 124, Base64.padSymbol, 106, 124, 110, Base64.padSymbol, 115, 120, 122, 124, 105, 116, 107, 120, 51, 123, 82, 82, 71, 81, 64, Ascii.DC4, 64, 91, Ascii.DC4, 81, 90, 80, Ascii.DC4, 91, 82, Ascii.DC4, 89, 80, 85, 64, Ascii.DC4, 67, 85, 71, Ascii.DC4, 90, 81, 83, 85, 64, 93, 66, 81, Ascii.SUB, Base64.padSymbol, 4, Ascii.ETB, 0, 0, Ascii.ESC, Ascii.SYN, Ascii.ESC, Ascii.FS, Ascii.NAK, 82, 38, 0, 19, 17, Ascii.EM, 55, Ascii.FS, 17, 0, Ascii.VT, 2, 6, Ascii.ESC, Ascii.GS, Ascii.FS, 48, Ascii.GS, 10, 82, 2, 19, 0, 19, Ascii.US, Ascii.ETB, 6, Ascii.ETB, 0, 1, 82, Ascii.ESC, 1, 82, 7, Ascii.FS, 1, 7, 2, 2, Ascii.GS, 0, 6, Ascii.ETB, Ascii.SYN, 92, 84, 108, 110, 119, 119, 98, 99, 39, 119, 116, 116, 111, 39, 102, 115, 104, 106, 39, 47, 97, 102, 110, 107, 98, 99, 39, 115, 104, 39, 98, Byte.MAX_VALUE, 115, 117, 102, 100, 115, 39, 114, 114, 110, 99, 46, 60, 4, 6, Ascii.US, Ascii.US, 6, 1, 8, 79, Ascii.SO, Ascii.ESC, 0, 2, 79, Ascii.CAN, 6, Ascii.ESC, 7, 79, 3, 10, 1, 8, Ascii.ESC, 7, 79, 81, 79, 93, 94, 91, 88, 91, 87, 92, 89, 91, 88, 79, 71, Ascii.SUB, 1, Ascii.FS, Ascii.SUB, Ascii.US, Ascii.US, 0, Ascii.GS, Ascii.ESC, 10, Ascii.VT, 70, 65, 79, 119, 117, 108, 108, 117, 114, 123, 60, 105, 114, 111, 105, 108, 108, 115, 110, 104, 121, 120, 60, 121, 113, 111, 123, 60, 106, 121, 110, 111, 117, 115, 114, 38, 60, 57, 2, 9, Ascii.DC4, Ascii.FS, 9, Ascii.SI, Ascii.CAN, 9, 8, 76, 1, 3, 3, Ascii.SUB, 76, Ascii.SO, 3, Ascii.DC4, 66, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 97, 115, 123, 125, 50, 119, 124, 102, 96, 107, 50, 113, 125, 103, 124, 102, 40, 50, 107, 80, 86, 95, 80, 90, 82, 91, 90, Ascii.RS, 87, 80, 90, 87, 76, 91, 93, 74, Ascii.RS, 76, 91, 88, 91, 76, 91, 80, 93, 91, 107, 92, 79, 84, 92, 95, 81, 88, Ascii.GS, 81, 88, 83, 90, 73, 85, Ascii.GS, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, Ascii.GS, 84, 83, Ascii.GS, 78, 90, 77, 89, Ascii.GS, 91, 82, 72, 83, 89, Ascii.GS, Ascii.NAK, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, Ascii.DC4, 83, 66, 66, 94, 91, 81, 83, 70, 91, 93, 92, Ascii.GS, 74, Ascii.US, 87, 95, 65, 85, 66, 83, 83, 79, 74, 64, 66, 87, 74, 76, 77, Ascii.FF, 91, Ascii.SO, 78, 83, Ascii.ETB, Ascii.SO, 85, 87, 87, 70, 89, 84, 85, 95, Ascii.US, 88, 85, 70, 83, 40, 55, 58, 59, 49, 113, 51, 46, 106};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0I(C4J c4j, Uri uri) {
        String str;
        String str2;
        long j;
        long A0U;
        long A0Q;
        if (this.A0L == null || this.A0L.length == 0) {
            return;
        }
        c4j.A0f(8);
        int A01 = II.A01(c4j.A0C());
        long j2 = -9223372036854775807L;
        switch (A01) {
            case 0:
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                if (A0f[2].length() != 2) {
                    throw new RuntimeException();
                }
                A0f[0] = "4yWaL9iFGGaDiXT";
                long A0Q2 = c4j.A0Q();
                j2 = AbstractC01424a.A0U(c4j.A0Q(), 1000000L, A0Q2);
                j = this.A0C != -9223372036854775807L ? this.A0C + j2 : -9223372036854775807L;
                A0U = AbstractC01424a.A0U(c4j.A0Q(), 1000L, A0Q2);
                A0Q = c4j.A0Q();
                break;
            case 1:
                long A0Q3 = c4j.A0Q();
                j = AbstractC01424a.A0U(c4j.A0R(), 1000000L, A0Q3);
                A0U = AbstractC01424a.A0U(c4j.A0Q(), 1000L, A0Q3);
                A0Q = c4j.A0Q();
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                break;
            default:
                AnonymousClass44.A07(A0B(128, 22, 77), A0B(550, 35, 127) + A01);
                return;
        }
        byte[] bArr = new byte[c4j.A07()];
        c4j.A0k(bArr, 0, c4j.A07());
        int i = 0;
        C4J c4j2 = new C4J(this.A0V.A01(new EventMessage(str, str2, A0U, A0Q, bArr)));
        int A07 = c4j2.A07();
        H1[] h1Arr = this.A0L;
        int length = h1Arr.length;
        int i2 = 0;
        while (i2 < length) {
            H1 h1 = h1Arr[i2];
            c4j2.A0f(i);
            h1.AJu(uri);
            h1.AI7(c4j2, A07);
            i2++;
            i = 0;
        }
        if (j == -9223372036854775807L) {
            this.A0Y.addLast(new IU(j2, A07));
            this.A03 += A07;
            return;
        }
        if (this.A0T != null) {
            j = this.A0T.A05(j);
        }
        if (this.A0b && this.A0A != -9223372036854775807L) {
            j = this.A0A;
        }
        for (H1 h12 : this.A0L) {
            h12.AIA(j, 1, A07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0J(C4J c4j, C4J c4j2, String str, C0503Io c0503Io) throws C00982i {
        c4j.A0f(8);
        int A0C = c4j.A0C();
        if (c4j.A0C() != 1936025959) {
            return;
        }
        int A01 = II.A01(A0C);
        if (A0f[2].length() != 2) {
            throw new RuntimeException();
        }
        A0f[0] = "QrVDtjxvyixdHPq";
        if (A01 == 1) {
            c4j.A0g(4);
        }
        if (c4j.A0C() != 1) {
            throw new C00982i(A0B(50, 39, 69));
        }
        c4j2.A0f(8);
        int A0C2 = c4j2.A0C();
        if (c4j2.A0C() != 1936025959) {
            return;
        }
        int A012 = II.A01(A0C2);
        if (A012 == 1) {
            if (c4j2.A0Q() == 0) {
                throw new C00982i(A0B(662, 55, 94));
            }
        } else if (A012 >= 2) {
            c4j2.A0g(4);
        }
        if (c4j2.A0Q() != 1) {
            throw new C00982i(A0B(89, 39, 111));
        }
        c4j2.A0g(1);
        int A0I = c4j2.A0I();
        int i = (A0I & 240) >> 4;
        int i2 = A0I & 15;
        boolean z = c4j2.A0I() == 1;
        if (z) {
            int A0I2 = c4j2.A0I();
            byte[] bArr = new byte[16];
            c4j2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (A0I2 == 0) {
                int A0I3 = c4j2.A0I();
                bArr2 = new byte[A0I3];
                c4j2.A0k(bArr2, 0, A0I3);
            }
            c0503Io.A08 = true;
            c0503Io.A07 = new C0502In(z, str, A0I2, bArr, i, i2, bArr2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0187, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0R(C1591kj c1591kj) throws C00982i {
        C3M.A0A(this.A0W == null, A0B(585, 20, 15));
        DrmInitData A05 = A05(c1591kj.A02);
        C1591kj c1591kj2 = (C1591kj) C3M.A01(c1591kj.A06(1836475768));
        SparseArray<IP> sparseArray = new SparseArray<>();
        long j = -9223372036854775807L;
        int size = c1591kj2.A02.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C1590ki c1590ki = c1591kj2.A02.get(i);
                if (((II) c1590ki).A00 == 1953654136) {
                    Pair<Integer, IP> A03 = A03(c1590ki.A00);
                    int intValue = ((Integer) A03.first).intValue();
                    Object obj = A03.second;
                    if (A0f[7].charAt(29) == '0') {
                        break;
                    }
                    A0f[0] = "KUxAVqQLzsv7ujT";
                    sparseArray.put(intValue, (IP) obj);
                } else {
                    int i2 = ((II) c1590ki).A00;
                    if (A0f[7].charAt(29) != '0') {
                        A0f[2] = "EA";
                        if (i2 != 1835362404) {
                        }
                        j = A01(c1590ki.A00);
                    } else {
                        String[] strArr = A0f;
                        strArr[3] = "P1l2XCTjN0GLzwkC984rH7zDpCyyqZ";
                        strArr[6] = "39xRaNo9QFkrA6tLq";
                        if (i2 != 237072518) {
                        }
                        j = A01(c1590ki.A00);
                    }
                }
                i++;
            } else {
                SparseArray sparseArray2 = new SparseArray();
                int size2 = c1591kj.A01.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C1591kj c1591kj3 = c1591kj.A01.get(i3);
                    if (((II) c1591kj3).A00 == 1953653099) {
                        C0501Im A0A = A0A(IO.A0J(c1591kj3, c1591kj.A07(1836476516), j, A05, (this.A0M & 16) != 0, false));
                        if (A0A != null) {
                            sparseArray2.put(A0A.A00, A0A);
                        }
                    }
                }
                int size3 = sparseArray2.size();
                if (this.A0D.size() != 0) {
                    C3M.A08(this.A0D.size() == size3);
                    for (int i4 = 0; i4 < size3; i4++) {
                        C0501Im c0501Im = (C0501Im) sparseArray2.valueAt(i4);
                        this.A0D.get(c0501Im.A00).A08(c0501Im, A06(sparseArray, c0501Im.A00));
                    }
                    return;
                }
                for (int i5 = 0; i5 < size3; i5++) {
                    C0501Im c0501Im2 = (C0501Im) sparseArray2.valueAt(i5);
                    IV iv = new IV(this.A0F.AJh(i5, c0501Im2.A03));
                    iv.A08(c0501Im2, A06(sparseArray, c0501Im2.A00));
                    this.A0D.put(c0501Im2.A00, iv);
                    this.A08 = Math.max(this.A08, c0501Im2.A04);
                }
                A0D();
                GY gy = this.A0F;
                if (A0f[7].charAt(29) != '0') {
                    String[] strArr2 = A0f;
                    strArr2[3] = "NZTZhjA83sW4NrmiIOwSslFR5UdjBx";
                    strArr2[6] = "jWtg8I2sGrLmtghr5";
                    gy.A6G();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        A0W(r3, r0.A00, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r0 = r9.A07(1935763823);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r5 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (com.instagram.common.viewpoint.core.C1583kb.A0f[7].charAt(29) == '0') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        com.instagram.common.viewpoint.core.C1583kb.A0f[2] = "tW";
        A0K(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e0, code lost:
    
        com.instagram.common.viewpoint.core.C1583kb.A0f[0] = "kXc0iULHRQw05uA";
        A0K(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        r0 = r9.A07(1936027235);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
    
        A0L(r0.A00, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r1 = r9.A07(1935828848);
        r0 = r9.A07(1936158820);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        r2 = r1.A00;
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        r0 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        A0J(r2, r1, r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00de, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        r5 = r9.A02.size();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        if (r3 >= r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        r2 = r9.A02.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        if (((com.instagram.common.viewpoint.core.II) r2).A00 != 1970628964) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        A0M(r2.A00, r4, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0106, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0T(C1591kj c1591kj, SparseArray<IV> sparseArray, int i, byte[] bArr, boolean z) throws C00982i {
        C0502In A00;
        C1590ki A07;
        IV A09 = A09(c1591kj.A07(1952868452).A00, sparseArray, z);
        if (A09 == null) {
            return;
        }
        C0503Io c0503Io = A09.A07;
        long j = c0503Io.A05;
        A09.A05();
        if (c1591kj.A07(1952867444) != null) {
            int i2 = i & 2;
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            A0f[4] = "8CfIIEomKXR2z1rzEceKdGz";
            if (i2 == 0) {
                j = A02(c1591kj.A07(1952867444).A00);
            }
        }
        A0U(c1591kj, A09, j, i);
        C0501Im c0501Im = A09.A05;
        if (A0f[2].length() != 2) {
            A00 = c0501Im.A00(c0503Io.A06.A02);
            A07 = c1591kj.A07(1935763834);
        } else {
            String[] strArr = A0f;
            strArr[1] = "KgLNgt4jXc3ey27lHSoy2KaHmXxTtgSL";
            strArr[5] = "0TnPqkkfx8cOSuGK7tHkJ8yHXf83oy0i";
            A00 = c0501Im.A00(c0503Io.A06.A02);
            A07 = c1591kj.A07(1935763834);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0W(C0502In c0502In, C4J c4j, C0503Io c0503Io) throws C00982i {
        int i = c0502In.A00;
        c4j.A0f(8);
        if ((II.A00(c4j.A0C()) & 1) == 1) {
            c4j.A0g(8);
        }
        int A0I = c4j.A0I();
        int A0L = c4j.A0L();
        if (A0L != c0503Io.A00) {
            throw new C00982i(A0B(308, 17, 45) + A0L + A0B(0, 2, 27) + c0503Io.A00);
        }
        int i2 = 0;
        if (A0I == 0) {
            boolean[] zArr = c0503Io.A0F;
            for (int i3 = 0; i3 < A0L; i3++) {
                int A0I2 = c4j.A0I();
                i2 += A0I2;
                zArr[i3] = A0I2 > i;
            }
        } else {
            i2 = 0 + (A0I * A0L);
            Arrays.fill(c0503Io.A0F, 0, A0L, A0I > i);
        }
        c0503Io.A02(i2);
    }

    static {
        A0E();
        A0g = new InterfaceC0439Gb() { // from class: com.facebook.ads.redexgen.X.kf
            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final GX[] A5F() {
                return C1583kb.A0b();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC0438Ga.A01(this, uri, map);
            }
        };
        A0i = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0h = new C2D().A11(A0B(717, 18, 81)).A14();
    }

    public C1583kb() {
        this(0);
    }

    public C1583kb(int i) {
        this(i, null);
    }

    public C1583kb(int i, C4R c4r) {
        this(i, c4r, null, null);
    }

    public C1583kb(int i, C4R c4r, C0501Im c0501Im, DrmInitData drmInitData) {
        this(i, c4r, c0501Im, drmInitData, Collections.emptyList());
    }

    public C1583kb(int i, C4R c4r, C0501Im c0501Im, DrmInitData drmInitData, List<C1830or> list) {
        this(i, c4r, c0501Im, drmInitData, list, null, false, false, false);
    }

    public C1583kb(int i, C4R c4r, C0501Im c0501Im, DrmInitData drmInitData, List<C1830or> list, H1 h1, boolean z, boolean z2, boolean z3) {
        this.A0A = -9223372036854775807L;
        this.A0M = (c0501Im != null ? 8 : 0) | i;
        this.A0T = c4r;
        this.A0W = c0501Im;
        this.A0N = drmInitData;
        this.A0Z = Collections.unmodifiableList(list);
        this.A0U = h1;
        this.A0c = z;
        this.A0b = z2;
        this.A0a = z3;
        this.A0V = new HO();
        this.A0O = new C4J(16);
        this.A0R = new C4J(AbstractC0454Gq.A03);
        this.A0Q = new C4J(5);
        this.A0P = new C4J();
        this.A0d = new byte[16];
        this.A0S = new C4J(this.A0d);
        this.A0X = new ArrayDeque<>();
        this.A0Y = new ArrayDeque<>();
        this.A0D = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        A0C();
    }

    public static long A01(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        return II.A01(fullAtom) == 0 ? c4j.A0Q() : c4j.A0R();
    }

    public static long A02(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        int version = II.A01(fullAtom);
        return version == 1 ? c4j.A0R() : c4j.A0Q();
    }

    public static Pair<Integer, IP> A03(C4J c4j) {
        c4j.A0f(12);
        int defaultSampleDescriptionIndex = c4j.A0C();
        int trackId = c4j.A0L();
        int defaultSampleFlags = c4j.A0L();
        int defaultSampleSize = c4j.A0L();
        int defaultSampleDuration = c4j.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new IP(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C1590ki> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1590ki c1590ki = list.get(i);
            int leafChildrenSize = A0f[4].length();
            if (leafChildrenSize != 23) {
                throw new RuntimeException();
            }
            A0f[0] = "gRucWkmmr3YeQcV";
            C1590ki c1590ki2 = c1590ki;
            int leafChildrenSize2 = ((II) c1590ki2).A00;
            if (leafChildrenSize2 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c1590ki2.A00.A00;
                UUID A02 = AbstractC0494If.A02(bArr);
                if (A02 == null) {
                    AnonymousClass44.A07(A0B(128, 22, 77), A0B(455, 42, 100));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A02, A0B(766, 9, 61), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private IP A06(SparseArray<IP> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (IP) C3M.A01(sparseArray.get(i));
    }

    public static IV A07(SparseArray<IV> sparseArray) {
        IV iv = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            IV valueAt = sparseArray.valueAt(i);
            if (valueAt.A02 != valueAt.A07.A01) {
                long nextTrackRunOffset = valueAt.A07.A0E[valueAt.A02];
                if (nextTrackRunOffset < j) {
                    iv = valueAt;
                    j = nextTrackRunOffset;
                }
            }
        }
        return iv;
    }

    public static IV A08(SparseArray<IV> sparseArray, int i, boolean z) {
        if (sparseArray.size() == 1 && !z) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    private final C0501Im A0A(C0501Im c0501Im) {
        return c0501Im;
    }

    private void A0C() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x007e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0D() {
        if (this.A0L == null) {
            this.A0L = new H1[2];
            int i = 0;
            if (this.A0U != null) {
                this.A0L[0] = this.A0U;
                i = 0 + 1;
            }
            int emsgTrackOutputCount = this.A0M;
            if ((emsgTrackOutputCount & 4) != 0) {
                H1[] h1Arr = this.A0L;
                int i2 = i + 1;
                if (A0f[7].charAt(29) == '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A0f;
                strArr[1] = "2Ynf6gmdLfe6xE9EEWKUzFfHKl41sL7a";
                strArr[5] = "AN0qqeacVBgpTr6ZS3JdezHHRUzhKU8l";
                h1Arr[i] = this.A0F.AJh(this.A0D.size(), 5);
                i = i2;
            }
            this.A0L = (H1[]) Arrays.copyOf(this.A0L, i);
            for (H1 h1 : this.A0L) {
                h1.A6W(A0h);
            }
        }
        if (this.A0K == null) {
            this.A0K = new H1[this.A0Z.size()];
            for (int i3 = 0; i3 < i; i3++) {
                GY gy = this.A0F;
                int i4 = this.A0D.size();
                H1 output = gy.AJh(i4 + 1 + i3, 3);
                output.A6W(this.A0Z.get(i3));
                this.A0K[i3] = output;
            }
        }
    }

    private void A0F(long j) {
        while (!this.A0Y.isEmpty()) {
            IU removeFirst = this.A0Y.removeFirst();
            this.A03 -= removeFirst.A00;
            long j2 = j + removeFirst.A01;
            if (this.A0T != null) {
                j2 = this.A0T.A05(j2);
            }
            for (H1 h1 : this.A0L) {
                h1.AIA(j2, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j) throws C00982i {
        while (!this.A0X.isEmpty() && this.A0X.peek().A00 == j) {
            A0P(this.A0X.pop());
        }
        A0C();
    }

    public static void A0H(C4J c4j, int i, C0503Io c0503Io) throws C00982i {
        c4j.A0f(i + 8);
        int fullAtom = c4j.A0C();
        int flags = II.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c4j.A0L();
            int fullAtom4 = c0503Io.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c0503Io.A0F, 0, sampleCount, z);
                int fullAtom5 = c4j.A07();
                c0503Io.A02(fullAtom5);
                c0503Io.A04(c4j);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0B(308, 17, 45)).append(sampleCount).append(A0B(0, 2, 27));
            int fullAtom6 = c0503Io.A00;
            throw new C00982i(append.append(fullAtom6).toString());
        }
        throw new C00982i(A0B(399, 56, 17));
    }

    public static void A0K(C4J c4j, C0503Io c0503Io) throws C00982i {
        c4j.A0f(8);
        int flags = c4j.A0C();
        int fullAtom = II.A00(flags) & 1;
        if (fullAtom == 1) {
            c4j.A0g(8);
        }
        int A0L = c4j.A0L();
        if (A0L == 1) {
            int entryCount = II.A01(flags);
            c0503Io.A03 += entryCount == 0 ? c4j.A0Q() : c4j.A0R();
            return;
        }
        throw new C00982i(A0B(TypedValues.MotionType.TYPE_ANIMATE_RELATIVE_TO, 29, 113) + A0L);
    }

    public static void A0L(C4J c4j, C0503Io c0503Io) throws C00982i {
        A0H(c4j, 0, c0503Io);
    }

    public static void A0M(C4J c4j, C0503Io c0503Io, byte[] bArr) throws C00982i {
        c4j.A0f(8);
        c4j.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0i)) {
            return;
        }
        A0H(c4j, 16, c0503Io);
    }

    private void A0N(InterfaceC1619lN interfaceC1619lN) throws IOException {
        int i = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC1619lN.readFully(this.A0E.A00, 8, i);
            A0V(new C1590ki(this.A01, this.A0E), interfaceC1619lN);
        } else {
            interfaceC1619lN.AJJ(i);
        }
        A0G(interfaceC1619lN.A8f());
    }

    private void A0O(InterfaceC1619lN interfaceC1619lN) throws IOException {
        IV iv = null;
        long j = Long.MAX_VALUE;
        int size = this.A0D.size();
        int i = 0;
        while (true) {
            if (i < size) {
                IV nextTrackBundle = this.A0D.valueAt(i);
                C0503Io c0503Io = nextTrackBundle.A07;
                if (c0503Io.A0A) {
                    long nextDataOffset = c0503Io.A03;
                    String[] strArr = A0f;
                    if (strArr[3].length() == strArr[6].length()) {
                        break;
                    }
                    A0f[4] = "mIjUpcDFQdM2YkTgY6cnbvy";
                    if (nextDataOffset < j) {
                        j = c0503Io.A03;
                        iv = this.A0D.valueAt(i);
                    }
                }
                i++;
            } else {
                if (iv != null) {
                    int A8f = (int) (j - interfaceC1619lN.A8f());
                    if (A8f >= 0) {
                        interfaceC1619lN.AJJ(A8f);
                        iv.A07.A05(interfaceC1619lN);
                        return;
                    }
                    throw new C00982i(A0B(325, 39, 126));
                }
                if (A0f[4].length() == 23) {
                    A0f[0] = "NbtoUSPOiQE3wq0";
                    this.A02 = 3;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A0P(C1591kj c1591kj) throws C00982i {
        if (((II) c1591kj).A00 == 1836019574) {
            A0R(c1591kj);
        } else if (((II) c1591kj).A00 == 1836019558) {
            A0Q(c1591kj);
        } else {
            if (this.A0X.isEmpty()) {
                return;
            }
            this.A0X.peek().A08(c1591kj);
        }
    }

    private void A0Q(C1591kj c1591kj) throws C00982i {
        A0S(c1591kj, this.A0D, this.A0M, this.A0d, this.A0c);
        DrmInitData A05 = this.A0N != null ? null : A05(c1591kj.A02);
        if (A05 != null) {
            int i = this.A0D.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0D.valueAt(trackCount).A07(A05);
            }
        }
        if (this.A0B != -9223372036854775807L) {
            int size = this.A0D.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0D.valueAt(i2).A06(this.A0B);
            }
            this.A0B = -9223372036854775807L;
        }
    }

    public static void A0S(C1591kj c1591kj, SparseArray<IV> sparseArray, int i, byte[] bArr, boolean z) throws C00982i {
        int size = c1591kj.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1591kj child = c1591kj.A01.get(i2);
            int i3 = ((II) child).A00;
            if (i3 == 1953653094) {
                boolean z2 = true;
                if (size <= 1 || !z) {
                    z2 = false;
                }
                A0T(child, sparseArray, i, bArr, z2);
            }
        }
    }

    public static void A0U(C1591kj c1591kj, IV iv, long j, int i) {
        int i2 = 0;
        int i3 = 0;
        List<C1590ki> list = c1591kj.A02;
        int size = list.size();
        int i4 = 0;
        while (true) {
            String[] strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            A0f[0] = "3b9EJYgpciD07do";
            if (i4 < size) {
                C1590ki c1590ki = list.get(i4);
                if (((II) c1590ki).A00 == 1953658222) {
                    C4J trunData = c1590ki.A00;
                    trunData.A0f(12);
                    int A0L = trunData.A0L();
                    if (A0L > 0) {
                        i3 += A0L;
                        i2++;
                    }
                }
                i4++;
            } else {
                iv.A02 = 0;
                iv.A00 = 0;
                iv.A01 = 0;
                iv.A07.A03(i2, i3);
                int i5 = 0;
                int trunStartPosition = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    C1590ki c1590ki2 = list.get(i6);
                    if (((II) c1590ki2).A00 == 1953658222) {
                        trunStartPosition = A00(iv, i5, j, i, c1590ki2.A00, trunStartPosition);
                        i5++;
                    }
                }
                return;
            }
        }
    }

    private void A0V(C1590ki c1590ki, InterfaceC1619lN interfaceC1619lN) throws C00982i {
        Uri A9H;
        if (!this.A0X.isEmpty()) {
            this.A0X.peek().A09(c1590ki);
            return;
        }
        if (((II) c1590ki).A00 == 1936286840) {
            Pair<Long, C1624lT> A04 = A04(c1590ki.A00, interfaceC1619lN.A8f());
            this.A0C = ((Long) A04.first).longValue();
            this.A0F.AIN((InterfaceC0460Gw) A04.second);
            if (A0f[2].length() != 2) {
                throw new RuntimeException();
            }
            A0f[2] = "jw";
            this.A0H = true;
            return;
        }
        if (((II) c1590ki).A00 != 1701671783 || (A9H = interfaceC1619lN.A9H()) == null) {
            return;
        }
        A0I(c1590ki.A00, A9H);
    }

    public static boolean A0X(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    public static boolean A0Y(int i) {
        if (i != 1751411826 && i != 1835296868 && i != 1836476516 && i != 1936286840 && i != 1937011556 && i != 1952867444 && i != 1952868452 && i != 1953196132 && i != 1953654136 && i != 1953658222 && i != 1886614376) {
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[1] = "pufslWDHGkolcxIdleA53YlHTmcCni23";
            strArr[5] = "pxTVwd0BvZHkKJbeu8mcyfUHnPvesqsQ";
            if (i != 1935763834 && i != 1935763823 && i != 1936027235 && i != 1970628964 && i != 1935828848 && i != 1936158820 && i != 1701606260 && i != 1835362404 && i != 1701671783) {
                return false;
            }
        }
        return true;
    }

    private boolean A0Z(InterfaceC1619lN interfaceC1619lN) throws IOException {
        if (this.A00 == 0) {
            if (!interfaceC1619lN.AGh(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0f(0);
            this.A07 = this.A0O.A0Q();
            this.A01 = this.A0O.A0C();
        }
        if (this.A07 == 1) {
            interfaceC1619lN.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0R();
        } else if (this.A07 == 0) {
            long A8G = interfaceC1619lN.A8G();
            if (A8G == -1 && !this.A0X.isEmpty()) {
                A8G = this.A0X.peek().A00;
            }
            if (A8G != -1) {
                long A8f = A8G - interfaceC1619lN.A8f();
                int trackCount = this.A00;
                this.A07 = A8f + trackCount;
            }
        }
        if (this.A07 >= this.A00) {
            long A8f2 = interfaceC1619lN.A8f() - this.A00;
            if (this.A01 == 1836019558) {
                int size = this.A0D.size();
                for (int i = 0; i < size; i++) {
                    C0503Io c0503Io = this.A0D.valueAt(i).A07;
                    c0503Io.A02 = A8f2;
                    c0503Io.A03 = A8f2;
                    c0503Io.A04 = A8f2;
                }
            }
            if (this.A01 == 1835295092) {
                this.A0G = null;
                this.A09 = this.A07 + A8f2;
                if (!this.A0H) {
                    this.A0F.AIN(new C1614lI(this.A08, A8f2));
                    this.A0H = true;
                }
                this.A02 = 2;
                return true;
            }
            boolean A0X = A0X(this.A01);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "BTpsgrbOJA5y808qoKaZGmPima83kMX9";
            if (A0X) {
                long A8f3 = (interfaceC1619lN.A8f() + this.A07) - 8;
                this.A0X.push(new C1591kj(this.A01, A8f3));
                if (this.A07 == this.A00) {
                    A0G(A8f3);
                } else {
                    A0C();
                }
            } else if (A0Y(this.A01)) {
                if (this.A00 != 8) {
                    throw new C00982i(A0B(208, 51, 94));
                }
                if (this.A07 <= 2147483647L) {
                    this.A0E = new C4J((int) this.A07);
                    System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new C00982i(A0B(259, 49, 17));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                this.A02 = 1;
            } else {
                throw new C00982i(A0B(497, 53, 12));
            }
            return true;
        }
        throw new C00982i(A0B(2, 48, 125));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0205, code lost:
    
        com.instagram.common.viewpoint.core.GI.A07(r18.A06, r18.A0S);
        r3 = r18.A0S.A0A();
        r7.AI7(r18.A0S, r3);
        r18.A06 += r3;
        r18.A04 += r3;
        r18.A0I = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0228, code lost:
    
        if (r18.A04 >= r18.A06) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022a, code lost:
    
        r11 = r18.A06 - r18.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023b, code lost:
    
        if (com.instagram.common.viewpoint.core.C1583kb.A0f[4].length() == 23) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023f, code lost:
    
        com.instagram.common.viewpoint.core.C1583kb.A0f[4] = "4fzpRPid5Z3e8Rz7esUDMjQ";
        r18.A04 += r7.AI5(r19, r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01fd, code lost:
    
        if (r5 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r18.A0G.A09() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        r18.A0G = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r18.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r18.A0G.A09() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        if (r5 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        r10 = r18.A0Q.A00;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r5 = r11.A01 + 1;
        r3 = 4 - r11.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011c, code lost:
    
        if (r18.A04 >= r18.A06) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0120, code lost:
    
        if (r18.A05 != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0188, code lost:
    
        if (r18.A0J == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018a, code lost:
    
        r18.A0P.A0d(r18.A05);
        r19.readFully(r18.A0P.A00, r13, r18.A05);
        r7.AI7(r18.A0P, r18.A05);
        r12 = r18.A05;
        r16 = com.instagram.common.viewpoint.core.AbstractC0454Gq.A02(r18.A0P.A00, r18.A0P.A0A());
        r18.A0P.A0f(A0B(756, 10, 83).equals(r11.A07.A0W) ? 1 : 0);
        r18.A0P.A0e(r16);
        com.instagram.common.viewpoint.core.JG.A03(r1, r18.A0P, r18.A0K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01da, code lost:
    
        r18.A04 += r12;
        r18.A05 -= r12;
        r14 = 4;
        r12 = 1;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e9, code lost:
    
        r12 = r7.AI5(r19, r18.A05, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        r19.readFully(r10, r3, r5);
        r18.A0Q.A0f(r13);
        r0 = r18.A0Q.A0C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        if (r0 < r12) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        r18.A05 = r0 - 1;
        r18.A0R.A0f(r13);
        r7.AI7(r18.A0R, r14);
        r7.AI7(r18.A0Q, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        if (r18.A0K.length <= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0154, code lost:
    
        if (com.instagram.common.viewpoint.core.AbstractC0454Gq.A0I(r11.A07.A0W, r10[r14]) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0157, code lost:
    
        r18.A0J = r0;
        r18.A04 += 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0169, code lost:
    
        if (com.instagram.common.viewpoint.core.C1583kb.A0f[2].length() == 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0171, code lost:
    
        r15 = com.instagram.common.viewpoint.core.C1583kb.A0f;
        r15[3] = "rGJs1bdDcV9vWCpHaV2ADCTyGiB9Xi";
        r15[6] = "SO50y9aywvhjzs541";
        r18.A06 += r3;
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0184, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0315, code lost:
    
        throw new com.instagram.common.viewpoint.core.C00982i(A0B(org.objectweb.asm.Opcodes.ARRAYLENGTH, 18, 94));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0250, code lost:
    
        r11 = r8.A0G[r6];
        r8 = null;
        r3 = r18.A0G.A00();
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x025b, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x025d, code lost:
    
        r11 = (r11 ? 1 : 0) | 0;
        r8 = r3.A01;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0262, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0264, code lost:
    
        if (r18.A0G == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0266, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x026a, code lost:
    
        if (r18.A0G.A05 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026c, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0272, code lost:
    
        if (r18.A0G.A05.A07 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0274, code lost:
    
        r6 = r18.A0G.A05.A07.A0W;
        r5 = com.instagram.common.viewpoint.core.C1583kb.A0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x028e, code lost:
    
        if (r5[3].length() == r5[6].length()) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0290, code lost:
    
        com.instagram.common.viewpoint.core.C1583kb.A0f[2] = "aG";
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x029f, code lost:
    
        if (r6 != A0B(735, 21, 64)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02a1, code lost:
    
        r11 = (r11 ? 1 : 0) | true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02a3, code lost:
    
        r5 = r1;
        r7.AIA(r1, r11, r18.A06, 0, r8);
        r18.A0A = r5;
        A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02b9, code lost:
    
        if (r18.A0G.A09() != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02bb, code lost:
    
        r2 = com.instagram.common.viewpoint.core.C1583kb.A0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02ce, code lost:
    
        if (r2[1].charAt(23) == r2[5].charAt(23)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02d0, code lost:
    
        r18.A0G = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02d7, code lost:
    
        r2 = com.instagram.common.viewpoint.core.C1583kb.A0f;
        r2[1] = "si2y9gsn9mC0ma4HRQ4DLaiHkSELP0XP";
        r2[5] = "aeCrUYztm6cMo33HVXFI6qvHQZYHBxKr";
        r18.A0G = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02d2, code lost:
    
        r18.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02d6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0203, code lost:
    
        if (r18.A0I == false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0a(InterfaceC1619lN interfaceC1619lN) throws IOException {
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        if (this.A02 == 3) {
            if (this.A0G == null) {
                IV A07 = A07(this.A0D);
                if (A07 == null) {
                    int A8f = (int) (this.A09 - interfaceC1619lN.A8f());
                    if (A0f[0].length() == 15) {
                        A0f[4] = "i1YiOY4gD0FAVv8vBgekv9L";
                        if (A8f >= 0) {
                            interfaceC1619lN.AJJ(A8f);
                            A0C();
                            return false;
                        }
                        throw new C00982i(A0B(364, 35, 87));
                    }
                    throw new RuntimeException();
                }
                int A8f2 = (int) (A07.A07.A0E[A07.A02] - interfaceC1619lN.A8f());
                if (A8f2 < 0) {
                    AnonymousClass44.A07(A0B(128, 22, 77), A0B(Opcodes.FCMPG, 40, 19));
                    A8f2 = 0;
                }
                interfaceC1619lN.AJJ(A8f2);
                this.A0G = A07;
            }
            this.A06 = this.A0G.A07.A0B[this.A0G.A01];
            if (this.A0G.A01 < this.A0G.A03) {
                interfaceC1619lN.AJJ(this.A06);
                if (A0f[4].length() != 23) {
                    this.A0G.A02();
                } else {
                    A0f[0] = "A3KFlo0OZ1vz3cN";
                    this.A0G.A02();
                }
            } else {
                if (this.A0G.A05.A02 == 1) {
                    this.A06 -= 8;
                    interfaceC1619lN.AJJ(8);
                }
                this.A04 = this.A0G.A04();
                this.A06 += this.A04;
                this.A02 = 4;
                this.A05 = 0;
            }
        }
        C0503Io c0503Io = this.A0G.A07;
        C0501Im c0501Im = this.A0G.A05;
        H1 h1 = this.A0G.A06;
        int i4 = this.A0G.A01;
        long A00 = c0503Io.A00(i4);
        if (this.A0T != null) {
            A00 = this.A0T.A05(A00);
        }
        int i5 = c0501Im.A01;
        if (A0f[0].length() == 15) {
            String[] strArr = A0f;
            strArr[1] = "1reQ2pcS16Hgv6ya8EYaKcYHA8e9gTqM";
            strArr[5] = "zXUoCiVQDhh6v7GYUtROZrCHyvEA77y8";
        }
        throw new RuntimeException();
    }

    public static /* synthetic */ GX[] A0b() {
        return new GX[]{new C1583kb()};
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A0F = gy;
        if (this.A0W != null) {
            IV iv = new IV(gy.AJh(0, this.A0W.A03));
            iv.A08(this.A0W, new IP(0, 0, 0, 0));
            this.A0D.put(0, iv);
            A0D();
            this.A0F.A6G();
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1619lN interfaceC1619lN, C0457Gt c0457Gt) throws IOException {
        while (true) {
            int i = this.A02;
            if (A0f[0].length() == 15) {
                String[] strArr = A0f;
                strArr[3] = "yYIiClYY3RZS73RDJ5vLPk2bDdZFXU";
                strArr[6] = "bGm4sUzBrXbQjG5ES";
                switch (i) {
                    case 0:
                        if (!A0Z(interfaceC1619lN)) {
                            return -1;
                        }
                        break;
                    case 1:
                        A0N(interfaceC1619lN);
                        break;
                    case 2:
                        A0O(interfaceC1619lN);
                        break;
                    default:
                        if (!A0a(interfaceC1619lN)) {
                            break;
                        } else {
                            return 0;
                        }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        int size = this.A0D.size();
        for (int i = 0; i < size; i++) {
            this.A0D.valueAt(i).A05();
        }
        this.A0Y.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0X.clear();
        this.A0I = false;
        A0C();
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1619lN interfaceC1619lN) throws IOException {
        return AbstractC0499Ik.A01(interfaceC1619lN);
    }
}
