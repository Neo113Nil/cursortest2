package com.facebook.ads.redexgen.X;

import androidx.work.WorkRequest;

/* renamed from: com.facebook.ads.redexgen.X.Wb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0916Wb implements InterfaceC0406Bj {
    public final /* synthetic */ C0915Wa A00;

    public C0916Wb(C0915Wa c0915Wa) {
        this.A00 = c0915Wa;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final long A6k() {
        CW cw;
        long j;
        cw = this.A00.A0B;
        j = this.A00.A07;
        return cw.A03(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final C0405Bi A7l(long granule) {
        CW cw;
        long j;
        long A00;
        long j2;
        if (granule == 0) {
            j2 = this.A00.A09;
            return new C0405Bi(new C0407Bk(0L, j2));
        }
        cw = this.A00.A0B;
        long A04 = cw.A04(granule);
        C0915Wa c0915Wa = this.A00;
        j = c0915Wa.A09;
        A00 = c0915Wa.A00(j, A04, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        return new C0405Bi(new C0407Bk(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final boolean A95() {
        return true;
    }
}
