package com.facebook.ads.androidx.media3.extractor.mkv;

import android.net.Uri;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import androidx.work.WorkRequest;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.firebase.FirebaseError;
import com.instagram.common.viewpoint.core.AbstractC00881w;
import com.instagram.common.viewpoint.core.AbstractC01424a;
import com.instagram.common.viewpoint.core.AbstractC0454Gq;
import com.instagram.common.viewpoint.core.AnonymousClass44;
import com.instagram.common.viewpoint.core.AnonymousClass45;
import com.instagram.common.viewpoint.core.C00982i;
import com.instagram.common.viewpoint.core.C0457Gt;
import com.instagram.common.viewpoint.core.C0463Gz;
import com.instagram.common.viewpoint.core.C1596kp;
import com.instagram.common.viewpoint.core.C1598kr;
import com.instagram.common.viewpoint.core.C1614lI;
import com.instagram.common.viewpoint.core.C1624lT;
import com.instagram.common.viewpoint.core.C3M;
import com.instagram.common.viewpoint.core.C4J;
import com.instagram.common.viewpoint.core.GX;
import com.instagram.common.viewpoint.core.GY;
import com.instagram.common.viewpoint.core.H1;
import com.instagram.common.viewpoint.core.I9;
import com.instagram.common.viewpoint.core.IC;
import com.instagram.common.viewpoint.core.ID;
import com.instagram.common.viewpoint.core.IE;
import com.instagram.common.viewpoint.core.InterfaceC0439Gb;
import com.instagram.common.viewpoint.core.InterfaceC0460Gw;
import com.instagram.common.viewpoint.core.InterfaceC1619lN;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class MatroskaExtractor implements GX {
    public static byte[] A0t;
    public static String[] A0u = {"tBqjpPNwSsfRjGbhoSofYeEQJAfxpzeJ", "SQ32k5yHiSqu0tF5bV2mYZI8q27OK2Wk", "Ew8EcvFtYPYsbuW", "MeCkyRYcfoGShRSoQHq7qyLBTkTGcoSQ", "UyV8GtaWyEclMV8OhG", "yLkQb0Xo1O", "PFhexnCJ0GZtqtRWjlJ7uY4w9", "UodjFtXG6f6h7NmMQ857"};
    public static final InterfaceC0439Gb A0v;
    public static final Map<String, Integer> A0w;
    public static final UUID A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;

    @MetaExoPlayerCustomization("Removed the final from the member variable")
    public SparseArray<IC> A0P;
    public AnonymousClass45 A0Q;
    public AnonymousClass45 A0R;
    public GY A0S;
    public IC A0T;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "AR/VC customizations")
    public String A0U;
    public ByteBuffer A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public int[] A0f;
    public final C4J A0g;
    public final C4J A0h;
    public final C4J A0i;
    public final C4J A0j;
    public final C4J A0k;
    public final C4J A0l;
    public final C4J A0m;
    public final C4J A0n;
    public final C4J A0o;
    public final C4J A0p;
    public final I9 A0q;
    public final IE A0r;
    public final boolean A0s;

    /* JADX WARN: Code restructure failed: missing block: B:111:0x03fd, code lost:
    
        if (r5.equals(r6) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03ff, code lost:
    
        r12.A0p.A0f(0);
        r3.AI7(r12.A0p, 4);
        r12.A09 += 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0414, code lost:
    
        return A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0425, code lost:
    
        if (r5.equals(r6) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        if (r11 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
    
        r0[0] = (byte) (r2 | 8);
        r12.A0l.A0f(0);
        r3.AI8(r12.A0l, 1, 1);
        r12.A09++;
        r12.A0g.A0f(0);
        r3.AI8(r12.A0g, 8, 1);
        r12.A09 += 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x020d, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0209, code lost:
    
        if (r11 != false) goto L38;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0415  */
    @RequiresNonNull({"#2.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A02(InterfaceC1619lN interfaceC1619lN, IC ic, int i, boolean z) throws IOException {
        String[] strArr;
        byte[] A0l;
        if (A06(PointerIconCompat.TYPE_NO_DROP, 11, 56).equals(ic.A0d)) {
            A0F(interfaceC1619lN, A10, i);
            return A00();
        }
        String[] strArr2 = A0u;
        if (strArr2[5].length() != strArr2[6].length()) {
            A0u[3] = "Q42iXR6evmRi7JQ7PxfR7toxYIITwFkY";
            if (A06(1002, 10, 101).equals(ic.A0d)) {
                A0F(interfaceC1619lN, A0z, i);
                return A00();
            }
            if (A06(1023, 13, 32).equals(ic.A0d)) {
                A0F(interfaceC1619lN, A11, i);
                return A00();
            }
            H1 h1 = ic.A0b;
            if (!this.A0Y) {
                if (ic.A0i) {
                    this.A02 &= -1073741825;
                    int i2 = 128;
                    if (!this.A0b) {
                        interfaceC1619lN.readFully(this.A0l.A0l(), 0, 1);
                        this.A08++;
                        if ((this.A0l.A0l()[0] & 128) == 128) {
                            throw C00982i.A01(A06(694, 35, 14), null);
                        }
                        this.A00 = this.A0l.A0l()[0];
                        this.A0b = true;
                    }
                    if ((this.A00 & 1) == 1) {
                        boolean z2 = (this.A00 & 2) == 2;
                        this.A02 |= 1073741824;
                        if (!this.A0Z) {
                            byte[] A0l2 = this.A0g.A0l();
                            String[] strArr3 = A0u;
                            if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                                String[] strArr4 = A0u;
                                strArr4[5] = "0YZVfaON5K";
                                strArr4[6] = "Vpm73VVBoM5AMHA6BL8GPMDLM";
                                interfaceC1619lN.readFully(A0l2, 0, 8);
                                this.A08 += 8;
                                this.A0Z = true;
                                A0l = this.A0l.A0l();
                            } else {
                                interfaceC1619lN.readFully(A0l2, 0, 8);
                                this.A08 += 8;
                                this.A0Z = true;
                                A0l = this.A0l.A0l();
                            }
                        }
                        if (z2) {
                            boolean z3 = this.A0a;
                            String[] strArr5 = A0u;
                            if (strArr5[5].length() == strArr5[6].length()) {
                                throw new RuntimeException();
                            }
                            A0u[3] = "IbloDRbaqkSTIb2EEG1BJ7I1x09YBoFC";
                            if (!z3) {
                                interfaceC1619lN.readFully(this.A0l.A0l(), 0, 1);
                                this.A08++;
                                this.A0l.A0f(0);
                                this.A0B = this.A0l.A0I();
                                this.A0a = true;
                            }
                            int i3 = this.A0B * 4;
                            this.A0l.A0d(i3);
                            interfaceC1619lN.readFully(this.A0l.A0l(), 0, i3);
                            this.A08 += i3;
                            short s = (short) ((this.A0B / 2) + 1);
                            int i4 = (s * 6) + 2;
                            if (this.A0V == null || this.A0V.capacity() < i4) {
                                this.A0V = ByteBuffer.allocate(i4);
                            }
                            this.A0V.position(0);
                            this.A0V.putShort(s);
                            int i5 = 0;
                            for (int i6 = 0; i6 < this.A0B; i6++) {
                                int i7 = i5;
                                i5 = this.A0l.A0L();
                                if (i6 % 2 != 0) {
                                    ByteBuffer byteBuffer = this.A0V;
                                    String[] strArr6 = A0u;
                                    if (strArr6[2].length() == strArr6[4].length()) {
                                        break;
                                    }
                                    String[] strArr7 = A0u;
                                    strArr7[2] = "aiG4mSAFtmR28a0";
                                    strArr7[4] = "af0fkPAZLGHpLmON09";
                                    byteBuffer.putInt(i5 - i7);
                                } else {
                                    ByteBuffer byteBuffer2 = this.A0V;
                                    short s2 = (short) (i5 - i7);
                                    String[] strArr8 = A0u;
                                    if (strArr8[5].length() == strArr8[6].length()) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr9 = A0u;
                                    strArr9[5] = "ft008TAv7G";
                                    strArr9[6] = "haHnc3qulCtaE6iMk670OeuEn";
                                    byteBuffer2.putShort(s2);
                                }
                            }
                            int i8 = (i - this.A08) - i5;
                            if (this.A0B % 2 == 1) {
                                this.A0V.putInt(i8);
                            } else {
                                this.A0V.putShort((short) i8);
                                this.A0V.putInt(0);
                            }
                            this.A0h.A0j(this.A0V.array(), i4);
                            h1.AI8(this.A0h, i4, 1);
                            this.A09 += i4;
                        }
                    }
                } else if (ic.A0m != null) {
                    this.A0k.A0j(ic.A0m, ic.A0m.length);
                }
                if (ic.A0B(z)) {
                    this.A02 |= 268435456;
                    this.A0o.A0d(0);
                    int A0A = (this.A0k.A0A() + i) - this.A08;
                    this.A0l.A0d(4);
                    this.A0l.A0l()[0] = (byte) ((A0A >> 24) & 255);
                    this.A0l.A0l()[1] = (byte) ((A0A >> 16) & 255);
                    this.A0l.A0l()[2] = (byte) ((A0A >> 8) & 255);
                    this.A0l.A0l()[3] = (byte) (A0A & 255);
                    h1.AI8(this.A0l, 4, 2);
                    this.A09 += 4;
                }
                this.A0Y = true;
            }
            int A0A2 = i + this.A0k.A0A();
            if (!A06(1207, 15, 14).equals(ic.A0d)) {
                String[] strArr10 = A0u;
                if (strArr10[2].length() != strArr10[4].length()) {
                    A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                    if (!A06(1236, 16, 47).equals(ic.A0d)) {
                        if (ic.A0c != null) {
                            C3M.A08(this.A0k.A0A() == 0);
                            ic.A0c.A03(interfaceC1619lN);
                        }
                        while (this.A08 < A0A2) {
                            int A01 = A01(interfaceC1619lN, h1, A0A2 - this.A08);
                            this.A08 += A01;
                            this.A09 += A01;
                        }
                        String A06 = A06(271, 8, 117);
                        String str = ic.A0d;
                        strArr = A0u;
                        if (strArr[1].charAt(1) == strArr[0].charAt(1)) {
                            A0u[3] = "L5Y1ZRMfFWOxp58RZlemSr0Ie3cKRoNn";
                        } else {
                            String[] strArr11 = A0u;
                            strArr11[2] = "6h0vzYYIjFmBqGs";
                            strArr11[4] = "2CBNjdNTCI84kXMqqr";
                        }
                    }
                }
            }
            byte[] A0l3 = this.A0i.A0l();
            A0l3[0] = 0;
            A0l3[1] = 0;
            A0l3[2] = 0;
            int i9 = ic.A0Q;
            int i10 = 4 - ic.A0Q;
            while (this.A08 < A0A2) {
                if (this.A0A == 0) {
                    A0G(interfaceC1619lN, A0l3, i10, i9);
                    this.A08 += i9;
                    this.A0i.A0f(0);
                    this.A0A = this.A0i.A0L();
                    this.A0j.A0f(0);
                    h1.AI7(this.A0j, 4);
                    String[] strArr12 = A0u;
                    if (strArr12[1].charAt(1) != strArr12[0].charAt(1)) {
                        String[] strArr13 = A0u;
                        strArr13[5] = "fro1mi6zSK";
                        strArr13[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                        this.A09 += 4;
                    } else {
                        A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                        this.A09 += 4;
                    }
                } else {
                    int A012 = A01(interfaceC1619lN, h1, this.A0A);
                    this.A08 += A012;
                    this.A09 += A012;
                    this.A0A -= A012;
                }
            }
            String A062 = A06(271, 8, 117);
            String str2 = ic.A0d;
            strArr = A0u;
            if (strArr[1].charAt(1) == strArr[0].charAt(1)) {
            }
        }
        throw new RuntimeException();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0t, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0t = new byte[]{90, Ascii.ETB, Ascii.SI, 9, Ascii.SO, 90, Ascii.CAN, Ascii.US, 90, 19, Ascii.DC4, 90, Ascii.ESC, 90, 57, Ascii.SI, Ascii.US, 9, 96, 45, 53, 51, 52, 96, 34, 37, 96, 41, 46, 96, 33, 96, Ascii.DC4, 50, 33, 35, 43, 5, 46, 52, 50, 57, 19, 93, 92, 71, 19, 64, 70, 67, 67, 92, 65, 71, 86, 87, 111, 122, 123, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, Ascii.SYN, 3, 1, 87, 9, Ascii.SYN, 3, 1, 87, 9, Ascii.SYN, 3, 1, 87, Ascii.US, Ascii.SYN, 3, 0, 87, 19, 6, 4, 82, Ascii.FF, 19, 6, 4, 82, Ascii.FF, 19, 6, 4, 82, Ascii.CAN, 19, 6, 5, 82, 0, 4, Ascii.DC2, Ascii.DC2, 36, 53, 53, 40, 47, 38, 50, 2, 40, 49, 41, 36, 51, Ascii.FF, 46, 37, 36, 97, 94, 64, 94, 94, 92, Ascii.ETB, 9, Ascii.ETB, Ascii.NAK, 101, 58, 36, Utf8.REPLACEMENT_BYTE, 47, 40, 58, 36, Utf8.REPLACEMENT_BYTE, 47, 40, 84, 62, 35, 43, 41, 62, 40, 40, 80, 78, 85, 69, 66, 62, 93, 94, 66, 66, 93, 84, 66, 66, 120, 102, 124, 120, 122, 10, 110, 112, 105, 99, 110, 108, 33, Utf8.REPLACEMENT_BYTE, 45, 48, 37, 39, 79, 44, 82, 2, Ascii.FS, Ascii.SO, 19, 6, 4, 108, Ascii.SI, 112, 33, Utf8.REPLACEMENT_BYTE, 45, 51, 79, 33, 35, 45, Ascii.US, 1, 17, Ascii.SO, Ascii.VT, Ascii.CR, 82, 76, 67, 80, 94, 60, 85, 95, 92, 82, 71, 60, 90, 86, 86, 86, 82, 76, 67, 80, 94, 60, 90, 93, 71, 60, 81, 90, 84, Ascii.FF, Ascii.DC2, Ascii.GS, Ascii.SO, 0, 98, 4, 3, Ascii.EM, 98, 1, 4, Ascii.EM, 116, 106, 97, 103, 96, 112, 125, 113, 56, 38, 47, 54, 43, 59, 48, 42, 105, 75, 68, Ascii.CR, 94, 10, 89, 73, 75, 70, 79, 10, 94, 67, 71, 79, 73, 69, 78, 79, 10, 90, 88, 67, 69, 88, 10, 94, 69, 10, 94, 67, 71, 79, 73, 69, 78, 79, 121, 73, 75, 70, 79, 10, 72, 79, 67, 68, 77, 10, 89, 79, 94, 4, 5, 41, 34, 35, 37, Ascii.SI, 34, 102, 47, 53, 102, 43, 47, 53, 53, 47, 40, 33, 102, 47, 40, 102, Ascii.DC2, 52, 39, 37, 45, 3, 40, 50, 52, Utf8.REPLACEMENT_BYTE, 102, 35, 42, 35, 43, 35, 40, 50, 117, 89, 91, 84, 95, 88, 95, 88, 81, Ascii.SYN, 83, 88, 85, 68, 79, 70, 66, 95, 89, 88, Ascii.SYN, 87, 88, 82, Ascii.SYN, 85, 89, 91, 70, 68, 83, 69, 69, 95, 89, 88, Ascii.SYN, 95, 69, Ascii.SYN, 88, 89, 66, Ascii.SYN, 69, 67, 70, 70, 89, 68, 66, 83, 82, 86, 122, 123, 97, 112, 123, 97, 86, 122, 120, 101, 84, 121, 114, 122, 53, 107, 71, 70, 92, 77, 70, 92, 109, 70, 75, 105, 68, 79, 71, 8, 82, 126, Byte.MAX_VALUE, 101, 116, Byte.MAX_VALUE, 101, 84, Byte.MAX_VALUE, 114, 126, 117, 120, Byte.MAX_VALUE, 118, 94, 99, 117, 116, 99, 49, 95, 115, 114, 104, 121, 114, 104, 89, 114, Byte.MAX_VALUE, 115, 120, 117, 114, 123, 79, Byte.MAX_VALUE, 115, 108, 121, 60, 110, 67, 89, 73, 75, 88, 78, 67, 68, 77, 10, 70, 75, 89, 94, 10, 73, 95, 79, 10, 90, 69, 67, 68, 94, 10, 93, 67, 94, 66, 10, 95, 68, 79, 82, 90, 79, 73, 94, 79, 78, 10, 78, 95, 88, 75, 94, 67, 69, 68, 16, 10, Ascii.CR, 38, 42, Ascii.GS, 48, 57, 44, 105, 83, 120, 116, 67, 110, 103, 114, 69, 114, 118, 115, 65, 114, 101, 100, 126, 120, 121, 55, 71, 64, 79, 78, 34, 110, 99, 97, 107, 108, 101, 34, 113, 99, 111, 114, 110, 103, 34, 113, 107, 120, 103, 34, 109, 119, 118, 34, 109, 100, 34, 112, 99, 108, 101, 103, 44, 51, 52, 59, 58, 36, 19, Ascii.ETB, Ascii.DC2, 32, 19, 4, 5, Ascii.US, Ascii.EM, Ascii.CAN, 86, 1, 40, 33, 41, 33, 42, 48, 100, 119, 92, 81, 64, 75, 66, 70, 87, 86, Ascii.DC2, 102, 64, 83, 81, 89, Ascii.DC2, 84, 93, 71, 92, 86, Ascii.DC2, 80, 71, 70, Ascii.DC2, 113, 93, 92, 70, 87, 92, 70, 119, 92, 81, 121, 87, 75, 123, 118, Ascii.DC2, 69, 83, 65, Ascii.DC2, 92, 93, 70, Ascii.DC2, 84, 93, 71, 92, 86, 71, 122, 118, 103, 108, 113, 107, 109, 108, 34, 96, 107, 118, 34, 107, 113, 34, 113, 103, 118, 34, 107, 108, 34, 113, 107, 101, 108, 99, 110, 34, 96, 123, 118, 103, 108, 69, 88, 71, 75, 94, 16, 10, 121, 94, 75, 88, 94, 6, 10, 111, 68, 78, 6, 10, 120, 79, 75, 78, 101, 88, 78, 79, 88, 6, 10, 102, 75, 83, 79, 88, 6, 10, 121, 94, 83, 70, 79, 6, 10, 100, 75, 71, 79, 6, 10, 103, 75, 88, 77, 67, 68, 102, 6, 10, 103, 75, 88, 77, 67, 68, 120, 6, 10, 103, 75, 88, 77, 67, 68, 124, 6, 10, 111, 76, 76, 79, 73, 94, 6, 10, 126, 79, 82, 94, 56, Ascii.DC4, Ascii.ESC, 17, Ascii.DC4, 1, Ascii.SUB, 7, Ascii.FF, 85, 16, Ascii.EM, 16, Ascii.CAN, 16, Ascii.ESC, 1, 85, 38, 16, 16, Ascii.RS, 60, 49, 85, Ascii.SUB, 7, 85, 38, 16, 16, Ascii.RS, 37, Ascii.SUB, 6, Ascii.FS, 1, Ascii.FS, Ascii.SUB, Ascii.ESC, 85, Ascii.ESC, Ascii.SUB, 1, 85, 19, Ascii.SUB, 0, Ascii.ESC, 17, Ascii.SO, 34, 55, 49, 44, 48, 40, 34, 6, 59, 55, 49, 34, 32, 55, 44, 49, 54, Ascii.SO, Ascii.ETB, Ascii.SI, Ascii.DC2, Ascii.VT, Ascii.ETB, Ascii.RS, 91, 40, Ascii.RS, Ascii.FS, Ascii.SYN, Ascii.RS, Ascii.NAK, Ascii.SI, 91, Ascii.RS, Ascii.ETB, Ascii.RS, Ascii.SYN, Ascii.RS, Ascii.NAK, Ascii.SI, 8, 91, Ascii.NAK, Ascii.DC4, Ascii.SI, 91, 8, Ascii.SO, Ascii.VT, Ascii.VT, Ascii.DC4, 9, Ascii.SI, Ascii.RS, Ascii.US, 32, 1, 78, Ascii.CAN, Ascii.SI, 2, 7, 10, 78, Ascii.SUB, Ascii.FS, Ascii.SI, Ascii.CR, 5, Ascii.GS, 78, Ascii.EM, Ascii.VT, Ascii.FS, Ascii.VT, 78, 8, 1, Ascii.ESC, 0, 10, 91, 122, 53, 99, 116, 121, 124, 113, 53, 99, 116, 103, 124, 123, 97, 53, 121, 112, 123, 114, 97, 125, 53, 120, 116, 102, 126, 53, 115, 122, 96, 123, 113, Base64.padSymbol, 49, 42, 56, 44, Base64.padSymbol, 59, 44, 105, 101, 114, 126, 119, 108, Ascii.NAK, 106, 
        125, 105, 58, 54, Base64.padSymbol, 44, 49, Base64.padSymbol, 70, 40, 58, 58, 103, 107, 96, 113, 108, 96, Ascii.ESC, 97, 96, 114, Ascii.FF, Byte.MAX_VALUE, 115, 120, 105, 116, 120, 3, 123, 105, 110, 122, 120, 120, 65, 77, 68, 93, 80, 65, 71, 80, 35, Ascii.ESC, Ascii.EM, 0, 0, Ascii.EM, Ascii.RS, Ascii.ETB, 80, 3, 5, Ascii.DC2, 4, Ascii.EM, 4, Ascii.FS, Ascii.NAK, 80, 3, 17, Ascii.GS, 0, Ascii.FS, Ascii.NAK, 80, Ascii.EM, Ascii.RS, 80, Ascii.FS, 17, 19, Ascii.NAK, Ascii.DC4, 80, Ascii.DC2, Ascii.FS, Ascii.US, 19, Ascii.ESC, 94, 64, 120, 122, 99, 99, 122, 125, 116, 51, 96, 102, 113, 103, 122, 103, Byte.MAX_VALUE, 118, 51, 96, 114, 126, 99, Byte.MAX_VALUE, 118, 51, 100, 122, 103, 123, 51, 125, 124, 51, 119, 102, 97, 114, 103, 122, 124, 125, Base64.padSymbol, 81, 106, 97, 124, 116, 97, 103, 112, 97, 96, 36, 109, 96, 62, 36, 9, 50, 57, 36, 44, 57, Utf8.REPLACEMENT_BYTE, 40, 57, 56, 124, 48, Base64.padSymbol, Utf8.REPLACEMENT_BYTE, 53, 50, 59, 124, 42, Base64.padSymbol, 48, 41, 57, 102, 124, 45, 36, 58, 45, 74, 62, 55, 37, 56, 45, 47, 90, 122, 115, 97, 124, 105, 107, Ascii.CAN, 3, 101, Byte.MAX_VALUE, 99, 3, 109, 124, 102, 111, 125, 96, 117, 119, 4, Ascii.US, 121, 99, Byte.MAX_VALUE, Ascii.US, 113, 99, 96, 84, 93, 79, 82, 71, 69, 54, 45, 75, 81, 77, 45, 67, 84, 65, 60, 53, 39, 58, 47, 45, 94, 69, 35, 57, 37, 69, 57, 58, 117, 124, 110, 115, 102, 100, 107, Ascii.FF, 106, 112, 108, Ascii.FF, 107, 102, 117, 96, 76, 69, 87, 73, 53, 76, 92, 77, 53, 92, 85, 79, 72, 89, 89, 69, 76, 71, 91, 86, 92, 65, 82, Ascii.DC2, Ascii.ESC, Ascii.DC2, Ascii.DC4, 124, 2, Ascii.VT, 2, 4, 109, 79, 83, 68, 120, 81, 78, 67, 66, 72, 120, 85, 72, 83, 102, 10, Ascii.ETB, Ascii.ETB, Ascii.ETB, 52, 40, Utf8.REPLACEMENT_BYTE, 3, 42, 53, 56, 57, 51, 3, 46, 51, 40, Ascii.GS, 113, 108, 101, 108, 56, 36, 51, Ascii.SI, 38, 57, 52, 53, Utf8.REPLACEMENT_BYTE, Ascii.SI, 34, Utf8.REPLACEMENT_BYTE, 36, 17, 125, 97, 104, 96, 93, 65, 86, 106, 67, 92, 81, 80, 90, 106, 71, 90, 65, 116, Ascii.CAN, 7, 2, 5, 34, 46, 59, Base64.padSymbol, 32, 60, 36, 46, 56, 39, 42, 43, 33, 97, 57, 43, 44, 35, Ascii.NAK, 7, 0, Ascii.SI};
    }

    static {
        A0B();
        A0v = new InterfaceC0439Gb() { // from class: com.facebook.ads.redexgen.X.kq
            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final GX[] A5F() {
                return MatroskaExtractor.A0Q();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC0439Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC0438Ga.A01(this, uri, map);
            }
        };
        A10 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0y = AbstractC01424a.A1G(A06(729, 90, 38));
        A0z = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A11 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        A0x = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put(A06(1285, 18, 43), 0);
        hashMap.put(A06(1303, 18, 80), 90);
        hashMap.put(A06(1321, 18, 92), Integer.valueOf(Opcodes.GETFIELD));
        hashMap.put(A06(1339, 18, 57), 270);
        Map<String, Integer> trackNameToRotationDegrees = Collections.unmodifiableMap(hashMap);
        A0w = trackNameToRotationDegrees;
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new C1598kr(), i);
    }

    public MatroskaExtractor(I9 i9, int i) {
        this.A0M = -1L;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = -9223372036854775807L;
        this.A0q = i9;
        this.A0q.AA5(new C1596kp(this));
        this.A0s = (i & 1) == 0;
        this.A0r = new IE();
        this.A0P = new SparseArray<>();
        this.A0l = new C4J(4);
        this.A0p = new C4J(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0m = new C4J(4);
        this.A0j = new C4J(AbstractC0454Gq.A03);
        this.A0i = new C4J(4);
        this.A0k = new C4J();
        this.A0n = new C4J();
        this.A0g = new C4J(8);
        this.A0h = new C4J();
        this.A0o = new C4J();
        this.A0f = new int[1];
    }

    private int A00() {
        int sampleSize = this.A09;
        A0A();
        return sampleSize;
    }

    private int A01(InterfaceC1619lN interfaceC1619lN, H1 h1, int i) throws IOException {
        int strippedBytesLeft = this.A0k.A07();
        if (strippedBytesLeft > 0) {
            int bytesWritten = Math.min(i, strippedBytesLeft);
            h1.AI7(this.A0k, bytesWritten);
            return bytesWritten;
        }
        return h1.AI5(interfaceC1619lN, i, false);
    }

    private long A03(long j) throws C00982i {
        if (this.A0O != -9223372036854775807L) {
            return AbstractC01424a.A0U(j, this.A0O, 1000L);
        }
        throw C00982i.A01(A06(279, 54, 38), null);
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0053 */
    @MetaExoPlayerCustomization("Adding support AR/VR eventListener")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private InterfaceC0460Gw A04(AnonymousClass45 anonymousClass45, AnonymousClass45 anonymousClass452) {
        if (this.A0M == -1 || this.A0J == -9223372036854775807L || anonymousClass45 == null || anonymousClass45.A02() == 0 || anonymousClass452 == null || anonymousClass452.A02() != anonymousClass45.A02()) {
            return new C1614lI(this.A0J);
        }
        int A02 = anonymousClass45.A02();
        int[] iArr = new int[A02];
        long[] timesUs = new long[A02];
        long[] durationsUs = new long[A02];
        long[] offsets = new long[A02];
        for (int i = 0; i < A02; i++) {
            offsets[i] = anonymousClass45.A03(i);
            timesUs[i] = this.A0M + anonymousClass452.A03(i);
        }
        for (int i2 = 0; i2 < cuePointsSize; i2++) {
            int cuePointsSize = i2 + 1;
            iArr[i2] = (int) (timesUs[cuePointsSize] - timesUs[i2]);
            int i3 = i2 + 1;
            if (A0u[7].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0u;
            strArr[1] = "EcqUdVdOszDxTX1GLg4Sg6FEnSFxXYEO";
            strArr[0] = "f3IXvdxpqPdXnJQYi44axyFnZVKpD9LT";
            durationsUs[i2] = offsets[i3] - offsets[i2];
        }
        iArr[A02 - 1] = (int) ((this.A0M + this.A0N) - timesUs[A02 - 1]);
        durationsUs[A02 - 1] = this.A0J - offsets[A02 - 1];
        int cuePointsSize2 = A02 - 1;
        long j = durationsUs[cuePointsSize2];
        if (j <= 0) {
            AnonymousClass44.A07(A06(869, 17, 79), A06(499, 52, 38) + j);
            int cuePointsSize3 = iArr.length;
            iArr = Arrays.copyOf(iArr, cuePointsSize3 - 1);
            int cuePointsSize4 = timesUs.length;
            timesUs = Arrays.copyOf(timesUs, cuePointsSize4 - 1);
            int cuePointsSize5 = durationsUs.length;
            durationsUs = Arrays.copyOf(durationsUs, cuePointsSize5 - 1);
            int cuePointsSize6 = offsets.length;
            offsets = Arrays.copyOf(offsets, cuePointsSize6 - 1);
        }
        return new C1624lT(iArr, timesUs, durationsUs, offsets);
    }

    private final IC A05(int i) throws C00982i {
        A0D(i);
        return this.A0T;
    }

    @EnsuresNonNull({"extractorOutput"})
    private void A09() {
        C3M.A02(this.A0S);
    }

    private void A0A() {
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0Y = false;
        this.A0b = false;
        this.A0a = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0Z = false;
        this.A0k.A0d(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void A0C(int i) throws C00982i {
        if (this.A0R != null && this.A0Q != null) {
        } else {
            throw C00982i.A01(A06(631, 8, 72) + i + A06(0, 18, 118), null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void A0D(int i) throws C00982i {
        if (this.A0T != null) {
        } else {
            throw C00982i.A01(A06(631, 8, 72) + i + A06(18, 24, 76), null);
        }
    }

    private void A0E(InterfaceC1619lN interfaceC1619lN, int i) throws IOException {
        if (this.A0l.A0A() >= i) {
            return;
        }
        if (this.A0l.A08() < i) {
            this.A0l.A0c(Math.max(this.A0l.A08() * 2, i));
        }
        interfaceC1619lN.readFully(this.A0l.A0l(), this.A0l.A0A(), i - this.A0l.A0A());
        this.A0l.A0e(i);
    }

    private void A0F(InterfaceC1619lN interfaceC1619lN, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        int sizeWithPrefix = this.A0n.A08();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i;
            this.A0n.A0i(Arrays.copyOf(bArr, sizeWithPrefix2));
        } else {
            byte[] A0l = this.A0n.A0l();
            int sizeWithPrefix3 = bArr.length;
            System.arraycopy(bArr, 0, A0l, 0, sizeWithPrefix3);
        }
        byte[] A0l2 = this.A0n.A0l();
        int sizeWithPrefix4 = bArr.length;
        interfaceC1619lN.readFully(A0l2, sizeWithPrefix4, i);
        this.A0n.A0f(0);
        this.A0n.A0e(length);
    }

    private void A0G(InterfaceC1619lN interfaceC1619lN, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.A0k.A07());
        int pendingStrippedBytes = i + min;
        interfaceC1619lN.readFully(bArr, pendingStrippedBytes, i2 - min);
        if (min > 0) {
            this.A0k.A0k(bArr, i, min);
        }
    }

    private final void A0H(IC ic, int i, InterfaceC1619lN interfaceC1619lN, int i2) throws IOException {
        if (i == 4) {
            if (A06(1280, 5, 88).equals(ic.A0d)) {
                this.A0o.A0d(i2);
                interfaceC1619lN.readFully(this.A0o.A0l(), 0, i2);
                return;
            }
        }
        interfaceC1619lN.AJJ(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (A06(1023, 13, 32).equals(r15.A0d) != false) goto L15;
     */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0I(IC ic, long j, int i, int i2, int i3) {
        int i4 = i2;
        if (ic.A0c != null) {
            ic.A0c.A04(ic.A0b, j, i, i4, i3, ic.A0a);
        } else {
            if (!A06(PointerIconCompat.TYPE_NO_DROP, 11, 56).equals(ic.A0d)) {
                boolean equals = A06(1002, 10, 101).equals(ic.A0d);
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0u;
                strArr[2] = "WUIRLQPYspP06jV";
                strArr[4] = "IKED97K2catgdGs9C7";
                if (!equals) {
                }
            }
            int i5 = this.A03;
            String A06 = A06(869, 17, 79);
            if (i5 > 1) {
                AnonymousClass44.A07(A06, A06(1044, 40, 124));
            } else if (this.A0D == -9223372036854775807L) {
                AnonymousClass44.A07(A06, A06(1084, 42, 31));
            } else {
                A0K(ic.A0d, this.A0D, this.A0n.A0l());
                int A09 = this.A0n.A09();
                while (true) {
                    if (A09 >= this.A0n.A0A()) {
                        break;
                    }
                    if (this.A0n.A0l()[A09] == 0) {
                        this.A0n.A0e(A09);
                        break;
                    }
                    A09++;
                }
                ic.A0b.AI7(this.A0n, this.A0n.A0A());
                i4 += this.A0n.A0A();
            }
            if ((268435456 & i) != 0) {
                if (this.A03 > 1) {
                    C4J c4j = this.A0o;
                    String[] strArr2 = A0u;
                    if (strArr2[5].length() != strArr2[6].length()) {
                        String[] strArr3 = A0u;
                        strArr3[1] = "YYsRZc3YFjjR6whUDZFnD2lR7qwR3xQu";
                        strArr3[0] = "iPCTe70V3RVZDGWrxpNWfBz9u5oW1N1r";
                        c4j.A0d(0);
                    } else {
                        A0u[3] = "dzMIMRhm8kdQoNm85GuPxt1OFbbjzRAM";
                        c4j.A0d(0);
                    }
                } else {
                    int A0A = this.A0o.A0A();
                    ic.A0b.AI8(this.A0o, A0A, 2);
                    i4 += A0A;
                }
            }
            H1 h1 = ic.A0b;
            C0463Gz c0463Gz = ic.A0a;
            String[] strArr4 = A0u;
            if (strArr4[5].length() != strArr4[6].length()) {
                String[] strArr5 = A0u;
                strArr5[1] = "aEC8Q2NERZhQKbY6SRlQy9B7oXJI5nDv";
                strArr5[0] = "M5BYDTb0V4PW6b5ziiSZklpOYuXfea8a";
                h1.AIA(j, i, i4, i3, c0463Gz);
            } else {
                h1.AIA(j, i, i4, i3, c0463Gz);
            }
        }
        this.A0X = true;
    }

    private final void A0J(IC ic, InterfaceC1619lN interfaceC1619lN, int i) throws IOException {
        if (ic.A0n != 1685485123) {
            int i2 = ic.A0n;
            String[] strArr = A0u;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[2] = "z7J25JPdzWy80Kd";
            strArr2[4] = "xEqpvZ1X3IvVWW9v69";
            if (i2 != 1685480259) {
                interfaceC1619lN.AJJ(i);
                return;
            }
        }
        ic.A0k = new byte[i];
        interfaceC1619lN.readFully(ic.A0k, 0, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0K(String str, long j, byte[] bArr) {
        char c;
        String[] strArr;
        byte[] A0O;
        int i;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    c = 1;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        String[] strArr2 = A0u;
                        strArr2[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                        strArr2[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                        switch (c) {
                            case 0:
                                A0O = A0O(j, A06(75, 19, 63), 1000L);
                                i = 19;
                                break;
                            case 1:
                                A0O = A0O(j, A06(56, 19, 70), WorkRequest.MIN_BACKOFF_MILLIS);
                                i = 21;
                                break;
                            case 2:
                                A0O = A0O(j, A06(94, 19, 58), 1000L);
                                i = 25;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(A0O, 0, bArr, i, A0O.length);
                        return;
                    }
                    throw new RuntimeException();
                }
                c = 65535;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                }
                throw new RuntimeException();
            case 1045209816:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                    String[] strArr4 = A0u;
                    strArr4[5] = "hOu1CB2frr";
                    strArr4[6] = "vZrPTqET3LPV3435yPIFppSrF";
                    if (str.equals(A06(1023, 13, 32))) {
                        c = 2;
                        strArr = A0u;
                        if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        }
                    }
                    c = 65535;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    }
                }
                throw new RuntimeException();
            case 1422270023:
                if (str.equals(A06(PointerIconCompat.TYPE_NO_DROP, 11, 56))) {
                    c = 0;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    }
                    throw new RuntimeException();
                }
                c = 65535;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                }
                throw new RuntimeException();
            default:
                c = 65535;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                }
                throw new RuntimeException();
        }
    }

    private boolean A0L(C0457Gt c0457Gt, long j) {
        if (this.A0c) {
            this.A0L = j;
            c0457Gt.A00 = this.A0H;
            this.A0c = false;
            return true;
        }
        if (!this.A0e || this.A0L == -1) {
            return false;
        }
        c0457Gt.A00 = this.A0L;
        this.A0L = -1L;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x02fe, code lost:
    
        if (r3 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0300, code lost:
    
        r0 = 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0304, code lost:
    
        if (r3 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0126, code lost:
    
        if (r8.equals(A06(221, 16, 31)) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
    
        r0 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0140, code lost:
    
        if (r8.equals(A06(221, 16, 31)) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b7, code lost:
    
        if (r3 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b9, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c8, code lost:
    
        if (r3 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x032d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0M(String str) {
        char c;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A06(1178, 14, 32))) {
                    c = 6;
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case ' ':
                            return true;
                        default:
                            return false;
                    }
                }
                break;
            case -2095575984:
                if (str.equals(A06(1222, 14, 102))) {
                    c = 4;
                    switch (c) {
                    }
                }
                break;
            case -1985379776:
                boolean equals = str.equals(A06(207, 8, 108));
                if (A0u[7].length() != 16) {
                    A0u[3] = "TzGfoRLFuVo7UwCT9UC1nsicdZWWDAlG";
                    break;
                }
                switch (c) {
                }
            case -1784763192:
                if (str.equals(A06(263, 8, 57))) {
                    c = 18;
                    switch (c) {
                    }
                }
                break;
            case -1730367663:
                if (str.equals(A06(271, 8, 117))) {
                    c = '\f';
                    switch (c) {
                    }
                }
                break;
            case -1482641358:
                if (str.equals(A06(Opcodes.ANEWARRAY, 9, 108))) {
                    c = 14;
                    switch (c) {
                    }
                }
                break;
            case -1482641357:
                if (str.equals(A06(Opcodes.IFNULL, 9, 79))) {
                    c = 15;
                    switch (c) {
                    }
                }
                break;
            case -1373388978:
                if (str.equals(A06(1252, 15, 22))) {
                    c = '\t';
                    switch (c) {
                    }
                }
                break;
            case -933872740:
                if (str.equals(A06(984, 8, 98))) {
                    c = ' ';
                    switch (c) {
                    }
                }
                break;
            case -538363189:
                if (str.equals(A06(1192, 15, 60))) {
                    c = 5;
                    switch (c) {
                    }
                }
                break;
            case -538363109:
                if (str.equals(A06(1207, 15, 14))) {
                    c = 7;
                    switch (c) {
                    }
                }
                break;
            case -425012669:
                if (str.equals(A06(1036, 8, 30))) {
                    c = 30;
                    switch (c) {
                    }
                }
                break;
            case -356037306:
                if (str.equals(A06(Opcodes.IF_ICMPGT, 14, 29))) {
                    c = 21;
                    switch (c) {
                    }
                }
                break;
            case 62923557:
                if (str.equals(A06(Opcodes.I2D, 5, 19))) {
                    c = '\r';
                    switch (c) {
                    }
                }
                break;
            case 62923603:
                if (str.equals(A06(Opcodes.F2L, 5, 90))) {
                    c = 16;
                    switch (c) {
                    }
                }
                break;
            case 62927045:
                if (str.equals(A06(Opcodes.I2B, 5, 119))) {
                    c = 19;
                    switch (c) {
                    }
                }
                break;
            case 82318131:
                if (str.equals(A06(1166, 5, 119))) {
                    c = 2;
                    switch (c) {
                    }
                }
                break;
            case 82338133:
                boolean equals2 = str.equals(A06(1275, 5, 72));
                if (A0u[7].length() == 16) {
                    String[] strArr = A0u;
                    strArr[1] = "SKDMUFdFJPMXubKSzq5KjaXHZATq3OUF";
                    strArr[0] = "Ghj8mYRv51e2wMnC9FEKaN4eHBhVqIAQ";
                    break;
                } else {
                    String[] strArr2 = A0u;
                    strArr2[5] = "F8wfBLRr4t";
                    strArr2[6] = "m6KkyOOVg8X0ndZUQG2mgE6hH";
                    break;
                }
                switch (c) {
                }
            case 82338134:
                if (str.equals(A06(1280, 5, 88))) {
                    c = 1;
                    switch (c) {
                    }
                }
                break;
            case 99146302:
                if (str.equals(A06(992, 10, 54))) {
                    c = 31;
                    switch (c) {
                    }
                }
                break;
            case 444813526:
                if (str.equals(A06(1267, 8, 31))) {
                    c = '\n';
                    switch (c) {
                    }
                }
                break;
            case 542569478:
                if (str.equals(A06(Opcodes.FCMPG, 13, 119))) {
                    c = 20;
                    switch (c) {
                    }
                }
                break;
            case 635596514:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) == strArr3[0].charAt(1)) {
                    String[] strArr4 = A0u;
                    strArr4[5] = "W6YXr1xbPB";
                    strArr4[6] = "Gbq52SJwNi9qAu2AjciLJePWO";
                    break;
                } else {
                    A0u[3] = "7MRDpRiWazQnh7KPJAJl4vRwzLx1BKGb";
                    break;
                }
                switch (c) {
                }
            case 725948237:
                boolean equals3 = str.equals(A06(237, 13, 31));
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                A0u[7] = "zUYiT8JvqtzTusXd0wwrN";
                if (equals3) {
                    c = 25;
                    switch (c) {
                    }
                }
                break;
            case 725957860:
                if (str.equals(A06(250, 13, 65))) {
                    c = 24;
                    switch (c) {
                    }
                }
                break;
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    c = 28;
                    switch (c) {
                    }
                }
                break;
            case 855502857:
                if (str.equals(A06(1236, 16, 47))) {
                    c = '\b';
                    switch (c) {
                    }
                }
                break;
            case 1045209816:
                String[] strArr5 = A0u;
                if (strArr5[2].length() == strArr5[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A0u;
                strArr6[1] = "l6rfMqL6uO4vJf2wQ9BlcS80aS9RAxdU";
                strArr6[0] = "kDo3bZmmggKJDtMwpBeZtATIDXYPDXog";
                if (str.equals(A06(1023, 13, 32))) {
                    c = 29;
                    switch (c) {
                    }
                }
                break;
            case 1422270023:
                if (str.equals(A06(PointerIconCompat.TYPE_NO_DROP, 11, 56))) {
                    c = 27;
                    switch (c) {
                    }
                }
                break;
            case 1809237540:
                if (str.equals(A06(1171, 7, 100))) {
                    c = 3;
                    switch (c) {
                    }
                }
                break;
            case 1950749482:
                if (str.equals(A06(Opcodes.RETURN, 6, 53))) {
                    c = 17;
                    switch (c) {
                    }
                }
                break;
            case 1950789798:
                if (str.equals(A06(Opcodes.INVOKESPECIAL, 6, 35))) {
                    c = 22;
                    switch (c) {
                    }
                }
                break;
            case 1951062397:
                if (str.equals(A06(215, 6, 82))) {
                    c = 11;
                    switch (c) {
                    }
                }
                break;
        }
        c = 65535;
        switch (c) {
        }
    }

    public static byte[] A0O(long j, String str, long j2) {
        C3M.A07(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        int minutes = (int) ((j4 - (i3 * 1000000)) / j2);
        return AbstractC01424a.A1G(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(minutes)));
    }

    public static int[] A0P(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public static /* synthetic */ GX[] A0Q() {
        return new GX[]{new MatroskaExtractor()};
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "Adding support for AR/VR TAGs")
    public final int A0R(int i) {
        switch (i) {
            case Opcodes.LXOR /* 131 */:
            case Opcodes.L2I /* 136 */:
            case 155:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.PUTSTATIC /* 179 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case Opcodes.I2F /* 134 */:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.NEW /* 187 */:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 26568:
            case 28032:
            case 29555:
            case 30113:
            case 30320:
            case 290298740:
            case 307544935:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ACMPEQ /* 165 */:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                String[] strArr = A0u;
                if (strArr[2].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0u;
                strArr2[1] = "HyhNlEIHHjvGo8KvAMWihGCcOuKz7U7o";
                strArr2[0] = "rV4cPIzb4RrvL4U1RF1zVSCUyrwoic3K";
                return 4;
            case Opcodes.PUTFIELD /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            case 17543:
            case 17827:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r5 != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d5, code lost:
    
        if (r14.A0K == (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        if (r14.A0C != 475249515) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        r14.A0H = r14.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01eb, code lost:
    
        throw com.instagram.common.viewpoint.core.C00982i.A01(A06(819, 50, 121), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
    
        if (r5 != (-1)) goto L36;
     */
    /* JADX WARN: Incorrect condition in loop: B:81:0x017e */
    /* JADX WARN: Incorrect condition in loop: B:86:0x018b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0S(int i) throws C00982i {
        A09();
        switch (i) {
            case Opcodes.IF_ICMPNE /* 160 */:
                if (this.A05 == 2) {
                    IC ic = this.A0P.get(this.A06);
                    ic.A06();
                    if (this.A0E > 0 && A06(215, 6, 82).equals(ic.A0d)) {
                        this.A0o.A0i(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0E).array());
                    }
                    int sampleFlags = 0;
                    if (A0u[7].length() != 16) {
                        String[] strArr = A0u;
                        strArr[5] = "BDPY36VwNm";
                        strArr[6] = "7hC1KMOm7DpnqonjeX0jtoaYt";
                        for (int sampleOffset = 0; sampleOffset < i; sampleOffset++) {
                            int i2 = this.A0f[sampleOffset];
                            sampleFlags += i2;
                        }
                        for (int i3 = 0; i3 < sampleOffset; i3++) {
                            long j = this.A0F;
                            int sampleOffset2 = ic.A0I;
                            long j2 = j + ((sampleOffset2 * i3) / 1000);
                            int i4 = this.A02;
                            if (i3 == 0 && !this.A0W) {
                                i4 |= 1;
                            }
                            int i5 = this.A0f[i3];
                            sampleFlags -= i5;
                            A0I(ic, j2, i4, i5, sampleFlags);
                        }
                        this.A05 = 0;
                        return;
                    }
                    throw new RuntimeException();
                }
                return;
            case Opcodes.FRETURN /* 174 */:
                IC ic2 = (IC) C3M.A02(this.A0T);
                if (ic2.A0d != null) {
                    if (A0M(ic2.A0d)) {
                        ic2.A0G(this.A0S, ic2.A0R);
                        this.A0P.put(ic2.A0R, ic2);
                    }
                    this.A0T = null;
                    return;
                }
                throw C00982i.A01(A06(333, 40, 74), null);
            case 19899:
                int i6 = this.A0C;
                String[] strArr2 = A0u;
                if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                    A0u[7] = "tg6sq0stTi0cIlF7Upi0qsQ5QklGxJF";
                    break;
                } else {
                    String[] strArr3 = A0u;
                    strArr3[2] = "yLIpCO5kJmqKflO";
                    strArr3[4] = "mFIbnXIm9TTTynra4E";
                    break;
                }
            case 25152:
                A0D(i);
                if (!this.A0T.A0i) {
                    return;
                }
                if (this.A0T.A0a != null) {
                    this.A0T.A0Z = new DrmInitData(new DrmInitData.SchemeData(AbstractC00881w.A03, A06(1365, 10, 66), this.A0T.A0a.A03));
                    return;
                }
                throw C00982i.A01(A06(639, 55, 62), null);
            case 28032:
                A0D(i);
                if (!this.A0T.A0i || this.A0T.A0m == null) {
                    return;
                } else {
                    throw C00982i.A01(A06(373, 53, 58), null);
                }
            case 357149030:
                long j3 = this.A0O;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "WZACEI803UG8FVl";
                if (j3 == -9223372036854775807L) {
                    this.A0O = 1000000L;
                }
                if (this.A0I != -9223372036854775807L) {
                    this.A0J = A03(this.A0I);
                    return;
                }
                return;
            case 374648427:
                if (this.A0P.size() != 0) {
                    this.A0S.A6G();
                    return;
                }
                throw C00982i.A01(A06(925, 26, 98), null);
            case 475249515:
                if (!this.A0e) {
                    this.A0S.AIN(A04(this.A0R, this.A0Q));
                    this.A0e = true;
                }
                this.A0R = null;
                this.A0Q = null;
                return;
            default:
                return;
        }
    }

    public final void A0T(int i, double d) throws C00982i {
        switch (i) {
            case Opcodes.PUTFIELD /* 181 */:
                IC A05 = A05(i);
                int i2 = (int) d;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "mnSBpt4UIloiGRhCy1GZQUK3TYQANP";
                A05.A0T = i2;
                return;
            case 17545:
                this.A0I = (long) d;
                return;
            case 21969:
                A05(i).A06 = (float) d;
                return;
            case 21970:
                IC A052 = A05(i);
                if (A0u[7].length() != 16) {
                    A0u[7] = "bgRhYiIqKVlSmtLlUnVbMuj";
                    A052.A07 = (float) d;
                    return;
                } else {
                    A052.A07 = (float) d;
                    return;
                }
            case 21971:
                A05(i).A04 = (float) d;
                return;
            case 21972:
                A05(i).A05 = (float) d;
                return;
            case 21973:
                A05(i).A02 = (float) d;
                return;
            case 21974:
                A05(i).A03 = (float) d;
                return;
            case 21975:
                A05(i).A0B = (float) d;
                return;
            case 21976:
                IC A053 = A05(i);
                float f = (float) d;
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    A0u[7] = "0K";
                    A053.A0C = f;
                    return;
                }
                throw new RuntimeException();
            case 21977:
                A05(i).A00 = (float) d;
                return;
            case 21978:
                A05(i).A01 = (float) d;
                return;
            case 30323:
                A05(i).A0A = (float) d;
                return;
            case 30324:
                A05(i).A08 = (float) d;
                return;
            case 30325:
                A05(i).A09 = (float) d;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01bc, code lost:
    
        if ((r4[2] & 128) == 128) goto L41;
     */
    /* JADX WARN: Incorrect condition in loop: B:140:0x01d2 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033a A[LOOP:4: B:103:0x0338->B:104:0x033a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0265 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0U(int i, int i2, InterfaceC1619lN interfaceC1619lN) throws IOException {
        int i3;
        int charAt;
        int totalSamplesSize;
        int timecode;
        int totalSamplesSize2 = 0;
        int i4 = 1;
        switch (i) {
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGT /* 163 */:
                if (this.A05 == 0) {
                    this.A06 = (int) this.A0r.A05(interfaceC1619lN, false, true, 8);
                    this.A07 = this.A0r.A04();
                    String[] strArr = A0u;
                    if (strArr[5].length() == strArr[6].length()) {
                        this.A0D = -9223372036854775807L;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    } else {
                        String[] strArr2 = A0u;
                        strArr2[1] = "LCHoyUIFh4JbWXc3a57uog3rKRFOb5wV";
                        strArr2[0] = "47gJribS0awN4nsHBZkjm7XOEmPrRfLr";
                        this.A0D = -9223372036854775807L;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    }
                }
                IC ic = this.A0P.get(this.A06);
                if (ic != null) {
                    ic.A06();
                    if (this.A05 == 1) {
                        A0E(interfaceC1619lN, 3);
                        int byteValue = (this.A0l.A0l()[2] & 6) >> 1;
                        int i5 = 255;
                        if (byteValue != 0) {
                            A0E(interfaceC1619lN, 4);
                            int timecode2 = this.A0l.A0l()[3];
                            this.A03 = (timecode2 & 255) + 1;
                            int[] iArr = this.A0f;
                            int timecode3 = this.A03;
                            this.A0f = A0P(iArr, timecode3);
                            if (byteValue == 2) {
                                int timecode4 = this.A07;
                                int i6 = (i2 - timecode4) - 4;
                                int timecode5 = this.A03;
                                int i7 = i6 / timecode5;
                                int[] iArr2 = this.A0f;
                                int blockLacingSampleSize = this.A03;
                                Arrays.fill(iArr2, 0, blockLacingSampleSize, i7);
                            } else if (byteValue != 1) {
                                if (byteValue == 3) {
                                    int i8 = 0;
                                    int sampleIndex = 4;
                                    int i9 = 0;
                                    while (i9 < this.A03 - i4) {
                                        this.A0f[i9] = totalSamplesSize2;
                                        sampleIndex++;
                                        A0E(interfaceC1619lN, sampleIndex);
                                        C4J c4j = this.A0l;
                                        if (A0u[7].length() == 16) {
                                            break;
                                        } else {
                                            A0u[7] = "lQQ4f1MYxOwR1g4uON0whOI";
                                            if (c4j.A0l()[sampleIndex - 1] != 0) {
                                                long j = 0;
                                                int i10 = 0;
                                                while (i10 < 8) {
                                                    int i11 = i4 << (7 - i10);
                                                    C4J c4j2 = this.A0l;
                                                    String[] strArr3 = A0u;
                                                    String str = strArr3[1];
                                                    String str2 = strArr3[0];
                                                    int charAt2 = str.charAt(1);
                                                    int lengthMask = str2.charAt(1);
                                                    if (charAt2 != lengthMask) {
                                                        A0u[3] = "6gmtIRdzQjg9uolj5CgbNQmEFE2eXosQ";
                                                        if ((c4j2.A0l()[sampleIndex - 1] & i11) != 0) {
                                                            int totalSamplesSize3 = sampleIndex - 1;
                                                            sampleIndex += i10;
                                                            A0E(interfaceC1619lN, sampleIndex);
                                                            i3 = totalSamplesSize3 + 1;
                                                            int totalSamplesSize4 = this.A0l.A0l()[totalSamplesSize3] & i5;
                                                            int lengthMask2 = ~i11;
                                                            j = totalSamplesSize4 & lengthMask2;
                                                            while (i3 < sampleIndex) {
                                                                int readPosition = i3 + 1;
                                                                j = (j << 8) | (this.A0l.A0l()[i3] & i5);
                                                                i3 = readPosition;
                                                            }
                                                            if (i9 > 0) {
                                                                j -= (1 << ((i10 * 7) + 6)) - 1;
                                                            }
                                                        } else {
                                                            i10++;
                                                            i4 = 1;
                                                        }
                                                    } else if ((c4j2.A0l()[sampleIndex - 1] & i11) != 0) {
                                                        int totalSamplesSize32 = sampleIndex - 1;
                                                        sampleIndex += i10;
                                                        A0E(interfaceC1619lN, sampleIndex);
                                                        i3 = totalSamplesSize32 + 1;
                                                        int totalSamplesSize42 = this.A0l.A0l()[totalSamplesSize32] & i5;
                                                        int lengthMask22 = ~i11;
                                                        j = totalSamplesSize42 & lengthMask22;
                                                        while (i3 < sampleIndex) {
                                                        }
                                                        if (i9 > 0) {
                                                        }
                                                    } else {
                                                        i10++;
                                                        i4 = 1;
                                                    }
                                                    if (j < -2147483648L && j <= 2147483647L) {
                                                        int i12 = (int) j;
                                                        int[] iArr3 = this.A0f;
                                                        if (i9 != 0) {
                                                            i12 += this.A0f[i9 - 1];
                                                        }
                                                        iArr3[i9] = i12;
                                                        i8 += this.A0f[i9];
                                                        i9++;
                                                        i5 = 255;
                                                        totalSamplesSize2 = 0;
                                                        i4 = 1;
                                                    } else {
                                                        throw C00982i.A01(A06(578, 37, 14), null);
                                                    }
                                                }
                                                if (j < -2147483648L) {
                                                }
                                                throw C00982i.A01(A06(578, 37, 14), null);
                                            }
                                            throw C00982i.A01(A06(951, 33, 25), null);
                                        }
                                    }
                                    this.A0f[this.A03 - 1] = ((i2 - this.A07) - sampleIndex) - i8;
                                } else {
                                    throw C00982i.A01(A06(1141, 25, 80) + byteValue, null);
                                }
                            } else {
                                int i13 = 0;
                                int i14 = 4;
                                int i15 = 0;
                                while (true) {
                                    int i16 = this.A03;
                                    if (A0u[3].charAt(5) != 'R') {
                                        if (i15 >= i16 - 1) {
                                        }
                                        this.A0f[i15] = 0;
                                        while (true) {
                                            i14++;
                                            A0E(interfaceC1619lN, i14);
                                            byte[] A0l = this.A0l.A0l();
                                            String[] strArr4 = A0u;
                                            String str3 = strArr4[1];
                                            String str4 = strArr4[0];
                                            charAt = str3.charAt(1);
                                            totalSamplesSize = str4.charAt(1);
                                            if (charAt == totalSamplesSize) {
                                                String[] strArr5 = A0u;
                                                strArr5[1] = "QqySTVYSyUdR3w6zpaSbgPrcegDpRTeR";
                                                strArr5[0] = "gT3bwZtYi7wT97ycLVgitbKLuY9aoVNS";
                                                int totalSamplesSize5 = i14 - 1;
                                                int i17 = A0l[totalSamplesSize5] & 255;
                                                int[] iArr4 = this.A0f;
                                                int totalSamplesSize6 = iArr4[i15];
                                                iArr4[i15] = totalSamplesSize6 + i17;
                                                if (i17 != 255) {
                                                    break;
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize7 = i14 - 1;
                                                int i18 = A0l[totalSamplesSize7] & 255;
                                                int[] iArr5 = this.A0f;
                                                int totalSamplesSize8 = iArr5[i15];
                                                iArr5[i15] = totalSamplesSize8 + i18;
                                                if (i18 != 255) {
                                                    break;
                                                }
                                            }
                                        }
                                        int totalSamplesSize9 = this.A0f[i15];
                                        i13 += totalSamplesSize9;
                                        i15++;
                                    } else {
                                        String[] strArr6 = A0u;
                                        strArr6[1] = "uG7prxZBXLM0QG5e8GSw94nYMCP7upCE";
                                        strArr6[0] = "tV31aGArCsXy4K1N5Jjs7nQ9FZDzw28J";
                                        if (i15 >= i16 - 1) {
                                        }
                                        this.A0f[i15] = 0;
                                        while (true) {
                                            i14++;
                                            A0E(interfaceC1619lN, i14);
                                            byte[] A0l2 = this.A0l.A0l();
                                            String[] strArr42 = A0u;
                                            String str32 = strArr42[1];
                                            String str42 = strArr42[0];
                                            charAt = str32.charAt(1);
                                            totalSamplesSize = str42.charAt(1);
                                            if (charAt == totalSamplesSize) {
                                            }
                                        }
                                        int totalSamplesSize92 = this.A0f[i15];
                                        i13 += totalSamplesSize92;
                                        i15++;
                                    }
                                }
                                int[] iArr6 = this.A0f;
                                int i19 = this.A03 - 1;
                                int totalSamplesSize10 = this.A07;
                                iArr6[i19] = ((i2 - totalSamplesSize10) - i14) - i13;
                            }
                        } else {
                            this.A03 = 1;
                            this.A0f = A0P(this.A0f, 1);
                            this.A0f[0] = (i2 - this.A07) - 3;
                        }
                        int lacing = this.A0l.A0l()[0];
                        this.A0F = this.A0G + A03((lacing << 8) | (this.A0l.A0l()[1] & 255));
                        int timecode6 = ic.A0V;
                        if (timecode6 != 2) {
                            if (i == 163) {
                                byte[] A0l3 = this.A0l.A0l();
                                String[] strArr7 = A0u;
                                String str5 = strArr7[1];
                                String str6 = strArr7[0];
                                int charAt3 = str5.charAt(1);
                                int timecode7 = str6.charAt(1);
                                if (charAt3 == timecode7) {
                                    throw new RuntimeException();
                                }
                                String[] strArr8 = A0u;
                                strArr8[1] = "Vc6YaXBr4sE6Z9Kledba3u83scjXoejR";
                                strArr8[0] = "GPxnjQ5uiYxzVhoi9JJVxDxAifN9s8px";
                                break;
                            }
                            timecode = 0;
                            int timecode8 = timecode == 0 ? 1 : 0;
                            this.A02 = timecode8;
                            this.A05 = 2;
                            this.A04 = 0;
                        }
                        timecode = 1;
                        if (timecode == 0) {
                        }
                        this.A02 = timecode8;
                        this.A05 = 2;
                        this.A04 = 0;
                    }
                    if (i == 163) {
                        while (r1 < timecode) {
                            int[] iArr7 = this.A0f;
                            int timecode9 = this.A04;
                            int A02 = A02(interfaceC1619lN, ic, iArr7[timecode9], false);
                            ic = ic;
                            A0I(ic, this.A0F + ((this.A04 * ic.A0I) / 1000), this.A02, A02, 0);
                            this.A04++;
                        }
                        this.A05 = 0;
                        return;
                    }
                    while (this.A04 < this.A03) {
                        this.A0f[this.A04] = A02(interfaceC1619lN, ic, this.A0f[this.A04], true);
                        this.A04++;
                    }
                    return;
                }
                interfaceC1619lN.AJJ(i2 - this.A07);
                this.A05 = 0;
                return;
            case Opcodes.IF_ACMPEQ /* 165 */:
                if (this.A05 != 2) {
                    return;
                }
                A0H(this.A0P.get(this.A06), this.A01, interfaceC1619lN, i2);
                return;
            case 16877:
                A0J(A05(i), interfaceC1619lN, i2);
                return;
            case 16981:
                A0D(i);
                this.A0T.A0m = new byte[i2];
                interfaceC1619lN.readFully(this.A0T.A0m, 0, i2);
                return;
            case 18402:
                byte[] bArr = new byte[i2];
                interfaceC1619lN.readFully(bArr, 0, i2);
                A05(i).A0a = new C0463Gz(1, bArr, 0, 0);
                return;
            case 21419:
                Arrays.fill(this.A0m.A0l(), (byte) 0);
                interfaceC1619lN.readFully(this.A0m.A0l(), 4 - i2, i2);
                this.A0m.A0f(0);
                this.A0C = (int) this.A0m.A0Q();
                return;
            case 25506:
                A0D(i);
                String[] strArr9 = A0u;
                if (strArr9[1].charAt(1) != strArr9[0].charAt(1)) {
                    A0u[3] = "vSk1rRCvXwYs114cFInjW7yvt4gWKzzv";
                    this.A0T.A0j = new byte[i2];
                    interfaceC1619lN.readFully(this.A0T.A0j, 0, i2);
                    return;
                }
                break;
            case 30322:
                A0D(i);
                this.A0T.A0l = new byte[i2];
                interfaceC1619lN.readFully(this.A0T.A0l, 0, i2);
                return;
            default:
                throw C00982i.A01(A06(1126, 15, 8) + i, null);
        }
        throw new RuntimeException();
    }

    public final void A0V(int i, long j) throws C00982i {
        String A06 = A06(42, 14, 63);
        switch (i) {
            case Opcodes.LXOR /* 131 */:
                A05(i).A0V = (int) j;
                return;
            case Opcodes.L2I /* 136 */:
                A05(i).A0f = j == 1;
                return;
            case 155:
                this.A0D = A03(j);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                A05(i).A0E = (int) j;
                return;
            case Opcodes.ARETURN /* 176 */:
                A05(i).A0W = (int) j;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                A0C(i);
                this.A0R.A04(A03(j));
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                A05(i).A0M = (int) j;
                return;
            case 215:
                A05(i).A0R = (int) j;
                return;
            case 231:
                this.A0G = A03(j);
                return;
            case 238:
                this.A01 = (int) j;
                return;
            case 241:
                if (this.A0d) {
                    return;
                }
                A0C(i);
                this.A0Q.A04(j);
                this.A0d = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16871:
                A05(i).A0n = (int) j;
                return;
            case 16980:
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "siSTSWWHFDsKrirn3iU8fidRJrb4DuSX";
                    strArr2[0] = "o7Su23MSMUKyfq0AiKXYGeUTl03UpruG";
                    if (j == 3) {
                        return;
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[5] = "wDyyIq2mnN";
                    strArr3[6] = "u9jmr3hENDVfo4ybwkpsevoxR";
                    if (j == 3) {
                        return;
                    }
                }
                throw C00982i.A01(A06(426, 16, 25) + j + A06, null);
            case 17029:
                if (j >= 1 && j <= 2) {
                    return;
                } else {
                    throw C00982i.A01(A06(559, 19, 27) + j + A06, null);
                }
            case 17143:
                if (j == 1) {
                    return;
                } else {
                    throw C00982i.A01(A06(615, 16, 122) + j + A06, null);
                }
            case 18401:
                if (j == 5) {
                    return;
                } else {
                    throw C00982i.A01(A06(442, 15, 36) + j + A06, null);
                }
            case 18408:
                if (j == 1) {
                    return;
                } else {
                    throw C00982i.A01(A06(113, 22, 77) + j + A06, null);
                }
            case 20529:
                if (j == 0) {
                    return;
                } else {
                    throw C00982i.A01(A06(457, 21, 29) + j + A06, null);
                }
            case 20530:
                if (j == 1) {
                    return;
                } else {
                    throw C00982i.A01(A06(478, 21, 16) + j + A06, null);
                }
            case 21420:
                this.A0K = this.A0M + j;
                return;
            case 21432:
                int i2 = (int) j;
                A0D(i);
                switch (i2) {
                    case 0:
                        this.A0T.A0U = 0;
                        return;
                    case 1:
                        this.A0T.A0U = 2;
                        return;
                    case 3:
                        this.A0T.A0U = 1;
                        return;
                    case 15:
                        this.A0T.A0U = 3;
                        return;
                    default:
                        return;
                }
            case 21680:
                A05(i).A0L = (int) j;
                return;
            case 21682:
                A05(i).A0K = (int) j;
                return;
            case 21690:
                A05(i).A0J = (int) j;
                return;
            case 21930:
                A05(i).A0g = j == 1;
                return;
            case 21945:
                A0D(i);
                switch ((int) j) {
                    case 1:
                        IC ic = this.A0T;
                        if (A0u[7].length() != 16) {
                            String[] strArr4 = A0u;
                            strArr4[1] = "46IydxS7gy6otlVQjCqCZWblmnAwVrZG";
                            strArr4[0] = "ABdhU4etfaEDzGqzhVxfZNO7CdkZTY0J";
                            ic.A0F = 2;
                            return;
                        }
                        ic.A0F = 2;
                        return;
                    case 2:
                        this.A0T.A0F = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                A0D(i);
                int A01 = ColorInfo.A01((int) j);
                if (A01 == -1) {
                    return;
                }
                this.A0T.A0H = A01;
                return;
            case 21947:
                A0D(i);
                this.A0T.A0h = true;
                int A00 = ColorInfo.A00((int) j);
                if (A00 == -1) {
                    return;
                }
                this.A0T.A0G = A00;
                return;
            case 21948:
                A05(i).A0O = (int) j;
                return;
            case 21949:
                A05(i).A0P = (int) j;
                return;
            case 21998:
                A05(i).A0N = (int) j;
                return;
            case 22186:
                A05(i).A0X = j;
                return;
            case 22203:
                A05(i).A0Y = j;
                return;
            case 25188:
                A05(i).A0D = (int) j;
                return;
            case 30114:
                this.A0E = j;
                return;
            case 30321:
                A0D(i);
                switch ((int) j) {
                    case 0:
                        this.A0T.A0S = 0;
                        return;
                    case 1:
                        this.A0T.A0S = 1;
                        return;
                    case 2:
                        this.A0T.A0S = 2;
                        return;
                    case 3:
                        this.A0T.A0S = 3;
                        return;
                    default:
                        return;
                }
            case 2352003:
                IC A05 = A05(i);
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[3] = "17DkRR24xbcR08jR5ve3iaIolPHvV07P";
                A05.A0I = (int) j;
                return;
            case 2807729:
                this.A0O = j;
                return;
            default:
                return;
        }
    }

    public final void A0W(int i, long j, long j2) throws C00982i {
        A09();
        switch (i) {
            case Opcodes.IF_ICMPNE /* 160 */:
                this.A0W = false;
                this.A0E = 0L;
                return;
            case Opcodes.FRETURN /* 174 */:
                this.A0T = new IC();
                return;
            case Opcodes.NEW /* 187 */:
                this.A0d = false;
                return;
            case 19899:
                this.A0C = -1;
                this.A0K = -1L;
                return;
            case 20533:
                A05(i).A0i = true;
                return;
            case 21968:
                A05(i).A0h = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                if (this.A0M == -1 || this.A0M == j) {
                    this.A0M = j;
                    this.A0N = j2;
                    return;
                }
                throw C00982i.A01(A06(886, 39, 119), null);
            case 475249515:
                this.A0R = new AnonymousClass45();
                this.A0Q = new AnonymousClass45();
                return;
            case 524531317:
                if (this.A0e) {
                    return;
                }
                if (this.A0s && this.A0H != -1) {
                    this.A0c = true;
                    return;
                } else {
                    this.A0S.AIN(new C1614lI(this.A0J));
                    this.A0e = true;
                    return;
                }
        }
    }

    @MetaExoPlayerCustomization("Adding support for AR/VR TAGs")
    public final void A0X(int i, String str) throws C00982i {
        switch (i) {
            case Opcodes.I2F /* 134 */:
                A05(i).A0d = str;
                return;
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
                if (!A06(1375, 4, 110).equals(str) && !A06(1357, 8, 67).equals(str)) {
                    throw C00982i.A01(A06(551, 8, 69) + str + A06(42, 14, 63), null);
                }
                return;
            case 17827:
                this.A0U = str;
                return;
            case 21358:
                IC A05 = A05(i);
                if (A0u[7].length() != 16) {
                    String[] strArr = A0u;
                    strArr[1] = "fMu5gmFUMMjyE5zZcj2yfEtnORci9Tka";
                    strArr[0] = "H9jO6y53WPcXDhmRgvdqczqosoX1IojD";
                    A05.A0e = str;
                    return;
                }
                throw new RuntimeException();
            case 2274716:
                A05(i).A0o = str;
                return;
            default:
                return;
        }
    }

    public final boolean A0Y(int i) {
        if (i != 357149030 && i != 524531317) {
            String[] strArr = A0u;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[5] = "AFdTkHzIX2";
            strArr2[6] = "QjCHXWDM6RodCI1HM4Zn3pBBf";
            if (i != 475249515 && i != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AA4(GY gy) {
        this.A0S = gy;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x0027 */
    @Override // com.instagram.common.viewpoint.core.GX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AGb(InterfaceC1619lN interfaceC1619lN, C0457Gt c0457Gt) throws IOException {
        this.A0X = false;
        boolean z = true;
        while (z && !this.A0X) {
            z = this.A0q.AGe(interfaceC1619lN);
            if (z && A0L(c0457Gt, interfaceC1619lN.A8f())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < i; i++) {
            IC valueAt = this.A0P.valueAt(i);
            valueAt.A06();
            valueAt.A0E();
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final void AGr() {
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x001e */
    @Override // com.instagram.common.viewpoint.core.GX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AIM(long j, long j2) {
        this.A0G = -9223372036854775807L;
        this.A05 = 0;
        this.A0q.reset();
        this.A0r.A06();
        A0A();
        for (int i = 0; i < i; i++) {
            this.A0P.valueAt(i).A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.GX
    public final boolean AJL(InterfaceC1619lN interfaceC1619lN) throws IOException {
        return new ID().A01(interfaceC1619lN);
    }
}
