package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.g9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1330g9 implements InterfaceC0685Pl {
    public static byte[] A01;
    public final /* synthetic */ C02066g A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, Ascii.SI, Ascii.SI, 8, 7, -61, 4, Ascii.ETB, Ascii.ETB, 4, 6, Ascii.VT, -61, Ascii.DC2, 17, -61, 4, -61, 6, Ascii.VT, Ascii.FF, Ascii.SI, 7, -61, Ascii.SUB, Ascii.VT, Ascii.FF, 6, Ascii.VT, -61, Ascii.FF, Ascii.SYN, -61, 17, Ascii.DC2, Ascii.ETB, -61, 7, 8, Ascii.ETB, 4, 6, Ascii.VT, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C1330g9(C02066g c02066g) {
        this.A00 = c02066g;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final void A4C(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC0706Qg A0F = C02066g.A0F(view);
        if (A0F != null) {
            if (A0F.A0i() || A0F.A0l()) {
                A0F.A0V();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + A0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final void A5o(int i) {
        AbstractC0706Qg A0F;
        View view = A79(i);
        if (view != null && (A0F = C02066g.A0F(view)) != null) {
            if (!A0F.A0i() || A0F.A0l()) {
                A0F.A0Z(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + A0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final View A79(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final int A7A() {
        return this.A00.getChildCount();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final AbstractC0706Qg A7D(View view) {
        return C02066g.A0F(view);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final int A9z(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final void ADA(View view) {
        AbstractC0706Qg A0F = C02066g.A0F(view);
        if (A0F != null) {
            A0F.A0D(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final void ADv(View view) {
        AbstractC0706Qg A0F = C02066g.A0F(view);
        if (A0F != null) {
            A0F.A0E(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final void AHg() {
        int A7A = A7A();
        for (int i = 0; i < A7A; i++) {
            View A79 = A79(i);
            this.A00.A1g(A79);
            A79.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final void AHm(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0685Pl
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1f(view);
    }
}
