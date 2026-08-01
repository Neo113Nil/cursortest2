package com.facebook.ads.redexgen.X;

import androidx.core.app.NotificationManagerCompat;

/* loaded from: assets/audience_network.dex */
public final class E3 {
    public final GZ A00;
    public final InterfaceC0511Gb A01;
    public final InterfaceC0511Gb A02;
    public final H2 A03;
    public final C0545Hl A04;

    public E3(H2 h2, InterfaceC0511Gb interfaceC0511Gb) {
        this(h2, interfaceC0511Gb, null, null, null);
    }

    public E3(H2 h2, InterfaceC0511Gb interfaceC0511Gb, InterfaceC0511Gb interfaceC0511Gb2, GZ gz, C0545Hl c0545Hl) {
        HI.A01(interfaceC0511Gb);
        this.A03 = h2;
        this.A02 = interfaceC0511Gb;
        this.A01 = interfaceC0511Gb2;
        this.A00 = gz;
        this.A04 = c0545Hl;
    }

    public final H2 A00() {
        return this.A03;
    }

    public final V0 A01(boolean z) {
        InterfaceC0512Gc vd;
        V1 v1;
        InterfaceC0511Gb interfaceC0511Gb = this.A01;
        if (interfaceC0511Gb != null) {
            vd = interfaceC0511Gb.A4U();
        } else {
            vd = new VD();
        }
        if (z) {
            return new V0(this.A03, VE.A02, vd, null, 1, null);
        }
        GZ gz = this.A00;
        if (gz != null) {
            v1 = gz.createDataSink();
        } else {
            v1 = new V1(this.A03, 2097152L);
        }
        InterfaceC0512Gc A4U = this.A02.A4U();
        C0545Hl c0545Hl = this.A04;
        if (c0545Hl != null) {
            A4U = new V5(A4U, c0545Hl, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        }
        InterfaceC0512Gc upstream = vd;
        return new V0(this.A03, A4U, upstream, v1, 1, null);
    }

    public final C0545Hl A02() {
        C0545Hl c0545Hl = this.A04;
        return c0545Hl != null ? c0545Hl : new C0545Hl();
    }
}
