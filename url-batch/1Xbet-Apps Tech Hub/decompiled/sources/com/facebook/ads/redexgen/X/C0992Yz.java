package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.Yz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0992Yz extends C02012v {
    public static String[] A02 = {"kCJseLSqSIrXu4CFjUZgH7qP37OfZeHD", "xEAmwUG5TGVzyoKH1PTTnmgJSds6zi0t", "yfye5wiKddzXjwKpYSAHRZ10SdbOyGIS", "FmBYeFx3U0BhjOzbepjZtX", "pFd99JFbVQiCxR8NKRmLZvqZPwpJ8hMq", "9sA", "zOMSQIOQC2uzgyYA4i3GoXbtL5yC1N4Y", "6JUJmYz6"};
    public final C02012v A00 = new Z0(this);
    public final ED A01;

    public C0992Yz(ED ed) {
        this.A01 = ed;
    }

    @Override // com.facebook.ads.redexgen.X.C02012v
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(ED.class.getName());
        if ((view instanceof ED) && !A0B()) {
            ED ed = (ED) view;
            if (ed.getLayoutManager() != null) {
                ed.getLayoutManager().A1x(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C02012v
    public final void A08(View view, C02123g c02123g) {
        super.A08(view, c02123g);
        c02123g.A0O(ED.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c02123g);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C02012v
    public final boolean A09(View view, int i, Bundle bundle) {
        if (super.A09(view, i, bundle)) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[0].charAt(11)) {
                throw new RuntimeException();
            }
            A02[4] = "nByhcE3HAON4xHhAaRL71J2smf2uyoDS";
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            AbstractC02334c layoutManager = this.A01.getLayoutManager();
            if (A02[5].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "ZdbAAVtg";
            strArr2[3] = "rBKlzqXoYmUf6BYv0O8fT1";
            return layoutManager.A1Z(i, bundle);
        }
        return false;
    }

    public final C02012v A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1u();
    }
}
