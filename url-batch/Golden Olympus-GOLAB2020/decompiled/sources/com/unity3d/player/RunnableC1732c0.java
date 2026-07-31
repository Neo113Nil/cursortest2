package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import h1.AbstractC2460v;

/* renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1732c0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = AbstractC2460v.f36763b;
            if (progressBar != null) {
                if (AbstractC2460v.f36764c != null) {
                    ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(AbstractC2460v.f36763b);
                        viewGroup.removeView(AbstractC2460v.f36764c);
                    }
                    AbstractC2460v.f36763b = null;
                    AbstractC2460v.f36764c = null;
                }
                AbstractC2460v.f36765d = -1;
            }
        } catch (Exception e4) {
            h1.T.a(6, "Exception when hiding Activity Indicator " + e4);
        }
    }
}
