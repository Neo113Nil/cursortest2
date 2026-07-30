package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class B extends EditText {
    public final /* synthetic */ AbstractC0200x a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Context context, AbstractC0200x abstractC0200x) {
        super(context);
        this.a = abstractC0200x;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                AbstractC0200x abstractC0200x = this.a;
                abstractC0200x.a(abstractC0200x.b(), false);
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0200x abstractC0200x2 = this.a;
            abstractC0200x2.a(abstractC0200x2.b(), false);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        if (i == 6) {
            AbstractC0200x abstractC0200x = this.a;
            abstractC0200x.a(abstractC0200x.b(), false);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.a.b.reportSoftInputSelection(i, i2 - i);
    }
}
