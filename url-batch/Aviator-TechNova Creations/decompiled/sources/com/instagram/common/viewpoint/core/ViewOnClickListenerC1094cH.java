package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1094cH implements View.OnClickListener {
    public static String[] A01 = {"iIV4C6PCamFbOwLs9osqMP65CW35qHVZ", "vu8ePLRZods6FhLp1sOjcscbCnKQtV0u", "aj5bYqq1P6NsPozz4AKHPhJxq4tExiSQ", "sREORf6VoPUSDy", "tYmkAFK6aojaVt6XrGIUitMYwL", "t5b15Ic4Fw72vyTqFljisKwND31PO9vi", "k2wG1EEpilyBuA", "DdpD6jZ5PRtvRqlim5b1myDycB"};
    public final /* synthetic */ C4Z A00;

    public ViewOnClickListenerC1094cH(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MH mh;
        boolean z;
        boolean z2;
        InterfaceC1106cT interfaceC1106cT;
        MH mh2;
        Handler handler;
        Runnable runnable;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            mh = this.A00.A0V;
            if (mh instanceof C7P) {
                z = this.A00.A0K;
                if (A01[5].charAt(19) != 'i') {
                    throw new RuntimeException();
                }
                A01[5] = "JfKhMnDlcffILoVNGoui3HCKoOWuag6G";
                if (!z) {
                    this.A00.A0L = true;
                    interfaceC1106cT = this.A00.A0Z;
                    interfaceC1106cT.ABr();
                    C4Z c4z = this.A00;
                    mh2 = this.A00.A0V;
                    c4z.A0g(((C7P) mh2).A0M().toString());
                    if (((AbstractC0486Hr) this.A00).A06.A0n() >= 0) {
                        handler = this.A00.A08;
                        runnable = this.A00.A0l;
                        handler.postDelayed(runnable, ((AbstractC0486Hr) this.A00).A06.A0n());
                    }
                }
                C4Z c4z2 = this.A00;
                z2 = this.A00.A0K;
                c4z2.A0j(z2 ? false : true);
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
