package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1042bR implements View.OnClickListener {
    public final /* synthetic */ C0513Is A00;

    public ViewOnClickListenerC1042bR(C0513Is c0513Is) {
        this.A00 = c0513Is;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MH mh;
        MH mh2;
        boolean z;
        boolean z2;
        C0997ai c0997ai;
        AbstractC1434hy abstractC1434hy;
        Handler handler;
        Runnable runnable;
        AbstractC1434hy abstractC1434hy2;
        C0997ai c0997ai2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            mh = this.A00.A0X;
            if (mh != null) {
                mh2 = this.A00.A0X;
                Uri A0M = ((C7P) mh2).A0M();
                if (A0M != null) {
                    z = this.A00.A0D;
                    if (!z) {
                        this.A00.A0E = true;
                        this.A00.A0j(A0M.toString());
                        c0997ai = this.A00.A0c;
                        if (c0997ai.A0E() != null) {
                            c0997ai2 = this.A00.A0c;
                            c0997ai2.A0E().ABr();
                        }
                        abstractC1434hy = this.A00.A0Y;
                        if (abstractC1434hy.A0n() >= 0) {
                            handler = this.A00.A0S;
                            runnable = this.A00.A0d;
                            abstractC1434hy2 = this.A00.A0Y;
                            handler.postDelayed(runnable, abstractC1434hy2.A0n());
                        }
                    }
                    C0513Is c0513Is = this.A00;
                    z2 = this.A00.A0D;
                    c0513Is.A0n(z2 ? false : true);
                }
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
