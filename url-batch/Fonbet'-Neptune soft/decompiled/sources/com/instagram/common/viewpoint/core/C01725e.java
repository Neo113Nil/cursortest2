package com.instagram.common.viewpoint.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01725e extends AbstractC0537Jw {
    public static byte[] A02;
    public static String[] A03 = {"ccLmdgMtf", "50lpHgsnQSuWf1CWCacJGyiAwAWsDUud", "Nq2vo108Bdlpu7LWCjcAC5dDG31maruF", "TAe0PaklKNA7XHBVlxrhZCtyBfgeydAO", "ouUdcivF6", "IAXVD4SBpgtyrGYWX4yc8p2wBrUpSeUf", "nA5GNdAWyE31pAGlKcdnPdOQEY7Q2fwD", "a5Dyr8HKQP9cZfy0xnx35qJg31dQk6"};
    public static final int A04;
    public final View A00;
    public final boolean A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].length() != 30) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "FT3046kmt";
            strArr[4] = "J6Q3a22Lt";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{37, 33, 45, 43, 41};
    }

    static {
        A01();
        A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public C01725e(C0991ai c0991ai, boolean z) {
        super(c0991ai, true);
        this.A01 = z;
        this.A00 = c0991ai.A02();
        A1R();
        if (this.A01) {
            addView(c0991ai.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c0991ai.A06());
            RelativeLayout.LayoutParams insideContainerParams = new RelativeLayout.LayoutParams(-1, -1);
            insideContainerParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(insideContainerParams);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC0987ae.A07, 0, AbstractC0987ae.A07, 0);
            frameLayout.addView(this.A00, layoutParams);
            addView(frameLayout);
        }
        C0851Wg A022 = this.A09.A02(getAdDataBundle());
        c0991ai.A06().A0H().A00(A022.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A09);
        if (this.A00 != null) {
            if (A022.A00) {
                this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C01725e.this.A1W(view);
                    }
                });
            } else if (U7.A1I(getAdContextWrapper())) {
                AbstractC0941Zs.A00(this.A00, U7.A1J(getAdContextWrapper()), new ViewOnClickListenerC0993ak(this));
            }
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A0C() {
        return this.A01 && super.A0D();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A0D() {
        return this.A01 && super.A0D();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0537Jw, com.instagram.common.viewpoint.core.AbstractC0987ae
    public final void A1G(C0607Mp c0607Mp, String str, double d, Bundle bundle) {
        super.A1G(c0607Mp, str, d, bundle);
        if (!this.A01 && d > 0.0d) {
            int mediaHeight = (int) ((A04 - (AbstractC0987ae.A07 * 2)) / d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, mediaHeight);
            layoutParams.gravity = 17;
            int i = AbstractC0987ae.A07;
            int mediaHeight2 = AbstractC0987ae.A07;
            layoutParams.setMargins(i, 0, mediaHeight2, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0987ae
    public final boolean A1M() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0537Jw
    public final AbstractC0944Zv A1P(C0991ai c0991ai, C0607Mp c0607Mp, String str) {
        return new C0539Jy(c0991ai.A06(), getCtaButton(), AbstractC0537Jw.A0H, c0607Mp.A0I().A00() == EnumC0612Mu.A05, getColors(), c0607Mp.A0J().A06(), str, c0991ai.A07(), c0991ai.A0D(), c0991ai.A0G(), c0991ai.A0A(), c0991ai.A05());
    }

    public final /* synthetic */ void A1W(View view) {
        getCtaButton().A0E(A00(0, 5, 11));
    }
}
