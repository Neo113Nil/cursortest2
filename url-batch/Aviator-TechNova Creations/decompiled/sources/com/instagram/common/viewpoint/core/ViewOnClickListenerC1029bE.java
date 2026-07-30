package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1029bE implements View.OnClickListener {
    public final /* synthetic */ JR A00;

    public ViewOnClickListenerC1029bE(JR jr) {
        this.A00 = jr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView imageView;
        Handler handler;
        Runnable runnable;
        ImageView imageView2;
        Handler handler2;
        Runnable runnable2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            imageView = this.A00.A03;
            if (imageView != null) {
                imageView2 = this.A00.A03;
                if (imageView2.getVisibility() == 8) {
                    this.A00.A0S(0);
                    handler2 = this.A00.A0A;
                    runnable2 = this.A00.A0U;
                    handler2.postDelayed(runnable2, 1500L);
                    return;
                }
            }
            this.A00.A0O();
            handler = this.A00.A0A;
            runnable = this.A00.A0U;
            handler.removeCallbacks(runnable);
            this.A00.A0S(8);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
