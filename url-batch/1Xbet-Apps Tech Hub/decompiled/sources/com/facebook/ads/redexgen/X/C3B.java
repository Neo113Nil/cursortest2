package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3B extends AbstractC0443Dl implements Handler.Callback {
    public static String[] A0D = {"gjDhtLri4FaGEAWjRmzGOIMLbPPteIUr", "gp3Mr1PqMY6rayIsxO9yJntmkSBHR7UD", "5ZPDaEp5A16UYvNfALSoSfbuhC4Pwik1", "wt", "uAQVQjgSUgDp2O8dWeXQS6qYbl", "Gm3ZCOzsQkh90YHushfajnERb16f", "RaSLUB1F0sju8CZYqMhotlzh76Y2FLCY", "Ujo7akDRrtwDl4IVTi3qcCtKoi2"};
    public int A00;
    public int A01;
    public Format A02;
    public InterfaceC0894Vc A03;
    public BO A04;
    public BN A05;
    public BN A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C9X A0A;
    public final FY A0B;
    public final FZ A0C;

    public C3B(FZ fz, Looper looper) {
        this(fz, looper, FY.A00);
    }

    public C3B(FZ fz, Looper looper, FY fy) {
        super(3);
        this.A0C = (FZ) HI.A01(fz);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = fy;
        this.A0A = new C9X();
    }

    private long A00() {
        int i = this.A01;
        if (i == -1 || i >= this.A06.A6u()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6t(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        BN bn = this.A06;
        if (bn != null) {
            bn.A08();
            this.A06 = null;
        }
        BN bn2 = this.A05;
        if (bn2 != null) {
            bn2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.AEO();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4W(this.A02);
    }

    private void A05(List<FV> list) {
        this.A0C.AB0(list);
    }

    private void A06(List<FV> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl
    public final void A15(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
        } else {
            A02();
            this.A03.flush();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0443Dl
    public final void A17(Format[] formatArr, long j) throws C9K {
        Format format = formatArr[0];
        this.A02 = format;
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4W(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final boolean A8q() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.XS
    public final boolean A90() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r7 == Long.MAX_VALUE) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r10.A00 != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        A02();
        r10.A08 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r7 == Long.MAX_VALUE) goto L32;
     */
    @Override // com.facebook.ads.redexgen.X.XS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEb(long j, long j2) throws C9K {
        if (this.A08) {
            return;
        }
        if (this.A05 == null) {
            this.A03.AFQ(j);
            try {
                this.A05 = this.A03.A51();
            } catch (FX e) {
                throw C9K.A01(e, A0y());
            }
        }
        if (A7t() != 2) {
            return;
        }
        boolean z = false;
        if (this.A06 != null) {
            long A00 = A00();
            while (A00 <= j) {
                this.A01++;
                A00 = A00();
                z = true;
            }
        }
        BN bn = this.A05;
        if (A0D[5].length() == 31) {
            throw new RuntimeException();
        }
        A0D[3] = "KD";
        if (bn != null) {
            boolean textRendererNeedsUpdate = bn.A04();
            if (textRendererNeedsUpdate) {
                if (!z) {
                    long A002 = A00();
                    String[] strArr = A0D;
                    if (strArr[2].charAt(19) != strArr[6].charAt(19)) {
                        String[] strArr2 = A0D;
                        strArr2[2] = "xJP4O1R5iBehlF3gjm9oxj2d0if1stmE";
                        strArr2[6] = "mrFlrw4gjycn3JZxSawox6A5ZMqGzaMP";
                    } else {
                        String[] strArr3 = A0D;
                        strArr3[1] = "j9HNvuqeLVtstiy16y9LH7E8URqfplUR";
                        strArr3[0] = "4Jhirnf8T6FRv4glusNGUbVI8l7wWqUm";
                    }
                }
            } else if (((XD) this.A05).A01 <= j) {
                BN bn2 = this.A06;
                if (bn2 != null) {
                    bn2.A08();
                }
                BN bn3 = this.A05;
                this.A06 = bn3;
                this.A05 = null;
                this.A01 = bn3.A7L(j);
                z = true;
            }
        }
        if (z) {
            A06(this.A06.A6T(j));
        }
        if (this.A00 == 2) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A07;
                if (!textRendererNeedsUpdate2) {
                    if (this.A04 == null) {
                        BO A50 = this.A03.A50();
                        this.A04 = A50;
                        if (A50 == null) {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        this.A04.A02(4);
                        this.A03.AE8(this.A04);
                        this.A04 = null;
                        this.A00 = 2;
                        return;
                    }
                    int A10 = A10(this.A0A, this.A04, false);
                    if (A0D[3].length() != 2) {
                        throw new RuntimeException();
                    }
                    A0D[5] = "w0qgeVmaHT9zi92RU59iiGmHeY";
                    if (A10 == -4) {
                        boolean textRendererNeedsUpdate3 = this.A04.A04();
                        if (textRendererNeedsUpdate3) {
                            this.A07 = true;
                        } else {
                            this.A04.A00 = this.A0A.A00.A0G;
                            this.A04.A08();
                        }
                        this.A03.AE8(this.A04);
                        this.A04 = null;
                    } else if (A10 == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (FX e2) {
                throw C9K.A01(e2, A0y());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03669s
    public final int AFt(Format format) {
        if (this.A0B.AFu(format)) {
            return AbstractC0443Dl.A0x(null, format.A0H) ? 4 : 2;
        }
        if (C0534Ha.A0A(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A05((List) message.obj);
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
