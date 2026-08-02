package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0530Jp extends AbstractC0987ae implements Wf {
    public static byte[] A05;
    public static final int A06;
    public final AbstractC1428hy A00;
    public final C0852Wh A01;
    public final InterfaceC0884Xn A02;
    public final C1019bA A03;
    public final C1119cm A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{38, 42, Ascii.RS, 36, 34};
    }

    static {
        A01();
        A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C0530Jp(C0991ai c0991ai, boolean z) {
        super(c0991ai, z);
        int id;
        int A01;
        this.A02 = c0991ai.A0D();
        this.A00 = c0991ai.A05();
        this.A03 = new C1019bA(c0991ai.A06(), c0991ai.A02());
        this.A03.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC0987ae.A07, AbstractC0987ae.A07, AbstractC0987ae.A07, AbstractC0987ae.A07);
        getCtaButton().setLayoutParams(layoutParams);
        if (c0991ai.A0I()) {
            this.A04 = new C1119cm(c0991ai.A06());
            this.A04.setPageDetails(c0991ai.A05().A23());
            XP.A0E(PointerIconCompat.TYPE_CROSSHAIR, this.A04);
            RelativeLayout.LayoutParams pageDetailsParams = new RelativeLayout.LayoutParams(-2, -2);
            pageDetailsParams.addRule(2, getCtaButton().getId());
            pageDetailsParams.setMargins(AbstractC0987ae.A07, AbstractC0987ae.A07 - (AbstractC0987ae.A07 / 2), AbstractC0987ae.A07, 0);
            this.A04.setLayoutParams(pageDetailsParams);
            id = this.A04.getId();
            A01 = c0991ai.A01() - (AbstractC0987ae.A07 / 2);
        } else {
            id = getCtaButton().getId();
            A01 = c0991ai.A01();
            this.A04 = null;
        }
        FrameLayout insideContainerLayout = new FrameLayout(c0991ai.A06());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(10);
        layoutParams2.addRule(2, id);
        layoutParams2.setMargins(0, A01, 0, 0);
        insideContainerLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC0987ae.A07, 0, AbstractC0987ae.A07, 0);
        insideContainerLayout.addView(this.A03, layoutParams3);
        addView(insideContainerLayout);
        if (this.A04 != null) {
            addView(this.A04);
        }
        addView(getCtaButton());
        getCtaButton().A0F(c0991ai.A05(), c0991ai.A0C());
        View A02 = c0991ai.A02();
        this.A01 = C0852Wh.A00(c0991ai.A06(), this.A00, this);
        C0851Wg A022 = this.A01.A02(this.A00);
        c0991ai.A06().A0H().A00(A022.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A01);
        if (A02 != null && A022.A00) {
            A02.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.ao
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0530Jp.this.A1O(view);
                }
            });
        } else if (A02 != null && U7.A1I(getAdContextWrapper())) {
            AbstractC0941Zs.A00(A02, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC0998ap(this));
        }
        if (U7.A17(c0991ai.A06())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0991ai.A0C() != null) {
                c0991ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
        if (this.A04 != null && U7.A18(c0991ai.A06())) {
            this.A04.setOnClickListener(getCtaButton());
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A0C() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A0D() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1B() {
        super.A1B();
        this.A01.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1G(C0607Mp c0607Mp, String str, double d, Bundle bundle) {
        super.A1G(c0607Mp, str, d, bundle);
        if (d > 0.0d) {
            int mediaHeight = (int) ((A06 - (AbstractC0987ae.A07 * 2)) / d);
            this.A03.A00(mediaHeight);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A1M() {
        return false;
    }

    public final /* synthetic */ void A1O(View view) {
        getCtaButton().A0E(A00(0, 5, 103));
    }
}
