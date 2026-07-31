package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AQ implements InterfaceC3714pF {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public C20385i A01;
    public final ArrayList<InterfaceC20495t> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    public AQ(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    @MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0D(C20385i c20385i, boolean z) {
        this.A01 = c20385i;
        for (int i = 0; i < i; i++) {
            this.A02.get(i).AGH(this, c20385i, this.A03, z);
        }
    }

    public final void A0E() {
        C20385i c20385i = (C20385i) C5C.A0f(this.A01);
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i).AGG(this, c20385i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i) {
        C20385i c20385i = (C20385i) C5C.A0f(this.A01);
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A02.get(i2).ADK(this, c20385i, this.A03, i);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0G(C20385i c20385i) {
        for (int i = 0; i < i; i++) {
            this.A02.get(i);
            if (A04[7].charAt(14) == 'P') {
                throw new RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(C20385i c20385i) {
        A0D(c20385i, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3714pF
    public final void A43(InterfaceC20495t interfaceC20495t) {
        AbstractC20023y.A01(interfaceC20495t);
        if (!this.A02.contains(interfaceC20495t)) {
            this.A02.add(interfaceC20495t);
            this.A00++;
        }
    }
}
