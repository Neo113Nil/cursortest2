package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class A extends EditText {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1782w f21991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Context context, AbstractC1782w abstractC1782w) {
        super(context);
        this.f21991a = abstractC1782w;
    }

    @Override // android.widget.TextView
    public final void onEditorAction(int i4) {
        if (i4 == 6) {
            AbstractC1782w abstractC1782w = this.f21991a;
            abstractC1782w.a(abstractC1782w.b(), false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            if (keyEvent.getAction() == 1) {
                AbstractC1782w abstractC1782w = this.f21991a;
                abstractC1782w.a(abstractC1782w.b(), false);
            }
            return true;
        }
        if (i4 == 84) {
            return true;
        }
        if (i4 != 66 || keyEvent.getAction() != 0 || (getInputType() & 131072) != 0) {
            return super.onKeyPreIme(i4, keyEvent);
        }
        AbstractC1782w abstractC1782w2 = this.f21991a;
        abstractC1782w2.a(abstractC1782w2.b(), false);
        return true;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i4, int i5) {
        super.onSelectionChanged(i4, i5);
        this.f21991a.f22264b.reportSoftInputSelection(i4, i5 - i4);
    }
}
