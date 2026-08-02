package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.unity3d.player.AbstractC0060s;
import com.unity3d.player.C0066y;

/* loaded from: classes.dex */
public final class J extends EditText {
    public final /* synthetic */ AbstractC0060s a;
    public final /* synthetic */ C0066y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0066y c0066y, Context context, AbstractC0060s abstractC0060s) {
        super(context);
        this.b = c0066y;
        this.a = abstractC0060s;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C0024y c0024y;
        C0023x c0023x;
        Runnable runnable;
        if (i == 4) {
            if (keyEvent.getAction() == 1 && (c0024y = this.b.h.e) != null && (c0023x = c0024y.a) != null && (runnable = c0023x.a) != null) {
                runnable.run();
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0060s abstractC0060s = this.a;
            abstractC0060s.a(abstractC0060s.a(), false);
            return true;
        }
        if (i == 111 && keyEvent.getAction() == 0) {
            AbstractC0060s abstractC0060s2 = this.a;
            abstractC0060s2.a(abstractC0060s2.a(), true);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            this.a.e();
        }
    }
}
