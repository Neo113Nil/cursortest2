package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03579j extends S0 {
    public static String[] A00 = {"4DJOkXe9rib7uWc4nLa4kcuSPdxs7gf4", "Dyxr4XzeXsq4jjw5BU630cyoQdL32ISv", "MScpZjpz", "3XC0FNsyX3k6WX9dbHhU9IwCEOagJZ1X", "JEKgPGdFYfe9RoD8dW0t8x0Mvi1GtEmi", "N5tdloXdcly7PUtxD1ZshZXdUDk2Lr2A", "5elKCHWntj6O1Wqi1faAvLWvEV4yzp2T", "JBMx9492vmjOwkRP6"};

    public C03579j(C2O c2o, int i, List<PC> list, C0764Qb c0764Qb, Bundle bundle) {
        super(c2o, i, list, c0764Qb, bundle);
        c2o.A1k(this);
        this.A03 = new TI(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int A27 = this.A0C.A27();
        if (this.A05 == null || A27 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (A27 < curPos - 1) {
            int curPos2 = A27 + 1;
            A0V(curPos2);
        }
    }

    private void A01(int i) {
        int visibleItem = this.A0C.A28();
        int lastVisibleItem = this.A0C.A29();
        int firstVisibleItem = this.A0C.A27();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0W(visibleItem, lastVisibleItem, i);
    }

    @Override // com.facebook.ads.redexgen.X.S0, com.facebook.ads.redexgen.X.AbstractC02384h
    public final void A0L(ED ed, int i) {
    }

    @Override // com.facebook.ads.redexgen.X.S0, com.facebook.ads.redexgen.X.AbstractC02384h
    public final void A0M(ED ed, int i, int i2) {
        if (this.A0C.A27() != -1) {
            AbstractC0825Sk abstractC0825Sk = (AbstractC0825Sk) this.A0C.A1q(this.A0C.A27());
            if (A00[2].length() == 4) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[3] = "IxYVUA16uQkbjXwNztolao4gyOA0tKzF";
            strArr[6] = "jcO9EzcXxFOxyF2BSjZiD0vteRj0mA5y";
            if (abstractC0825Sk != null && abstractC0825Sk.A17() && !abstractC0825Sk.A16()) {
                abstractC0825Sk.A14();
            }
            A01(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void A0Y(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final void A0a(AbstractC0825Sk abstractC0825Sk, boolean z) {
        A0Y(abstractC0825Sk, z);
        if (!z && abstractC0825Sk.A16()) {
            abstractC0825Sk.A13();
        }
    }

    @Override // com.facebook.ads.redexgen.X.S0
    public final boolean A0b(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C0764Qb A0c() {
        return this.A04;
    }

    public final void A0d(C0764Qb c0764Qb) {
        this.A04 = c0764Qb;
    }

    public final void A0e(List<PC> list) {
        this.A05 = list;
    }
}
