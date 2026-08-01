package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class BW implements InterfaceC0898Vg, InterfaceC0899Vh {
    public static String[] A06 = {"ZtwyXb21lqsDJdKT2ajh9JxAXgW69QuB", "FrcJuXyaSLrnc8pAXv2TAxnFyZgF4qHK", "0iGJizGlWH9", "qhteMkWWDojgH5n0mIn7zojGTGtfRfRL", "S4vRLIoihFPQ", "xoDrhUfozcoi1lbYtymgci4hovtTAG3t", "yhmtadr4WKeMx7Xbvtz69UkymvwaYHjB", "iiLQKF6aVsd0mv8Gzt0Boeru5TAZQ446"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC0899Vh A03;
    public C0904Vm[] A04 = new C0904Vm[0];
    public final InterfaceC0898Vg A05;

    public BW(InterfaceC0898Vg interfaceC0898Vg, boolean z, long j, long j2) {
        this.A05 = interfaceC0898Vg;
        this.A02 = z ? j : -9223372036854775807L;
        this.A01 = j;
        this.A00 = j2;
    }

    private C03699v A00(long j, C03699v c03699v) {
        long toleranceBeforeUs = C0557Hx.A0E(c03699v.A01, 0L, j - this.A01);
        long j2 = c03699v.A00;
        long j3 = this.A00;
        long A0E = C0557Hx.A0E(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (toleranceBeforeUs == c03699v.A01 && A0E == c03699v.A00) {
            return c03699v;
        }
        return new C03699v(toleranceBeforeUs, A0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0478Eu
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void AAx(InterfaceC0898Vg interfaceC0898Vg) {
        this.A03.AAx(this);
    }

    public static boolean A02(long j, GO[] goArr) {
        if (j != 0) {
            for (GO go : goArr) {
                if (go != null && !C0534Ha.A09(go.A7m().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final boolean A4Q(long j) {
        return this.A05.A4Q(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final void A55(long j, boolean z) {
        this.A05.A55(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final long A5s(long j, C03699v c03699v) {
        long j2 = this.A01;
        if (j == j2) {
            return j2;
        }
        return this.A05.A5s(j, A00(j, c03699v));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final long A68() {
        long A68 = this.A05.A68();
        if (A68 != Long.MIN_VALUE) {
            long j = this.A00;
            if (j != Long.MIN_VALUE) {
                if (A06[2].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "DtDan6JMsc2D9dL8KrRs9GVt0cLu7T4O";
                if (A68 >= j) {
                }
            }
            return A68;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final long A7M() {
        long A7M = this.A05.A7M();
        if (A7M != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || A7M < j) {
                return A7M;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final TrackGroupArray A82() {
        return this.A05.A82();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final void AA3() throws IOException {
        this.A05.AA3();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0899Vh
    public final void ACW(InterfaceC0898Vg interfaceC0898Vg) {
        this.A03.ACW(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final void ADu(InterfaceC0899Vh interfaceC0899Vh, long j) {
        this.A03 = interfaceC0899Vh;
        this.A05.ADu(this, j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final long AED() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            if (A06[4].length() != 12) {
                throw new RuntimeException();
            }
            A06[6] = "LhyfL76jA11YYofpKqTom8Rw5oMGbfG9";
            this.A02 = -9223372036854775807L;
            long initialDiscontinuityUs = AED();
            return initialDiscontinuityUs != -9223372036854775807L ? initialDiscontinuityUs : childDiscontinuityUs;
        }
        long AED = this.A05.AED();
        if (AED == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        HI.A04(AED >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && AED > discontinuityUs) {
            z = false;
        }
        HI.A04(z);
        return AED;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    public final void AEK(long j) {
        this.A05.AEK(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r6 <= r4) goto L20;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AF0(long j) {
        this.A02 = -9223372036854775807L;
        boolean z = false;
        for (C0904Vm c0904Vm : this.A04) {
            if (c0904Vm != null) {
                c0904Vm.A00();
            }
        }
        long AF0 = this.A05.AF0(j);
        if (AF0 != j) {
            if (AF0 >= this.A01) {
                long j2 = this.A00;
                if (j2 != Long.MIN_VALUE) {
                    if (A06[0].charAt(28) != '9') {
                        throw new RuntimeException();
                    }
                    A06[2] = "Q";
                }
            }
            HI.A04(z);
            return AF0;
        }
        z = true;
        HI.A04(z);
        return AF0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r7 > r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0898Vg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AF1(GO[] goArr, boolean[] zArr, InterfaceC0477Et[] interfaceC0477EtArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        int i;
        this.A04 = new C0904Vm[interfaceC0477EtArr.length];
        InterfaceC0477Et[] interfaceC0477EtArr2 = new InterfaceC0477Et[interfaceC0477EtArr.length];
        int i2 = 0;
        while (true) {
            InterfaceC0477Et interfaceC0477Et = null;
            if (i2 >= interfaceC0477EtArr.length) {
                break;
            }
            C0904Vm[] c0904VmArr = this.A04;
            C0904Vm c0904Vm = (C0904Vm) interfaceC0477EtArr[i2];
            c0904VmArr[i2] = c0904Vm;
            if (c0904Vm != null) {
                interfaceC0477Et = c0904Vm.A01;
            }
            interfaceC0477EtArr2[i2] = interfaceC0477Et;
            i2++;
        }
        long AF1 = this.A05.AF1(goArr, zArr, interfaceC0477EtArr2, zArr2, j);
        if (A03()) {
            long j3 = this.A01;
            if (j == j3 && A02(j3, goArr)) {
                j2 = AF1;
                this.A02 = j2;
                if (AF1 != j) {
                    if (AF1 >= this.A01) {
                        long enablePositionUs = this.A00;
                        if (enablePositionUs != Long.MIN_VALUE) {
                        }
                    }
                    z = false;
                    HI.A04(z);
                    for (i = 0; i < interfaceC0477EtArr.length; i++) {
                        if (interfaceC0477EtArr2[i] == null) {
                            InterfaceC0477Et[] childStreams = this.A04;
                            childStreams[i] = null;
                        } else if (interfaceC0477EtArr[i] == null || this.A04[i].A01 != interfaceC0477EtArr2[i]) {
                            this.A04[i] = new C0904Vm(this, interfaceC0477EtArr2[i]);
                        }
                        InterfaceC0477Et[] childStreams2 = this.A04;
                        interfaceC0477EtArr[i] = childStreams2[i];
                    }
                    return AF1;
                }
                z = true;
                HI.A04(z);
                while (i < interfaceC0477EtArr.length) {
                }
                return AF1;
            }
        }
        j2 = -9223372036854775807L;
        this.A02 = j2;
        if (AF1 != j) {
        }
        z = true;
        HI.A04(z);
        while (i < interfaceC0477EtArr.length) {
        }
        return AF1;
    }
}
