package com.facebook.ads.androidx.media3.extractor.mkv;

import android.net.Uri;
import android.util.SparseArray;
import com.anythink.basead.exoplayer.b;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.foundation.g.a;
import com.facebook.ads.AdError;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.instagram.common.viewpoint.core.AbstractC06233y;
import com.instagram.common.viewpoint.core.AbstractC06314g;
import com.instagram.common.viewpoint.core.C06324h;
import com.instagram.common.viewpoint.core.C06464v;
import com.instagram.common.viewpoint.core.C0944Hb;
import com.instagram.common.viewpoint.core.C0983Io;
import com.instagram.common.viewpoint.core.C0984Ip;
import com.instagram.common.viewpoint.core.C0985Iq;
import com.instagram.common.viewpoint.core.C2167mK;
import com.instagram.common.viewpoint.core.C2169mM;
import com.instagram.common.viewpoint.core.C2185mn;
import com.instagram.common.viewpoint.core.C2195my;
import com.instagram.common.viewpoint.core.C2Y;
import com.instagram.common.viewpoint.core.C3K;
import com.instagram.common.viewpoint.core.C5C;
import com.instagram.common.viewpoint.core.H9;
import com.instagram.common.viewpoint.core.HA;
import com.instagram.common.viewpoint.core.HD;
import com.instagram.common.viewpoint.core.HS;
import com.instagram.common.viewpoint.core.HV;
import com.instagram.common.viewpoint.core.HY;
import com.instagram.common.viewpoint.core.InterfaceC0946Hd;
import com.instagram.common.viewpoint.core.InterfaceC0980Il;
import com.instagram.common.viewpoint.core.InterfaceC2190ms;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: assets/audience_network/classes2.dex */
public final class MatroskaExtractor implements H9 {
    public static byte[] A0t;
    public static String[] A0u = {"tBqjpPNwSsfRjGbhoSofYeEQJAfxpzeJ", "SQ32k5yHiSqu0tF5bV2mYZI8q27OK2Wk", "Ew8EcvFtYPYsbuW", "MeCkyRYcfoGShRSoQHq7qyLBTkTGcoSQ", "UyV8GtaWyEclMV8OhG", "yLkQb0Xo1O", "PFhexnCJ0GZtqtRWjlJ7uY4w9", "UodjFtXG6f6h7NmMQ857"};
    public static final HD A0v;
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
    public SparseArray<C0983Io> A0P;
    public C06324h A0Q;
    public C06324h A0R;
    public HA A0S;
    public C0983Io A0T;

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
    public final C06464v A0g;
    public final C06464v A0h;
    public final C06464v A0i;
    public final C06464v A0j;
    public final C06464v A0k;
    public final C06464v A0l;
    public final C06464v A0m;
    public final C06464v A0n;
    public final C06464v A0o;
    public final C06464v A0p;
    public final InterfaceC0980Il A0q;
    public final C0985Iq A0r;
    public final boolean A0s;

