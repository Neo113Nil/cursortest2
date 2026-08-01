package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.We, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0919We implements InterfaceC0399Ba {
    public static byte[] A0X;
    public static String[] A0Y = {"XdJWu", "FUlE3E4RGCFuY0n1jkLa4sDNStY", "LTfWg4MeBgD", "ea2mTe", "5aN4xnjUR54", "JRDUjTwIRED0cdRjG5ryaKaac6vLzQ8c", "s80pf3iUB", "VFz"};
    public static final InterfaceC0402Bd A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
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
    public InterfaceC0401Bc A0C;
    public CD A0D;
    public C0541Hh A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC0409Bm[] A0H;
    public InterfaceC0409Bm[] A0I;
    public final int A0J;
    public final SparseArray<CD> A0K;
    public final DrmInitData A0L;
    public final InterfaceC0409Bm A0M;
    public final CM A0N;
    public final C0541Hh A0O;
    public final C0541Hh A0P;
    public final C0541Hh A0Q;
    public final C0541Hh A0R;
    public final C0553Ht A0S;
    public final ArrayDeque<C0925Wk> A0T;
    public final ArrayDeque<CC> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(CD cd, int i, long j, int i2, C0541Hh c0541Hh, int i3) {
        int i4;
        int i5 = i3;
        long j2 = j;
        c0541Hh.A0Y(8);
        int A00 = C1.A00(c0541Hh.A08());
        CM cm = cd.A05;
        CO co = cd.A07;
        C7 c7 = co.A07;
        co.A0E[i] = c0541Hh.A0H();
        co.A0G[i] = co.A05;
        if ((A00 & 1) != 0) {
            long[] jArr = co.A0G;
            jArr[i] = jArr[i] + c0541Hh.A08();
        }
        boolean z = (A00 & 4) != 0;
        int i6 = c7.A01;
        if (z) {
            i6 = c0541Hh.A0H();
        }
        boolean z2 = (A00 & 256) != 0;
        boolean z3 = (A00 & 512) != 0;
        boolean z4 = (A00 & 1024) != 0;
        boolean z5 = (A00 & 2048) != 0;
        long j3 = 0;
        if (cm.A08 != null && cm.A08.length == 1 && cm.A08[0] == 0) {
            j3 = C0557Hx.A0F(cm.A09[0], 1000L, cm.A06);
        }
        int[] iArr = co.A0D;
        int[] iArr2 = co.A0C;
        long[] jArr2 = co.A0F;
        boolean[] zArr = co.A0I;
        boolean z6 = cm.A03 == 2 && (i2 & 1) != 0;
        int i7 = i5 + co.A0E[i];
        long j4 = cm.A06;
        if (i > 0) {
            j2 = co.A06;
        }
        while (i5 < i7) {
            int A0H = z2 ? c0541Hh.A0H() : c7.A00;
            if (z3) {
                i4 = c0541Hh.A0H();
            } else {
                i4 = c7.A03;
                if (A0Y[5].charAt(2) == 'C') {
                    throw new RuntimeException();
                }
                A0Y[6] = "dkwnFPd0";
            }
            int A08 = (i5 == 0 && z) ? i6 : z4 ? c0541Hh.A08() : c7.A01;
            if (z5) {
                iArr2[i5] = (int) ((c0541Hh.A08() * 1000) / j4);
            } else {
                iArr2[i5] = 0;
            }
            jArr2[i5] = C0557Hx.A0F(j2, 1000L, j4) - j3;
            iArr[i5] = i4;
            zArr[i5] = ((A08 >> 16) & 1) == 0 && (!z6 || i5 == 0);
            j2 += A0H;
            i5++;
        }
        co.A06 = j2;
        return i7;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, X5> A04(C0541Hh c0541Hh, long j) throws C03519d {
        long A0N;
        long A0N2;
        c0541Hh.A0Y(8);
        int A01 = C1.A01(c0541Hh.A08());
        c0541Hh.A0Z(4);
        long A0M = c0541Hh.A0M();
        if (A01 == 0) {
            A0N = c0541Hh.A0M();
            A0N2 = j + c0541Hh.A0M();
        } else {
            A0N = c0541Hh.A0N();
            A0N2 = j + c0541Hh.A0N();
        }
        long A0F = C0557Hx.A0F(A0N, 1000000L, A0M);
        c0541Hh.A0Z(2);
        int A0I = c0541Hh.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        long j2 = A0F;
        for (int i = 0; i < A0I; i++) {
            int A08 = c0541Hh.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new C03519d(A0A(581, 28, 126));
            }
            long A0M2 = c0541Hh.A0M();
            iArr[i] = Integer.MAX_VALUE & A08;
            jArr[i] = A0N2;
            jArr3[i] = j2;
            A0N += A0M2;
            j2 = C0557Hx.A0F(A0N, 1000000L, A0M);
            jArr2[i] = j2 - jArr3[i];
            c0541Hh.A0Z(4);
            A0N2 += iArr[i];
        }
        return Pair.create(Long.valueOf(A0F), new X5(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static CD A09(C0541Hh c0541Hh, SparseArray<CD> sparseArray) {
        c0541Hh.A0Y(8);
        int A00 = C1.A00(c0541Hh.A08());
        CD A08 = A08(sparseArray, c0541Hh.A08());
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0N = c0541Hh.A0N();
            A08.A07.A05 = A0N;
            A08.A07.A04 = A0N;
        }
        C7 c7 = A08.A04;
        A08.A07.A07 = new C7((A00 & 2) != 0 ? c0541Hh.A0H() - 1 : c7.A02, (A00 & 8) != 0 ? c0541Hh.A0H() : c7.A00, (A00 & 16) != 0 ? c0541Hh.A0H() : c7.A03, (A00 & 32) != 0 ? c0541Hh.A0H() : c7.A01);
        return A08;
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{117, 121, 84, 97, 122, 120, 53, 102, 124, 111, 112, 53, 121, 112, 102, 102, 53, 97, 125, 116, 123, 53, 125, 112, 116, 113, 112, 103, 53, 121, 112, 123, 114, 97, 125, 53, Base64.padSymbol, 96, 123, 102, 96, 101, 101, 122, 103, 97, 112, 113, 60, 59, 114, 89, 67, 69, 78, Ascii.ETB, 84, 88, 66, 89, 67, Ascii.ETB, 94, 89, Ascii.ETB, 68, 85, 80, 71, Ascii.ETB, Ascii.SYN, 10, Ascii.ETB, 6, Ascii.ETB, Ascii.US, 66, 89, 68, 66, 71, 71, 88, 69, 67, 82, 83, Ascii.RS, Ascii.EM, 119, 92, 70, 64, 75, Ascii.DC2, 81, 93, 71, 92, 70, Ascii.DC2, 91, 92, Ascii.DC2, 65, 85, 66, 86, Ascii.DC2, 19, Ascii.SI, Ascii.DC2, 3, Ascii.DC2, Ascii.SUB, 71, 92, 65, 71, 66, 66, 93, 64, 70, 87, 86, Ascii.ESC, Ascii.FS, 57, Ascii.CR, Ascii.RS, Ascii.CAN, Ascii.DC2, Ascii.SUB, 17, Ascii.VT, Ascii.SUB, Ascii.ESC, 50, Ascii.SI, 75, 58, 7, Ascii.VT, Ascii.CR, Ascii.RS, Ascii.FS, Ascii.VT, 16, Ascii.CR, 0, 46, 39, 38, 59, 32, 39, 46, 105, 39, 44, 46, 40, Base64.padSymbol, 32, 63, 44, 105, 38, 47, 47, 58, 44, Base64.padSymbol, 105, Base64.padSymbol, 38, 105, 58, 40, 36, 57, 37, 44, 105, 45, 40, Base64.padSymbol, 40, 103, 51, Ascii.SUB, Ascii.RS, Ascii.EM, 95, Ascii.RS, Ascii.VT, 16, Ascii.DC2, 95, Ascii.ESC, Ascii.SUB, Ascii.EM, Ascii.SYN, 17, Ascii.SUB, Ascii.FF, 95, Ascii.SUB, 7, Ascii.VT, Ascii.SUB, 17, Ascii.ESC, Ascii.SUB, Ascii.ESC, 95, Ascii.RS, Ascii.VT, 16, Ascii.DC2, 95, Ascii.FF, Ascii.SYN, 5, Ascii.SUB, 95, 87, 10, 17, Ascii.FF, 10, Ascii.SI, Ascii.SI, 16, Ascii.CR, Ascii.VT, Ascii.SUB, Ascii.ESC, 86, 81, Ascii.RS, 55, 51, 52, 114, 51, 38, Base64.padSymbol, 63, 114, 37, 59, 38, 58, 114, 62, 55, 60, 53, 38, 58, 114, 108, 114, 96, 99, 102, 101, 102, 106, 97, 100, 102, 101, 114, 122, 39, 60, 33, 39, 34, 34, Base64.padSymbol, 32, 38, 55, 54, 123, 124, 63, Ascii.SYN, Ascii.GS, Ascii.DC4, 7, Ascii.ESC, 83, Ascii.RS, Ascii.SUB, 0, Ascii.RS, Ascii.DC2, 7, 16, Ascii.ESC, 73, 83, Ascii.SI, 38, 38, 51, 37, 52, 96, 52, 47, 96, 37, 46, 35, 50, 57, 48, 52, 41, 47, 46, 96, 36, 33, 52, 33, 96, 55, 33, 51, 96, 46, 37, 39, 33, 52, 41, 54, 37, 110, 16, 57, 57, 44, 58, 43, Byte.MAX_VALUE, 43, 48, Byte.MAX_VALUE, 58, 49, 59, Byte.MAX_VALUE, 48, 57, Byte.MAX_VALUE, 50, 59, 62, 43, Byte.MAX_VALUE, 40, 62, 44, Byte.MAX_VALUE, 49, 58, 56, 62, 43, 54, 41, 58, 113, 106, 83, 64, 87, 87, 76, 65, 76, 75, 66, 5, 113, 87, 68, 70, 78, 96, 75, 70, 87, 92, 85, 81, 76, 74, 75, 103, 74, 93, 5, 85, 68, 87, 68, 72, 64, 81, 64, 87, 86, 5, 76, 86, 5, 80, 75, 86, 80, 85, 85, 74, 87, 81, 64, 65, Ascii.VT, Ascii.SO, 54, 52, 45, 45, 56, 57, 125, 45, 46, 46, 53, 125, 60, 41, 50, 48, 125, 117, 59, 60, 52, 49, 56, 57, 125, 41, 50, 125, 56, 37, 41, 47, 60, 62, 41, 125, 40, 40, 52, 57, 116, 54, Ascii.SO, Ascii.FF, Ascii.NAK, Ascii.NAK, Ascii.FF, Ascii.VT, 2, 69, 4, 17, 10, 8, 69, Ascii.DC2, Ascii.FF, 17, Ascii.CR, 69, 9, 0, Ascii.VT, 2, 17, Ascii.CR, 69, 91, 69, 87, 84, 81, 82, 81, 93, 86, 83, 81, 82, 69, 77, 16, Ascii.VT, Ascii.SYN, 16, Ascii.NAK, Ascii.NAK, 10, Ascii.ETB, 17, 0, 1, 76, 75, 62, 5, Ascii.SO, 19, Ascii.ESC, Ascii.SO, 8, Ascii.US, Ascii.SO, Ascii.SI, 75, 6, 4, 4, Ascii.GS, 75, 9, 4, 19, 69, Ascii.CR, 54, Base64.padSymbol, 32, 40, Base64.padSymbol, 59, 44, Base64.padSymbol, 60, 120, 43, 57, 49, 55, 120, Base64.padSymbol, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 98, 120, 76, 119, 113, 120, 119, 125, 117, 124, 125, 57, 112, 119, 125, 112, 107, 124, 122, 109, 57, 107, 124, Byte.MAX_VALUE, 124, 107, 124, 119, 122, 124, 58, Ascii.CR, Ascii.RS, 5, Ascii.CR, Ascii.SO, 0, 9, 76, 0, 9, 2, Ascii.VT, Ascii.CAN, 4, 76, 8, 9, Ascii.US, Ascii.SI, Ascii.RS, 5, Ascii.FS, Ascii.CAN, 5, 3, 2, 76, 5, 2, 76, Ascii.US, Ascii.VT, Ascii.FS, 8, 76, 10, 3, Ascii.EM, 2, 8, 76, 68, Ascii.EM, 2, Ascii.US, Ascii.EM, Ascii.FS, Ascii.FS, 3, Ascii.RS, Ascii.CAN, 9, 8, 69, Ascii.US, Ascii.SO, Ascii.SO, Ascii.DC2, Ascii.ETB, Ascii.GS, Ascii.US, 10, Ascii.ETB, 17, 16, 81, 6, 83, Ascii.ESC, 19, Ascii.CR, Ascii.EM, 3, Ascii.NAK, Ascii.EM, Ascii.ETB, Ascii.ETB, 8, 5, 4, Ascii.SO, 78, 9, 4, Ascii.ETB, 2, 6, Ascii.EM, Ascii.DC4, Ascii.NAK, Ascii.US, 95, Ascii.GS, 0, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0K(C0925Wk c0925Wk) throws C03519d {
        HI.A06(this.A0N == null, A0A(532, 20, 12));
        DrmInitData drmInitData = this.A0L;
        if (drmInitData == null) {
            drmInitData = A05(c0925Wk.A02);
        }
        C0925Wk A06 = c0925Wk.A06(C1.A0n);
        SparseArray<C7> sparseArray = new SparseArray<>();
        long j = -9223372036854775807L;
        int size = A06.A02.size();
        for (int i = 0; i < size; i++) {
            C0924Wj c0924Wj = A06.A02.get(i);
            if (((C1) c0924Wj).A00 == C1.A1N) {
                Pair<Integer, C7> A03 = A03(c0924Wj.A00);
                sparseArray.put(((Integer) A03.first).intValue(), (C7) A03.second);
            } else if (((C1) c0924Wj).A00 == C1.A0g) {
                j = A01(c0924Wj.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0925Wk.A01.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0925Wk c0925Wk2 = c0925Wk.A01.get(i2);
            if (((C1) c0925Wk2).A00 == C1.A1M) {
                CM A0C = C6.A0C(c0925Wk2, c0925Wk.A07(C1.A0o), j, drmInitData, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    sparseArray2.put(A0C.A00, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            HI.A04(this.A0K.size() == size3);
            for (int i3 = 0; i3 < size3; i3++) {
                CM cm = (CM) sparseArray2.valueAt(i3);
                this.A0K.get(cm.A00).A07(cm, A06(sparseArray, cm.A00));
            }
            return;
        }
        for (int i4 = 0; i4 < size3; i4++) {
            CM cm2 = (CM) sparseArray2.valueAt(i4);
            CD cd = new CD(this.A0C.AFx(i4, cm2.A03));
            cd.A07(cm2, A06(sparseArray, cm2.A00));
            this.A0K.put(cm2.A00, cd);
            this.A08 = Math.max(this.A08, cm2.A04);
        }
        A0C();
        this.A0C.A5T();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0M(C0925Wk c0925Wk, SparseArray<CD> sparseArray, int i, byte[] bArr) throws C03519d {
        CD A09 = A09(c0925Wk.A07(C1.A1J).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        CO co = A09.A07;
        long j = co.A06;
        A09.A04();
        if (c0925Wk.A07(C1.A1I) != null && (i & 2) == 0) {
            j = A02(c0925Wk.A07(C1.A1I).A00);
        }
        A0N(c0925Wk, A09, j, i);
        CN A00 = A09.A05.A00(co.A07.A02);
        C0924Wj A07 = c0925Wk.A07(C1.A0v);
        if (A07 != null) {
            A0P(A00, A07.A00, co);
        }
        C0924Wj A072 = c0925Wk.A07(C1.A0u);
        if (A072 != null) {
            A0S(A072.A00, co);
        }
        C0924Wj A073 = c0925Wk.A07(C1.A11);
        if (A073 != null) {
            A0T(A073.A00, co);
        }
        C0924Wj A074 = c0925Wk.A07(C1.A0y);
        C0924Wj A075 = c0925Wk.A07(C1.A12);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, co);
        }
        int size = c0925Wk.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0924Wj c0924Wj = c0925Wk.A02.get(i2);
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "89j";
            C0924Wj c0924Wj2 = c0924Wj;
            if (((C1) c0924Wj2).A00 == C1.A1R) {
                A0U(c0924Wj2.A00, co, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0P(CN cn, C0541Hh c0541Hh, CO co) throws C03519d {
        int i = cn.A00;
        c0541Hh.A0Y(8);
        if ((C1.A00(c0541Hh.A08()) & 1) == 1) {
            c0541Hh.A0Z(8);
        }
        int A0E = c0541Hh.A0E();
        int A0H = c0541Hh.A0H();
        if (A0H != co.A00) {
            throw new C03519d(A0A(290, 17, 20) + A0H + A0A(0, 2, 62) + co.A00);
        }
        int i2 = 0;
        if (A0E == 0) {
            boolean[] zArr = co.A0H;
            for (int i3 = 0; i3 < A0H; i3++) {
                int A0E2 = c0541Hh.A0E();
                i2 += A0E2;
                zArr[i3] = A0E2 > i;
            }
        } else {
            i2 = 0 + (A0E * A0H);
            Arrays.fill(co.A0H, 0, A0H, A0E > i);
        }
        co.A02(i2);
        if (A0Y[6].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[2] = "tC3WLCXP6DZ";
        strArr[4] = "0Zxl8CEli3D";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(C0541Hh c0541Hh, C0541Hh c0541Hh2, String str, CO co) throws C03519d {
        c0541Hh.A0Y(8);
        int A08 = c0541Hh.A08();
        int A082 = c0541Hh.A08();
        int i = A0a;
        if (A082 != i) {
            return;
        }
        if (C1.A01(A08) == 1) {
            c0541Hh.A0Z(4);
        }
        if (c0541Hh.A08() != 1) {
            throw new C03519d(A0A(50, 39, 80));
        }
        c0541Hh2.A0Y(8);
        int A083 = c0541Hh2.A08();
        if (c0541Hh2.A08() != i) {
            return;
        }
        int A01 = C1.A01(A083);
        if (A01 == 1) {
            if (c0541Hh2.A0M() == 0) {
                throw new C03519d(A0A(TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 55, 11));
            }
        } else if (A01 >= 2) {
            c0541Hh2.A0Z(4);
        }
        if (c0541Hh2.A0M() != 1) {
            throw new C03519d(A0A(89, 39, 85));
        }
        c0541Hh2.A0Z(1);
        int A0E = c0541Hh2.A0E();
        int i2 = (A0E & 240) >> 4;
        int i3 = A0E & 15;
        boolean z = c0541Hh2.A0E() == 1;
        if (z) {
            int A0E2 = c0541Hh2.A0E();
            byte[] bArr = new byte[16];
            c0541Hh2.A0c(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (z && A0E2 == 0) {
                int A0E3 = c0541Hh2.A0E();
                bArr2 = new byte[A0E3];
                c0541Hh2.A0c(bArr2, 0, A0E3);
            }
            co.A0A = true;
            co.A08 = new CN(z, str, A0E2, bArr, i2, i3, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new C0920Wf();
        A0a = C0557Hx.A08(A0A(682, 4, 23));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 25), Long.MAX_VALUE);
    }

    public C0919We() {
        this(0);
    }

    public C0919We(int i) {
        this(i, null);
    }

    public C0919We(int i, C0553Ht c0553Ht) {
        this(i, c0553Ht, null, null);
    }

    public C0919We(int i, C0553Ht c0553Ht, CM cm, DrmInitData drmInitData) {
        this(i, c0553Ht, cm, drmInitData, Collections.emptyList());
    }

    public C0919We(int i, C0553Ht c0553Ht, CM cm, DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i, c0553Ht, cm, drmInitData, closedCaptionFormats, null);
    }

    public C0919We(int i, C0553Ht c0553Ht, CM cm, DrmInitData drmInitData, List<Format> closedCaptionFormats, InterfaceC0409Bm interfaceC0409Bm) {
        this.A0J = (cm != null ? 8 : 0) | i;
        this.A0S = c0553Ht;
        this.A0N = cm;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = interfaceC0409Bm;
        this.A0O = new C0541Hh(16);
        this.A0R = new C0541Hh(C0537Hd.A03);
        this.A0Q = new C0541Hh(5);
        this.A0P = new C0541Hh();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    public static long A01(C0541Hh c0541Hh) {
        c0541Hh.A0Y(8);
        int fullAtom = c0541Hh.A08();
        return C1.A01(fullAtom) == 0 ? c0541Hh.A0M() : c0541Hh.A0N();
    }

    public static long A02(C0541Hh c0541Hh) {
        c0541Hh.A0Y(8);
        int fullAtom = c0541Hh.A08();
        int version = C1.A01(fullAtom);
        return version == 1 ? c0541Hh.A0N() : c0541Hh.A0M();
    }

    public static Pair<Integer, C7> A03(C0541Hh c0541Hh) {
        c0541Hh.A0Y(12);
        int defaultSampleDescriptionIndex = c0541Hh.A08();
        int trackId = c0541Hh.A0H();
        int defaultSampleFlags = c0541Hh.A0H();
        int defaultSampleSize = c0541Hh.A0H();
        int defaultSampleDuration = c0541Hh.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C7(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C0924Wj> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0924Wj c0924Wj = list.get(i);
            int leafChildrenSize = ((C1) c0924Wj).A00;
            if (leafChildrenSize == C1.A0s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c0924Wj.A00.A00;
                UUID A03 = CJ.A03(bArr);
                int leafChildrenSize2 = A0Y[3].length();
                if (leafChildrenSize2 != 6) {
                    throw new RuntimeException();
                }
                A0Y[7] = "tzO";
                if (A03 == null) {
                    Log.w(A0A(128, 22, 24), A0A(437, 42, 58));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A03, A0A(696, 9, 23), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C7 A06(SparseArray<C7> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C7) HI.A01(sparseArray.get(i));
    }

    public static CD A07(SparseArray<CD> sparseArray) {
        CD cd = null;
        long trunOffset = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            CD valueAt = sparseArray.valueAt(i);
            int i2 = valueAt.A02;
            if (A0Y[1].length() == 5) {
                throw new RuntimeException();
            }
            A0Y[0] = "VXm0n";
            if (i2 != valueAt.A07.A02) {
                long nextTrackRunOffset = valueAt.A07.A0G[valueAt.A02];
                if (nextTrackRunOffset < trunOffset) {
                    cd = valueAt;
                    trunOffset = nextTrackRunOffset;
                }
            }
        }
        return cd;
    }

    public static CD A08(SparseArray<CD> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0068 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0C() {
        if (this.A0I == null) {
            InterfaceC0409Bm[] interfaceC0409BmArr = new InterfaceC0409Bm[2];
            this.A0I = interfaceC0409BmArr;
            int i = 0;
            InterfaceC0409Bm interfaceC0409Bm = this.A0M;
            if (interfaceC0409Bm != null) {
                interfaceC0409BmArr[0] = interfaceC0409Bm;
                i = 0 + 1;
            }
            if ((this.A0J & 4) != 0) {
                int emsgTrackOutputCount = i + 1;
                interfaceC0409BmArr[i] = this.A0C.AFx(this.A0K.size(), 4);
                i = emsgTrackOutputCount;
            }
            InterfaceC0409Bm[] interfaceC0409BmArr2 = (InterfaceC0409Bm[]) Arrays.copyOf(this.A0I, i);
            this.A0I = interfaceC0409BmArr2;
            for (InterfaceC0409Bm interfaceC0409Bm2 : interfaceC0409BmArr2) {
                interfaceC0409Bm2.A5j(A0b);
            }
        }
        InterfaceC0409Bm[] interfaceC0409BmArr3 = this.A0H;
        if (A0Y[6].length() == 17) {
            throw new RuntimeException();
        }
        A0Y[3] = "8HQd7O";
        if (interfaceC0409BmArr3 == null) {
            this.A0H = new InterfaceC0409Bm[this.A0V.size()];
            for (int i2 = 0; i2 < i; i2++) {
                InterfaceC0401Bc interfaceC0401Bc = this.A0C;
                int i3 = this.A0K.size();
                InterfaceC0409Bm output = interfaceC0401Bc.AFx(i3 + 1 + i2, 3);
                output.A5j(this.A0V.get(i2));
                this.A0H[i2] = output;
            }
        }
    }

    private void A0E(long j) {
        while (!this.A0U.isEmpty()) {
            CC removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j2 = j + removeFirst.A01;
            C0553Ht c0553Ht = this.A0S;
            if (c0553Ht != null) {
                j2 = c0553Ht.A06(j2);
            }
            InterfaceC0409Bm[] interfaceC0409BmArr = this.A0I;
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "ltl";
            for (InterfaceC0409Bm interfaceC0409Bm : interfaceC0409BmArr) {
                interfaceC0409Bm.AEs(j2, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C03519d {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        int i = ((int) this.A07) - this.A00;
        C0541Hh c0541Hh = this.A0E;
        if (c0541Hh != null) {
            interfaceC0400Bb.readFully(c0541Hh.A00, 8, i);
            int atomPayloadSize = this.A01;
            A0O(new C0924Wj(atomPayloadSize, this.A0E), interfaceC0400Bb.A7a());
        } else {
            interfaceC0400Bb.AFe(i);
        }
        A0F(interfaceC0400Bb.A7a());
        String[] strArr = A0Y;
        String str = strArr[2];
        String str2 = strArr[4];
        int atomPayloadSize2 = str.length();
        if (atomPayloadSize2 != str2.length()) {
            throw new RuntimeException();
        }
        A0Y[1] = "jmSEpbOdW733bHBoDHkBty1cmj";
    }

    private void A0H(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        CD cd = null;
        long j = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            CD nextTrackBundle = this.A0K.valueAt(i);
            CO co = nextTrackBundle.A07;
            if (co.A0B && co.A04 < j) {
                j = co.A04;
                cd = this.A0K.valueAt(i);
            }
        }
        if (cd == null) {
            this.A02 = 3;
            return;
        }
        int A7a = (int) (j - interfaceC0400Bb.A7a());
        if (A7a >= 0) {
            interfaceC0400Bb.AFe(A7a);
            cd.A07.A04(interfaceC0400Bb);
            return;
        }
        throw new C03519d(A0A(307, 39, 39));
    }

    private void A0I(C0925Wk c0925Wk) throws C03519d {
        if (((C1) c0925Wk).A00 == C1.A0k) {
            A0K(c0925Wk);
            return;
        }
        int i = ((C1) c0925Wk).A00;
        int i2 = C1.A0j;
        String[] strArr = A0Y;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[6] = "QeKmRdkmErMZReeQj8";
        if (i == i2) {
            A0J(c0925Wk);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        C0925Wk peek = this.A0T.peek();
        if (A0Y[6].length() != 17) {
            A0Y[1] = "g8UpS1NyodMZ5eBXtPatKQwsoR";
            peek.A08(c0925Wk);
        } else {
            A0Y[5] = "mkv5is6F5Mu6y6USr0b4mkDGodGLaqlp";
            peek.A08(c0925Wk);
        }
    }

    private void A0J(C0925Wk c0925Wk) throws C03519d {
        DrmInitData A05;
        A0L(c0925Wk, this.A0K, this.A0J, this.A0W);
        if (this.A0L != null) {
            A05 = null;
        } else {
            List<C0924Wj> list = c0925Wk.A02;
            int trackCount = A0Y[3].length();
            if (trackCount != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[2] = "YTpzURZBrt0";
            strArr[4] = "jDJUPBNch9x";
            A05 = A05(list);
        }
        if (A05 != null) {
            int i = this.A0K.size();
            for (int trackCount2 = 0; trackCount2 < i; trackCount2++) {
                this.A0K.valueAt(trackCount2).A06(A05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0K.valueAt(i2).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    public static void A0L(C0925Wk c0925Wk, SparseArray<CD> sparseArray, int i, byte[] bArr) throws C03519d {
        int size = c0925Wk.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0925Wk child = c0925Wk.A01.get(i2);
            int i3 = ((C1) child).A00;
            int moofContainerChildrenSize = C1.A1L;
            if (i3 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i, bArr);
            }
        }
    }

    public static void A0N(C0925Wk c0925Wk, CD cd, long j, int totalSampleCount) {
        int i = 0;
        int i2 = 0;
        List<C0924Wj> list = c0925Wk.A02;
        int size = list.size();
        for (int trunSampleCount = 0; trunSampleCount < size; trunSampleCount++) {
            C0924Wj c0924Wj = list.get(trunSampleCount);
            if (((C1) c0924Wj).A00 == C1.A1O) {
                C0541Hh trunData = c0924Wj.A00;
                trunData.A0Y(12);
                int A0H = trunData.A0H();
                if (A0H > 0) {
                    i2 += A0H;
                    i++;
                }
            }
        }
        cd.A02 = 0;
        cd.A00 = 0;
        cd.A01 = 0;
        cd.A07.A03(i, i2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C0924Wj c0924Wj2 = list.get(i5);
            int trunIndex = ((C1) c0924Wj2).A00;
            if (trunIndex == C1.A1O) {
                i4 = A00(cd, i3, j, totalSampleCount, c0924Wj2.A00, i4);
                i3++;
            }
        }
    }

    private void A0O(C0924Wj c0924Wj, long j) throws C03519d {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(c0924Wj);
            return;
        }
        if (((C1) c0924Wj).A00 == C1.A13) {
            Pair<Long, X5> A04 = A04(c0924Wj.A00, j);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AEx((InterfaceC0406Bj) A04.second);
            this.A0F = true;
            return;
        }
        if (((C1) c0924Wj).A00 != C1.A0Q) {
            return;
        }
        A0Q(c0924Wj.A00);
    }

    private void A0Q(C0541Hh c0541Hh) {
        InterfaceC0409Bm[] interfaceC0409BmArr = this.A0I;
        if (interfaceC0409BmArr == null || interfaceC0409BmArr.length == 0) {
            return;
        }
        c0541Hh.A0Y(12);
        int sampleSize = c0541Hh.A04();
        c0541Hh.A0Q();
        c0541Hh.A0Q();
        long A0M = c0541Hh.A0M();
        long timescale = c0541Hh.A0M();
        long A0F = C0557Hx.A0F(timescale, 1000000L, A0M);
        for (InterfaceC0409Bm interfaceC0409Bm : this.A0I) {
            c0541Hh.A0Y(12);
            interfaceC0409Bm.AEr(c0541Hh, sampleSize);
        }
        long j = this.A0B;
        if (j != -9223372036854775807L) {
            long j2 = j + A0F;
            C0553Ht c0553Ht = this.A0S;
            if (c0553Ht != null) {
                j2 = c0553Ht.A06(j2);
            }
            for (InterfaceC0409Bm interfaceC0409Bm2 : this.A0I) {
                interfaceC0409Bm2.AEs(j2, 1, sampleSize, 0, null);
            }
            return;
        }
        this.A0U.addLast(new CC(A0F, sampleSize));
        this.A03 += sampleSize;
    }

    public static void A0R(C0541Hh c0541Hh, int i, CO co) throws C03519d {
        c0541Hh.A0Y(i + 8);
        int fullAtom = c0541Hh.A08();
        int flags = C1.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c0541Hh.A0H();
            int fullAtom4 = co.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(co.A0H, 0, sampleCount, z);
                int fullAtom5 = c0541Hh.A04();
                co.A02(fullAtom5);
                co.A05(c0541Hh);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0A(290, 17, 20)).append(sampleCount).append(A0A(0, 2, 62));
            int fullAtom6 = co.A00;
            throw new C03519d(append.append(fullAtom6).toString());
        }
        throw new C03519d(A0A(381, 56, 66));
    }

    public static void A0S(C0541Hh c0541Hh, CO co) throws C03519d {
        c0541Hh.A0Y(8);
        int flags = c0541Hh.A08();
        int fullAtom = C1.A00(flags) & 1;
        if (fullAtom == 1) {
            c0541Hh.A0Z(8);
        }
        int A0H = c0541Hh.A0H();
        if (A0H == 1) {
            int entryCount = C1.A01(flags);
            co.A04 += entryCount == 0 ? c0541Hh.A0M() : c0541Hh.A0N();
            return;
        }
        throw new C03519d(A0A(552, 29, 63) + A0H);
    }

    public static void A0T(C0541Hh c0541Hh, CO co) throws C03519d {
        A0R(c0541Hh, 0, co);
    }

    public static void A0U(C0541Hh c0541Hh, CO co, byte[] bArr) throws C03519d {
        c0541Hh.A0Y(8);
        c0541Hh.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c0541Hh, 16, co);
    }

    public static boolean A0W(int i) {
        return i == C1.A0k || i == C1.A1M || i == C1.A0e || i == C1.A0i || i == C1.A17 || i == C1.A0j || i == C1.A1L || i == C1.A0n || i == C1.A0O;
    }

    public static boolean A0X(int i) {
        if (i != C1.A0W && i != C1.A0d && i != C1.A0o && i != C1.A13 && i != C1.A1B) {
            int i2 = C1.A1I;
            if (A0Y[6].length() != 17) {
                A0Y[0] = "0bfDB";
                if (i != i2 && i != C1.A1J && i != C1.A1K && i != C1.A1N && i != C1.A1O && i != C1.A0s && i != C1.A0v) {
                    int i3 = C1.A0u;
                    if (A0Y[1].length() != 5) {
                        A0Y[5] = "GM1eDi9JpLsxcWxFcWWsCjSZthCJdr4f";
                        if (i != i3 && i != C1.A11 && i != C1.A1R && i != C1.A0y && i != C1.A12 && i != C1.A0P) {
                            int i4 = C1.A0g;
                            if (A0Y[3].length() == 6) {
                                A0Y[7] = "Eu3";
                                if (i != i4 && i != C1.A0Q) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        r2 = r11.A7a() - r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r10.A01 != com.facebook.ads.redexgen.X.C1.A0j) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r9 = r10.A0K.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (r8 >= r9) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r0 = r10.A0K.valueAt(r8).A07;
        r0.A03 = r2;
        r0.A04 = r2;
        r0.A05 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (com.facebook.ads.redexgen.X.C0919We.A0Y[3].length() == 6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        com.facebook.ads.redexgen.X.C0919We.A0Y[0] = "GrBVN";
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        r7 = com.facebook.ads.redexgen.X.C0919We.A0Y;
        r7[2] = "tKeeSnEBB5V";
        r7[4] = "1ppH9MP2kpM";
        r8 = r8 + 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        if (r10.A01 != com.facebook.ads.redexgen.X.C1.A0c) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        r10.A0D = null;
        r10.A09 = r10.A07 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if (r10.A0F != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
    
        r10.A0C.AEx(new com.facebook.ads.redexgen.X.X0(r10.A08, r2));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0147, code lost:
    
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b5, code lost:
    
        if (A0W(r10.A01) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0163, code lost:
    
        if (A0X(r10.A01) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0165, code lost:
    
        r3 = r10.A00;
        r2 = com.facebook.ads.redexgen.X.C0919We.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0177, code lost:
    
        if (r2[2].length() == r2[4].length()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017f, code lost:
    
        com.facebook.ads.redexgen.X.C0919We.A0Y[7] = "6Yw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0186, code lost:
    
        if (r3 != 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0188, code lost:
    
        r2 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018c, code lost:
    
        if (r2 > 2147483647L) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
    
        r10.A0E = new com.facebook.ads.redexgen.X.C0541Hh((int) r2);
        java.lang.System.arraycopy(r10.A0O.A00, 0, r10.A0E.A00, 0, 8);
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ed, code lost:
    
        throw new com.facebook.ads.redexgen.X.C03519d(A0A(241, 49, 53));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01fd, code lost:
    
        throw new com.facebook.ads.redexgen.X.C03519d(A0A(org.objectweb.asm.Opcodes.ARRAYLENGTH, 51, 24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a8, code lost:
    
        if (r10.A07 > 2147483647L) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01aa, code lost:
    
        r10.A0E = null;
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x020c, code lost:
    
        throw new com.facebook.ads.redexgen.X.C03519d(A0A(479, 53, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b7, code lost:
    
        r5 = (r11.A7a() + r10.A07) - 8;
        r10.A0T.push(new com.facebook.ads.redexgen.X.C0925Wk(r10.A01, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
    
        if (r10.A07 != r10.A00) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
    
        A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01da, code lost:
    
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        throw new com.facebook.ads.redexgen.X.C03519d(A0A(2, 48, 114));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0Y(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC0400Bb.AEE(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0Y(0);
            this.A07 = this.A0O.A0M();
            this.A01 = this.A0O.A08();
        }
        long j = this.A07;
        if (j == 1) {
            interfaceC0400Bb.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            if (A0Y[5].charAt(2) != 'C') {
                A0Y[6] = "6cAY2NAyMtL9j2hMAwiIzwyy";
                this.A07 = this.A0O.A0N();
            }
            throw new RuntimeException();
        }
        if (j == 0) {
            long A7B = interfaceC0400Bb.A7B();
            if (A7B == -1 && !this.A0T.isEmpty()) {
                ArrayDeque<C0925Wk> arrayDeque = this.A0T;
                if (A0Y[6].length() != 17) {
                    A0Y[0] = "9SBPW";
                    A7B = arrayDeque.peek().A00;
                } else {
                    A7B = arrayDeque.peek().A00;
                }
            }
            if (A7B != -1) {
                long A7a = A7B - interfaceC0400Bb.A7a();
                int trackCount = this.A00;
                this.A07 = A7a + trackCount;
            }
        }
        long j2 = this.A07;
        int i = this.A00;
        if (A0Y[1].length() != 5) {
            String[] strArr = A0Y;
            strArr[2] = "YhN2vmsMCgc";
            strArr[4] = "GXPkMa8ctqb";
        } else {
            A0Y[7] = "I3p";
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        r1 = r0.A06(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010d, code lost:
    
        if (r5.A01 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        r11 = r18.A0Q.A00;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r10 = r5.A01 + 1;
        r17 = 4 - r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
    
        if (r18.A04 >= r18.A06) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        r15 = r18.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0135, code lost:
    
        if (com.facebook.ads.redexgen.X.C0919We.A0Y[1].length() == 5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0137, code lost:
    
        r16 = com.facebook.ads.redexgen.X.C0919We.A0Y;
        r16[2] = "oY9Cfc6NZLH";
        r16[4] = "IHvoiGll8tT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        if (r15 != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018f, code lost:
    
        if (r18.A0G == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
    
        r18.A0P.A0W(r15);
        r19.readFully(r18.A0P.A00, r12, r18.A05);
        r7.AEr(r18.A0P, r18.A05);
        r3 = r18.A05;
        r15 = com.facebook.ads.redexgen.X.C0537Hd.A02(r18.A0P.A00, r18.A0P.A07());
        r18.A0P.A0Y(A0A(686, 10, 6).equals(r5.A07.A0O) ? 1 : 0);
        r18.A0P.A0X(r15);
        com.facebook.ads.redexgen.X.C0490Fg.A03(r1, r18.A0P, r18.A0H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01dd, code lost:
    
        r18.A04 += r3;
        r18.A05 -= r3;
        r14 = 4;
        r13 = 1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ec, code lost:
    
        r3 = r7.AEq(r19, r15, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        r19.readFully(r11, r17, r10);
        r18.A0Q.A0Y(r12);
        r18.A05 = r18.A0Q.A0H() - r13;
        r18.A0R.A0Y(r12);
        r7.AEr(r18.A0R, r14);
        r7.AEr(r18.A0Q, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016a, code lost:
    
        if (r18.A0H.length <= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0176, code lost:
    
        if (com.facebook.ads.redexgen.X.C0537Hd.A0C(r5.A07.A0O, r11[r14]) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0179, code lost:
    
        r18.A0G = r0;
        r18.A04 += 5;
        r18.A06 += r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0188, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018a, code lost:
    
        if (r15 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0222, code lost:
    
        r10 = r6.A0I[r8];
        r3 = null;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0229, code lost:
    
        if (r6.A0A == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022b, code lost:
    
        r10 = (r10 ? 1 : 0) | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        if (r6.A08 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0232, code lost:
    
        r0 = r6.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0234, code lost:
    
        r3 = r0.A01;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0254, code lost:
    
        r0 = r5.A00(r6.A07.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0236, code lost:
    
        r7.AEs(r1, r10, r18.A06, 0, r3);
        A0E(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024a, code lost:
    
        if (r18.A0D.A08() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024c, code lost:
    
        r18.A0D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024f, code lost:
    
        r18.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0253, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0210, code lost:
    
        r0 = r18.A04;
        r3 = r18.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0214, code lost:
    
        if (r0 >= r3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0216, code lost:
    
        r18.A04 += r7.AEq(r19, r3 - r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020c, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0Z(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        CM cm;
        InterfaceC0409Bm interfaceC0409Bm;
        int i;
        long A00;
        C0553Ht c0553Ht;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                CD A07 = A07(this.A0K);
                if (A07 == null) {
                    int A7a = (int) (this.A09 - interfaceC0400Bb.A7a());
                    if (A7a >= 0) {
                        interfaceC0400Bb.AFe(A7a);
                        A0B();
                        return false;
                    }
                    throw new C03519d(A0A(346, 35, 56));
                }
                int A7a2 = (int) (A07.A07.A0G[A07.A02] - interfaceC0400Bb.A7a());
                if (A7a2 < 0) {
                    Log.w(A0A(128, 22, 24), A0A(Opcodes.FCMPG, 40, 46));
                    A7a2 = 0;
                }
                interfaceC0400Bb.AFe(A7a2);
                if (A0Y[6].length() == 17) {
                    throw new RuntimeException();
                }
                A0Y[3] = "TF0FBE";
                this.A0D = A07;
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                interfaceC0400Bb.AFe(this.A06);
                this.A0D.A01();
                if (!this.A0D.A08()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            if (this.A0D.A05.A02 == 1) {
                this.A06 -= 8;
                interfaceC0400Bb.AFe(8);
            }
            int A03 = this.A0D.A03();
            this.A04 = A03;
            this.A06 += A03;
            this.A02 = 4;
            this.A05 = 0;
        }
        CO co = this.A0D.A07;
        CD cd = this.A0D;
        String[] strArr = A0Y;
        if (strArr[2].length() != strArr[4].length()) {
            A0Y[7] = "Pqi";
            cm = cd.A05;
            interfaceC0409Bm = this.A0D.A06;
            i = this.A0D.A01;
            A00 = co.A00(i) * 1000;
            c0553Ht = this.A0S;
        } else {
            A0Y[0] = "M6XHB";
            cm = cd.A05;
            interfaceC0409Bm = this.A0D.A06;
            i = this.A0D.A01;
            A00 = co.A00(i) * 1000;
            c0553Ht = this.A0S;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final void A8e(InterfaceC0401Bc interfaceC0401Bc) {
        this.A0C = interfaceC0401Bc;
        CM cm = this.A0N;
        if (cm != null) {
            CD cd = new CD(interfaceC0401Bc.AFx(0, cm.A03));
            cd.A07(this.A0N, new C7(0, 0, 0, 0));
            this.A0K.put(0, cd);
            A0C();
            this.A0C.A5T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final int AE9(InterfaceC0400Bb interfaceC0400Bb, C0404Bh c0404Bh) throws IOException, InterruptedException {
        while (true) {
            int i = this.A02;
            if (A0Y[6].length() == 17) {
                throw new RuntimeException();
            }
            A0Y[6] = "Adcvl3OLLWBEEjCvRjB7l1tHvWvuGk";
            switch (i) {
                case 0:
                    if (!A0Y(interfaceC0400Bb)) {
                        return -1;
                    }
                    break;
                case 1:
                    A0G(interfaceC0400Bb);
                    break;
                case 2:
                    A0H(interfaceC0400Bb);
                    break;
                default:
                    if (!A0Z(interfaceC0400Bb)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final void AEw(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            this.A0K.valueAt(i).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final boolean AFg(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        return CK.A03(interfaceC0400Bb);
    }
}
