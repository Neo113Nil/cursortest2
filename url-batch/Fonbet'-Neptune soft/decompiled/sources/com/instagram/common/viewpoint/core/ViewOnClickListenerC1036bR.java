package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1036bR implements View.OnClickListener {
    public final /* synthetic */ C0507Is A00;

    public ViewOnClickListenerC1036bR(C0507Is c0507Is) {
        this.A00 = c0507Is;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MH mh;
        MH mh2;
        boolean z;
        boolean z2;
        C0991ai c0991ai;
        AbstractC1428hy abstractC1428hy;
        Handler handler;
        Runnable runnable;
        AbstractC1428hy abstractC1428hy2;
        C0991ai c0991ai2;
        if (AbstractC0832Vl.A02(this)) {
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
                        c0991ai = this.A00.A0c;
                        if (c0991ai.A0E() != null) {
                            c0991ai2 = this.A00.A0c;
                            c0991ai2.A0E().ABr();
                        }
                        abstractC1428hy = this.A00.A0Y;
                        if (abstractC1428hy.A0n() >= 0) {
                            handler = this.A00.A0S;
                            runnable = this.A00.A0d;
                            abstractC1428hy2 = this.A00.A0Y;
                            handler.postDelayed(runnable, abstractC1428hy2.A0n());
                        }
                    }
                    C0507Is c0507Is = this.A00;
                    z2 = this.A00.A0D;
                    c0507Is.A0n(z2 ? false : true);
                }
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
