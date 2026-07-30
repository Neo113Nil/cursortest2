package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1374Yb extends LinearLayout {
    public static int A00 = (int) (XX.A02 * 56.0f);
    public static int A01 = (int) (XX.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f6, int i);

    public abstract void A0D(C1097Na c1097Na, boolean z8);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC1373Ya getToolbarListener();

    public abstract void setAdReportingVisible(boolean z8);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr);

    public abstract void setFullscreen(boolean z8);

    public abstract void setPageDetails(C1109Nm c1109Nm, String str, int i, C1115Ns c1115Ns);

    public abstract void setPageDetailsVisible(boolean z8);

    public abstract void setProgress(float f6);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(YM ym);

    public abstract void setProgressImmediate(float f6);

    public abstract void setProgressSpinnerInvisible(boolean z8);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(InterfaceC1373Ya interfaceC1373Ya);

    public AbstractC1374Yb(Context context) {
        super(context);
    }

    public void A08() {
    }

    public Rect getRequestedMargins() {
        return null;
    }
}