    /* JADX WARN: Code restructure failed: missing block: B:111:0x03fd, code lost:
    
        if (r5.equals(r6) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03ff, code lost:
    
        r12.A0p.A0f(0);
        r3.AIr(r12.A0p, 4);
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
        r3.AIs(r12.A0l, 1, 1);
        r12.A09++;
        r12.A0g.A0f(0);
        r3.AIs(r12.A0g, 8, 1);
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
    private int A02(InterfaceC2190ms interfaceC2190ms, C0983Io c0983Io, int i, boolean z8) throws IOException {
        String[] strArr;
        byte[] A0l;
        if (A06(1012, 11, 56).equals(c0983Io.A0d)) {
            A0F(interfaceC2190ms, A10, i);
            return A00();
        }
        String[] strArr2 = A0u;
        if (strArr2[5].length() != strArr2[6].length()) {
            A0u[3] = "Q42iXR6evmRi7JQ7PxfR7toxYIITwFkY";
            if (A06(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 10, 101).equals(c0983Io.A0d)) {
                A0F(interfaceC2190ms, A0z, i);
                return A00();
            }
            if (A06(1023, 13, 32).equals(c0983Io.A0d)) {
                A0F(interfaceC2190ms, A11, i);
                return A00();
            }
            InterfaceC0946Hd interfaceC0946Hd = c0983Io.A0b;
            if (!this.A0Y) {
                if (c0983Io.A0i) {
                    this.A02 &= -1073741825;
                    int i4 = 128;
                    if (!this.A0b) {
                        interfaceC2190ms.readFully(this.A0l.A0l(), 0, 1);
                        this.A08++;
                        if ((this.A0l.A0l()[0] & c.f16474a) == 128) {
                            throw C3K.A01(A06(694, 35, 14), null);
                        }
                        this.A00 = this.A0l.A0l()[0];
                        this.A0b = true;
                    }
                    if ((this.A00 & 1) == 1) {
                        boolean z9 = (this.A00 & 2) == 2;
                        this.A02 |= 1073741824;
                        if (!this.A0Z) {
                            byte[] A0l2 = this.A0g.A0l();
                            String[] strArr3 = A0u;
                            if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                                String[] strArr4 = A0u;
                                strArr4[5] = "0YZVfaON5K";
                                strArr4[6] = "Vpm73VVBoM5AMHA6BL8GPMDLM";
                                interfaceC2190ms.readFully(A0l2, 0, 8);
                                this.A08 += 8;
                                this.A0Z = true;
                                A0l = this.A0l.A0l();
                            } else {
                                interfaceC2190ms.readFully(A0l2, 0, 8);
                                this.A08 += 8;
                                this.A0Z = true;
                                A0l = this.A0l.A0l();
                            }
                        }
                        if (z9) {
                            boolean z10 = this.A0a;
                            String[] strArr5 = A0u;
                            if (strArr5[5].length() == strArr5[6].length()) {
                                throw new RuntimeException();
                            }
                            A0u[3] = "IbloDRbaqkSTIb2EEG1BJ7I1x09YBoFC";
                            if (!z10) {
                                interfaceC2190ms.readFully(this.A0l.A0l(), 0, 1);
                                this.A08++;
                                this.A0l.A0f(0);
                                this.A0B = this.A0l.A0I();
                                this.A0a = true;
                            }
                            int i9 = this.A0B * 4;
                            this.A0l.A0d(i9);
                            interfaceC2190ms.readFully(this.A0l.A0l(), 0, i9);
                            this.A08 += i9;
                            short s3 = (short) ((this.A0B / 2) + 1);
                            int i10 = (s3 * 6) + 2;
                            if (this.A0V == null || this.A0V.capacity() < i10) {
                                this.A0V = ByteBuffer.allocate(i10);
                            }
                            this.A0V.position(0);
                            this.A0V.putShort(s3);
                            int i11 = 0;
                            for (int i12 = 0; i12 < this.A0B; i12++) {
                                int i13 = i11;
                                i11 = this.A0l.A0L();
                                if (i12 % 2 != 0) {
                                    ByteBuffer byteBuffer = this.A0V;
                                    String[] strArr6 = A0u;
                                    if (strArr6[2].length() == strArr6[4].length()) {
                                        break;
                                    }
                                    String[] strArr7 = A0u;
                                    strArr7[2] = "aiG4mSAFtmR28a0";
                                    strArr7[4] = "af0fkPAZLGHpLmON09";
                                    byteBuffer.putInt(i11 - i13);
                                } else {
                                    ByteBuffer byteBuffer2 = this.A0V;
                                    short s6 = (short) (i11 - i13);
                                    String[] strArr8 = A0u;
                                    if (strArr8[5].length() == strArr8[6].length()) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr9 = A0u;
                                    strArr9[5] = "ft008TAv7G";
                                    strArr9[6] = "haHnc3qulCtaE6iMk670OeuEn";
                                    byteBuffer2.putShort(s6);
                                }
                            }
                            int i14 = (i - this.A08) - i11;
                            if (this.A0B % 2 == 1) {
                                this.A0V.putInt(i14);
                            } else {
                                this.A0V.putShort((short) i14);
                                this.A0V.putInt(0);
                            }
                            this.A0h.A0j(this.A0V.array(), i10);
                            interfaceC0946Hd.AIs(this.A0h, i10, 1);
                            this.A09 += i10;
                        }
                    }
                } else if (c0983Io.A0m != null) {
                    this.A0k.A0j(c0983Io.A0m, c0983Io.A0m.length);
                }
                if (c0983Io.A0B(z8)) {
                    this.A02 |= 268435456;
                    this.A0o.A0d(0);
                    int A0A = (this.A0k.A0A() + i) - this.A08;
                    this.A0l.A0d(4);
                    this.A0l.A0l()[0] = (byte) ((A0A >> 24) & p.f8630b);
                    this.A0l.A0l()[1] = (byte) ((A0A >> 16) & p.f8630b);
                    this.A0l.A0l()[2] = (byte) ((A0A >> 8) & p.f8630b);
                    this.A0l.A0l()[3] = (byte) (A0A & p.f8630b);
                    interfaceC0946Hd.AIs(this.A0l, 4, 2);
                    this.A09 += 4;
                }
                this.A0Y = true;
            }
            int A0A2 = i + this.A0k.A0A();
            if (!A06(1207, 15, 14).equals(c0983Io.A0d)) {
                String[] strArr10 = A0u;
                if (strArr10[2].length() != strArr10[4].length()) {
                    A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                    if (!A06(1236, 16, 47).equals(c0983Io.A0d)) {
                        if (c0983Io.A0c != null) {
                            AbstractC06233y.A08(this.A0k.A0A() == 0);
                            c0983Io.A0c.A03(interfaceC2190ms);
                        }
                        while (this.A08 < A0A2) {
                            int A01 = A01(interfaceC2190ms, interfaceC0946Hd, A0A2 - this.A08);
                            this.A08 += A01;
                            this.A09 += A01;
                        }
                        String A06 = A06(271, 8, 117);
                        String str = c0983Io.A0d;
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
            int i15 = c0983Io.A0Q;
            int i16 = 4 - c0983Io.A0Q;
            while (this.A08 < A0A2) {
                if (this.A0A == 0) {
                    A0G(interfaceC2190ms, A0l3, i16, i15);
                    this.A08 += i15;
                    this.A0i.A0f(0);
                    this.A0A = this.A0i.A0L();
                    this.A0j.A0f(0);
                    interfaceC0946Hd.AIr(this.A0j, 4);
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
                    int A012 = A01(interfaceC2190ms, interfaceC0946Hd, this.A0A);
                    this.A08 += A012;
                    this.A09 += A012;
                    this.A0A -= A012;
                }
            }
            String A062 = A06(271, 8, 117);
            String str2 = c0983Io.A0d;
            strArr = A0u;
            if (strArr[1].charAt(1) == strArr[0].charAt(1)) {
            }
        }
        throw new RuntimeException();
    }

    public static String A06(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0t, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0t = new byte[]{90, 23, 15, 9, 14, 90, 24, 31, 90, 19, 20, 90, 27, 90, 57, 15, 31, 9, 96, 45, 53, 51, 52, 96, 34, 37, 96, 41, 46, 96, 33, 96, 20, 50, 33, 35, 43, 5, 46, 52, 50, 57, 19, 93, 92, 71, 19, c.f16475b, 70, 67, 67, 92, 65, 71, 86, 87, 111, 122, 123, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, 112, 111, 122, 120, 46, 22, 3, 1, 87, 9, 22, 3, 1, 87, 9, 22, 3, 1, 87, 31, 22, 3, 0, 87, 19, 6, 4, 82, 12, 19, 6, 4, 82, 12, 19, 6, 4, 82, 24, 19, 6, 5, 82, 0, 4, 18, 18, 36, 53, 53, 40, 47, 38, 50, 2, 40, 49, 41, 36, 51, 12, 46, 37, 36, 97, 94, c.f16475b, 94, 94, 92, 23, 9, 23, 21, 101, 58, 36, c.f16476c, 47, 40, 58, 36, c.f16476c, 47, 40, 84, 62, 35, 43, 41, 62, 40, 40, 80, 78, 85, 69, 66, 62, 93, 94, 66, 66, 93, 84, 66, 66, 120, 102, 124, 120, 122, 10, 110, 112, 105, 99, 110, 108, 33, c.f16476c, 45, 48, 37, 39, 79, 44, 82, 2, 28, 14, 19, 6, 4, 108, 15, 112, 33, c.f16476c, 45, 51, 79, 33, 35, 45, 31, 1, 17, 14, 11, 13, 82, 76, 67, 80, 94, 60, 85, 95, 92, 82, 71, 60, 90, 86, 86, 86, 82, 76, 67, 80, 94, 60, 90, 93, 71, 60, 81, 90, 84, 12, 18, 29, 14, 0, 98, 4, 3, 25, 98, 1, 4, 25, 116, 106, 97, 103, 96, 112, 125, 113, 56, 38, 47, 54, 43, 59, 48, 42, 105, 75, 68, 13, 94, 10, 89, 73, 75, 70, 79, 10, 94, 67, 71, 79, 73, 69, 78, 79, 10, 90, 88, 67, 69, 88, 10, 94, 69, 10, 94, 67, 71, 79, 73, 69, 78, 79, 121, 73, 75, 70, 79, 10, 72, 79, 67, 68, 77, 10, 89, 79, 94, 4, 5, 41, 34, 35, 37, 15, 34, 102, 47, 53, 102, 43, 47, 53, 53, 47, 40, 33, 102, 47, 40, 102, 18, 52, 39, 37, 45, 3, 40, 50, 52, c.f16476c, 102, 35, 42, 35, 43, 35, 40, 50, 117, 89, 91, 84, 95, 88, 95, 88, 81, 22, 83, 88, 85, 68, 79, 70, 66, 95, 89, 88, 22, 87, 88, 82, 22, 85, 89, 91, 70, 68, 83, 69, 69, 95, 89, 88, 22, 95, 69, 22, 88, 89, 66, 22, 69, 67, 70, 70, 89, 68, 66, 83, 82, 86, 122, 123, 97, 112, 123, 97, 86, 122, 120, 101, 84, 121, 114, 122, 53, 107, 71, 70, 92, 77, 70, 92, 109, 70, 75, 105, 68, 79, 71, 8, 82, 126, Byte.MAX_VALUE, 101, 116, Byte.MAX_VALUE, 101, 84, Byte.MAX_VALUE, 114, 126, 117, 120, Byte.MAX_VALUE, 118, 94, 99, 117, 116, 99, 49, 95, 115, 114, 104, 121, 114, 104, 89, 114, Byte.MAX_VALUE, 115, 120, 117, 114, 123, 79, Byte.MAX_VALUE, 115, 108, 121, 60, 110, 67, 89, 73, 75, 88, 78, 67, 68, 77, 10, 70, 75, 89, 94, 10, 73, 95, 79, 10, 90, 69, 67, 68, 94, 10, 93, 67, 94, 66, 10, 95, 68, 79, 82, 90, 79, 73, 94, 79, 78, 10, 78, 95, 88, 75, 94, 67, 69, 68, 16, 10, 13, 38, 42, 29, 48, 57, 44, 105, 83, 120, 116, 67, 110, 103, 114, 69, 114, 118, 115, 65, 114, 101, 100, 126, 120, 121, 55, 71, c.f16475b, 79, 78, 34, 110, 99, 97, 107, 108, 101, 34, 113, 99, 111, 114, 110, 103, 34, 113, 107, 120, 103, 34, 109, 119, 118, 34, 109, 100, 34, 112, 99, 108, 101, 103, 44, 51, 52, 59, 58, 36, 19, 23, 18, 32, 19, 4, 5, 31, 25, 24, 86, 1, 40, 33, 41, 33, 42, 48, 100, 119, 92, 81, c.f16475b, 75, 66, 70, 87, 86, 18, 102, c.f16475b, 83, 81, 89, 18, 84, 93, 71, 92, 86, 18, 80, 71, 70, 18, 113, 93, 92, 70, 87, 92, 70, 119, 92, 81, 121, 87, 75, 123, 118, 18, 69, 83, 65, 18, 92, 93, 70, 18, 84, 93, 71, 92, 86, 71, 122, 118, 103, 108, 113, 107, 109, 108, 34, 96, 107, 118, 34, 107, 113, 34, 113, 103, 118, 34, 107, 108, 34, 113, 107, 101, 108, 99, 110, 34, 96, 123, 118, 103, 108, 69, 88, 71, 75, 94, 16, 10, 121, 94, 75, 88, 94, 6, 10, 111, 68, 78, 6, 10, 120, 79, 75, 78, 101, 88, 78, 79, 88, 6, 10, 102, 75, 83, 79, 88, 6, 10, 121, 94, 83, 70, 79, 6, 10, 100, 75, 71, 79, 6, 10, 103, 75, 88, 77, 67, 68, 102, 6, 10, 103, 75, 88, 77, 67, 68, 120, 6, 10, 103, 75, 88, 77, 67, 68, 124, 6, 10, 111, 76, 76, 79, 73, 94, 6, 10, 126, 79, 82, 94, 56, 20, 27, 17, 20, 1, 26, 7, 12, 85, 16, 25, 16, 24, 16, 27, 1, 85, 38, 16, 16, 30, 60, 49, 85, 26, 7, 85, 38, 16, 16, 30, 37, 26, 6, 28, 1, 28, 26, 27, 85, 27, 26, 1, 85, 19, 26, 0, 27, 17, 14, 34, 55, 49, 44, 48, 40, 34, 6, 59, 55, 49, 34, 32, 55, 44, 49, 54, 14, 23, 15, 18, 11, 23, 30, 91, 40, 30, 28, 22, 30, 21, 15, 91, 30, 23, 30, 22, 30, 21, 15, 8, 91, 21, 20, 15, 91, 8, 14, 11, 11, 20, 9, 15, 30, 31, 32, 1, 78, 24, 15, 2, 7, 10, 78, 26, 28, 15, 13, 5, 29, 78, 25, 11, 28, 11, 78, 8, 1, 27, 0, 10, 91, 122, 53, 99, 116, 121, 124, 113, 53, 99, 116, 103, 124, 123, 97, 53, 121, 112, 123, 114, 97, 125, 53, 120, 116, 102, 126, 53, 115, 122, 96, 123, 113, 61, 49, 42, 56, 44, 61, 59, 44, 105, 101, 114, 126, 119, 108, 21, 106, 
        125, 105, 58, 54, 61, 44, 49, 61, 70, 40, 58, 58, 103, 107, 96, 113, 108, 96, 27, 97, 96, 114, 12, Byte.MAX_VALUE, 115, 120, 105, 116, 120, 3, 123, 105, 110, 122, 120, 120, 65, 77, 68, 93, 80, 65, 71, 80, 35, 27, 25, 0, 0, 25, 30, 23, 80, 3, 5, 18, 4, 25, 4, 28, 21, 80, 3, 17, 29, 0, 28, 21, 80, 25, 30, 80, 28, 17, 19, 21, 20, 80, 18, 28, 31, 19, 27, 94, c.f16475b, 120, 122, 99, 99, 122, 125, 116, 51, 96, 102, 113, 103, 122, 103, Byte.MAX_VALUE, 118, 51, 96, 114, 126, 99, Byte.MAX_VALUE, 118, 51, 100, 122, 103, 123, 51, 125, 124, 51, 119, 102, 97, 114, 103, 122, 124, 125, 61, 81, 106, 97, 124, 116, 97, 103, 112, 97, 96, 36, 109, 96, 62, 36, 9, 50, 57, 36, 44, 57, c.f16476c, 40, 57, 56, 124, 48, 61, c.f16476c, 53, 50, 59, 124, 42, 61, 48, 41, 57, 102, 124, 45, 36, 58, 45, 74, 62, 55, 37, 56, 45, 47, 90, 122, 115, 97, 124, 105, 107, 24, 3, 101, Byte.MAX_VALUE, 99, 3, 109, 124, 102, 111, 125, 96, 117, 119, 4, 31, 121, 99, Byte.MAX_VALUE, 31, 113, 99, 96, 84, 93, 79, 82, 71, 69, 54, 45, 75, 81, 77, 45, 67, 84, 65, 60, 53, 39, 58, 47, 45, 94, 69, 35, 57, 37, 69, 57, 58, 117, 124, 110, 115, 102, 100, 107, 12, 106, 112, 108, 12, 107, 102, 117, 96, 76, 69, 87, 73, 53, 76, 92, 77, 53, 92, 85, 79, 72, 89, 89, 69, 76, 71, 91, 86, 92, 65, 82, 18, 27, 18, 20, 124, 2, 11, 2, 4, 109, 79, 83, 68, 120, 81, 78, 67, 66, 72, 120, 85, 72, 83, 102, 10, 23, 23, 23, 52, 40, c.f16476c, 3, 42, 53, 56, 57, 51, 3, 46, 51, 40, 29, 113, 108, 101, 108, 56, 36, 51, 15, 38, 57, 52, 53, c.f16476c, 15, 34, c.f16476c, 36, 17, 125, 97, 104, 96, 93, 65, 86, 106, 67, 92, 81, 80, 90, 106, 71, 90, 65, 116, 24, 7, 2, 5, 34, 46, 59, 61, 32, 60, 36, 46, 56, 39, 42, 43, 33, 97, 57, 43, 44, 35, 21, 7, 0, 15};
    }

    static {
        A0B();
        A0v = new HD() { // from class: com.facebook.ads.redexgen.X.mL
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return MatroskaExtractor.A0Q();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
        A10 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0y = C5C.A1G(A06(729, 90, 38));
        A0z = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A11 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        A0x = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put(A06(1285, 18, 43), 0);
        hashMap.put(A06(1303, 18, 80), 90);
        hashMap.put(A06(1321, 18, 92), 180);
        hashMap.put(A06(1339, 18, 57), 270);
        Map<String, Integer> trackNameToRotationDegrees = Collections.unmodifiableMap(hashMap);
        A0w = trackNameToRotationDegrees;
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new C2169mM(), i);
    }

    public MatroskaExtractor(InterfaceC0980Il interfaceC0980Il, int i) {
        this.A0M = -1L;
        this.A0O = b.f6539b;
        this.A0I = b.f6539b;
        this.A0J = b.f6539b;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = b.f6539b;
        this.A0q = interfaceC0980Il;
        this.A0q.AAD(new C2167mK(this));
        this.A0s = (i & 1) == 0;
        this.A0r = new C0985Iq();
        this.A0P = new SparseArray<>();
        this.A0l = new C06464v(4);
        this.A0p = new C06464v(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0m = new C06464v(4);
        this.A0j = new C06464v(HS.A03);
        this.A0i = new C06464v(4);
        this.A0k = new C06464v();
        this.A0n = new C06464v();
        this.A0g = new C06464v(8);
        this.A0h = new C06464v();
        this.A0o = new C06464v();
        this.A0f = new int[1];
    }

    private int A00() {
        int sampleSize = this.A09;
        A0A();
        return sampleSize;
    }

    private int A01(InterfaceC2190ms interfaceC2190ms, InterfaceC0946Hd interfaceC0946Hd, int i) throws IOException {
        int strippedBytesLeft = this.A0k.A07();
        if (strippedBytesLeft > 0) {
            int bytesWritten = Math.min(i, strippedBytesLeft);
            interfaceC0946Hd.AIr(this.A0k, bytesWritten);
            return bytesWritten;
        }
        return interfaceC0946Hd.AIp(interfaceC2190ms, i, false);
    }

    private long A03(long j9) throws C3K {
        if (this.A0O != b.f6539b) {
            return C5C.A0U(j9, this.A0O, 1000L);
        }
        throw C3K.A01(A06(a.aX, 54, 38), null);
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0053 */
    @MetaExoPlayerCustomization("Adding support AR/VR eventListener")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HY A04(C06324h c06324h, C06324h c06324h2) {
        if (this.A0M == -1 || this.A0J == b.f6539b || c06324h == null || c06324h.A02() == 0 || c06324h2 == null || c06324h2.A02() != c06324h.A02()) {
            return new C2185mn(this.A0J);
        }
        int A02 = c06324h.A02();
        int[] iArr = new int[A02];
        long[] timesUs = new long[A02];
        long[] durationsUs = new long[A02];
        long[] offsets = new long[A02];
        for (int i = 0; i < A02; i++) {
            offsets[i] = c06324h.A03(i);
            timesUs[i] = this.A0M + c06324h2.A03(i);
        }
        for (int i4 = 0; i4 < cuePointsSize; i4++) {
            int cuePointsSize = i4 + 1;
            iArr[i4] = (int) (timesUs[cuePointsSize] - timesUs[i4]);
            int i9 = i4 + 1;
            if (A0u[7].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0u;
            strArr[1] = "EcqUdVdOszDxTX1GLg4Sg6FEnSFxXYEO";
            strArr[0] = "f3IXvdxpqPdXnJQYi44axyFnZVKpD9LT";
            durationsUs[i4] = offsets[i9] - offsets[i4];
        }
        iArr[A02 - 1] = (int) ((this.A0M + this.A0N) - timesUs[A02 - 1]);
        durationsUs[A02 - 1] = this.A0J - offsets[A02 - 1];
        int cuePointsSize2 = A02 - 1;
        long j9 = durationsUs[cuePointsSize2];
        if (j9 <= 0) {
            AbstractC06314g.A07(A06(869, 17, 79), A06(499, 52, 38) + j9);
            int cuePointsSize3 = iArr.length;
            iArr = Arrays.copyOf(iArr, cuePointsSize3 - 1);
            int cuePointsSize4 = timesUs.length;
            timesUs = Arrays.copyOf(timesUs, cuePointsSize4 - 1);
            int cuePointsSize5 = durationsUs.length;
            durationsUs = Arrays.copyOf(durationsUs, cuePointsSize5 - 1);
            int cuePointsSize6 = offsets.length;
            offsets = Arrays.copyOf(offsets, cuePointsSize6 - 1);
        }
        return new C2195my(iArr, timesUs, durationsUs, offsets);
    }

    private final C0983Io A05(int i) throws C3K {
        A0D(i);
        return this.A0T;
    }

    @EnsuresNonNull({"extractorOutput"})
    private void A09() {
        AbstractC06233y.A02(this.A0S);
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
    private void A0C(int i) throws C3K {
        if (this.A0R != null && this.A0Q != null) {
        } else {
            throw C3K.A01(A06(631, 8, 72) + i + A06(0, 18, 118), null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private void A0D(int i) throws C3K {
        if (this.A0T != null) {
        } else {
            throw C3K.A01(A06(631, 8, 72) + i + A06(18, 24, 76), null);
        }
    }

    private void A0E(InterfaceC2190ms interfaceC2190ms, int i) throws IOException {
        if (this.A0l.A0A() >= i) {
            return;
        }
        if (this.A0l.A08() < i) {
            this.A0l.A0c(Math.max(this.A0l.A08() * 2, i));
        }
        interfaceC2190ms.readFully(this.A0l.A0l(), this.A0l.A0A(), i - this.A0l.A0A());
        this.A0l.A0e(i);
    }

    private void A0F(InterfaceC2190ms interfaceC2190ms, byte[] bArr, int i) throws IOException {
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
        interfaceC2190ms.readFully(A0l2, sizeWithPrefix4, i);
        this.A0n.A0f(0);
        this.A0n.A0e(length);
    }

    private void A0G(InterfaceC2190ms interfaceC2190ms, byte[] bArr, int i, int i4) throws IOException {
        int min = Math.min(i4, this.A0k.A07());
        int pendingStrippedBytes = i + min;
        interfaceC2190ms.readFully(bArr, pendingStrippedBytes, i4 - min);
        if (min > 0) {
            this.A0k.A0k(bArr, i, min);
        }
    }

    private final void A0H(C0983Io c0983Io, int i, InterfaceC2190ms interfaceC2190ms, int i4) throws IOException {
        if (i == 4) {
            if (A06(1280, 5, 88).equals(c0983Io.A0d)) {
                this.A0o.A0d(i4);
                interfaceC2190ms.readFully(this.A0o.A0l(), 0, i4);
                return;
            }
        }
        interfaceC2190ms.AK3(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (A06(1023, 13, 32).equals(r15.A0d) != false) goto L15;
     */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0I(C0983Io c0983Io, long j9, int i, int i4, int i9) {
        int i10 = i4;
        if (c0983Io.A0c != null) {
            c0983Io.A0c.A04(c0983Io.A0b, j9, i, i10, i9, c0983Io.A0a);
        } else {
            if (!A06(1012, 11, 56).equals(c0983Io.A0d)) {
                boolean equals = A06(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 10, 101).equals(c0983Io.A0d);
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0u;
                strArr[2] = "WUIRLQPYspP06jV";
                strArr[4] = "IKED97K2catgdGs9C7";
                if (!equals) {
                }
            }
            int i11 = this.A03;
            String A06 = A06(869, 17, 79);
            if (i11 > 1) {
                AbstractC06314g.A07(A06, A06(1044, 40, 124));
            } else if (this.A0D == b.f6539b) {
                AbstractC06314g.A07(A06, A06(1084, 42, 31));
            } else {
                A0K(c0983Io.A0d, this.A0D, this.A0n.A0l());
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
                c0983Io.A0b.AIr(this.A0n, this.A0n.A0A());
                i10 += this.A0n.A0A();
            }
            if ((268435456 & i) != 0) {
                if (this.A03 > 1) {
                    C06464v c06464v = this.A0o;
                    String[] strArr2 = A0u;
                    if (strArr2[5].length() != strArr2[6].length()) {
                        String[] strArr3 = A0u;
                        strArr3[1] = "YYsRZc3YFjjR6whUDZFnD2lR7qwR3xQu";
                        strArr3[0] = "iPCTe70V3RVZDGWrxpNWfBz9u5oW1N1r";
                        c06464v.A0d(0);
                    } else {
                        A0u[3] = "dzMIMRhm8kdQoNm85GuPxt1OFbbjzRAM";
                        c06464v.A0d(0);
                    }
                } else {
                    int A0A = this.A0o.A0A();
                    c0983Io.A0b.AIs(this.A0o, A0A, 2);
                    i10 += A0A;
                }
            }
            InterfaceC0946Hd interfaceC0946Hd = c0983Io.A0b;
            C0944Hb c0944Hb = c0983Io.A0a;
            String[] strArr4 = A0u;
            if (strArr4[5].length() != strArr4[6].length()) {
                String[] strArr5 = A0u;
                strArr5[1] = "aEC8Q2NERZhQKbY6SRlQy9B7oXJI5nDv";
                strArr5[0] = "M5BYDTb0V4PW6b5ziiSZklpOYuXfea8a";
                interfaceC0946Hd.AIu(j9, i, i10, i9, c0944Hb);
            } else {
                interfaceC0946Hd.AIu(j9, i, i10, i9, c0944Hb);
            }
        }
        this.A0X = true;
    }

    private final void A0J(C0983Io c0983Io, InterfaceC2190ms interfaceC2190ms, int i) throws IOException {
        if (c0983Io.A0n != 1685485123) {
            int i4 = c0983Io.A0n;
            String[] strArr = A0u;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[2] = "z7J25JPdzWy80Kd";
            strArr2[4] = "xEqpvZ1X3IvVWW9v69";
            if (i4 != 1685480259) {
                interfaceC2190ms.AK3(i);
                return;
            }
        }
        c0983Io.A0k = new byte[i];
        interfaceC2190ms.readFully(c0983Io.A0k, 0, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0K(String str, long j9, byte[] bArr) {
        char c4;
        String[] strArr;
        byte[] A0O;
        int i;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals(A06(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 10, 101))) {
                    c4 = 1;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        String[] strArr2 = A0u;
                        strArr2[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                        strArr2[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                        switch (c4) {
                            case 0:
                                A0O = A0O(j9, A06(75, 19, 63), 1000L);
                                i = 19;
                                break;
                            case 1:
                                A0O = A0O(j9, A06(56, 19, 70), 10000L);
                                i = 21;
                                break;
                            case 2:
                                A0O = A0O(j9, A06(94, 19, 58), 1000L);
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
                c4 = 65535;
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
                        c4 = 2;
                        strArr = A0u;
                        if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        }
                    }
                    c4 = 65535;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    }
                }
                throw new RuntimeException();
            case 1422270023:
                if (str.equals(A06(1012, 11, 56))) {
                    c4 = 0;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    }
                    throw new RuntimeException();
                }
                c4 = 65535;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                }
                throw new RuntimeException();
            default:
                c4 = 65535;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                }
                throw new RuntimeException();
        }
    }

    private boolean A0L(HV hv, long j9) {
        if (this.A0c) {
            this.A0L = j9;
            hv.A00 = this.A0H;
            this.A0c = false;
            return true;
        }
        if (!this.A0e || this.A0L == -1) {
            return false;
        }
        hv.A00 = this.A0L;
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
        char c4;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A06(1178, 14, 32))) {
                    c4 = 6;
                    switch (c4) {
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
                    c4 = 4;
                    switch (c4) {
                    }
                }
                break;
            case -1985379776:
                boolean equals = str.equals(A06(BaseATView.a.f9927F, 8, 108));
                if (A0u[7].length() != 16) {
                    A0u[3] = "TzGfoRLFuVo7UwCT9UC1nsicdZWWDAlG";
                    break;
                }
                switch (c4) {
                }
            case -1784763192:
                if (str.equals(A06(263, 8, 57))) {
                    c4 = 18;
                    switch (c4) {
                    }
                }
                break;
            case -1730367663:
                if (str.equals(A06(271, 8, 117))) {
                    c4 = '\f';
                    switch (c4) {
                    }
                }
                break;
            case -1482641358:
                if (str.equals(A06(189, 9, 108))) {
                    c4 = 14;
                    switch (c4) {
                    }
                }
                break;
            case -1482641357:
                if (str.equals(A06(198, 9, 79))) {
                    c4 = 15;
                    switch (c4) {
                    }
                }
                break;
            case -1373388978:
                if (str.equals(A06(1252, 15, 22))) {
                    c4 = '\t';
                    switch (c4) {
                    }
                }
                break;
            case -933872740:
                if (str.equals(A06(984, 8, 98))) {
                    c4 = ' ';
                    switch (c4) {
                    }
                }
                break;
            case -538363189:
                if (str.equals(A06(1192, 15, 60))) {
                    c4 = 5;
                    switch (c4) {
                    }
                }
                break;
            case -538363109:
                if (str.equals(A06(1207, 15, 14))) {
                    c4 = 7;
                    switch (c4) {
                    }
                }
                break;
            case -425012669:
                if (str.equals(A06(1036, 8, 30))) {
                    c4 = 30;
                    switch (c4) {
                    }
                }
                break;
            case -356037306:
                if (str.equals(A06(163, 14, 29))) {
                    c4 = 21;
                    switch (c4) {
                    }
                }
                break;
            case 62923557:
                if (str.equals(A06(135, 5, 19))) {
                    c4 = '\r';
                    switch (c4) {
                    }
                }
                break;
            case 62923603:
                if (str.equals(A06(140, 5, 90))) {
                    c4 = 16;
                    switch (c4) {
                    }
                }
                break;
            case 62927045:
                if (str.equals(A06(145, 5, 119))) {
                    c4 = 19;
                    switch (c4) {
                    }
                }
                break;
            case 82318131:
                if (str.equals(A06(1166, 5, 119))) {
                    c4 = 2;
                    switch (c4) {
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
                switch (c4) {
                }
            case 82338134:
                if (str.equals(A06(1280, 5, 88))) {
                    c4 = 1;
                    switch (c4) {
                    }
                }
                break;
            case 99146302:
                if (str.equals(A06(992, 10, 54))) {
                    c4 = 31;
                    switch (c4) {
                    }
                }
                break;
            case 444813526:
                if (str.equals(A06(1267, 8, 31))) {
                    c4 = '\n';
                    switch (c4) {
                    }
                }
                break;
            case 542569478:
                if (str.equals(A06(150, 13, 119))) {
                    c4 = 20;
                    switch (c4) {
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
                switch (c4) {
                }
            case 725948237:
                boolean equals3 = str.equals(A06(237, 13, 31));
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                A0u[7] = "zUYiT8JvqtzTusXd0wwrN";
                if (equals3) {
                    c4 = 25;
                    switch (c4) {
                    }
                }
                break;
            case 725957860:
                if (str.equals(A06(250, 13, 65))) {
                    c4 = 24;
                    switch (c4) {
                    }
                }
                break;
            case 738597099:
                if (str.equals(A06(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 10, 101))) {
                    c4 = 28;
                    switch (c4) {
                    }
                }
                break;
            case 855502857:
                if (str.equals(A06(1236, 16, 47))) {
                    c4 = '\b';
                    switch (c4) {
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
                    c4 = 29;
                    switch (c4) {
                    }
                }
                break;
            case 1422270023:
                if (str.equals(A06(1012, 11, 56))) {
                    c4 = 27;
                    switch (c4) {
                    }
                }
                break;
            case 1809237540:
                if (str.equals(A06(1171, 7, 100))) {
                    c4 = 3;
                    switch (c4) {
                    }
                }
                break;
            case 1950749482:
                if (str.equals(A06(177, 6, 53))) {
                    c4 = 17;
                    switch (c4) {
                    }
                }
                break;
            case 1950789798:
                if (str.equals(A06(183, 6, 35))) {
                    c4 = 22;
                    switch (c4) {
                    }
                }
                break;
            case 1951062397:
                if (str.equals(A06(215, 6, 82))) {
                    c4 = 11;
                    switch (c4) {
                    }
                }
                break;
        }
        c4 = 65535;
        switch (c4) {
        }
    }

    public static byte[] A0O(long j9, String str, long j10) {
        AbstractC06233y.A07(j9 != b.f6539b);
        int i = (int) (j9 / 3600000000L);
        long j11 = j9 - ((i * com.anythink.expressad.f.a.b.f18559P) * 1000000);
        int i4 = (int) (j11 / 60000000);
        long j12 = j11 - ((i4 * 60) * 1000000);
        int i9 = (int) (j12 / 1000000);
        int minutes = (int) ((j12 - (i9 * 1000000)) / j10);
        return C5C.A1G(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i9), Integer.valueOf(minutes)));
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

    public static /* synthetic */ H9[] A0Q() {
        return new H9[]{new MatroskaExtractor()};
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "Adding support for AR/VR TAGs")
    public final int A0R(int i) {
        switch (i) {
            case com.anythink.expressad.video.module.a.a.f21890V /* 131 */:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
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
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
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
            case 161:
            case 163:
            case 165:
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
            case 181:
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
    
        throw com.instagram.common.viewpoint.core.C3K.A01(A06(819, 50, 121), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
    
        if (r5 != (-1)) goto L36;
     */
    /* JADX WARN: Incorrect condition in loop: B:81:0x017e */
    /* JADX WARN: Incorrect condition in loop: B:86:0x018b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0S(int i) throws C3K {
        A09();
        switch (i) {
            case 160:
                if (this.A05 == 2) {
                    C0983Io c0983Io = this.A0P.get(this.A06);
                    c0983Io.A06();
                    if (this.A0E > 0 && A06(215, 6, 82).equals(c0983Io.A0d)) {
                        this.A0o.A0i(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0E).array());
                    }
                    int sampleFlags = 0;
                    if (A0u[7].length() != 16) {
                        String[] strArr = A0u;
                        strArr[5] = "BDPY36VwNm";
                        strArr[6] = "7hC1KMOm7DpnqonjeX0jtoaYt";
                        for (int sampleOffset = 0; sampleOffset < i; sampleOffset++) {
                            int i4 = this.A0f[sampleOffset];
                            sampleFlags += i4;
                        }
                        for (int i9 = 0; i9 < sampleOffset; i9++) {
                            long j9 = this.A0F;
                            int sampleOffset2 = c0983Io.A0I;
                            long j10 = j9 + ((sampleOffset2 * i9) / 1000);
                            int i10 = this.A02;
                            if (i9 == 0 && !this.A0W) {
                                i10 |= 1;
                            }
                            int i11 = this.A0f[i9];
                            sampleFlags -= i11;
                            A0I(c0983Io, j10, i10, i11, sampleFlags);
                        }
                        this.A05 = 0;
                        return;
                    }
                    throw new RuntimeException();
                }
                return;
            case 174:
                C0983Io c0983Io2 = (C0983Io) AbstractC06233y.A02(this.A0T);
                if (c0983Io2.A0d != null) {
                    if (A0M(c0983Io2.A0d)) {
                        c0983Io2.A0G(this.A0S, c0983Io2.A0R);
                        this.A0P.put(c0983Io2.A0R, c0983Io2);
                    }
                    this.A0T = null;
                    return;
                }
                throw C3K.A01(A06(333, 40, 74), null);
            case 19899:
                int i12 = this.A0C;
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
                    this.A0T.A0Z = new DrmInitData(new DrmInitData.SchemeData(C2Y.A03, A06(1365, 10, 66), this.A0T.A0a.A03));
                    return;
                }
                throw C3K.A01(A06(639, 55, 62), null);
            case 28032:
                A0D(i);
                if (!this.A0T.A0i || this.A0T.A0m == null) {
                    return;
                } else {
                    throw C3K.A01(A06(373, 53, 58), null);
                }
            case 357149030:
                long j11 = this.A0O;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "WZACEI803UG8FVl";
                if (j11 == b.f6539b) {
                    this.A0O = 1000000L;
                }
                if (this.A0I != b.f6539b) {
                    this.A0J = A03(this.A0I);
                    return;
                }
                return;
            case 374648427:
                if (this.A0P.size() != 0) {
                    this.A0S.A6O();
                    return;
                }
                throw C3K.A01(A06(925, 26, 98), null);
            case 475249515:
                if (!this.A0e) {
                    this.A0S.AJ7(A04(this.A0R, this.A0Q));
                    this.A0e = true;
                }
                this.A0R = null;
                this.A0Q = null;
                return;
            default:
                return;
        }
    }

    public final void A0T(int i, double d2) throws C3K {
        switch (i) {
            case 181:
                C0983Io A05 = A05(i);
                int i4 = (int) d2;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "mnSBpt4UIloiGRhCy1GZQUK3TYQANP";
                A05.A0T = i4;
                return;
            case 17545:
                this.A0I = (long) d2;
                return;
            case 21969:
                A05(i).A06 = (float) d2;
                return;
            case 21970:
                C0983Io A052 = A05(i);
                if (A0u[7].length() != 16) {
                    A0u[7] = "bgRhYiIqKVlSmtLlUnVbMuj";
                    A052.A07 = (float) d2;
                    return;
                } else {
                    A052.A07 = (float) d2;
                    return;
                }
            case 21971:
                A05(i).A04 = (float) d2;
                return;
            case 21972:
                A05(i).A05 = (float) d2;
                return;
            case 21973:
                A05(i).A02 = (float) d2;
                return;
            case 21974:
                A05(i).A03 = (float) d2;
                return;
            case 21975:
                A05(i).A0B = (float) d2;
                return;
            case 21976:
                C0983Io A053 = A05(i);
                float f6 = (float) d2;
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    A0u[7] = "0K";
                    A053.A0C = f6;
                    return;
                }
                throw new RuntimeException();
            case 21977:
                A05(i).A00 = (float) d2;
                return;
            case 21978:
                A05(i).A01 = (float) d2;
                return;
            case 30323:
                A05(i).A0A = (float) d2;
                return;
            case 30324:
                A05(i).A08 = (float) d2;
                return;
            case 30325:
                A05(i).A09 = (float) d2;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x01bc, code lost:
    
        if ((r4[2] & com.anythink.core.common.s.a.c.f16474a) == 128) goto L41;
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
    public final void A0U(int i, int i4, InterfaceC2190ms interfaceC2190ms) throws IOException {
        int i9;
        int charAt;
        int totalSamplesSize;
        int timecode;
        int totalSamplesSize2 = 0;
        int i10 = 1;
        switch (i) {
            case 161:
            case 163:
                if (this.A05 == 0) {
                    this.A06 = (int) this.A0r.A05(interfaceC2190ms, false, true, 8);
                    this.A07 = this.A0r.A04();
                    String[] strArr = A0u;
                    if (strArr[5].length() == strArr[6].length()) {
                        this.A0D = b.f6539b;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    } else {
                        String[] strArr2 = A0u;
                        strArr2[1] = "LCHoyUIFh4JbWXc3a57uog3rKRFOb5wV";
                        strArr2[0] = "47gJribS0awN4nsHBZkjm7XOEmPrRfLr";
                        this.A0D = b.f6539b;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    }
                }
                C0983Io c0983Io = this.A0P.get(this.A06);
                if (c0983Io != null) {
                    c0983Io.A06();
                    if (this.A05 == 1) {
                        A0E(interfaceC2190ms, 3);
                        int byteValue = (this.A0l.A0l()[2] & 6) >> 1;
                        int i11 = p.f8630b;
                        if (byteValue != 0) {
                            A0E(interfaceC2190ms, 4);
                            int timecode2 = this.A0l.A0l()[3];
                            this.A03 = (timecode2 & p.f8630b) + 1;
                            int[] iArr = this.A0f;
                            int timecode3 = this.A03;
                            this.A0f = A0P(iArr, timecode3);
                            if (byteValue == 2) {
                                int timecode4 = this.A07;
                                int i12 = (i4 - timecode4) - 4;
                                int timecode5 = this.A03;
                                int i13 = i12 / timecode5;
                                int[] iArr2 = this.A0f;
                                int blockLacingSampleSize = this.A03;
                                Arrays.fill(iArr2, 0, blockLacingSampleSize, i13);
                            } else if (byteValue != 1) {
                                if (byteValue == 3) {
                                    int i14 = 0;
                                    int sampleIndex = 4;
                                    int i15 = 0;
                                    while (i15 < this.A03 - i10) {
                                        this.A0f[i15] = totalSamplesSize2;
                                        sampleIndex++;
                                        A0E(interfaceC2190ms, sampleIndex);
                                        C06464v c06464v = this.A0l;
                                        if (A0u[7].length() == 16) {
                                            break;
                                        } else {
                                            A0u[7] = "lQQ4f1MYxOwR1g4uON0whOI";
                                            if (c06464v.A0l()[sampleIndex - 1] != 0) {
                                                long j9 = 0;
                                                int i16 = 0;
                                                while (i16 < 8) {
                                                    int i17 = i10 << (7 - i16);
                                                    C06464v c06464v2 = this.A0l;
                                                    String[] strArr3 = A0u;
                                                    String str = strArr3[1];
                                                    String str2 = strArr3[0];
                                                    int charAt2 = str.charAt(1);
                                                    int lengthMask = str2.charAt(1);
                                                    if (charAt2 != lengthMask) {
                                                        A0u[3] = "6gmtIRdzQjg9uolj5CgbNQmEFE2eXosQ";
                                                        if ((c06464v2.A0l()[sampleIndex - 1] & i17) != 0) {
                                                            int totalSamplesSize3 = sampleIndex - 1;
                                                            sampleIndex += i16;
                                                            A0E(interfaceC2190ms, sampleIndex);
                                                            i9 = totalSamplesSize3 + 1;
                                                            int totalSamplesSize4 = this.A0l.A0l()[totalSamplesSize3] & i11;
                                                            int lengthMask2 = ~i17;
                                                            j9 = totalSamplesSize4 & lengthMask2;
                                                            while (i9 < sampleIndex) {
                                                                int readPosition = i9 + 1;
                                                                j9 = (j9 << 8) | (this.A0l.A0l()[i9] & i11);
                                                                i9 = readPosition;
                                                            }
                                                            if (i15 > 0) {
                                                                j9 -= (1 << ((i16 * 7) + 6)) - 1;
                                                            }
                                                        } else {
                                                            i16++;
                                                            i10 = 1;
                                                        }
                                                    } else if ((c06464v2.A0l()[sampleIndex - 1] & i17) != 0) {
                                                        int totalSamplesSize32 = sampleIndex - 1;
                                                        sampleIndex += i16;
                                                        A0E(interfaceC2190ms, sampleIndex);
                                                        i9 = totalSamplesSize32 + 1;
                                                        int totalSamplesSize42 = this.A0l.A0l()[totalSamplesSize32] & i11;
                                                        int lengthMask22 = ~i17;
                                                        j9 = totalSamplesSize42 & lengthMask22;
                                                        while (i9 < sampleIndex) {
                                                        }
                                                        if (i15 > 0) {
                                                        }
                                                    } else {
                                                        i16++;
                                                        i10 = 1;
                                                    }
                                                    if (j9 < -2147483648L && j9 <= 2147483647L) {
                                                        int i18 = (int) j9;
                                                        int[] iArr3 = this.A0f;
                                                        if (i15 != 0) {
                                                            i18 += this.A0f[i15 - 1];
                                                        }
                                                        iArr3[i15] = i18;
                                                        i14 += this.A0f[i15];
                                                        i15++;
                                                        i11 = p.f8630b;
                                                        totalSamplesSize2 = 0;
                                                        i10 = 1;
                                                    } else {
                                                        throw C3K.A01(A06(578, 37, 14), null);
                                                    }
                                                }
                                                if (j9 < -2147483648L) {
                                                }
                                                throw C3K.A01(A06(578, 37, 14), null);
                                            }
                                            throw C3K.A01(A06(951, 33, 25), null);
                                        }
                                    }
                                    this.A0f[this.A03 - 1] = ((i4 - this.A07) - sampleIndex) - i14;
                                } else {
                                    throw C3K.A01(A06(1141, 25, 80) + byteValue, null);
                                }
                            } else {
                                int i19 = 0;
                                int i20 = 4;
                                int i21 = 0;
                                while (true) {
                                    int i22 = this.A03;
                                    if (A0u[3].charAt(5) != 'R') {
                                        if (i21 >= i22 - 1) {
                                        }
                                        this.A0f[i21] = 0;
                                        while (true) {
                                            i20++;
                                            A0E(interfaceC2190ms, i20);
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
                                                int totalSamplesSize5 = i20 - 1;
                                                int i23 = A0l[totalSamplesSize5] & 255;
                                                int[] iArr4 = this.A0f;
                                                int totalSamplesSize6 = iArr4[i21];
                                                iArr4[i21] = totalSamplesSize6 + i23;
                                                if (i23 != 255) {
                                                    break;
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize7 = i20 - 1;
                                                int i24 = A0l[totalSamplesSize7] & 255;
                                                int[] iArr5 = this.A0f;
                                                int totalSamplesSize8 = iArr5[i21];
                                                iArr5[i21] = totalSamplesSize8 + i24;
                                                if (i24 != 255) {
                                                    break;
                                                }
                                            }
                                        }
                                        int totalSamplesSize9 = this.A0f[i21];
                                        i19 += totalSamplesSize9;
                                        i21++;
                                    } else {
                                        String[] strArr6 = A0u;
                                        strArr6[1] = "uG7prxZBXLM0QG5e8GSw94nYMCP7upCE";
                                        strArr6[0] = "tV31aGArCsXy4K1N5Jjs7nQ9FZDzw28J";
                                        if (i21 >= i22 - 1) {
                                        }
                                        this.A0f[i21] = 0;
                                        while (true) {
                                            i20++;
                                            A0E(interfaceC2190ms, i20);
                                            byte[] A0l2 = this.A0l.A0l();
                                            String[] strArr42 = A0u;
                                            String str32 = strArr42[1];
                                            String str42 = strArr42[0];
                                            charAt = str32.charAt(1);
                                            totalSamplesSize = str42.charAt(1);
                                            if (charAt == totalSamplesSize) {
                                            }
                                        }
                                        int totalSamplesSize92 = this.A0f[i21];
                                        i19 += totalSamplesSize92;
                                        i21++;
                                    }
                                }
                                int[] iArr6 = this.A0f;
                                int i25 = this.A03 - 1;
                                int totalSamplesSize10 = this.A07;
                                iArr6[i25] = ((i4 - totalSamplesSize10) - i20) - i19;
                            }
                        } else {
                            this.A03 = 1;
                            this.A0f = A0P(this.A0f, 1);
                            this.A0f[0] = (i4 - this.A07) - 3;
                        }
                        int lacing = this.A0l.A0l()[0];
                        this.A0F = this.A0G + A03((lacing << 8) | (this.A0l.A0l()[1] & 255));
                        int timecode6 = c0983Io.A0V;
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
                            int A02 = A02(interfaceC2190ms, c0983Io, iArr7[timecode9], false);
                            c0983Io = c0983Io;
                            A0I(c0983Io, this.A0F + ((this.A04 * c0983Io.A0I) / 1000), this.A02, A02, 0);
                            this.A04++;
                        }
                        this.A05 = 0;
                        return;
                    }
                    while (this.A04 < this.A03) {
                        this.A0f[this.A04] = A02(interfaceC2190ms, c0983Io, this.A0f[this.A04], true);
                        this.A04++;
                    }
                    return;
                }
                interfaceC2190ms.AK3(i4 - this.A07);
                this.A05 = 0;
                return;
            case 165:
                if (this.A05 != 2) {
                    return;
                }
                A0H(this.A0P.get(this.A06), this.A01, interfaceC2190ms, i4);
                return;
            case 16877:
                A0J(A05(i), interfaceC2190ms, i4);
                return;
            case 16981:
                A0D(i);
                this.A0T.A0m = new byte[i4];
                interfaceC2190ms.readFully(this.A0T.A0m, 0, i4);
                return;
            case 18402:
                byte[] bArr = new byte[i4];
                interfaceC2190ms.readFully(bArr, 0, i4);
                A05(i).A0a = new C0944Hb(1, bArr, 0, 0);
                return;
            case 21419:
                Arrays.fill(this.A0m.A0l(), (byte) 0);
                interfaceC2190ms.readFully(this.A0m.A0l(), 4 - i4, i4);
                this.A0m.A0f(0);
                this.A0C = (int) this.A0m.A0Q();
                return;
            case 25506:
                A0D(i);
                String[] strArr9 = A0u;
                if (strArr9[1].charAt(1) != strArr9[0].charAt(1)) {
                    A0u[3] = "vSk1rRCvXwYs114cFInjW7yvt4gWKzzv";
                    this.A0T.A0j = new byte[i4];
                    interfaceC2190ms.readFully(this.A0T.A0j, 0, i4);
                    return;
                }
                break;
            case 30322:
                A0D(i);
                this.A0T.A0l = new byte[i4];
                interfaceC2190ms.readFully(this.A0T.A0l, 0, i4);
                return;
            default:
                throw C3K.A01(A06(1126, 15, 8) + i, null);
        }
        throw new RuntimeException();
    }

    public final void A0V(int i, long j9) throws C3K {
        String A06 = A06(42, 14, 63);
        switch (i) {
            case com.anythink.expressad.video.module.a.a.f21890V /* 131 */:
                A05(i).A0V = (int) j9;
                return;
            case 136:
                A05(i).A0f = j9 == 1;
                return;
            case 155:
                this.A0D = A03(j9);
                return;
            case 159:
                A05(i).A0E = (int) j9;
                return;
            case 176:
                A05(i).A0W = (int) j9;
                return;
            case 179:
                A0C(i);
                this.A0R.A04(A03(j9));
                return;
            case 186:
                A05(i).A0M = (int) j9;
                return;
            case 215:
                A05(i).A0R = (int) j9;
                return;
            case 231:
                this.A0G = A03(j9);
                return;
            case 238:
                this.A01 = (int) j9;
                return;
            case 241:
                if (this.A0d) {
                    return;
                }
                A0C(i);
                this.A0Q.A04(j9);
                this.A0d = true;
                return;
            case 251:
                this.A0W = true;
                return;
            case 16871:
                A05(i).A0n = (int) j9;
                return;
            case 16980:
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "siSTSWWHFDsKrirn3iU8fidRJrb4DuSX";
                    strArr2[0] = "o7Su23MSMUKyfq0AiKXYGeUTl03UpruG";
                    if (j9 == 3) {
                        return;
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[5] = "wDyyIq2mnN";
                    strArr3[6] = "u9jmr3hENDVfo4ybwkpsevoxR";
                    if (j9 == 3) {
                        return;
                    }
                }
                throw C3K.A01(A06(426, 16, 25) + j9 + A06, null);
            case 17029:
                if (j9 >= 1 && j9 <= 2) {
                    return;
                } else {
                    throw C3K.A01(A06(559, 19, 27) + j9 + A06, null);
                }
            case 17143:
                if (j9 == 1) {
                    return;
                } else {
                    throw C3K.A01(A06(615, 16, 122) + j9 + A06, null);
                }
            case 18401:
                if (j9 == 5) {
                    return;
                } else {
                    throw C3K.A01(A06(442, 15, 36) + j9 + A06, null);
                }
            case 18408:
                if (j9 == 1) {
                    return;
                } else {
                    throw C3K.A01(A06(113, 22, 77) + j9 + A06, null);
                }
            case 20529:
                if (j9 == 0) {
                    return;
                } else {
                    throw C3K.A01(A06(457, 21, 29) + j9 + A06, null);
                }
            case 20530:
                if (j9 == 1) {
                    return;
                } else {
                    throw C3K.A01(A06(478, 21, 16) + j9 + A06, null);
                }
            case 21420:
                this.A0K = this.A0M + j9;
                return;
            case 21432:
                int i4 = (int) j9;
                A0D(i);
                switch (i4) {
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
                A05(i).A0L = (int) j9;
                return;
            case 21682:
                A05(i).A0K = (int) j9;
                return;
            case 21690:
                A05(i).A0J = (int) j9;
                return;
            case 21930:
                A05(i).A0g = j9 == 1;
                return;
            case 21945:
                A0D(i);
                switch ((int) j9) {
                    case 1:
                        C0983Io c0983Io = this.A0T;
                        if (A0u[7].length() != 16) {
                            String[] strArr4 = A0u;
                            strArr4[1] = "46IydxS7gy6otlVQjCqCZWblmnAwVrZG";
                            strArr4[0] = "ABdhU4etfaEDzGqzhVxfZNO7CdkZTY0J";
                            c0983Io.A0F = 2;
                            return;
                        }
                        c0983Io.A0F = 2;
                        return;
                    case 2:
                        this.A0T.A0F = 1;
                        return;
                    default:
                        return;
                }
            case 21946:
                A0D(i);
                int A01 = ColorInfo.A01((int) j9);
                if (A01 == -1) {
                    return;
                }
                this.A0T.A0H = A01;
                return;
            case 21947:
                A0D(i);
                this.A0T.A0h = true;
                int A00 = ColorInfo.A00((int) j9);
                if (A00 == -1) {
                    return;
                }
                this.A0T.A0G = A00;
                return;
            case 21948:
                A05(i).A0O = (int) j9;
                return;
            case 21949:
                A05(i).A0P = (int) j9;
                return;
            case 21998:
                A05(i).A0N = (int) j9;
                return;
            case 22186:
                A05(i).A0X = j9;
                return;
            case 22203:
                A05(i).A0Y = j9;
                return;
            case 25188:
                A05(i).A0D = (int) j9;
                return;
            case 30114:
                this.A0E = j9;
                return;
            case 30321:
                A0D(i);
                switch ((int) j9) {
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
                C0983Io A05 = A05(i);
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[3] = "17DkRR24xbcR08jR5ve3iaIolPHvV07P";
                A05.A0I = (int) j9;
                return;
            case 2807729:
                this.A0O = j9;
                return;
            default:
                return;
        }
    }

    public final void A0W(int i, long j9, long j10) throws C3K {
        A09();
        switch (i) {
            case 160:
                this.A0W = false;
                this.A0E = 0L;
                return;
            case 174:
                this.A0T = new C0983Io();
                return;
            case 187:
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
                if (this.A0M == -1 || this.A0M == j9) {
                    this.A0M = j9;
                    this.A0N = j10;
                    return;
                }
                throw C3K.A01(A06(886, 39, 119), null);
            case 475249515:
                this.A0R = new C06324h();
                this.A0Q = new C06324h();
                return;
            case 524531317:
                if (this.A0e) {
                    return;
                }
                if (this.A0s && this.A0H != -1) {
                    this.A0c = true;
                    return;
                } else {
                    this.A0S.AJ7(new C2185mn(this.A0J));
                    this.A0e = true;
                    return;
                }
        }
    }

    @MetaExoPlayerCustomization("Adding support for AR/VR TAGs")
    public final void A0X(int i, String str) throws C3K {
        switch (i) {
            case 134:
                A05(i).A0d = str;
                return;
            case 17026:
                if (!A06(1375, 4, 110).equals(str) && !A06(1357, 8, 67).equals(str)) {
                    throw C3K.A01(A06(551, 8, 69) + str + A06(42, 14, 63), null);
                }
                return;
            case 17827:
                this.A0U = str;
                return;
            case 21358:
                C0983Io A05 = A05(i);
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

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A0S = ha;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x0027 */
    @Override // com.instagram.common.viewpoint.core.H9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AHL(InterfaceC2190ms interfaceC2190ms, HV hv) throws IOException {
        this.A0X = false;
        boolean z8 = true;
        while (z8 && !this.A0X) {
            z8 = this.A0q.AHO(interfaceC2190ms);
            if (z8 && A0L(hv, interfaceC2190ms.A8n())) {
                return 1;
            }
        }
        if (z8) {
            return 0;
        }
        for (int i = 0; i < i; i++) {
            C0983Io valueAt = this.A0P.valueAt(i);
            valueAt.A06();
            valueAt.A0E();
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x001e */
    @Override // com.instagram.common.viewpoint.core.H9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AJ6(long j9, long j10) {
        this.A0G = b.f6539b;
        this.A05 = 0;
        this.A0q.reset();
        this.A0r.A06();
        A0A();
        for (int i = 0; i < i; i++) {
            this.A0P.valueAt(i).A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2190ms interfaceC2190ms) throws IOException {
        return new C0984Ip().A01(interfaceC2190ms);
    }
}
