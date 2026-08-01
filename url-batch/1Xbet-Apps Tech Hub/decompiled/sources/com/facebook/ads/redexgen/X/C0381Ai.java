package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0381Ai extends ZB {
    public final /* synthetic */ C0374Ab A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.ZB
    public final int A0O(View view, int i) {
        int i2;
        AbstractC02334c A08 = A08();
        if (!A08.A24()) {
            return 0;
        }
        C02344d c02344d = (C02344d) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c02344d.leftMargin, A08.A0n(view) + c02344d.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i);
        i2 = this.A00.A02;
        return A0N + i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381Ai(C0374Ab c0374Ab, YA ya) {
        super(ya);
        this.A00 = c0374Ab;
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final float A0J(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final PointF A0P(int i) {
        return this.A00.A4L(i);
    }
}
