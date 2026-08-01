package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0902Vk implements InterfaceC0524Gq {
    public static String[] A0C = {"G7jWD6ulf4YNSZyKFTHtDKYEexnehBFD", "eAcypqsPfTTSG9tYkNPVa4Ur1OSgM6nM", "x", "tNQG44GENbPBCr6MlCIr3t4n4NF0MmxZ", "OwErIGDXAeY1H11Nt9UmuNZTMubue4sT", "f", "eBkibdjxFKT4WmP6H51EPZ9055c0bCkp", "0Ce9TygyYiJS1KV85oyrWWiGz76nCu"};
    public long A00;
    public long A02;
    public C0516Gg A03;
    public final Uri A05;
    public final ES A07;
    public final InterfaceC0512Gc A08;
    public final HO A09;
    public volatile boolean A0A;
    public final /* synthetic */ BT A0B;
    public final C0404Bh A06 = new C0404Bh();
    public boolean A04 = true;
    public long A01 = -1;

    public C0902Vk(BT bt, Uri uri, InterfaceC0512Gc interfaceC0512Gc, ES es, HO ho) {
        this.A0B = bt;
        this.A05 = (Uri) HI.A01(uri);
        this.A08 = (InterfaceC0512Gc) HI.A01(interfaceC0512Gc);
        this.A07 = (ES) HI.A01(es);
        this.A09 = ho;
    }

    public final void A04(long j, long j2) {
        this.A06.A00 = j;
        this.A02 = j2;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0524Gq
    public final void A47() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0524Gq
    public final void A9B() throws IOException, InterruptedException {
        char charAt;
        char charAt2;
        String str;
        X4 x4;
        long j;
        Handler handler;
        Runnable runnable;
        int result = 0;
        while (result == 0 && !this.A0A) {
            try {
                long j2 = this.A06.A00;
                Uri uri = this.A05;
                str = this.A0B.A0b;
                C0516Gg c0516Gg = new C0516Gg(uri, j2, -1L, str);
                this.A03 = c0516Gg;
                long ADb = this.A08.ADb(c0516Gg);
                this.A01 = ADb;
                if (ADb != -1) {
                    this.A01 = ADb + j2;
                }
                x4 = new X4(this.A08, j2, this.A01);
                InterfaceC0399Ba extractor = this.A07.A02(x4, this.A08.A85());
                if (this.A04) {
                    extractor.AEw(j2, this.A02);
                    this.A04 = false;
                }
                while (result == 0 && !this.A0A) {
                    this.A09.A00();
                    result = extractor.AE9(x4, this.A06);
                    long A7a = x4.A7a();
                    j = this.A0B.A0P;
                    if (A7a > j + j2) {
                        j2 = x4.A7a();
                        this.A09.A01();
                        handler = this.A0B.A0R;
                        runnable = this.A0B.A0a;
                        handler.post(runnable);
                    }
                }
            } finally {
                if (charAt != charAt2) {
                }
                throw new RuntimeException();
            }
            if (result == 1) {
                result = 0;
            } else {
                C0404Bh c0404Bh = this.A06;
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[7] = "RP5F3MQdpmYGlMxTR22UmyqYUd";
                c0404Bh.A00 = x4.A7a();
                this.A00 = this.A06.A00 - this.A03.A01;
            }
            C0557Hx.A0W(this.A08);
        }
    }
}
