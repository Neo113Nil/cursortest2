package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0423Ck {
    public static String[] A0I = {"F0jWKjQTCy62z5RMZ8LXaJxAHVXVw03", "jefijzmMiLSAGWVfBYlCHQnNu7WiK65", "5NKy3uod9nHosUme2DvPYxtYVEy", "OBCuuRHFU9olC8zTnYpCIYDmocSOdWsL", "GchpYIdYbHeAJ5Ou", "h9yGOulo4c92iX", "0WO8HWLEfGPVrZyS", "YTVxkuYMC8IrkJuZM8HCcFhUbHlAsN8p"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public byte[] A0B;
    public final InterfaceC0409Bm A0E;
    public final C0542Hi A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0536Hc> A0D = new SparseArray<>();
    public final SparseArray<C0535Hb> A0C = new SparseArray<>();
    public C0422Cj A06 = new C0422Cj();
    public C0422Cj A07 = new C0422Cj();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A06(byte[] bArr, int i, int i2) {
        if (this.A08) {
            int i3 = i2 - i;
            byte[] bArr2 = this.A0B;
            int length = bArr2.length;
            int i4 = this.A00;
            if (length < i4 + i3) {
                int i5 = (i4 + i3) * 2;
                String[] strArr = A0I;
                if (strArr[0].length() == strArr[1].length()) {
                    String[] strArr2 = A0I;
                    strArr2[0] = "I85ez55UKF4vR6ktlfwpENhqyCssmG4";
                    strArr2[1] = "5okjmZY1XRxLGurOWaApunPnJUdAZAM";
                    this.A0B = Arrays.copyOf(bArr2, i5);
                }
                throw new RuntimeException();
            }
            System.arraycopy(bArr, i, this.A0B, this.A00, i3);
            int i6 = this.A00 + i3;
            this.A00 = i6;
            this.A0F.A08(this.A0B, 0, i6);
            if (this.A0F.A0B(8)) {
                this.A0F.A06();
                int A05 = this.A0F.A05(2);
                this.A0F.A07(5);
                if (this.A0F.A09()) {
                    this.A0F.A04();
                    if (this.A0F.A09()) {
                        int A04 = this.A0F.A04();
                        if (!this.A0H) {
                            this.A08 = false;
                            this.A07.A03(A04);
                            return;
                        }
                        if (this.A0F.A09()) {
                            int A042 = this.A0F.A04();
                            if (this.A0C.indexOfKey(A042) < 0) {
                                this.A08 = false;
                                return;
                            }
                            C0535Hb c0535Hb = this.A0C.get(A042);
                            C0536Hc c0536Hc = this.A0D.get(c0535Hb.A01);
                            if (c0536Hc.A09) {
                                if (this.A0F.A0B(2)) {
                                    C0542Hi c0542Hi = this.A0F;
                                    if (A0I[2].length() != 18) {
                                        A0I[2] = "BDS58Myee4yHYxTG8mu";
                                        c0542Hi.A07(2);
                                    }
                                    throw new RuntimeException();
                                }
                                return;
                            }
                            if (this.A0F.A0B(c0536Hc.A01)) {
                                boolean z = false;
                                boolean z2 = false;
                                boolean z3 = false;
                                int A052 = this.A0F.A05(c0536Hc.A01);
                                if (c0536Hc.A08) {
                                    if (A0I[5].length() != 7) {
                                        String[] strArr3 = A0I;
                                        strArr3[6] = "E8pM94a91AlwBow9";
                                        strArr3[4] = "HP5p1w370WRNIPZM";
                                    } else {
                                        A0I[5] = "F8tLSSZzAzz";
                                    }
                                } else {
                                    if (!this.A0F.A0B(1)) {
                                        return;
                                    }
                                    z = this.A0F.A0A();
                                    if (z) {
                                        if (!this.A0F.A0B(1)) {
                                            return;
                                        }
                                        z3 = this.A0F.A0A();
                                        z2 = true;
                                    }
                                }
                                boolean z4 = this.A01 == 5;
                                int i7 = 0;
                                if (z4) {
                                    if (!this.A0F.A09()) {
                                        return;
                                    } else {
                                        i7 = this.A0F.A04();
                                    }
                                }
                                int i8 = 0;
                                int i9 = 0;
                                int i10 = 0;
                                int i11 = 0;
                                if (c0536Hc.A04 == 0) {
                                    if (!this.A0F.A0B(c0536Hc.A03)) {
                                        return;
                                    }
                                    i8 = this.A0F.A05(c0536Hc.A03);
                                    if (c0535Hb.A02 && !z) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        } else {
                                            i9 = this.A0F.A03();
                                        }
                                    }
                                } else if (c0536Hc.A04 == 1 && !c0536Hc.A07) {
                                    if (!this.A0F.A09()) {
                                        return;
                                    }
                                    i10 = this.A0F.A03();
                                    if (c0535Hb.A02 && !z) {
                                        if (!this.A0F.A09()) {
                                            return;
                                        } else {
                                            i11 = this.A0F.A03();
                                        }
                                    }
                                }
                                this.A07.A04(c0536Hc, A05, A04, A052, A042, z, z2, z3, z4, i7, i8, i9, i10, i11);
                                this.A08 = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public C0423Ck(InterfaceC0409Bm interfaceC0409Bm, boolean z, boolean z2) {
        this.A0E = interfaceC0409Bm;
        this.A0G = z;
        this.A0H = z2;
        byte[] bArr = new byte[128];
        this.A0B = bArr;
        this.A0F = new C0542Hi(bArr, 0, 0);
        A01();
    }

    private void A00(int i) {
        boolean z = this.A0A;
        this.A0E.AEs(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A02(long j, int i) {
        int i2;
        boolean A00;
        boolean z = false;
        if (this.A01 != 9) {
            if (this.A0H) {
                A00 = this.A07.A00(this.A06);
            }
            boolean z2 = this.A0A;
            i2 = this.A01;
            if (i2 != 5 || (this.A0G && i2 == 1 && this.A07.A05())) {
                z = true;
            }
            this.A0A = z2 | z;
        }
        boolean z3 = this.A09;
        String[] strArr = A0I;
        if (strArr[0].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0I[2] = "rg9RD6QhDdRr";
        if (z3) {
            A00(i + ((int) (j - this.A02)));
        }
        this.A04 = this.A02;
        this.A05 = this.A03;
        this.A0A = false;
        this.A09 = true;
        boolean z22 = this.A0A;
        i2 = this.A01;
        if (i2 != 5) {
        }
        z = true;
        this.A0A = z22 | z;
    }

    public final void A03(long j, int i, long j2) {
        this.A01 = i;
        this.A03 = j2;
        this.A02 = j;
        if (!this.A0G || i != 1) {
            if (!this.A0H) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        C0422Cj c0422Cj = this.A06;
        C0422Cj newSliceHeader = this.A07;
        this.A06 = newSliceHeader;
        this.A07 = c0422Cj;
        c0422Cj.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A04(C0535Hb c0535Hb) {
        this.A0C.append(c0535Hb.A00, c0535Hb);
    }

    public final void A05(C0536Hc c0536Hc) {
        this.A0D.append(c0536Hc.A05, c0536Hc);
    }

    public final boolean A07() {
        return this.A0H;
    }
}
