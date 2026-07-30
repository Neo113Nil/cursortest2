package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1312fq extends MQ {
    public static byte[] A03;
    public static String[] A04 = {"G2rh", "Fb5x", "6CyVQJjLjUxkB4NOtEwwqOuY7kB2daf", "v2svMG5ZVzKjVXyH1MXvdM9krQWCKsNq", "oRWr7RpHwOoI3beQIRyDA09DO9LlUwST", "SjgxBMhR0kRV74MEQavsGpgIJGrbvWLl", "8l9W", "lapvzpZuNASF"};
    public View A00;
    public final C0725Qz A01;
    public final C6M A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {69, 103, 104, 104, 105, 114, 38, 118, 116, 99, 117, 99, 104, 114, 38, 104, 115, 106, 106, 38, 103, 98, 80, 111, 99, 113};
        if (A04[7].length() == 31) {
            throw new RuntimeException();
        }
        A04[0] = "ScK1";
        A03 = bArr;
    }

    static {
        A03();
    }

    public C1312fq(C0725Qz c0725Qz) {
        this.A02 = c0725Qz.A09();
        this.A01 = c0725Qz;
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0C() {
        this.A02.A0F().A4M();
        AbstractC0837Vk.A00(new C1314fs(this));
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0D() {
        this.A02.A0F().A4P();
        AbstractC0837Vk.A00(new C1313fr(this));
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0E(View view) {
        if (view != null) {
            C6M c6m = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[0] = "eqHc";
            c6m.A0F().A4O();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if ((this.A00 instanceof C0555Ki) || (this.A00 instanceof Y9)) {
                V8.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            AnonymousClass72 controller = this.A01.A08();
            if (controller != null) {
                controller.A0L();
            }
            AbstractC0837Vk.A00(new C1315ft(this));
            this.A01.A0B(this.A01.A07(), this.A00);
            if (U7.A1B(this.A01.A07().getContext())) {
                C0941Zm c0941Zm = new C0941Zm();
                this.A01.A0D(c0941Zm);
                c0941Zm.A0C(this.A01.getPlacementId());
                c0941Zm.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0J() != null) {
                    c0941Zm.A09(this.A01.A08().A0J().A0C());
                }
                if (this.A00 instanceof C0555Ki) {
                    c0941Zm.A0A(((C0555Ki) this.A00).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new R7(this, c0941Zm));
                this.A00.getOverlay().add(c0941Zm);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 22));
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0F(MP mp) {
        this.A02.A0F().A4N(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0M();
        }
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0G(V1 v1) {
        this.A02.A0F().A3F(XG.A01(this.A01.A04()), v1.A03().getErrorCode(), v1.A04());
        AbstractC0837Vk.A00(new C1316fu(this, v1));
    }
}
