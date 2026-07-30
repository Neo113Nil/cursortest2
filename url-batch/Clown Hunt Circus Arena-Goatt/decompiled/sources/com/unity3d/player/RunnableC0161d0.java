package com.unity3d.player;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.unity3d.player.a.AbstractC0139c;

/* renamed from: com.unity3d.player.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0161d0 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            ProgressBar progressBar = AbstractC0139c.b;
            if (progressBar != null) {
                if (AbstractC0139c.c != null) {
                    ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(AbstractC0139c.b);
                        viewGroup.removeView(AbstractC0139c.c);
                    }
                    AbstractC0139c.b = null;
                    AbstractC0139c.c = null;
                }
                AbstractC0139c.d = -1;
            }
        } catch (Exception e) {
            com.unity3d.player.a.t.Log(6, "Exception when hiding Activity Indicator " + e);
        }
    }
}
