package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1595ck implements View.OnClickListener {
    public static String[] A01 = {"UbVTWMkCbiTkCH46K3jgevn4ZrjXJwTz", "QhkEmn79eJKUC441fbjRvFrP8rMFuK10", "M1y17FrLcKCq9CffRIAOFt9KL", "7BuiCs8qfizRNQQacuqpq", "NMEBAQB23JfGHe29j4ICw6", "tA", "w4e9O4TDm2cMnnpInxw7", "enarAElxAt9QJNN7p9xKH4Zm0Hlbhkd5"};
    public final /* synthetic */ C1002Ji A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1091Mt abstractC1091Mt;
        AbstractC1091Mt abstractC1091Mt2;
        boolean z8;
        C1516bT c1516bT;
        boolean z9;
        C1516bT c1516bT2;
        C1556c7 c1556c7;
        AbstractC2004jd abstractC2004jd;
        Handler handler;
        Runnable runnable;
        AbstractC2004jd abstractC2004jd2;
        C1556c7 c1556c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1091Mt = this.A00.A0W;
            if (abstractC1091Mt == null) {
                return;
            }
            abstractC1091Mt2 = this.A00.A0W;
            Uri A0M = ((AnonymousClass85) abstractC1091Mt2).A0M();
            if (A0M == null) {
                return;
            }
            z8 = this.A00.A0D;
            if (!z8) {
                this.A00.A0E = true;
                this.A00.A0m(A0M.toString());
                c1556c7 = this.A00.A0b;
                if (c1556c7.A0D() != null) {
                    c1556c72 = this.A00.A0b;
                    c1556c72.A0D().ACQ();
                }
                abstractC2004jd = this.A00.A0X;
                if (abstractC2004jd.A0q() >= 0) {
                    handler = this.A00.A0R;
                    runnable = this.A00.A0c;
                    abstractC2004jd2 = this.A00.A0X;
                    handler.postDelayed(runnable, abstractC2004jd2.A0q());
                }
            }
            c1516bT = this.A00.A09;
            if (c1516bT != null) {
                c1516bT2 = this.A00.A09;
                c1516bT2.A0B();
                this.A00.A09 = null;
            }
            C1002Ji c1002Ji = this.A00;
            z9 = this.A00.A0D;
            c1002Ji.A0q(z9 ? false : true);
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NGdQEP5eIhe6T0Nr5s0Gdk";
            strArr2[5] = "GP";
            WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC1595ck(C1002Ji c1002Ji) {
        this.A00 = c1002Ji;
    }
}
