package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.unity3d.player.a.AbstractC0003c;
import com.unity3d.player.a.AbstractC0019t;

/* loaded from: classes.dex */
public final class U implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = AbstractC0003c.b;
            if (progressBar != null) {
                if (AbstractC0003c.c != null) {
                    ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(AbstractC0003c.b);
                        viewGroup.removeView(AbstractC0003c.c);
                    }
                    AbstractC0003c.b = null;
                    AbstractC0003c.c = null;
                }
                AbstractC0003c.d = -1;
            }
        } catch (Exception e) {
            AbstractC0019t.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
