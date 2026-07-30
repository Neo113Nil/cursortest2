package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class D extends EditText {
    public final /* synthetic */ AbstractC0200x a;
    public final /* synthetic */ E b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e, Context context, AbstractC0200x abstractC0200x) {
        super(context);
        this.b = e;
        this.a = abstractC0200x;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        com.unity3d.player.a.x xVar;
        com.unity3d.player.a.w wVar;
        Runnable runnable;
        if (i == 4) {
            if (keyEvent.getAction() == 1 && (xVar = this.b.h.e) != null && (wVar = xVar.a) != null && (runnable = wVar.a) != null) {
                runnable.run();
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0200x abstractC0200x = this.a;
            abstractC0200x.a(abstractC0200x.b(), false);
            return true;
        }
        if (i == 111 && keyEvent.getAction() == 0) {
            AbstractC0200x abstractC0200x2 = this.a;
            abstractC0200x2.a(abstractC0200x2.b(), true);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            requestFocus();
            this.a.c();
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.a.b.reportSoftInputSelection(i, i2 - i);
    }
}
