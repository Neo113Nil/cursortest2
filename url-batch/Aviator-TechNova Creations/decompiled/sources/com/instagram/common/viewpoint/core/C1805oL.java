package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.oL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1805oL implements C1S {
    public static byte[] A0H;
    public static String[] A0I = {"AtN4gZlBq", "c6vG0ZoB350sNCwGTcbmyQxG", "GzjisXMF7MeBETThzgY0McLZmUxvZEHG", "X6Q", "OR9IAwpAbXPQPDykEqLOHO0nD", "OJOMvHQBuYweGyqOlvOJ7Ft7l3L2", "Cgb", "Ei80eZ3oJ"};
    public static final C1R<C1805oL> A0J;
    public static final Object A0K;
    public static final C1827oi A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C1829ok A08;
    public Object A0A;

    @Deprecated
    public Object A0B;
    public boolean A0D;

    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public C1827oi A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C1805oL A00(Bundle bundle) {
        C1829ok c1829ok;
        Bundle bundle2 = bundle.getBundle(A0W);
        C1827oi A6X = bundle2 != null ? C1827oi.A08.A6X(bundle2) : C1827oi.A09;
        long j = bundle.getLong(A0Y, -9223372036854775807L);
        long j2 = bundle.getLong(A0Z, -9223372036854775807L);
        long j3 = bundle.getLong(A0P, -9223372036854775807L);
        boolean z = bundle.getBoolean(A0T, false);
        boolean z2 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        if (bundle3 != null) {
            c1829ok = C1829ok.A06.A6X(bundle3);
        } else {
            c1829ok = null;
            if (A0I[2].charAt(1) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[6] = "auZ";
            strArr[3] = "aKQ";
        }
        boolean z3 = bundle.getBoolean(A0S, false);
        long j4 = bundle.getLong(A0N, 0L);
        long j5 = bundle.getLong(A0O, -9223372036854775807L);
        int i = bundle.getInt(A0Q, 0);
        int i2 = bundle.getInt(A0U, 0);
        long j6 = bundle.getLong(A0X, 0L);
        C1805oL c1805oL = new C1805oL();
        c1805oL.A07(A0M, A6X, null, j, j2, j3, z, z2, c1829ok, j4, j5, i, i2, j6);
        c1805oL.A0F = z3;
        return c1805oL;
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{6, 10, 8, 75, 3, 4, 6, 0, 7, 10, 10, Ascii.SO, 75, 4, 1, Ascii.SYN, 75, 4, Ascii.VT, 1, Ascii.ETB, 10, Ascii.FF, 1, Ascii.GS, 75, 8, 0, 1, Ascii.FF, 4, 86, 75, 6, 10, 8, 8, 10, Ascii.VT, 75, 49, Ascii.FF, 8, 0, 9, Ascii.FF, Ascii.VT, 0};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new C2I().A03(A02(0, 48, 107)).A00(Uri.EMPTY).A05();
        A0W = AbstractC01484a.A0h(1);
        A0Y = AbstractC01484a.A0h(2);
        A0Z = AbstractC01484a.A0h(3);
        A0P = AbstractC01484a.A0h(4);
        A0T = AbstractC01484a.A0h(5);
        A0R = AbstractC01484a.A0h(6);
        A0V = AbstractC01484a.A0h(7);
        A0S = AbstractC01484a.A0h(8);
        A0N = AbstractC01484a.A0h(9);
        A0O = AbstractC01484a.A0h(10);
        A0Q = AbstractC01484a.A0h(11);
        A0U = AbstractC01484a.A0h(12);
        A0X = AbstractC01484a.A0h(13);
        A0J = new C1R() { // from class: com.facebook.ads.redexgen.X.oM
            @Override // com.instagram.common.viewpoint.core.C1R
            public final C1S A6X(Bundle bundle) {
                C1805oL A00;
                A00 = C1805oL.A00(bundle);
                return A00;
            }
        };
    }

    public final long A04() {
        return AbstractC01484a.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return AbstractC01484a.A0P(this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        r0 = r7.A03.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1805oL A07(Object obj, C1827oi c1827oi, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C1829ok c1829ok, long j4, long j5, int i, int i2, long j6) {
        this.A0C = obj;
        this.A09 = c1827oi != null ? c1827oi : A0L;
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        A0I[5] = "sHLAwqiYlmMVa087WjDP7yFYW";
        if (c1827oi != null) {
            C2Q c2q = c1827oi.A03;
            if (A0I[2].charAt(1) != 'z') {
                A0I[2] = "JzGzHC0FwGnnWhMzWBrJaCXM29VIx9g1";
            } else {
                A0I[5] = "IGwZtC";
            }
            this.A0B = r0;
            this.A0A = obj2;
            this.A06 = j;
            this.A07 = j2;
            this.A04 = j3;
            this.A0G = z;
            this.A0D = z2;
            this.A0E = c1829ok == null;
            this.A08 = c1829ok;
            this.A02 = j4;
            this.A03 = j5;
            this.A00 = i;
            this.A01 = i2;
            this.A05 = j6;
            this.A0F = false;
            return this;
        }
        Object obj3 = null;
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j;
        this.A07 = j2;
        this.A04 = j3;
        this.A0G = z;
        this.A0D = z2;
        this.A0E = c1829ok == null;
        this.A08 = c1829ok;
        this.A02 = j4;
        this.A03 = j5;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = j6;
        this.A0F = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C1805oL c1805oL = (C1805oL) obj;
        if (AbstractC01484a.A1E(this.A0C, c1805oL.A0C) && AbstractC01484a.A1E(this.A09, c1805oL.A09) && AbstractC01484a.A1E(this.A0A, c1805oL.A0A) && AbstractC01484a.A1E(this.A08, c1805oL.A08) && this.A06 == c1805oL.A06 && this.A07 == c1805oL.A07 && this.A04 == c1805oL.A04 && this.A0G == c1805oL.A0G && this.A0D == c1805oL.A0D && this.A0F == c1805oL.A0F && this.A02 == c1805oL.A02 && this.A03 == c1805oL.A03 && this.A00 == c1805oL.A00 && this.A01 == c1805oL.A01) {
            long j = this.A05;
            long j2 = c1805oL.A05;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[6] = "Zdu";
            strArr2[3] = "ITW";
            if (j == j2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((7 * 31) + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31) + (this.A0A == null ? 0 : this.A0A.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0)) * 31) + ((int) (this.A06 ^ (this.A06 >>> 32)))) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + ((int) (this.A04 ^ (this.A04 >>> 32)))) * 31) + (this.A0G ? 1 : 0);
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[6] = "6VN";
        strArr[3] = "iNJ";
        return (((((((((((((hashCode * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (this.A05 ^ (this.A05 >>> 32)));
    }
}
