package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.76, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass76 extends C0751Po {
    public int A00;
    public boolean A01;
    public final AbstractC03238a<AnonymousClass75> A02;
    public final AbstractC03238a<AnonymousClass72> A03;
    public final AbstractC03238a<MJ> A04;
    public final AbstractC03238a<AnonymousClass71> A05;
    public final AbstractC03238a<M8> A06;
    public final AbstractC03238a<LT> A07;
    public final AbstractC03238a<LO> A08;
    public final AbstractC03238a<KJ> A09;
    public final AbstractC03238a<KG> A0A;
    public final RX A0B;
    public final MA A0C;
    public final KK A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AnonymousClass76(YA ya, InterfaceC0565If interfaceC0565If, RX rx, List<C2D> list, String str) {
        super(ya, interfaceC0565If, rx, list, str, !rx.A0h(), new C0750Pn(ya, rx));
        KK kk = new KK() { // from class: com.facebook.ads.redexgen.X.79
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0620Kl c0620Kl) {
                AnonymousClass76.this.A0Z();
            }
        };
        this.A0D = kk;
        RU ru = new RU(this);
        this.A07 = ru;
        RQ rq = new RQ(this);
        this.A03 = rq;
        C0767Qe c0767Qe = new C0767Qe(this);
        this.A04 = c0767Qe;
        Q0 q0 = new Q0(this);
        this.A05 = q0;
        C0762Pz c0762Pz = new C0762Pz(this);
        this.A02 = c0762Pz;
        C0760Px c0760Px = new C0760Px(this);
        this.A06 = c0760Px;
        C0755Ps c0755Ps = new C0755Ps(this);
        this.A09 = c0755Ps;
        C0754Pr c0754Pr = new C0754Pr(this);
        this.A0A = c0754Pr;
        RW rw = new RW(this);
        this.A08 = rw;
        MA ma = new MA() { // from class: com.facebook.ads.redexgen.X.7A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MD md) {
                RX rx2;
                AnonymousClass76 anonymousClass76 = AnonymousClass76.this;
                rx2 = anonymousClass76.A0B;
                anonymousClass76.A00 = rx2.getDuration();
            }
        };
        this.A0C = ma;
        this.A01 = false;
        this.A0B = rx;
        rx.getEventBus().A03(kk, q0, ru, c0767Qe, rq, c0762Pz, c0760Px, c0755Ps, c0754Pr, ma, rw);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public AnonymousClass76(YA ya, InterfaceC0565If interfaceC0565If, RX rx, List<C2D> list, String str, Bundle bundle, Map<String, String> map) {
        super(ya, interfaceC0565If, rx, list, str, !rx.A0h(), bundle, map, new C0750Pn(ya, rx));
        KK kk = new KK() { // from class: com.facebook.ads.redexgen.X.79
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0620Kl c0620Kl) {
                AnonymousClass76.this.A0Z();
            }
        };
        this.A0D = kk;
        RU ru = new RU(this);
        this.A07 = ru;
        RQ rq = new RQ(this);
        this.A03 = rq;
        C0767Qe c0767Qe = new C0767Qe(this);
        this.A04 = c0767Qe;
        Q0 q0 = new Q0(this);
        this.A05 = q0;
        C0762Pz c0762Pz = new C0762Pz(this);
        this.A02 = c0762Pz;
        C0760Px c0760Px = new C0760Px(this);
        this.A06 = c0760Px;
        C0755Ps c0755Ps = new C0755Ps(this);
        this.A09 = c0755Ps;
        C0754Pr c0754Pr = new C0754Pr(this);
        this.A0A = c0754Pr;
        RW rw = new RW(this);
        this.A08 = rw;
        this.A0C = new MA() { // from class: com.facebook.ads.redexgen.X.7A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC03238a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MD md) {
                RX rx2;
                AnonymousClass76 anonymousClass76 = AnonymousClass76.this;
                rx2 = anonymousClass76.A0B;
                anonymousClass76.A00 = rx2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = rx;
        rx.getEventBus().A03(kk, q0, ru, c0767Qe, rq, c0762Pz, c0760Px, c0755Ps, c0754Pr, rw);
    }

    public AnonymousClass76(YA ya, InterfaceC0565If interfaceC0565If, RX rx, String str) {
        this(ya, interfaceC0565If, rx, new ArrayList(), str);
    }

    public AnonymousClass76(YA ya, InterfaceC0565If interfaceC0565If, RX rx, String str, Bundle bundle) {
        this(ya, interfaceC0565If, rx, new ArrayList(), str, bundle, null);
    }

    public AnonymousClass76(YA ya, InterfaceC0565If interfaceC0565If, RX rx, String str, Map<String, String> extraParams) {
        this(ya, interfaceC0565If, rx, new ArrayList(), str, null, extraParams);
    }

    public final void A0g() {
        RV rv = new RV(this);
        if (this.A0B.A0l()) {
            LP.A00(rv);
        } else {
            this.A0B.getStateHandler().post(rv);
        }
    }
}
