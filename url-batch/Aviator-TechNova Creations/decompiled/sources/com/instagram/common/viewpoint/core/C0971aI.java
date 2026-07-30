package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0971aI extends FrameLayout {
    public static String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public AbstractC0889Xm A00;
    public YA A01;
    public final AbstractC1434hy A02;
    public final C1159dL A03;
    public final InterfaceC0890Xn A04;
    public final InterfaceC0970aH A05;
    public final E1 A06;
    public final List<View> A07;

    public C0971aI(C0997ai c0997ai, AbstractC1434hy abstractC1434hy, E1 e1, C0362Cw c0362Cw, AbstractC0950Zv abstractC0950Zv, InterfaceC0890Xn interfaceC0890Xn, InterfaceC0970aH interfaceC0970aH) {
        this(c0997ai, abstractC1434hy, e1, interfaceC0890Xn, interfaceC0970aH, c0362Cw, abstractC0950Zv);
    }

    public C0971aI(C0997ai c0997ai, AbstractC1434hy abstractC1434hy, E1 e1, InterfaceC0890Xn interfaceC0890Xn, InterfaceC0970aH interfaceC0970aH, View... viewArr) {
        this(c0997ai.A06(), c0997ai.A0C(), abstractC1434hy, e1, interfaceC0890Xn, interfaceC0970aH, viewArr);
    }

    public C0971aI(C1159dL c1159dL, AbstractC0889Xm abstractC0889Xm, AbstractC1434hy abstractC1434hy, E1 e1, InterfaceC0890Xn interfaceC0890Xn, InterfaceC0970aH interfaceC0970aH, View... viewArr) {
        super(c1159dL);
        this.A07 = new ArrayList();
        this.A03 = c1159dL;
        this.A00 = abstractC0889Xm;
        this.A02 = abstractC1434hy;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC0890Xn;
        this.A06 = e1;
        this.A05 = interfaceC0970aH;
        A04();
    }

    private void A04() {
        String A06;
        RewardData A0p = this.A02.A0p();
        if (A0p == null) {
            A06 = this.A02.A22().A05();
        } else {
            A06 = this.A02.A22().A06(A0p.getCurrency(), A0p.getQuantity());
        }
        this.A01 = new YA(this.A03, -1, ViewCompat.MEASURED_STATE_MASK, A06, null, this.A02.A22().A04(), this.A02.A22().A03(), XY.A01(XX.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC0968aF(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC0969aG(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0g(EnumC1167dT.A07);
        }
        this.A05.ACI();
        if (!this.A02.A20().A0V()) {
            this.A02.A28(this.A04);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        if (this.A06 != null && !this.A06.A0r()) {
            E1 e1 = this.A06;
            String[] strArr = A08;
            if (strArr[0].length() == strArr[3].length()) {
                String[] strArr2 = A08;
                strArr2[4] = "1Ran1dt8ESvXQPCOL";
                strArr2[1] = "wn";
                e1.A0m(false, false, 11);
                XP.A0L(this.A06, 4);
            }
            throw new RuntimeException();
        }
        if (this.A00 != null) {
            XP.A0F(this.A00);
        }
        Iterator<View> it = this.A07.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr3 = A08;
            if (strArr3[5].charAt(31) != strArr3[6].charAt(31)) {
                break;
            }
            String[] strArr4 = A08;
            strArr4[0] = "6LHnkwVNW3v3BurcJpp";
            strArr4[3] = "pBsoAnuzgJgS4JAM4BB";
            if (hasNext) {
                View next = it.next();
                next.clearAnimation();
                XP.A0L(next, 4);
            } else {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                viewGroup.addView(this, layoutParams);
                this.A05.AE8();
                return;
            }
        }
        throw new RuntimeException();
    }
}
