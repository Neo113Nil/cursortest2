package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KQ {
    public static String[] A0I = {"PiFB59Vxde45j8XGh3VNLS0bXquL", "eCGnEp7n3q", "QH0EN4bfbiXOmvaYxmEgWcgYRTVGFgtW", "ynU2FJVvbbIz4lLWIxM7HwzaaEzIs2yM", "B", "nKAZbJPu58l8", "2xLWRKjlXe7o2y", "tMbtJGMRwKJD523"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final H1 A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<C0453Gp> A0D = new SparseArray<>();
    public final SparseArray<C0452Go> A0C = new SparseArray<>();
    public KP A06 = new KP();
    public KP A07 = new KP();
    public byte[] A0B = new byte[128];
    public final C0456Gs A0E = new C0456Gs(this.A0B, 0, 0);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A05(byte[] bArr, int i, int i2) {
        String[] strArr;
        if (this.A08) {
            int i3 = i2 - i;
            if (this.A0B.length < this.A00 + i3) {
                byte[] bArr2 = this.A0B;
                int i4 = this.A00;
                if (A0I[2].charAt(10) != 'z') {
                    A0I[3] = "fF62whIImPZuUxQ3wOrH7qahZ1W3GZDe";
                    this.A0B = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                throw new RuntimeException();
            }
            System.arraycopy(bArr, i, this.A0B, this.A00, i3);
            this.A00 += i3;
            this.A0E.A08(this.A0B, 0, this.A00);
            if (this.A0E.A0B(8)) {
                this.A0E.A06();
                int A05 = this.A0E.A05(2);
                this.A0E.A07(5);
                if (this.A0E.A09()) {
                    this.A0E.A04();
                    if (this.A0E.A09()) {
                        int A04 = this.A0E.A04();
                        if (!this.A0H) {
                            this.A08 = false;
                            this.A07.A03(A04);
                            if (A0I[1].length() == 10) {
                                String[] strArr2 = A0I;
                                strArr2[4] = "L";
                                strArr2[0] = "t7NRPrzJk7qeXS0lN2m3lGyrxGU0";
                                return;
                            }
                            throw new RuntimeException();
                        }
                        if (this.A0E.A09()) {
                            int A042 = this.A0E.A04();
                            if (this.A0C.indexOfKey(A042) < 0) {
                                this.A08 = false;
                                return;
                            }
                            C0452Go c0452Go = this.A0C.get(A042);
                            C0453Gp c0453Gp = this.A0D.get(c0452Go.A01);
                            if (c0453Gp.A0D) {
                                if (!this.A0E.A0B(2)) {
                                    return;
                                } else {
                                    this.A0E.A07(2);
                                }
                            }
                            C0456Gs c0456Gs = this.A0E;
                            int i5 = c0453Gp.A02;
                            if (A0I[3].charAt(31) != 'R') {
                                String[] strArr3 = A0I;
                                strArr3[4] = "Y";
                                strArr3[0] = "LBdvSwh0xb7fkSyUzFJrubBBNhQW";
                                if (!c0456Gs.A0B(i5)) {
                                    return;
                                }
                            } else if (!c0456Gs.A0B(i5)) {
                                return;
                            }
                            boolean z = false;
                            boolean z2 = false;
                            boolean z3 = false;
                            int A052 = this.A0E.A05(c0453Gp.A02);
                            if (c0453Gp.A0C) {
                                if (A0I[1].length() != 10) {
                                    A0I[6] = "9PoEa2ZU2Rc4Mb";
                                } else {
                                    A0I[6] = "45zkVvkeN2w0fF";
                                }
                            } else {
                                if (!this.A0E.A0B(1)) {
                                    return;
                                }
                                z = this.A0E.A0A();
                                if (z) {
                                    if (!this.A0E.A0B(1)) {
                                        return;
                                    }
                                    z3 = this.A0E.A0A();
                                    z2 = true;
                                } else if (A0I[3].charAt(31) != 'R') {
                                    String[] strArr4 = A0I;
                                    strArr4[4] = "3";
                                    strArr4[0] = "19iwLQZiC4kcbLDxX6EkwfmmLREP";
                                }
                            }
                            boolean z4 = this.A01 == 5;
                            int i6 = 0;
                            if (z4) {
                                if (!this.A0E.A09()) {
                                    return;
                                } else {
                                    i6 = this.A0E.A04();
                                }
                            }
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            int i10 = 0;
                            if (c0453Gp.A07 != 0) {
                                if (c0453Gp.A07 == 1 && !c0453Gp.A0B) {
                                    if (!this.A0E.A09()) {
                                        return;
                                    }
                                    i9 = this.A0E.A03();
                                    if (c0452Go.A02 && !z) {
                                        if (!this.A0E.A09()) {
                                            return;
                                        } else {
                                            i10 = this.A0E.A03();
                                        }
                                    }
                                }
                                strArr = A0I;
                                if (strArr[5].length() == strArr[7].length()) {
                                }
                            } else {
                                if (!this.A0E.A0B(c0453Gp.A06)) {
                                    return;
                                }
                                i7 = this.A0E.A05(c0453Gp.A06);
                                if (c0452Go.A02 && !z) {
                                    if (!this.A0E.A09()) {
                                        return;
                                    }
                                    i8 = this.A0E.A03();
                                    if (A0I[3].charAt(31) != 'R') {
                                        A0I[2] = "kr3yeibAy42hiyE0dA9TA4Dy6aRxjun2";
                                    } else {
                                        A0I[1] = "MkKVWDrQaD";
                                    }
                                }
                                strArr = A0I;
                                if (strArr[5].length() == strArr[7].length()) {
                                    A0I[1] = "lSna5RLd1h";
                                } else {
                                    A0I[6] = "3KoChTLYrqIZNd";
                                }
                            }
                            this.A07.A04(c0453Gp, A05, A04, A052, A042, z, z2, z3, z4, i6, i7, i8, i9, i10);
                            this.A08 = false;
                        }
                    }
                }
            }
        }
    }

    public KQ(H1 h1, boolean z, boolean z2) {
        this.A0F = h1;
        this.A0G = z;
        this.A0H = z2;
        A01();
    }

    private void A00(int i) {
        if (this.A05 == -9223372036854775807L) {
            return;
        }
        boolean z = this.A0A;
        this.A0F.AIA(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    public final void A02(long j, int i, long j2) {
        this.A01 = i;
        this.A03 = j2;
        this.A02 = j;
        if (!this.A0G || this.A01 != 1) {
            if (!this.A0H) {
                return;
            }
            if (this.A01 != 5 && this.A01 != 1 && this.A01 != 2) {
                return;
            }
        }
        KP kp = this.A06;
        KP kp2 = this.A07;
        if (A0I[1].length() != 10) {
            throw new RuntimeException();
        }
        A0I[6] = "uj74NyijhUvg4q";
        this.A06 = kp2;
        this.A07 = kp;
        KP newSliceHeader = this.A07;
        newSliceHeader.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A03(C0452Go c0452Go) {
        this.A0C.append(c0452Go.A00, c0452Go);
    }

    public final void A04(C0453Gp c0453Gp) {
        this.A0D.append(c0453Gp.A09, c0453Gp);
    }

    public final boolean A06() {
        return this.A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A07(long j, int i, boolean z, boolean z2) {
        boolean A00;
        boolean z3 = false;
        if (this.A01 != 9) {
            if (this.A0H) {
                A00 = this.A07.A00(this.A06);
            }
            if (this.A0G) {
                z2 = this.A07.A05();
            }
            boolean z4 = this.A0A;
            if (this.A01 != 5 || (z2 && this.A01 == 1)) {
                z3 = true;
            }
            this.A0A = z4 | z3;
            boolean treatIFrameAsKeyframe = this.A0A;
            return treatIFrameAsKeyframe;
        }
        if (z && this.A09) {
            A00(i + ((int) (j - this.A02)));
        }
        this.A04 = this.A02;
        this.A05 = this.A03;
        this.A0A = false;
        this.A09 = true;
        if (this.A0G) {
        }
        boolean z42 = this.A0A;
        if (this.A01 != 5) {
        }
        z3 = true;
        this.A0A = z42 | z3;
        boolean treatIFrameAsKeyframe2 = this.A0A;
        return treatIFrameAsKeyframe2;
    }
}
