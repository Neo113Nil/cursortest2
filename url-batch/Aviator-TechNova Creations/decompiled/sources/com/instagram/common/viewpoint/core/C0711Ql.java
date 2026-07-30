package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ql, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0711Ql {
    public C0708Qi A00 = new C0708Qi();
    public final InterfaceC0709Qj A01;

    public C0711Ql(InterfaceC0709Qj interfaceC0709Qj) {
        this.A01 = interfaceC0709Qj;
    }

    public final View A00(int i, int i2, int i3, int i4) {
        int A8Z = this.A01.A8Z();
        int next = this.A01.A8Y();
        int childEnd = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View A79 = this.A01.A79(i);
            int A7C = this.A01.A7C(A79);
            int i5 = this.A01.A7B(A79);
            this.A00.A03(A8Z, next, A7C, i5);
            if (i3 != 0) {
                this.A00.A01();
                this.A00.A02(i3);
                if (this.A00.A04()) {
                    return A79;
                }
            }
            if (i4 != 0) {
                this.A00.A01();
                this.A00.A02(i4);
                if (this.A00.A04()) {
                    view = A79;
                }
            }
            i += childEnd;
        }
        return view;
    }
}
