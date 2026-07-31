package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.unity3d.player.a.AbstractC0110c;
import com.unity3d.player.a.AbstractC0126t;

/* loaded from: classes2.dex */
public final class U implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = AbstractC0110c.b;
            if (progressBar != null) {
                if (AbstractC0110c.c != null) {
                    ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(AbstractC0110c.b);
                        viewGroup.removeView(AbstractC0110c.c);
                    }
                    AbstractC0110c.b = null;
                    AbstractC0110c.c = null;
                }
                AbstractC0110c.d = -1;
            }
        } catch (Exception e) {
            AbstractC0126t.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
