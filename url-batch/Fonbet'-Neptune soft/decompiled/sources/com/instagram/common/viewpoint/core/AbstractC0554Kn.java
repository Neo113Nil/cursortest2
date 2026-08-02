package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0554Kn {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0552Kl A02(InterfaceC1619lN interfaceC1619lN) throws IOException {
        byte[] bArr;
        C4J c4j = new C4J(16);
        C0553Km A03 = A03(1718449184, interfaceC1619lN, c4j);
        C3M.A08(A03.A01 >= 16);
        interfaceC1619lN.AG9(c4j.A0l(), 0, 16);
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
            interfaceC1619lN.AG9(bArr, 0, i);
        } else {
            bArr = AbstractC01424a.A07;
        }
        interfaceC1619lN.AJJ((int) (interfaceC1619lN.A8a() - interfaceC1619lN.A8f()));
        return new C0552Kl(A0G, A0G2, A0F, A0F2, A0G3, A0G4, bArr);
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

    public static long A00(InterfaceC1619lN interfaceC1619lN) throws IOException {
        C4J c4j = new C4J(8);
        C0553Km chunkHeader = C0553Km.A00(interfaceC1619lN, c4j);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC1619lN.AI1();
            return -1L;
        }
        interfaceC1619lN.A3z(8);
        c4j.A0f(0);
        interfaceC1619lN.AG9(c4j.A0l(), 0, 8);
        long sampleDataSize = c4j.A0N();
        interfaceC1619lN.AJJ(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC1619lN interfaceC1619lN) throws IOException {
        interfaceC1619lN.AI1();
        C0553Km A03 = A03(1684108385, interfaceC1619lN, new C4J(8));
        interfaceC1619lN.AJJ(8);
        return Pair.create(Long.valueOf(interfaceC1619lN.A8f()), Long.valueOf(A03.A01));
    }

    public static C0553Km A03(int i, InterfaceC1619lN interfaceC1619lN, C4J c4j) throws IOException {
        C0553Km A002 = C0553Km.A00(interfaceC1619lN, c4j);
        while (A002.A00 != i) {
            AnonymousClass44.A07(A04(91, 15, 125), A04(40, 28, 39) + A002.A00);
            long j = A002.A01 + 8;
            if (j <= 2147483647L) {
                interfaceC1619lN.AJJ((int) j);
                A002 = C0553Km.A00(interfaceC1619lN, c4j);
            } else {
                throw C00982i.A00(A04(0, 40, 59) + A002.A00);
            }
        }
        return A002;
    }

    public static boolean A06(InterfaceC1619lN interfaceC1619lN) throws IOException {
        C4J c4j = new C4J(8);
        C0553Km A002 = C0553Km.A00(interfaceC1619lN, c4j);
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
        interfaceC1619lN.AG9(c4j.A0l(), 0, 4);
        c4j.A0f(0);
        int A0C = c4j.A0C();
        if (A0C != 1463899717) {
            AnonymousClass44.A05(A04(91, 15, 125), A04(68, 23, 127) + A0C);
            return false;
        }
        return true;
    }
}
