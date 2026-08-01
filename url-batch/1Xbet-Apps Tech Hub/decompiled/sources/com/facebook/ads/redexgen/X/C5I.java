package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.5I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5I implements View.OnLongClickListener {
    public final /* synthetic */ C5J A00;

    public C5I(C5J c5j) {
        this.A00 = c5j;
    }

    public /* synthetic */ C5I(C5J c5j, C5F c5f) {
        this(c5j);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        NJ nj;
        RelativeLayout relativeLayout;
        NJ nj2;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        NJ nj3;
        NJ nj4;
        nj = this.A00.A0A;
        if (nj != null) {
            relativeLayout = this.A00.A06;
            if (relativeLayout != null) {
                nj2 = this.A00.A0A;
                relativeLayout2 = this.A00.A06;
                int width = relativeLayout2.getWidth();
                relativeLayout3 = this.A00.A06;
                nj2.setBounds(0, 0, width, relativeLayout3.getHeight());
                nj3 = this.A00.A0A;
                nj4 = this.A00.A0A;
                nj3.A0D(!nj4.A0E());
            }
        }
        return true;
    }
}
