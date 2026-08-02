package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* renamed from: com.unity3d.player.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064w extends EditText {
    public final /* synthetic */ AbstractC0060s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064w(Context context, AbstractC0060s abstractC0060s) {
        super(context);
        this.a = abstractC0060s;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 1) {
                AbstractC0060s abstractC0060s = this.a;
                abstractC0060s.a(abstractC0060s.a(), false);
            }
            return true;
        }
        if (i == 84) {
            return true;
        }
        if (i == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC0060s abstractC0060s2 = this.a;
            abstractC0060s2.a(abstractC0060s2.a(), false);
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i) {
        if (i == 6) {
            AbstractC0060s abstractC0060s = this.a;
            abstractC0060s.a(abstractC0060s.a(), false);
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        this.a.b.reportSoftInputSelection(i, i2 - i);
    }
}
