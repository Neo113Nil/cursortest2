package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1531bi extends FrameLayout {
    public static String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public AbstractC1374Yb A00;
    public Z3 A01;
    public final AbstractC2004jd A02;
    public final C1839gi A03;
    public final InterfaceC1380Yh A04;
    public final InterfaceC1530bh A05;
    public final C0876Ek A06;
    public final List<View> A07;

    public C1531bi(C1556c7 c1556c7, AbstractC2004jd abstractC2004jd, C0876Ek c0876Ek, DZ dz, AbstractC1502bF abstractC1502bF, InterfaceC1380Yh interfaceC1380Yh, InterfaceC1530bh interfaceC1530bh) {
        this(c1556c7, abstractC2004jd, c0876Ek, interfaceC1380Yh, interfaceC1530bh, dz, abstractC1502bF);
    }

    public C1531bi(C1556c7 c1556c7, AbstractC2004jd abstractC2004jd, C0876Ek c0876Ek, InterfaceC1380Yh interfaceC1380Yh, InterfaceC1530bh interfaceC1530bh, View... viewArr) {
        this(c1556c7.A06(), c1556c7.A0B(), abstractC2004jd, c0876Ek, interfaceC1380Yh, interfaceC1530bh, viewArr);
    }

    public C1531bi(C1839gi c1839gi, AbstractC1374Yb abstractC1374Yb, AbstractC2004jd abstractC2004jd, C0876Ek c0876Ek, InterfaceC1380Yh interfaceC1380Yh, InterfaceC1530bh interfaceC1530bh, View... viewArr) {
        super(c1839gi);
        this.A07 = new ArrayList();
        this.A03 = c1839gi;
        this.A00 = abstractC1374Yb;
        this.A02 = abstractC2004jd;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC1380Yh;
        this.A06 = c0876Ek;
        this.A05 = interfaceC1530bh;
        A04();
    }

    private void A04() {
        String A06;
        RewardData A0s = this.A02.A0s();
        if (A0s == null) {
            A06 = this.A02.A2B().A05();
        } else {
            A06 = this.A02.A2B().A06(A0s.getCurrency(), A0s.getQuantity());
        }
        this.A01 = new Z3(this.A03, -1, -16777216, A06, null, this.A02.A2B().A04(), this.A02.A2B().A03(), YN.A01(YM.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC1528bf(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC1529bg(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0d(EnumC1718el.A07);
        }
        this.A05.ACt();
        if (!this.A02.A29().A0V()) {
            this.A02.A2H(this.A04);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        if (this.A06 != null && !this.A06.A0o()) {
            C0876Ek c0876Ek = this.A06;
            String[] strArr = A08;
            if (strArr[0].length() == strArr[3].length()) {
                String[] strArr2 = A08;
                strArr2[4] = "1Ran1dt8ESvXQPCOL";
                strArr2[1] = "wn";
                c0876Ek.A0j(false, false, 11);
                YB.A0O(this.A06, 4);
            }
            throw new RuntimeException();
        }
        if (this.A00 != null) {
            YB.A0H(this.A00);
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
                YB.A0O(next, 4);
            } else {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                viewGroup.addView(this, layoutParams);
                this.A05.AEn();
                return;
            }
        }
        throw new RuntimeException();
    }
}
