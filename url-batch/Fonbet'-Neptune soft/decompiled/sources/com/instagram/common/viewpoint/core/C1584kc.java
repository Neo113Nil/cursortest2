package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
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
import okio.Utf8;
import org.objectweb.asm.Opcodes;

@MetaExoPlayerCustomization("Rename the class for A/B Testing")
/* renamed from: com.facebook.ads.redexgen.X.kc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1584kc implements GX {
    public static byte[] A0Z;
    public static String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final InterfaceC0439Gb A0b;
    public static final C1830or A0c;
    public static final byte[] A0d;
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

    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public C4J A0D;
    public GY A0E;
    public IY A0F;
    public boolean A0G;
    public boolean A0H;
    public H1[] A0I;
    public H1[] A0J;
    public final int A0K;
    public final SparseArray<IY> A0L;
    public final C4J A0M;
    public final C4J A0N;
    public final C4J A0O;
    public final C4J A0P;
    public final C4J A0Q;
    public final C4R A0R;
    public final H1 A0S;
    public final HO A0T;
    public final C0501Im A0U;
    public final ArrayDeque<C1591kj> A0V;
    public final ArrayDeque<IX> A0W;
    public final List<C1830or> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(IY iy, int i, int i2, C4J c4j, int i3) throws C00982i {
        int i4;
        int i5 = i3;
        c4j.A0f(8);
        int A00 = II.A00(c4j.A0C());
        C0501Im c0501Im = iy.A05.A03;
        C0503Io c0503Io = iy.A09;
        IP ip = (IP) AbstractC01424a.A0f(c0503Io.A06);
        c0503Io.A0C[i] = c4j.A0L();
        c0503Io.A0E[i] = c0503Io.A04;
        if ((A00 & 1) != 0) {
            long[] jArr = c0503Io.A0E;
            jArr[i] = jArr[i] + c4j.A0C();
        }
        boolean z = (A00 & 4) != 0;
        int i6 = ip.A01;
        if (z) {
            i6 = c4j.A0C();
        }
        boolean z2 = (A00 & 256) != 0;
        boolean z3 = (A00 & 512) != 0;
        boolean z4 = (A00 & 1024) != 0;
        boolean z5 = (A00 & 2048) != 0;
        long j = A0a(c0501Im) ? ((long[]) AbstractC01424a.A0f(c0501Im.A09))[0] : 0L;
        int[] iArr = c0503Io.A0B;
        long[] jArr2 = c0503Io.A0D;
        boolean[] zArr = c0503Io.A0G;
        boolean z6 = c0501Im.A03 == 2 && (i2 & 1) != 0;
        int i7 = i5 + c0503Io.A0C[i];
        long j2 = c0501Im.A06;
        long j3 = c0503Io.A05;
        while (i5 < i7) {
            if (z2) {
                i4 = c4j.A0C();
                if (A0a[5].length() == 30) {
                    throw new RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                i4 = ip.A00;
            }
            int A002 = A00(i4);
            int A003 = A00(z3 ? c4j.A0C() : ip.A03);
            int A0C = z4 ? c4j.A0C() : (i5 == 0 && z) ? i6 : ip.A01;
            jArr2[i5] = AbstractC01424a.A0U(((z5 ? c4j.A0C() : 0) + j3) - j, 1000000L, j2);
            if (!c0503Io.A09) {
                jArr2[i5] = jArr2[i5] + iy.A05.A02;
            }
            iArr[i5] = A003;
            zArr[i5] = ((A0C >> 16) & 1) == 0 && (!z6 || i5 == 0);
            j3 += A002;
            i5++;
        }
        c0503Io.A05 = j3;
        return i7;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C1624lT> A05(C4J c4j, long j) throws C00982i {
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
                throw C00982i.A01(A0A(756, 28, 79), null);
            }
            long A0Q2 = c4j.A0Q();
            iArr[i] = Integer.MAX_VALUE & A0C;
            jArr[i] = A0R2;
            jArr3[i] = j2;
            A0R += A0Q2;
            j2 = AbstractC01424a.A0U(A0R, 1000000L, A0Q);
            jArr2[i] = j2 - jArr3[i];
            c4j.A0g(4);
            A0R2 += iArr[i];
        }
        return Pair.create(Long.valueOf(A0U), new C1624lT(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static IY A09(C4J c4j, SparseArray<IY> sparseArray, boolean z) {
        c4j.A0f(8);
        int A00 = II.A00(c4j.A0C());
        IY valueAt = z ? sparseArray.valueAt(0) : sparseArray.get(c4j.A0C());
        if (valueAt == null) {
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0R = c4j.A0R();
            valueAt.A09.A04 = A0R;
            valueAt.A09.A03 = A0R;
        }
        IP ip = valueAt.A04;
        valueAt.A09.A06 = new IP((A00 & 2) != 0 ? c4j.A0C() - 1 : ip.A02, (A00 & 8) != 0 ? c4j.A0C() : ip.A00, (A00 & 16) != 0 ? c4j.A0C() : ip.A03, (A00 & 32) != 0 ? c4j.A0C() : ip.A01);
        return valueAt;
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Z, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, 42, Utf8.REPLACEMENT_BYTE, 40, 44, 57, 40, Utf8.REPLACEMENT_BYTE, 109, 57, 37, 44, 35, 109, 43, Utf8.REPLACEMENT_BYTE, 44, 42, 32, 40, 35, 57, 109, 62, 44, 32, Base64.padSymbol, 33, 40, 109, 46, 34, 56, 35, 57, 47, Ascii.SUB, 1, 3, 78, Ascii.GS, 7, Ascii.DC4, Ascii.VT, 78, 2, Ascii.VT, Ascii.GS, Ascii.GS, 78, Ascii.SUB, 6, Ascii.SI, 0, 78, 6, Ascii.VT, Ascii.SI, 10, Ascii.VT, Ascii.FS, 78, 2, Ascii.VT, 0, 9, Ascii.SUB, 6, 78, 70, Ascii.ESC, 0, Ascii.GS, Ascii.ESC, Ascii.RS, Ascii.RS, 1, Ascii.FS, Ascii.SUB, Ascii.VT, 10, 71, 64, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, 42, 45, Ascii.GS, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, Utf8.REPLACEMENT_BYTE, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, 42, 44, Base64.padSymbol, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, Ascii.SO, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, 42, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, Ascii.US, 113, 126, 115, Ascii.US, 83, 90, 81, 88, 75, 87, 0, 41, 45, 42, 108, 45, 56, 35, 33, 108, 40, 41, 42, 37, 34, 41, Utf8.REPLACEMENT_BYTE, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, Utf8.REPLACEMENT_BYTE, 37, 54, 41, 108, 100, 57, 34, Utf8.REPLACEMENT_BYTE, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, Utf8.REPLACEMENT_BYTE, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, Ascii.ETB, Ascii.ETB, 2, Ascii.DC4, 5, 81, 5, Ascii.RS, 81, Ascii.DC4, Ascii.US, Ascii.DC2, 3, 8, 1, 5, Ascii.CAN, Ascii.RS, Ascii.US, 81, Ascii.NAK, 16, 5, 16, 81, 6, 16, 2, 81, Ascii.US, Ascii.DC4, Ascii.SYN, 16, 5, Ascii.CAN, 7, Ascii.DC4, 95, 120, 81, 81, 68, 82, 67, Ascii.ETB, 67, 88, Ascii.ETB, 82, 89, 83, Ascii.ETB, 88, 81, Ascii.ETB, 90, 83, 86, 67, Ascii.ETB, 64, 86, 68, Ascii.ETB, 89, 82, 80, 86, 67, 94, 65, 82, Ascii.EM, Ascii.ESC, 34, 49, 38, 38, Base64.padSymbol, 48, Base64.padSymbol, 58, 51, 116, 0, 38, 53, 55, Utf8.REPLACEMENT_BYTE, 17, 58, 55, 38, 45, 36, 32, Base64.padSymbol, 59, 58, Ascii.SYN, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, Base64.padSymbol, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, Ascii.EM, 10, 80, 3, 17, Ascii.GS, 0, Ascii.FS, Ascii.NAK, 80, 19, Ascii.US, 5, Ascii.RS, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, Base64.padSymbol, Utf8.REPLACEMENT_BYTE, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, Utf8.REPLACEMENT_BYTE, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, Utf8.REPLACEMENT_BYTE, 50, Byte.MAX_VALUE, 78, 118, 116, 109, 109, 116, 115, 122, Base64.padSymbol, 124, 105, 114, 112, Base64.padSymbol, 106, 116, 105, 117, Base64.padSymbol, 113, 120, 115, 122, 105, 117, Base64.padSymbol, 35, Base64.padSymbol, 47, 44, 41, 42, 41, 37, 46, 43, 41, 42, Base64.padSymbol, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, Base64.padSymbol, 32, 38, 55, 54, 114, 55, Utf8.REPLACEMENT_BYTE, 33, 53, 114, 36, 55, 32, 33, 59, Base64.padSymbol, 60, 104, 114, Ascii.ETB, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, Byte.MAX_VALUE, 108, 41, Byte.MAX_VALUE, 104, 101, 124, 108, 51, 41, 35, Ascii.CAN, 19, Ascii.SO, 6, 19, Ascii.NAK, 2, 19, Ascii.DC2, 86, 5, Ascii.ETB, Ascii.US, Ascii.EM, 86, 19, Ascii.CAN, 2, 4, Ascii.SI, 86, Ascii.NAK, Ascii.EM, 3, Ascii.CAN, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, 64, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, 64, 4, 66, 75, 81, 74, 64, 4, Ascii.FF, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, 64, Ascii.CR, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, Byte.MAX_VALUE, 42, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, Ascii.SYN, 65, Ascii.DC4, 84, 73, Ascii.CR, Ascii.DC4, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(C4J c4j, Uri uri) {
        String str;
        String str2;
        long j;
        long A0U;
        long A0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c4j.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int A01 = II.A01(c4j.A0C());
        long j2 = -9223372036854775807L;
        switch (A01) {
            case 0:
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
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
                AnonymousClass44.A07(A0A(204, 22, 75), A0A(645, 35, 24) + A01);
                return;
        }
        byte[] bArr = new byte[c4j.A07()];
        c4j.A0k(bArr, 0, c4j.A07());
        int i = 0;
        C4J c4j2 = new C4J(this.A0T.A01(new EventMessage(str, str2, A0U, A0Q, bArr)));
        int A07 = c4j2.A07();
        H1[] h1Arr = this.A0J;
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
            this.A0W.addLast(new IX(j2, true, A07));
            this.A03 += A07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new IX(j, false, A07));
            this.A03 += A07;
            return;
        }
        if (this.A0R != null) {
            C4R c4r = this.A0R;
            if (A0a[1].length() != 3) {
                String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                j = c4r.A05(j);
            } else {
                j = c4r.A05(j);
            }
        }
        if (this.A0A != -9223372036854775807L && !MetaExoPlayerUpgradeConfig.A03(EnumC1429i2.A12)) {
            j = this.A0A;
        }
        H1[] h1Arr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (H1 h12 : h1Arr2) {
            h12.AIA(j, 1, A07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0R(C1591kj c1591kj, SparseArray<IY> sparseArray, boolean z, int i, byte[] bArr) throws C00982i {
        IY A09 = A09(((C1590ki) C3M.A01(c1591kj.A07(1952868452))).A00, sparseArray, z);
        if (A09 == null) {
            return;
        }
        C0503Io c0503Io = A09.A09;
        long j = c0503Io.A05;
        boolean z2 = c0503Io.A09;
        A09.A08();
        A09.A06 = true;
        C1590ki A07 = c1591kj.A07(1952867444);
        if (A07 == null || (i & 2) != 0) {
            c0503Io.A05 = j;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            c0503Io.A09 = z2;
        } else {
            c0503Io.A05 = A03(A07.A00);
            c0503Io.A09 = true;
        }
        A0S(c1591kj, A09, i);
        C0501Im c0501Im = A09.A05.A03;
        Object A01 = C3M.A01(c0503Io.A06);
        String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        C0502In A00 = c0501Im.A00(((IP) A01).A02);
        C1590ki A072 = c1591kj.A07(1935763834);
        if (A072 != null) {
            A0V((C0502In) C3M.A01(A00), A072.A00, c0503Io);
        }
        C1590ki A073 = c1591kj.A07(1935763823);
        if (A073 != null) {
            A0I(A073.A00, c0503Io);
        }
        C1590ki A074 = c1591kj.A07(1936027235);
        if (A074 != null) {
            A0J(A074.A00, c0503Io);
        }
        A0T(c1591kj, A00 != null ? A00.A02 : null, c0503Io);
        int size = c1591kj.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1590ki c1590ki = c1591kj.A02.get(i2);
            if (((II) c1590ki).A00 == 1970628964) {
                A0K(c1590ki.A00, c0503Io, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C1591kj c1591kj, String str, C0503Io c0503Io) throws C00982i {
        C4J c4j = null;
        C4J c4j2 = null;
        for (int i = 0; i < c1591kj.A02.size(); i++) {
            C1590ki c1590ki = c1591kj.A02.get(i);
            C4J c4j3 = c1590ki.A00;
            if (((II) c1590ki).A00 == 1935828848) {
                c4j3.A0f(12);
                if (c4j3.A0C() == 1936025959) {
                    c4j = c4j3;
                }
            } else if (((II) c1590ki).A00 == 1936158820) {
                c4j3.A0f(12);
                if (c4j3.A0C() == 1936025959) {
                    c4j2 = c4j3;
                }
            }
        }
        if (c4j == null || c4j2 == null) {
            return;
        }
        c4j.A0f(8);
        int A01 = II.A01(c4j.A0C());
        c4j.A0g(4);
        if (A01 == 1) {
            c4j.A0g(4);
        }
        if (c4j.A0C() != 1) {
            throw C00982i.A00(A0A(126, 39, 73));
        }
        c4j2.A0f(8);
        int A012 = II.A01(c4j2.A0C());
        c4j2.A0g(4);
        if (A012 == 1) {
            if (c4j2.A0Q() == 0) {
                throw C00982i.A00(A0A(784, 55, 110));
            }
        } else if (A012 >= 2) {
            c4j2.A0g(4);
        }
        if (c4j2.A0Q() != 1) {
            throw C00982i.A00(A0A(Opcodes.IF_ACMPEQ, 39, 18));
        }
        c4j2.A0g(1);
        int A0I = c4j2.A0I();
        int i2 = (A0I & 240) >> 4;
        int i3 = A0I & 15;
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
            c0503Io.A07 = new C0502In(z, str, A0I2, bArr, i2, i3, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(C0502In c0502In, C4J c4j, C0503Io c0503Io) throws C00982i {
        int i = c0502In.A00;
        c4j.A0f(8);
        if ((II.A00(c4j.A0C()) & 1) == 1) {
            c4j.A0g(8);
        }
        int A0I = c4j.A0I();
        int A0L = c4j.A0L();
        if (A0L > c0503Io.A00) {
            throw C00982i.A01(A0A(514, 18, 58) + A0L + A0A(40, 38, 7) + c0503Io.A00, null);
        }
        int i2 = 0;
        if (A0I == 0) {
            boolean[] zArr = c0503Io.A0F;
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i3 = 0; i3 < A0L; i3++) {
                int A0I2 = c4j.A0I();
                i2 += A0I2;
                zArr[i3] = A0I2 > i;
            }
        } else {
            i2 = 0 + (A0I * A0L);
            Arrays.fill(c0503Io.A0F, 0, A0L, A0I > i);
        }
        Arrays.fill(c0503Io.A0F, A0L, c0503Io.A00, false);
        if (i2 > 0) {
            c0503Io.A02(i2);
        }
    }

    static {
        A0D();
        A0b = new InterfaceC0439Gb() { // from class: com.facebook.ads.redexgen.X.kd
            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final GX[] A5F() {
                return C1584kc.A0b();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC0438Ga.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new C2D().A11(A0A(839, 18, 77)).A14();
    }

    public C1584kc() {
        this(0);
    }

    public C1584kc(int i) {
        this(i, null);
    }

    public C1584kc(int i, C4R c4r) {
        this(i, c4r, null, Collections.emptyList());
    }

    public C1584kc(int i, C4R c4r, C0501Im c0501Im, List<C1830or> list) {
        this(i, c4r, c0501Im, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C1584kc(int i, C4R c4r, C0501Im c0501Im, List<C1830or> list, H1 h1) {
        this.A0A = -9223372036854775807L;
        this.A0K = i;
        this.A0R = c4r;
        this.A0U = c0501Im;
        this.A0X = Collections.unmodifiableList(list);
        this.A0S = h1;
        this.A0T = new HO();
        this.A0M = new C4J(16);
        this.A0P = new C4J(AbstractC0454Gq.A03);
        this.A0O = new C4J(5);
        this.A0N = new C4J();
        this.A0Y = new byte[16];
        this.A0Q = new C4J(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = GY.A00;
        this.A0J = new H1[0];
        this.A0I = new H1[0];
    }

    public static int A00(int i) throws C00982i {
        if (i >= 0) {
            return i;
        }
        throw C00982i.A01(A0A(TypedValues.TransitionType.TYPE_DURATION, 27, 67) + i, null);
    }

    public static long A02(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        return II.A01(fullAtom) == 0 ? c4j.A0Q() : c4j.A0R();
    }

    public static long A03(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        int version = II.A01(fullAtom);
        return version == 1 ? c4j.A0R() : c4j.A0Q();
    }

    public static Pair<Integer, IP> A04(C4J c4j) {
        c4j.A0f(12);
        int defaultSampleDescriptionIndex = c4j.A0C();
        int trackId = c4j.A0C();
        int defaultSampleFlags = c4j.A0C();
        int defaultSampleSize = c4j.A0C();
        int defaultSampleDuration = c4j.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new IP(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C1590ki> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1590ki c1590ki = list.get(i);
            int leafChildrenSize = ((II) c1590ki).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] A0l = c1590ki.A00.A0l();
                UUID A02 = AbstractC0494If.A02(A0l);
                if (A02 == null) {
                    AnonymousClass44.A07(A0A(204, 22, 75), A0A(550, 42, 28));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A02, A0A(897, 9, 66), A0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private IP A07(SparseArray<IP> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (IP) C3M.A01(sparseArray.get(i));
    }

    public static IY A08(SparseArray<IY> sparseArray) {
        boolean z;
        boolean z2;
        IY iy = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            IY valueAt = sparseArray.valueAt(i);
            z = valueAt.A06;
            if (z || valueAt.A01 != valueAt.A05.A01) {
                z2 = valueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z2 || valueAt.A02 != valueAt.A09.A01) {
                    long nextSampleOffset = valueAt.A05();
                    if (nextSampleOffset < j) {
                        iy = valueAt;
                        j = nextSampleOffset;
                    }
                }
            }
        }
        return iy;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0054 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0C() {
        int nextExtraTrackId = 100;
        this.A0J = new H1[2];
        int i = 0;
        if (this.A0S != null) {
            int emsgTrackOutputCount = 0 + 1;
            this.A0J[0] = this.A0S;
            i = emsgTrackOutputCount;
        }
        int nextExtraTrackId2 = this.A0K;
        if ((nextExtraTrackId2 & 4) != 0) {
            int emsgTrackOutputCount2 = i + 1;
            this.A0J[i] = this.A0E.AJh(100, 5);
            i = emsgTrackOutputCount2;
            nextExtraTrackId = 100 + 1;
        }
        this.A0J = (H1[]) AbstractC01424a.A1I(this.A0J, i);
        for (H1 h1 : this.A0J) {
            h1.A6W(A0c);
        }
        int nextExtraTrackId3 = this.A0X.size();
        this.A0I = new H1[nextExtraTrackId3];
        int i2 = 0;
        while (i2 < nextExtraTrackId) {
            int i3 = nextExtraTrackId + 1;
            H1 AJh = this.A0E.AJh(nextExtraTrackId, 3);
            AJh.A6W(this.A0X.get(i2));
            this.A0I[i2] = AJh;
            i2++;
            nextExtraTrackId = i3;
        }
    }

    private void A0E(long j) {
        while (!this.A0W.isEmpty()) {
            IX removeFirst = this.A0W.removeFirst();
            this.A03 -= removeFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long j2 = removeFirst.A01;
            if (removeFirst.A02) {
                j2 += j;
            }
            if (this.A0R != null) {
                j2 = this.A0R.A05(j2);
            }
            for (H1 h1 : this.A0J) {
                h1.AIA(j2, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j) throws C00982i {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(C4J c4j, int i, C0503Io c0503Io) throws C00982i {
        c4j.A0f(i + 8);
        int fullAtom = c4j.A0C();
        int flags = II.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z = fullAtom3 != 0;
            int sampleCount = c4j.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = c0503Io.A0F;
                int fullAtom4 = c0503Io.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = c0503Io.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(c0503Io.A0F, 0, sampleCount, z);
                int fullAtom6 = c4j.A07();
                c0503Io.A02(fullAtom6);
                c0503Io.A04(c4j);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0A(532, 18, 95)).append(sampleCount).append(A0A(0, 40, 98));
            int fullAtom7 = c0503Io.A00;
            throw C00982i.A01(append.append(fullAtom7).toString(), null);
        }
        throw C00982i.A00(A0A(458, 56, 30));
    }

    public static void A0I(C4J c4j, C0503Io c0503Io) throws C00982i {
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
        throw C00982i.A01(A0A(727, 29, 60) + A0L, null);
    }

    public static void A0J(C4J c4j, C0503Io c0503Io) throws C00982i {
        A0G(c4j, 0, c0503Io);
    }

    public static void A0K(C4J c4j, C0503Io c0503Io, byte[] bArr) throws C00982i {
        c4j.A0f(8);
        c4j.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0G(c4j, 16, c0503Io);
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(InterfaceC1619lN interfaceC1619lN) throws IOException {
        int i = ((int) this.A07) - this.A00;
        C4J c4j = this.A0D;
        if (c4j != null) {
            interfaceC1619lN.readFully(c4j.A0l(), 8, i);
            A0U(new C1590ki(this.A01, c4j), interfaceC1619lN.A8f(), interfaceC1619lN.A9H());
        } else {
            interfaceC1619lN.AJJ(i);
        }
        A0F(interfaceC1619lN.A8f());
    }

    private void A0M(InterfaceC1619lN interfaceC1619lN) throws IOException {
        IY iy = null;
        long j = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            IY nextTrackBundle = this.A0L.valueAt(i);
            C0503Io c0503Io = nextTrackBundle.A09;
            if (c0503Io.A0A && c0503Io.A03 < j) {
                j = c0503Io.A03;
                iy = this.A0L.valueAt(i);
            }
        }
        if (iy == null) {
            this.A02 = 3;
            return;
        }
        int A8f = (int) (j - interfaceC1619lN.A8f());
        if (A8f >= 0) {
            interfaceC1619lN.AJJ(A8f);
            iy.A09.A05(interfaceC1619lN);
            return;
        }
        throw C00982i.A01(A0A(384, 39, 59), null);
    }

    private void A0N(C1591kj c1591kj) throws C00982i {
        if (((II) c1591kj).A00 == 1836019574) {
            A0P(c1591kj);
            return;
        }
        if (((II) c1591kj).A00 == 1836019558) {
            A0O(c1591kj);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        C1591kj peek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        peek.A08(c1591kj);
    }

    private void A0O(C1591kj c1591kj) throws C00982i {
        A0Q(c1591kj, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        DrmInitData A06 = A06(c1591kj.A02);
        if (A06 != null) {
            int i = this.A0L.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(A06);
            }
        }
        long j = this.A0B;
        if (A0a[5].length() != 30) {
            String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j != -9223372036854775807L) {
                int size = this.A0L.size();
                for (int i2 = 0; i2 < size; i2++) {
                    IY valueAt = this.A0L.valueAt(i2);
                    long j2 = this.A0B;
                    int trackCount2 = A0a[5].length();
                    if (trackCount2 != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        valueAt.A0A(j2);
                    }
                }
                this.A0B = -9223372036854775807L;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0P(C1591kj c1591kj) throws C00982i {
        C3M.A0A(this.A0U == null, A0A(680, 20, 8));
        DrmInitData A06 = A06(c1591kj.A02);
        C1591kj c1591kj2 = (C1591kj) C3M.A01(c1591kj.A06(1836475768));
        SparseArray<IP> sparseArray = new SparseArray<>();
        long j = -9223372036854775807L;
        int size = c1591kj2.A02.size();
        for (int i = 0; i < size; i++) {
            C1590ki c1590ki = c1591kj2.A02.get(i);
            if (((II) c1590ki).A00 == 1953654136) {
                Pair<Integer, IP> A04 = A04(c1590ki.A00);
                Object obj = A04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((Integer) obj).intValue(), (IP) A04.second);
            } else if (((II) c1590ki).A00 == 1835362404) {
                j = A02(c1590ki.A00);
            }
        }
        List<C0504Ip> A0O = IO.A0O(c1591kj, new C0446Gi(), j, A06, (this.A0K & 16) != 0, false, new InterfaceC1475ip() { // from class: com.facebook.ads.redexgen.X.ke
            @Override // com.instagram.common.viewpoint.core.InterfaceC1475ip
            public final Object A43(Object obj2) {
                return C1584kc.this.A0c((C0501Im) obj2);
            }
        });
        int size2 = A0O.size();
        if (this.A0L.size() == 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                C0504Ip c0504Ip = A0O.get(i2);
                C0501Im c0501Im = c0504Ip.A03;
                this.A0L.put(c0501Im.A00, new IY(this.A0E.AJh(i2, c0501Im.A03), c0504Ip, A07(sparseArray, c0501Im.A00)));
                this.A08 = Math.max(this.A08, c0501Im.A04);
            }
            this.A0E.A6G();
            return;
        }
        C3M.A08(this.A0L.size() == size2);
        for (int i3 = 0; i3 < size2; i3++) {
            C0504Ip c0504Ip2 = A0O.get(i3);
            C0501Im c0501Im2 = c0504Ip2.A03;
            this.A0L.get(c0501Im2.A00).A0C(c0504Ip2, A07(sparseArray, c0501Im2.A00));
        }
    }

    public static void A0Q(C1591kj c1591kj, SparseArray<IY> sparseArray, boolean z, int i, byte[] bArr) throws C00982i {
        int size = c1591kj.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1591kj child = c1591kj.A01.get(i2);
            int i3 = ((II) child).A00;
            if (i3 == 1953653094) {
                A0R(child, sparseArray, z, i, bArr);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0S(C1591kj c1591kj, IY iy, int i) throws C00982i {
        int i2 = 0;
        int leafChildrenSize = 0;
        List<C1590ki> list = c1591kj.A02;
        int i3 = list.size();
        int i4 = 0;
        while (totalSampleCount != 30) {
            A0a[1] = "g5KWW";
            if (i4 < i3) {
                C1590ki c1590ki = list.get(i4);
                int trunCount = ((II) c1590ki).A00;
                if (trunCount == 1953658222) {
                    C4J c4j = c1590ki.A00;
                    c4j.A0f(12);
                    int trunCount2 = c4j.A0L();
                    if (trunCount2 > 0) {
                        leafChildrenSize += trunCount2;
                        i2++;
                    }
                }
                i4++;
            } else {
                iy.A02 = 0;
                iy.A00 = 0;
                iy.A01 = 0;
                iy.A09.A03(i2, leafChildrenSize);
                int i5 = 0;
                int trunCount3 = 0;
                for (int trunIndex = 0; trunIndex < i3; trunIndex++) {
                    C1590ki c1590ki2 = list.get(trunIndex);
                    int totalSampleCount = ((II) c1590ki2).A00;
                    if (totalSampleCount == 1953658222) {
                        trunCount3 = A01(iy, i5, i, c1590ki2.A00, trunCount3);
                        i5++;
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(C1590ki c1590ki, long j, Uri uri) throws C00982i {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c1590ki);
            return;
        }
        if (((II) c1590ki).A00 == 1936286840) {
            Pair<Long, C1624lT> A05 = A05(c1590ki.A00, j);
            Long l = (Long) A05.first;
            if (A0a[2].charAt(14) == 'D') {
                throw new RuntimeException();
            }
            A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
            this.A0C = l.longValue();
            this.A0E.AIN((InterfaceC0460Gw) A05.second);
            this.A0G = true;
            return;
        }
        if (((II) c1590ki).A00 != 1701671783 || uri == null) {
            return;
        }
        A0H(c1590ki.A00, uri);
    }

    public static boolean A0W(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r4 != 1937013298) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4 == 1937007471) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r4 == 1668232756) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r4 == 1937011571) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r4 == 1952867444) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (r4 == 1952868452) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r4 == 1953196132) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r4 == 1953654136) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r4 == 1953658222) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (r4 == 1886614376) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r4 == 1935763834) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        if (r4 == 1935763823) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r4 == 1936027235) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if (r4 == 1970628964) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (r4 == 1935828848) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r4 == 1936158820) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        if (r4 == 1701606260) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r4 == 1835362404) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
    
        if (r4 != 1701671783) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        if (r4 != 1937013298) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0X(int i) {
        if (i != 1751411826 && i != 1835296868 && i != 1836476516 && i != 1936286840 && i != 1937011556 && i != 1937011827 && i != 1668576371 && i != 1937011555) {
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "BwdOpTtZC6qkHbBW6vzemIV3sewTUKel";
            strArr[6] = "oE5SsWuxWmjvJDoIWd7OBauEjDNEKBY0";
            if (i != 1937011578) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[7] = "alBOnYvVhDOHTU7zpsfhYzjhJlh1j5qj";
                } else {
                    A0a[0] = "AuC";
                }
            }
        }
        return true;
    }

    private boolean A0Y(InterfaceC1619lN interfaceC1619lN) throws IOException {
        int trackCount;
        int i;
        if (this.A00 == 0) {
            C4J c4j = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC1619lN.AGh(c4j.A0l(), 0, 8, true)) {
                    return false;
                }
                this.A00 = 8;
                this.A0M.A0f(0);
                this.A07 = this.A0M.A0Q();
                int A0C = this.A0M.A0C();
                if (A0a[5].length() != 30) {
                    A0a[0] = "Nk2";
                    this.A01 = A0C;
                }
            }
            throw new RuntimeException();
        }
        if (this.A07 == 1) {
            interfaceC1619lN.readFully(this.A0M.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long A8G = interfaceC1619lN.A8G();
            if (A8G == -1 && !this.A0V.isEmpty()) {
                A8G = this.A0V.peek().A00;
            }
            if (A8G != -1) {
                long A8f = A8G - interfaceC1619lN.A8f();
                int trackCount2 = this.A00;
                this.A07 = A8f + trackCount2;
            }
        }
        if (this.A07 >= this.A00) {
            long A8f2 = interfaceC1619lN.A8f() - this.A00;
            if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
                this.A0E.AIN(new C1614lI(this.A08, A8f2));
                this.A0G = true;
            }
            if (this.A01 == 1836019558) {
                SparseArray<IY> sparseArray = this.A0L;
                if (A0a[0].length() != 3) {
                    A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                    trackCount = sparseArray.size();
                    i = 0;
                } else {
                    A0a[0] = "3Yh";
                    trackCount = sparseArray.size();
                    i = 0;
                }
                while (i < trackCount) {
                    C0503Io c0503Io = this.A0L.valueAt(i).A09;
                    c0503Io.A02 = A8f2;
                    c0503Io.A03 = A8f2;
                    c0503Io.A04 = A8f2;
                    i++;
                }
            }
            int trackCount3 = this.A01;
            if (trackCount3 == 1835295092) {
                this.A0F = null;
                this.A09 = this.A07 + A8f2;
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long A8f3 = (interfaceC1619lN.A8f() + this.A07) - 8;
                this.A0V.push(new C1591kj(this.A01, A8f3));
                if (this.A07 == this.A00) {
                    A0F(A8f3);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw C00982i.A00(A0A(284, 51, 6));
                }
                if (this.A07 <= 2147483647L) {
                    C4J c4j2 = new C4J((int) this.A07);
                    C4J atomData = this.A0M;
                    System.arraycopy(atomData.A0l(), 0, c4j2.A0l(), 0, 8);
                    this.A0D = c4j2;
                    this.A02 = 1;
                } else {
                    throw C00982i.A00(A0A(335, 49, 77));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0D = null;
                this.A02 = 1;
            } else {
                throw C00982i.A00(A0A(592, 53, 87));
            }
            return true;
        }
        throw C00982i.A00(A0A(78, 48, 36));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AJJ(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0246, code lost:
    
        throw com.instagram.common.viewpoint.core.C00982i.A01(A0A(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD, 35, 125), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02b8, code lost:
    
        if (r9.equals(r10) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ba, code lost:
    
        r11 = r11 | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0303, code lost:
    
        if (r9.equals(r10) != false) goto L91;
     */
    @MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0Z(InterfaceC1619lN interfaceC1619lN) throws IOException {
        int AI5;
        IY iy = this.A0F;
        Throwable th = null;
        if (iy == null) {
            SparseArray<IY> sparseArray = this.A0L;
            if (A0a[0].length() == 3) {
                A0a[0] = "dJt";
                iy = A08(sparseArray);
                if (iy == null) {
                    int A8f = (int) (this.A09 - interfaceC1619lN.A8f());
                    if (A0a[3].charAt(19) != 'e') {
                        A0a[5] = "OgjcUdmzkFJtvCkNjJUwSL6BC";
                    } else {
                        String[] strArr = A0a;
                        strArr[4] = "drajDSJT48ogOqJP7e4ZIkjylQBmqc38";
                        strArr[6] = "jG2fRwUYgKH0Z3F7iVLG52YSPeKVDlpp";
                    }
                } else {
                    int A05 = (int) (iy.A05() - interfaceC1619lN.A8f());
                    if (A05 < 0) {
                        AnonymousClass44.A07(A0A(204, 22, 75), A0A(226, 40, 13));
                        A05 = 0;
                    }
                    interfaceC1619lN.AJJ(A05);
                    this.A0F = iy;
                }
            }
            throw new RuntimeException();
        }
        int i = 4;
        int i2 = 1;
        if (this.A02 == 3) {
            this.A06 = iy.A03();
            if (iy.A01 < iy.A03) {
                interfaceC1619lN.AJJ(this.A06);
                iy.A09();
                if (!iy.A0D()) {
                    this.A0F = null;
                }
                this.A02 = 3;
                return true;
            }
            if (iy.A05.A03.A02 == 1) {
                this.A06 -= 8;
                interfaceC1619lN.AJJ(8);
            }
            if (A0A(878, 9, 31).equals(iy.A05.A03.A07.A0W)) {
                this.A04 = iy.A04(this.A06, 7);
                GI.A07(this.A06, this.A0Q);
                iy.A08.AI7(this.A0Q, 7);
                this.A04 += 7;
            } else {
                this.A04 = iy.A04(this.A06, 0);
            }
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        C0501Im c0501Im = iy.A05.A03;
        if (A0a[1].length() != 3) {
            A0a[7] = "UjEa6ysv1gVuBQ9NSSQbVZdjDRxN5dgX";
            H1 h1 = iy.A08;
            long A06 = iy.A06();
            if (this.A0R != null) {
                C4R c4r = this.A0R;
                if (A0a[7].charAt(28) != 'N') {
                    A0a[2] = "ZxJoJWsimIFBA6WXS2a50b6K01MwI4cU";
                    A06 = c4r.A05(A06);
                } else {
                    A06 = c4r.A05(A06);
                }
            }
            if (c0501Im.A01 == 0) {
                while (this.A04 < this.A06) {
                    this.A04 += h1.AI5(interfaceC1619lN, this.A06 - this.A04, false);
                }
            } else {
                byte[] A0l = this.A0O.A0l();
                A0l[0] = 0;
                A0l[1] = 0;
                A0l[2] = 0;
                int i3 = c0501Im.A01 + 1;
                int i4 = 4 - c0501Im.A01;
                while (this.A04 < this.A06) {
                    if (this.A05 == 0) {
                        interfaceC1619lN.readFully(A0l, i4, i3);
                        this.A0O.A0f(0);
                        int A0C = this.A0O.A0C();
                        if (A0C >= i2) {
                            this.A05 = A0C - 1;
                            this.A0P.A0f(0);
                            h1.AI7(this.A0P, i);
                            h1.AI7(this.A0O, i2);
                            if (A0a[5].length() == 30) {
                                throw new RuntimeException();
                            }
                            A0a[7] = "3HbOupLLxbWrXLbfJiyKVwL3oOoB4yeP";
                            this.A0H = this.A0I.length > 0 && AbstractC0454Gq.A0I(c0501Im.A07.A0W, A0l[i]);
                            this.A04 += 5;
                            this.A06 += i4;
                            i2 = 1;
                        } else {
                            throw C00982i.A01(A0A(266, 18, 117), th);
                        }
                    } else {
                        if (this.A0H) {
                            this.A0N.A0d(this.A05);
                            interfaceC1619lN.readFully(this.A0N.A0l(), 0, this.A05);
                            h1.AI7(this.A0N, this.A05);
                            AI5 = this.A05;
                            int A02 = AbstractC0454Gq.A02(this.A0N.A0l(), this.A0N.A0A());
                            this.A0N.A0f(A0A(887, 10, 116).equals(c0501Im.A07.A0W) ? 1 : 0);
                            this.A0N.A0e(A02);
                            GR.A03(A06, this.A0N, this.A0I);
                        } else {
                            AI5 = h1.AI5(interfaceC1619lN, this.A05, false);
                        }
                        this.A04 += AI5;
                        this.A05 -= AI5;
                        th = null;
                        i = 4;
                        i2 = 1;
                    }
                }
            }
            int A022 = iy.A02();
            C0463Gz c0463Gz = null;
            C0502In A07 = iy.A07();
            if (A07 != null) {
                c0463Gz = A07.A01;
            }
            if (!MetaExoPlayerUpgradeConfig.A03(EnumC1429i2.A1M) && this.A0F != null) {
                String str = this.A0F.A05.A03.A07.A0W;
                String A0A = A0A(857, 21, 115);
                if (A0a[7].charAt(28) != 'N') {
                    A0a[2] = "aQkaLsEF9G127UYNPtKAhcOp5GPMu7GC";
                }
            }
            long j = A06;
            h1.AIA(A06, A022, this.A06, 0, c0463Gz);
            this.A0A = j;
            A0E(j);
            if (!iy.A0D()) {
                if (A0a[3].charAt(19) != 'e') {
                    A0a[2] = "Oznva4TpQIm3xwCXLn5zZ8MtjPilTYJm";
                    this.A0F = null;
                } else {
                    String[] strArr2 = A0a;
                    strArr2[4] = "tQydpv41IRe8SJWpvpJnsmPT1e9HbOAv";
                    strArr2[6] = "ocIdfF7b9GnVk3ZHQkLuHXJpp6hE4I0I";
                    this.A0F = null;
                }
            }
            this.A02 = 3;
            return true;
        }
        throw new RuntimeException();
    }

    public static boolean A0a(C0501Im c0501Im) {
        if (c0501Im.A08 == null || c0501Im.A08.length != 1 || c0501Im.A09 == null) {
            return false;
        }
        if (c0501Im.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = AbstractC01424a.A0U(c0501Im.A08[0] + c0501Im.A09[0], 1000000L, c0501Im.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[1] = "wHdUW";
        return editListEndMediaTimeUs >= c0501Im.A04;
    }

    public static /* synthetic */ GX[] A0b() {
        return new GX[]{new C1583kb()};
    }

    public final C0501Im A0c(C0501Im c0501Im) {
        return c0501Im;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A0E = gy;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new IY(gy.AJh(0, this.A0U.A03), new C0504Ip(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new IP(0, 0, 0, 0)));
            this.A0E.A6G();
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final int AGb(InterfaceC1619lN interfaceC1619lN, C0457Gt c0457Gt) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC1619lN)) {
                        return -1;
                    }
                    break;
                case 1:
                    A0L(interfaceC1619lN);
                    break;
                case 2:
                    A0M(interfaceC1619lN);
                    break;
                default:
                    if (!A0Z(interfaceC1619lN)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AIM(long j, long j2) {
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            this.A0L.valueAt(i).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0V.clear();
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1619lN interfaceC1619lN) throws IOException {
        return AbstractC0499Ik.A01(interfaceC1619lN);
    }
}
