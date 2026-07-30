package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0560Kn {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C0558Kl A02(InterfaceC1625lN interfaceC1625lN) throws IOException {
        byte[] bArr;
        C4J c4j = new C4J(16);
        C0559Km A03 = A03(1718449184, interfaceC1625lN, c4j);
        C3M.A08(A03.A01 >= 16);
        interfaceC1625lN.AG9(c4j.A0l(), 0, 16);
        c4j.A0f(0);
        int A0G = c4j.A0G();
        int A0G2 = c4j.A0G();
        int A0F = c4j.A0F();
        int A0F2 = c4j.A0F();
        int A0G3 = c4j.A0G();
        int A0G4 = c4j.A0G();
        int i = ((int) A03.A01) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC1625lN.AG9(bArr, 0, i);
        } else {
            bArr = AbstractC01484a.A07;
        }
        interfaceC1625lN.AJJ((int) (interfaceC1625lN.A8a() - interfaceC1625lN.A8f()));
        return new C0558Kl(A0G, A0G2, A0F, A0F2, A0G3, A0G4, bArr);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, 16, Ascii.CR, Ascii.SYN, 19, 88, 17, Ascii.VT, 88, Ascii.FF, Ascii.ETB, Ascii.ETB, 88, Ascii.DC4, Ascii.EM, 10, Ascii.US, Ascii.GS, 88, 80, 6, 74, Utf8.REPLACEMENT_BYTE, 58, 83, 81, 88, Ascii.FF, Ascii.ETB, 88, Ascii.VT, 19, 17, 8, 67, 88, 17, Ascii.FS, 66, 88, 45, 3, 10, Ascii.VT, Ascii.SYN, Ascii.CR, 10, 3, 68, 17, 10, Ascii.SI, 10, Ascii.VT, 19, 10, 68, 51, 37, 50, 68, 7, Ascii.FF, 17, 10, Ascii.SI, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, Ascii.FS, 90, 83, 78, 81, Ascii.FS, 72, 69, 76, 89, 6, Ascii.FS, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC1625lN interfaceC1625lN) throws IOException {
        C4J c4j = new C4J(8);
        C0559Km chunkHeader = C0559Km.A00(interfaceC1625lN, c4j);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC1625lN.AI1();
            return -1L;
        }
        interfaceC1625lN.A3z(8);
        c4j.A0f(0);
        interfaceC1625lN.AG9(c4j.A0l(), 0, 8);
        long sampleDataSize = c4j.A0N();
        interfaceC1625lN.AJJ(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC1625lN interfaceC1625lN) throws IOException {
        interfaceC1625lN.AI1();
        C0559Km A03 = A03(1684108385, interfaceC1625lN, new C4J(8));
        interfaceC1625lN.AJJ(8);
        return Pair.create(Long.valueOf(interfaceC1625lN.A8f()), Long.valueOf(A03.A01));
    }

    public static C0559Km A03(int i, InterfaceC1625lN interfaceC1625lN, C4J c4j) throws IOException {
        C0559Km A002 = C0559Km.A00(interfaceC1625lN, c4j);
        while (A002.A00 != i) {
            AnonymousClass44.A07(A04(91, 15, Opcodes.LUSHR), A04(40, 28, 39) + A002.A00);
            long j = A002.A01 + 8;
            if (j <= 2147483647L) {
                interfaceC1625lN.AJJ((int) j);
                A002 = C0559Km.A00(interfaceC1625lN, c4j);
            } else {
                throw C01042i.A00(A04(0, 40, 59) + A002.A00);
            }
        }
        return A002;
    }

    public static boolean A06(InterfaceC1625lN interfaceC1625lN) throws IOException {
        C4J c4j = new C4J(8);
        C0559Km A002 = C0559Km.A00(interfaceC1625lN, c4j);
        if (A002.A00 != 1380533830) {
            int i = A002.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i != 1380333108) {
                return false;
            }
        }
        interfaceC1625lN.AG9(c4j.A0l(), 0, 4);
        c4j.A0f(0);
        int A0C = c4j.A0C();
        if (A0C != 1463899717) {
            AnonymousClass44.A05(A04(91, 15, Opcodes.LUSHR), A04(68, 23, 127) + A0C);
            return false;
        }
        return true;
    }
}
