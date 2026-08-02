package com.instagram.common.viewpoint.core;

import androidx.core.app.NotificationManagerCompat;

/* renamed from: com.facebook.ads.redexgen.X.ix, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1483ix implements InterfaceC01644w {
    public static String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public InterfaceC01614t A02;
    public InterfaceC01644w A04;
    public InterfaceC0580Ln A05;
    public boolean A07;
    public InterfaceC01644w A03 = new C1761nh();
    public InterfaceC0589Lw A06 = InterfaceC0589Lw.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.InterfaceC01644w
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C7S A5A() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00, this.A01);
    }

    private C7S A01(InterfaceC1765nl interfaceC1765nl, int i, int i2) {
        C1484iy c1484iy;
        InterfaceC0580Ln interfaceC0580Ln = (InterfaceC0580Ln) C3M.A01(this.A05);
        if (this.A07 || interfaceC1765nl == null) {
            c1484iy = null;
        } else if (this.A02 != null) {
            InterfaceC01614t interfaceC01614t = this.A02;
            String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c1484iy = interfaceC01614t.A59();
        } else {
            c1484iy = new C1485iz().A00(interfaceC0580Ln).A59();
        }
        return new C7S(interfaceC0580Ln, interfaceC1765nl, this.A03.A5A(), c1484iy, this.A06, i, null, i2, null);
    }

    public final AnonymousClass31 A02() {
        return null;
    }

    public final C1483ix A03(int i) {
        this.A00 = i;
        return this;
    }

    public final C1483ix A04(InterfaceC01644w interfaceC01644w) {
        this.A03 = interfaceC01644w;
        return this;
    }

    public final C1483ix A05(InterfaceC01644w interfaceC01644w) {
        this.A04 = interfaceC01644w;
        return this;
    }

    public final C1483ix A06(InterfaceC0580Ln interfaceC0580Ln) {
        this.A05 = interfaceC0580Ln;
        return this;
    }

    public final C7S A07() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00 | 1, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
    }
}
