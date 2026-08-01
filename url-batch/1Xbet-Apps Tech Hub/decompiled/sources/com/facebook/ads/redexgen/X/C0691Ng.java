package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.RewardData;

/* renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0691Ng extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    public AbstractC0651Ls A00;
    public final AbstractC1045aS A01;
    public final YA A02;
    public final InterfaceC0652Lt A03;
    public final InterfaceC0690Nf A04;
    public final RX A05;
    public final View[] A06;

    public C0691Ng(C0710Nz c0710Nz, AbstractC1045aS abstractC1045aS, RX rx, C0587Jb c0587Jb, NR nr, InterfaceC0652Lt interfaceC0652Lt, InterfaceC0690Nf interfaceC0690Nf) {
        this(c0710Nz, abstractC1045aS, rx, interfaceC0652Lt, interfaceC0690Nf, c0587Jb, nr);
    }

    public C0691Ng(C0710Nz c0710Nz, AbstractC1045aS abstractC1045aS, RX rx, InterfaceC0652Lt interfaceC0652Lt, InterfaceC0690Nf interfaceC0690Nf, View... viewArr) {
        this(c0710Nz.A05(), c0710Nz.A08(), abstractC1045aS, rx, interfaceC0652Lt, interfaceC0690Nf, viewArr);
    }

    public C0691Ng(YA ya, AbstractC0651Ls abstractC0651Ls, AbstractC1045aS abstractC1045aS, RX rx, InterfaceC0652Lt interfaceC0652Lt, InterfaceC0690Nf interfaceC0690Nf, View... viewArr) {
        super(ya);
        this.A02 = ya;
        this.A00 = abstractC0651Ls;
        this.A01 = abstractC1045aS;
        this.A06 = viewArr;
        this.A03 = interfaceC0652Lt;
        this.A05 = rx;
        this.A04 = interfaceC0690Nf;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0J = this.A01.A0J();
        if (A0J == null) {
            title = this.A01.A0y().A05();
        } else {
            title = this.A01.A0y().A06(A0J.getCurrency(), A0J.getQuantity());
        }
        M3 m3 = new M3(this.A02, -1, ViewCompat.MEASURED_STATE_MASK, title, null, this.A01.A0y().A04(), this.A01.A0y().A03(), C0637Le.A01(EnumC0636Ld.REWARD_ICON));
        m3.A02.setOnClickListener(new ViewOnClickListenerC0688Nd(this));
        m3.A01.setOnClickListener(new ViewOnClickListenerC0689Ne(this));
        addView(m3, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        RX rx = this.A05;
        if (rx != null) {
            rx.A0a(EnumC0741Pe.A07);
        }
        this.A04.AAS();
        if (!this.A01.A0v().A0O()) {
            this.A01.A14(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        RX rx = this.A05;
        if (rx != null && !rx.A0j()) {
            this.A05.A0f(false, false, 11);
            LV.A0N(this.A05, 4);
        }
        AbstractC0651Ls abstractC0651Ls = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC0651Ls != null) {
            LV.A0H(abstractC0651Ls);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            LV.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.AC0();
    }
}
