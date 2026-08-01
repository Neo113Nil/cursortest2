package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ub, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0867Ub implements InterfaceC0742Pf {
    public static String[] A01 = {"T9VzL8fHxpfySiwwlXedeY7mX", "guyVlBlOMcVDAIfN1wPFopCO0r0Zk0gq", "ttKJ4peW2WPtu1OROjgTykJGR", "A5J8ePX4fIk14ZpUSfaCkLGHXqqMAYt6", "kQp8myZeu", "7L0NbJj9RoUIRUZ", "UhNplE17b8XX", "zMftdbZDucx4tcPG97oOAYZ8vQU5TBbw"};
    public final /* synthetic */ UV A00;

    public C0867Ub(UV uv) {
        this.A00 = uv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0742Pf
    public final void ADP() {
        AtomicBoolean atomicBoolean;
        InterfaceC0583Ix interfaceC0583Ix;
        InterfaceC0583Ix interfaceC0583Ix2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC0583Ix = this.A00.A02;
        if (interfaceC0583Ix != null) {
            interfaceC0583Ix2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            boolean z = atomicBoolean2.get();
            if (A01[1].charAt(3) == 'h') {
                throw new RuntimeException();
            }
            A01[3] = "0cRb1Hjpfivo5OpVdykyl3dtou8RqpBl";
            interfaceC0583Ix2.ACK(z);
        }
    }
}
