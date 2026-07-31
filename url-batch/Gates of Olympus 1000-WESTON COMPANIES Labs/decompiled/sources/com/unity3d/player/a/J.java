package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;
import com.unity3d.player.AbstractC0167s;
import com.unity3d.player.C0173y;

/* loaded from: classes2.dex */
public final class J extends EditText {
    public final /* synthetic */ AbstractC0167s a;
    public final /* synthetic */ C0173y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0173y c0173y, Context context, AbstractC0167s abstractC0167s) {
        super(context);
        this.b = c0173y;
        this.a = abstractC0167s;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        C0131y c0131y;
        C0130x c0130x;
        Runnable runnable;
        if (i == 4) {
            if (keyEvent.getAction() == 1 && (c0131y = this.b.h.e) != null && (c0130x = c0131y.a) != null && (runnable = c0130x.a) != null) {
                runnable.run();
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0167s abstractC0167s = this.a;
            abstractC0167s.a(abstractC0167s.a(), false);
            return true;
        }
        if (i == 111 && keyEvent.getAction() == 0) {
            AbstractC0167s abstractC0167s2 = this.a;
            abstractC0167s2.a(abstractC0167s2.a(), true);
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
