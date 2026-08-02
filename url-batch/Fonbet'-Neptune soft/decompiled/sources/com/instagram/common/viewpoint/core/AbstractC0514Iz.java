package com.instagram.common.viewpoint.core;

import java.io.IOException;
import kotlinx.coroutines.scheduling.TasksKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.Iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0514Iz {
    public static String[] A0D = {"XeH1UKKuz1EDpBeQKhAXaKjrjZgsodJU", "Qh9sfVWsiKdbMkoZ0Fly5mM08PFSskfX", "g5Vgu", "IbV76iHRvjKg6MHaSQGzPOhr6f1ApNQX", "p6vckuBwU2Q2AllMmzSrbAD", "CWShENYx4MqsFhdcA74Ut20lXSF9FxoW", "efy3JamC8vBQUYLSbDR2yGzuJR", "AxMKck"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public GY A06;
    public H1 A07;
    public InterfaceC0511Iw A08;
    public boolean A0A;
    public boolean A0B;
    public final C0509Iu A0C = new C0509Iu();
    public C0513Iy A09 = new C0513Iy();

    public abstract long A09(C4J c4j);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean A0C(C4J c4j, long j, C0513Iy c0513Iy) throws IOException;

    @RequiresNonNull({"trackOutput"})
    private int A00(InterfaceC1619lN interfaceC1619lN) throws IOException {
        if (A03(interfaceC1619lN)) {
            this.A00 = this.A09.A00.A0G;
            if (!this.A0A) {
                this.A07.A6W(this.A09.A00);
                this.A0A = true;
            }
            InterfaceC0511Iw interfaceC0511Iw = this.A09.A01;
            String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                throw new RuntimeException();
            }
            A0D[7] = "ikA5IIIrIRBN8L1z";
            if (interfaceC0511Iw != null) {
                this.A08 = this.A09.A01;
            } else if (interfaceC1619lN.A8G() == -1) {
                this.A08 = new C1571kP();
            } else {
                C0510Iv A02 = this.A0C.A02();
                this.A08 = new C1577kV(this, this.A04, interfaceC1619lN.A8G(), A02.A01 + A02.A00, A02.A05, (A02.A04 & 4) != 0);
            }
            this.A01 = 2;
            this.A0C.A04();
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r5 >= r18.A05) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        r2 = r18.A02;
        r12 = A05(r2);
        r18.A07.AI7(r8, r8.A0A());
        r18.A07.AIA(r12, 1, r8.A0A(), 0, null);
        r18.A05 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r5 >= r18.A05) goto L26;
     */
    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A01(InterfaceC1619lN interfaceC1619lN, C0457Gt c0457Gt) throws IOException {
        long AGd = this.A08.AGd(interfaceC1619lN);
        if (AGd >= 0) {
            c0457Gt.A00 = AGd;
            return 1;
        }
        if (AGd < -1) {
            if (A0D[1].charAt(30) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[2] = "VTxPX";
            strArr[6] = "vg288hyM3d7P0eFgaD3UTrluSy";
            long position = -(2 + AGd);
            A0A(position);
        }
        if (!this.A0B) {
            this.A06.AIN((InterfaceC0460Gw) C3M.A02(this.A08.A5R()));
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(interfaceC1619lN)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        C4J A01 = this.A0C.A01();
        long A09 = A09(A01);
        if (A09 >= 0) {
            long j = this.A02 + A09;
            String[] strArr2 = A0D;
            if (strArr2[2].length() != strArr2[6].length()) {
                A0D[0] = "EPgFULMjpXPDE9er32WaoAxqXEcFdYah";
            }
        }
        this.A02 += A09;
        return 0;
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    private void A02() {
        C3M.A02(this.A07);
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = TasksKt.BlockingContext)
    private boolean A03(InterfaceC1619lN interfaceC1619lN) throws IOException {
        while (true) {
            C0509Iu c0509Iu = this.A0C;
            String[] strArr = A0D;
            if (strArr[5].charAt(2) == strArr[3].charAt(2)) {
                break;
            }
            A0D[7] = "RUb6h5R55PuDixsZqq";
            if (!c0509Iu.A05(interfaceC1619lN)) {
                this.A01 = 3;
                return false;
            }
            this.A03 = interfaceC1619lN.A8f() - this.A04;
            if (A0C(this.A0C.A01(), this.A04, this.A09)) {
                long A8f = interfaceC1619lN.A8f();
                if (A0D[7].length() == 17) {
                    break;
                }
                A0D[0] = "MjaWWlFxdP245keDLyVkXHL1D0C1Hazn";
                this.A04 = A8f;
            } else {
                return true;
            }
        }
        throw new RuntimeException();
    }

    public final int A04(InterfaceC1619lN interfaceC1619lN, C0457Gt c0457Gt) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                return A00(interfaceC1619lN);
            case 1:
                interfaceC1619lN.AJJ((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC1619lN, c0457Gt);
            case 3:
                return -1;
            default:
                throw new IllegalStateException();
        }
    }

    public final long A05(long j) {
        return (1000000 * j) / this.A00;
    }

    public final long A06(long j) {
        return (this.A00 * j) / 1000000;
    }

    public final void A07(long j, long j2) {
        this.A0C.A03();
        if (j == 0) {
            A0B(!this.A0B);
        } else {
            if (this.A01 == 0) {
                return;
            }
            this.A05 = A06(j2);
            ((InterfaceC0511Iw) AbstractC01424a.A0f(this.A08)).AJR(this.A05);
            this.A01 = 2;
        }
    }

    public final void A08(GY gy, H1 h1) {
        this.A06 = gy;
        this.A07 = h1;
        A0B(true);
    }

    public void A0A(long j) {
        this.A02 = j;
    }

    public void A0B(boolean z) {
        if (z) {
            this.A09 = new C0513Iy();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
