package com.instagram.common.viewpoint.core;

import androidx.core.app.NotificationManagerCompat;

/* renamed from: com.facebook.ads.redexgen.X.ix, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1489ix implements InterfaceC01704w {
    public static String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public InterfaceC01674t A02;
    public InterfaceC01704w A04;
    public InterfaceC0586Ln A05;
    public boolean A07;
    public InterfaceC01704w A03 = new C1767nh();
    public InterfaceC0595Lw A06 = InterfaceC0595Lw.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC01704w
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C7S A5A() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00, this.A01);
    }

    private C7S A01(InterfaceC1771nl interfaceC1771nl, int i, int i2) {
        C1490iy c1490iy;
        InterfaceC0586Ln interfaceC0586Ln = (InterfaceC0586Ln) C3M.A01(this.A05);
        if (this.A07 || interfaceC1771nl == null) {
            c1490iy = null;
        } else if (this.A02 != null) {
            InterfaceC01674t interfaceC01674t = this.A02;
            String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c1490iy = interfaceC01674t.A59();
        } else {
            c1490iy = new C1491iz().A00(interfaceC0586Ln).A59();
        }
        return new C7S(interfaceC0586Ln, interfaceC1771nl, this.A03.A5A(), c1490iy, this.A06, i, null, i2, null);
    }

    public final AnonymousClass31 A02() {
        return null;
    }

    public final C1489ix A03(int i) {
        this.A00 = i;
        return this;
    }

    public final C1489ix A04(InterfaceC01704w interfaceC01704w) {
        this.A03 = interfaceC01704w;
        return this;
    }

    public final C1489ix A05(InterfaceC01704w interfaceC01704w) {
        this.A04 = interfaceC01704w;
        return this;
    }

    public final C1489ix A06(InterfaceC0586Ln interfaceC0586Ln) {
        this.A05 = interfaceC0586Ln;
        return this;
    }

    public final C7S A07() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00 | 1, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
    }
}
