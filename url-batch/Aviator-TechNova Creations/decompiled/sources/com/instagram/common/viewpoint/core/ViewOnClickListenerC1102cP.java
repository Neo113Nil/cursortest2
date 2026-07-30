package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1102cP implements View.OnClickListener {
    public static String[] A01 = {"oF0UQSO2UkB0Fs6pC959r9dzDMlb", "cSj6PPi", "9MOBOvfZoPMufYmvf8w", "3DUooxDMnkOJWQGgSnbPARGlSWVzZXnv", "xtRq8IID5uSiAOfe9JKkWOxw4I", "dgOA0KJAxphsFM42TDGlvfhDF1ut8VW0", "Hk9WFArlgjOkwb9sMy", "wD"};
    public final /* synthetic */ C4K A00;

    public ViewOnClickListenerC1102cP(C4K c4k) {
        this.A00 = c4k;
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
            mh = this.A00.A0O;
            if (mh instanceof C7P) {
                z = this.A00.A0B;
                if (!z) {
                    interfaceC1106cT = this.A00.A0V;
                    interfaceC1106cT.ABr();
                    this.A00.A0C = true;
                    C4K c4k = this.A00;
                    mh2 = this.A00.A0O;
                    c4k.A0l(((C7P) mh2).A0M().toString());
                    long A0n = ((AbstractC0486Hr) this.A00).A06.A0n();
                    if (A01[1].length() != 7) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[5] = "6Dfgyk2EWniD4mtjwsck8hBHMm74mFyH";
                    strArr[3] = "XIgrh0tmG1tVXTW5TWFgdcEwNBgdKHOC";
                    if (A0n >= 0) {
                        handler = this.A00.A0M;
                        runnable = this.A00.A0h;
                        handler.postDelayed(runnable, ((AbstractC0486Hr) this.A00).A06.A0n());
                    }
                }
                C4K c4k2 = this.A00;
                z2 = this.A00.A0B;
                c4k2.A0p(z2 ? false : true);
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
