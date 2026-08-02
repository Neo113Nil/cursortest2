package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class Z4 extends ImageView {
    public Z6 A00;
    public final Bitmap A01;
    public final Bitmap A02;

    public Z4(C1153dL c1153dL, final Handler handler, Z6 z6, final int i, final View.OnClickListener onClickListener) {
        super(c1153dL);
        this.A01 = XY.A01(XX.CREDIT_LINE_COLLAPSED_PILL);
        this.A02 = XY.A01(XX.CREDIT_LINE_PILL);
        this.A00 = Z6.A03;
        if (z6 == Z6.A03) {
            setImageBitmap(this.A02);
            A00(handler, Integer.valueOf(i));
        } else {
            this.A00 = z6;
            setImageBitmap(this.A01);
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Z4.this.A02(onClickListener, handler, i, view);
            }
        });
    }

    private void A00(Handler handler, Integer num) {
        handler.postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.Z3
            @Override // java.lang.Runnable
            public final void run() {
                Z4.this.A01();
            }
        }, num.intValue());
    }

    public final /* synthetic */ void A01() {
        this.A00 = Z6.A02;
        setImageBitmap(this.A01);
    }

    public final /* synthetic */ void A02(View.OnClickListener onClickListener, Handler handler, int i, View view) {
        if (this.A00 == Z6.A03) {
            onClickListener.onClick(view);
            return;
        }
        this.A00 = Z6.A03;
        setImageBitmap(this.A02);
        A00(handler, Integer.valueOf(i));
    }
}
