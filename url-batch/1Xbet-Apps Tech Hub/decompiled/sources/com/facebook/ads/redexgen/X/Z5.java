package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Z5 implements C4W {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ ED A00;

    public Z5(ED ed) {
        this.A00 = ed;
    }

    @Override // com.facebook.ads.redexgen.X.C4W
    public final void AAU(AbstractC02504u abstractC02504u) {
        boolean A0A;
        abstractC02504u.A0Z(true);
        if (abstractC02504u.A06 != null && abstractC02504u.A07 == null) {
            abstractC02504u.A06 = null;
        }
        abstractC02504u.A07 = null;
        A0A = abstractC02504u.A0A();
        if (!A0A && !this.A00.A20(abstractC02504u.A0H) && abstractC02504u.A0e()) {
            ED ed = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            ed.removeDetachedView(abstractC02504u.A0H, false);
        }
    }
}
