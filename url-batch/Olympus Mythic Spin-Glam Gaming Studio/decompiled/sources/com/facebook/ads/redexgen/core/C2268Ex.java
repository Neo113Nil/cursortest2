package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2268Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C3733pY A01;
    public final Object A02;
    public final C21007s[] A03;
    public final InterfaceC3590nE[] A04;

    public C2268Ex(C21007s[] c21007sArr, InterfaceC3590nE[] interfaceC3590nEArr, C3733pY c3733pY, Object obj) {
        this.A03 = c21007sArr;
        this.A04 = (InterfaceC3590nE[]) interfaceC3590nEArr.clone();
        this.A01 = c3733pY;
        this.A02 = obj;
        this.A00 = c21007sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C2268Ex c2268Ex, int i) {
        if (c2268Ex == null) {
            return false;
        }
        C21007s[] c21007sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c21007sArr[i], c2268Ex.A03[i])) {
                return false;
            }
            InterfaceC3590nE interfaceC3590nE = this.A04[i];
            InterfaceC3590nE interfaceC3590nE2 = c2268Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC3590nE, interfaceC3590nE2);
            }
        }
        throw new RuntimeException();
    }
}
