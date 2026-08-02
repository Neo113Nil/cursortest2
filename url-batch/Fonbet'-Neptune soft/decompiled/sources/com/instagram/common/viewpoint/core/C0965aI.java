package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0965aI extends FrameLayout {
    public static String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public AbstractC0883Xm A00;
    public YA A01;
    public final AbstractC1428hy A02;
    public final C1153dL A03;
    public final InterfaceC0884Xn A04;
    public final InterfaceC0964aH A05;
    public final E1 A06;
    public final List<View> A07;

    public C0965aI(C0991ai c0991ai, AbstractC1428hy abstractC1428hy, E1 e1, C0356Cw c0356Cw, AbstractC0944Zv abstractC0944Zv, InterfaceC0884Xn interfaceC0884Xn, InterfaceC0964aH interfaceC0964aH) {
        this(c0991ai, abstractC1428hy, e1, interfaceC0884Xn, interfaceC0964aH, c0356Cw, abstractC0944Zv);
    }

    public C0965aI(C0991ai c0991ai, AbstractC1428hy abstractC1428hy, E1 e1, InterfaceC0884Xn interfaceC0884Xn, InterfaceC0964aH interfaceC0964aH, View... viewArr) {
        this(c0991ai.A06(), c0991ai.A0C(), abstractC1428hy, e1, interfaceC0884Xn, interfaceC0964aH, viewArr);
    }

    public C0965aI(C1153dL c1153dL, AbstractC0883Xm abstractC0883Xm, AbstractC1428hy abstractC1428hy, E1 e1, InterfaceC0884Xn interfaceC0884Xn, InterfaceC0964aH interfaceC0964aH, View... viewArr) {
        super(c1153dL);
        this.A07 = new ArrayList();
        this.A03 = c1153dL;
        this.A00 = abstractC0883Xm;
        this.A02 = abstractC1428hy;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC0884Xn;
        this.A06 = e1;
        this.A05 = interfaceC0964aH;
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
        this.A01 = new YA(this.A03, -1, -16777216, A06, null, this.A02.A22().A04(), this.A02.A22().A03(), XY.A01(XX.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC0962aF(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC0963aG(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0g(EnumC1161dT.A07);
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
