package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3663oQ implements InterfaceC19883k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC19883k.A00;
    public ByteBuffer A03 = InterfaceC19883k.A00;
    public C19863i A00 = C19863i.A05;
    public C19863i A01 = C19863i.A05;
    public C19863i A05 = C19863i.A05;
    public C19863i A06 = C19863i.A05;

    public abstract C19863i A09(C19863i c19863i) throws C19873j;

    public final ByteBuffer A00(int i) {
        if (this.A02.capacity() < i) {
            this.A02 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19883k
    public final C19863i A57(C19863i c19863i) throws C19873j {
        this.A00 = c19863i;
        this.A01 = A09(c19863i);
        return AAL() ? this.A01 : C19863i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19883k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC19883k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19883k
    public boolean AAL() {
        return this.A01 != C19863i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19883k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC19883k.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19883k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19883k
    public final void flush() {
        this.A03 = InterfaceC19883k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
